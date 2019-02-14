package com.github.akraskovski.trade.desk.stub.web.configuration

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.dozermapper.core.DozerBeanMapperBuilder
import com.github.dozermapper.core.Mapper
import com.github.dozermapper.core.loader.api.BeanMappingBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.core.type.filter.AssignableTypeFilter
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder
import java.text.SimpleDateFormat

/**
 * General web interface beans configuration.
 */
@Configuration
class WebConfiguration {

    companion object {
        private const val DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZ"
        private const val PACKAGE_TO_SCAN = "com.github.akraskovski.trade.desk.stub.web.mapping"
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

    /**
     * Dozer bean mapper.
     */
    @Bean
    fun dozerBeanMapper(): Mapper = DozerBeanMapperBuilder
        .create()
        .withMappingBuilders(getRegisteredMappings())
        .build()

    private fun getRegisteredMappings(): List<BeanMappingBuilder> {
        val scanner = ClassPathScanningCandidateComponentProvider(false)
        scanner.addIncludeFilter(AssignableTypeFilter(BeanMappingBuilder::class.java))

        val customMapping = mutableListOf<BeanMappingBuilder>()
        for (bd in scanner.findCandidateComponents(PACKAGE_TO_SCAN)) {
            customMapping.add(Class.forName(bd.beanClassName).getDeclaredConstructor().newInstance() as BeanMappingBuilder)
        }

        return customMapping
    }
}