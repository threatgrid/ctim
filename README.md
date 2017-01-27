# CTIM


[![Clojars Project](http://clojars.org/threatgrid/ctim/latest-version.svg)](http://clojars.org/threatgrid/ctim)

CTIM includes common [data models](doc/README.md) used by Cisco Threat Intel services like the [CTIA](https://github.com/threatgrid/ctia).  It is written in Clojure and includes schemas and sample generators.

This is a cljc project, it is intended to work both from clojure/clojurescript projects.

You can run clojurescript tests with:

```bash
lein doo phantom test once
lein doo node node once
```

(Requires phantom and node)

To generate the documentation

```bash
lein doc
```

## License

Copyright © 2016-2017 Cisco Systems

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
