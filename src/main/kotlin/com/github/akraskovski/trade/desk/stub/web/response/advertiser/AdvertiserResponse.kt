package com.github.akraskovski.trade.desk.stub.web.response.advertiser

import com.fasterxml.jackson.annotation.JsonProperty
import com.github.akraskovski.trade.desk.stub.domain.model.Availability

/**
 * Advertiser response model.
 */
class AdvertiserResponse(
    @field:JsonProperty("AdvertiserId") var id: String? = null,
    @field:JsonProperty("PartnerId") var partnerId: String? = null,
    @field:JsonProperty("AdvertiserName") var name: String? = null,
    @field:JsonProperty("Description") var description: String? = null,
    @field:JsonProperty("IndustryCategoryId") var industryCategoryId: Long? = null,
    @field:JsonProperty("AttributionClickLookbackWindowInSeconds") var attributionClickLookbackWindowInSeconds: Int? = null,
    @field:JsonProperty("AttributionImpressionLookbackWindowInSeconds") var attributionImpressionLookbackWindowInSeconds: Int? = null,
    @field:JsonProperty("ClickDedupWindowInSeconds") var clickDedupWindowInSeconds: Int? = null,
    @field:JsonProperty("ConversionDedupWindowInSeconds") var conversionDedupWindowInSeconds: Int? = null,
    @field:JsonProperty("LogoURL") var logoURL: String? = null,
    @field:JsonProperty("DomainAddress") var domainAddress: String? = null,
    @field:JsonProperty("Keywords") var keywords: List<String>? = null,
    @field:JsonProperty("Availability") var availability: Availability? = null
)