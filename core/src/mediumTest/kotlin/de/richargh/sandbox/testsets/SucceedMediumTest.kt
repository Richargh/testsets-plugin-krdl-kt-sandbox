package de.richargh.sandbox.testsets

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class SucceedMediumTest {

    @Tag(willSucceed)
    @Test
    fun `tests that a succeeding medium test is counted`() {
        // arrange, tests if main and testShared can be linked
        val domainObject: DomainObject = DomainObjectBuilder().build()

        // act

        // assert
        assertEquals("expected", "expected")
    }

}