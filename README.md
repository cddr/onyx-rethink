## onyx-rethink

Onyx plugin for rethink.

#### Installation

In your project file:

```clojure
[onyx-rethink "0.7.5"]
```

In your peer boot-up namespace:

```clojure
(:require [onyx.plugin.rethink])
```

#### Functions

##### sample-entry

Catalog entry:

```clojure
{:onyx/name :entry-name
 :onyx/plugin :onyx.plugin.rethink/input
 :onyx/type :input
 :onyx/medium :rethink
 :onyx/batch-size batch-size
 :onyx/doc "Reads segments from rethink"}
```

Lifecycle entry:

```clojure
[{:lifecycle/task :your-task-name
  :lifecycle/calls :onyx.plugin.rethink/lifecycle-calls}]
```

#### Attributes

|key                           | type      | description
|------------------------------|-----------|------------
|`:rethink/attr`            | `string`  | Description here.

#### Contributing

Pull requests into the master branch are welcomed.

#### License

Copyright © 2015 FIX ME

Distributed under the Eclipse Public License, the same as Clojure.
