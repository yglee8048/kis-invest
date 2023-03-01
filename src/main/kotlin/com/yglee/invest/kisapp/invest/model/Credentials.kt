package com.yglee.invest.kisapp.invest.model

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "kis.credentials")
data class Credentials(
    val accessKey: String,
    val secretKey: String
)