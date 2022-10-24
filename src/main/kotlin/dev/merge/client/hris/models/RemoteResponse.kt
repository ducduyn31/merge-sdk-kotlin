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

import dev.merge.client.hris.models.ResponseTypeEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The RemoteResponse Object ### Description The `RemoteResponse` object is used to represent information returned from a third-party endpoint.  ### Usage Example View the `RemoteResponse` returned from your `DataPassthrough`.
 *
 * @param method 
 * @param path 
 * @param status 
 * @param response 
 * @param responseHeaders 
 * @param responseType 
 * @param headers 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class RemoteResponse (

    @field:JsonProperty("method")
    val method: kotlin.String,

    @field:JsonProperty("path")
    val path: kotlin.String,

    @field:JsonProperty("status")
    val status: kotlin.Int,

    @field:JsonProperty("response")
    val response: kotlin.Any?,

    @field:JsonProperty("response_headers")
    val responseHeaders: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("response_type")
    val responseType: ResponseTypeEnum? = null,

    @field:JsonProperty("headers")
    val headers: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("method")
        val method: JsonNode,

        @field:JsonProperty("path")
        val path: JsonNode,

        @field:JsonProperty("status")
        val status: JsonNode,

        @field:JsonProperty("response")
        val response: JsonNode,

        @field:JsonProperty("response_headers")
        val responseHeaders: JsonNode?,

        @field:JsonProperty("response_type")
        val responseType: JsonNode?,

        @field:JsonProperty("headers")
        val headers: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: RemoteResponse.Expanded): RemoteResponse {
            return RemoteResponse(
                method = ApiClient.jsonConvertRequiredSafe(expanded.method),
                path = ApiClient.jsonConvertRequiredSafe(expanded.path),
                status = ApiClient.jsonConvertRequiredSafe(expanded.status),
                response = ApiClient.jsonConvertRequiredSafe(expanded.response),
                responseHeaders = ApiClient.jsonConvertSafe(expanded.responseHeaders),
                responseType = ApiClient.jsonConvertSafe(expanded.responseType),
                headers = ApiClient.jsonConvertSafe(expanded.headers)
            )
        }
    }
}

