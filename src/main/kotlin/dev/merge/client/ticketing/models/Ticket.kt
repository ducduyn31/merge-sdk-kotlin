/**
 * Merge Ticketing API
 *
 * The unified API for building rich integrations with multiple Ticketing platforms.
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

package dev.merge.client.ticketing.models

import dev.merge.client.shared.RemoteData
import dev.merge.client.ticketing.models.TicketStatusEnum

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Ticket Object ### Description The `Ticket` object is used to represent a ticket or a task within a system.  ### Usage Example TODO
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param name The ticket's name.
 * @param assignees 
 * @param dueDate The ticket's due date.
 * @param status The current status of the ticket.
 * @param description The ticket's description.
 * @param project 
 * @param ticketType The ticket's type.
 * @param account 
 * @param contact 
 * @param parentTicket 
 * @param attachments 
 * @param tags 
 * @param remoteCreatedAt When the third party's ticket was created.
 * @param remoteUpdatedAt When the third party's ticket was updated.
 * @param remoteData 
 * @param remoteWasDeleted 
 */

data class Ticket (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The ticket's name. */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("assignees")
    val assignees: kotlin.collections.List<java.util.UUID>? = null,

    /* The ticket's due date. */
    @field:JsonProperty("due_date")
    val dueDate: java.time.OffsetDateTime? = null,

    /* The current status of the ticket. */
    @field:JsonProperty("status")
    val status: TicketStatusEnum? = null,

    /* The ticket's description. */
    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("project")
    val project: java.util.UUID? = null,

    /* The ticket's type. */
    @field:JsonProperty("ticket_type")
    val ticketType: kotlin.String? = null,

    @field:JsonProperty("account")
    val account: java.util.UUID? = null,

    @field:JsonProperty("contact")
    val contact: java.util.UUID? = null,

    @field:JsonProperty("parent_ticket")
    val parentTicket: java.util.UUID? = null,

    @field:JsonProperty("attachments")
    val attachments: kotlin.collections.List<java.util.UUID>? = null,

    @field:JsonProperty("tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,

    /* When the third party's ticket was created. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null,

    /* When the third party's ticket was updated. */
    @field:JsonProperty("remote_updated_at")
    val remoteUpdatedAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null

) {

    data class Expanded(
        @field:JsonProperty("id")
        val id: JsonNode?,

        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("name")
        val name: JsonNode?,

        @field:JsonProperty("assignees")
        val assignees: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("due_date")
        val dueDate: JsonNode?,

        @field:JsonProperty("status")
        val status: JsonNode?,

        @field:JsonProperty("description")
        val description: JsonNode?,

        @field:JsonProperty("project")
        val project: JsonNode?,

        @field:JsonProperty("ticket_type")
        val ticketType: JsonNode?,

        @field:JsonProperty("account")
        val account: JsonNode?,

        @field:JsonProperty("contact")
        val contact: JsonNode?,

        @field:JsonProperty("parent_ticket")
        val parentTicket: JsonNode?,

        @field:JsonProperty("attachments")
        val attachments: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("tags")
        val tags: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_created_at")
        val remoteCreatedAt: JsonNode?,

        @field:JsonProperty("remote_updated_at")
        val remoteUpdatedAt: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?

    )


    companion object {
        fun normalize(expanded: Ticket.Expanded): Ticket {
            return Ticket(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                name = ApiClient.jsonConvertSafe(expanded.name),
                assignees = ApiClient.jsonConvertSafe(expanded.assignees),
                dueDate = ApiClient.jsonConvertSafe(expanded.dueDate),
                status = ApiClient.jsonConvertSafe(expanded.status),
                description = ApiClient.jsonConvertSafe(expanded.description),
                project = ApiClient.jsonConvertSafe(expanded.project),
                ticketType = ApiClient.jsonConvertSafe(expanded.ticketType),
                account = ApiClient.jsonConvertSafe(expanded.account),
                contact = ApiClient.jsonConvertSafe(expanded.contact),
                parentTicket = ApiClient.jsonConvertSafe(expanded.parentTicket),
                attachments = ApiClient.jsonConvertSafe(expanded.attachments),
                tags = ApiClient.jsonConvertSafe(expanded.tags),
                remoteCreatedAt = ApiClient.jsonConvertSafe(expanded.remoteCreatedAt),
                remoteUpdatedAt = ApiClient.jsonConvertSafe(expanded.remoteUpdatedAt),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted)
            )
        }
    }
}

