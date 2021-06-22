package com.renato.webfluxtest.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class Repository(
    @JsonProperty("name", required = true) val name: String,
    @JsonProperty("issues_url", required = true) val issuesUrl: String,
    @JsonProperty("has_issues", required = true) val hasIssues: Boolean,
    @JsonProperty("open_issues", required = true) val openIssues: Long
)