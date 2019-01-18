package com.github.akraskovski.trade.desk.stub.web.response.adgroup

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * AdGroupResponse.
 */
class AdGroupResponse(
    @field:JsonProperty("CampaignId") var campaignId: String? = null,

    @field:JsonProperty("AdGroupName") var name: String? = null,

    @field:JsonProperty("Description") var description: String? = null,

    @field:JsonProperty("IsEnabled") var isEnabled: Boolean? = null,

    @field:JsonProperty("IndustryCategoryId") var industryCategoryId: Long? = null,

    @field:JsonProperty("RTBAttributes") var rtbAttributes: AdGroupRTBAttributesResponse? = null,

    @field:JsonProperty("Availability") var availability: String? = null
)