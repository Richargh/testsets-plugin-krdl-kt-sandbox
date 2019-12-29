package de.richargh

import de.richargh.sandbox.spring.multibuild.DomainObject
import de.richargh.sandbox.spring.multibuild.catalogue.DomainObjectBuilder
import de.richargh.sandbox.spring.multibuild.catalogue.mightFail
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.fail

class FailLargeTest {

    @Disabled
    @Tag(mightFail)
    @Test
    fun `tests that a failing large test is recognized`() {
        // arrange, tests if main and testShared can be linked
        val domainObject: DomainObject = DomainObjectBuilder().build()

        // act

        // assert
        fail("expected")
    }
}