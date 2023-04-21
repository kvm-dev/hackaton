package com.colorgame.model.newLevel

data class GetNewLevel (
    val info: LevelInfo,
    val status: Int,
    val success: Boolean,
    val response: GetLevelResponse
)