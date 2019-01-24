package com.github.akraskovski.trade.desk.stub.web.controller

import com.github.akraskovski.trade.desk.stub.domain.repository.AdGroupRepository
import com.github.akraskovski.trade.desk.stub.web.converter.map
import com.github.akraskovski.trade.desk.stub.web.form.adgroup.AdGroupCreateForm
import com.github.akraskovski.trade.desk.stub.web.form.adgroup.AdGroupUpdateForm
import com.github.akraskovski.trade.desk.stub.web.form.search.AdGroupSearchQuery
import com.github.akraskovski.trade.desk.stub.web.response.adgroup.AdGroupResponse
import com.github.akraskovski.trade.desk.stub.web.response.search.PageResponse
import com.github.akraskovski.trade.desk.stub.web.service.SearchService
import com.github.akraskovski.trade.desk.stub.web.service.toResponse
import com.github.dozermapper.core.Mapper
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

/**
 * @see /thetradedesk-api/doc/api/post-adgroup.html
 */
@RestController
@RequestMapping("/adgroup")
class AdGroupController(
    private val adGroupRepository: AdGroupRepository,
    private val searchService: SearchService,
    private val mapper: Mapper
) {

    /**
     * Create request.
     */
    @PostMapping
    fun create(@RequestBody @Valid adGroupForm: AdGroupCreateForm): ResponseEntity<AdGroupResponse> =
        mapper.map(adGroupForm)
            .let(adGroupRepository::save)
            .let(mapper::map)
            .let(::ok)

    /**
     * Update request.
     */
    @PutMapping
    fun update(@RequestBody @Valid adGroupForm: AdGroupUpdateForm): ResponseEntity<AdGroupResponse> =
        mapper.map(adGroupForm)
            .let(adGroupRepository::save)
            .let(mapper::map)
            .let(::ok)

    /**
     * Search the adGroups for a given campaign with predefined criteria.
     */
    @PostMapping("/query/campaign")
    fun search(@RequestBody @Valid searchQuery: AdGroupSearchQuery): ResponseEntity<PageResponse<AdGroupResponse>>? =
        searchService.searchByParent(searchQuery, adGroupRepository)
            .toResponse(mapper::map)
            .let(::ok)
}