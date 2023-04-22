package com.colorgame.model.other

import com.colorgame.model.level.currentLevel.ApiResponse
import com.colorgame.model.level.setLevel.Info

data class Shot(
    val info: Info,
    val apiResponse: ApiResponse,
    val status: Int,
    val success: Boolean
)