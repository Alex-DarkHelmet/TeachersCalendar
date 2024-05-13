package com.alex_bystrov.teacherscalendar.auth.login.ktor.models

import kotlinx.serialization.Serializable

@Serializable
data class UserResponse(
    val token: String
)
