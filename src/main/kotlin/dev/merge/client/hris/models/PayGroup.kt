/**
 * Merge HRIS API
 *
 * The unified API for building rich integrations with multiple HR Information System platforms.
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

package dev.merge.client.hris.models

import dev.merge.client.shared.RemoteData

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The PayGroup Object ### Description The `PayGroup` object is used to represent Pay Group information that employees belong to. This is often referenced with an Employee object.  ### Usage Example Fetch from the `LIST PayGroup` endpoint and filter by `ID` to show all pay group information.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param payGroupName The pay group name.
 * @param remoteData 
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 */

data class PayGroup (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The pay group name. */
    @field:JsonProperty("pay_group_name")
    val payGroupName: kotlin.String? = null,

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

        @field:JsonProperty("pay_group_name")
        val payGroupName: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: PayGroup.Expanded): PayGroup {
            return PayGroup(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                payGroupName = ApiClient.jsonConvertSafe(expanded.payGroupName),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted)
            )
        }
    }
}

