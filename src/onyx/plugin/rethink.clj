(ns onyx.plugin.rethink
  (:require
   [rethinkdb.query :as r :refer [connect]]

   [onyx.peer.function :as function]
   [onyx.peer.pipeline-extensions :as p-ext]))

(defrecord RethinkWriteDocuments [db-name tbl-name]
  p-ext/Pipeline
  (read-batch [_ event]
    (function/read-batch event))

  (write-batch [_ {:keys [onyx.core/results]}]
    (let [docs (map :message (mapcat :leaves (:tree results)))]
      (with-open [db (connect)]
        (-> (r/db db-name)
            (r/table tbl-name)
            (r/insert docs)
            (r/run db))))
    {:onyx.core/written? true})

  (seal-resource
    [_ {:keys [onyx.core/results]}]
    {}))

(defn write-documents [pipeline-data]
  (let [task-map (:onyx.core/task-map pipeline-data)
        db-name (:rethink/db task-map)
        tbl-name (:rethink/table task-map)]
    (->RethinkWriteDocuments db-name tbl-name)))
