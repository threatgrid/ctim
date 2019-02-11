# The `registry_keyval` Observable Type

## Introduction

This guide will document how to combine Registry Key and Registry Value Entries into a single canonical string format which can be used as an observable value in CTIM.

### Registry Keys

The Windows Registry is a file database that allows multiple **Value Entries** to be stored under a **Key Path**.  The registry supports seven root keys, some of which have strictly controlled sets of officially designated subkeys, into which additional subkeys can be nested.

#### Registry Key Name Constraints

> Each key has a name consisting of one or more printable characters. Key names are not case sensitive. Key names cannot include the backslash character (), but any other printable character can be used. Value names and data can include the backslash character.

Thus, no printable character, except for the backslash (`\`), can reliably and safely be used as a delimiter in key strings.

### Registry Value Entries

Each subkey in the registry can have zero or more **Value Entries** stored under it.

Every **value entry** is composed of exactly three parts:

1. The `name` of the value, also known as the `value_name`.
2. The `type` of the value, also known as the `value_type`.
3. The `value` itself, also known as the `value_content`.

The canonical representation of the Registry Value Entry is `"value_name" = value_type:value_content`

### Existing Representations

#### Example 01: Windows Registry Export Format

The standard representation of Registry data is to supply the key path, and then the value information beneath it, like so:

```
[HKEY_LOCAL_MACHINE\SOFTWARE\Foobar]
"Value A"="<String value data with escape characters>"
"Value B"=hex:<Binary data (as comma-delimited list of hexadecimal values)>
"Value C"=dword:<DWORD value integer>
```


#### Example 02: Registry Key-Value Pair From the TALOS Blog:

```
    <HKCU>\SOFTWARE\MICROSOFT\WINDOWS\CURRENTVERSION\RUN
        Value Name: api-PQEC
```


### Goal

There does not exist a standard, ubiquitous method of combining a registry key path and a value entry into a single string format that we could use for an observable string.  So, we have determined to define our own canonical string representation that combines the entire key path, as well as the information about the value entry.

This will provide us with something very similar to the [socket address](https://en.wikipedia.org/wiki/Network_socket#Socket_addresses), which is the canonical representation of an IP address and Port combination.  In a single string, we will be able to safely and reliably designate both the key path in its entirety, as well as the value name, value type, and value content.



## Canonical String Format

We can encode the registry key and value entry using the following canonical form:

```
registry_kv: "HKEY_CURRENT_USER\SOFTWARE\MICROSOFT\WINDOWS\CURRENTVERSION\RUN\\\"api-PQEC\"=REG_DWORD:0x800000"
```

This example includes all three portions of the value entry:

- The name of the value
- The data type of the value
- The value itself

It also avoids the common potential future pitfalls:

- Registry keys can have any printable character in their name except for the backslash, including square brackets and colons, so terminating the key path with double backslashes ensures that we know exactly which portion of the string is the key path.  Everything after the double backslash is the *value entry* part of the observable.
- The *value entry* part of the observable string follows the exact export format from the Windows registry: `"value name"=type:value`
- Value names can have any printable character in them, including backslashes and double quotes.  This format allows us to escape all of those in a predictable manner.


Note that the *value entry* for the registry key is complete in the example above, and contains the value name, value type and value content.  In practice, however, it rarely needs to be.  The mere PRESENCE of a value under this key with this name is enough to convict on--we don't need to concern ourselves with its data type or contents at this time.


```
    "observables": [
        {
            "type": "registry_key_value",
            "value": "HKEY_CURRENT_USER\\SOFTWARE\\MICROSOFT\\WINDOWS\\CURRENTVERSION\\RUN\\\\\"api-PQEC\""
        },
        {
            "type": "registry_key_value",
            "value": "HKEY_CURRENT_USER\\SOFTWARE\\MICROSOFT\\WINDOWS\\CURRENTVERSION\\RUN\\\\\"value two\"=REG_DWORD:0x800000"
        }
        ...
        ]
```

## References

For more information on the structure of value entries, see: https://docs.microsoft.com/en-us/previous-versions//cc722562(v=technet.10)




