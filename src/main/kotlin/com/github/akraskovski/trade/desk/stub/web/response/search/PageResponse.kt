package com.github.akraskovski.trade.desk.stub.web.response.search

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * The search results wrapper dto.
 */
class PageResponse<T>(
    @field:JsonProperty("Result") val result: List<T>,

    @field:JsonProperty("ResultCount") val resultCount: Long,

    @field:JsonProperty("TotalFilteredCount") val totalFilteredCount: Long? = null,

    @field:JsonProperty("TotalUnfilteredCount") val totalUnfilteredCount: Long? = null
)