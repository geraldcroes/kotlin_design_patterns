package com.github.geraldcroes.kotlin.gof.factory.variants.singleton.withobject

/* The kind of product */
interface FileParser

/* One possible product */
class XmlFileParser : FileParser
/* Another possible product */
class JsonFileParser : FileParser

