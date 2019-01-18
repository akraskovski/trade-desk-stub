package com.github.akraskovski.trade.desk.stub.web.converter

import java.time.LocalDateTime
import java.time.ZoneId
import java.util.*

/**
 * Converts java.util.Date to the LocalDateTime object.
 */
fun Date.toLocalDateTime(): LocalDateTime = toInstant()
    .atZone(ZoneId.systemDefault())
    .toLocalDateTime()

/**
 * Converts LocalDateTime to the Date object.
 */
fun LocalDateTime.toDate(): Date = Date
    .from(
        atZone(ZoneId.systemDefault())
            .toInstant())
