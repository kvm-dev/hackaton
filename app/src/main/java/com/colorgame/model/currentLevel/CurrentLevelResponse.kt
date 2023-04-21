package com.colorgame.model.currentLevel

import com.colorgame.model.setLevel.Info

data class CurrentLevelResponse(
    val info: Info,
    val response: Response,
    val status: Int,
    val success: Boolean
)