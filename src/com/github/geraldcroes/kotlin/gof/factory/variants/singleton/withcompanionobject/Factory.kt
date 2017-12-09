package com.github.geraldcroes.kotlin.gof.factory.variants.singleton.withcompanionobject

import java.lang.Exception

/* The concept of the factory -> creates a Product */
interface FileParserFactory {
    fun createFromFileName(fileName: String): FileParser
}

/* Our specific Factory */
class CompanionObjectFileParserFactory {
    companion object : FileParserFactory{
        override fun createFromFileName(fileName: String) =
                when (fileName.substringAfterLast('.')) {
                    "xml" -> XmlFileParser()
                    "json" -> JsonFileParser()
                    else -> throw Exception("I don't know how to deal with $fileName.")
                }
    }
}