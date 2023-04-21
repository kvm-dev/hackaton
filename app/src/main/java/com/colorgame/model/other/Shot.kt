package com.colorgame.model.other

import com.colorgame.model.level.currentLevel.Response
import com.colorgame.model.level.setLevel.Info

data class Shot(
    val info: Info,
    val response: Response,
    val status: Int,
    val success: Boolean
)