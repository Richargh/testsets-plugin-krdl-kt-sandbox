package de.richargh.sandbox.testsets

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.fail

class FailMediumTest {

    @Disabled
    @Tag(mightFail)
    @Test
    fun `tests that a failing medium test is recognized`() {
        // arrange, tests if main and testShared can be linked
        val domainObject: DomainObject = DomainObjectBuilder().build()

        // act

        // assert
        fail("expected")
    }

}