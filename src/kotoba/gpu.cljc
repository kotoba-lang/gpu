(ns kotoba.gpu
  "Facade re-exporting `kami.gpu` (SSoT in this package, ADR-2607102200 addendum 6).

   Historical consumers require `kotoba.gpu`; the implementation lives in
   `kami.gpu` so webgpu / webgl / the rest of the render stack share one contract."
  (:require [kami.gpu :as impl]))

(def caps-webgpu   impl/caps-webgpu)
(def caps-native   impl/caps-native)
(def caps-console  impl/caps-console)
(def caps-webgl2   impl/caps-webgl2)
(def tiers         impl/tiers)

(def missing-caps     impl/missing-caps)
(def pass-runnable?   impl/pass-runnable?)
(def resolve-graph    impl/resolve-graph)
(def resolve-for      impl/resolve-for)
(def caps-from-device impl/caps-from-device)
(def requires         impl/requires)
