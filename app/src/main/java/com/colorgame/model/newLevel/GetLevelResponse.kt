package com.colorgame.model.newLevel


data class GetLevelResponse(
    val images: List<Image>,
    val stage: Stage
)