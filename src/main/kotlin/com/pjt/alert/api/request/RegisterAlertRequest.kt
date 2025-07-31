package com.pjt.alert.api.request

import com.pjt.alert.domain.Alert
import com.pjt.alert.domain.AlertInfo
import com.pjt.alert.domain.enum.AlertChannel
import java.time.ZonedDateTime

data class RegisterAlertRequest(
    val templateCode: String,
    val channel: AlertChannel,
    val receiver: String,
    val scheduledAt: ZonedDateTime? = null,
) {
    fun toDomain(): Alert {
        val info = when (channel) {
            AlertChannel.SMS -> AlertInfo.Sms(receiver)
            AlertChannel.EMAIL -> AlertInfo.Email(receiver)
            AlertChannel.KAKAO -> AlertInfo.Kakao(receiver)
            AlertChannel.FCM -> AlertInfo.Fcm(receiver)
        }
        return Alert(
            templateCode = templateCode,
            alertInfo = info,
            scheduledAt = scheduledAt,
            regDateTime = ZonedDateTime.now(),
            modDateTime = ZonedDateTime.now()
        )
    }
}
