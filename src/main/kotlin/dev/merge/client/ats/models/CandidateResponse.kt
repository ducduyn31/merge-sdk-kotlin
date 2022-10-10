/**
 * Merge ATS API
 *
 * The unified API for building rich integrations with multiple Applicant Tracking System platforms.
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

package dev.merge.client.ats.models

import dev.merge.client.ats.models.Candidate
import dev.merge.client.ats.models.DebugModeLog
import dev.merge.client.ats.models.ErrorValidationProblem
import dev.merge.client.ats.models.WarningValidationProblem

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * 
 *
 * @param model 
 * @param warnings 
 * @param errors 
 * @param logs 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class CandidateResponse (

    @field:JsonProperty("model")
    val model: Candidate,

    @field:JsonProperty("warnings")
    val warnings: kotlin.collections.List<WarningValidationProblem>,

    @field:JsonProperty("errors")
    val errors: kotlin.collections.List<ErrorValidationProblem>,

    @field:JsonProperty("logs")
    val logs: kotlin.collections.List<DebugModeLog>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("model")
        val model: JsonNode,

        @field:JsonProperty("warnings")
        val warnings: kotlin.collections.List<JsonNode>,

        @field:JsonProperty("errors")
        val errors: kotlin.collections.List<JsonNode>,

        @field:JsonProperty("logs")
        val logs: kotlin.collections.List<JsonNode>?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: CandidateResponse.Expanded): CandidateResponse {
            return CandidateResponse(
                model = ApiClient.jsonConvertRequiredSafe(expanded.model),
                warnings = ApiClient.jsonConvertRequiredSafe(expanded.warnings),
                errors = ApiClient.jsonConvertRequiredSafe(expanded.errors),
                logs = ApiClient.jsonConvertSafe(expanded.logs)
            )
        }
    }
}

