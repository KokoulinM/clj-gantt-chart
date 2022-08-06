(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'clj-gantt-chart.core
   :output-to "out/clj_gantt_chart.js"
   :output-dir "out"})
