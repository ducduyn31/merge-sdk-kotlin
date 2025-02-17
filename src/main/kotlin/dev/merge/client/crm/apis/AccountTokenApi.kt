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

import dev.merge.client.crm.models.AccountToken

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

open class AccountTokenApi(
baseUrl: String = ApiClient.BASE_URL + "crm/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: (HttpClientConfig<*>.() -> Unit)? = null,
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class AccountTokenRetrieveRequest (
        val publicToken: kotlin.String
    )

    /**
    * 
    * Returns the account token for the end user with the provided public token.
     * @param publicToken  
     * @return AccountToken
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun accountTokenRetrieve(requestModel: AccountTokenApi.AccountTokenRetrieveRequest): AccountToken {
        return accountTokenRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun accountTokenRetrieveAsync(requestModel: AccountTokenApi.AccountTokenRetrieveRequest): CompletableFuture<AccountToken> = GlobalScope.future {
        accountTokenRetrieve(requestModel)
    }

    /**
     * @param publicToken  
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun accountTokenRetrieveExpanded(requestModel: AccountTokenApi.AccountTokenRetrieveRequest): AccountToken.Expanded {
        return accountTokenRetrieveImpl(requestModel)
    }

    @Suppress("UNCHECKED_CAST")
    open fun accountTokenRetrieveExpandedAsync(requestModel: AccountTokenApi.AccountTokenRetrieveRequest): CompletableFuture<AccountToken.Expanded> = GlobalScope.future {
        accountTokenRetrieveExpanded(requestModel)
    }

    private suspend inline fun <reified T> accountTokenRetrieveImpl(requestModel: AccountTokenApi.AccountTokenRetrieveRequest): T {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/account-token/{public_token}".replace("{" + "public_token" + "}", "$requestModel.publicToken"),
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
