package com.colorgame.model.level.finishLevel

import com.colorgame.model.level.setLevel.Info
import com.colorgame.model.level.setLevel.QueueResponse

data class FinishLevelResponse(
    val info: Info,
    val queueResponse: QueueResponse,
    val status: Int,
    val success: Boolean
)