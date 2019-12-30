package de.richargh.sandbox.testsets

class DomainObjectBuilder {

    private var word: String = "World"

    fun build() = DomainObject(word)

    fun withWord(word: String) = apply { this.word = word }
}