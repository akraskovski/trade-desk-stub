package com.github.akraskovski.trade.desk.stub.web.form.search

import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.NotBlank

/**
 * Creative search criteria query object.
 */
class CreativeSearchQuery : SearchQuery() {

    @JsonProperty("AdvertiserId")
    @NotBlank
    lateinit var advertiserId: String

    override fun getParentId(): String = advertiserId
}