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
 * # The Attachment Object ### Description The `Attachment` object is used to represent an attachment for a ticket.  ### Usage Example TODO
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param fileName The attachment's name.
 * @param ticket 
 * @param fileUrl The attachment's url.
 * @param contentType The attachment's file format.
 * @param uploadedBy 
 * @param remoteCreatedAt When the third party's attachment was created.
 * @param remoteData 
 * @param remoteWasDeleted 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class Attachment (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The attachment's name. */
    @field:JsonProperty("file_name")
    val fileName: kotlin.String? = null,

    @field:JsonProperty("ticket")
    val ticket: java.util.UUID? = null,

    /* The attachment's url. */
    @field:JsonProperty("file_url")
    val fileUrl: kotlin.String? = null,

    /* The attachment's file format. */
    @field:JsonProperty("content_type")
    val contentType: kotlin.String? = null,

    @field:JsonProperty("uploaded_by")
    val uploadedBy: java.util.UUID? = null,

    /* When the third party's attachment was created. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("id")
        val id: JsonNode?,

        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("file_name")
        val fileName: JsonNode?,

        @field:JsonProperty("ticket")
        val ticket: JsonNode?,

        @field:JsonProperty("file_url")
        val fileUrl: JsonNode?,

        @field:JsonProperty("content_type")
        val contentType: JsonNode?,

        @field:JsonProperty("uploaded_by")
        val uploadedBy: JsonNode?,

        @field:JsonProperty("remote_created_at")
        val remoteCreatedAt: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: Attachment.Expanded): Attachment {
            return Attachment(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                fileName = ApiClient.jsonConvertSafe(expanded.fileName),
                ticket = ApiClient.jsonConvertSafe(expanded.ticket),
                fileUrl = ApiClient.jsonConvertSafe(expanded.fileUrl),
                contentType = ApiClient.jsonConvertSafe(expanded.contentType),
                uploadedBy = ApiClient.jsonConvertSafe(expanded.uploadedBy),
                remoteCreatedAt = ApiClient.jsonConvertSafe(expanded.remoteCreatedAt),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted)
            )
        }
    }
}

