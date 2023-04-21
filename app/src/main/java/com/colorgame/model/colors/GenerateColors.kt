package com.colorgame.model.colors

import com.colorgame.model.setLevel.Info

data class GenerateColors(
    val info: Info,
    val colorResponse: ColorResponse,
    val status: Int,
    val success: Boolean
)