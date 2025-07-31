package com.pjt.alert.application.service

import com.pjt.alert.api.request.RegisterAlertRequest
import org.springframework.stereotype.Service

@Service
class AlertRegisterService(

) {

    fun register(request: RegisterAlertRequest) {
        val alert = request.toDomain()
        
    }
}
