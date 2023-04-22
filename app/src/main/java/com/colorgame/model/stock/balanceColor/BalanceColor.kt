package com.colorgame.model.stock.balanceColor

import com.colorgame.model.level.setLevel.Info

data class BalanceColor(
    val info: Info,
    val balanceResponse: BalanceResponse,
    val status: Int,
    val success: Boolean,
    val message: String = "no message"
)