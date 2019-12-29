package de.richargh.sandbox.spring.multibuild.catalogue

import de.richargh.sandbox.spring.multibuild.DomainObject
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.fail

class FailSmallTest {

    @Disabled
    @Tag("fail")
    @Test
    fun `tests that a failing small test is recognized`() {
        // arrange, tests if main and testShared can be linked
        val domainObject: DomainObject = DomainObjectBuilder().build()

        // act

        // assert
        fail("expected")
    }

}