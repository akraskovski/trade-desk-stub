package com.github.akraskovski.trade.desk.stub.domain.model

import com.github.akraskovski.trade.desk.stub.web.form.MoneyForm

/**
 * AdGroupRTBAttributes.
 */
class AdGroupRTBAttributes(
    var budgetSettings: AdGroupBudgetSettings? = null,
    var baseBidCPM: MoneyForm? = null,
    var maxBidCPM: MoneyForm? = null,
    var creativeIds: List<String>? = null,
    var geoSegmentAdjustments: List<BidAdjustment<String>>? = null,
    var osFamilyAndVersionAdjustments: OSAdjustments? = null,
    var deviceTypeAdjustments: BidAdjustments<String>? = null,
    var languageTargeting: AdGroupLanguageTargeting? = null
)