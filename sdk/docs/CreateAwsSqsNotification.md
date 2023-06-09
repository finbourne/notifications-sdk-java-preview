

# CreateAwsSqsNotification

The information required to create a notification which, when processed, will send an notification to Amazon SQS

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiKeyRef** | **String** | Reference to API key from Configuration Store | 
**apiSecretRef** | **String** | Reference to API secret from Configuration Store | 
**body** | **String** | The body of the Amazon Queue Message | 
**description** | **String** | The summary of the services provided by the notification | 
**queueUrlRef** | **String** | Reference to queue url from Configuration Store | 



