package com.github.akraskovski.trade.desk.stub.domain.model

import org.springframework.data.annotation.Id
import java.time.LocalDateTime

/**
 * Domain Campaign object.
 */
class Campaign(
    @field:Id var id: String? = null,
    var advertiserId: String? = null,
    var name: String? = null,
    var description: String? = null,
    var budget: Money? = null,
    var budgetInImpressions: Int? = null,
    var dailyBudget: Money? = null,
    var dailyBudgetInImpressions: Int? = null,
    var startDate: LocalDateTime? = null,
    var endDate: LocalDateTime? = null,
    var availability: String? = null,
    var pacingMode: String? = null
)

