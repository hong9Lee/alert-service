package com.pjt.alert.domain

import com.pjt.alert.domain.enum.AlertChannel

data class AlertInfo(
    val channel: AlertChannel,
    val receiver: String,
) {
}
