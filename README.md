

## how

BUG: https://issues.apache.org/jira/browse/SUREFIRE-2203



```
mvn test -P p1
```

output:

```
[INFO] Running com.example.junit5_surefire_bug_demo.ATest
Hello, world!
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.021 s -- in com.example.junit5_surefire_bug_demo.ATest
```



```
mvn test -P p2
```

output:

```
[INFO]  T E S T S
[INFO] -------------------------------------------------------
DemoLauncherInterceptor
DemoLauncherInterceptor
DemoLauncherInterceptor
DemoLauncherInterceptor
[INFO] Running com.example.junit5_surefire_bug_demo.ATest
Hello, world!
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.020 s -- in com.example.junit5_surefire_bug_demo.ATest
```
