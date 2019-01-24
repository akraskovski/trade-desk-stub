package com.github.akraskovski.trade.desk.stub.web.converter

import com.github.akraskovski.trade.desk.stub.domain.model.Availability
import com.github.akraskovski.trade.desk.stub.domain.model.adgroup.AdGroup
import com.github.akraskovski.trade.desk.stub.web.form.adgroup.AdGroupCreateForm
import com.github.akraskovski.trade.desk.stub.web.form.adgroup.AdGroupUpdateForm
import com.github.akraskovski.trade.desk.stub.web.response.adgroup.AdGroupResponse
import com.github.dozermapper.core.Mapper
import java.util.*

/**
 * Extension map function from request form to the domain objects.
 */
fun Mapper.map(adGroupCreateForm: AdGroupCreateForm): AdGroup = map(adGroupCreateForm, AdGroup::class.java)
    .apply {
        id = UUID.randomUUID().toString()
        availability = availability ?: Availability.Available
    }

/**
 * Extension map function from request form to the domain objects.
 */
fun Mapper.map(adGroupUpdateForm: AdGroupUpdateForm): AdGroup = map(adGroupUpdateForm, AdGroup::class.java)
    .apply { availability = availability ?: Availability.Available }

/**
 * Extension map function from domain to the response objects.
 */
fun Mapper.map(adGroup: AdGroup): AdGroupResponse = map(adGroup, AdGroupResponse::class.java)
