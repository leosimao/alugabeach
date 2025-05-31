package com.deveasy.alugabeach.infrastructure.mappers

import com.deveasy.alugabeach.core.GenericMapper
import com.deveasy.alugabeach.domain.model.Reservation
import com.deveasy.alugabeach.infrastructure.model.ReservationEntity
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface ReservationMapper: GenericMapper<Reservation, ReservationEntity> {

    override fun toEntity(reservation: Reservation): ReservationEntity

    override fun toDomain(reservationEntity: ReservationEntity): Reservation

}