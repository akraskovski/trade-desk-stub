package com.github.akraskovski.trade.desk.stub.web.response.creative

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * VideoUploadAttributesResponse.
 */
class VideoUploadAttributesResponse(
    @field:JsonProperty("VideoCreativeId") var videoCreativeId: String? = null,
    @field:JsonProperty("VideoCreativeExtension") var videoCreativeExtension: String? = null
)