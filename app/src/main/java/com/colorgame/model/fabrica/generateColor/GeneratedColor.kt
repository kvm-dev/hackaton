package com.colorgame.model.fabrica.generateColor

import com.colorgame.model.level.setLevel.Info

data class GeneratedColor(
    val info: Info,
    val generatedResponse: GeneratedResponse,
    val status: Int,
    val success: Boolean
)