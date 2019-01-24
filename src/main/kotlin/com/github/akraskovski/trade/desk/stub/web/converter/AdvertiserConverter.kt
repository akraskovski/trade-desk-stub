package com.github.akraskovski.trade.desk.stub.web.converter

import com.github.akraskovski.trade.desk.stub.domain.model.advertiser.Advertiser
import com.github.akraskovski.trade.desk.stub.web.response.advertiser.AdvertiserResponse
import com.github.dozermapper.core.Mapper

/**
 * Extension map function from domain to the response objects.
 */
fun Mapper.map(advertiser: Advertiser): AdvertiserResponse = map(advertiser, AdvertiserResponse::class.java)