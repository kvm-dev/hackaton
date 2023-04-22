package com.colorgame.model.stock.report

import com.colorgame.model.level.setLevel.Info

data class StockReport(
    val info: Info,
    val reportResponse: ReportResponse,
    val status: Int,
    val success: Boolean
)