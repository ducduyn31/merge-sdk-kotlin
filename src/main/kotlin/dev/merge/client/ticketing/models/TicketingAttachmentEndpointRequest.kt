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

import dev.merge.client.ticketing.models.AttachmentRequest

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * 
 *
 * @param model 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class TicketingAttachmentEndpointRequest (

    @field:JsonProperty("model")
    val model: AttachmentRequest

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("model")
        val model: JsonNode

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: TicketingAttachmentEndpointRequest.Expanded): TicketingAttachmentEndpointRequest {
            return TicketingAttachmentEndpointRequest(
                model = ApiClient.jsonConvertRequiredSafe(expanded.model)
            )
        }
    }
}

