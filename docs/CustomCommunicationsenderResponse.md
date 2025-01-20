

# CustomCommunicationsenderResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fkiAgentID** | **Integer** | The unique ID of the Agent. |  [optional]
**fkiBrokerID** | **Integer** | The unique ID of the Broker. |  [optional]
**fkiUserID** | **Integer** | The unique ID of the User |  [optional]
**fkiMailboxsharedID** | **Integer** | The unique ID of the Mailboxshared |  [optional]
**fkiPhonelinesharedID** | **Integer** | The unique ID of the Phonelineshared |  [optional]
**eCommunicationsenderObjecttype** | [**ECommunicationsenderObjecttypeEnum**](#ECommunicationsenderObjecttypeEnum) |  | 
**objContactName** | [**CustomContactNameResponse**](CustomContactNameResponse.md) |  | 
**objEmail** | [**EmailResponse**](EmailResponse.md) | An Email Object and children to create a complete structure |  [optional]
**objPhoneFax** | [**PhoneResponseCompound**](PhoneResponseCompound.md) |  |  [optional]
**objPhoneSMS** | [**PhoneResponseCompound**](PhoneResponseCompound.md) |  |  [optional]


## Enum: ECommunicationsenderObjecttypeEnum

Name | Value
---- | -----




