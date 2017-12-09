package com.github.geraldcroes.kotlin.gof.factory

import org.hamcrest.CoreMatchers.instanceOf
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class StandardFileParserFactoryTest {
    @Test
    fun `should create an XMLFileParser when given a filename with an XML extension` () {
        val parserFactory = StandardFileParserFactory()
        assertThat(
                parserFactory.createFromFileName("filename.xml"),
                instanceOf(XmlFileParser::class.java)
        )
    }

    @Test
    fun `should create a JSONFileParser when given a filename with a json extension` () {
        var parserFactory = StandardFileParserFactory()
        assertThat(
                parserFactory.createFromFileName("filename.json"),
                instanceOf(JsonFileParser::class.java)
        )
    }

    @Test(expected = Exception::class)
    fun `should raise an exception when given a filename which extension is unknown`() {
        var parserFactory = StandardFileParserFactory()
        parserFactory.createFromFileName("filename.foo")
    }
}