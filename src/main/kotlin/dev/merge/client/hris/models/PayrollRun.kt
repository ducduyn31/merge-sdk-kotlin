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
import dev.merge.client.hris.models.RunStateEnum
import dev.merge.client.hris.models.RunTypeEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The PayrollRun Object ### Description The `PayrollRun` object is used to represent a payroll run. This payroll run is not specific to an employee.  ### Usage Example Fetch from the `LIST PayrollRuns` endpoint and filter by `ID` to show all payroll runs.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param runState The state of the payroll run
 * @param runType The type of the payroll run
 * @param startDate The day and time the payroll run started.
 * @param endDate The day and time the payroll run ended.
 * @param checkDate The day and time the payroll run was checked.
 * @param remoteData 
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class PayrollRun (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The state of the payroll run */
    @field:JsonProperty("run_state")
    val runState: RunStateEnum? = null,

    /* The type of the payroll run */
    @field:JsonProperty("run_type")
    val runType: RunTypeEnum? = null,

    /* The day and time the payroll run started. */
    @field:JsonProperty("start_date")
    val startDate: java.time.OffsetDateTime? = null,

    /* The day and time the payroll run ended. */
    @field:JsonProperty("end_date")
    val endDate: java.time.OffsetDateTime? = null,

    /* The day and time the payroll run was checked. */
    @field:JsonProperty("check_date")
    val checkDate: java.time.OffsetDateTime? = null,

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

        @field:JsonProperty("run_state")
        val runState: JsonNode?,

        @field:JsonProperty("run_type")
        val runType: JsonNode?,

        @field:JsonProperty("start_date")
        val startDate: JsonNode?,

        @field:JsonProperty("end_date")
        val endDate: JsonNode?,

        @field:JsonProperty("check_date")
        val checkDate: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: PayrollRun.Expanded): PayrollRun {
            return PayrollRun(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                runState = ApiClient.jsonConvertSafe(expanded.runState),
                runType = ApiClient.jsonConvertSafe(expanded.runType),
                startDate = ApiClient.jsonConvertSafe(expanded.startDate),
                endDate = ApiClient.jsonConvertSafe(expanded.endDate),
                checkDate = ApiClient.jsonConvertSafe(expanded.checkDate),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted)
            )
        }
    }
}

