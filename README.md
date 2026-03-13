# CTIM


[![Clojars Project](http://clojars.org/threatgrid/ctim/latest-version.svg)](http://clojars.org/threatgrid/ctim)

CTIM includes common [data models](doc/README.md) used by Cisco Threat Intel services like the [CTIA](https://github.com/threatgrid/ctia).  It is written in Clojure and includes schemas and sample generators.

This is a cljc project, it is intended to work both from clojure/clojurescript projects.

You can run clojurescript tests with:

```bash
lein doo node node once
```

(Requires node)

To generate the documentation

```bash
lein doc
```

## Docs

- [Docs](doc/)
- Tutorials:
  - [Modeling Threat Intelligence in CTIM](doc/tutorials/modeling-threat-intel-ctim.md)

## Releases

### Patch release

Set the version in `project.clj` to `x.y.z-SNAPSHOT`, then run:

```bash
lein release :patch
```

This bumps to `x.y.z`, deploys to Clojars, then bumps to `x.y.(z+1)-SNAPSHOT`.
See `:release-tasks` in `project.clj` for the full sequence.

For minor or major version bumps, manually edit the version in `project.clj` before running `lein release`.

### Snapshot release

```bash
lein deploy
```

### Recovery

If a release fails partway through:

```bash
# delete the tag if it was created
git tag --delete x.y.z

# reset to the commit before the failed release
git reset --hard SHA_BEFORE_FAILED_RELEASE
```

## License

Copyright © 2016-2026 Cisco Systems

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
