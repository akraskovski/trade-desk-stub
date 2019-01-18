package com.github.akraskovski.trade.desk.stub.web.converter

import com.github.akraskovski.trade.desk.stub.domain.model.*
import com.github.akraskovski.trade.desk.stub.web.form.adgroup.*
import com.github.akraskovski.trade.desk.stub.web.response.adgroup.AdGroupResponse
import java.util.*

/**
 * Converts from the create form to the domain object.
 */
fun AdGroupCreateForm.toDomain(): AdGroup = AdGroup(
    id = UUID.randomUUID().toString(),
    campaignId = campaignId,
    name = name,
    description = description,
    isEnabled = isEnabled,
    industryCategoryId = industryCategoryId,
    rtbAttributes = rtbAttributes?.toDomain(),
    availability = availability
)

/**
 * Converts from the update form to the domain object.
 */
fun AdGroupUpdateForm.toDomain(): AdGroup = AdGroup(
    id = id,
    campaignId = campaignId,
    name = name,
    description = description,
    isEnabled = isEnabled,
    industryCategoryId = industryCategoryId,
    rtbAttributes = rtbAttributes?.toDomain(),
    availability = availability
)

/**
 * Converts from the create form to the domain object.
 */
fun AdGroupRTBAttributesForm.toDomain(): AdGroupRTBAttributes = AdGroupRTBAttributes(
    budgetSettings = budgetSettings?.toDomain(),
    baseBidCPM = baseBidCPM?.toDomain(),
    maxBidCPM = maxBidCPM?.toDomain(),
    creativeIds = creativeIds,
    geoSegmentAdjustments = geoSegmentAdjustments?.map { it.toDomain() },
    osFamilyAndVersionAdjustments = osFamilyAndVersionAdjustments?.toDomain(),
    deviceTypeAdjustments = deviceTypeAdjustments?.toDomain(),
    languageTargeting = languageTargeting?.toDomain()
)

/**
 * Converts from the create form to the domain object.
 */
fun <ID> BidAdjustmentForm<ID>.toDomain(): BidAdjustment<ID> = BidAdjustment(id, adjustment)

/**
 * Converts from the create form to the domain object.
 */
fun <ID> BidAdjustmentsForm<ID>.toDomain(): BidAdjustments<ID> = BidAdjustments(
    defaultAdjustment,
    adjustments?.map { it.toDomain() }
)

/**
 * Converts from the create form to the domain object.
 */
fun OSAdjustmentsForm.toDomain(): OSAdjustments = OSAdjustments(
    osVersionAdjustments = osFamilyAdjustments?.map { it.toDomain() },
    osFamilyAdjustments = osFamilyAdjustments?.map { it.toDomain() },
    defaultAdjustment = defaultAdjustment
)

fun AdGroupLanguageTargetingForm.toDomain(): AdGroupLanguageTargeting = AdGroupLanguageTargeting(
    languageTargetingAdjustments = languageTargetingAdjustments?.toDomain()
)

/**
 * Converts from the create form to the domain object.
 */
fun AdGroupBudgetSettingsForm.toDomain(): AdGroupBudgetSettings = AdGroupBudgetSettings(
    budget = budget?.toDomain(),
    budgetInImpressions = budgetInImpressions,
    dailyBudget = dailyBudget?.toDomain(),
    dailyBudgetInImpressions = dailyBudgetInImpressions,
    pacingMode = pacingMode
)

/**
 * Converts from the domain object to the response object.
 */
fun AdGroup.toResponse(): AdGroupResponse = AdGroupResponse(
    id = id,
    campaignId = campaignId,
    name = name,
    description = description,
    isEnabled = isEnabled,
    industryCategoryId = industryCategoryId,
    //todo add full response converter
//    rtbAttributes = rtbAttributes.toResponse(),
    availability = availability
)