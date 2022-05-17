

# EzsigntemplatedocumentGetWordsPositionsV1Request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eGet** | [**EGetEnum**](#EGetEnum) | Specify if you want to retrieve *All* words or specific *Words* from the document. If you specify *Words*, you must send the list of words to search for in *a_sWord*. | 
**bWordCaseSensitive** | **Boolean** | IF *true*, words will be searched case-sensitive and results will be returned case-sensitive. IF *false*, words will be searched case-insensitive and results will be returned case-insensitive. | 
**aSWord** | **List&lt;String&gt;** | Array of words to find in the document |  [optional]


## Enum: EGetEnum

Name | Value
---- | -----




