package com.github.akraskovski.trade.desk.stub.web.controller

import com.github.akraskovski.trade.desk.stub.domain.repository.AdvertiserRepository
import com.github.akraskovski.trade.desk.stub.web.converter.toResponse
import com.github.akraskovski.trade.desk.stub.web.response.advertiser.AdvertiserResponse
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Advertiser endpoint.
 */
@RestController
@RequestMapping("/advertiser")
class AdvertiserController(private val advertiserRepository: AdvertiserRepository) {

    /**
     * Gets an advertiser by a given id or return not found status.
     */
    @GetMapping("/{id}")
    fun getById(@PathVariable id: String): ResponseEntity<AdvertiserResponse> =
        advertiserRepository.findByIdOrNull(id)
            ?.let { it.toResponse() }
            ?.let { ResponseEntity.ok(it) }
            ?: ResponseEntity.notFound().build()
}