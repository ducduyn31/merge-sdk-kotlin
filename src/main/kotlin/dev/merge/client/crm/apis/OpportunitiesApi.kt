/**
 * Merge CRM API
 *
 * The unified API for building rich integrations with multiple CRM platforms.
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

package dev.merge.client.crm.apis

import dev.merge.client.crm.models.MetaResponse
import dev.merge.client.crm.models.Opportunity
import dev.merge.client.crm.models.OpportunityEndpointRequest
import dev.merge.client.crm.models.OpportunityResponse
import dev.merge.client.crm.models.PatchedOpportunityEndpointRequest

import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.http.ParametersBuilder
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.jackson.jackson
import io.ktor.client.call.body
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.future.future
import java.util.concurrent.CompletableFuture

import com.fasterxml.jackson.databind.ObjectMapper

import dev.merge.client.shared.*

open class OpportunitiesApi(
baseUrl: String = ApiClient.BASE_URL + "crm/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class OpportunitiesCreateRequest (
        val opportunityEndpointRequest: OpportunityEndpointRequest,
        val isDebugMode: kotlin.Boolean? = null,
        val runAsync: kotlin.Boolean? = null
    )

    data class OpportunitiesListRequest (
        val accountId: kotlin.String? = null,
        val createdAfter: java.time.OffsetDateTime? = null,
        val createdBefore: java.time.OffsetDateTime? = null,
        val cursor: kotlin.String? = null,
        val expand: kotlin.String? = null,
        val includeDeletedData: kotlin.Boolean? = null,
        val includeRemoteData: kotlin.Boolean? = null,
        val modifiedAfter: java.time.OffsetDateTime? = null,
        val modifiedBefore: java.time.OffsetDateTime? = null,
        val ownerId: kotlin.String? = null,
        val pageSize: kotlin.Int? = null,
        val remoteFields: kotlin.String? = null,
        val remoteId: kotlin.String? = null,
        val stageId: kotlin.String? = null,
        val status: kotlin.String? = null
    )

    data class OpportunitiesMetaPatchRetrieveRequest (
        val id: java.util.UUID
    )

    data class OpportunitiesPartialUpdateRequest (
        val id: java.util.UUID,
        val patchedOpportunityEndpointRequest: PatchedOpportunityEndpointRequest,
        val isDebugMode: kotlin.Boolean? = null,
        val runAsync: kotlin.Boolean? = null
    )

    data class OpportunitiesRetrieveRequest (
        val id: java.util.UUID,
        val expand: kotlin.String? = null,
        val includeRemoteData: kotlin.Boolean? = null,
        val remoteFields: kotlin.String? = null
    )

    /**
    * 
    * Creates an &#x60;Opportunity&#x60; object with the given values.
     * @param opportunityEndpointRequest  
     * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional)
     * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
     * @return OpportunityResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun opportunitiesCreate(requestModel: OpportunitiesApi.OpportunitiesCreateRequest): OpportunityResponse {
        return opportunitiesCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun opportunitiesCreateAsync(requestModel: OpportunitiesApi.OpportunitiesCreateRequest): CompletableFuture<OpportunityResponse> = GlobalScope.future {
        opportunitiesCreate(requestModel)
    }

    /**
     * @param opportunityEndpointRequest   * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional) * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun opportunitiesCreateExpanded(requestModel: OpportunitiesApi.OpportunitiesCreateRequest): OpportunityResponse.Expanded {
        return opportunitiesCreateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun opportunitiesCreateExpandedAsync(requestModel: OpportunitiesApi.OpportunitiesCreateRequest): CompletableFuture<OpportunityResponse.Expanded> = GlobalScope.future {
        opportunitiesCreateExpanded(requestModel)
    }

    private suspend inline fun <reified T> opportunitiesCreateImpl(requestModel: OpportunitiesApi.OpportunitiesCreateRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = requestModel.opportunityEndpointRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.isDebugMode?.apply { localVariableQuery["is_debug_mode"] = listOf("$this") }
            requestModel.runAsync?.apply { localVariableQuery["run_async"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.POST,
        "/opportunities",
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return jsonRequest(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).body()
    }

    /**
    * 
    * Returns a list of &#x60;Opportunity&#x60; objects.
     * @param accountId If provided, will only return opportunities with this account. (optional)
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param ownerId If provided, will only return opportunities with this owner. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param remoteFields Which fields should be returned in non-normalized form. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @param stageId If provided, will only return opportunities with this stage. (optional)
     * @param status If provided, will only return opportunities with this status. Options: (&#39;OPEN&#39;, &#39;WON&#39;, &#39;LOST&#39;) (optional)
     * @return PaginatedOpportunityList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun opportunitiesList(requestModel: OpportunitiesApi.OpportunitiesListRequest): MergePaginatedResponse<Opportunity> {
        return opportunitiesListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun opportunitiesListAsync(requestModel: OpportunitiesApi.OpportunitiesListRequest): CompletableFuture<MergePaginatedResponse<Opportunity>> = GlobalScope.future {
        opportunitiesList(requestModel)
    }

    /**
     * @param accountId If provided, will only return opportunities with this account. (optional) * @param createdAfter If provided, will only return objects created after this datetime. (optional) * @param createdBefore If provided, will only return objects created before this datetime. (optional) * @param cursor The pagination cursor value. (optional) * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional) * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional) * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional) * @param ownerId If provided, will only return opportunities with this owner. (optional) * @param pageSize Number of results to return per page. (optional) * @param remoteFields Which fields should be returned in non-normalized form. (optional) * @param remoteId The API provider&#39;s ID for the given object. (optional) * @param stageId If provided, will only return opportunities with this stage. (optional) * @param status If provided, will only return opportunities with this status. Options: (&#39;OPEN&#39;, &#39;WON&#39;, &#39;LOST&#39;) (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun opportunitiesListExpanded(requestModel: OpportunitiesApi.OpportunitiesListRequest): MergePaginatedResponse<Opportunity.Expanded> {
        return opportunitiesListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun opportunitiesListExpandedAsync(requestModel: OpportunitiesApi.OpportunitiesListRequest): CompletableFuture<MergePaginatedResponse<Opportunity.Expanded>> = GlobalScope.future {
        opportunitiesListExpanded(requestModel)
    }

    private suspend inline fun <reified T> opportunitiesListImpl(requestModel: OpportunitiesApi.OpportunitiesListRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.accountId?.apply { localVariableQuery["account_id"] = listOf(this) }
            requestModel.createdAfter?.apply { localVariableQuery["created_after"] = listOf("$this") }
            requestModel.createdBefore?.apply { localVariableQuery["created_before"] = listOf("$this") }
            requestModel.cursor?.apply { localVariableQuery["cursor"] = listOf(this) }
            requestModel.expand?.apply { localVariableQuery["expand"] = listOf(this) }
            requestModel.includeDeletedData?.apply { localVariableQuery["include_deleted_data"] = listOf("$this") }
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }
            requestModel.modifiedAfter?.apply { localVariableQuery["modified_after"] = listOf("$this") }
            requestModel.modifiedBefore?.apply { localVariableQuery["modified_before"] = listOf("$this") }
            requestModel.ownerId?.apply { localVariableQuery["owner_id"] = listOf(this) }
            requestModel.pageSize?.apply { localVariableQuery["page_size"] = listOf("$this") }
            requestModel.remoteFields?.apply { localVariableQuery["remote_fields"] = listOf(this) }
            requestModel.remoteId?.apply { localVariableQuery["remote_id"] = listOf(this) }
            requestModel.stageId?.apply { localVariableQuery["stage_id"] = listOf(this) }
            requestModel.status?.apply { localVariableQuery["status"] = listOf(this) }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/opportunities",
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return request(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).body()
    }

    /**
    * 
    * Returns metadata for &#x60;Opportunity&#x60; PATCHs.
     * @param id  
     * @return MetaResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun opportunitiesMetaPatchRetrieve(requestModel: OpportunitiesApi.OpportunitiesMetaPatchRetrieveRequest): MetaResponse {
        return opportunitiesMetaPatchRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun opportunitiesMetaPatchRetrieveAsync(requestModel: OpportunitiesApi.OpportunitiesMetaPatchRetrieveRequest): CompletableFuture<MetaResponse> = GlobalScope.future {
        opportunitiesMetaPatchRetrieve(requestModel)
    }

    /**
     * @param id  
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun opportunitiesMetaPatchRetrieveExpanded(requestModel: OpportunitiesApi.OpportunitiesMetaPatchRetrieveRequest): MetaResponse.Expanded {
        return opportunitiesMetaPatchRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun opportunitiesMetaPatchRetrieveExpandedAsync(requestModel: OpportunitiesApi.OpportunitiesMetaPatchRetrieveRequest): CompletableFuture<MetaResponse.Expanded> = GlobalScope.future {
        opportunitiesMetaPatchRetrieveExpanded(requestModel)
    }

    private suspend inline fun <reified T> opportunitiesMetaPatchRetrieveImpl(requestModel: OpportunitiesApi.OpportunitiesMetaPatchRetrieveRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/opportunities/meta/patch/{id}".replace("{" + "id" + "}", "$requestModel.id"),
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return request(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).body()
    }

    /**
    * 
    * Returns metadata for &#x60;Opportunity&#x60; POSTs.
     * @return MetaResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun opportunitiesMetaPostRetrieve(): MetaResponse {
        return opportunitiesMetaPostRetrieveImpl()
    }

    @Suppress("UNCHECKED_CAST")
    open fun opportunitiesMetaPostRetrieveAsync(): CompletableFuture<MetaResponse> = GlobalScope.future {
        opportunitiesMetaPostRetrieve()
    }

    /**
    
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun opportunitiesMetaPostRetrieveExpanded(): MetaResponse.Expanded {
        return opportunitiesMetaPostRetrieveImpl()
    }

    @Suppress("UNCHECKED_CAST")
    open fun opportunitiesMetaPostRetrieveExpandedAsync(): CompletableFuture<MetaResponse.Expanded> = GlobalScope.future {
        opportunitiesMetaPostRetrieveExpanded()
    }

    private suspend inline fun <reified T> opportunitiesMetaPostRetrieveImpl(): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/opportunities/meta/post",
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return request(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).body()
    }

    /**
    * 
    * Updates an &#x60;Opportunity&#x60; object with the given &#x60;id&#x60;.
     * @param id  
     * @param patchedOpportunityEndpointRequest  
     * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional)
     * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
     * @return OpportunityResponse
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun opportunitiesPartialUpdate(requestModel: OpportunitiesApi.OpportunitiesPartialUpdateRequest): OpportunityResponse {
        return opportunitiesPartialUpdateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun opportunitiesPartialUpdateAsync(requestModel: OpportunitiesApi.OpportunitiesPartialUpdateRequest): CompletableFuture<OpportunityResponse> = GlobalScope.future {
        opportunitiesPartialUpdate(requestModel)
    }

    /**
     * @param id   * @param patchedOpportunityEndpointRequest   * @param isDebugMode Whether to include debug fields (such as log file links) in the response. (optional) * @param runAsync Whether or not third-party updates should be run asynchronously. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun opportunitiesPartialUpdateExpanded(requestModel: OpportunitiesApi.OpportunitiesPartialUpdateRequest): OpportunityResponse.Expanded {
        return opportunitiesPartialUpdateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun opportunitiesPartialUpdateExpandedAsync(requestModel: OpportunitiesApi.OpportunitiesPartialUpdateRequest): CompletableFuture<OpportunityResponse.Expanded> = GlobalScope.future {
        opportunitiesPartialUpdateExpanded(requestModel)
    }

    private suspend inline fun <reified T> opportunitiesPartialUpdateImpl(requestModel: OpportunitiesApi.OpportunitiesPartialUpdateRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = requestModel.patchedOpportunityEndpointRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.isDebugMode?.apply { localVariableQuery["is_debug_mode"] = listOf("$this") }
            requestModel.runAsync?.apply { localVariableQuery["run_async"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.PATCH,
        "/opportunities/{id}".replace("{" + "id" + "}", "$requestModel.id"),
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return jsonRequest(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).body()
    }

    /**
    * 
    * Returns an &#x60;Opportunity&#x60; object with the given &#x60;id&#x60;.
     * @param id  
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param remoteFields Which fields should be returned in non-normalized form. (optional)
     * @return Opportunity
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun opportunitiesRetrieve(requestModel: OpportunitiesApi.OpportunitiesRetrieveRequest): Opportunity {
        return opportunitiesRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun opportunitiesRetrieveAsync(requestModel: OpportunitiesApi.OpportunitiesRetrieveRequest): CompletableFuture<Opportunity> = GlobalScope.future {
        opportunitiesRetrieve(requestModel)
    }

    /**
     * @param id   * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param remoteFields Which fields should be returned in non-normalized form. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun opportunitiesRetrieveExpanded(requestModel: OpportunitiesApi.OpportunitiesRetrieveRequest): Opportunity.Expanded {
        return opportunitiesRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun opportunitiesRetrieveExpandedAsync(requestModel: OpportunitiesApi.OpportunitiesRetrieveRequest): CompletableFuture<Opportunity.Expanded> = GlobalScope.future {
        opportunitiesRetrieveExpanded(requestModel)
    }

    private suspend inline fun <reified T> opportunitiesRetrieveImpl(requestModel: OpportunitiesApi.OpportunitiesRetrieveRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.expand?.apply { localVariableQuery["expand"] = listOf(this) }
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }
            requestModel.remoteFields?.apply { localVariableQuery["remote_fields"] = listOf(this) }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/opportunities/{id}".replace("{" + "id" + "}", "$requestModel.id"),
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return request(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).body()
    }

}
