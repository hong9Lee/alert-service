package com.pjt.alert.domain

import com.pjt.alert.domain.enum.AlertChannel

sealed class AlertInfo {
    abstract val channel: AlertChannel
    abstract val receiver: String

    data class Sms(val phoneNumber: String) : AlertInfo() {
        override val channel: AlertChannel = AlertChannel.SMS
        override val receiver: String = phoneNumber
    }

    data class Email(val email: String) : AlertInfo() {
        override val channel: AlertChannel = AlertChannel.EMAIL
        override val receiver: String = email
    }

    data class Kakao(val talkId: String) : AlertInfo() {
        override val channel: AlertChannel = AlertChannel.KAKAO
        override val receiver: String = talkId
    }

    data class Fcm(val deviceToken: String) : AlertInfo() {
        override val channel: AlertChannel = AlertChannel.FCM
        override val receiver: String = deviceToken
    }
}

