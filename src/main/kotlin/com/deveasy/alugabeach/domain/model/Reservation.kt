package com.deveasy.alugabeach.domain.model

import com.deveasy.alugabeach.infrastructure.model.CourtEntity
import com.deveasy.alugabeach.infrastructure.model.UserEntity
import java.util.Date

data class Reservation(
    val id: String? = null,
    val customer: UserEntity,
    val court: CourtEntity,
    val dateReservation: Date
)
