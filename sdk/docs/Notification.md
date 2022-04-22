

# Notification

A notification object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier of the notification | 
**description** | **String** | The summary of the services provided by the notification |  [optional]
**deliveryChannel** | **String** | The medium through which the notification is delivered | 
**recipients** | **Map&lt;String, Object&gt;** | Recipient of the notification | 
**content** | **Map&lt;String, Object&gt;** | The contents of the notification | 
**status** | [**NotificationStatus**](NotificationStatus.md) |  |  [optional]
**createdAt** | **OffsetDateTime** | The time at which the subscription was made | 
**createdBy** | **String** | The user who made the subscription | 
**lastModifiedAt** | **OffsetDateTime** | The time at which the subscription was last modified | 
**lastModifiedBy** | **String** | The user who last modified the subscription | 



