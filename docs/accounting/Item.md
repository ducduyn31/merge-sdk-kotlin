
# Item

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**name** | **kotlin.String** | The item&#39;s name. |  [optional]
**status** | [**Status7d1Enum**](Status7d1Enum.md) | The item&#39;s status. |  [optional]
**unitPrice** | **kotlin.Float** | The item&#39;s unit price. |  [optional]
**purchasePrice** | **kotlin.Float** | The item&#39;s purchase price. |  [optional]
**purchaseAccount** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**salesAccount** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**remoteUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s item note was updated. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]



