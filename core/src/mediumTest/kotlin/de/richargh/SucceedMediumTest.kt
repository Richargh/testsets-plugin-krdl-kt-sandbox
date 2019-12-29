package de.richargh

import de.richargh.sandbox.spring.multibuild.DomainObject
import de.richargh.sandbox.spring.multibuild.catalogue.DomainObjectBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import de.richargh.sandbox.spring.multibuild.catalogue.willSucceed

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