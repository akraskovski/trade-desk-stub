package com.github.akraskovski.trade.desk.stub.web.form.adgroup

import com.fasterxml.jackson.annotation.JsonProperty
import com.github.akraskovski.trade.desk.stub.domain.model.Availability
import javax.validation.constraints.NotBlank

/**
 * AdGroupUpdateForm.
 */
class AdGroupUpdateForm(
    @field:JsonProperty("AdGroupId") @field:NotBlank var id: String,

    @field:JsonProperty("CampaignId") @field:NotBlank var campaignId: String? = null,

    @field:JsonProperty("AdGroupName") var name: String? = null,

    @field:JsonProperty("Description") var description: String? = null,

    @field:JsonProperty("IsEnabled") var isEnabled: Boolean? = null,

    @field:JsonProperty("IndustryCategoryId") var industryCategoryId: Long? = null,

    @field:JsonProperty("RTBAttributes") var rtbAttributes: AdGroupRTBAttributesForm? = null,

    @field:JsonProperty("Availability") var availability: Availability? = null
)