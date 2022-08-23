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

import dev.merge.client.shared.RemoteData
import dev.merge.client.ats.models.ScheduledInterviewStatusEnum

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The ScheduledInterview Object ### Description The `ScheduledInterview` object is used to represent an interview. ### Usage Example Fetch from the `LIST ScheduledInterviews` endpoint and filter by `interviewers` to show all office locations.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param application 
 * @param jobInterviewStage 
 * @param organizer 
 * @param interviewers Array of `RemoteUser` IDs.
 * @param location The interview's location.
 * @param startAt When the interview was started.
 * @param endAt When the interview was ended.
 * @param remoteCreatedAt When the third party's interview was created.
 * @param remoteUpdatedAt When the third party's interview was updated.
 * @param status The interview's status.
 * @param remoteData 
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 */

data class ScheduledInterview (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("application")
    val application: java.util.UUID? = null,

    @field:JsonProperty("job_interview_stage")
    val jobInterviewStage: java.util.UUID? = null,

    @field:JsonProperty("organizer")
    val organizer: java.util.UUID? = null,

    /* Array of `RemoteUser` IDs. */
    @field:JsonProperty("interviewers")
    val interviewers: kotlin.collections.List<java.util.UUID>? = null,

    /* The interview's location. */
    @field:JsonProperty("location")
    val location: kotlin.String? = null,

    /* When the interview was started. */
    @field:JsonProperty("start_at")
    val startAt: java.time.OffsetDateTime? = null,

    /* When the interview was ended. */
    @field:JsonProperty("end_at")
    val endAt: java.time.OffsetDateTime? = null,

    /* When the third party's interview was created. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null,

    /* When the third party's interview was updated. */
    @field:JsonProperty("remote_updated_at")
    val remoteUpdatedAt: java.time.OffsetDateTime? = null,

    /* The interview's status. */
    @field:JsonProperty("status")
    val status: ScheduledInterviewStatusEnum? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    /* Indicates whether or not this object has been deleted by third party webhooks. */
    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null

) {

    data class Expanded(
        @field:JsonProperty("id")
        val id: JsonNode?,

        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("application")
        val application: JsonNode?,

        @field:JsonProperty("job_interview_stage")
        val jobInterviewStage: JsonNode?,

        @field:JsonProperty("organizer")
        val organizer: JsonNode?,

        @field:JsonProperty("interviewers")
        val interviewers: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("location")
        val location: JsonNode?,

        @field:JsonProperty("start_at")
        val startAt: JsonNode?,

        @field:JsonProperty("end_at")
        val endAt: JsonNode?,

        @field:JsonProperty("remote_created_at")
        val remoteCreatedAt: JsonNode?,

        @field:JsonProperty("remote_updated_at")
        val remoteUpdatedAt: JsonNode?,

        @field:JsonProperty("status")
        val status: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: ScheduledInterview.Expanded): ScheduledInterview {
            return ScheduledInterview(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                application = ApiClient.jsonConvertSafe(expanded.application),
                jobInterviewStage = ApiClient.jsonConvertSafe(expanded.jobInterviewStage),
                organizer = ApiClient.jsonConvertSafe(expanded.organizer),
                interviewers = ApiClient.jsonConvertSafe(expanded.interviewers),
                location = ApiClient.jsonConvertSafe(expanded.location),
                startAt = ApiClient.jsonConvertSafe(expanded.startAt),
                endAt = ApiClient.jsonConvertSafe(expanded.endAt),
                remoteCreatedAt = ApiClient.jsonConvertSafe(expanded.remoteCreatedAt),
                remoteUpdatedAt = ApiClient.jsonConvertSafe(expanded.remoteUpdatedAt),
                status = ApiClient.jsonConvertSafe(expanded.status),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted)
            )
        }
    }
}

