package com.deveasy.alugabeach.domain.model

import com.deveasy.alugabeach.application.enums.Roles

data class User(
    val id: String? = null,
    val name: String,
    val email: String,
    val password: String,
    val role: Roles
)