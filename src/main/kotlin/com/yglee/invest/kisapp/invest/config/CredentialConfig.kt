package com.yglee.invest.kisapp.invest.config

import com.yglee.invest.kisapp.invest.model.Credentials
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(Credentials::class)
class CredentialConfig