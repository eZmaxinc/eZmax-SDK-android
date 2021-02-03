

# WebhookResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiWebhookID** | **Integer** | The Webhook ID. This value is visible in the admin interface. | 
**eWebhookModule** | [**EWebhookModuleEnum**](#EWebhookModuleEnum) | The Module generating the Event. | 
**eWebhookEzsignevent** | [**EWebhookEzsigneventEnum**](#EWebhookEzsigneventEnum) | This Ezsign Event. This property will be set only if the Module is \&quot;Ezsign\&quot;. |  [optional]
**pksCustomerCode** | **String** | The Customer Code in which the event was generated | 
**sWebhookUrl** | **String** | The url being called | 
**sWebhookEmailfailed** | **String** | The email that will receive the webhook in case all attempts fail. | 
**eWebhookManagementevent** | [**EWebhookManagementeventEnum**](#EWebhookManagementeventEnum) | This Management Event. This property will be set only if the Module is \&quot;Management\&quot;. |  [optional]


## Enum: EWebhookModuleEnum

Name | Value
---- | -----


## Enum: EWebhookEzsigneventEnum

Name | Value
---- | -----


## Enum: EWebhookManagementeventEnum

Name | Value
---- | -----




