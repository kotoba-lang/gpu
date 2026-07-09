(ns kotoba.gpu
  "DEDUP NOTICE (2026-07-09, see CHANGELOG.md): this namespace used to carry its own copy of the
   GPU-pipeline IR contract (capability-gated render graph). That copy diverged from
   kotoba-lang/webgpu's internal `kami.gpu` — which every live consumer (network-isekai,
   net-babiniku) actually depends on. The divergence here was docs-only (no functional bug found),
   but `kami.gpu` kept receiving real feature work (most recently 'capability-gated render-graph
   contract' doc/parity pass) while this copy received none — so `kami.gpu` is canonical.

   This namespace is now a thin re-export of it — same public API, always in sync, no more silent
   drift. If you're vendoring this repo standalone, requiring `kotoba.gpu` still works exactly as
   before; the implementation just lives one hop away now."
  (:require [kami.gpu :as impl]))

(def caps-webgpu  "See kami.gpu/caps-webgpu."  impl/caps-webgpu)
(def caps-native  "See kami.gpu/caps-native."  impl/caps-native)
(def caps-console "See kami.gpu/caps-console." impl/caps-console)
(def caps-webgl2  "See kami.gpu/caps-webgl2."  impl/caps-webgl2)
(def tiers        "See kami.gpu/tiers."        impl/tiers)

(def missing-caps    "See kami.gpu/missing-caps."    impl/missing-caps)
(def pass-runnable?  "See kami.gpu/pass-runnable?."  impl/pass-runnable?)
(def resolve-graph   "See kami.gpu/resolve-graph."   impl/resolve-graph)
(def resolve-for     "See kami.gpu/resolve-for."     impl/resolve-for)
(def caps-from-device "See kami.gpu/caps-from-device." impl/caps-from-device)
(def requires        "See kami.gpu/requires."        impl/requires)
