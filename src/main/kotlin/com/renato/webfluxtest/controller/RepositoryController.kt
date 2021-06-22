package com.renato.webfluxtest.controller

import com.renato.webfluxtest.dto.Issue
import com.renato.webfluxtest.dto.Repository
import com.renato.webfluxtest.service.RepositoryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/repos")
class RepositoryController(private val repositoryService: RepositoryService) {
    @GetMapping("/{user_id}")
    fun getRepos(@PathVariable("user_id") userId : String): Flux<Repository> {
        return repositoryService.getRepos(userId)
    }

    @GetMapping("/{user_id}/issues")
    fun getIssues(@PathVariable("user_id") userId : String): Flux<Issue> {
        return repositoryService.getIssues(userId)
    }
}