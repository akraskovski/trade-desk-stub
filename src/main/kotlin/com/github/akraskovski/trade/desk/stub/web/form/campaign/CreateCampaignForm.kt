package com.github.akraskovski.trade.desk.stub.web.form.campaign

import com.fasterxml.jackson.annotation.JsonProperty
import com.github.akraskovski.trade.desk.stub.web.form.MoneyForm
import java.util.*
import javax.validation.constraints.NotEmpty

/**
 * POST Campaign request form.
 */
class CreateCampaignForm(
    @field:JsonProperty("AdvertiserId") var advertiserId: String? = null,

    @field:JsonProperty("CampaignName") @field:NotEmpty var name: String? = null,

    @field:JsonProperty("Description") var description: String? = null,

    @field:JsonProperty("Budget") var budget: MoneyForm? = null,

    @field:JsonProperty("BudgetInImpressions") var budgetInImpressions: Int? = null,

    @field:JsonProperty("DailyBudget") var dailyBudget: MoneyForm? = null,

    @field:JsonProperty("DailyBudgetInImpressions") var dailyBudgetInImpressions: Int? = null,

    @field:JsonProperty("StartDate") var startDate: Date? = null,

    @field:JsonProperty("EndDate") var endDate: Date? = null,

    @field:JsonProperty("Availability") var availability: String? = null,

    @field:JsonProperty("PacingMode") var pacingMode: String? = null
)

