package com.github.akraskovski.trade.desk.stub.web.response.creative

import com.fasterxml.jackson.annotation.JsonProperty
import com.github.akraskovski.trade.desk.stub.domain.model.Availability

/**
 * CreativeResponse.
 */
class CreativeResponse(
    @field:JsonProperty("CreativeId") val id: String,
    @field:JsonProperty("AdvertiserId") var advertiserId: String? = null,
    @field:JsonProperty("CreativeName") var name: String? = null,
    @field:JsonProperty("Description") var description: String? = null,
    @field:JsonProperty("Availability") var availability: Availability? = null,
    @field:JsonProperty("ImageAttributes") var imageAttributes: ImageAttributesResponse? = null
)