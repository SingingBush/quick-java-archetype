Quick Java Archetype
====================

[![Maven Central](https://img.shields.io/maven-central/v/com.singingbush/quick-java-archetype.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.singingbush%22%20AND%20a:%22quick-java-archetype%22) [![Java CI](https://github.com/SingingBush/quick-java-archetype/actions/workflows/maven.yml/badge.svg)](https://github.com/SingingBush/quick-java-archetype/actions/workflows/maven.yml)


## Using the latest release (from maven central)

```text
mvn archetype:generate \
    -DarchetypeGroupId=com.singingbush \
    -DarchetypeArtifactId=quick-java-archetype \
    -DarchetypeVersion=1.0.0 \
    -DgroupId=<my.groupid> \
    -DartifactId=<my-artifactId> \
    -DjavaVersion=11
```

The `javaVersion` option can be 1.8, 11, 17, 18, 19, 20, or 21. The default is Java 11.

## Building from source and using latest snapshot (local install)
Get up and running quickly

```text
mvn install
```

```text
mvn archetype:generate \
    -DarchetypeGroupId=com.singingbush \
    -DarchetypeArtifactId=quick-java-archetype \
    -DarchetypeVersion=1.0.0 \
    -DgroupId=<my.groupid> \
    -DartifactId=<my-artifactId> \
    -DjavaVersion=11
```

