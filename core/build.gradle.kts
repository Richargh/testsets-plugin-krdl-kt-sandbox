plugins {
    kotlin("jvm")
}

dependencies {
    /** Project dependencies **/
    // none

    /** Language dependencies **/
    implementation(kotlin("stdlib-jdk8"))

    /** Main dependencies **/
    // none

    /** Test, Medium and Large dependencies **/
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.5.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.5.2")

    /** TestShared dependencies **/
    // without this the standard library is not known
    "testSharedImplementation"(kotlin("stdlib-jdk8"))
    "testSharedImplementation"("org.junit.jupiter:junit-jupiter-api:5.5.2")
}
