package com.github.akraskovski.trade.desk.stub

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TradeDeskStubApplication

fun main(args: Array<String>) {
    runApplication<TradeDeskStubApplication>(*args)
}