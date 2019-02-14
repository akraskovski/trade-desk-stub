package com.github.akraskovski.trade.desk.stub.web.form.search

import com.fasterxml.jackson.annotation.JsonProperty
import com.github.akraskovski.trade.desk.stub.domain.model.Availability

/**
 * Basic query object for the search operations.
 */
abstract class SearchQuery {

    //not supported right now, but it's really not needed.
    @JsonProperty("SearchTerms")
    var searchTerms: List<String>? = emptyList()

    @JsonProperty("Availabilities")
    var availabilities: Set<Availability> = setOf(Availability.Available)

    @JsonProperty("PageStartIndex")
    var pageStartIndex: Int = 0

    @JsonProperty("PageSize")
    var pageSize: Int? = null

    /**
     * Need to be implemented in child entities for each up-hierarchical entity id.
     */
    abstract fun getParentId(): String
}