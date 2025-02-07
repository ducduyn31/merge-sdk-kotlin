
# EEOC

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**candidate** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**submittedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the information was submitted. |  [optional]
**race** | [**RaceEnum**](RaceEnum.md) | The candidate&#39;s race. |  [optional]
**gender** | [**GenderEnum**](GenderEnum.md) | The candidate&#39;s gender. |  [optional]
**veteranStatus** | [**VeteranStatusEnum**](VeteranStatusEnum.md) | The candidate&#39;s veteran status. |  [optional]
**disabilityStatus** | [**DisabilityStatusEnum**](DisabilityStatusEnum.md) | The candidate&#39;s disability status. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]



