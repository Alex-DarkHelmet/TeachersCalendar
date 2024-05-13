package com.alex_bystrov.teacherscalendar.auth.login.ktor

import com.alex_bystrov.teacherscalendar.auth.login.ktor.models.UserRequest
import com.alex_bystrov.teacherscalendar.auth.login.ktor.models.UserResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.http.path

class LoginRepositoryImpl(private val httpClient: HttpClient) : LoginRepository {
    override suspend fun login(userRequest: UserRequest): UserResponse {
        return httpClient.post {
            url {
                path("/login")
                setBody(
                    UserRequest(
                        username = userRequest.username,
                        password = userRequest.password
                    )
                )
            }
        }.body()
    }
}