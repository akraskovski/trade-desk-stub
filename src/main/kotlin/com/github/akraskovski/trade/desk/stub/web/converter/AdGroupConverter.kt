package com.github.akraskovski.trade.desk.stub.web.converter

import com.github.akraskovski.trade.desk.stub.domain.model.adgroup.AdGroup
import com.github.akraskovski.trade.desk.stub.domain.model.adgroup.AdGroupBudgetSettings
import com.github.akraskovski.trade.desk.stub.domain.model.adgroup.AdGroupLanguageTargeting
import com.github.akraskovski.trade.desk.stub.domain.model.adgroup.AdGroupRTBAttributes
import com.github.akraskovski.trade.desk.stub.domain.model.adgroup.BidAdjustment
import com.github.akraskovski.trade.desk.stub.domain.model.adgroup.BidAdjustments
import com.github.akraskovski.trade.desk.stub.domain.model.adgroup.OSAdjustments
import com.github.akraskovski.trade.desk.stub.web.form.adgroup.AdGroupBudgetSettingsForm
import com.github.akraskovski.trade.desk.stub.web.form.adgroup.AdGroupCreateForm
import com.github.akraskovski.trade.desk.stub.web.form.adgroup.AdGroupLanguageTargetingForm
import com.github.akraskovski.trade.desk.stub.web.form.adgroup.AdGroupRTBAttributesForm
import com.github.akraskovski.trade.desk.stub.web.form.adgroup.AdGroupUpdateForm
import com.github.akraskovski.trade.desk.stub.web.form.adgroup.BidAdjustmentForm
import com.github.akraskovski.trade.desk.stub.web.form.adgroup.BidAdjustmentsForm
import com.github.akraskovski.trade.desk.stub.web.form.adgroup.OSAdjustmentsForm
import com.github.akraskovski.trade.desk.stub.web.response.adgroup.AdGroupBudgetSettingsResponse
import com.github.akraskovski.trade.desk.stub.web.response.adgroup.AdGroupLanguageTargetingResponse
import com.github.akraskovski.trade.desk.stub.web.response.adgroup.AdGroupRTBAttributesResponse
import com.github.akraskovski.trade.desk.stub.web.response.adgroup.AdGroupResponse
import com.github.akraskovski.trade.desk.stub.web.response.adgroup.BidAdjustmentResponse
import com.github.akraskovski.trade.desk.stub.web.response.adgroup.BidAdjustmentsResponse
import com.github.akraskovski.trade.desk.stub.web.response.adgroup.OSAdjustmentsResponse
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

/**
 *  Converts from the create form to the domain object.
 */
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
    rtbAttributes = rtbAttributes?.toResponse(),
    availability = availability
)

/**
 * Converts from the domain object to the response object.
 */
fun AdGroupRTBAttributes.toResponse(): AdGroupRTBAttributesResponse = AdGroupRTBAttributesResponse(
    budgetSettings = budgetSettings?.toResponse(),
    baseBidCPM = baseBidCPM?.toResponse(),
    maxBidCPM = maxBidCPM?.toResponse(),
    creativeIds = creativeIds,
    geoSegmentAdjustments = geoSegmentAdjustments?.map { it.toResponse() },
    osFamilyAndVersionAdjustments = osFamilyAndVersionAdjustments?.toResponse(),
    deviceTypeAdjustments = deviceTypeAdjustments?.toResponse(),
    languageTargeting = languageTargeting?.toResponse()
)

/**
 * Converts from the domain object to the response object.
 */
fun <ID> BidAdjustment<ID>.toResponse(): BidAdjustmentResponse<ID> = BidAdjustmentResponse(id, adjustment)

/**
 * Converts from the domain object to the response object.
 */
fun <ID> BidAdjustments<ID>.toResponse(): BidAdjustmentsResponse<ID> = BidAdjustmentsResponse(
    defaultAdjustment,
    adjustments?.map { it.toResponse() }
)

/**
 * Converts from the domain object to the response object.
 */
fun OSAdjustments.toResponse(): OSAdjustmentsResponse = OSAdjustmentsResponse(
    osVersionAdjustments = osFamilyAdjustments?.map { it.toResponse() },
    osFamilyAdjustments = osFamilyAdjustments?.map { it.toResponse() },
    defaultAdjustment = defaultAdjustment
)

/**
 *  Converts from the domain object to the response object.
 */
fun AdGroupLanguageTargeting.toResponse(): AdGroupLanguageTargetingResponse = AdGroupLanguageTargetingResponse(
    languageTargetingAdjustments = languageTargetingAdjustments?.toResponse()
)

/**
 * Converts from the domain object to the response object.
 */
fun AdGroupBudgetSettings.toResponse(): AdGroupBudgetSettingsResponse = AdGroupBudgetSettingsResponse(
    budget = budget?.toResponse(),
    budgetInImpressions = budgetInImpressions,
    dailyBudget = dailyBudget?.toResponse(),
    dailyBudgetInImpressions = dailyBudgetInImpressions,
    pacingMode = pacingMode
)