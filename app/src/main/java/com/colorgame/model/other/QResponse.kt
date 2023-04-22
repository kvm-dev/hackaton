package com.colorgame.model.other

data class QResponse(
    val command: Int,
    val dto: Dto,
    val id: Long,
    val log: Any,
    val stateMachineId: Long,
    val status: Int,
    val userId: Int,
    val userStageId: Int
)