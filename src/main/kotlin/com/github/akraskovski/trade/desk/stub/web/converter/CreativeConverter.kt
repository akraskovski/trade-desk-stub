package com.github.akraskovski.trade.desk.stub.web.converter

import com.github.akraskovski.trade.desk.stub.domain.model.Availability
import com.github.akraskovski.trade.desk.stub.domain.model.creative.ImageCreative
import com.github.akraskovski.trade.desk.stub.domain.model.creative.VideoCreative
import com.github.akraskovski.trade.desk.stub.web.form.creative.CreativeForm
import com.github.akraskovski.trade.desk.stub.web.response.creative.CreativeResponse
import com.github.dozermapper.core.Mapper
import java.util.*

/**
 * Extension map function from request form to the domain objects.
 */
fun Mapper.mapToImage(creativeForm: CreativeForm): ImageCreative = map(creativeForm, ImageCreative::class.java)
    .apply {
        id = UUID.randomUUID().toString()
        availability = availability ?: Availability.Available
    }

/**
 * Extension map function from request form to the domain objects.
 */
fun Mapper.mapToVideo(creativeForm: CreativeForm): VideoCreative = map(creativeForm, VideoCreative::class.java)
    .apply {
        id = UUID.randomUUID().toString()
        availability = availability ?: Availability.Available
    }

/**
 * Extension map function from domain to the response objects.
 */
fun Mapper.map(imageCreative: ImageCreative): CreativeResponse = map(imageCreative, CreativeResponse::class.java)

/**
 * Extension map function from domain to the response objects.
 */
fun Mapper.map(videoCreative: VideoCreative): CreativeResponse = map(videoCreative, CreativeResponse::class.java)