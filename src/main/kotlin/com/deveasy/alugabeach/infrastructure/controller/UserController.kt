package com.deveasy.alugabeach.infrastructure.controller

import com.deveasy.alugabeach.core.UserUseCase
import com.deveasy.alugabeach.domain.dto.CreateUserDTO
import com.deveasy.alugabeach.domain.dto.ResponseCreateUserDTO
import com.deveasy.alugabeach.domain.dto.ResponseUserDTO
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class UserController(
    private val userUseCase: UserUseCase,
) {

    @PostMapping("/create-user")
    fun createUser(@RequestBody createUserDTO: CreateUserDTO): ResponseEntity<ResponseCreateUserDTO> {
        val responseUserCreated = userUseCase.createUser(createUserDTO)
        return ResponseEntity.ok(responseUserCreated)
    }

    @GetMapping("/all-users")
    fun getAllUsers(): ResponseEntity<List<ResponseUserDTO>> {
        val responseUser = userUseCase.getAllUsers()
        return ResponseEntity.ok(responseUser)
    }
}