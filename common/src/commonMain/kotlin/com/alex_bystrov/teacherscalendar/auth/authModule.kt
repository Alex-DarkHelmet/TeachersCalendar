package com.alex_bystrov.teacherscalendar.auth

import com.alex_bystrov.teacherscalendar.auth.login.ktor.LoginRepositoryImpl
import com.alex_bystrov.teacherscalendar.auth.login.ktor.LoginRepository
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.singleton

val authModule = DI.Module("authModule") {
    bind<LoginRepository>() with singleton {
        LoginRepositoryImpl(instance())
    }
}