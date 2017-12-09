package com.github.geraldcroes.kotlin.gof.factory.variants.stringextension

import org.hamcrest.CoreMatchers.instanceOf
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class StringExtensionTest {
    @Test
    fun `should create an XMLFileParser when given a filename with an XML extension` () {
        assertThat(
                "filename.xml".createFileParser(),
                instanceOf(XmlFileParser::class.java)
        )
    }

    @Test
    fun `should create a JSONFileParser when given a filename with a json extension` () {
        assertThat(
                "filename.json".createFileParser(),
                instanceOf(JsonFileParser::class.java)
        )
    }

    @Test(expected = Exception::class)
    fun `should raise an exception when given a filename which extension is unknown`() {
        "filename.foo".createFileParser()
    }
}