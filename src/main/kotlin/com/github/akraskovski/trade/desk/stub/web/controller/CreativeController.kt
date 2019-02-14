package com.github.akraskovski.trade.desk.stub.web.controller

import com.github.akraskovski.trade.desk.stub.web.converter.map
import com.github.akraskovski.trade.desk.stub.web.form.creative.CreativeForm
import com.github.akraskovski.trade.desk.stub.web.form.search.CreativeSearchQuery
import com.github.akraskovski.trade.desk.stub.web.response.creative.CreativeResponse
import com.github.akraskovski.trade.desk.stub.web.response.search.PageResponse
import com.github.akraskovski.trade.desk.stub.web.service.CreativeService
import com.github.akraskovski.trade.desk.stub.web.service.toResponse
import com.github.dozermapper.core.Mapper
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

/**
 * Creative endpoint.
 */
@RestController
@RequestMapping("/creative")
class CreativeController(
    private val creativeService: CreativeService,
    private val mapper: Mapper
) {

    /**
     * Creates a new creative.
     */
    @PostMapping
    fun create(@RequestBody @Valid creativeForm: CreativeForm): ResponseEntity<CreativeResponse> =
        creativeService.create(creativeForm)
            .let(mapper::map)
            .let(::ok)

    /**
     * Search the campaigns for a given advertiser with predefined criteria.
     */
    @PostMapping("/query/advertiser")
    fun search(@RequestBody @Valid searchQuery: CreativeSearchQuery): ResponseEntity<PageResponse<CreativeResponse>>? =
        ResponseEntity.ok(creativeService.searchByParent(searchQuery).toResponse())
}