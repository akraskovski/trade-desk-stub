package com.github.akraskovski.trade.desk.stub.web.form

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime

/**
 * POST Campaign request form.
 */
class CreateCampaignForm(
    @JsonProperty("AdvertiserId")
    var advertiserId: String? = null,

    @JsonProperty("CampaignName")
    var name: String? = null,

    @JsonProperty("Description")
    var description: String? = null,

    @JsonProperty("Budget")
    var budget: Money? = null,

    @JsonProperty("BudgetInImpressions")
    var budgetInImpressions: Int? = null,

    @JsonProperty("DailyBudget")
    var dailyBudget: Money? = null,

    @JsonProperty("DailyBudgetInImpressions")
    var dailyBudgetInImpressions: Int? = null,

    @JsonProperty("StartDate")
    var startDate: LocalDateTime? = null,

    @JsonProperty("EndDate")
    var endDate: LocalDateTime? = null,

    @JsonProperty("Availability")
    var availability: String? = null,

    @JsonProperty("PacingMode")
    var pacingMode: String? = null
)

