package com.deveasy.alugabeach.infrastructure.model

import com.deveasy.alugabeach.application.enums.Roles
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "app_user")
data class UserEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: String? = null,

    val name: String,

    val email: String,

    val password: String,

    @Enumerated(EnumType.STRING)
    val role: Roles
)
