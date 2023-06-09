

# EventTypeSchema

An EventType object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier of the event type |  [optional]
**eventName** | **String** | Identifier name of the event |  [optional] [readonly]
**description** | **String** | The summary of the event |  [optional]
**entity** | **String** | The entity against which the event originated |  [optional]
**application** | **String** | The application associated with the event |  [optional]
**jsonSchema** | **Object** | The schema of the event |  [optional]
**headerSchema** | **Object** | Header |  [optional] [readonly]
**bodySchema** | **Object** | Body |  [optional] [readonly]



