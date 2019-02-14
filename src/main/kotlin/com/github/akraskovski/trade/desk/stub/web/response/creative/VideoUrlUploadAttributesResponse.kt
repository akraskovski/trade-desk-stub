`package com.github.akraskovski.trade.desk.stub.web.response.creative

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * VideoUrlUploadAttributesResponse.
 */
class VideoUrlUploadAttributesResponse(
    @field:JsonProperty("VideoUploadUrl") var videoUploadUrl: String? = null,
    @field:JsonProperty("VideoContentType") var videoContentType: String? = null,
    @field:JsonProperty("VideoUploadAttributes") var videoUploadAttributes: VideoUploadAttributesResponse? = null
)