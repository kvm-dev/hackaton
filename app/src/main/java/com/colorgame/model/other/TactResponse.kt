package com.colorgame.model.other

data class TactResponse(
    val stateTimeMs: Int,
    val stateTimeNs: Int,
    val tick: Long
)