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

The project version in `project.clj` should always be a `-SNAPSHOT` on the main branch.
The release process (defined in `:release-tasks` in `project.clj`) handles bumping,
deploying, and advancing to the next snapshot automatically.

### Before releasing

Run `lein doc` and commit any generated changes. The release will fail at the
`vcs assert-committed` step if there are uncommitted doc changes.

### Patch release

```bash
lein release :patch
```

For minor or major bumps, use `lein release :minor` or `lein release :major`.

### Snapshot release

```bash
lein deploy
```

### Recovery

If the release fails **before** `deploy clojars`:

```bash
git tag --delete x.y.z
git reset --hard SHA_BEFORE_FAILED_RELEASE
```

If the release fails **after** `deploy clojars` (e.g., at the `vcs push` step),
the artifact is already published. Complete the release manually:

```bash
git push --tags --set-upstream origin release-x.y.z
```

## License

Copyright © 2016-2026 Cisco Systems

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
