package com.colorgame.model.currentLevel

data class Stats(
    val commandCount: Int,
    val grade: Int,
    val lastLogId: Int,
    val pixels: Int,
    val pixelsMisses: Int,
    val shoots: Int,
    val shootsMisses: Int,
    val shootsMissesPartially: Int,
    val userId: Int,
    val userStageId: Int
)