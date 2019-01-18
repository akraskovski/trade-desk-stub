package com.github.akraskovski.trade.desk.stub.domain

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.text.SimpleDateFormat

@Configuration
class WebConfiguration {

    @Bean
    fun objectMapper(): ObjectMapper = ObjectMapper()
        .setDateFormat(SimpleDateFormat(DATE_FORMAT))
        .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)

    companion object {
        private const val DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZ"
    }
}