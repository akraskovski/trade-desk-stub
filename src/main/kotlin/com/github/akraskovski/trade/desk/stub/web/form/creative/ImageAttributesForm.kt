package com.github.akraskovski.trade.desk.stub.web.form.creative

import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.NotBlank

/**
 * ImageAttributesForm.
 */
class ImageAttributesForm(
    @field:JsonProperty("ImageContent") @field:NotBlank var imageContent: String? = null,
    @field:JsonProperty("AdTechnologyIds") var adTechnologyIds: List<String>? = mutableListOf(),
    @field:JsonProperty("RightMediaOfferTypeId") var rightMediaOfferTypeId: Long? = null,
    @field:JsonProperty("LandingPageUrl") var landingPageUrl: String? = null,
    @field:JsonProperty("ClickthroughUrl") var clickthroughUrl: String? = null,
    @field:JsonProperty("ThirdPartyTrackingTags") var thirdPartyTrackingTags: List<String>? = mutableListOf(),
    @field:JsonProperty("ThirdPartyImpressionTrackingUrl") var thirdPartyImpressionTrackingUrl: String? = null,
    @field:JsonProperty("ThirdPartyImpressionTrackingUrl2") var thirdPartyImpressionTrackingUrl2: String? = null,
    @field:JsonProperty("ThirdPartyImpressionTrackingUrl3") var thirdPartyImpressionTrackingUrl3: String? = null,
    @field:JsonProperty("IsSecurable") var isSecurable: Boolean? = null,
    @field:JsonProperty("AdServerName") var adServerName: String? = null,
    @field:JsonProperty("AdServerCreativeId") var adServerCreativeId: String? = null
)