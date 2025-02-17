
# Contact

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**name** | **kotlin.String** | The contact&#39;s name. |  [optional]
**emailAddress** | **kotlin.String** | The contact&#39;s email address. |  [optional]
**phoneNumber** | **kotlin.String** | The contact&#39;s phone number. |  [optional]
**details** | **kotlin.String** | The contact&#39;s details. |  [optional]
**account** | [**java.util.UUID**](java.util.UUID.md) | The contact&#39;s account. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]



