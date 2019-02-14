package com.github.akraskovski.trade.desk.stub.web.controller

import com.github.akraskovski.trade.desk.stub.web.form.creative.CreativeForm
import com.github.akraskovski.trade.desk.stub.web.form.search.CreativeSearchQuery
import com.github.akraskovski.trade.desk.stub.web.response.creative.CreativeResponse
import com.github.akraskovski.trade.desk.stub.web.response.creative.VideoUploadAttributesResponse
import com.github.akraskovski.trade.desk.stub.web.response.creative.VideoUrlUploadAttributesResponse
import com.github.akraskovski.trade.desk.stub.web.response.search.PageResponse
import com.github.akraskovski.trade.desk.stub.web.service.CreativeService
import com.github.akraskovski.trade.desk.stub.web.service.toResponse
import com.github.dozermapper.core.Mapper
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

/**
 * Creative endpoint.
 */
@RestController
@RequestMapping("/creative")
class CreativeController(
    private val creativeService: CreativeService,
    private val mapper: Mapper
) {

    /**
     * Creates a new creative.
     */
    @PostMapping
    fun create(@RequestBody @Valid creativeForm: CreativeForm): ResponseEntity<CreativeResponse> =
        creativeService.create(creativeForm)
            .let { mapper.map(it, CreativeResponse::class.java) }
            .let(::ok)

    @PostMapping("/generateuploadurlforvideocreative")
    fun generateUploadUrl(): ResponseEntity<VideoUrlUploadAttributesResponse> {
        val videoUploadAttributesResponse = VideoUploadAttributesResponse("creativeId", "mp4")
        val videoUrlUploadAttributesResponse = VideoUrlUploadAttributesResponse("http://127.0.0.1:27017/creative/upload", "application/json", videoUploadAttributesResponse)

        return ok(videoUrlUploadAttributesResponse)
    }

    @PutMapping("/upload")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun upload() {
        println("received")
    }

    /**
     * Search the campaigns for a given advertiser with predefined criteria.
     */
    @PostMapping("/query/advertiser")
    fun search(@RequestBody @Valid searchQuery: CreativeSearchQuery): ResponseEntity<PageResponse<CreativeResponse>>? =
        ResponseEntity.ok(creativeService.searchByParent(searchQuery).toResponse())
}