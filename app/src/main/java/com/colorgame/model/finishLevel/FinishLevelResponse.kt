package com.colorgame.model.finishLevel

import com.colorgame.model.setLevel.Info
import com.colorgame.model.setLevel.QueueResponse

data class FinishLevelResponse(
    val info: Info,
    val queueResponse: QueueResponse,
    val status: Int,
    val success: Boolean
)