package com.colorgame.model.level.newLevel


data class GetLevelResponse(
    val images: List<Image>,
    val stage: Stage
)