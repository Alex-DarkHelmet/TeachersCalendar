package com.alex_bystrov.teacherscalendar.auth.login.ktor.models

import kotlinx.serialization.Serializable

@Serializable
data class UserRequest(
    val username: String,
    val password: String
)
