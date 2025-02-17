
# Comment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**user** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**contact** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**body** | **kotlin.String** | The comment&#39;s text body. |  [optional]
**htmlBody** | **kotlin.String** | The comment&#39;s text body formatted as html. |  [optional]
**ticket** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**isPrivate** | **kotlin.Boolean** | Whether or not the comment is internal. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s comment was created. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** |  |  [optional] [readonly]



