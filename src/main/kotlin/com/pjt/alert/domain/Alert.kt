package com.pjt.alert.domain

import java.time.ZonedDateTime

data class Alert(
    val id: Long? = null,
    val templateCode: String,
    val alertInfo: AlertInfo,
    val scheduledAt: ZonedDateTime? = null,
    val regDateTime: ZonedDateTime,
    val modDateTime:ZonedDateTime
)
