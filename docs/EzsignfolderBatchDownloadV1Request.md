

# EzsignfolderBatchDownloadV1Request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aPkiEzsigndocumentID** | **List&lt;Integer&gt;** |  | 
**aEDocumentType** | [**List&lt;AEDocumentTypeEnum&gt;**](#List&lt;AEDocumentTypeEnum&gt;) | The type of document to retrieve.  1. **Signed** Is the final document once all signatures were applied. 2. **Proofdocument** Is the evidence report. 3. **Proof** Is the complete evidence archive including all of the above and more. | 


## Enum: List&lt;AEDocumentTypeEnum&gt;

Name | Value
---- | -----
SIGNED | &quot;Signed&quot;
PROOF | &quot;Proof&quot;
PROOFDOCUMENT | &quot;Proofdocument&quot;




