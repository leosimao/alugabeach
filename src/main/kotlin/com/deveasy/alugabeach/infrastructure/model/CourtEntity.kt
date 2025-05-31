package com.deveasy.alugabeach.infrastructure.model

import com.deveasy.alugabeach.application.enums.CourtStatus
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "court")
data class CourtEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: String? = null,

    val number: String,

    val capacity: Int,

    @Enumerated(EnumType.STRING)
    val status: CourtStatus,
)
