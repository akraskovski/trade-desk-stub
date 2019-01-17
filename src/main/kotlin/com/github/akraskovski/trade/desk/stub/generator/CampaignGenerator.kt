package com.github.akraskovski.trade.desk.stub.generator

import com.github.akraskovski.trade.desk.stub.web.form.CreateCampaignForm
import com.github.akraskovski.trade.desk.stub.web.form.UpdateCampaignForm
import com.github.akraskovski.trade.desk.stub.web.response.CampaignResponse
import org.springframework.stereotype.Service
import java.util.*

@Service
class CampaignGenerator {

    private companion object {
        private val random = Random()
    }

    fun generateCreateResponse(campaignForm: CreateCampaignForm): CampaignResponse = CampaignResponse(
        id = random.nextInt(10).toString(),
        advertiserId = random.nextInt(10).toString(),
        name = campaignForm.name,
        description = campaignForm.description,
        budget = campaignForm.budget,
        budgetInImpressions = campaignForm.budgetInImpressions,
        dailyBudget = campaignForm.dailyBudget,
        dailyBudgetInImpressions = campaignForm.dailyBudgetInImpressions,
        startDate = campaignForm.startDate,
        endDate = campaignForm.endDate,
        availability = campaignForm.availability,
        pacingMode = campaignForm.pacingMode
    )

    fun generateCreateResponse(campaignForm: UpdateCampaignForm): CampaignResponse = CampaignResponse(
        id = random.nextInt(10).toString(),
        advertiserId = random.nextInt(10).toString(),
        name = campaignForm.name,
        description = campaignForm.description,
        budget = campaignForm.budget,
        budgetInImpressions = campaignForm.budgetInImpressions,
        dailyBudget = campaignForm.dailyBudget,
        dailyBudgetInImpressions = campaignForm.dailyBudgetInImpressions,
        startDate = campaignForm.startDate,
        endDate = campaignForm.endDate,
        availability = campaignForm.availability,
        pacingMode = campaignForm.pacingMode
    )
}