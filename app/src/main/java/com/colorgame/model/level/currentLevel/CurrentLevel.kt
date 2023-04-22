package com.colorgame.model.level.currentLevel

import com.colorgame.model.level.setLevel.Info

data class CurrentLevel(
    val info: Info,
    val apiResponse: ApiResponse,
    val status: Int,
    val success: Boolean
)