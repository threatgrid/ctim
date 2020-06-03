# How to Build an Excellent External ID

In this short tutorial, I will discuss the purpose of the **External ID**, aka **XID** in CTIM, how they are used in CTIA, and what things are *necessary* and *sufficient* to create excellent external IDs.

I'll briefly discuss best practices for generating high quality external IDs, and I will provide a language-neutral, step-by-step example of how to generate one.

## Purpose of External IDs

External IDs (XIDs) have four primary purposes:

1. They can be customized to suit the internal business needs of your organization.
2. They are short and specific enough to use in documentation.
3. They can be used to quickly search CTIA for specific entities.
4. They add significant value to the bundle import process:
	- Bundle imports significantly reduce the number of individual HTTP requests needed to import large volumes of CTIM data into CTIA.
	- During bundle imports, CTIA can use XIDs to prevent entity duplication. Data duplication in CTIA can be difficult and expensive to repair, and so avoiding it in the first place is highly desirable.

## Characteristics of an Excellent XID

To build an *excellent* external ID, I will first enumerate what their  *necessary* characteristics are, and then describe recommendations that are *sufficient* to achieve those characteristics.

### Necessary Characteristics of an Excellent XID
1. **Distinct**: XIDs created by your organization are easily discernable from XIDs created by other organizations.
2. **Descriptive**: External IDs that contain their entity type make it easier to understand relationship entities at a glance when building bundles in CTIM.
3. **Unique**: XIDs are unique within your organization.
4. **Concise**: XIDs are neither needlessly long, nor do they contain characters that make them difficult to append to search routes in CTIA URLs.
5. **Deterministic**: XIDs for an entity **must** be able to be re-generated in the future from known properties of the entity, in order to use them for purposes of search. They must not be constructed from stochastic data.

###  Sufficient Steps to Build an Excellent XID
1. **Distinct**: All of the External IDs created by your organization should begin with the same **prefix-string**.  This prefix string should be concise, descriptive, *highly unlikely* to be used by other organizations, and not contain special characters that will make it difficult to use in a search URL.  I **strongly** encourage this prefix string to be one or two short words followed by hyphens. For example: `"org-name-"` would be an excellent prefix string for an external ID. Nothing can *prevent* other organizations from using your preferred prefix string, so we can't rely on the prefix alone.
2. **Descriptive**: The second part of your XID *should* be a short string describing the entity type, followed by a hyphen.  For example:
	- `attack-pattern-`
	- `indicator-`
	- `sighting-`
	- `judgement-`
	- `malware-`
	- `target-`
	- `incident-`
3. **Unique**: Following the prefix string and entity type string, your External ID should contain a SHA256 hash of the properties that uniquely distinguish the entity.  It is *almost* impossible to accidentally create a SHA256 hash collision, and you can salt the hash function with strings that are unique to your org to further reduce this likelihood.
4. **Concise**: SHA256 hashes are concise. They contain no characters that must be URLEncoded, and can be directly appended to URLs.
5. **Deterministic** SHA256 hashes are also deterministic.  Given the same string inputs, you can recreate the SHA256 hash used in the XID of any entity in your org.

#### A note about uniqueness
Nothing can prevent someone from outside of your organization from *intentionally* creating entities that have external ID collisions with entities created by your organization.  However, the entities that *you* create will be stored in *your* organization's private intelligence store, and the entities that *they* create will be stored in *their* organization's private intelligence store.

Neither party will be able to store data in the global, *public* intelligence store. The focus of *uniqueness* should therefore be to prevent accidental collisions between entities created within your organization. It is both tractable and fairly simple, and we will now dive into how to do it.

### Making an Excellent SHA256 Hash
1. **Distinct**: The easiest way to use your organization name as a salt for the hash is to use the prefix string itself.
2. **Descriptive**: Including the entity type string as a salt for the hash ensures that different entity types have different external IDs, even if they share other inputs to the hash function.
3. **Unique**: For a given entity type created by your org, you must determine what properties of that specific entity make it unique, and include those values in the creation of the hash function.  For example, if you are recording a sighting of a domain name on a given date, then the date, and the domain name strings are sufficient to uniquely identify that sighting.  If you are recording an indicator, and all of the indicators in your organization have unique and static names that are not likely to change, then the name alone is sufficient.
4. **Concise**: You don't have to worry about concision at this point. The more values you include in generating your external ID, the less likely it will collide with another external ID later on.  Using more inputs will not change the length of the hash output.
5. **Deterministic**: You must *never* use stochastic or random data to generate your SHA256 hash.  For example, if you have a timestamp in your input data (such as when a computer accessed a given malicious domain name) that **IS** acceptable, but it is **NOT** acceptable to use the timestamp that your program *created the sighting*, because that time is not part of the input data, is not recorded anywhere, and in the future nobody will *ever* be able to determine the exact moment in time you created the entity.  Everything that you need to re-create the exact same External ID at a later time must be knowable. In effect, your XID creation function **must be a *pure function*** and not rely on any side effects. Running it twice on the same inputs must always create the same external ID.  Do not use any randomly generated data as salt inputs into your hash function.

### Example XID:
For the purposes of this example, assume that I am creating a CTIM sighting entity to record the fact that a host in my organization's network accessed a given domain name on a given date.  I need an external ID for that sighting.

1. Prefix string: `my-prefix-`
2. Entity type string: `sighting`
3. Domain name: `some.really.bad.domain.name.online`
4. Date the domain was accessed: `2020-03-13`
5. Concatenate these inputs and salts into one string, with `|` arbitrarily chosen as a string delimiter:
```
my-prefix-|sighting|some.really.bad.domain.name.online|2020-03-13
```
6. Resulting SHA256 hash:
```
94341C82436C8D717C1D51CF13514D2F333987B1EC62B3D23693028DAA71C908
```
7. Resulting External ID:
```
my-prefix-sighting-94341C82436C8D717C1D51CF13514D2F333987B1EC62B3D23693028DAA71C908
```

This external ID neatly satisfies all of the requirements listed above.