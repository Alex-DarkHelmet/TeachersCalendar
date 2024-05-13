package com.alex_bystrov.teacherscalendar.auth.login.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun LoginView(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        TextField(value = "", onValueChange =  {

        })

    }
}