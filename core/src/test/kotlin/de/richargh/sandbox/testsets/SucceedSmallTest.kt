package de.richargh.sandbox.testsets

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
        val actual = domainObject.sayHello()

        // assert
        assertEquals(actual, "Hello World")
    }
}