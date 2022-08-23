/**
 * Merge CRM API
 *
 * The unified API for building rich integrations with multiple CRM platforms.
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

package dev.merge.client.crm.models

import dev.merge.client.crm.models.DirectionEnum
import dev.merge.client.shared.RemoteData

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Engagement Object ### Description The `Engagement` object is used to represent an engagement in the remote system. ### Usage Example TODO
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param owner 
 * @param content The engagement's content.
 * @param subject The engagement's subject.
 * @param direction The engagement's direction.
 * @param engagementType 
 * @param startTime The time at which the engagement started.
 * @param endTime The time at which the engagement ended.
 * @param account 
 * @param remoteData 
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 */

data class Engagement (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("owner")
    val owner: java.util.UUID? = null,

    /* The engagement's content. */
    @field:JsonProperty("content")
    val content: kotlin.String? = null,

    /* The engagement's subject. */
    @field:JsonProperty("subject")
    val subject: kotlin.String? = null,

    /* The engagement's direction. */
    @field:JsonProperty("direction")
    val direction: DirectionEnum? = null,

    @field:JsonProperty("engagement_type")
    val engagementType: java.util.UUID? = null,

    /* The time at which the engagement started. */
    @field:JsonProperty("start_time")
    val startTime: java.time.OffsetDateTime? = null,

    /* The time at which the engagement ended. */
    @field:JsonProperty("end_time")
    val endTime: java.time.OffsetDateTime? = null,

    @field:JsonProperty("account")
    val account: java.util.UUID? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    /* Indicates whether or not this object has been deleted by third party webhooks. */
    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null

) {

    data class Expanded(
        @field:JsonProperty("id")
        val id: JsonNode?,

        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("owner")
        val owner: JsonNode?,

        @field:JsonProperty("content")
        val content: JsonNode?,

        @field:JsonProperty("subject")
        val subject: JsonNode?,

        @field:JsonProperty("direction")
        val direction: JsonNode?,

        @field:JsonProperty("engagement_type")
        val engagementType: JsonNode?,

        @field:JsonProperty("start_time")
        val startTime: JsonNode?,

        @field:JsonProperty("end_time")
        val endTime: JsonNode?,

        @field:JsonProperty("account")
        val account: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: Engagement.Expanded): Engagement {
            return Engagement(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                owner = ApiClient.jsonConvertSafe(expanded.owner),
                content = ApiClient.jsonConvertSafe(expanded.content),
                subject = ApiClient.jsonConvertSafe(expanded.subject),
                direction = ApiClient.jsonConvertSafe(expanded.direction),
                engagementType = ApiClient.jsonConvertSafe(expanded.engagementType),
                startTime = ApiClient.jsonConvertSafe(expanded.startTime),
                endTime = ApiClient.jsonConvertSafe(expanded.endTime),
                account = ApiClient.jsonConvertSafe(expanded.account),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted)
            )
        }
    }
}

