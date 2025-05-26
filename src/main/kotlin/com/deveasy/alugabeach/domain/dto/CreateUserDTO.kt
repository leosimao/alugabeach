package com.deveasy.alugabeach.domain.dto

data class CreateUserDTO(
    val name: String,
    val email: String,
    val password: String,
    val role: String
)
