package com.github.akraskovski.trade.desk.stub.web.controller

import com.github.akraskovski.trade.desk.stub.domain.repository.AdGroupRepository
import com.github.akraskovski.trade.desk.stub.web.converter.toDomain
import com.github.akraskovski.trade.desk.stub.web.converter.toResponse
import com.github.akraskovski.trade.desk.stub.web.form.adgroup.AdGroupCreateForm
import com.github.akraskovski.trade.desk.stub.web.form.adgroup.AdGroupUpdateForm
import com.github.akraskovski.trade.desk.stub.web.response.adgroup.AdGroupResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @see /thetradedesk-api/doc/api/post-adgroup.html
 */
@RestController
@RequestMapping("/adgroup")
class AdGroupController(private val adGroupRepository: AdGroupRepository) {

    @PostMapping
    fun create(adGroupForm: AdGroupCreateForm): ResponseEntity<AdGroupResponse> =
        ResponseEntity.ok(adGroupRepository.save(adGroupForm.toDomain()).toResponse())

    @PutMapping
    fun update(adGroupForm: AdGroupUpdateForm): ResponseEntity<AdGroupResponse> =
        ResponseEntity.ok(adGroupRepository.save(adGroupForm.toDomain()).toResponse())
}