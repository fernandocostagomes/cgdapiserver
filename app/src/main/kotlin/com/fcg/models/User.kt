package com.fcg.models

data class User(
    val username: String,
    val password: String
) : UserCgd("", username, "", password)