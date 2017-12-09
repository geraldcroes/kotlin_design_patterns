package com.github.geraldcroes.kotlin.gof.factory.variants.extensions

import com.github.geraldcroes.kotlin.gof.factory.variants.withininterface.fromFile
import org.hamcrest.CoreMatchers.instanceOf
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class FileParserTest {
    @Test
    fun `should create an XMLFileParser when given a filename with an XML extension` () {
        assertThat(
                FileParser createFromFileName "filename.xml",
                instanceOf(XmlFileParser::class.java)
        )
    }

    @Test
    fun `should create a JSONFileParser when given a filename with a json extension` () {
        assertThat(
                FileParser createFromFileName "filename.json",
                instanceOf(JsonFileParser::class.java)
        )
    }

    @Test(expected = Exception::class)
    fun `should raise an exception when given a filename which extension is unknown`() {
        FileParser createFromFileName "filename.foo"
    }

    @Test
    fun `has an extension we can use to create FileParser` () {
        assertThat(
                FileParser.fromFile("filename.json"),
                instanceOf(JsonFileParser::class.java)
        )
    }

}