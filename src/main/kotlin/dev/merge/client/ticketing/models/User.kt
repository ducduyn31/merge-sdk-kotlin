/**
 * Merge Ticketing API
 *
 * The unified API for building rich integrations with multiple Ticketing platforms.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: hello@merge.dev
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package dev.merge.client.ticketing.models

import dev.merge.client.shared.RemoteData

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The User Object ### Description The `User` object is used to represent an employee within a company.  ### Usage Example TODO
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param name The user's name.
 * @param emailAddress The user's email address.
 * @param isActive Whether or not the user is active.
 * @param teams 
 * @param avatar The user's avatar picture.
 * @param remoteData 
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class User (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The user's name. */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* The user's email address. */
    @field:JsonProperty("email_address")
    val emailAddress: kotlin.String? = null,

    /* Whether or not the user is active. */
    @field:JsonProperty("is_active")
    val isActive: kotlin.Boolean? = null,

    @field:JsonProperty("teams")
    val teams: kotlin.collections.List<java.util.UUID>? = null,

    /* The user's avatar picture. */
    @field:JsonProperty("avatar")
    val avatar: kotlin.String? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    /* Indicates whether or not this object has been deleted by third party webhooks. */
    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("id")
        val id: JsonNode?,

        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("name")
        val name: JsonNode?,

        @field:JsonProperty("email_address")
        val emailAddress: JsonNode?,

        @field:JsonProperty("is_active")
        val isActive: JsonNode?,

        @field:JsonProperty("teams")
        val teams: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("avatar")
        val avatar: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: User.Expanded): User {
            return User(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                name = ApiClient.jsonConvertSafe(expanded.name),
                emailAddress = ApiClient.jsonConvertSafe(expanded.emailAddress),
                isActive = ApiClient.jsonConvertSafe(expanded.isActive),
                teams = ApiClient.jsonConvertSafe(expanded.teams),
                avatar = ApiClient.jsonConvertSafe(expanded.avatar),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted)
            )
        }
    }
}

