package com.fcg.plugins

import io.ktor.server.auth.*
import io.ktor.server.auth.jwt.*
import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import com.fcg.authentication.JwtConfig
import com.fcg.jwtConfig
import io.ktor.server.application.*

fun Application.configureSecurity() {



    install(Authentication) {
        jwt {
            jwtConfig.configureKtorFeature(this)
        }
    }
}
