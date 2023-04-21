package com.colorgame.model.level.setLevel

data class SetLevelResponse(
    val info: Info,
    val queueResponse: QueueResponse,
    val status: Int,
    val success: Boolean
)