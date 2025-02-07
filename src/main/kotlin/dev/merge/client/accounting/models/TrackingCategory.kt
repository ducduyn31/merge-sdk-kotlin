/**
 * Merge Accounting API
 *
 * The unified API for building rich integrations with multiple Accounting & Finance platforms.
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

package dev.merge.client.accounting.models

import dev.merge.client.accounting.models.CategoryTypeEnum
import dev.merge.client.shared.RemoteData
import dev.merge.client.accounting.models.Status7d1Enum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The TrackingCategory Object ### Description The `TrackingCategory` object is used to represent a company's tracking categories.  ### Usage Example Fetch from the `GET TrackingCategory` endpoint and view a company's tracking category.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param remoteData 
 * @param name The tracking category's name.
 * @param status The tracking category's status.
 * @param categoryType The tracking category’s type.
 * @param parentCategory 
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class TrackingCategory (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    /* The tracking category's name. */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* The tracking category's status. */
    @field:JsonProperty("status")
    val status: Status7d1Enum? = null,

    /* The tracking category’s type. */
    @field:JsonProperty("category_type")
    val categoryType: CategoryTypeEnum? = null,

    @field:JsonProperty("parent_category")
    val parentCategory: java.util.UUID? = null,

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

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("name")
        val name: JsonNode?,

        @field:JsonProperty("status")
        val status: JsonNode?,

        @field:JsonProperty("category_type")
        val categoryType: JsonNode?,

        @field:JsonProperty("parent_category")
        val parentCategory: JsonNode?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: TrackingCategory.Expanded): TrackingCategory {
            return TrackingCategory(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData),
                name = ApiClient.jsonConvertSafe(expanded.name),
                status = ApiClient.jsonConvertSafe(expanded.status),
                categoryType = ApiClient.jsonConvertSafe(expanded.categoryType),
                parentCategory = ApiClient.jsonConvertSafe(expanded.parentCategory),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted)
            )
        }
    }
}

