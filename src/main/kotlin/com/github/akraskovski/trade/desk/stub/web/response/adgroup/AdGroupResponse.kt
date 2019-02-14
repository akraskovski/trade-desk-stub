package com.github.akraskovski.trade.desk.stub.web.response.adgroup

import com.fasterxml.jackson.annotation.JsonProperty
import com.github.akraskovski.trade.desk.stub.domain.model.Availability

/**
 * AdGroupResponse.
 */
class AdGroupResponse(
    @field:JsonProperty("AdGroupId") var id: String? = null,

    @field:JsonProperty("CampaignId") var campaignId: String? = null,

    @field:JsonProperty("AdGroupName") var name: String? = null,

    @field:JsonProperty("Description") var description: String? = null,

    @field:JsonProperty("IsEnabled") var isEnabled: Boolean? = null,

    @field:JsonProperty("IndustryCategoryId") var industryCategoryId: Long? = null,

    @field:JsonProperty("RTBAttributes") var rtbAttributes: AdGroupRTBAttributesResponse? = null,

    @field:JsonProperty("Availability") var availability: Availability? = null
)