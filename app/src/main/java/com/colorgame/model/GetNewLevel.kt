package com.example.adhipradanatest.hakaton.level

data class GetNewLevel (
    val info: LevelInfo,
    val status: Int,
    val success: Boolean,
    val response: LevelResponse
)