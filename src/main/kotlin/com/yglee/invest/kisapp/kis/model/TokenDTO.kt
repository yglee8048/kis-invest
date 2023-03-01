package com.yglee.invest.kisapp.kis.model

import java.time.LocalDateTime

class TokenDTO {
    data class Req(
        val grantType: String,
        val appkey: String,
        val appsecret: String
    )

    data class Res(
        val accessToken: String,
        val accessTokenTokenExpired: LocalDateTime,
        val tokenType: String,
        val expiredIn: Int
    )
}