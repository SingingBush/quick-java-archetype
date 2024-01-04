/*
* The archetype-post-generate.groovy script has access to the ArchetypeGenerationRequest object via "request" variable.
*
* Any required properties in archetype-metadata.xml are available directly so there's no need to use "request.properties.getProperty"
*
* You can also use System.getProperties()
*
* Rather than optionally generate files it's best to simply create everything then remove whatever isn't required.
*/
import java.nio.file.Files
import java.nio.file.Paths

// println "artifactId: " + artifactId
// println "request: " + request
// println "archetypeArtifactId: " + request.getArchetypeArtifactId()
// println "archetypeGroupId: " + request.getArchetypeGroupId()
// println "archetypeVersion: " + request.getArchetypeVersion()
// println "archetypeName: " + request.getArchetypeName()
// println "artifactId: " + request.getArtifactId()
// println "groupId: " + request.getGroupId()
// println "version: " + request.getVersion()

// The path where the project got generated
// Path projectPath = Paths.get(request.outputDirectory, request.artifactId)

// The properties available to the archetype
// Properties properties = request.properties

//String javaVersion = properties.getProperty("javaVersion")
if (javaVersion.equals("1.8")) {
    // remove the module-info.java if the project targets JDK 1.8
    assert Files.deleteIfExists(
        Paths.get(request.outputDirectory, request.artifactId, "src", "main", "java", "module-info.java")
    )
}

// configureGitHubAction is either Y or N
Boolean configureGitHubAction = configureGitHubAction.toUpperCase().startsWith("Y")
//println "Configure GitHub Action: $configureGitHubAction"
if (!configureGitHubAction) {
    // println "Remove .github/*"
    assert Paths.get(request.outputDirectory, request.artifactId, ".github").toFile().deleteDir()
}
