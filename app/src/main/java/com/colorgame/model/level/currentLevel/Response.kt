package com.colorgame.model.level.currentLevel

import com.colorgame.model.level.newLevel.Image
import com.colorgame.model.level.newLevel.Stage

data class Response(
    val canvas: Canvas,
    val images: List<Image>,
    val selectedImage: SelectedImage,
    val stage: Stage,
    val stats: Stats
)