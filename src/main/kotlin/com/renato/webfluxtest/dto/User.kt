package com.renato.webfluxtest.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class User(
    @JsonProperty("login") val login: String,
    @JsonProperty("id") val id: Int,
    @JsonProperty("node_id") val nodeId: String,
    @JsonProperty("avatar_url") val avatarUrl: java.net.URI,
    @JsonProperty("gravatar_id") val gravatarId: String,
    @JsonProperty("url") val url: java.net.URI,
    @JsonProperty("html_url") val htmlUrl: java.net.URI,
    @JsonProperty("followers_url") val followersUrl: java.net.URI,
    @JsonProperty("subscriptions_url") val subscriptionsUrl: java.net.URI,
    @JsonProperty("organizations_url") val organizationsUrl: java.net.URI,
    @JsonProperty("repos_url") val reposUrl: java.net.URI,
    @JsonProperty("received_events_url") val receivedEventsUrl: java.net.URI,
    @JsonProperty("type") val type: String,
    @JsonProperty("score", required = false) val score: java.math.BigDecimal?,
    @JsonProperty("following_url") val followingUrl: String,
    @JsonProperty("gists_url") val gistsUrl: String,
    @JsonProperty("starred_url") val starredUrl: String,
    @JsonProperty("events_url") val eventsUrl: String,
    @JsonProperty("site_admin") val siteAdmin: Boolean,
    @JsonProperty("public_repos") val publicRepos: Int? = null,
    @JsonProperty("public_gists") val publicGists: Int? = null,
    @JsonProperty("followers") val followers: Int? = null,
    @JsonProperty("following") val following: Int? = null,
    @JsonProperty("created_at") val createdAt: java.time.OffsetDateTime? = null,
    @JsonProperty("updated_at") val updatedAt: java.time.OffsetDateTime? = null,
    @JsonProperty("name") val name: String? = null,
    @JsonProperty("bio") val bio: String? = null,
    @JsonProperty("email") val email: String? = null,
    @JsonProperty("location") val location: String? = null,
    @JsonProperty("hireable") val hireable: Boolean? = null,
    @JsonProperty("blog") val blog: String? = null,
    @JsonProperty("company") val company: String? = null,
    @JsonProperty("suspended_at") val suspendedAt: java.time.OffsetDateTime? = null
)
