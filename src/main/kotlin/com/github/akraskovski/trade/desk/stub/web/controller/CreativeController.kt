package com.github.akraskovski.trade.desk.stub.web.controller

import com.github.akraskovski.trade.desk.stub.web.converter.toResponse
import com.github.akraskovski.trade.desk.stub.web.form.creative.CreativeForm
import com.github.akraskovski.trade.desk.stub.web.response.creative.CreativeResponse
import com.github.akraskovski.trade.desk.stub.web.service.CreativeService
import com.github.akraskovski.trade.desk.stub.web.service.SearchService
import org.springframework.http.ResponseEntity
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
    private val searchService: SearchService
) {

    /**
     * Creates a new creative.
     */
    @PostMapping
    fun create(@RequestBody @Valid creativeForm: CreativeForm): ResponseEntity<CreativeResponse> =
        ResponseEntity.ok(creativeService.create(creativeForm).toResponse())
}