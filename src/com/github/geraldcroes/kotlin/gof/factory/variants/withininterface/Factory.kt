package com.github.geraldcroes.kotlin.gof.factory.variants.withininterface

import com.github.geraldcroes.kotlin.gof.factory.variants.extensions.FileParser

fun FileParser.Companion.fromFile(filename: String) =
        this.createFromFileName(filename)