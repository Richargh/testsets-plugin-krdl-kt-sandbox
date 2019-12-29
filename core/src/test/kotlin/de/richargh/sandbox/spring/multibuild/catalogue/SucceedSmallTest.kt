package de.richargh.sandbox.spring.multibuild.catalogue

import de.richargh.sandbox.spring.multibuild.DomainObject
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class SucceedSmallTest {

    @Tag(willSucceed)
    @Test
    fun `tests that a succeeding small test is counted`() {
        /// arrange, tests if main and testShared can be linked
        val domainObject: DomainObject = DomainObjectBuilder().build()

        // act

        // assert
        assertEquals("expected", "expected")
    }
}