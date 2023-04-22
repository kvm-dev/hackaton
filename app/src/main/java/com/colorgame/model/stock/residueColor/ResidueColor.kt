package com.colorgame.model.stock.residueColor

import com.colorgame.model.level.setLevel.Info

data class ResidueColor(
    val info: Info,
    //todo переименовать переменную респонс - это колво краски на остатках
    val response: Int,
    val status: Int,
    val success: Boolean
)