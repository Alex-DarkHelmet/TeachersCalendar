package com.alex_bystrov.teacherscalendar.auth.login.models

sealed class LoginActions {
    object ToCalendarScreen: LoginActions()

}