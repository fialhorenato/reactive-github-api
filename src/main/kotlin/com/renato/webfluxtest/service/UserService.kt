package com.renato.webfluxtest.service

import com.renato.webfluxtest.client.GithubClient
import com.renato.webfluxtest.dto.User
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class UserService(private val githubClient: GithubClient) {
    fun getUser(userId : String): Mono<User> {
        return githubClient.getUser(userId)
    }
}