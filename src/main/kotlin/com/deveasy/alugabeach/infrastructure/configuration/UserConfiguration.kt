package com.deveasy.alugabeach.infrastructure.configuration

import com.deveasy.alugabeach.application.UserUseCaseImplementation
import com.deveasy.alugabeach.core.GenericPersistence
import com.deveasy.alugabeach.core.UserUseCase
import com.deveasy.alugabeach.domain.model.User
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UserConfiguration {

    @Bean
    fun userUseCaseImplementation(userPersistence: GenericPersistence<User>): UserUseCase = UserUseCaseImplementation(
        userPersistence,
    )
}