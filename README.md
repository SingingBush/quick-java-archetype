Quick Java Archetype
====================

[![Maven Central](https://img.shields.io/maven-central/v/com.singingbush/quick-java-archetype.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.singingbush%22%20AND%20a:%22quick-java-archetype%22) [![Java CI](https://github.com/SingingBush/quick-java-archetype/actions/workflows/maven.yml/badge.svg)](https://github.com/SingingBush/quick-java-archetype/actions/workflows/maven.yml)


## Using the latest release (from maven central)

```text
mvn archetype:generate \
    -DarchetypeGroupId=com.singingbush \
    -DarchetypeArtifactId=quick-java-archetype \
    -DarchetypeVersion=1.2.0 \
    -DgroupId=<my.groupid> \
    -DartifactId=<my-artifactId> \
    -DjavaVersion=11
```

The `javaVersion` option can be 1.8, 11, 17, or 21. The default is Java 11. If the JDK version supports JPMS then a *module-info.java* will be created in the generated project.

The `configureGitHubAction` option (since 1.2.0) can be used to generate a `.github/` directory in the project with CI and Dependabot pre-configured.

## Building from source and using latest snapshot (local install)
When building a release Java 8 should be used for maximum compatibility. However, as JDK 11 is required for the integration tests releases (either maven install or maven deploy) should use the skip tests property:

```text
JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk mvn clean install -DskipTests=true -Dmaven.test.skip=true
```

Then when using the locally installed build make sure to use `-DarchetypeCatalog=local`:

```text
mvn archetype:generate \
    -DarchetypeCatalog=local
    -DarchetypeGroupId=com.singingbush \
    -DarchetypeArtifactId=quick-java-archetype \
    -DarchetypeVersion=1.2.1-SNAPSHOT \
    -DgroupId=<my.groupid> \
    -DartifactId=<my-artifactId> \
    -DjavaVersion=11
```

