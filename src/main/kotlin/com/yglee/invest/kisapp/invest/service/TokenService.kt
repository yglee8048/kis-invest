package com.yglee.invest.kisapp.invest.service

import com.yglee.invest.kisapp.invest.model.Credentials
import com.yglee.invest.kisapp.kis.api.KisApi
import com.yglee.invest.kisapp.kis.model.TokenDTO
import lombok.RequiredArgsConstructor
import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Slf4j
@Service
@RequiredArgsConstructor
class TokenService(
    val credentials: Credentials,
    val kisApi: KisApi
) {

    fun createToken(): Mono<TokenDTO.Res> {
        return kisApi.createAccessToken(
            TokenDTO.Req(
                "client_credentials",
                credentials.accessKey,
                credentials.secretKey
            )
        )
    }
}