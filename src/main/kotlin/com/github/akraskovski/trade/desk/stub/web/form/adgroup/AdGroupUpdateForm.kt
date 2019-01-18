package com.github.akraskovski.trade.desk.stub.web.form.adgroup

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * AdGroupUpdateForm.
 */
class AdGroupUpdateForm(
    @field:JsonProperty("AdGroupId") var id: String,

    @field:JsonProperty("CampaignId") var campaignId: String? = null,

    @field:JsonProperty("AdGroupName") var name: String? = null,

    @field:JsonProperty("Description") var description: String? = null,

    @field:JsonProperty("IsEnabled") var isEnabled: Boolean? = null,

    @field:JsonProperty("IndustryCategoryId") var industryCategoryId: Long? = null,

    @field:JsonProperty("RTBAttributes") var rtbAttributes: AdGroupRTBAttributesForm? = null,

    @field:JsonProperty("Availability") var availability: String? = null
)