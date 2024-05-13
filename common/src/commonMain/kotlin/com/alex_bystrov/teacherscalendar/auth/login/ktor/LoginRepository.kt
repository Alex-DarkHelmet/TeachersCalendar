package com.alex_bystrov.teacherscalendar.auth.login.ktor

import com.alex_bystrov.teacherscalendar.auth.login.ktor.models.UserRequest
import com.alex_bystrov.teacherscalendar.auth.login.ktor.models.UserResponse

interface LoginRepository {
    suspend fun login(userRequest: UserRequest): UserResponse
}