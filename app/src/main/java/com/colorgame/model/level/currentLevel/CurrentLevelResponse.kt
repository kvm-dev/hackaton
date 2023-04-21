package com.colorgame.model.level.currentLevel

import com.colorgame.model.level.setLevel.Info

data class CurrentLevelResponse(
    val info: Info,
    val response: Response,
    val status: Int,
    val success: Boolean
)