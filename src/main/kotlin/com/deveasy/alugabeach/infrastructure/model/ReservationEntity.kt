package com.deveasy.alugabeach.infrastructure.model

import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.Date

data class ReservationEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: String? = null,

    @Column(name = "user_id")
    val customer: UserEntity,

    @Column(name = "court_id")
    val court: CourtEntity,

    val dateReservation: Date
)
