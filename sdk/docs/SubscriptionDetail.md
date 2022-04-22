

# SubscriptionDetail

Subscription that contains its list of notifications

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**notifications** | [**List&lt;Notification&gt;**](Notification.md) | List of notifications belonging to a subscription |  [optional]
**id** | [**ResourceId**](ResourceId.md) |  | 
**displayName** | **String** | The name of the subscription | 
**description** | **String** | The summary of the services provided by the subscription |  [optional]
**status** | **String** | The current status of the subscription | 
**matchingPattern** | [**MatchingPattern**](MatchingPattern.md) |  | 
**createdAt** | **OffsetDateTime** | The time at which the subscription was made | 
**createdBy** | **String** | The user who made the subscription | 
**lastModifiedAt** | **OffsetDateTime** | The time at which the subscription was last modified | 
**lastModifiedBy** | **String** | The user who last modified the subscription | 



