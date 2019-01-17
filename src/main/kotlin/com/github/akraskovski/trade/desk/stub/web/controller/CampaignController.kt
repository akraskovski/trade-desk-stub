package com.github.akraskovski.trade.desk.stub.web.controller

import com.github.akraskovski.trade.desk.stub.generator.CampaignGenerator
import com.github.akraskovski.trade.desk.stub.web.form.CreateCampaignForm
import com.github.akraskovski.trade.desk.stub.web.form.UpdateCampaignForm
import com.github.akraskovski.trade.desk.stub.web.response.CampaignResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

/**
 * @see /thetradedesk-api/doc/api/post-campaign.html
 */
@RestController
@RequestMapping("/campaign")
class CampaignController(private val campaignGenerator: CampaignGenerator) {

    @PostMapping
    fun create(@RequestBody @Valid campaignForm: CreateCampaignForm): ResponseEntity<CampaignResponse> =
        ResponseEntity.ok(campaignGenerator.generateCreateResponse(campaignForm))

    @PutMapping
    fun update(@RequestBody @Valid campaignForm: UpdateCampaignForm): ResponseEntity<CampaignResponse> =
        ResponseEntity.ok(campaignGenerator.generateCreateResponse(campaignForm))
}