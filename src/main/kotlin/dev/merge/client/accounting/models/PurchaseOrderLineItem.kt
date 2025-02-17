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
 * # The PurchaseOrderLineItem Object ### Description The `PurchaseOrderLineItem` object is used to represent a purchase order's line item.  ### Usage Example Fetch from the `GET PurchaseOrder` endpoint and view a company's purchase orders.
 *
 * @param description The line item's description.
 * @param unitPrice The line item's unit price.
 * @param quantity The line item's quantity.
 * @param item 
 * @param account The purchase order line item's account.
 * @param trackingCategory The purchase order line item's associated tracking category.
 * @param taxAmount The purchase order line item's tax amount.
 * @param totalLineAmount The purchase order line item's total amount.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class PurchaseOrderLineItem (

    /* The line item's description. */
    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    /* The line item's unit price. */
    @field:JsonProperty("unit_price")
    val unitPrice: kotlin.Float? = null,

    /* The line item's quantity. */
    @field:JsonProperty("quantity")
    val quantity: kotlin.Float? = null,

    @field:JsonProperty("item")
    val item: java.util.UUID? = null,

    /* The purchase order line item's account. */
    @field:JsonProperty("account")
    val account: java.util.UUID? = null,

    /* The purchase order line item's associated tracking category. */
    @field:JsonProperty("tracking_category")
    val trackingCategory: java.util.UUID? = null,

    /* The purchase order line item's tax amount. */
    @field:JsonProperty("tax_amount")
    val taxAmount: java.math.BigDecimal? = null,

    /* The purchase order line item's total amount. */
    @field:JsonProperty("total_line_amount")
    val totalLineAmount: java.math.BigDecimal? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("description")
        val description: JsonNode?,

        @field:JsonProperty("unit_price")
        val unitPrice: JsonNode?,

        @field:JsonProperty("quantity")
        val quantity: JsonNode?,

        @field:JsonProperty("item")
        val item: JsonNode?,

        @field:JsonProperty("account")
        val account: JsonNode?,

        @field:JsonProperty("tracking_category")
        val trackingCategory: JsonNode?,

        @field:JsonProperty("tax_amount")
        val taxAmount: JsonNode?,

        @field:JsonProperty("total_line_amount")
        val totalLineAmount: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: PurchaseOrderLineItem.Expanded): PurchaseOrderLineItem {
            return PurchaseOrderLineItem(
                description = ApiClient.jsonConvertSafe(expanded.description),
                unitPrice = ApiClient.jsonConvertSafe(expanded.unitPrice),
                quantity = ApiClient.jsonConvertSafe(expanded.quantity),
                item = ApiClient.jsonConvertSafe(expanded.item),
                account = ApiClient.jsonConvertSafe(expanded.account),
                trackingCategory = ApiClient.jsonConvertSafe(expanded.trackingCategory),
                taxAmount = ApiClient.jsonConvertSafe(expanded.taxAmount),
                totalLineAmount = ApiClient.jsonConvertSafe(expanded.totalLineAmount)
            )
        }
    }
}

