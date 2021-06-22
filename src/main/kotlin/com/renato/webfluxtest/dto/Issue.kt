package com.renato.webfluxtest.dto

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime

data class Issue(
    @JsonProperty("id", required = true) val id: Long,
    @JsonProperty("number", required = true) val number: Long,
    @JsonProperty("title", required = true) val title: String,
    @JsonProperty("repository_name", required = false) val repositoryName: String?,
    @JsonProperty("repository_url", required = true) val repositoryUrl: String,
    @JsonProperty("created_at", required = true) val createdAt: OffsetDateTime,
    @JsonProperty("updated_at", required = true) val updatedAt: OffsetDateTime,
    @JsonProperty("closed_at", required = false) val closedAt: OffsetDateTime?,
)


