package com.github.akraskovski.trade.desk.stub.web.converter

import com.github.akraskovski.trade.desk.stub.domain.model.Money
import com.github.akraskovski.trade.desk.stub.web.form.MoneyForm
import com.github.akraskovski.trade.desk.stub.web.response.MoneyResponse

/**
 * Converts from MoneyForm to the domain object.
 */
fun MoneyForm.toDomain() = Money(amount, currencyCode)

/**
 * Converts from domain object to the response object.
 */
fun Money.toResponse() = MoneyResponse(amount, currencyCode)