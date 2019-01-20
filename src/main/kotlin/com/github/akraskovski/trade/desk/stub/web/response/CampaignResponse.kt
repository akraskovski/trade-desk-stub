package com.github.akraskovski.trade.desk.stub.web.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.github.akraskovski.trade.desk.stub.domain.model.Availability
import java.util.*

/**
 * Campaign response model.
 */
class CampaignResponse(
    @field:JsonProperty("CampaignId") var id: String? = null,

    @field:JsonProperty("AdvertiserId") var advertiserId: String? = null,

    @field:JsonProperty("CampaignName") var name: String? = null,

    @field:JsonProperty("Description") var description: String? = null,

    @field:JsonProperty("Budget") var budget: MoneyResponse? = null,

    @field:JsonProperty("BudgetInImpressions") var budgetInImpressions: Int? = null,

    @field:JsonProperty("DailyBudget") var dailyBudget: MoneyResponse? = null,

    @field:JsonProperty("DailyBudgetInImpressions") var dailyBudgetInImpressions: Int? = null,

    @field:JsonProperty("StartDate") var startDate: Date? = null,

    @field:JsonProperty("EndDate") var endDate: Date? = null,

    @field:JsonProperty("Availability") var availability: Availability? = null,

    @field:JsonProperty("PacingMode") var pacingMode: String? = null
)

