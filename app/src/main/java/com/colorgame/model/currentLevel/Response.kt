package com.colorgame.model.currentLevel

import com.colorgame.model.newLevel.Image
import com.colorgame.model.newLevel.Stage

data class Response(
    val canvas: Canvas,
    val images: List<Image>,
    val selectedImage: SelectedImage,
    val stage: Stage,
    val stats: Stats
)