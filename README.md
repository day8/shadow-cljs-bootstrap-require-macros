#  
[![CI](https://github.com/day8/shadow-cljs-bootstrap-require-macros/workflows/ci/badge.svg)](https://github.com/day8/shadow-cljs-bootstrap-require-macros/actions?workflow=ci)

Demonstrates that under bootstrapped ClojurScript `.cljc` dependencies of `.clj` macro
files use the ClojureScript dialect. It is not possible to depend on a `.clj` file.

This may be relevant:
https://blog.fikesfarm.com/posts/2015-06-19-portable-macro-musing.html

Is this a bug ? Or just confusing intended behaviour ?

## Browser Tests

```
shadow-cljs watch browser-test browser-test-bootstrap
```

## Karma Tests

```
shadow-cljs compile karma-test karma-test-bootstrap
karma start --single-run
```
