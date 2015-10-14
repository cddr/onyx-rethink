## onyx-rethink

Onyx plugin for RethinkDB

#### Installation

In your project file:

```clojure
[onyx-rethink "0.7.5-SNAPSHOT"]
```

In your peer boot-up namespace:

```clojure
(:require [onyx.plugin.rethink])
```

#### Functions

##### rethink-write-docs

Catalog entry:

```clojure
{:onyx/name :rethink-sink
 :onyx/plugin :onyx.plugin.rethink/write-documents
 :onyx/type :output
 :onyx/medium :rethink
 :onyx/batch-size batch-size
 :onyx/doc "Writes segments to RethinkDB"}
```

Lifecycle entry:

RethinkDB doesn't do connection pooling so there's no need for any lifecycle
entries (at least for writing).

#### Attributes

|key                           | type      | description
|------------------------------|-----------|------------
|`:rethink/db`                 | `string`  | The RethinkDB database to write to
|`:rethink/table`              | `string`  | The RethinkDB table to write to

#### Contributing

Pull requests into the master branch are welcomed.

#### License

Copyright © 2015 Andy Chambers

Distributed under the Eclipse Public License, the same as Clojure.
