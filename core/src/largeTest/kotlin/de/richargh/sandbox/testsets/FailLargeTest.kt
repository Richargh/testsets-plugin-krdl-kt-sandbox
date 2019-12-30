package de.richargh.sandbox.testsets

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.fail

class FailLargeTest {

    // tests whether disabled annotation is interpreted, if not this test fails the build
    @Disabled
    @Tag(mightFail)
    @Test
    fun `tests that a failing large test is recognized`() {
        // arrange

        // act

        // assert
        fail("expected")
    }
}