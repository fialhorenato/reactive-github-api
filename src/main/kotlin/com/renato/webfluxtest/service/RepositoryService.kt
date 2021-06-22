package com.renato.webfluxtest.service

import com.renato.webfluxtest.client.GithubClient
import com.renato.webfluxtest.dto.Issue
import com.renato.webfluxtest.dto.Repository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class RepositoryService(private val githubClient: GithubClient) {
    fun getRepos(userId : String): Flux<Repository> {
        return githubClient.getRepos(userId)
    }

    fun getIssues(userId : String): Flux<Issue> {
        return getRepos(userId).flatMap {
            getIssuesFromRepo(userId, it.name)
        }
    }

    fun getIssuesFromRepo(userId : String, repoName : String): Flux<Issue> {
        return githubClient.getIssuesFromRepo(userId, repoName)
    }
}