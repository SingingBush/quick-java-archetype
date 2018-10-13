Quick Java Archetype
====================

Get up and running quickly

```text
mvn archetype:generate \
    -DarchetypeGroupId=com.singingbush \
    -DarchetypeArtifactId=quick-java-archetype \
    -DarchetypeVersion=0.1.0-SNAPSHOT \
    -DgroupId=<my.groupid> \
    -DartifactId=<my-artifactId> \
    -DjavaVersion=11
```

The `javaVersion` option can be 1.8 (the default), 9, 10, or 11
