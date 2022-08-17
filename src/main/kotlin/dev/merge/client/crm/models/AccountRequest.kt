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
 * # The Account Object ### Description The `Account` object is used to represent an account in the remote system. ### Usage Example TODO
 *
 * @param remoteId The third-party API ID of the matching object.
 * @param owner 
 * @param name The account's name.
 * @param description The account's description.
 * @param industry The account's industry.
 * @param website The account's website.
 * @param numberOfEmployees The account's number of employees.
 * @param lastActivityAt When the account's last activity  occurred.
 * @param remoteUpdatedAt When the third party's account was updated.
 * @param remoteCreatedAt When the third party's account was created.
 * @param integrationParams 
 * @param linkedAccountParams 
 */

data class AccountRequest (

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("owner")
    val owner: java.util.UUID? = null,

    /* The account's name. */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* The account's description. */
    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    /* The account's industry. */
    @field:JsonProperty("industry")
    val industry: kotlin.String? = null,

    /* The account's website. */
    @field:JsonProperty("website")
    val website: java.net.URI? = null,

    /* The account's number of employees. */
    @field:JsonProperty("number_of_employees")
    val numberOfEmployees: kotlin.Int? = null,

    /* When the account's last activity  occurred. */
    @field:JsonProperty("last_activity_at")
    val lastActivityAt: java.time.OffsetDateTime? = null,

    /* When the third party's account was updated. */
    @field:JsonProperty("remote_updated_at")
    val remoteUpdatedAt: java.time.OffsetDateTime? = null,

    /* When the third party's account was created. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("integration_params")
    val integrationParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("linked_account_params")
    val linkedAccountParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

) {

    data class Expanded(
        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("owner")
        val owner: JsonNode?,

        @field:JsonProperty("name")
        val name: JsonNode?,

        @field:JsonProperty("description")
        val description: JsonNode?,

        @field:JsonProperty("industry")
        val industry: JsonNode?,

        @field:JsonProperty("website")
        val website: JsonNode?,

        @field:JsonProperty("number_of_employees")
        val numberOfEmployees: JsonNode?,

        @field:JsonProperty("last_activity_at")
        val lastActivityAt: JsonNode?,

        @field:JsonProperty("remote_updated_at")
        val remoteUpdatedAt: JsonNode?,

        @field:JsonProperty("remote_created_at")
        val remoteCreatedAt: JsonNode?,

        @field:JsonProperty("integration_params")
        val integrationParams: JsonNode?,

        @field:JsonProperty("linked_account_params")
        val linkedAccountParams: JsonNode?

    )


    companion object {
        fun normalize(expanded: AccountRequest.Expanded): AccountRequest {
            return AccountRequest(
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                owner = ApiClient.jsonConvertSafe(expanded.owner),
                name = ApiClient.jsonConvertSafe(expanded.name),
                description = ApiClient.jsonConvertSafe(expanded.description),
                industry = ApiClient.jsonConvertSafe(expanded.industry),
                website = ApiClient.jsonConvertSafe(expanded.website),
                numberOfEmployees = ApiClient.jsonConvertSafe(expanded.numberOfEmployees),
                lastActivityAt = ApiClient.jsonConvertSafe(expanded.lastActivityAt),
                remoteUpdatedAt = ApiClient.jsonConvertSafe(expanded.remoteUpdatedAt),
                remoteCreatedAt = ApiClient.jsonConvertSafe(expanded.remoteCreatedAt),
                integrationParams = ApiClient.jsonConvertSafe(expanded.integrationParams),
                linkedAccountParams = ApiClient.jsonConvertSafe(expanded.linkedAccountParams)
            )
        }
    }
}

