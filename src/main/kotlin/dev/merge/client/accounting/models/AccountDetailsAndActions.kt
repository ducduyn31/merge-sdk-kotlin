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

import dev.merge.client.accounting.models.AccountDetailsAndActionsIntegration
import dev.merge.client.accounting.models.AccountDetailsAndActionsStatusEnum
import dev.merge.client.accounting.models.CategoryEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The LinkedAccount Object ### Description The `LinkedAccount` object is used to represent an end user's link with a specific integration.  ### Usage Example View a list of your organization's `LinkedAccount` objects.
 *
 * @param id 
 * @param status 
 * @param endUserOrganizationName 
 * @param endUserEmailAddress 
 * @param webhookListenerUrl 
 * @param category 
 * @param statusDetail 
 * @param endUserOriginId 
 * @param isDuplicate Whether a Production Linked Account's credentials match another existing Production Linked Account. This field is `null` for Test Linked Accounts, incomplete Production Linked Accounts, and ignored duplicate Production Linked Account sets.
 * @param integration 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class AccountDetailsAndActions (

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("status")
    val status: AccountDetailsAndActionsStatusEnum?,

    @field:JsonProperty("end_user_organization_name")
    val endUserOrganizationName: kotlin.String,

    @field:JsonProperty("end_user_email_address")
    val endUserEmailAddress: kotlin.String,

    @field:JsonProperty("webhook_listener_url")
    val webhookListenerUrl: kotlin.String,

    @field:JsonProperty("category")
    val category: CategoryEnum? = null,

    @field:JsonProperty("status_detail")
    val statusDetail: kotlin.String? = null,

    @field:JsonProperty("end_user_origin_id")
    val endUserOriginId: kotlin.String? = null,

    /* Whether a Production Linked Account's credentials match another existing Production Linked Account. This field is `null` for Test Linked Accounts, incomplete Production Linked Accounts, and ignored duplicate Production Linked Account sets. */
    @field:JsonProperty("is_duplicate")
    val isDuplicate: kotlin.Boolean? = null,

    @field:JsonProperty("integration")
    val integration: AccountDetailsAndActionsIntegration? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("id")
        val id: JsonNode,

        @field:JsonProperty("status")
        val status: JsonNode,

        @field:JsonProperty("end_user_organization_name")
        val endUserOrganizationName: JsonNode,

        @field:JsonProperty("end_user_email_address")
        val endUserEmailAddress: JsonNode,

        @field:JsonProperty("webhook_listener_url")
        val webhookListenerUrl: JsonNode,

        @field:JsonProperty("category")
        val category: JsonNode?,

        @field:JsonProperty("status_detail")
        val statusDetail: JsonNode?,

        @field:JsonProperty("end_user_origin_id")
        val endUserOriginId: JsonNode?,

        @field:JsonProperty("is_duplicate")
        val isDuplicate: JsonNode?,

        @field:JsonProperty("integration")
        val integration: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: AccountDetailsAndActions.Expanded): AccountDetailsAndActions {
            return AccountDetailsAndActions(
                id = ApiClient.jsonConvertRequiredSafe(expanded.id),
                status = ApiClient.jsonConvertRequiredSafe(expanded.status),
                endUserOrganizationName = ApiClient.jsonConvertRequiredSafe(expanded.endUserOrganizationName),
                endUserEmailAddress = ApiClient.jsonConvertRequiredSafe(expanded.endUserEmailAddress),
                webhookListenerUrl = ApiClient.jsonConvertRequiredSafe(expanded.webhookListenerUrl),
                category = ApiClient.jsonConvertSafe(expanded.category),
                statusDetail = ApiClient.jsonConvertSafe(expanded.statusDetail),
                endUserOriginId = ApiClient.jsonConvertSafe(expanded.endUserOriginId),
                isDuplicate = ApiClient.jsonConvertSafe(expanded.isDuplicate),
                integration = ApiClient.jsonConvertSafe(expanded.integration)
            )
        }
    }
}

