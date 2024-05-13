package com.alex_bystrov.teacherscalendar.auth.login.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alex_bystrov.teacherscalendar.auth.login.models.LoginViewEvents
import com.alex_bystrov.teacherscalendar.auth.login.models.LoginViewState

@Composable
fun LoginView(
    modifier: Modifier = Modifier,
    viewState: LoginViewState,
    onEvent: (LoginViewEvents) -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = modifier
                .align(alignment = Alignment.CenterHorizontally)
            ,
            fontSize = 20.sp,
            fontWeight = FontWeight(500),
            text = "Login"
        )

        TextField(
            modifier = modifier
                .padding(horizontal = 20.dp, vertical = 5.dp)
                .fillMaxWidth(),
            value = viewState.username,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            shape = RoundedCornerShape(10.dp),
            onValueChange = {
                onEvent.invoke(LoginViewEvents.OnUsernameChanged(it))
            }
        )

        TextField(
            modifier = modifier
                .padding(horizontal = 20.dp, vertical = 5.dp)
                .fillMaxWidth(),
            value = viewState.password,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            shape = RoundedCornerShape(10.dp),
            onValueChange = {
                onEvent.invoke(LoginViewEvents.OnPasswordChanged(it))
            }
        )

        Button(
            modifier = modifier
                .padding(horizontal = 20.dp, vertical = 10.dp)
                .fillMaxWidth(),
            onClick = {
                onEvent.invoke(LoginViewEvents.LoginClicked)
            }
        ) {
            Text(text = "Login")
        }
    }
}

@Preview
@Composable
fun LoginViewPreview() {
    LoginView(viewState = LoginViewState()) {

    }
}