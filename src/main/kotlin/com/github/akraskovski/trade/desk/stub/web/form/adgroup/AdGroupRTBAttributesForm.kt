package com.github.akraskovski.trade.desk.stub.web.form.adgroup

import com.fasterxml.jackson.annotation.JsonProperty
import com.github.akraskovski.trade.desk.stub.web.form.MoneyForm

/**
 * AdGroupRTBAttributesForm.
 */
class AdGroupRTBAttributesForm(
    @field:JsonProperty("BudgetSettings") var budgetSettings: AdGroupBudgetSettingsForm? = null,

    @field:JsonProperty("BaseBidCPM") var baseBidCPM: MoneyForm? = null,

    @field:JsonProperty("MaxBidCPM") var maxBidCPM: MoneyForm? = null,

    @field:JsonProperty("CreativeIds") var creativeIds: List<String>? = null,

    @field:JsonProperty("GeoSegmentAdjustments") var geoSegmentAdjustments: List<BidAdjustmentForm<String>>? = null,

    @field:JsonProperty("OSFamilyAndVersionAdjustments") var osFamilyAndVersionAdjustments: OSAdjustmentsForm? = null,

    @field:JsonProperty("DeviceTypeAdjustments") var deviceTypeAdjustments: BidAdjustmentsForm<String>? = null,

    @field:JsonProperty("LanguageTargeting") var languageTargeting: AdGroupLanguageTargetingForm? = null
)