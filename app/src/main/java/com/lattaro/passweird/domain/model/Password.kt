package com.lattaro.passweird.domain.model

data class Password(
    val id: Int,
    val description: String,
    val username: String,
    val password: String,
    val url: String?
)