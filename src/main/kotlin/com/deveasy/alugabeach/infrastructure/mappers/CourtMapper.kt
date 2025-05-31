package com.deveasy.alugabeach.infrastructure.mappers

import com.deveasy.alugabeach.core.GenericMapper
import com.deveasy.alugabeach.domain.model.Court
import com.deveasy.alugabeach.infrastructure.model.CourtEntity
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface CourtMapper: GenericMapper<Court, CourtEntity> {

    override fun toEntity(court: Court): CourtEntity

    override fun toDomain(courtEntity: CourtEntity): Court

}