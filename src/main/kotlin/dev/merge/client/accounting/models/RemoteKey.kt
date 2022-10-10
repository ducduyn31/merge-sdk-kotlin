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


import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The RemoteKey Object ### Description The `RemoteKey` object is used to represent a request for a new remote key.  ### Usage Example Post a `GenerateRemoteKey` to receive a new `RemoteKey`.
 *
 * @param name 
 * @param key 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class RemoteKey (

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("key")
    val key: kotlin.String

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("name")
        val name: JsonNode,

        @field:JsonProperty("key")
        val key: JsonNode

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: RemoteKey.Expanded): RemoteKey {
            return RemoteKey(
                name = ApiClient.jsonConvertRequiredSafe(expanded.name),
                key = ApiClient.jsonConvertRequiredSafe(expanded.key)
            )
        }
    }
}

