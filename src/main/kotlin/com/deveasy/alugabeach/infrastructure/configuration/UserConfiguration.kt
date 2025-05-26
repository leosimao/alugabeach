package com.deveasy.alugabeach.infrastructure.configuration

import com.deveasy.alugabeach.application.UserUseCaseImplementation
import com.deveasy.alugabeach.core.UserUseCase
import com.deveasy.alugabeach.infrastructure.mappers.UserMapper
import com.deveasy.alugabeach.infrastructure.repository.UserRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UserConfiguration {

    @Bean
    fun userUseCaseImplementation(userRepository: UserRepository, userMapper: UserMapper): UserUseCase = UserUseCaseImplementation(
        userRepository,
        userMapper
    )
}