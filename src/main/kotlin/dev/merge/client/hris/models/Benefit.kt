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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Benefit Object ### Description The `Benefit` object is used to represent a Benefit for an employee.  ### Usage Example Fetch from the `LIST Benefits` endpoint and filter by `ID` to show all benefits.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param employee 
 * @param providerName The name of the benefit provider.
 * @param benefitPlanType The type of benefit plan
 * @param employeeContribution The employee's contribution.
 * @param companyContribution The company's contribution.
 * @param remoteData 
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class Benefit (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("employee")
    val employee: java.util.UUID? = null,

    /* The name of the benefit provider. */
    @field:JsonProperty("provider_name")
    val providerName: kotlin.String? = null,

    /* The type of benefit plan */
    @field:JsonProperty("benefit_plan_type")
    val benefitPlanType: kotlin.String? = null,

    /* The employee's contribution. */
    @field:JsonProperty("employee_contribution")
    val employeeContribution: kotlin.Float? = null,

    /* The company's contribution. */
    @field:JsonProperty("company_contribution")
    val companyContribution: kotlin.Float? = null,

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

        @field:JsonProperty("employee")
        val employee: JsonNode?,

        @field:JsonProperty("provider_name")
        val providerName: JsonNode?,

        @field:JsonProperty("benefit_plan_type")
        val benefitPlanType: JsonNode?,

        @field:JsonProperty("employee_contribution")
        val employeeContribution: JsonNode?,

        @field:JsonProperty("company_contribution")
        val companyContribution: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: Benefit.Expanded): Benefit {
            return Benefit(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                employee = ApiClient.jsonConvertSafe(expanded.employee),
                providerName = ApiClient.jsonConvertSafe(expanded.providerName),
                benefitPlanType = ApiClient.jsonConvertSafe(expanded.benefitPlanType),
                employeeContribution = ApiClient.jsonConvertSafe(expanded.employeeContribution),
                companyContribution = ApiClient.jsonConvertSafe(expanded.companyContribution),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted)
            )
        }
    }
}

