import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.60" apply false // calls deprecated gradle DefaultPolymorphicDomainObjectContainer
    id("org.unbroken-dome.test-sets") version "2.2.1"
}

allprojects {
    group = "de.richargh.sandbox.testsets"
    version = "1.0.0"

    repositories {
        mavenCentral()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "1.8"
        }
    }
}

subprojects {

    apply {
        plugin("org.unbroken-dome.test-sets")
    }

    testSets {
        val testShared by libraries.creating { }

        val unitTest by getting {
            imports(testShared)
        }
        val mediumTest by creating {
            println("Medium Testset")
            imports(testShared)

        }
        create("largeTest") {
            println("Large Testset")
            imports(testShared)
        }
    }

    dependencies {
        // without this the standard library is not known
        "testSharedImplementation"(kotlin("stdlib-jdk8"))
        "testSharedImplementation"("org.junit.jupiter:junit-jupiter-api:5.5.2")
    }

    tasks.withType<Test> {
        useJUnitPlatform {
            includeTags("willSucceed", "mightFail")
        }
        this.failFast = false
    }

    tasks.getByName<Test>("mediumTest") {
        println("reconfigure mediumTest")
        mustRunAfter(tasks["test"])
    }

    tasks.getByName<Test>("largeTest") {
        println("reconfigure largeTest")
        mustRunAfter(tasks["mediumTest"])
    }

    tasks.getByName("check") {
        dependsOn("mediumTest")
        dependsOn("largeTest")
    }
}

tasks.wrapper {
    gradleVersion = "6.0.1"
}
