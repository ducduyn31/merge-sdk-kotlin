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

import dev.merge.client.hris.models.CountryEnum
import dev.merge.client.hris.models.LocationTypeEnum
import dev.merge.client.shared.RemoteData

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Location Object ### Description The `Location` object is used to represent a Location for a Company or Employee address. This is shared across many models and is referenced whenever a location is stored.  ### Usage Example Fetch from the `LIST Locations` endpoint and filter by `ID` to show all office locations.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param name The location's name.
 * @param phoneNumber The location's phone number.
 * @param street1 Line 1 of the location's street address.
 * @param street2 Line 2 of the location's street address.
 * @param city The location's city.
 * @param state The location's state. Represents a region if outside of the US.
 * @param zipCode The location's zip code or postal code.
 * @param country The location's country.
 * @param locationType The location's type. Can be either WORK or HOME
 * @param remoteData 
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class Location (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The location's name. */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* The location's phone number. */
    @field:JsonProperty("phone_number")
    val phoneNumber: kotlin.String? = null,

    /* Line 1 of the location's street address. */
    @field:JsonProperty("street_1")
    val street1: kotlin.String? = null,

    /* Line 2 of the location's street address. */
    @field:JsonProperty("street_2")
    val street2: kotlin.String? = null,

    /* The location's city. */
    @field:JsonProperty("city")
    val city: kotlin.String? = null,

    /* The location's state. Represents a region if outside of the US. */
    @field:JsonProperty("state")
    val state: kotlin.String? = null,

    /* The location's zip code or postal code. */
    @field:JsonProperty("zip_code")
    val zipCode: kotlin.String? = null,

    /* The location's country. */
    @field:JsonProperty("country")
    val country: CountryEnum? = null,

    /* The location's type. Can be either WORK or HOME */
    @field:JsonProperty("location_type")
    val locationType: LocationTypeEnum? = null,

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

        @field:JsonProperty("name")
        val name: JsonNode?,

        @field:JsonProperty("phone_number")
        val phoneNumber: JsonNode?,

        @field:JsonProperty("street_1")
        val street1: JsonNode?,

        @field:JsonProperty("street_2")
        val street2: JsonNode?,

        @field:JsonProperty("city")
        val city: JsonNode?,

        @field:JsonProperty("state")
        val state: JsonNode?,

        @field:JsonProperty("zip_code")
        val zipCode: JsonNode?,

        @field:JsonProperty("country")
        val country: JsonNode?,

        @field:JsonProperty("location_type")
        val locationType: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: Location.Expanded): Location {
            return Location(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                name = ApiClient.jsonConvertSafe(expanded.name),
                phoneNumber = ApiClient.jsonConvertSafe(expanded.phoneNumber),
                street1 = ApiClient.jsonConvertSafe(expanded.street1),
                street2 = ApiClient.jsonConvertSafe(expanded.street2),
                city = ApiClient.jsonConvertSafe(expanded.city),
                state = ApiClient.jsonConvertSafe(expanded.state),
                zipCode = ApiClient.jsonConvertSafe(expanded.zipCode),
                country = ApiClient.jsonConvertSafe(expanded.country),
                locationType = ApiClient.jsonConvertSafe(expanded.locationType),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted)
            )
        }
    }
}

