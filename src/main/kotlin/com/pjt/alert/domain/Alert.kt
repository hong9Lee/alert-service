package com.pjt.alert.domain

import java.time.ZonedDateTime

data class Alert(
    val id: Long? = null,
    val templateCode: String,
    val alertInfo: AlertInfo,
    val regDateTime: ZonedDateTime,
    val modDateTime:ZonedDateTime
)

//sealed class AlertInfo {
//    data class Sms(val phoneNumber: String): AlertInfo()
//    data class Email(val email: String): AlertInfo()
//    data class Kakao(val talkId: String): AlertInfo()
//    data class Fcm(val deviceToken: String): AlertInfo()
//
//    abstract val channel: AlertChannel
//    abstract val receiver: String
//}
