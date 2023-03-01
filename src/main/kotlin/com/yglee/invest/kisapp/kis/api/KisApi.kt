package com.yglee.invest.kisapp.kis.api

import com.yglee.invest.kisapp.kis.model.TokenDTO
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import reactor.core.publisher.Mono

@FeignClient(name = "kis", url = "\${kis.base_url}")
interface KisApi {

    @PostMapping("/oauth2/tokenP")
    fun createAccessToken(@RequestBody req: TokenDTO.Req): Mono<TokenDTO.Res>
}