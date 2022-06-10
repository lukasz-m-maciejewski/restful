package org.greycatworkshop.restful.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import mu.KotlinLogging

@Controller
class HtmlController {

    @GetMapping("/boom")
    fun stuff(model: Model): String {
        var logger = KotlinLogging.logger {}
        logger.info("hello")
        model["title"] = "Blog"
        return "blog"
    }
}
