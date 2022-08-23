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

import dev.merge.client.accounting.models.CurrencyEnum
import dev.merge.client.accounting.models.JournalLine
import dev.merge.client.shared.RemoteData

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The JournalEntry Object ### Description The `JournalEntry` object is used to represent a company's journey entries.  ### Usage Example Fetch from the `GET JournalEntry` endpoint and view a company's journey entry.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param remoteData 
 * @param transactionDate The journal entry's transaction date.
 * @param remoteCreatedAt When the third party's journal entry was created.
 * @param payments Array of `Payment` object IDs.
 * @param memo The journal entry's private note.
 * @param currency The journal's currency.
 * @param lines 
 * @param remoteWasDeleted 
 */

data class JournalEntry (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    /* The journal entry's transaction date. */
    @field:JsonProperty("transaction_date")
    val transactionDate: java.time.OffsetDateTime? = null,

    /* When the third party's journal entry was created. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null,

    /* Array of `Payment` object IDs. */
    @field:JsonProperty("payments")
    val payments: kotlin.collections.List<java.util.UUID>? = null,

    /* The journal entry's private note. */
    @field:JsonProperty("memo")
    val memo: kotlin.String? = null,

    /* The journal's currency. */
    @field:JsonProperty("currency")
    val currency: CurrencyEnum? = null,

    @field:JsonProperty("lines")
    val lines: kotlin.collections.List<JournalLine>? = null,

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

        @field:JsonProperty("transaction_date")
        val transactionDate: JsonNode?,

        @field:JsonProperty("remote_created_at")
        val remoteCreatedAt: JsonNode?,

        @field:JsonProperty("payments")
        val payments: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("memo")
        val memo: JsonNode?,

        @field:JsonProperty("currency")
        val currency: JsonNode?,

        @field:JsonProperty("lines")
        val lines: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: JournalEntry.Expanded): JournalEntry {
            return JournalEntry(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData),
                transactionDate = ApiClient.jsonConvertSafe(expanded.transactionDate),
                remoteCreatedAt = ApiClient.jsonConvertSafe(expanded.remoteCreatedAt),
                payments = ApiClient.jsonConvertSafe(expanded.payments),
                memo = ApiClient.jsonConvertSafe(expanded.memo),
                currency = ApiClient.jsonConvertSafe(expanded.currency),
                lines = ApiClient.jsonConvertSafe(expanded.lines),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted)
            )
        }
    }
}

