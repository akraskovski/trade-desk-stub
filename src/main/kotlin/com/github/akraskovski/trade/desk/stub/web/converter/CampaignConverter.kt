package com.github.akraskovski.trade.desk.stub.web.converter

import com.github.akraskovski.trade.desk.stub.domain.model.campaign.Campaign
import com.github.akraskovski.trade.desk.stub.web.form.campaign.CreateCampaignForm
import com.github.akraskovski.trade.desk.stub.web.form.campaign.UpdateCampaignForm
import com.github.akraskovski.trade.desk.stub.web.response.CampaignResponse
import java.util.*

/**
 * Converts from the create form to the domain object.
 */
fun CreateCampaignForm.toDomain(): Campaign = Campaign(
    id = UUID.randomUUID().toString(),
    advertiserId = advertiserId,
    name = name,
    description = description,
    budget = budget?.toDomain(),
    budgetInImpressions = budgetInImpressions,
    dailyBudget = dailyBudget?.toDomain(),
    dailyBudgetInImpressions = dailyBudgetInImpressions,
    startDate = startDate?.toLocalDateTime(),
    endDate = endDate?.toLocalDateTime(),
    availability = availability,
    pacingMode = pacingMode
)

/**
 * Converts from the update form to the domain object.
 */
fun UpdateCampaignForm.toDomain(): Campaign = Campaign(
    id = id,
    advertiserId = advertiserId,
    name = name,
    description = description,
    budget = budget?.toDomain(),
    budgetInImpressions = budgetInImpressions,
    dailyBudget = dailyBudget?.toDomain(),
    dailyBudgetInImpressions = dailyBudgetInImpressions,
    startDate = startDate?.toLocalDateTime(),
    endDate = endDate?.toLocalDateTime(),
    availability = availability,
    pacingMode = pacingMode
)

/**
 * Converts from the domain object to the response object.
 */
fun Campaign.toResponse(): CampaignResponse = CampaignResponse(
    id = id,
    advertiserId = advertiserId,
    name = name,
    description = description,
    budget = budget?.toResponse(),
    budgetInImpressions = budgetInImpressions,
    dailyBudget = dailyBudget?.toResponse(),
    dailyBudgetInImpressions = dailyBudgetInImpressions,
    startDate = startDate?.toDate(),
    endDate = endDate?.toDate(),
    availability = availability,
    pacingMode = pacingMode
)