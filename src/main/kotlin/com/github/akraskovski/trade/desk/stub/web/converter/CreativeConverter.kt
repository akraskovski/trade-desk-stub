package com.github.akraskovski.trade.desk.stub.web.converter

import com.github.akraskovski.trade.desk.stub.domain.model.Availability
import com.github.akraskovski.trade.desk.stub.domain.model.creative.ImageCreative
import com.github.akraskovski.trade.desk.stub.web.form.creative.CreativeForm
import com.github.akraskovski.trade.desk.stub.web.response.creative.CreativeResponse
import com.github.akraskovski.trade.desk.stub.web.response.creative.ImageAttributesResponse
import java.util.*

/**
 * Converts from the request form to the domain object.
 */
fun CreativeForm.toImageCreative(): ImageCreative =
    ImageCreative(
        id = UUID.randomUUID().toString(),
        advertiserId = advertiserId,
        name = name,
        description = description,
        availability = availability ?: Availability.Available,
        imageContent = imageAttributes?.imageContent,
        adTechnologyIds = imageAttributes?.adTechnologyIds,
        rightMediaOfferTypeId = imageAttributes?.rightMediaOfferTypeId,
        landingPageUrl = imageAttributes?.landingPageUrl,
        clickthroughUrl = imageAttributes?.clickthroughUrl,
        thirdPartyTrackingTags = imageAttributes?.thirdPartyTrackingTags,
        thirdPartyImpressionTrackingUrl = imageAttributes?.thirdPartyImpressionTrackingUrl,
        thirdPartyImpressionTrackingUrl2 = imageAttributes?.thirdPartyImpressionTrackingUrl2,
        thirdPartyImpressionTrackingUrl3 = imageAttributes?.thirdPartyImpressionTrackingUrl3,
        isSecurable = imageAttributes?.isSecurable,
        adServerName = imageAttributes?.adServerName,
        adServerCreativeId = imageAttributes?.adServerCreativeId
    )

/**
 * Converts from the domain object to the response object.
 */
fun ImageCreative.toResponse(): CreativeResponse =
    CreativeResponse(
        id = id,
        advertiserId = advertiserId,
        name = name,
        description = description,
        availability = availability,
        imageAttributes = ImageAttributesResponse(
            imageContent = imageContent,
            adTechnologyIds = adTechnologyIds,
            rightMediaOfferTypeId = rightMediaOfferTypeId,
            width = width,
            height = height,
            imageUrl = imageUrl,
            landingPageUrl = landingPageUrl,
            clickthroughUrl = clickthroughUrl,
            thirdPartyTrackingTags = thirdPartyTrackingTags,
            thirdPartyImpressionTrackingUrl = thirdPartyImpressionTrackingUrl,
            thirdPartyImpressionTrackingUrl2 = thirdPartyImpressionTrackingUrl2,
            thirdPartyImpressionTrackingUrl3 = thirdPartyImpressionTrackingUrl3,
            isSecurable = isSecurable,
            adServerName = adServerName,
            adServerCreativeId = adServerCreativeId
        )
    )