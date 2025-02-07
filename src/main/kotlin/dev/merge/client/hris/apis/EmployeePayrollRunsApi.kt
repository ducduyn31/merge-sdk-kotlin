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

import dev.merge.client.hris.models.EmployeePayrollRun

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

open class EmployeePayrollRunsApi(
baseUrl: String = ApiClient.BASE_URL + "hris/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class EmployeePayrollRunsListRequest (
        val createdAfter: java.time.OffsetDateTime? = null,
        val createdBefore: java.time.OffsetDateTime? = null,
        val cursor: kotlin.String? = null,
        val employeeId: kotlin.String? = null,
        val endedAfter: java.time.OffsetDateTime? = null,
        val endedBefore: java.time.OffsetDateTime? = null,
        val expand: kotlin.String? = null,
        val includeDeletedData: kotlin.Boolean? = null,
        val includeRemoteData: kotlin.Boolean? = null,
        val modifiedAfter: java.time.OffsetDateTime? = null,
        val modifiedBefore: java.time.OffsetDateTime? = null,
        val pageSize: kotlin.Int? = null,
        val payrollRunId: kotlin.String? = null,
        val remoteId: kotlin.String? = null,
        val startedAfter: java.time.OffsetDateTime? = null,
        val startedBefore: java.time.OffsetDateTime? = null
    )

    data class EmployeePayrollRunsRetrieveRequest (
        val id: java.util.UUID,
        val expand: kotlin.String? = null,
        val includeRemoteData: kotlin.Boolean? = null
    )

    /**
    * 
    * Returns a list of &#x60;EmployeePayrollRun&#x60; objects.
     * @param createdAfter If provided, will only return objects created after this datetime. (optional)
     * @param createdBefore If provided, will only return objects created before this datetime. (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param employeeId If provided, will only return employee payroll runs for this employee. (optional)
     * @param endedAfter If provided, will only return employee payroll runs ended after this datetime. (optional)
     * @param endedBefore If provided, will only return employee payroll runs ended before this datetime. (optional)
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional)
     * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param payrollRunId If provided, will only return employee payroll runs for this employee. (optional)
     * @param remoteId The API provider&#39;s ID for the given object. (optional)
     * @param startedAfter If provided, will only return employee payroll runs started after this datetime. (optional)
     * @param startedBefore If provided, will only return employee payroll runs started before this datetime. (optional)
     * @return PaginatedEmployeePayrollRunList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun employeePayrollRunsList(requestModel: EmployeePayrollRunsApi.EmployeePayrollRunsListRequest): MergePaginatedResponse<EmployeePayrollRun> {
        return employeePayrollRunsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun employeePayrollRunsListAsync(requestModel: EmployeePayrollRunsApi.EmployeePayrollRunsListRequest): CompletableFuture<MergePaginatedResponse<EmployeePayrollRun>> = GlobalScope.future {
        employeePayrollRunsList(requestModel)
    }

    /**
     * @param createdAfter If provided, will only return objects created after this datetime. (optional) * @param createdBefore If provided, will only return objects created before this datetime. (optional) * @param cursor The pagination cursor value. (optional) * @param employeeId If provided, will only return employee payroll runs for this employee. (optional) * @param endedAfter If provided, will only return employee payroll runs ended after this datetime. (optional) * @param endedBefore If provided, will only return employee payroll runs ended before this datetime. (optional) * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional) * @param includeDeletedData Whether to include data that was marked as deleted by third party webhooks. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional) * @param modifiedAfter If provided, will only return objects modified after this datetime. (optional) * @param modifiedBefore If provided, will only return objects modified before this datetime. (optional) * @param pageSize Number of results to return per page. (optional) * @param payrollRunId If provided, will only return employee payroll runs for this employee. (optional) * @param remoteId The API provider&#39;s ID for the given object. (optional) * @param startedAfter If provided, will only return employee payroll runs started after this datetime. (optional) * @param startedBefore If provided, will only return employee payroll runs started before this datetime. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun employeePayrollRunsListExpanded(requestModel: EmployeePayrollRunsApi.EmployeePayrollRunsListRequest): MergePaginatedResponse<EmployeePayrollRun.Expanded> {
        return employeePayrollRunsListImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun employeePayrollRunsListExpandedAsync(requestModel: EmployeePayrollRunsApi.EmployeePayrollRunsListRequest): CompletableFuture<MergePaginatedResponse<EmployeePayrollRun.Expanded>> = GlobalScope.future {
        employeePayrollRunsListExpanded(requestModel)
    }

    private suspend inline fun <reified T> employeePayrollRunsListImpl(requestModel: EmployeePayrollRunsApi.EmployeePayrollRunsListRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.createdAfter?.apply { localVariableQuery["created_after"] = listOf("$this") }
            requestModel.createdBefore?.apply { localVariableQuery["created_before"] = listOf("$this") }
            requestModel.cursor?.apply { localVariableQuery["cursor"] = listOf(this) }
            requestModel.employeeId?.apply { localVariableQuery["employee_id"] = listOf(this) }
            requestModel.endedAfter?.apply { localVariableQuery["ended_after"] = listOf("$this") }
            requestModel.endedBefore?.apply { localVariableQuery["ended_before"] = listOf("$this") }
            requestModel.expand?.apply { localVariableQuery["expand"] = listOf(this) }
            requestModel.includeDeletedData?.apply { localVariableQuery["include_deleted_data"] = listOf("$this") }
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }
            requestModel.modifiedAfter?.apply { localVariableQuery["modified_after"] = listOf("$this") }
            requestModel.modifiedBefore?.apply { localVariableQuery["modified_before"] = listOf("$this") }
            requestModel.pageSize?.apply { localVariableQuery["page_size"] = listOf("$this") }
            requestModel.payrollRunId?.apply { localVariableQuery["payroll_run_id"] = listOf(this) }
            requestModel.remoteId?.apply { localVariableQuery["remote_id"] = listOf(this) }
            requestModel.startedAfter?.apply { localVariableQuery["started_after"] = listOf("$this") }
            requestModel.startedBefore?.apply { localVariableQuery["started_before"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/employee-payroll-runs",
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
    * Returns an &#x60;EmployeePayrollRun&#x60; object with the given &#x60;id&#x60;.
     * @param id  
     * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional)
     * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
     * @return EmployeePayrollRun
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun employeePayrollRunsRetrieve(requestModel: EmployeePayrollRunsApi.EmployeePayrollRunsRetrieveRequest): EmployeePayrollRun {
        return employeePayrollRunsRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun employeePayrollRunsRetrieveAsync(requestModel: EmployeePayrollRunsApi.EmployeePayrollRunsRetrieveRequest): CompletableFuture<EmployeePayrollRun> = GlobalScope.future {
        employeePayrollRunsRetrieve(requestModel)
    }

    /**
     * @param id   * @param expand Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces. (optional) * @param includeRemoteData Whether to include the original data Merge fetched from the third-party to produce these models. (optional)
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun employeePayrollRunsRetrieveExpanded(requestModel: EmployeePayrollRunsApi.EmployeePayrollRunsRetrieveRequest): EmployeePayrollRun.Expanded {
        return employeePayrollRunsRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun employeePayrollRunsRetrieveExpandedAsync(requestModel: EmployeePayrollRunsApi.EmployeePayrollRunsRetrieveRequest): CompletableFuture<EmployeePayrollRun.Expanded> = GlobalScope.future {
        employeePayrollRunsRetrieveExpanded(requestModel)
    }

    private suspend inline fun <reified T> employeePayrollRunsRetrieveImpl(requestModel: EmployeePayrollRunsApi.EmployeePayrollRunsRetrieveRequest): T {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
            requestModel.expand?.apply { localVariableQuery["expand"] = listOf(this) }
            requestModel.includeRemoteData?.apply { localVariableQuery["include_remote_data"] = listOf("$this") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/employee-payroll-runs/{id}".replace("{" + "id" + "}", "$requestModel.id"),
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
