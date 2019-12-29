plugins {
    kotlin("jvm") version "1.3.60" // calls deprecated gradle DefaultPolymorphicDomainObjectContainer
    id("org.unbroken-dome.test-sets") version "2.2.1"
}

repositories {
    mavenCentral()
}

testSets {
    val testShared by libraries.creating {

    }

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

val testShared by configurations.getting

dependencies {
    /** Project dependencies **/
    // none

    /** Language dependencies **/
    implementation(kotlin("stdlib-jdk8"))

    /** Main dependencies **/
    // none

    /** Test dependencies **/
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.5.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.5.2")

    testShared("org.junit.jupiter:junit-jupiter-api:5.5.2")

}

tasks.withType<Test> {
    useJUnitPlatform {
        includeTags("fail")
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

tasks.getByName("check"){
    dependsOn("mediumTest")
    dependsOn("largeTest")
}