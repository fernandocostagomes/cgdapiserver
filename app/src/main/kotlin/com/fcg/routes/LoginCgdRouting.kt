package com.fcg.routes

import com.fcg.models.User
import com.fcg.authentication.JwtConfig
import com.fcg.jwtConfig
import com.fcg.models.UserCgdService
import com.fcg.repository.InMemoryUserRepository
import com.fcg.repository.UserRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureLoginUserCgd(user_cgdService: UserCgdService){

    routing {

        val userRepository: UserRepository = InMemoryUserRepository()

        post("/login") {
            val loginBody = call.receive<User>()

            val user = userRepository.getUser(loginBody.username, loginBody.password)

            if (user == null) {
                call.respond(HttpStatusCode.Unauthorized, "Invalid credentials!")
                return@post
            }

            val token = jwtConfig.generateToken(JwtConfig.JwtUser(user.userId, user.username))
            call.respond(token)
        }
        // Create user_cgd
        // Create user_cgd


    }
}