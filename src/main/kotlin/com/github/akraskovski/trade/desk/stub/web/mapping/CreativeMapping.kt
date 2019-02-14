package com.github.akraskovski.trade.desk.stub.web.mapping

import com.github.akraskovski.trade.desk.stub.domain.model.creative.ImageCreative
import com.github.akraskovski.trade.desk.stub.domain.model.creative.VideoCreative
import com.github.akraskovski.trade.desk.stub.web.form.creative.CreativeForm
import com.github.akraskovski.trade.desk.stub.web.response.creative.CreativeResponse
import com.github.dozermapper.core.loader.api.BeanMappingBuilder

/**
 * Custom creative object mappings.
 */
class CreativeMapping : BeanMappingBuilder() {

    override fun configure() {
        mapping(CreativeForm::class.java, ImageCreative::class.java)
            .fields("imageAttributes", "this")

        mapping(ImageCreative::class.java, CreativeResponse::class.java)
            .fields("this", "imageAttributes")

        mapping(CreativeForm::class.java, VideoCreative::class.java)
            .fields("videoAttributes", "this")

        mapping(VideoCreative::class.java, CreativeResponse::class.java)
            .fields("this", "videoAttributes")
    }
}