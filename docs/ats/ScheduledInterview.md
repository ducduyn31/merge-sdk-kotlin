
# ScheduledInterview

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**application** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**jobInterviewStage** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**organizer** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**interviewers** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Array of &#x60;RemoteUser&#x60; IDs. |  [optional]
**location** | **kotlin.String** | The interview&#39;s location. |  [optional]
**startAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the interview was started. |  [optional]
**endAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the interview was ended. |  [optional]
**remoteCreatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s interview was created. |  [optional]
**remoteUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the third party&#39;s interview was updated. |  [optional]
**status** | [**ScheduledInterviewStatusEnum**](ScheduledInterviewStatusEnum.md) | The interview&#39;s status. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]



