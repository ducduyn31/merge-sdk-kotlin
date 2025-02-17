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
 * 
 *
 * @param item 
 * @param name The credit note line item's name.
 * @param description The credit note line item's description.
 * @param quantity The credit note line item's quantity.
 * @param memo The credit note line item's memo.
 * @param unitPrice The credit note line item's unit price.
 * @param taxRate The credit note line item's tax rate.
 * @param totalLineAmount The credit note line item's total.
 * @param trackingCategory The purchase order line item's associated tracking category.
 * @param account The credit note line item's account.
 * @param remoteId The third-party API ID of the matching object.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class CreditNoteLineItem (

    @field:JsonProperty("item")
    val item: java.util.UUID? = null,

    /* The credit note line item's name. */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* The credit note line item's description. */
    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    /* The credit note line item's quantity. */
    @field:JsonProperty("quantity")
    val quantity: java.math.BigDecimal? = null,

    /* The credit note line item's memo. */
    @field:JsonProperty("memo")
    val memo: kotlin.String? = null,

    /* The credit note line item's unit price. */
    @field:JsonProperty("unit_price")
    val unitPrice: java.math.BigDecimal? = null,

    /* The credit note line item's tax rate. */
    @field:JsonProperty("tax_rate")
    val taxRate: java.util.UUID? = null,

    /* The credit note line item's total. */
    @field:JsonProperty("total_line_amount")
    val totalLineAmount: java.math.BigDecimal? = null,

    /* The purchase order line item's associated tracking category. */
    @field:JsonProperty("tracking_category")
    val trackingCategory: java.util.UUID? = null,

    /* The credit note line item's account. */
    @field:JsonProperty("account")
    val account: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("item")
        val item: JsonNode?,

        @field:JsonProperty("name")
        val name: JsonNode?,

        @field:JsonProperty("description")
        val description: JsonNode?,

        @field:JsonProperty("quantity")
        val quantity: JsonNode?,

        @field:JsonProperty("memo")
        val memo: JsonNode?,

        @field:JsonProperty("unit_price")
        val unitPrice: JsonNode?,

        @field:JsonProperty("tax_rate")
        val taxRate: JsonNode?,

        @field:JsonProperty("total_line_amount")
        val totalLineAmount: JsonNode?,

        @field:JsonProperty("tracking_category")
        val trackingCategory: JsonNode?,

        @field:JsonProperty("account")
        val account: JsonNode?,

        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: CreditNoteLineItem.Expanded): CreditNoteLineItem {
            return CreditNoteLineItem(
                item = ApiClient.jsonConvertSafe(expanded.item),
                name = ApiClient.jsonConvertSafe(expanded.name),
                description = ApiClient.jsonConvertSafe(expanded.description),
                quantity = ApiClient.jsonConvertSafe(expanded.quantity),
                memo = ApiClient.jsonConvertSafe(expanded.memo),
                unitPrice = ApiClient.jsonConvertSafe(expanded.unitPrice),
                taxRate = ApiClient.jsonConvertSafe(expanded.taxRate),
                totalLineAmount = ApiClient.jsonConvertSafe(expanded.totalLineAmount),
                trackingCategory = ApiClient.jsonConvertSafe(expanded.trackingCategory),
                account = ApiClient.jsonConvertSafe(expanded.account),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId)
            )
        }
    }
}

