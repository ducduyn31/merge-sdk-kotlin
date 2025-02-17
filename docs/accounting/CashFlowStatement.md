
# CashFlowStatement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly]
**remoteId** | **kotlin.String** | The third-party API ID of the matching object. |  [optional]
**remoteData** | [**kotlin.collections.List&lt;RemoteData&gt;**](RemoteData.md) |  |  [optional] [readonly]
**name** | **kotlin.String** | The cash flow statement&#39;s name. |  [optional]
**currency** | [**CurrencyEnum**](CurrencyEnum.md) | The cash flow statement&#39;s currency. |  [optional]
**startPeriod** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The cash flow statement&#39;s start period. |  [optional]
**endPeriod** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The cash flow statement&#39;s end period. |  [optional]
**cashAtBeginningOfPeriod** | **kotlin.Float** | Cash and cash equivalents at the beginning of the cash flow statement&#39;s period. |  [optional]
**cashAtEndOfPeriod** | **kotlin.Float** | Cash and cash equivalents at the beginning of the cash flow statement&#39;s period. |  [optional]
**operatingActivities** | [**kotlin.collections.List&lt;ReportItem&gt;**](ReportItem.md) |  |  [optional] [readonly]
**investingActivities** | [**kotlin.collections.List&lt;ReportItem&gt;**](ReportItem.md) |  |  [optional] [readonly]
**financingActivities** | [**kotlin.collections.List&lt;ReportItem&gt;**](ReportItem.md) |  |  [optional] [readonly]
**remoteGeneratedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The time that cash flow statement was generated by the accounting system. |  [optional]
**remoteWasDeleted** | **kotlin.Boolean** | Indicates whether or not this object has been deleted by third party webhooks. |  [optional] [readonly]



