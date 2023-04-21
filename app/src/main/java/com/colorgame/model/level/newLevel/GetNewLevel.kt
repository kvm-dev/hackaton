package com.colorgame.model.level.newLevel

data class GetNewLevel (
    val info: LevelInfo,
    val status: Int,
    val success: Boolean,
    val response: GetLevelResponse
)