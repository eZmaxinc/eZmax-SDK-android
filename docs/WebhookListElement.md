

# WebhookListElement

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiWebhookID** | **Integer** | The unique ID of the Webhook | 
**sWebhookDescription** | **String** | The description of the Webhook | 
**sWebhookUrl** | **String** | The URL of the Webhook callback | 
**sWebhookEvent** | **String** | The concatenated string to describe the Webhook event | 
**sWebhookEmailfailed** | **String** | The email that will receive the Webhook in case all attempts fail | 
**eWebhookModule** | [**FieldEWebhookModule**](FieldEWebhookModule.md) |  | 
**eWebhookEzsignevent** | [**FieldEWebhookEzsignevent**](FieldEWebhookEzsignevent.md) |  |  [optional]
**eWebhookManagementevent** | [**FieldEWebhookManagementevent**](FieldEWebhookManagementevent.md) |  |  [optional]
**bWebhookIsactive** | **Boolean** | Whether the Webhook is active or not | 
**bWebhookIssigned** | **Boolean** | Whether the requests will be signed or not | 




