package com.github.akraskovski.trade.desk.stub.web.controller

import com.github.akraskovski.trade.desk.stub.domain.model.adgroup.AdGroup
import com.github.akraskovski.trade.desk.stub.domain.repository.AdGroupRepository
import com.github.akraskovski.trade.desk.stub.web.converter.toDomain
import com.github.akraskovski.trade.desk.stub.web.converter.toResponse
import com.github.akraskovski.trade.desk.stub.web.form.adgroup.AdGroupCreateForm
import com.github.akraskovski.trade.desk.stub.web.form.adgroup.AdGroupUpdateForm
import com.github.akraskovski.trade.desk.stub.web.form.search.AdGroupSearchQuery
import com.github.akraskovski.trade.desk.stub.web.form.search.SearchService
import com.github.akraskovski.trade.desk.stub.web.form.search.toResponse
import com.github.akraskovski.trade.desk.stub.web.response.adgroup.AdGroupResponse
import com.github.akraskovski.trade.desk.stub.web.response.search.PageResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

/**
 * @see /thetradedesk-api/doc/api/post-adgroup.html
 */
@RestController
@RequestMapping("/adgroup")
class AdGroupController(
    private val adGroupRepository: AdGroupRepository,
    private val searchService: SearchService
) {

    @PostMapping
    fun create(@RequestBody @Valid adGroupForm: AdGroupCreateForm): ResponseEntity<AdGroupResponse> =
        ResponseEntity.ok(adGroupRepository.save(adGroupForm.toDomain()).toResponse())

    @PutMapping
    fun update(@RequestBody @Valid adGroupForm: AdGroupUpdateForm): ResponseEntity<AdGroupResponse> =
        ResponseEntity.ok(adGroupRepository.save(adGroupForm.toDomain()).toResponse())

    /**
     * Search the adGroups for a given campaign with predefined criteria.
     */
    @PostMapping("/query/campaign")
    fun search(@RequestBody @Valid searchQuery: AdGroupSearchQuery): ResponseEntity<PageResponse<AdGroupResponse>>? =
        ResponseEntity
            .ok(searchService
                .searchByParent(searchQuery, adGroupRepository)
                .toResponse(AdGroup::toResponse)
            )
}