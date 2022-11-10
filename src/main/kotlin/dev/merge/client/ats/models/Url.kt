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

import dev.merge.client.ats.models.UrlTypeEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Url Object ### Description The `Url` object is used to represent hyperlinks associated with the parent model. ### Usage Example Fetch from the `GET Candidate` endpoint and view their website urls.
 *
 * @param `value` The site's url.
 * @param urlType The type of site.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class Url (

    /* The site's url. */
    @field:JsonProperty("value")
    val `value`: java.net.URI? = null,

    /* The type of site. */
    @field:JsonProperty("url_type")
    val urlType: UrlTypeEnum? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("value")
        val `value`: JsonNode?,

        @field:JsonProperty("url_type")
        val urlType: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: Url.Expanded): Url {
            return Url(
                `value` = ApiClient.jsonConvertSafe(expanded.`value`),
                urlType = ApiClient.jsonConvertSafe(expanded.urlType)
            )
        }
    }
}

