package com.colorgame.model.other

import com.colorgame.model.level.setLevel.Info

data class Queue(
    val info: Info,
    val QResponse: List<QResponse>,
    val status: Int,
    val success: Boolean
)