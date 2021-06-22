package com.renato.webfluxtest.controller

import com.renato.webfluxtest.dto.User
import com.renato.webfluxtest.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/user")
class UserController(private val userService: UserService) {
    @GetMapping("/{user_id}")
    fun getUser(@PathVariable("user_id") userId : String): Mono<User> {
        return userService.getUser(userId)
    }
}