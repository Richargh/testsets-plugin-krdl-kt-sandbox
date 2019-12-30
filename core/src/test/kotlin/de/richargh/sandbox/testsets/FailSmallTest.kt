package de.richargh.sandbox.testsets

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.fail

class FailSmallTest {

    // tests whether disabled annotation is interpreted, if not this test fails the build
    @Disabled
    @Tag(mightFail)
    @Test
    fun `tests that a failing small test is recognized`() {
        // arrange

        // act

        // assert
        fail("expected")
    }

}