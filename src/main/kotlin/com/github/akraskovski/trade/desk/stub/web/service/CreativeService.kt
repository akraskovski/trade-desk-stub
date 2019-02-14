package com.github.akraskovski.trade.desk.stub.web.service

import com.github.akraskovski.trade.desk.stub.domain.model.creative.ImageCreative
import com.github.akraskovski.trade.desk.stub.domain.repository.ImageCreativeRepository
import com.github.akraskovski.trade.desk.stub.web.converter.map
import com.github.akraskovski.trade.desk.stub.web.form.creative.CreativeForm
import com.github.akraskovski.trade.desk.stub.web.form.search.CreativeSearchQuery
import com.github.akraskovski.trade.desk.stub.web.response.creative.CreativeResponse
import com.github.dozermapper.core.Mapper
import org.springframework.stereotype.Service

/**
 * Basic creative service.
 */
@Service
class CreativeService(
    private val imageCreativeRepository: ImageCreativeRepository,
    private val searchService: SearchService,
    private val mapper: Mapper
) {

    /**
     * Create and store in db creative entity.
     */
    fun create(creativeForm: CreativeForm): ImageCreative {
        creativeForm.imageAttributes ?: throw UnsupportedOperationException("Image attributes should be not empty")

        return imageCreativeRepository.save(mapper.map(creativeForm))
    }

    /**
     * Search all existing creative aggregated in creative response.
     */
    fun searchByParent(query: CreativeSearchQuery): List<CreativeResponse> {
        val result = mutableListOf<CreativeResponse>()
        result.addAll(searchService.searchByParent(query, imageCreativeRepository).map(mapper::map))
        //here could be any other creative repositories search

        return result
    }
}