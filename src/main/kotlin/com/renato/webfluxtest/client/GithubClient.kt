package com.renato.webfluxtest.client

import com.renato.webfluxtest.dto.Issue
import com.renato.webfluxtest.dto.Repository
import com.renato.webfluxtest.dto.User
import org.springframework.http.HttpHeaders.CONTENT_TYPE
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Component
class GithubClient {
    companion object {
        private const val GITHUB_API_URL = "https://api.github.com/"
        private const val GET_USER = "/users"
        private const val GET_REPOS = "/repos"
        private const val GET_ISSUES = "/issues"

        private val webClient = WebClient.builder()
            .baseUrl(GITHUB_API_URL)
            .defaultHeader(CONTENT_TYPE, APPLICATION_JSON_VALUE)
            .build()
    }

    fun getUser(userId : String): Mono<User> {
        val request = webClient.get()
        request.uri("$GET_USER/$userId")
        return request.retrieve().bodyToMono(User::class.java)
    }

    fun getRepos(userId : String): Flux<Repository> {
        val request = webClient.get()
        request.uri("$GET_USER/$userId/$GET_REPOS")
        return request.retrieve().bodyToFlux(Repository::class.java)
    }

    fun getIssuesFromRepo(userId : String, repoName : String): Flux<Issue> {
        val request = webClient.get()
        request.uri("$GET_REPOS/$userId/$repoName/$GET_ISSUES")
        return request.retrieve().bodyToFlux(Issue::class.java)
    }

}