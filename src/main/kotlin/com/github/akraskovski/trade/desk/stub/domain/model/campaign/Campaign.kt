package com.github.akraskovski.trade.desk.stub.domain.model.campaign

import com.github.akraskovski.trade.desk.stub.domain.model.Availability
import com.github.akraskovski.trade.desk.stub.domain.model.Money
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

/**
 * Domain Campaign object.
 */
@Document
class Campaign(
    @field:Id var id: String? = null,
    var advertiserId: String? = null,
    var name: String? = null,
    var description: String? = null,
    var budget: Money? = null,
    var budgetInImpressions: Int? = null,
    var dailyBudget: Money? = null,
    var dailyBudgetInImpressions: Int? = null,
    var startDate: Date? = null,
    var endDate: Date? = null,
    var availability: Availability? = null,
    var pacingMode: String? = null
)

