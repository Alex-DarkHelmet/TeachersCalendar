package com.alex_bystrov.teacherscalendar.auth.login.models

sealed class LoginViewEvents {
    data class OnUsernameChanged(val value: String): LoginViewEvents()

    data class OnPasswordChanged(val value: String): LoginViewEvents()

    data object LoginClicked: LoginViewEvents()
}