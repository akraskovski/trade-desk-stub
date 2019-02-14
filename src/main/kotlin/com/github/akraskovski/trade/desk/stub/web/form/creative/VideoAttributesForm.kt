package com.github.akraskovski.trade.desk.stub.web.form.creative

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * ImageAttributesForm.
 */
class VideoAttributesForm(
    @field:JsonProperty("VideoContent") var videoContent: String? = null,
    @field:JsonProperty("VideoUploadAttributes") var videoUploadAttributes: VideoUploadAttributesForm? = null,
    @field:JsonProperty("Skippable") var skippable: Boolean? = null,
    @field:JsonProperty("AdTechnologyIds") var adTechnologyIds: List<String>? = mutableListOf(),
    @field:JsonProperty("RightMediaOfferTypeId") var rightMediaOfferTypeId: Long? = null,
    @field:JsonProperty("LandingPageUrl") var landingPageUrl: String? = null,
    @field:JsonProperty("ClickthroughUrl") var clickthroughUrl: String? = null,
    @field:JsonProperty("IsSecurable") var isSecurable: Boolean? = null,
    @field:JsonProperty("AdServerName") var adServerName: String? = null,
    @field:JsonProperty("AdServerCreativeId") var adServerCreativeId: String? = null
)