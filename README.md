# Sample app

This example app is intended to reproduce a reported issue where a thread is not terminated on shutdown, with bugsnag v3.5.1.

## Reproduction Steps

1. `./gradlew assemble`
2. copy `build/libs/daemons.war` into tomcat directory
3. `cp build/libs/daemons.war /usr/local/opt/tomcat\@8/libexec/webapps/daemons.war`
4. `catalina start`
5. Visit http://localhost:8080/daemons/send-unhandled-exception
6. `catalina stop`
7. Inspect output of logs for reported error message: `less /usr/local/opt/tomcat@8/libexec/logs/catalina.2019-06-17.log`
