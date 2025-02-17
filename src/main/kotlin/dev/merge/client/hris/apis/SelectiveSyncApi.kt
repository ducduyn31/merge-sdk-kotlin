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

package dev.merge.client.hris.apis

import dev.merge.client.hris.models.LinkedAccountSelectiveSyncConfiguration
import dev.merge.client.hris.models.LinkedAccountSelectiveSyncConfigurationListRequest
import dev.merge.client.hris.models.ConditionSchema

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

open class SelectiveSyncApi(
baseUrl: String = ApiClient.BASE_URL + "hris/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class SelectiveSyncConfigurationsUpdateRequest (
        val linkedAccountSelectiveSyncConfigurationListRequest: LinkedAccountSelectiveSyncConfigurationListRequest
    )

    data class SelectiveSyncMetaListRequest (
        val commonModel: kotlin.String? = null,
        val cursor: kotlin.Int? = null,
        val pageSize: kotlin.Int? = null
    )

    /**
    * 
    * Get a linked account&#39;s selective syncs.
     * @return kotlin.collections.List<LinkedAccountSelectiveSyncConfiguration>
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun selectiveSyncConfigurationsList(): kotlin.collections.List<LinkedAccountSelectiveSyncConfiguration> {
        return selectiveSyncConfigurationsListImpl()
    }

    @Suppress("UNCHECKED_CAST")
    open fun selectiveSyncConfigurationsListAsync(): CompletableFuture<kotlin.collections.List<LinkedAccountSelectiveSyncConfiguration>> = GlobalScope.future {
        selectiveSyncConfigurationsList()
    }

    /**
    
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun selectiveSyncConfigurationsListExpanded(): kotlin.collections.List<LinkedAccountSelectiveSyncConfiguration.Expanded> {
        return selectiveSyncConfigurationsListImpl()
    }

    @Suppress("UNCHECKED_CAST")
    open fun selectiveSyncConfigurationsListExpandedAsync(): CompletableFuture<kotlin.collections.List<LinkedAccountSelectiveSyncConfiguration.Expanded>> = GlobalScope.future {
        selectiveSyncConfigurationsListExpanded()
    }

    private suspend inline fun <reified T> selectiveSyncConfigurationsListImpl(): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/selective-sync/configurations",
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
    * Replace a linked account&#39;s selective syncs.
     * @param linkedAccountSelectiveSyncConfigurationListRequest  
     * @return kotlin.collections.List<LinkedAccountSelectiveSyncConfiguration>
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun selectiveSyncConfigurationsUpdate(requestModel: SelectiveSyncApi.SelectiveSyncConfigurationsUpdateRequest): kotlin.collections.List<LinkedAccountSelectiveSyncConfiguration> {
        return selectiveSyncConfigurationsUpdateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun selectiveSyncConfigurationsUpdateAsync(requestModel: SelectiveSyncApi.SelectiveSyncConfigurationsUpdateRequest): CompletableFuture<kotlin.collections.List<LinkedAccountSelectiveSyncConfiguration>> = GlobalScope.future {
        selectiveSyncConfigurationsUpdate(requestModel)
    }

    /**
     * @param linkedAccountSelectiveSyncConfigurationListRequest  
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun selectiveSyncConfigurationsUpdateExpanded(requestModel: SelectiveSyncApi.SelectiveSyncConfigurationsUpdateRequest): kotlin.collections.List<LinkedAccountSelectiveSyncConfiguration.Expanded> {
        return selectiveSyncConfigurationsUpdateImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun selectiveSyncConfigurationsUpdateExpandedAsync(requestModel: SelectiveSyncApi.SelectiveSyncConfigurationsUpdateRequest): CompletableFuture<kotlin.collections.List<LinkedAccountSelectiveSyncConfiguration.Expanded>> = GlobalScope.future {
        selectiveSyncConfigurationsUpdateExpanded(requestModel)
    }

    private suspend inline fun <reified T> selectiveSyncConfigurationsUpdateImpl(requestModel: SelectiveSyncApi.SelectiveSyncConfigurationsUpdateRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = requestModel.linkedAccountSelectiveSyncConfigurationListRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.PUT,
        "/selective-sync/configurations",
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
    * Get metadata for the conditions available to a linked account.
     * @param commonModel  (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @return PaginatedConditionSchemaList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun selectiveSyncMetaList(requestModel: SelectiveSyncApi.SelectiveSyncMetaListRequest): MergePaginatedResponse<ConditionSchema> {
        return selectiveSyncMetaListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun selectiveSyncMetaListAsync(requestModel: SelectiveSyncApi.SelectiveSyncMetaListRequest): CompletableFuture<MergePaginatedResponse<ConditionSchema>> = GlobalScope.future {
        selectiveSyncMetaList(requestModel)
    }

    /**
     * @param commonModel  (optional) * @param cursor The pagination cursor value. (optional) * @param pageSize Number of results to return per page. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun selectiveSyncMetaListExpanded(requestModel: SelectiveSyncApi.SelectiveSyncMetaListRequest): MergePaginatedResponse<ConditionSchema.Expanded> {
        return selectiveSyncMetaListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun selectiveSyncMetaListExpandedAsync(requestModel: SelectiveSyncApi.SelectiveSyncMetaListRequest): CompletableFuture<MergePaginatedResponse<ConditionSchema.Expanded>> = GlobalScope.future {
        selectiveSyncMetaListExpanded(requestModel)
    }

    private suspend inline fun <reified T> selectiveSyncMetaListImpl(requestModel: SelectiveSyncApi.SelectiveSyncMetaListRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.commonModel?.apply { localVariableQuery["common_model"] = listOf(this) }
            requestModel.cursor?.apply { localVariableQuery["cursor"] = listOf("$this") }
            requestModel.pageSize?.apply { localVariableQuery["page_size"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/selective-sync/meta",
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
