```
$ gradle clean

BUILD SUCCESSFUL in 537ms
1 actionable task: 1 executed

$ gradle run

> Task :app:compileScala
[Warn] : -target is deprecated: Scala 2.12 cannot emit valid class files for targets newer than 8 (this is possible with Scala 2.13). Use -release to compile against a specific platform API version.
one warning found

> Task :app:run
1 :: a :: true :: HNil

BUILD SUCCESSFUL in 4s
2 actionable tasks: 2 executed
```