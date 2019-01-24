package com.github.akraskovski.trade.desk.stub.web.converter

import com.github.akraskovski.trade.desk.stub.domain.model.Availability
import com.github.akraskovski.trade.desk.stub.domain.model.campaign.Campaign
import com.github.akraskovski.trade.desk.stub.web.form.campaign.CreateCampaignForm
import com.github.akraskovski.trade.desk.stub.web.form.campaign.UpdateCampaignForm
import com.github.akraskovski.trade.desk.stub.web.response.CampaignResponse
import com.github.dozermapper.core.Mapper
import java.util.*

/**
 * Extension map function from request form to the domain objects.
 */
fun Mapper.map(createCampaignForm: CreateCampaignForm): Campaign = map(createCampaignForm, Campaign::class.java)
    .apply {
        id = UUID.randomUUID().toString()
        availability = availability ?: Availability.Available
    }

/**
 * Extension map function from request form to the domain objects.
 */
fun Mapper.map(updateCampaignForm: UpdateCampaignForm): Campaign = map(updateCampaignForm, Campaign::class.java)
    .apply { availability = availability ?: Availability.Available }

/**
 * Extension map function from domain to the response objects.
 */
fun Mapper.map(campaign: Campaign): CampaignResponse = map(campaign, CampaignResponse::class.java)