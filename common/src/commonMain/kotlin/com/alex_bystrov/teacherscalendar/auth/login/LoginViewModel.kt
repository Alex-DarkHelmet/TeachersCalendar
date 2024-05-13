package com.alex_bystrov.teacherscalendar.auth.login

import com.adeo.kviewmodel.BaseSharedViewModel
import com.alex_bystrov.teacherscalendar.auth.login.models.LoginActions
import com.alex_bystrov.teacherscalendar.auth.login.models.LoginViewEvents
import com.alex_bystrov.teacherscalendar.auth.login.models.LoginViewState
import kotlinx.coroutines.flow.StateFlow

class LoginViewModel: BaseSharedViewModel<LoginViewState, LoginActions, LoginViewEvents>(initialState = LoginViewState()) {
    override fun obtainEvent(viewEvent: LoginViewEvents) {
        when (viewEvent) {
            LoginViewEvents.LoginClicked -> TODO()
            is LoginViewEvents.OnPasswordChanged -> TODO()
            is LoginViewEvents.OnUsernameChanged -> TODO()
        }
    }


}