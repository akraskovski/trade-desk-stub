package com.github.akraskovski.trade.desk.stub.web.controller

import com.github.akraskovski.trade.desk.stub.domain.repository.CampaignRepository
import com.github.akraskovski.trade.desk.stub.web.converter.map
import com.github.akraskovski.trade.desk.stub.web.form.campaign.CreateCampaignForm
import com.github.akraskovski.trade.desk.stub.web.form.campaign.UpdateCampaignForm
import com.github.akraskovski.trade.desk.stub.web.form.search.CampaignSearchQuery
import com.github.akraskovski.trade.desk.stub.web.response.CampaignResponse
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
 * @see /thetradedesk-api/doc/api/campaign.html
 */
@RestController
@RequestMapping("/campaign")
class CampaignController(
    private val campaignRepository: CampaignRepository,
    private val searchService: SearchService,
    private val mapper: Mapper
) {

    /**
     * Create request.
     */
    @PostMapping
    fun create(@RequestBody @Valid campaignForm: CreateCampaignForm): ResponseEntity<CampaignResponse> =
        mapper.map(campaignForm)
            .let(campaignRepository::save)
            .let(mapper::map)
            .let(::ok)

    /**
     * Update request.
     */
    @PutMapping
    fun update(@RequestBody @Valid campaignForm: UpdateCampaignForm): ResponseEntity<CampaignResponse> =
        mapper.map(campaignForm)
            .let(campaignRepository::save)
            .let(mapper::map)
            .let(::ok)

    /**
     * Search the campaigns for a given advertiser with predefined criteria.
     */
    @PostMapping("/query/advertiser")
    fun search(@RequestBody @Valid searchQuery: CampaignSearchQuery): ResponseEntity<PageResponse<CampaignResponse>> =
        searchService.searchByParent(searchQuery, campaignRepository)
            .toResponse(mapper::map)
            .let(::ok)
}