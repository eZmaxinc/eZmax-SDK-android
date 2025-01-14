

# CustomWebhookResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiWebhookID** | **Integer** | The unique ID of the Webhook | 
**fkiAuthenticationexternalID** | **Integer** | The unique ID of the Authenticationexternal |  [optional]
**sWebhookDescription** | **String** | The description of the Webhook | 
**fkiEzsignfoldertypeID** | **Integer** | The unique ID of the Ezsignfoldertype. |  [optional]
**sEzsignfoldertypeNameX** | **String** | The name of the Ezsignfoldertype in the language of the requester |  [optional]
**eWebhookModule** | [**FieldEWebhookModule**](FieldEWebhookModule.md) |  | 
**eWebhookEzsignevent** | [**FieldEWebhookEzsignevent**](FieldEWebhookEzsignevent.md) |  |  [optional]
**eWebhookManagementevent** | [**FieldEWebhookManagementevent**](FieldEWebhookManagementevent.md) |  |  [optional]
**sWebhookUrl** | **String** | The URL of the Webhook callback | 
**sWebhookEmailfailed** | **String** | The email that will receive the Webhook in case all attempts fail | 
**sWebhookApikey** | **String** | The Apikey for the Webhook.  This will be hidden if we are not creating or regenerating the Apikey. |  [optional]
**sWebhookSecret** | **String** | The Secret for the Webhook.  This will be hidden if we are not creating or regenerating the Apikey. |  [optional]
**bWebhookIsactive** | **Boolean** | Whether the Webhook is active or not | 
**bWebhookIssigned** | **Boolean** | Whether the requests will be signed or not | 
**bWebhookSkipsslvalidation** | **Boolean** | Wheter the server&#39;s SSL certificate should be validated or not. Not recommended to skip for production use | 
**sAuthenticationexternalDescription** | **String** | The description of the Authenticationexternal |  [optional]
**objAudit** | [**CommonAudit**](CommonAudit.md) |  | 
**sWebhookEvent** | **String** | The concatenated string to describe the Webhook event |  [optional]
**aObjWebhookheader** | [**List&lt;WebhookheaderResponseCompound&gt;**](WebhookheaderResponseCompound.md) |  |  [optional]
**pksCustomerCode** | **String** | The customer code assigned to your account | 
**bWebhookTest** | **Boolean** | Wheter the webhook received is a manual test or a real event | 
**eWebhookEmittype** | [**EWebhookEmittypeEnum**](#EWebhookEmittypeEnum) | Wheter the webhook received is a manual test or a real event |  [optional]


## Enum: EWebhookEmittypeEnum

Name | Value
---- | -----




