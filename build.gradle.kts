plugins {
    `java-library`
    id("me.philippheuer.configuration") version "0.16.0"
}

version = properties["version"] as String

projectConfiguration {
    type.set(me.philippheuer.projectcfg.domain.ProjectType.APP)
    javaVersion.set(JavaVersion.VERSION_17)
    artifactGroupId.set("io.github.cidverse.test")
    artifactId.set("javagradlelib")
    artifactDisplayName.set("Library - Java Gradle")
    artifactDescription.set("A simple Java library for testing purposes")
}

dependencies {
    // annotations
    implementation("org.jetbrains:annotations:26.0.2")
}
