package com.deveasy.alugabeach.domain.model

import com.deveasy.alugabeach.application.enums.CourtStatus

data class Court(
    val id: String? = null,
    val number: String,
    val capacity: Int,
    val status: CourtStatus,
)
