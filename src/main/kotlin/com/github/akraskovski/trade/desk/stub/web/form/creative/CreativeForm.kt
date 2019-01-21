package com.github.akraskovski.trade.desk.stub.web.form.creative

import com.fasterxml.jackson.annotation.JsonProperty
import com.github.akraskovski.trade.desk.stub.domain.model.Availability

/**
 * ImageAttributesForm.
 */
class CreativeForm(
    @field:JsonProperty("AdvertiserId") var advertiserId: String? = null,
    @field:JsonProperty("CreativeName") var name: String? = null,
    @field:JsonProperty("Description") var description: String? = null,
    @field:JsonProperty("Availability") var availability: Availability? = null,
    @field:JsonProperty("ImageAttributes") var imageAttributes: ImageAttributesForm? = null
)