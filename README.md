# kotoba-lang/gpu

Kotoba runtime package for `kotoba.gpu`.

## Status: thin re-export (2026-07-09)

`src/kotoba/gpu.cljc` no longer carries its own implementation. It re-exports
[`kami.gpu`](https://github.com/kotoba-lang/webgpu/blob/main/src/kami/gpu.cljc) from
`kotoba-lang/webgpu`, which is the copy every live consumer (network-isekai, net-babiniku)
actually depends on and the one that keeps receiving real work. See CHANGELOG.md.

Requiring `kotoba.gpu` still works exactly as before — same public API, same behaviour.

## Test

```sh
clojure -M:test
```
