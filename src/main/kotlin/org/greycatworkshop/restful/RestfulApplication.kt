package org.greycatworkshop.restful

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestfulApplication

fun main(args: Array<String>) {
	runApplication<RestfulApplication>(*args) {
		setBannerMode(Banner.Mode.OFF)
	}
}
