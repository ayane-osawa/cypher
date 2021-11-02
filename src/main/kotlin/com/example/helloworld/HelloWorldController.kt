package com.example.helloworld

import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
    @GetMapping("/hello")
    fun hello(
        @RequestParam name: String
    ):String {
        return Json.encodeToString(ResponseMessage("Hello, $name"))
    }

}

@Serializable
data class ResponseMessage(val message: String)
