package com.colorgame.model.setLevel

data class SetLevelResponse(
    val info: Info,
    val response: Response,
    val status: Int,
    val success: Boolean
)