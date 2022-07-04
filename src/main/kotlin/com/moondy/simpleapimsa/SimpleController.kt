package com.moondy.simpleapimsa

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin
class SimpleController {
    @GetMapping("/health")
    fun healthCheck(): ResponseEntity<Any> {
        return ResponseEntity.ok("alive")
    }
}