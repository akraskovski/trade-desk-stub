package com.github.akraskovski.trade.desk.stub

import com.github.akraskovski.trade.desk.stub.domain.model.Availability
import com.github.akraskovski.trade.desk.stub.domain.model.advertiser.Advertiser
import com.github.akraskovski.trade.desk.stub.domain.repository.AdvertiserRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@SpringBootApplication
class TradeDeskStubApplication

fun main(args: Array<String>) {
    runApplication<TradeDeskStubApplication>(*args)
}

@Component
class PostStartupRunner(private val advertiserRepository: AdvertiserRepository) : CommandLineRunner {

    override fun run(vararg args: String?) {
        val advertiser = Advertiser(
            ID,
            "test-partner-id",
            "test-advertiser-name",
            "...description...",
            1,
            Availability.Available,
            10,
            20,
            30,
            40,
            "https://logo-url.com",
            "https://domain.com",
            listOf("firstKeyword", "secondKeyword")
        )

        advertiserRepository.findByIdOrNull(ID) ?: advertiserRepository.save(advertiser)
    }

    companion object {
        const val ID = "oirge-rewgwreg34-webrtg3w4g-rtb4w5"
    }

}