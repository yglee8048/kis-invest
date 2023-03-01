package com.yglee.invest.kisapp.invest.api

import com.yglee.invest.kisapp.invest.service.TokenService
import lombok.RequiredArgsConstructor
import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Slf4j
@RestController
@RequiredArgsConstructor
class TokenApi(
    val tokenService: TokenService
) {

    @GetMapping("/sign-in")
    fun signIn() {
        val token = tokenService.createToken()

        println("token = ${token.block()}")
    }

}