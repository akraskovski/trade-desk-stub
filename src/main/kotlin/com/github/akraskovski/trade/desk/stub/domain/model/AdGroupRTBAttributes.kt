package com.github.akraskovski.trade.desk.stub.domain.model

/**
 * AdGroupRTBAttributes.
 */
class AdGroupRTBAttributes(
    var budgetSettings: AdGroupBudgetSettings? = null,
    var baseBidCPM: Money? = null,
    var maxBidCPM: Money? = null,
    var creativeIds: List<String>? = null,
    var geoSegmentAdjustments: List<BidAdjustment<String>>? = null,
    var osFamilyAndVersionAdjustments: OSAdjustments? = null,
    var deviceTypeAdjustments: BidAdjustments<String>? = null,
    var languageTargeting: AdGroupLanguageTargeting? = null
)