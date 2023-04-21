package com.colorgame.model.setLevel

data class SetLevelResponse(
    val info: Info,
    val queueResponse: QueueResponse,
    val status: Int,
    val success: Boolean
)