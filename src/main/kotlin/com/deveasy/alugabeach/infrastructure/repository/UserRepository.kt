package com.deveasy.alugabeach.infrastructure.repository

import com.deveasy.alugabeach.infrastructure.model.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface UserRepository: JpaRepository<UserEntity, UUID> {
}