package com.github.akraskovski.trade.desk.stub.web.converter

import com.github.akraskovski.trade.desk.stub.domain.model.advertiser.Advertiser
import com.github.akraskovski.trade.desk.stub.web.response.advertiser.AdvertiserResponse

/**
 * Converts domain advertiser model to the response object.
 */
fun Advertiser.toResponse(): AdvertiserResponse = AdvertiserResponse(
    id,
    partnerId,
    name,
    description,
    industryCategoryId,
    attributionClickLookbackWindowInSeconds,
    attributionImpressionLookbackWindowInSeconds,
    clickDedupWindowInSeconds,
    conversionDedupWindowInSeconds,
    logoURL,
    domainAddress,
    keywords,
    availability
)