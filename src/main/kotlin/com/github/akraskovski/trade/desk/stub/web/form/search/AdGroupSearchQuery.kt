package com.github.akraskovski.trade.desk.stub.web.form.search

import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.NotBlank

/**
 * AdGroup search criteria query object.
 */
class AdGroupSearchQuery : SearchQuery() {

    @JsonProperty("CampaignId")
    @NotBlank
    lateinit var campaignId: String

    override fun getParentId(): String = campaignId
}