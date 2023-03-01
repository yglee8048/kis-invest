package com.yglee.invest.kisapp.kis.config

import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.Configuration

@Configuration
@EnableFeignClients("com.yglee.invest.kisapp.kis.api")
class KisConfig {
}