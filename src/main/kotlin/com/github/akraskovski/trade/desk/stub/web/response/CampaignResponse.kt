package com.github.akraskovski.trade.desk.stub.web.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.github.akraskovski.trade.desk.stub.web.form.Money
import java.time.LocalDateTime

/**
 * POST Campaign request form.
 */
class CampaignResponse(
    @JsonProperty("CampaignId")
    var id: String? = null,

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

