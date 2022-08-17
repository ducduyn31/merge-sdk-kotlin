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


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The RemoteKeyForRegeneration Object ### Description The `RemoteKeyForRegeneration` object is used to exchange an old remote key for a new one  ### Usage Example Post a `RemoteKeyForRegeneration` to swap out an old remote key for a new one
 *
 * @param name 
 */

data class RemoteKeyForRegenerationRequest (

    @field:JsonProperty("name")
    val name: kotlin.String

) {

    data class Expanded(
        @field:JsonProperty("name")
        val name: JsonNode

    )


    companion object {
        fun normalize(expanded: RemoteKeyForRegenerationRequest.Expanded): RemoteKeyForRegenerationRequest {
            return RemoteKeyForRegenerationRequest(
                name = ApiClient.jsonConvertRequiredSafe(expanded.name)
            )
        }
    }
}

