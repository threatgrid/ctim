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

```clojure
# Patch version releases (minor and major increments require a manual edit of version).
# Expect this task to modify project files and deploy to Clojars.
# See `release-tasks` in project.clj for details.
lein release

# snapshot release
lein deploy

# for releases, set project.clj version to x.y.z-SNAPSHOT
# this command then releases as x.y.z and bumps to x.y.(z+1)-SNAPSHOT
# aliased as ./script/release.sh
lein release :patch

# if release fails partway through, use these commands to recover
git tag --delete x.y.z
# you might have a redundant commit "Version x.y.z", undo with:
git reset --hard SHA_BEFORE_FAILED_RELEASE
```

## License

Copyright © 2016-2024 Cisco Systems

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
