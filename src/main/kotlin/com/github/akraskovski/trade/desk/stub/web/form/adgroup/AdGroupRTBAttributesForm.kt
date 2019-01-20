package com.github.akraskovski.trade.desk.stub.web.form.adgroup

import com.fasterxml.jackson.annotation.JsonProperty
import com.github.akraskovski.trade.desk.stub.web.form.MoneyForm
import javax.validation.constraints.NotNull

/**
 * AdGroupRTBAttributesForm.
 */
class AdGroupRTBAttributesForm(
    @field:JsonProperty("BudgetSettings") @field:NotNull var budgetSettings: AdGroupBudgetSettingsForm? = null,

    @field:JsonProperty("BaseBidCPM") @field:NotNull var baseBidCPM: MoneyForm? = null,

    @field:JsonProperty("MaxBidCPM") @field:NotNull var maxBidCPM: MoneyForm? = null,

    @field:JsonProperty("CreativeIds") var creativeIds: List<String>? = null,

    @field:JsonProperty("GeoSegmentAdjustments") var geoSegmentAdjustments: List<BidAdjustmentForm<String>>? = null,

    @field:JsonProperty("OSFamilyAndVersionAdjustments") var osFamilyAndVersionAdjustments: OSAdjustmentsForm? = null,

    @field:JsonProperty("DeviceTypeAdjustments") var deviceTypeAdjustments: BidAdjustmentsForm<String>? = null,

    @field:JsonProperty("LanguageTargeting") var languageTargeting: AdGroupLanguageTargetingForm? = null
)