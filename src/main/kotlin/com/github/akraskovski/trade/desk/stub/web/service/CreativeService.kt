package com.github.akraskovski.trade.desk.stub.web.service

import com.github.akraskovski.trade.desk.stub.domain.model.creative.ImageCreative
import com.github.akraskovski.trade.desk.stub.domain.repository.ImageCreativeRepository
import com.github.akraskovski.trade.desk.stub.web.converter.toImageCreative
import com.github.akraskovski.trade.desk.stub.web.form.creative.CreativeForm
import org.springframework.stereotype.Service

/**
 * Basic creative service.
 */
@Service
class CreativeService(private val imageCreativeRepository: ImageCreativeRepository) {

    /**
     * Create and store in db creative entity.
     */
    fun create(creativeForm: CreativeForm): ImageCreative {
        creativeForm.imageAttributes ?: throw UnsupportedOperationException("Image attributes should be not empty")

        return imageCreativeRepository.save(creativeForm.toImageCreative())
    }
}