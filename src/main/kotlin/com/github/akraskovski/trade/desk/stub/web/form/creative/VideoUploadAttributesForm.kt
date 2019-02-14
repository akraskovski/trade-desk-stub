package com.github.akraskovski.trade.desk.stub.web.form.creative

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * VideoUploadAttributesForm.
 */
class VideoUploadAttributesForm(
    @field:JsonProperty("VideoCreativeId") var videoCreativeId: String? = null,
    @field:JsonProperty("VideoCreativeExtension") var videoCreativeExtension: String? = null
)