package com.github.geraldcroes.kotlin.gof.factory.variants.singleton.withcompanionobject

import org.hamcrest.CoreMatchers.instanceOf
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class ObjectFileParserFactoryTest {
    @Test
    fun `should create an XMLFileParser when given a filename with an XML extension` () {
        assertThat(
                CompanionObjectFileParserFactory.createFromFileName("filename.xml"),
                instanceOf(XmlFileParser::class.java)
        )
    }

    @Test
    fun `should create a JSONFileParser when given a filename with a json extension` () {
        assertThat(
                CompanionObjectFileParserFactory.createFromFileName("filename.json"),
                instanceOf(JsonFileParser::class.java)
        )
    }

    @Test(expected = Exception::class)
    fun `should raise an exception when given a filename which extension is unknown`() {
        CompanionObjectFileParserFactory.createFromFileName("filename.foo")
    }

    @Test
    fun `can instanciate the factory with normal notation` () {
        assertThat(
                CompanionObjectFileParserFactory(),
                instanceOf(CompanionObjectFileParserFactory::class.java)
        )
    }
}