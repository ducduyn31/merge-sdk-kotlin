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

import dev.merge.client.shared.RemoteData
import dev.merge.client.accounting.models.ReportItem

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The BalanceSheet Object ### Description The `BalanceSheet` object is used to represent a company's balance sheet.  ### Usage Example Fetch from the `LIST BalanceSheets` endpoint and view a company's balance sheets.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param remoteData 
 * @param name The balance sheet's name.
 * @param date The balance sheet's date. The balance sheet data will reflect the company's financial position this point in time.
 * @param netAssets The balance sheet's net assets.
 * @param assets 
 * @param liabilities 
 * @param equity 
 * @param remoteGeneratedAt The time that balance sheet was generated by the accounting system.
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 */

data class BalanceSheet (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    /* The balance sheet's name. */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* The balance sheet's date. The balance sheet data will reflect the company's financial position this point in time. */
    @field:JsonProperty("date")
    val date: java.time.OffsetDateTime? = null,

    /* The balance sheet's net assets. */
    @field:JsonProperty("net_assets")
    val netAssets: kotlin.Float? = null,

    @field:JsonProperty("assets")
    val assets: kotlin.collections.List<ReportItem>? = null,

    @field:JsonProperty("liabilities")
    val liabilities: kotlin.collections.List<ReportItem>? = null,

    @field:JsonProperty("equity")
    val equity: kotlin.collections.List<ReportItem>? = null,

    /* The time that balance sheet was generated by the accounting system. */
    @field:JsonProperty("remote_generated_at")
    val remoteGeneratedAt: java.time.OffsetDateTime? = null,

    /* Indicates whether or not this object has been deleted by third party webhooks. */
    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null

) {

    data class Expanded(
        @field:JsonProperty("id")
        val id: JsonNode?,

        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("name")
        val name: JsonNode?,

        @field:JsonProperty("date")
        val date: JsonNode?,

        @field:JsonProperty("net_assets")
        val netAssets: JsonNode?,

        @field:JsonProperty("assets")
        val assets: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("liabilities")
        val liabilities: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("equity")
        val equity: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_generated_at")
        val remoteGeneratedAt: JsonNode?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: BalanceSheet.Expanded): BalanceSheet {
            return BalanceSheet(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData),
                name = ApiClient.jsonConvertSafe(expanded.name),
                date = ApiClient.jsonConvertSafe(expanded.date),
                netAssets = ApiClient.jsonConvertSafe(expanded.netAssets),
                assets = ApiClient.jsonConvertSafe(expanded.assets),
                liabilities = ApiClient.jsonConvertSafe(expanded.liabilities),
                equity = ApiClient.jsonConvertSafe(expanded.equity),
                remoteGeneratedAt = ApiClient.jsonConvertSafe(expanded.remoteGeneratedAt),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted)
            )
        }
    }
}

