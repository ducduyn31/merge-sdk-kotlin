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


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The AccountingPhoneNumber Object ### Description The `AccountingPhoneNumber` object is used to represent a contact's or company's phone number.  ### Usage Example Fetch from the `GET CompanyInfo` endpoint and view the company's phone numbers.
 *
 * @param number The phone number.
 * @param type The phone number's type.
 */

data class AccountingPhoneNumber (

    /* The phone number. */
    @field:JsonProperty("number")
    val number: kotlin.String? = null,

    /* The phone number's type. */
    @field:JsonProperty("type")
    val type: kotlin.String? = null

) {

    data class Expanded(
        @field:JsonProperty("number")
        val number: JsonNode?,

        @field:JsonProperty("type")
        val type: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: AccountingPhoneNumber.Expanded): AccountingPhoneNumber {
            return AccountingPhoneNumber(
                number = ApiClient.jsonConvertSafe(expanded.number),
                type = ApiClient.jsonConvertSafe(expanded.type)
            )
        }
    }
}

