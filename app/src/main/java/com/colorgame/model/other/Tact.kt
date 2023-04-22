package com.colorgame.model.other

import com.colorgame.model.level.setLevel.Info

data class Tact(
    val info: Info,
    val tactResponse: TactResponse,
    val status: Int,
    val success: Boolean
)