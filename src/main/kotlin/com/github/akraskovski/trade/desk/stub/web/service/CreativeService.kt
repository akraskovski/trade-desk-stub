package com.github.akraskovski.trade.desk.stub.web.service

import com.github.akraskovski.trade.desk.stub.domain.model.creative.Creative
import com.github.akraskovski.trade.desk.stub.domain.repository.ImageCreativeRepository
import com.github.akraskovski.trade.desk.stub.domain.repository.VideoCreativeRepository
import com.github.akraskovski.trade.desk.stub.web.converter.map
import com.github.akraskovski.trade.desk.stub.web.converter.mapToImage
import com.github.akraskovski.trade.desk.stub.web.converter.mapToVideo
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
    private val videoCreativeRepository: VideoCreativeRepository,
    private val searchService: SearchService,
    private val mapper: Mapper
) {

    /**
     * Create and store in db creative entity.
     */
    fun create(creativeForm: CreativeForm): Creative =
        when {
            creativeForm.imageAttributes != null -> imageCreativeRepository.save(mapper.mapToImage(creativeForm))
            creativeForm.videoAttributes != null -> videoCreativeRepository.save(mapper.mapToVideo(creativeForm))
            else -> throw UnsupportedOperationException("Creative attributes should be not empty")
        }

    /**
     * Search all existing creative aggregated in creative response.
     */
    fun searchByParent(query: CreativeSearchQuery): List<CreativeResponse> {
        val result = mutableListOf<CreativeResponse>()
        result.addAll(searchService.searchByParent(query, imageCreativeRepository).map(mapper::map))
        result.addAll(searchService.searchByParent(query, videoCreativeRepository).map(mapper::map))
        //here could be any other creative repositories search

        return result
    }
}