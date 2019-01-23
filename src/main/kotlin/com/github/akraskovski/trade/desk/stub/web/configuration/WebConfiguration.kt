package com.github.akraskovski.trade.desk.stub.web.configuration

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder
import java.text.SimpleDateFormat

/**
 * General web interface beans configuration.
 */
@Configuration
class WebConfiguration {

    companion object {
        private const val DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZ"
    }

    /**
     * Jackson general configuration.
     */
    @Bean
    @Primary
    fun objectMapper(builder: Jackson2ObjectMapperBuilder): ObjectMapper =
        builder
            .dateFormat(SimpleDateFormat(DATE_FORMAT))
            .failOnUnknownProperties(false)
            .build()
}