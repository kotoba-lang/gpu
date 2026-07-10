# kotoba-lang/gpu

**SSoT for `kami.gpu`** — capability-gated GPU pipeline IR (render-graph resolve per
backend tier: WebGPU / WebGL2 / native / console). Pure `.cljc`; no browser executor.

`kotoba.gpu` is a thin facade for historical consumers.

See ADR-2607102200 addendum 6.

## Test

```sh
clojure -M:test
```
