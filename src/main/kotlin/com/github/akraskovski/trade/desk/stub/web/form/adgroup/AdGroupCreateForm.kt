package com.github.akraskovski.trade.desk.stub.web.form.adgroup

import com.fasterxml.jackson.annotation.JsonProperty
import com.github.akraskovski.trade.desk.stub.domain.model.Availability
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

/**
 * AdGroupCreateForm.
 */
class AdGroupCreateForm(
    @field:JsonProperty("CampaignId") @field:NotBlank var campaignId: String? = null,

    @field:JsonProperty("AdGroupName") @field:NotBlank var name: String? = null,

    @field:JsonProperty("Description") var description: String? = null,

    @field:JsonProperty("IsEnabled") var isEnabled: Boolean? = null,

    @field:JsonProperty("IndustryCategoryId") @field:NotNull var industryCategoryId: Long? = null,

    @field:JsonProperty("RTBAttributes") @field:NotNull var rtbAttributes: AdGroupRTBAttributesForm? = null,

    @field:JsonProperty("Availability") var availability: Availability? = null
)