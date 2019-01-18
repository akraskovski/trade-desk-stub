package com.github.akraskovski.trade.desk.stub.web.response.adgroup

import com.fasterxml.jackson.annotation.JsonProperty
import com.github.akraskovski.trade.desk.stub.web.form.MoneyForm

/**
 * AdGroupRTBAttributesResponse.
 */
class AdGroupRTBAttributesResponse(
    @field:JsonProperty("BudgetSettings") var budgetSettings: AdGroupBudgetSettingsResponse? = null,

    @field:JsonProperty("BaseBidCPM") var baseBidCPM: MoneyForm? = null,

    @field:JsonProperty("MaxBidCPM") var maxBidCPM: MoneyForm? = null,

    @field:JsonProperty("CreativeIds") var creativeIds: List<String>? = null,

    @field:JsonProperty("GeoSegmentAdjustments") var geoSegmentAdjustments: List<BidAdjustmentResponse<String>>? = null,

    @field:JsonProperty("OSFamilyAndVersionAdjustments") var osFamilyAndVersionAdjustments: OSAdjustmentsResponse? = null,

    @field:JsonProperty("DeviceTypeAdjustments") var deviceTypeAdjustments: BidAdjustmentsResponse<String>? = null,

    @field:JsonProperty("LanguageTargeting") var languageTargeting: AdGroupLanguageTargetingResponse? = null
)