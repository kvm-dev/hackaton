package com.colorgame.model.fabrica.selectedColor

import com.colorgame.model.level.setLevel.Info

data class SelectedColor(
    val info: Info,
    val selectedColorResponse: SelectedColorResponse,
    val status: Int,
    val success: Boolean
)