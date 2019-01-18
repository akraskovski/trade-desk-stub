package com.github.akraskovski.trade.desk.stub.web.controller

import com.github.akraskovski.trade.desk.stub.domain.repository.CampaignRepository
import com.github.akraskovski.trade.desk.stub.web.converter.toDomain
import com.github.akraskovski.trade.desk.stub.web.converter.toResponse
import com.github.akraskovski.trade.desk.stub.web.form.campaign.CreateCampaignForm
import com.github.akraskovski.trade.desk.stub.web.form.campaign.UpdateCampaignForm
import com.github.akraskovski.trade.desk.stub.web.response.CampaignResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

/**
 * @see /thetradedesk-api/doc/api/campaign.html
 */
@RestController
@RequestMapping("/campaign")
class CampaignController(private val campaignRepository: CampaignRepository) {

    /**
     * Create request.
     */
    @PostMapping
    fun create(@RequestBody @Valid campaignForm: CreateCampaignForm): ResponseEntity<CampaignResponse> =
        ResponseEntity.ok(campaignRepository.save(campaignForm.toDomain()).toResponse())

    /**
     * Update request.
     */
    @PutMapping
    fun update(@RequestBody @Valid campaignForm: UpdateCampaignForm): ResponseEntity<CampaignResponse> =
        ResponseEntity.ok(campaignRepository.save(campaignForm.toDomain()).toResponse())
}