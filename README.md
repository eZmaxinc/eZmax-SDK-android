# openapi-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/openapi-android-client-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.api.GlobalCustomerApi;

public class GlobalCustomerApiExample {

    public static void main(String[] args) {
        GlobalCustomerApi apiInstance = new GlobalCustomerApi();
        String pksCustomerCode = null; // String | 
        String sInfrastructureproductCode = null; // String | The infrastructure product Code  If undefined, \"appcluster01\" is assumed
        try {
            GlobalCustomerGetEndpointV1Response result = apiInstance.globalCustomerGetEndpointV1(pksCustomerCode, sInfrastructureproductCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalCustomerApi#globalCustomerGetEndpointV1");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*GlobalCustomerApi* | [**globalCustomerGetEndpointV1**](docs/GlobalCustomerApi.md#globalCustomerGetEndpointV1) | **GET** /1/customer/{pksCustomerCode}/endpoint | Get customer endpoint
*ModuleEzsignApi* | [**ezsignSuggestSignersV1**](docs/ModuleEzsignApi.md#ezsignSuggestSignersV1) | **GET** /1/module/ezsign/suggestSigners | Suggest signers
*ModuleEzsignApi* | [**ezsignSuggestTemplatesV1**](docs/ModuleEzsignApi.md#ezsignSuggestTemplatesV1) | **GET** /1/module/ezsign/suggestTemplates | Suggest templates
*ModuleUserApi* | [**userCreateEzsignuserV1**](docs/ModuleUserApi.md#userCreateEzsignuserV1) | **POST** /1/module/user/createezsignuser | Create a new User of type Ezsignuser
*ObjectActivesessionApi* | [**activesessionGetCurrentV1**](docs/ObjectActivesessionApi.md#activesessionGetCurrentV1) | **GET** /1/object/activesession/getCurrent | Get Current Activesession
*ObjectApikeyApi* | [**apikeyCreateObjectV1**](docs/ObjectApikeyApi.md#apikeyCreateObjectV1) | **POST** /1/object/apikey | Create a new Apikey
*ObjectApikeyApi* | [**apikeyCreateObjectV2**](docs/ObjectApikeyApi.md#apikeyCreateObjectV2) | **POST** /2/object/apikey | Create a new Apikey
*ObjectBillingentityinternalApi* | [**billingentityinternalGetAutocompleteV1**](docs/ObjectBillingentityinternalApi.md#billingentityinternalGetAutocompleteV1) | **GET** /1/object/billingentityinternal/getAutocomplete/{sSelector} | Retrieve Billingentityinternals and IDs
*ObjectBrandingApi* | [**brandingGetAutocompleteV1**](docs/ObjectBrandingApi.md#brandingGetAutocompleteV1) | **GET** /1/object/branding/getAutocomplete/{sSelector} | Retrieve Brandings and IDs
*ObjectEzsignbulksendApi* | [**ezsignbulksendCreateEzsignbulksendtransmissionV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendCreateEzsignbulksendtransmissionV1) | **POST** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/createEzsignbulksendtransmission | Create a new Ezsignbulksendtransmission in the Ezsignbulksend
*ObjectEzsignbulksendApi* | [**ezsignbulksendCreateObjectV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendCreateObjectV1) | **POST** /1/object/ezsignbulksend | Create a new Ezsignbulksend
*ObjectEzsignbulksendApi* | [**ezsignbulksendDeleteObjectV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendDeleteObjectV1) | **DELETE** /1/object/ezsignbulksend/{pkiEzsignbulksendID} | Delete an existing Ezsignbulksend
*ObjectEzsignbulksendApi* | [**ezsignbulksendEditObjectV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendEditObjectV1) | **PUT** /1/object/ezsignbulksend/{pkiEzsignbulksendID} | Edit an existing Ezsignbulksend
*ObjectEzsignbulksendApi* | [**ezsignbulksendGetCsvTemplateV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendGetCsvTemplateV1) | **GET** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/getCsvTemplate | Retrieve an existing Ezsignbulksend&#39;s empty Csv template
*ObjectEzsignbulksendApi* | [**ezsignbulksendGetEzsignbulksendtransmissionsV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendGetEzsignbulksendtransmissionsV1) | **GET** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/getEzsignbulksendtransmissions | Retrieve an existing Ezsignbulksend&#39;s Ezsignbulksendtransmissions
*ObjectEzsignbulksendApi* | [**ezsignbulksendGetFormsDataV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendGetFormsDataV1) | **GET** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/getFormsData | Retrieve an existing Ezsignbulksend&#39;s forms data
*ObjectEzsignbulksendApi* | [**ezsignbulksendGetListV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendGetListV1) | **GET** /1/object/ezsignbulksend/getList | Retrieve Ezsignbulksend list
*ObjectEzsignbulksendApi* | [**ezsignbulksendGetObjectV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendGetObjectV1) | **GET** /1/object/ezsignbulksend/{pkiEzsignbulksendID} | Retrieve an existing Ezsignbulksend
*ObjectEzsignbulksendApi* | [**ezsignbulksendReorderV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendReorderV1) | **POST** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/reorder | Reorder Ezsignbulksenddocumentmappings in the Ezsignbulksend
*ObjectEzsignbulksenddocumentmappingApi* | [**ezsignbulksenddocumentmappingCreateObjectV1**](docs/ObjectEzsignbulksenddocumentmappingApi.md#ezsignbulksenddocumentmappingCreateObjectV1) | **POST** /1/object/ezsignbulksenddocumentmapping | Create a new Ezsignbulksenddocumentmapping
*ObjectEzsignbulksenddocumentmappingApi* | [**ezsignbulksenddocumentmappingDeleteObjectV1**](docs/ObjectEzsignbulksenddocumentmappingApi.md#ezsignbulksenddocumentmappingDeleteObjectV1) | **DELETE** /1/object/ezsignbulksenddocumentmapping/{pkiEzsignbulksenddocumentmappingID} | Delete an existing Ezsignbulksenddocumentmapping
*ObjectEzsignbulksenddocumentmappingApi* | [**ezsignbulksenddocumentmappingGetObjectV1**](docs/ObjectEzsignbulksenddocumentmappingApi.md#ezsignbulksenddocumentmappingGetObjectV1) | **GET** /1/object/ezsignbulksenddocumentmapping/{pkiEzsignbulksenddocumentmappingID} | Retrieve an existing Ezsignbulksenddocumentmapping
*ObjectEzsignbulksendsignermappingApi* | [**ezsignbulksendsignermappingCreateObjectV1**](docs/ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingCreateObjectV1) | **POST** /1/object/ezsignbulksendsignermapping | Create a new Ezsignbulksendsignermapping
*ObjectEzsignbulksendsignermappingApi* | [**ezsignbulksendsignermappingDeleteObjectV1**](docs/ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingDeleteObjectV1) | **DELETE** /1/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID} | Delete an existing Ezsignbulksendsignermapping
*ObjectEzsignbulksendsignermappingApi* | [**ezsignbulksendsignermappingGetObjectV1**](docs/ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingGetObjectV1) | **GET** /1/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID} | Retrieve an existing Ezsignbulksendsignermapping
*ObjectEzsignbulksendtransmissionApi* | [**ezsignbulksendtransmissionGetCsvErrorsV1**](docs/ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissionGetCsvErrorsV1) | **GET** /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getCsvErrors | Retrieve an existing Ezsignbulksendtransmission&#39;s Csv containing errors
*ObjectEzsignbulksendtransmissionApi* | [**ezsignbulksendtransmissionGetFormsDataV1**](docs/ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissionGetFormsDataV1) | **GET** /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getFormsData | Retrieve an existing Ezsignbulksendtransmission&#39;s forms data
*ObjectEzsignbulksendtransmissionApi* | [**ezsignbulksendtransmissionGetObjectV1**](docs/ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissionGetObjectV1) | **GET** /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID} | Retrieve an existing Ezsignbulksendtransmission
*ObjectEzsigndocumentApi* | [**ezsigndocumentApplyEzsigntemplateV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentApplyEzsigntemplateV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate | Apply an Ezsigntemplate to the Ezsigndocument.
*ObjectEzsigndocumentApi* | [**ezsigndocumentApplyEzsigntemplateV2**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentApplyEzsigntemplateV2) | **POST** /2/object/ezsigndocument/{pkiEzsigndocumentID}/applyEzsigntemplate | Apply an Ezsigntemplate to the Ezsigndocument.
*ObjectEzsigndocumentApi* | [**ezsigndocumentCreateObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentCreateObjectV1) | **POST** /1/object/ezsigndocument | Create a new Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentCreateObjectV2**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentCreateObjectV2) | **POST** /2/object/ezsigndocument | Create a new Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentDeleteObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentDeleteObjectV1) | **DELETE** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Delete an existing Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentEditEzsignformfieldgroupsV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentEditEzsignformfieldgroupsV1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignformfieldgroups | Edit multiple Ezsignformfieldgroups
*ObjectEzsigndocumentApi* | [**ezsigndocumentEditEzsignsignaturesV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentEditEzsignsignaturesV1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignsignatures | Edit multiple Ezsignsignatures
*ObjectEzsigndocumentApi* | [**ezsigndocumentEndPrematurelyV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentEndPrematurelyV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/endPrematurely | End prematurely
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetActionableElementsV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetActionableElementsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getActionableElements | Retrieve actionable elements for the Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetDownloadUrlV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetDownloadUrlV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getDownloadUrl/{eDocumentType} | Retrieve a URL to download documents.
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetEzsignformfieldgroupsV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignformfieldgroupsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignformfieldgroups | Retrieve an existing Ezsigndocument&#39;s Ezsignformfieldgroups
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetEzsignpagesV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignpagesV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignpages | Retrieve an existing Ezsigndocument&#39;s Ezsignpages
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetEzsignsignaturesV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignsignaturesV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignsignatures | Retrieve an existing Ezsigndocument&#39;s Ezsignsignatures
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetFormDataV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetFormDataV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getFormData | Retrieve an existing Ezsigndocument&#39;s Form Data
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetObjectV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Retrieve an existing Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetTemporaryProofV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetTemporaryProofV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getTemporaryProof | Retrieve the temporary proof
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetWordsPositionsV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetWordsPositionsV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getWordsPositions | Retrieve positions X,Y of given words from a Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentPatchObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentPatchObjectV1) | **PATCH** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Patch an existing Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentUnsendV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentUnsendV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/unsend | Unsend the Ezsigndocument
*ObjectEzsignfolderApi* | [**ezsignfolderArchiveV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderArchiveV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/archive | Archive the Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderBatchDownloadV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderBatchDownloadV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/batchDownload | Download multiples files from an Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderCreateObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderCreateObjectV1) | **POST** /1/object/ezsignfolder | Create a new Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderCreateObjectV2**](docs/ObjectEzsignfolderApi.md#ezsignfolderCreateObjectV2) | **POST** /2/object/ezsignfolder | Create a new Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderDeleteObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderDeleteObjectV1) | **DELETE** /1/object/ezsignfolder/{pkiEzsignfolderID} | Delete an existing Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderDisposeEzsignfoldersV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderDisposeEzsignfoldersV1) | **POST** /1/object/ezsignfolder/disposeEzsignfolders | Dispose Ezsignfolders
*ObjectEzsignfolderApi* | [**ezsignfolderDisposeV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderDisposeV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/dispose | Dispose the Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderEditObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderEditObjectV1) | **PUT** /1/object/ezsignfolder/{pkiEzsignfolderID} | Edit an existing Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderGetActionableElementsV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderGetActionableElementsV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getActionableElements | Retrieve actionable elements for the Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderGetEzsigndocumentsV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderGetEzsigndocumentsV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getEzsigndocuments | Retrieve an existing Ezsignfolder&#39;s Ezsigndocuments
*ObjectEzsignfolderApi* | [**ezsignfolderGetEzsignfoldersignerassociationsV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderGetEzsignfoldersignerassociationsV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getEzsignfoldersignerassociations | Retrieve an existing Ezsignfolder&#39;s Ezsignfoldersignerassociations
*ObjectEzsignfolderApi* | [**ezsignfolderGetFormsDataV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderGetFormsDataV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getFormsData | Retrieve an existing Ezsignfolder&#39;s forms data
*ObjectEzsignfolderApi* | [**ezsignfolderGetListV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderGetListV1) | **GET** /1/object/ezsignfolder/getList | Retrieve Ezsignfolder list
*ObjectEzsignfolderApi* | [**ezsignfolderGetObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderGetObjectV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID} | Retrieve an existing Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderImportEzsigntemplatepackageV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderImportEzsigntemplatepackageV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/importEzsigntemplatepackage | Import an Ezsigntemplatepackage in the Ezsignfolder.
*ObjectEzsignfolderApi* | [**ezsignfolderReorderV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderReorderV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/reorder | Reorder Ezsigndocuments in the Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderSendV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderSendV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/send | Send the Ezsignfolder to the signatories for signature
*ObjectEzsignfolderApi* | [**ezsignfolderUnsendV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderUnsendV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/unsend | Unsend the Ezsignfolder
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationCreateObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationCreateObjectV1) | **POST** /1/object/ezsignfoldersignerassociation | Create a new Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationCreateObjectV2**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationCreateObjectV2) | **POST** /2/object/ezsignfoldersignerassociation | Create a new Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationDeleteObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationDeleteObjectV1) | **DELETE** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Delete an existing Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationEditObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationEditObjectV1) | **PUT** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Edit an existing Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationGetInPersonLoginUrlV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationGetInPersonLoginUrlV1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/getInPersonLoginUrl | Retrieve a Login Url to allow In-Person signing
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationGetObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationGetObjectV1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Retrieve an existing Ezsignfoldersignerassociation
*ObjectEzsignfoldertypeApi* | [**ezsignfoldertypeGetAutocompleteV1**](docs/ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetAutocompleteV1) | **GET** /1/object/ezsignfoldertype/getAutocomplete/{sSelector} | Retrieve Ezsignfoldertypes and IDs
*ObjectEzsignfoldertypeApi* | [**ezsignfoldertypeGetListV1**](docs/ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetListV1) | **GET** /1/object/ezsignfoldertype/getList | Retrieve Ezsignfoldertype list
*ObjectEzsignformfieldgroupApi* | [**ezsignformfieldgroupCreateObjectV1**](docs/ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupCreateObjectV1) | **POST** /1/object/ezsignformfieldgroup | Create a new Ezsignformfieldgroup
*ObjectEzsignformfieldgroupApi* | [**ezsignformfieldgroupDeleteObjectV1**](docs/ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupDeleteObjectV1) | **DELETE** /1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID} | Delete an existing Ezsignformfieldgroup
*ObjectEzsignformfieldgroupApi* | [**ezsignformfieldgroupEditObjectV1**](docs/ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupEditObjectV1) | **PUT** /1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID} | Edit an existing Ezsignformfieldgroup
*ObjectEzsignformfieldgroupApi* | [**ezsignformfieldgroupGetObjectV1**](docs/ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupGetObjectV1) | **GET** /1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID} | Retrieve an existing Ezsignformfieldgroup
*ObjectEzsignsignatureApi* | [**ezsignsignatureCreateObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignatureCreateObjectV1) | **POST** /1/object/ezsignsignature | Create a new Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureCreateObjectV2**](docs/ObjectEzsignsignatureApi.md#ezsignsignatureCreateObjectV2) | **POST** /2/object/ezsignsignature | Create a new Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureDeleteObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignatureDeleteObjectV1) | **DELETE** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Delete an existing Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureEditObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignatureEditObjectV1) | **PUT** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Edit an existing Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureGetObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignatureGetObjectV1) | **GET** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Retrieve an existing Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureSignV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignatureSignV1) | **POST** /1/object/ezsignsignature/{pkiEzsignsignatureID}/sign | Sign the Ezsignsignature
*ObjectEzsigntemplateApi* | [**ezsigntemplateCreateObjectV1**](docs/ObjectEzsigntemplateApi.md#ezsigntemplateCreateObjectV1) | **POST** /1/object/ezsigntemplate | Create a new Ezsigntemplate
*ObjectEzsigntemplateApi* | [**ezsigntemplateDeleteObjectV1**](docs/ObjectEzsigntemplateApi.md#ezsigntemplateDeleteObjectV1) | **DELETE** /1/object/ezsigntemplate/{pkiEzsigntemplateID} | Delete an existing Ezsigntemplate
*ObjectEzsigntemplateApi* | [**ezsigntemplateEditObjectV1**](docs/ObjectEzsigntemplateApi.md#ezsigntemplateEditObjectV1) | **PUT** /1/object/ezsigntemplate/{pkiEzsigntemplateID} | Edit an existing Ezsigntemplate
*ObjectEzsigntemplateApi* | [**ezsigntemplateGetAutocompleteV1**](docs/ObjectEzsigntemplateApi.md#ezsigntemplateGetAutocompleteV1) | **GET** /1/object/ezsigntemplate/getAutocomplete/{sSelector} | Retrieve Ezsigntemplate and IDs
*ObjectEzsigntemplateApi* | [**ezsigntemplateGetListV1**](docs/ObjectEzsigntemplateApi.md#ezsigntemplateGetListV1) | **GET** /1/object/ezsigntemplate/getList | Retrieve Ezsigntemplate list
*ObjectEzsigntemplateApi* | [**ezsigntemplateGetObjectV1**](docs/ObjectEzsigntemplateApi.md#ezsigntemplateGetObjectV1) | **GET** /1/object/ezsigntemplate/{pkiEzsigntemplateID} | Retrieve an existing Ezsigntemplate
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentCreateObjectV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentCreateObjectV1) | **POST** /1/object/ezsigntemplatedocument | Create a new Ezsigntemplatedocument
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1) | **PUT** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/editEzsigntemplateformfieldgroups | Edit multiple Ezsigntemplateformfieldgroups
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentEditEzsigntemplatesignaturesV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentEditEzsigntemplatesignaturesV1) | **PUT** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/editEzsigntemplatesignatures | Edit multiple Ezsigntemplatesignatures
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentEditObjectV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentEditObjectV1) | **PUT** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID} | Edit an existing Ezsigntemplatedocument
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentGetEzsigntemplatedocumentpagesV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentGetEzsigntemplatedocumentpagesV1) | **GET** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getEzsigntemplatedocumentpages | Retrieve an existing Ezsigntemplatedocument&#39;s Ezsigntemplatedocumentpages
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1) | **GET** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getEzsigntemplateformfieldgroups | Retrieve an existing Ezsigntemplatedocument&#39;s Ezsigntemplateformfieldgroups
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentGetEzsigntemplatesignaturesV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentGetEzsigntemplatesignaturesV1) | **GET** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getEzsigntemplatesignatures | Retrieve an existing Ezsigntemplatedocument&#39;s Ezsigntemplatesignatures
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentGetObjectV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentGetObjectV1) | **GET** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID} | Retrieve an existing Ezsigntemplatedocument
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentGetWordsPositionsV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentGetWordsPositionsV1) | **POST** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getWordsPositions | Retrieve positions X,Y of given words from a Ezsigntemplatedocument
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentPatchObjectV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentPatchObjectV1) | **PATCH** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID} | Patch an existing Ezsigntemplatedocument
*ObjectEzsigntemplateformfieldgroupApi* | [**ezsigntemplateformfieldgroupCreateObjectV1**](docs/ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupCreateObjectV1) | **POST** /1/object/ezsigntemplateformfieldgroup | Create a new Ezsigntemplateformfieldgroup
*ObjectEzsigntemplateformfieldgroupApi* | [**ezsigntemplateformfieldgroupDeleteObjectV1**](docs/ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupDeleteObjectV1) | **DELETE** /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Delete an existing Ezsigntemplateformfieldgroup
*ObjectEzsigntemplateformfieldgroupApi* | [**ezsigntemplateformfieldgroupEditObjectV1**](docs/ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupEditObjectV1) | **PUT** /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Edit an existing Ezsigntemplateformfieldgroup
*ObjectEzsigntemplateformfieldgroupApi* | [**ezsigntemplateformfieldgroupGetObjectV1**](docs/ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupGetObjectV1) | **GET** /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Retrieve an existing Ezsigntemplateformfieldgroup
*ObjectEzsigntemplatepackageApi* | [**ezsigntemplatepackageCreateObjectV1**](docs/ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageCreateObjectV1) | **POST** /1/object/ezsigntemplatepackage | Create a new Ezsigntemplatepackage
*ObjectEzsigntemplatepackageApi* | [**ezsigntemplatepackageDeleteObjectV1**](docs/ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID} | Delete an existing Ezsigntemplatepackage
*ObjectEzsigntemplatepackageApi* | [**ezsigntemplatepackageEditEzsigntemplatepackagesignersV1**](docs/ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageEditEzsigntemplatepackagesignersV1) | **PUT** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID}/editEzsigntemplatepackagesigners | Edit multiple Ezsigntemplatepackagesigners
*ObjectEzsigntemplatepackageApi* | [**ezsigntemplatepackageEditObjectV1**](docs/ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageEditObjectV1) | **PUT** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID} | Edit an existing Ezsigntemplatepackage
*ObjectEzsigntemplatepackageApi* | [**ezsigntemplatepackageGetAutocompleteV1**](docs/ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageGetAutocompleteV1) | **GET** /1/object/ezsigntemplatepackage/getAutocomplete/{sSelector} | Retrieve Ezsigntemplatepackages and IDs
*ObjectEzsigntemplatepackageApi* | [**ezsigntemplatepackageGetListV1**](docs/ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageGetListV1) | **GET** /1/object/ezsigntemplatepackage/getList | Retrieve Ezsigntemplatepackage list
*ObjectEzsigntemplatepackageApi* | [**ezsigntemplatepackageGetObjectV1**](docs/ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageGetObjectV1) | **GET** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID} | Retrieve an existing Ezsigntemplatepackage
*ObjectEzsigntemplatepackagemembershipApi* | [**ezsigntemplatepackagemembershipCreateObjectV1**](docs/ObjectEzsigntemplatepackagemembershipApi.md#ezsigntemplatepackagemembershipCreateObjectV1) | **POST** /1/object/ezsigntemplatepackagemembership | Create a new Ezsigntemplatepackagemembership
*ObjectEzsigntemplatepackagemembershipApi* | [**ezsigntemplatepackagemembershipDeleteObjectV1**](docs/ObjectEzsigntemplatepackagemembershipApi.md#ezsigntemplatepackagemembershipDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatepackagemembership/{pkiEzsigntemplatepackagemembershipID} | Delete an existing Ezsigntemplatepackagemembership
*ObjectEzsigntemplatepackagemembershipApi* | [**ezsigntemplatepackagemembershipGetObjectV1**](docs/ObjectEzsigntemplatepackagemembershipApi.md#ezsigntemplatepackagemembershipGetObjectV1) | **GET** /1/object/ezsigntemplatepackagemembership/{pkiEzsigntemplatepackagemembershipID} | Retrieve an existing Ezsigntemplatepackagemembership
*ObjectEzsigntemplatepackagesignerApi* | [**ezsigntemplatepackagesignerCreateObjectV1**](docs/ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerCreateObjectV1) | **POST** /1/object/ezsigntemplatepackagesigner | Create a new Ezsigntemplatepackagesigner
*ObjectEzsigntemplatepackagesignerApi* | [**ezsigntemplatepackagesignerDeleteObjectV1**](docs/ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID} | Delete an existing Ezsigntemplatepackagesigner
*ObjectEzsigntemplatepackagesignerApi* | [**ezsigntemplatepackagesignerEditObjectV1**](docs/ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerEditObjectV1) | **PUT** /1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID} | Edit an existing Ezsigntemplatepackagesigner
*ObjectEzsigntemplatepackagesignerApi* | [**ezsigntemplatepackagesignerGetObjectV1**](docs/ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerGetObjectV1) | **GET** /1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID} | Retrieve an existing Ezsigntemplatepackagesigner
*ObjectEzsigntemplatepackagesignermembershipApi* | [**ezsigntemplatepackagesignermembershipCreateObjectV1**](docs/ObjectEzsigntemplatepackagesignermembershipApi.md#ezsigntemplatepackagesignermembershipCreateObjectV1) | **POST** /1/object/ezsigntemplatepackagesignermembership | Create a new Ezsigntemplatepackagesignermembership
*ObjectEzsigntemplatepackagesignermembershipApi* | [**ezsigntemplatepackagesignermembershipDeleteObjectV1**](docs/ObjectEzsigntemplatepackagesignermembershipApi.md#ezsigntemplatepackagesignermembershipDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatepackagesignermembership/{pkiEzsigntemplatepackagesignermembershipID} | Delete an existing Ezsigntemplatepackagesignermembership
*ObjectEzsigntemplatepackagesignermembershipApi* | [**ezsigntemplatepackagesignermembershipGetObjectV1**](docs/ObjectEzsigntemplatepackagesignermembershipApi.md#ezsigntemplatepackagesignermembershipGetObjectV1) | **GET** /1/object/ezsigntemplatepackagesignermembership/{pkiEzsigntemplatepackagesignermembershipID} | Retrieve an existing Ezsigntemplatepackagesignermembership
*ObjectEzsigntemplatesignatureApi* | [**ezsigntemplatesignatureCreateObjectV1**](docs/ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureCreateObjectV1) | **POST** /1/object/ezsigntemplatesignature | Create a new Ezsigntemplatesignature
*ObjectEzsigntemplatesignatureApi* | [**ezsigntemplatesignatureDeleteObjectV1**](docs/ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Delete an existing Ezsigntemplatesignature
*ObjectEzsigntemplatesignatureApi* | [**ezsigntemplatesignatureEditObjectV1**](docs/ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureEditObjectV1) | **PUT** /1/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Edit an existing Ezsigntemplatesignature
*ObjectEzsigntemplatesignatureApi* | [**ezsigntemplatesignatureGetObjectV1**](docs/ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureGetObjectV1) | **GET** /1/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Retrieve an existing Ezsigntemplatesignature
*ObjectEzsigntemplatesignerApi* | [**ezsigntemplatesignerCreateObjectV1**](docs/ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerCreateObjectV1) | **POST** /1/object/ezsigntemplatesigner | Create a new Ezsigntemplatesigner
*ObjectEzsigntemplatesignerApi* | [**ezsigntemplatesignerDeleteObjectV1**](docs/ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID} | Delete an existing Ezsigntemplatesigner
*ObjectEzsigntemplatesignerApi* | [**ezsigntemplatesignerEditObjectV1**](docs/ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerEditObjectV1) | **PUT** /1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID} | Edit an existing Ezsigntemplatesigner
*ObjectEzsigntemplatesignerApi* | [**ezsigntemplatesignerGetObjectV1**](docs/ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerGetObjectV1) | **GET** /1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID} | Retrieve an existing Ezsigntemplatesigner
*ObjectEzsigntsarequirementApi* | [**ezsigntsarequirementGetAutocompleteV1**](docs/ObjectEzsigntsarequirementApi.md#ezsigntsarequirementGetAutocompleteV1) | **GET** /1/object/ezsigntsarequirement/getAutocomplete/{sSelector} | Retrieve Ezsigntsarequirements and IDs
*ObjectFranchisebrokerApi* | [**franchisebrokerGetAutocompleteV1**](docs/ObjectFranchisebrokerApi.md#franchisebrokerGetAutocompleteV1) | **GET** /1/object/franchisebroker/getAutocomplete/{sSelector} | Retrieve Franchisebrokers and IDs
*ObjectFranchiseofficeApi* | [**franchiseofficeGetAutocompleteV1**](docs/ObjectFranchiseofficeApi.md#franchiseofficeGetAutocompleteV1) | **GET** /1/object/franchiseoffice/getAutocomplete/{sSelector} | Retrieve Franchiseoffices and IDs
*ObjectFranchisereferalincomeApi* | [**franchisereferalincomeCreateObjectV1**](docs/ObjectFranchisereferalincomeApi.md#franchisereferalincomeCreateObjectV1) | **POST** /1/object/franchisereferalincome | Create a new Franchisereferalincome
*ObjectFranchisereferalincomeApi* | [**franchisereferalincomeCreateObjectV2**](docs/ObjectFranchisereferalincomeApi.md#franchisereferalincomeCreateObjectV2) | **POST** /2/object/franchisereferalincome | Create a new Franchisereferalincome
*ObjectNotificationsectionApi* | [**notificationsectionGetNotificationtestsV1**](docs/ObjectNotificationsectionApi.md#notificationsectionGetNotificationtestsV1) | **GET** /1/object/notificationsection/{pkiNotificationsectionID}/getNotificationtests | Retrieve an existing Notificationsection&#39;s Notificationtests
*ObjectNotificationtestApi* | [**notificationtestGetElementsV1**](docs/ObjectNotificationtestApi.md#notificationtestGetElementsV1) | **GET** /1/object/notificationtest/{pkiNotificationtestID}/getElements | Retrieve an existing Notificationtest&#39;s Elements
*ObjectPeriodApi* | [**periodGetAutocompleteV1**](docs/ObjectPeriodApi.md#periodGetAutocompleteV1) | **GET** /1/object/period/getAutocomplete/{sSelector} | Retrieve Periods and IDs
*ObjectSecretquestionApi* | [**secretquestionGetAutocompleteV1**](docs/ObjectSecretquestionApi.md#secretquestionGetAutocompleteV1) | **GET** /1/object/secretquestion/getAutocomplete/{sSelector} | Retrieve Secretquestions and IDs
*ObjectTaxassignmentApi* | [**taxassignmentGetAutocompleteV1**](docs/ObjectTaxassignmentApi.md#taxassignmentGetAutocompleteV1) | **GET** /1/object/taxassignment/getAutocomplete/{sSelector} | Retrieve Taxassignments and IDs
*ObjectTimezoneApi* | [**timezoneGetAutocompleteV1**](docs/ObjectTimezoneApi.md#timezoneGetAutocompleteV1) | **GET** /1/object/timezone/getAutocomplete/{sSelector} | Retrieve Timezones and IDs
*ObjectUserApi* | [**userGetAutocompleteV1**](docs/ObjectUserApi.md#userGetAutocompleteV1) | **GET** /1/object/user/getAutocomplete/{sSelector} | Retrieve Users and IDs
*ObjectUsergroupApi* | [**usergroupGetAutocompleteV1**](docs/ObjectUsergroupApi.md#usergroupGetAutocompleteV1) | **GET** /1/object/usergroup/getAutocomplete/{sSelector} | Retrieve Usergroups and IDs


## Documentation for Models

 - [ActivesessionGetCurrentV1Response](docs/ActivesessionGetCurrentV1Response.md)
 - [ActivesessionGetCurrentV1ResponseAllOf](docs/ActivesessionGetCurrentV1ResponseAllOf.md)
 - [ActivesessionGetCurrentV1ResponseMPayload](docs/ActivesessionGetCurrentV1ResponseMPayload.md)
 - [ActivesessionResponse](docs/ActivesessionResponse.md)
 - [ActivesessionResponseCompound](docs/ActivesessionResponseCompound.md)
 - [ActivesessionResponseCompoundAllOf](docs/ActivesessionResponseCompoundAllOf.md)
 - [ActivesessionResponseCompoundApikey](docs/ActivesessionResponseCompoundApikey.md)
 - [ActivesessionResponseCompoundUser](docs/ActivesessionResponseCompoundUser.md)
 - [AddressRequest](docs/AddressRequest.md)
 - [AddressRequestCompound](docs/AddressRequestCompound.md)
 - [ApikeyCreateObjectV1Request](docs/ApikeyCreateObjectV1Request.md)
 - [ApikeyCreateObjectV1Response](docs/ApikeyCreateObjectV1Response.md)
 - [ApikeyCreateObjectV1ResponseAllOf](docs/ApikeyCreateObjectV1ResponseAllOf.md)
 - [ApikeyCreateObjectV1ResponseMPayload](docs/ApikeyCreateObjectV1ResponseMPayload.md)
 - [ApikeyCreateObjectV2Request](docs/ApikeyCreateObjectV2Request.md)
 - [ApikeyCreateObjectV2Response](docs/ApikeyCreateObjectV2Response.md)
 - [ApikeyCreateObjectV2ResponseAllOf](docs/ApikeyCreateObjectV2ResponseAllOf.md)
 - [ApikeyCreateObjectV2ResponseMPayload](docs/ApikeyCreateObjectV2ResponseMPayload.md)
 - [ApikeyRequest](docs/ApikeyRequest.md)
 - [ApikeyRequestCompound](docs/ApikeyRequestCompound.md)
 - [ApikeyResponse](docs/ApikeyResponse.md)
 - [ApikeyResponseCompound](docs/ApikeyResponseCompound.md)
 - [AttemptResponse](docs/AttemptResponse.md)
 - [AttemptResponseCompound](docs/AttemptResponseCompound.md)
 - [CommonAudit](docs/CommonAudit.md)
 - [CommonAuditdetail](docs/CommonAuditdetail.md)
 - [CommonGetAutocompleteDisabledV1Response](docs/CommonGetAutocompleteDisabledV1Response.md)
 - [CommonGetAutocompleteDisabledV1ResponseAllOf](docs/CommonGetAutocompleteDisabledV1ResponseAllOf.md)
 - [CommonGetAutocompleteV1Response](docs/CommonGetAutocompleteV1Response.md)
 - [CommonGetAutocompleteV1ResponseAllOf](docs/CommonGetAutocompleteV1ResponseAllOf.md)
 - [CommonGetListV1ResponseMPayload](docs/CommonGetListV1ResponseMPayload.md)
 - [CommonResponse](docs/CommonResponse.md)
 - [CommonResponseError](docs/CommonResponseError.md)
 - [CommonResponseErrorSTemporaryFileUrl](docs/CommonResponseErrorSTemporaryFileUrl.md)
 - [CommonResponseErrorSTemporaryFileUrlAllOf](docs/CommonResponseErrorSTemporaryFileUrlAllOf.md)
 - [CommonResponseFilter](docs/CommonResponseFilter.md)
 - [CommonResponseGetList](docs/CommonResponseGetList.md)
 - [CommonResponseObjDebug](docs/CommonResponseObjDebug.md)
 - [CommonResponseObjDebugPayload](docs/CommonResponseObjDebugPayload.md)
 - [CommonResponseObjDebugPayloadGetList](docs/CommonResponseObjDebugPayloadGetList.md)
 - [CommonResponseObjDebugPayloadGetListAllOf](docs/CommonResponseObjDebugPayloadGetListAllOf.md)
 - [CommonResponseObjSQLQuery](docs/CommonResponseObjSQLQuery.md)
 - [CommonResponseRedirectSSecretquestionTextX](docs/CommonResponseRedirectSSecretquestionTextX.md)
 - [CommonResponseWarning](docs/CommonResponseWarning.md)
 - [CommonWebhook](docs/CommonWebhook.md)
 - [ContactRequest](docs/ContactRequest.md)
 - [ContactRequestCompound](docs/ContactRequestCompound.md)
 - [ContactRequestCompoundAllOf](docs/ContactRequestCompoundAllOf.md)
 - [ContactinformationsRequest](docs/ContactinformationsRequest.md)
 - [ContactinformationsRequestCompound](docs/ContactinformationsRequestCompound.md)
 - [ContactinformationsRequestCompoundAllOf](docs/ContactinformationsRequestCompoundAllOf.md)
 - [CustomAutocompleteElementDisabledResponse](docs/CustomAutocompleteElementDisabledResponse.md)
 - [CustomAutocompleteElementDisabledResponseAllOf](docs/CustomAutocompleteElementDisabledResponseAllOf.md)
 - [CustomAutocompleteElementResponse](docs/CustomAutocompleteElementResponse.md)
 - [CustomDropdownElementRequest](docs/CustomDropdownElementRequest.md)
 - [CustomDropdownElementRequestCompound](docs/CustomDropdownElementRequestCompound.md)
 - [CustomDropdownElementResponse](docs/CustomDropdownElementResponse.md)
 - [CustomDropdownElementResponseCompound](docs/CustomDropdownElementResponseCompound.md)
 - [CustomEzsignfoldersignerassociationstatusResponse](docs/CustomEzsignfoldersignerassociationstatusResponse.md)
 - [CustomEzsignfoldertransmissionResponse](docs/CustomEzsignfoldertransmissionResponse.md)
 - [CustomEzsignfoldertransmissionSignerResponse](docs/CustomEzsignfoldertransmissionSignerResponse.md)
 - [CustomEzsignsignaturestatusResponse](docs/CustomEzsignsignaturestatusResponse.md)
 - [CustomFormDataDocumentResponse](docs/CustomFormDataDocumentResponse.md)
 - [CustomFormDataEzsignformfieldResponse](docs/CustomFormDataEzsignformfieldResponse.md)
 - [CustomFormDataEzsignformfieldgroupResponse](docs/CustomFormDataEzsignformfieldgroupResponse.md)
 - [CustomFormDataSignerResponse](docs/CustomFormDataSignerResponse.md)
 - [CustomFormsDataFolderResponse](docs/CustomFormsDataFolderResponse.md)
 - [CustomImportEzsigntemplatepackageRelationRequest](docs/CustomImportEzsigntemplatepackageRelationRequest.md)
 - [CustomNotificationsubsectiongetnotificationtestsResponse](docs/CustomNotificationsubsectiongetnotificationtestsResponse.md)
 - [CustomNotificationsubsectiongetnotificationtestsResponseAllOf](docs/CustomNotificationsubsectiongetnotificationtestsResponseAllOf.md)
 - [CustomNotificationtestgetnotificationtestsResponse](docs/CustomNotificationtestgetnotificationtestsResponse.md)
 - [CustomNotificationtestgetnotificationtestsResponseAllOf](docs/CustomNotificationtestgetnotificationtestsResponseAllOf.md)
 - [CustomUserResponse](docs/CustomUserResponse.md)
 - [CustomWordPositionOccurenceResponse](docs/CustomWordPositionOccurenceResponse.md)
 - [CustomWordPositionWordResponse](docs/CustomWordPositionWordResponse.md)
 - [EmailRequest](docs/EmailRequest.md)
 - [EmailRequestCompound](docs/EmailRequestCompound.md)
 - [EzsignSuggestSignersV1Response](docs/EzsignSuggestSignersV1Response.md)
 - [EzsignSuggestSignersV1ResponseAllOf](docs/EzsignSuggestSignersV1ResponseAllOf.md)
 - [EzsignSuggestSignersV1ResponseMPayload](docs/EzsignSuggestSignersV1ResponseMPayload.md)
 - [EzsignSuggestTemplatesV1Response](docs/EzsignSuggestTemplatesV1Response.md)
 - [EzsignSuggestTemplatesV1ResponseAllOf](docs/EzsignSuggestTemplatesV1ResponseAllOf.md)
 - [EzsignSuggestTemplatesV1ResponseMPayload](docs/EzsignSuggestTemplatesV1ResponseMPayload.md)
 - [EzsignbulksendCreateEzsignbulksendtransmissionV1Request](docs/EzsignbulksendCreateEzsignbulksendtransmissionV1Request.md)
 - [EzsignbulksendCreateEzsignbulksendtransmissionV1Response](docs/EzsignbulksendCreateEzsignbulksendtransmissionV1Response.md)
 - [EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseAllOf](docs/EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseAllOf.md)
 - [EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload](docs/EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload.md)
 - [EzsignbulksendCreateObjectV1Request](docs/EzsignbulksendCreateObjectV1Request.md)
 - [EzsignbulksendCreateObjectV1Response](docs/EzsignbulksendCreateObjectV1Response.md)
 - [EzsignbulksendCreateObjectV1ResponseAllOf](docs/EzsignbulksendCreateObjectV1ResponseAllOf.md)
 - [EzsignbulksendCreateObjectV1ResponseMPayload](docs/EzsignbulksendCreateObjectV1ResponseMPayload.md)
 - [EzsignbulksendDeleteObjectV1Response](docs/EzsignbulksendDeleteObjectV1Response.md)
 - [EzsignbulksendEditObjectV1Request](docs/EzsignbulksendEditObjectV1Request.md)
 - [EzsignbulksendEditObjectV1Response](docs/EzsignbulksendEditObjectV1Response.md)
 - [EzsignbulksendGetEzsignbulksendtransmissionsV1Response](docs/EzsignbulksendGetEzsignbulksendtransmissionsV1Response.md)
 - [EzsignbulksendGetEzsignbulksendtransmissionsV1ResponseAllOf](docs/EzsignbulksendGetEzsignbulksendtransmissionsV1ResponseAllOf.md)
 - [EzsignbulksendGetEzsignbulksendtransmissionsV1ResponseMPayload](docs/EzsignbulksendGetEzsignbulksendtransmissionsV1ResponseMPayload.md)
 - [EzsignbulksendGetFormsDataV1Response](docs/EzsignbulksendGetFormsDataV1Response.md)
 - [EzsignbulksendGetFormsDataV1ResponseAllOf](docs/EzsignbulksendGetFormsDataV1ResponseAllOf.md)
 - [EzsignbulksendGetFormsDataV1ResponseMPayload](docs/EzsignbulksendGetFormsDataV1ResponseMPayload.md)
 - [EzsignbulksendGetListV1Response](docs/EzsignbulksendGetListV1Response.md)
 - [EzsignbulksendGetListV1ResponseAllOf](docs/EzsignbulksendGetListV1ResponseAllOf.md)
 - [EzsignbulksendGetListV1ResponseMPayload](docs/EzsignbulksendGetListV1ResponseMPayload.md)
 - [EzsignbulksendGetListV1ResponseMPayloadAllOf](docs/EzsignbulksendGetListV1ResponseMPayloadAllOf.md)
 - [EzsignbulksendGetObjectV1Response](docs/EzsignbulksendGetObjectV1Response.md)
 - [EzsignbulksendGetObjectV1ResponseAllOf](docs/EzsignbulksendGetObjectV1ResponseAllOf.md)
 - [EzsignbulksendGetObjectV1ResponseMPayload](docs/EzsignbulksendGetObjectV1ResponseMPayload.md)
 - [EzsignbulksendListElement](docs/EzsignbulksendListElement.md)
 - [EzsignbulksendReorderV1Request](docs/EzsignbulksendReorderV1Request.md)
 - [EzsignbulksendReorderV1Response](docs/EzsignbulksendReorderV1Response.md)
 - [EzsignbulksendRequest](docs/EzsignbulksendRequest.md)
 - [EzsignbulksendRequestCompound](docs/EzsignbulksendRequestCompound.md)
 - [EzsignbulksendResponse](docs/EzsignbulksendResponse.md)
 - [EzsignbulksendResponseCompound](docs/EzsignbulksendResponseCompound.md)
 - [EzsignbulksendResponseCompoundAllOf](docs/EzsignbulksendResponseCompoundAllOf.md)
 - [EzsignbulksenddocumentmappingCreateObjectV1Request](docs/EzsignbulksenddocumentmappingCreateObjectV1Request.md)
 - [EzsignbulksenddocumentmappingCreateObjectV1Response](docs/EzsignbulksenddocumentmappingCreateObjectV1Response.md)
 - [EzsignbulksenddocumentmappingCreateObjectV1ResponseAllOf](docs/EzsignbulksenddocumentmappingCreateObjectV1ResponseAllOf.md)
 - [EzsignbulksenddocumentmappingCreateObjectV1ResponseMPayload](docs/EzsignbulksenddocumentmappingCreateObjectV1ResponseMPayload.md)
 - [EzsignbulksenddocumentmappingDeleteObjectV1Response](docs/EzsignbulksenddocumentmappingDeleteObjectV1Response.md)
 - [EzsignbulksenddocumentmappingGetObjectV1Response](docs/EzsignbulksenddocumentmappingGetObjectV1Response.md)
 - [EzsignbulksenddocumentmappingGetObjectV1ResponseAllOf](docs/EzsignbulksenddocumentmappingGetObjectV1ResponseAllOf.md)
 - [EzsignbulksenddocumentmappingGetObjectV1ResponseMPayload](docs/EzsignbulksenddocumentmappingGetObjectV1ResponseMPayload.md)
 - [EzsignbulksenddocumentmappingRequest](docs/EzsignbulksenddocumentmappingRequest.md)
 - [EzsignbulksenddocumentmappingRequestCompound](docs/EzsignbulksenddocumentmappingRequestCompound.md)
 - [EzsignbulksenddocumentmappingResponse](docs/EzsignbulksenddocumentmappingResponse.md)
 - [EzsignbulksenddocumentmappingResponseCompound](docs/EzsignbulksenddocumentmappingResponseCompound.md)
 - [EzsignbulksenddocumentmappingResponseCompoundAllOf](docs/EzsignbulksenddocumentmappingResponseCompoundAllOf.md)
 - [EzsignbulksendsignermappingCreateObjectV1Request](docs/EzsignbulksendsignermappingCreateObjectV1Request.md)
 - [EzsignbulksendsignermappingCreateObjectV1Response](docs/EzsignbulksendsignermappingCreateObjectV1Response.md)
 - [EzsignbulksendsignermappingCreateObjectV1ResponseAllOf](docs/EzsignbulksendsignermappingCreateObjectV1ResponseAllOf.md)
 - [EzsignbulksendsignermappingCreateObjectV1ResponseMPayload](docs/EzsignbulksendsignermappingCreateObjectV1ResponseMPayload.md)
 - [EzsignbulksendsignermappingDeleteObjectV1Response](docs/EzsignbulksendsignermappingDeleteObjectV1Response.md)
 - [EzsignbulksendsignermappingGetObjectV1Response](docs/EzsignbulksendsignermappingGetObjectV1Response.md)
 - [EzsignbulksendsignermappingGetObjectV1ResponseAllOf](docs/EzsignbulksendsignermappingGetObjectV1ResponseAllOf.md)
 - [EzsignbulksendsignermappingGetObjectV1ResponseMPayload](docs/EzsignbulksendsignermappingGetObjectV1ResponseMPayload.md)
 - [EzsignbulksendsignermappingRequest](docs/EzsignbulksendsignermappingRequest.md)
 - [EzsignbulksendsignermappingRequestCompound](docs/EzsignbulksendsignermappingRequestCompound.md)
 - [EzsignbulksendsignermappingResponse](docs/EzsignbulksendsignermappingResponse.md)
 - [EzsignbulksendsignermappingResponseCompound](docs/EzsignbulksendsignermappingResponseCompound.md)
 - [EzsignbulksendtransmissionGetFormsDataV1Response](docs/EzsignbulksendtransmissionGetFormsDataV1Response.md)
 - [EzsignbulksendtransmissionGetFormsDataV1ResponseAllOf](docs/EzsignbulksendtransmissionGetFormsDataV1ResponseAllOf.md)
 - [EzsignbulksendtransmissionGetFormsDataV1ResponseMPayload](docs/EzsignbulksendtransmissionGetFormsDataV1ResponseMPayload.md)
 - [EzsignbulksendtransmissionGetObjectV1Response](docs/EzsignbulksendtransmissionGetObjectV1Response.md)
 - [EzsignbulksendtransmissionGetObjectV1ResponseAllOf](docs/EzsignbulksendtransmissionGetObjectV1ResponseAllOf.md)
 - [EzsignbulksendtransmissionGetObjectV1ResponseMPayload](docs/EzsignbulksendtransmissionGetObjectV1ResponseMPayload.md)
 - [EzsignbulksendtransmissionResponse](docs/EzsignbulksendtransmissionResponse.md)
 - [EzsignbulksendtransmissionResponseCompound](docs/EzsignbulksendtransmissionResponseCompound.md)
 - [EzsignbulksendtransmissionResponseCompoundAllOf](docs/EzsignbulksendtransmissionResponseCompoundAllOf.md)
 - [EzsigndocumentApplyEzsigntemplateV1Request](docs/EzsigndocumentApplyEzsigntemplateV1Request.md)
 - [EzsigndocumentApplyEzsigntemplateV1Response](docs/EzsigndocumentApplyEzsigntemplateV1Response.md)
 - [EzsigndocumentApplyEzsigntemplateV2Request](docs/EzsigndocumentApplyEzsigntemplateV2Request.md)
 - [EzsigndocumentApplyEzsigntemplateV2Response](docs/EzsigndocumentApplyEzsigntemplateV2Response.md)
 - [EzsigndocumentCreateObjectV1Request](docs/EzsigndocumentCreateObjectV1Request.md)
 - [EzsigndocumentCreateObjectV1Response](docs/EzsigndocumentCreateObjectV1Response.md)
 - [EzsigndocumentCreateObjectV1ResponseAllOf](docs/EzsigndocumentCreateObjectV1ResponseAllOf.md)
 - [EzsigndocumentCreateObjectV1ResponseMPayload](docs/EzsigndocumentCreateObjectV1ResponseMPayload.md)
 - [EzsigndocumentCreateObjectV2Request](docs/EzsigndocumentCreateObjectV2Request.md)
 - [EzsigndocumentCreateObjectV2Response](docs/EzsigndocumentCreateObjectV2Response.md)
 - [EzsigndocumentCreateObjectV2ResponseAllOf](docs/EzsigndocumentCreateObjectV2ResponseAllOf.md)
 - [EzsigndocumentCreateObjectV2ResponseMPayload](docs/EzsigndocumentCreateObjectV2ResponseMPayload.md)
 - [EzsigndocumentDeleteObjectV1Response](docs/EzsigndocumentDeleteObjectV1Response.md)
 - [EzsigndocumentEditEzsignformfieldgroupsV1Request](docs/EzsigndocumentEditEzsignformfieldgroupsV1Request.md)
 - [EzsigndocumentEditEzsignformfieldgroupsV1Response](docs/EzsigndocumentEditEzsignformfieldgroupsV1Response.md)
 - [EzsigndocumentEditEzsignformfieldgroupsV1ResponseAllOf](docs/EzsigndocumentEditEzsignformfieldgroupsV1ResponseAllOf.md)
 - [EzsigndocumentEditEzsignformfieldgroupsV1ResponseMPayload](docs/EzsigndocumentEditEzsignformfieldgroupsV1ResponseMPayload.md)
 - [EzsigndocumentEditEzsignsignaturesV1Request](docs/EzsigndocumentEditEzsignsignaturesV1Request.md)
 - [EzsigndocumentEditEzsignsignaturesV1Response](docs/EzsigndocumentEditEzsignsignaturesV1Response.md)
 - [EzsigndocumentEditEzsignsignaturesV1ResponseAllOf](docs/EzsigndocumentEditEzsignsignaturesV1ResponseAllOf.md)
 - [EzsigndocumentEditEzsignsignaturesV1ResponseMPayload](docs/EzsigndocumentEditEzsignsignaturesV1ResponseMPayload.md)
 - [EzsigndocumentEndPrematurelyV1Response](docs/EzsigndocumentEndPrematurelyV1Response.md)
 - [EzsigndocumentGetActionableElementsV1Response](docs/EzsigndocumentGetActionableElementsV1Response.md)
 - [EzsigndocumentGetActionableElementsV1ResponseAllOf](docs/EzsigndocumentGetActionableElementsV1ResponseAllOf.md)
 - [EzsigndocumentGetActionableElementsV1ResponseMPayload](docs/EzsigndocumentGetActionableElementsV1ResponseMPayload.md)
 - [EzsigndocumentGetDownloadUrlV1Response](docs/EzsigndocumentGetDownloadUrlV1Response.md)
 - [EzsigndocumentGetDownloadUrlV1ResponseAllOf](docs/EzsigndocumentGetDownloadUrlV1ResponseAllOf.md)
 - [EzsigndocumentGetDownloadUrlV1ResponseMPayload](docs/EzsigndocumentGetDownloadUrlV1ResponseMPayload.md)
 - [EzsigndocumentGetEzsignformfieldgroupsV1Response](docs/EzsigndocumentGetEzsignformfieldgroupsV1Response.md)
 - [EzsigndocumentGetEzsignformfieldgroupsV1ResponseAllOf](docs/EzsigndocumentGetEzsignformfieldgroupsV1ResponseAllOf.md)
 - [EzsigndocumentGetEzsignformfieldgroupsV1ResponseMPayload](docs/EzsigndocumentGetEzsignformfieldgroupsV1ResponseMPayload.md)
 - [EzsigndocumentGetEzsignpagesV1Response](docs/EzsigndocumentGetEzsignpagesV1Response.md)
 - [EzsigndocumentGetEzsignpagesV1ResponseAllOf](docs/EzsigndocumentGetEzsignpagesV1ResponseAllOf.md)
 - [EzsigndocumentGetEzsignpagesV1ResponseMPayload](docs/EzsigndocumentGetEzsignpagesV1ResponseMPayload.md)
 - [EzsigndocumentGetEzsignsignaturesV1Response](docs/EzsigndocumentGetEzsignsignaturesV1Response.md)
 - [EzsigndocumentGetEzsignsignaturesV1ResponseAllOf](docs/EzsigndocumentGetEzsignsignaturesV1ResponseAllOf.md)
 - [EzsigndocumentGetEzsignsignaturesV1ResponseMPayload](docs/EzsigndocumentGetEzsignsignaturesV1ResponseMPayload.md)
 - [EzsigndocumentGetFormDataV1Response](docs/EzsigndocumentGetFormDataV1Response.md)
 - [EzsigndocumentGetFormDataV1ResponseAllOf](docs/EzsigndocumentGetFormDataV1ResponseAllOf.md)
 - [EzsigndocumentGetFormDataV1ResponseMPayload](docs/EzsigndocumentGetFormDataV1ResponseMPayload.md)
 - [EzsigndocumentGetObjectV1Response](docs/EzsigndocumentGetObjectV1Response.md)
 - [EzsigndocumentGetObjectV1ResponseAllOf](docs/EzsigndocumentGetObjectV1ResponseAllOf.md)
 - [EzsigndocumentGetObjectV1ResponseMPayload](docs/EzsigndocumentGetObjectV1ResponseMPayload.md)
 - [EzsigndocumentGetTemporaryProofV1Response](docs/EzsigndocumentGetTemporaryProofV1Response.md)
 - [EzsigndocumentGetTemporaryProofV1ResponseAllOf](docs/EzsigndocumentGetTemporaryProofV1ResponseAllOf.md)
 - [EzsigndocumentGetTemporaryProofV1ResponseMPayload](docs/EzsigndocumentGetTemporaryProofV1ResponseMPayload.md)
 - [EzsigndocumentGetWordsPositionsV1Request](docs/EzsigndocumentGetWordsPositionsV1Request.md)
 - [EzsigndocumentGetWordsPositionsV1Response](docs/EzsigndocumentGetWordsPositionsV1Response.md)
 - [EzsigndocumentGetWordsPositionsV1ResponseAllOf](docs/EzsigndocumentGetWordsPositionsV1ResponseAllOf.md)
 - [EzsigndocumentPatchObjectV1Request](docs/EzsigndocumentPatchObjectV1Request.md)
 - [EzsigndocumentPatchObjectV1Response](docs/EzsigndocumentPatchObjectV1Response.md)
 - [EzsigndocumentRequest](docs/EzsigndocumentRequest.md)
 - [EzsigndocumentRequestCompound](docs/EzsigndocumentRequestCompound.md)
 - [EzsigndocumentRequestPatch](docs/EzsigndocumentRequestPatch.md)
 - [EzsigndocumentResponse](docs/EzsigndocumentResponse.md)
 - [EzsigndocumentResponseCompound](docs/EzsigndocumentResponseCompound.md)
 - [EzsigndocumentResponseCompoundAllOf](docs/EzsigndocumentResponseCompoundAllOf.md)
 - [EzsigndocumentUnsendV1Response](docs/EzsigndocumentUnsendV1Response.md)
 - [EzsigndocumentlogResponse](docs/EzsigndocumentlogResponse.md)
 - [EzsigndocumentlogResponseCompound](docs/EzsigndocumentlogResponseCompound.md)
 - [EzsignfolderArchiveV1Response](docs/EzsignfolderArchiveV1Response.md)
 - [EzsignfolderBatchDownloadV1Request](docs/EzsignfolderBatchDownloadV1Request.md)
 - [EzsignfolderCreateObjectV1Request](docs/EzsignfolderCreateObjectV1Request.md)
 - [EzsignfolderCreateObjectV1Response](docs/EzsignfolderCreateObjectV1Response.md)
 - [EzsignfolderCreateObjectV1ResponseAllOf](docs/EzsignfolderCreateObjectV1ResponseAllOf.md)
 - [EzsignfolderCreateObjectV1ResponseMPayload](docs/EzsignfolderCreateObjectV1ResponseMPayload.md)
 - [EzsignfolderCreateObjectV2Request](docs/EzsignfolderCreateObjectV2Request.md)
 - [EzsignfolderCreateObjectV2Response](docs/EzsignfolderCreateObjectV2Response.md)
 - [EzsignfolderCreateObjectV2ResponseAllOf](docs/EzsignfolderCreateObjectV2ResponseAllOf.md)
 - [EzsignfolderCreateObjectV2ResponseMPayload](docs/EzsignfolderCreateObjectV2ResponseMPayload.md)
 - [EzsignfolderDeleteObjectV1Response](docs/EzsignfolderDeleteObjectV1Response.md)
 - [EzsignfolderDisposeEzsignfoldersV1Request](docs/EzsignfolderDisposeEzsignfoldersV1Request.md)
 - [EzsignfolderDisposeEzsignfoldersV1Response](docs/EzsignfolderDisposeEzsignfoldersV1Response.md)
 - [EzsignfolderDisposeV1Response](docs/EzsignfolderDisposeV1Response.md)
 - [EzsignfolderEditObjectV1Request](docs/EzsignfolderEditObjectV1Request.md)
 - [EzsignfolderEditObjectV1Response](docs/EzsignfolderEditObjectV1Response.md)
 - [EzsignfolderGetActionableElementsV1Response](docs/EzsignfolderGetActionableElementsV1Response.md)
 - [EzsignfolderGetActionableElementsV1ResponseAllOf](docs/EzsignfolderGetActionableElementsV1ResponseAllOf.md)
 - [EzsignfolderGetActionableElementsV1ResponseMPayload](docs/EzsignfolderGetActionableElementsV1ResponseMPayload.md)
 - [EzsignfolderGetEzsigndocumentsV1Response](docs/EzsignfolderGetEzsigndocumentsV1Response.md)
 - [EzsignfolderGetEzsigndocumentsV1ResponseAllOf](docs/EzsignfolderGetEzsigndocumentsV1ResponseAllOf.md)
 - [EzsignfolderGetEzsigndocumentsV1ResponseMPayload](docs/EzsignfolderGetEzsigndocumentsV1ResponseMPayload.md)
 - [EzsignfolderGetEzsignfoldersignerassociationsV1Response](docs/EzsignfolderGetEzsignfoldersignerassociationsV1Response.md)
 - [EzsignfolderGetEzsignfoldersignerassociationsV1ResponseAllOf](docs/EzsignfolderGetEzsignfoldersignerassociationsV1ResponseAllOf.md)
 - [EzsignfolderGetEzsignfoldersignerassociationsV1ResponseMPayload](docs/EzsignfolderGetEzsignfoldersignerassociationsV1ResponseMPayload.md)
 - [EzsignfolderGetFormsDataV1Response](docs/EzsignfolderGetFormsDataV1Response.md)
 - [EzsignfolderGetFormsDataV1ResponseAllOf](docs/EzsignfolderGetFormsDataV1ResponseAllOf.md)
 - [EzsignfolderGetFormsDataV1ResponseMPayload](docs/EzsignfolderGetFormsDataV1ResponseMPayload.md)
 - [EzsignfolderGetListV1Response](docs/EzsignfolderGetListV1Response.md)
 - [EzsignfolderGetListV1ResponseAllOf](docs/EzsignfolderGetListV1ResponseAllOf.md)
 - [EzsignfolderGetListV1ResponseMPayload](docs/EzsignfolderGetListV1ResponseMPayload.md)
 - [EzsignfolderGetListV1ResponseMPayloadAllOf](docs/EzsignfolderGetListV1ResponseMPayloadAllOf.md)
 - [EzsignfolderGetObjectV1Response](docs/EzsignfolderGetObjectV1Response.md)
 - [EzsignfolderGetObjectV1ResponseAllOf](docs/EzsignfolderGetObjectV1ResponseAllOf.md)
 - [EzsignfolderGetObjectV1ResponseMPayload](docs/EzsignfolderGetObjectV1ResponseMPayload.md)
 - [EzsignfolderImportEzsigntemplatepackageV1Request](docs/EzsignfolderImportEzsigntemplatepackageV1Request.md)
 - [EzsignfolderImportEzsigntemplatepackageV1Response](docs/EzsignfolderImportEzsigntemplatepackageV1Response.md)
 - [EzsignfolderImportEzsigntemplatepackageV1ResponseAllOf](docs/EzsignfolderImportEzsigntemplatepackageV1ResponseAllOf.md)
 - [EzsignfolderImportEzsigntemplatepackageV1ResponseMPayload](docs/EzsignfolderImportEzsigntemplatepackageV1ResponseMPayload.md)
 - [EzsignfolderListElement](docs/EzsignfolderListElement.md)
 - [EzsignfolderReorderV1Request](docs/EzsignfolderReorderV1Request.md)
 - [EzsignfolderReorderV1Response](docs/EzsignfolderReorderV1Response.md)
 - [EzsignfolderRequest](docs/EzsignfolderRequest.md)
 - [EzsignfolderRequestCompound](docs/EzsignfolderRequestCompound.md)
 - [EzsignfolderResponse](docs/EzsignfolderResponse.md)
 - [EzsignfolderResponseCompound](docs/EzsignfolderResponseCompound.md)
 - [EzsignfolderSendV1Request](docs/EzsignfolderSendV1Request.md)
 - [EzsignfolderSendV1Response](docs/EzsignfolderSendV1Response.md)
 - [EzsignfolderUnsendV1Response](docs/EzsignfolderUnsendV1Response.md)
 - [EzsignfoldersignerassociationCreateObjectV1Request](docs/EzsignfoldersignerassociationCreateObjectV1Request.md)
 - [EzsignfoldersignerassociationCreateObjectV1Response](docs/EzsignfoldersignerassociationCreateObjectV1Response.md)
 - [EzsignfoldersignerassociationCreateObjectV1ResponseAllOf](docs/EzsignfoldersignerassociationCreateObjectV1ResponseAllOf.md)
 - [EzsignfoldersignerassociationCreateObjectV1ResponseMPayload](docs/EzsignfoldersignerassociationCreateObjectV1ResponseMPayload.md)
 - [EzsignfoldersignerassociationCreateObjectV2Request](docs/EzsignfoldersignerassociationCreateObjectV2Request.md)
 - [EzsignfoldersignerassociationCreateObjectV2Response](docs/EzsignfoldersignerassociationCreateObjectV2Response.md)
 - [EzsignfoldersignerassociationCreateObjectV2ResponseAllOf](docs/EzsignfoldersignerassociationCreateObjectV2ResponseAllOf.md)
 - [EzsignfoldersignerassociationCreateObjectV2ResponseMPayload](docs/EzsignfoldersignerassociationCreateObjectV2ResponseMPayload.md)
 - [EzsignfoldersignerassociationDeleteObjectV1Response](docs/EzsignfoldersignerassociationDeleteObjectV1Response.md)
 - [EzsignfoldersignerassociationEditObjectV1Request](docs/EzsignfoldersignerassociationEditObjectV1Request.md)
 - [EzsignfoldersignerassociationEditObjectV1Response](docs/EzsignfoldersignerassociationEditObjectV1Response.md)
 - [EzsignfoldersignerassociationGetInPersonLoginUrlV1Response](docs/EzsignfoldersignerassociationGetInPersonLoginUrlV1Response.md)
 - [EzsignfoldersignerassociationGetInPersonLoginUrlV1ResponseAllOf](docs/EzsignfoldersignerassociationGetInPersonLoginUrlV1ResponseAllOf.md)
 - [EzsignfoldersignerassociationGetInPersonLoginUrlV1ResponseMPayload](docs/EzsignfoldersignerassociationGetInPersonLoginUrlV1ResponseMPayload.md)
 - [EzsignfoldersignerassociationGetObjectV1Response](docs/EzsignfoldersignerassociationGetObjectV1Response.md)
 - [EzsignfoldersignerassociationGetObjectV1ResponseAllOf](docs/EzsignfoldersignerassociationGetObjectV1ResponseAllOf.md)
 - [EzsignfoldersignerassociationGetObjectV1ResponseMPayload](docs/EzsignfoldersignerassociationGetObjectV1ResponseMPayload.md)
 - [EzsignfoldersignerassociationRequest](docs/EzsignfoldersignerassociationRequest.md)
 - [EzsignfoldersignerassociationRequestCompound](docs/EzsignfoldersignerassociationRequestCompound.md)
 - [EzsignfoldersignerassociationRequestCompoundAllOf](docs/EzsignfoldersignerassociationRequestCompoundAllOf.md)
 - [EzsignfoldersignerassociationResponse](docs/EzsignfoldersignerassociationResponse.md)
 - [EzsignfoldersignerassociationResponseCompound](docs/EzsignfoldersignerassociationResponseCompound.md)
 - [EzsignfoldersignerassociationResponseCompoundAllOf](docs/EzsignfoldersignerassociationResponseCompoundAllOf.md)
 - [EzsignfoldersignerassociationResponseCompoundUser](docs/EzsignfoldersignerassociationResponseCompoundUser.md)
 - [EzsignfoldertypeGetListV1Response](docs/EzsignfoldertypeGetListV1Response.md)
 - [EzsignfoldertypeGetListV1ResponseAllOf](docs/EzsignfoldertypeGetListV1ResponseAllOf.md)
 - [EzsignfoldertypeGetListV1ResponseMPayload](docs/EzsignfoldertypeGetListV1ResponseMPayload.md)
 - [EzsignfoldertypeGetListV1ResponseMPayloadAllOf](docs/EzsignfoldertypeGetListV1ResponseMPayloadAllOf.md)
 - [EzsignfoldertypeListElement](docs/EzsignfoldertypeListElement.md)
 - [EzsignformfieldRequest](docs/EzsignformfieldRequest.md)
 - [EzsignformfieldRequestCompound](docs/EzsignformfieldRequestCompound.md)
 - [EzsignformfieldResponse](docs/EzsignformfieldResponse.md)
 - [EzsignformfieldResponseCompound](docs/EzsignformfieldResponseCompound.md)
 - [EzsignformfieldgroupCreateObjectV1Request](docs/EzsignformfieldgroupCreateObjectV1Request.md)
 - [EzsignformfieldgroupCreateObjectV1Response](docs/EzsignformfieldgroupCreateObjectV1Response.md)
 - [EzsignformfieldgroupCreateObjectV1ResponseAllOf](docs/EzsignformfieldgroupCreateObjectV1ResponseAllOf.md)
 - [EzsignformfieldgroupCreateObjectV1ResponseMPayload](docs/EzsignformfieldgroupCreateObjectV1ResponseMPayload.md)
 - [EzsignformfieldgroupDeleteObjectV1Response](docs/EzsignformfieldgroupDeleteObjectV1Response.md)
 - [EzsignformfieldgroupEditObjectV1Request](docs/EzsignformfieldgroupEditObjectV1Request.md)
 - [EzsignformfieldgroupEditObjectV1Response](docs/EzsignformfieldgroupEditObjectV1Response.md)
 - [EzsignformfieldgroupGetObjectV1Response](docs/EzsignformfieldgroupGetObjectV1Response.md)
 - [EzsignformfieldgroupGetObjectV1ResponseAllOf](docs/EzsignformfieldgroupGetObjectV1ResponseAllOf.md)
 - [EzsignformfieldgroupGetObjectV1ResponseMPayload](docs/EzsignformfieldgroupGetObjectV1ResponseMPayload.md)
 - [EzsignformfieldgroupRequest](docs/EzsignformfieldgroupRequest.md)
 - [EzsignformfieldgroupRequestCompound](docs/EzsignformfieldgroupRequestCompound.md)
 - [EzsignformfieldgroupRequestCompoundAllOf](docs/EzsignformfieldgroupRequestCompoundAllOf.md)
 - [EzsignformfieldgroupResponse](docs/EzsignformfieldgroupResponse.md)
 - [EzsignformfieldgroupResponseCompound](docs/EzsignformfieldgroupResponseCompound.md)
 - [EzsignformfieldgroupResponseCompoundAllOf](docs/EzsignformfieldgroupResponseCompoundAllOf.md)
 - [EzsignformfieldgroupsignerRequest](docs/EzsignformfieldgroupsignerRequest.md)
 - [EzsignformfieldgroupsignerRequestCompound](docs/EzsignformfieldgroupsignerRequestCompound.md)
 - [EzsignformfieldgroupsignerResponse](docs/EzsignformfieldgroupsignerResponse.md)
 - [EzsignformfieldgroupsignerResponseCompound](docs/EzsignformfieldgroupsignerResponseCompound.md)
 - [EzsignpageResponse](docs/EzsignpageResponse.md)
 - [EzsignpageResponseCompound](docs/EzsignpageResponseCompound.md)
 - [EzsignsignatureCreateObjectV1Request](docs/EzsignsignatureCreateObjectV1Request.md)
 - [EzsignsignatureCreateObjectV1Response](docs/EzsignsignatureCreateObjectV1Response.md)
 - [EzsignsignatureCreateObjectV1ResponseAllOf](docs/EzsignsignatureCreateObjectV1ResponseAllOf.md)
 - [EzsignsignatureCreateObjectV1ResponseMPayload](docs/EzsignsignatureCreateObjectV1ResponseMPayload.md)
 - [EzsignsignatureCreateObjectV2Request](docs/EzsignsignatureCreateObjectV2Request.md)
 - [EzsignsignatureCreateObjectV2Response](docs/EzsignsignatureCreateObjectV2Response.md)
 - [EzsignsignatureCreateObjectV2ResponseAllOf](docs/EzsignsignatureCreateObjectV2ResponseAllOf.md)
 - [EzsignsignatureCreateObjectV2ResponseMPayload](docs/EzsignsignatureCreateObjectV2ResponseMPayload.md)
 - [EzsignsignatureDeleteObjectV1Response](docs/EzsignsignatureDeleteObjectV1Response.md)
 - [EzsignsignatureEditObjectV1Request](docs/EzsignsignatureEditObjectV1Request.md)
 - [EzsignsignatureEditObjectV1Response](docs/EzsignsignatureEditObjectV1Response.md)
 - [EzsignsignatureGetObjectV1Response](docs/EzsignsignatureGetObjectV1Response.md)
 - [EzsignsignatureGetObjectV1ResponseAllOf](docs/EzsignsignatureGetObjectV1ResponseAllOf.md)
 - [EzsignsignatureGetObjectV1ResponseMPayload](docs/EzsignsignatureGetObjectV1ResponseMPayload.md)
 - [EzsignsignatureRequest](docs/EzsignsignatureRequest.md)
 - [EzsignsignatureRequestCompound](docs/EzsignsignatureRequestCompound.md)
 - [EzsignsignatureRequestCompoundAllOf](docs/EzsignsignatureRequestCompoundAllOf.md)
 - [EzsignsignatureResponse](docs/EzsignsignatureResponse.md)
 - [EzsignsignatureResponseCompound](docs/EzsignsignatureResponseCompound.md)
 - [EzsignsignatureResponseCompoundAllOf](docs/EzsignsignatureResponseCompoundAllOf.md)
 - [EzsignsignatureSignV1Request](docs/EzsignsignatureSignV1Request.md)
 - [EzsignsignatureSignV1Response](docs/EzsignsignatureSignV1Response.md)
 - [EzsignsignatureSignV1ResponseAllOf](docs/EzsignsignatureSignV1ResponseAllOf.md)
 - [EzsignsignaturecustomdateRequest](docs/EzsignsignaturecustomdateRequest.md)
 - [EzsignsignaturecustomdateRequestCompound](docs/EzsignsignaturecustomdateRequestCompound.md)
 - [EzsignsignaturecustomdateResponse](docs/EzsignsignaturecustomdateResponse.md)
 - [EzsignsignaturecustomdateResponseCompound](docs/EzsignsignaturecustomdateResponseCompound.md)
 - [EzsignsignerRequest](docs/EzsignsignerRequest.md)
 - [EzsignsignerRequestCompound](docs/EzsignsignerRequestCompound.md)
 - [EzsignsignerRequestCompoundAllOf](docs/EzsignsignerRequestCompoundAllOf.md)
 - [EzsignsignerRequestCompoundContact](docs/EzsignsignerRequestCompoundContact.md)
 - [EzsignsignerResponse](docs/EzsignsignerResponse.md)
 - [EzsignsignerResponseCompound](docs/EzsignsignerResponseCompound.md)
 - [EzsignsignerResponseCompoundAllOf](docs/EzsignsignerResponseCompoundAllOf.md)
 - [EzsignsignerResponseCompoundContact](docs/EzsignsignerResponseCompoundContact.md)
 - [EzsigntemplateCreateObjectV1Request](docs/EzsigntemplateCreateObjectV1Request.md)
 - [EzsigntemplateCreateObjectV1Response](docs/EzsigntemplateCreateObjectV1Response.md)
 - [EzsigntemplateCreateObjectV1ResponseAllOf](docs/EzsigntemplateCreateObjectV1ResponseAllOf.md)
 - [EzsigntemplateCreateObjectV1ResponseMPayload](docs/EzsigntemplateCreateObjectV1ResponseMPayload.md)
 - [EzsigntemplateDeleteObjectV1Response](docs/EzsigntemplateDeleteObjectV1Response.md)
 - [EzsigntemplateEditObjectV1Request](docs/EzsigntemplateEditObjectV1Request.md)
 - [EzsigntemplateEditObjectV1Response](docs/EzsigntemplateEditObjectV1Response.md)
 - [EzsigntemplateGetListV1Response](docs/EzsigntemplateGetListV1Response.md)
 - [EzsigntemplateGetListV1ResponseAllOf](docs/EzsigntemplateGetListV1ResponseAllOf.md)
 - [EzsigntemplateGetListV1ResponseMPayload](docs/EzsigntemplateGetListV1ResponseMPayload.md)
 - [EzsigntemplateGetListV1ResponseMPayloadAllOf](docs/EzsigntemplateGetListV1ResponseMPayloadAllOf.md)
 - [EzsigntemplateGetObjectV1Response](docs/EzsigntemplateGetObjectV1Response.md)
 - [EzsigntemplateGetObjectV1ResponseAllOf](docs/EzsigntemplateGetObjectV1ResponseAllOf.md)
 - [EzsigntemplateGetObjectV1ResponseMPayload](docs/EzsigntemplateGetObjectV1ResponseMPayload.md)
 - [EzsigntemplateListElement](docs/EzsigntemplateListElement.md)
 - [EzsigntemplateRequest](docs/EzsigntemplateRequest.md)
 - [EzsigntemplateRequestCompound](docs/EzsigntemplateRequestCompound.md)
 - [EzsigntemplateResponse](docs/EzsigntemplateResponse.md)
 - [EzsigntemplateResponseCompound](docs/EzsigntemplateResponseCompound.md)
 - [EzsigntemplateResponseCompoundAllOf](docs/EzsigntemplateResponseCompoundAllOf.md)
 - [EzsigntemplatedocumentCreateObjectV1Request](docs/EzsigntemplatedocumentCreateObjectV1Request.md)
 - [EzsigntemplatedocumentCreateObjectV1Response](docs/EzsigntemplatedocumentCreateObjectV1Response.md)
 - [EzsigntemplatedocumentCreateObjectV1ResponseAllOf](docs/EzsigntemplatedocumentCreateObjectV1ResponseAllOf.md)
 - [EzsigntemplatedocumentCreateObjectV1ResponseMPayload](docs/EzsigntemplatedocumentCreateObjectV1ResponseMPayload.md)
 - [EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Request](docs/EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Request.md)
 - [EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Response](docs/EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Response.md)
 - [EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1ResponseAllOf](docs/EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1ResponseAllOf.md)
 - [EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1ResponseMPayload](docs/EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1ResponseMPayload.md)
 - [EzsigntemplatedocumentEditEzsigntemplatesignaturesV1Request](docs/EzsigntemplatedocumentEditEzsigntemplatesignaturesV1Request.md)
 - [EzsigntemplatedocumentEditEzsigntemplatesignaturesV1Response](docs/EzsigntemplatedocumentEditEzsigntemplatesignaturesV1Response.md)
 - [EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseAllOf](docs/EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseAllOf.md)
 - [EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload](docs/EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload.md)
 - [EzsigntemplatedocumentEditObjectV1Request](docs/EzsigntemplatedocumentEditObjectV1Request.md)
 - [EzsigntemplatedocumentEditObjectV1Response](docs/EzsigntemplatedocumentEditObjectV1Response.md)
 - [EzsigntemplatedocumentEditObjectV1ResponseAllOf](docs/EzsigntemplatedocumentEditObjectV1ResponseAllOf.md)
 - [EzsigntemplatedocumentGetEzsigntemplatedocumentpagesV1Response](docs/EzsigntemplatedocumentGetEzsigntemplatedocumentpagesV1Response.md)
 - [EzsigntemplatedocumentGetEzsigntemplatedocumentpagesV1ResponseAllOf](docs/EzsigntemplatedocumentGetEzsigntemplatedocumentpagesV1ResponseAllOf.md)
 - [EzsigntemplatedocumentGetEzsigntemplatedocumentpagesV1ResponseMPayload](docs/EzsigntemplatedocumentGetEzsigntemplatedocumentpagesV1ResponseMPayload.md)
 - [EzsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1Response](docs/EzsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1Response.md)
 - [EzsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1ResponseAllOf](docs/EzsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1ResponseAllOf.md)
 - [EzsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1ResponseMPayload](docs/EzsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1ResponseMPayload.md)
 - [EzsigntemplatedocumentGetEzsigntemplatesignaturesV1Response](docs/EzsigntemplatedocumentGetEzsigntemplatesignaturesV1Response.md)
 - [EzsigntemplatedocumentGetEzsigntemplatesignaturesV1ResponseAllOf](docs/EzsigntemplatedocumentGetEzsigntemplatesignaturesV1ResponseAllOf.md)
 - [EzsigntemplatedocumentGetEzsigntemplatesignaturesV1ResponseMPayload](docs/EzsigntemplatedocumentGetEzsigntemplatesignaturesV1ResponseMPayload.md)
 - [EzsigntemplatedocumentGetObjectV1Response](docs/EzsigntemplatedocumentGetObjectV1Response.md)
 - [EzsigntemplatedocumentGetObjectV1ResponseAllOf](docs/EzsigntemplatedocumentGetObjectV1ResponseAllOf.md)
 - [EzsigntemplatedocumentGetObjectV1ResponseMPayload](docs/EzsigntemplatedocumentGetObjectV1ResponseMPayload.md)
 - [EzsigntemplatedocumentGetWordsPositionsV1Request](docs/EzsigntemplatedocumentGetWordsPositionsV1Request.md)
 - [EzsigntemplatedocumentGetWordsPositionsV1Response](docs/EzsigntemplatedocumentGetWordsPositionsV1Response.md)
 - [EzsigntemplatedocumentGetWordsPositionsV1ResponseAllOf](docs/EzsigntemplatedocumentGetWordsPositionsV1ResponseAllOf.md)
 - [EzsigntemplatedocumentPatchObjectV1Request](docs/EzsigntemplatedocumentPatchObjectV1Request.md)
 - [EzsigntemplatedocumentPatchObjectV1Response](docs/EzsigntemplatedocumentPatchObjectV1Response.md)
 - [EzsigntemplatedocumentRequest](docs/EzsigntemplatedocumentRequest.md)
 - [EzsigntemplatedocumentRequestCompound](docs/EzsigntemplatedocumentRequestCompound.md)
 - [EzsigntemplatedocumentRequestPatch](docs/EzsigntemplatedocumentRequestPatch.md)
 - [EzsigntemplatedocumentResponse](docs/EzsigntemplatedocumentResponse.md)
 - [EzsigntemplatedocumentResponseCompound](docs/EzsigntemplatedocumentResponseCompound.md)
 - [EzsigntemplatedocumentpageResponse](docs/EzsigntemplatedocumentpageResponse.md)
 - [EzsigntemplatedocumentpageResponseCompound](docs/EzsigntemplatedocumentpageResponseCompound.md)
 - [EzsigntemplateformfieldRequest](docs/EzsigntemplateformfieldRequest.md)
 - [EzsigntemplateformfieldRequestCompound](docs/EzsigntemplateformfieldRequestCompound.md)
 - [EzsigntemplateformfieldResponse](docs/EzsigntemplateformfieldResponse.md)
 - [EzsigntemplateformfieldResponseCompound](docs/EzsigntemplateformfieldResponseCompound.md)
 - [EzsigntemplateformfieldgroupCreateObjectV1Request](docs/EzsigntemplateformfieldgroupCreateObjectV1Request.md)
 - [EzsigntemplateformfieldgroupCreateObjectV1Response](docs/EzsigntemplateformfieldgroupCreateObjectV1Response.md)
 - [EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf](docs/EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf.md)
 - [EzsigntemplateformfieldgroupCreateObjectV1ResponseMPayload](docs/EzsigntemplateformfieldgroupCreateObjectV1ResponseMPayload.md)
 - [EzsigntemplateformfieldgroupDeleteObjectV1Response](docs/EzsigntemplateformfieldgroupDeleteObjectV1Response.md)
 - [EzsigntemplateformfieldgroupEditObjectV1Request](docs/EzsigntemplateformfieldgroupEditObjectV1Request.md)
 - [EzsigntemplateformfieldgroupEditObjectV1Response](docs/EzsigntemplateformfieldgroupEditObjectV1Response.md)
 - [EzsigntemplateformfieldgroupGetObjectV1Response](docs/EzsigntemplateformfieldgroupGetObjectV1Response.md)
 - [EzsigntemplateformfieldgroupGetObjectV1ResponseAllOf](docs/EzsigntemplateformfieldgroupGetObjectV1ResponseAllOf.md)
 - [EzsigntemplateformfieldgroupGetObjectV1ResponseMPayload](docs/EzsigntemplateformfieldgroupGetObjectV1ResponseMPayload.md)
 - [EzsigntemplateformfieldgroupRequest](docs/EzsigntemplateformfieldgroupRequest.md)
 - [EzsigntemplateformfieldgroupRequestCompound](docs/EzsigntemplateformfieldgroupRequestCompound.md)
 - [EzsigntemplateformfieldgroupRequestCompoundAllOf](docs/EzsigntemplateformfieldgroupRequestCompoundAllOf.md)
 - [EzsigntemplateformfieldgroupResponse](docs/EzsigntemplateformfieldgroupResponse.md)
 - [EzsigntemplateformfieldgroupResponseCompound](docs/EzsigntemplateformfieldgroupResponseCompound.md)
 - [EzsigntemplateformfieldgroupResponseCompoundAllOf](docs/EzsigntemplateformfieldgroupResponseCompoundAllOf.md)
 - [EzsigntemplateformfieldgroupsignerRequest](docs/EzsigntemplateformfieldgroupsignerRequest.md)
 - [EzsigntemplateformfieldgroupsignerRequestCompound](docs/EzsigntemplateformfieldgroupsignerRequestCompound.md)
 - [EzsigntemplateformfieldgroupsignerResponse](docs/EzsigntemplateformfieldgroupsignerResponse.md)
 - [EzsigntemplateformfieldgroupsignerResponseCompound](docs/EzsigntemplateformfieldgroupsignerResponseCompound.md)
 - [EzsigntemplatepackageCreateObjectV1Request](docs/EzsigntemplatepackageCreateObjectV1Request.md)
 - [EzsigntemplatepackageCreateObjectV1Response](docs/EzsigntemplatepackageCreateObjectV1Response.md)
 - [EzsigntemplatepackageCreateObjectV1ResponseAllOf](docs/EzsigntemplatepackageCreateObjectV1ResponseAllOf.md)
 - [EzsigntemplatepackageCreateObjectV1ResponseMPayload](docs/EzsigntemplatepackageCreateObjectV1ResponseMPayload.md)
 - [EzsigntemplatepackageDeleteObjectV1Response](docs/EzsigntemplatepackageDeleteObjectV1Response.md)
 - [EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Request](docs/EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Request.md)
 - [EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Response](docs/EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Response.md)
 - [EzsigntemplatepackageEditEzsigntemplatepackagesignersV1ResponseAllOf](docs/EzsigntemplatepackageEditEzsigntemplatepackagesignersV1ResponseAllOf.md)
 - [EzsigntemplatepackageEditEzsigntemplatepackagesignersV1ResponseMPayload](docs/EzsigntemplatepackageEditEzsigntemplatepackagesignersV1ResponseMPayload.md)
 - [EzsigntemplatepackageEditObjectV1Request](docs/EzsigntemplatepackageEditObjectV1Request.md)
 - [EzsigntemplatepackageEditObjectV1Response](docs/EzsigntemplatepackageEditObjectV1Response.md)
 - [EzsigntemplatepackageGetListV1Response](docs/EzsigntemplatepackageGetListV1Response.md)
 - [EzsigntemplatepackageGetListV1ResponseAllOf](docs/EzsigntemplatepackageGetListV1ResponseAllOf.md)
 - [EzsigntemplatepackageGetListV1ResponseMPayload](docs/EzsigntemplatepackageGetListV1ResponseMPayload.md)
 - [EzsigntemplatepackageGetListV1ResponseMPayloadAllOf](docs/EzsigntemplatepackageGetListV1ResponseMPayloadAllOf.md)
 - [EzsigntemplatepackageGetObjectV1Response](docs/EzsigntemplatepackageGetObjectV1Response.md)
 - [EzsigntemplatepackageGetObjectV1ResponseAllOf](docs/EzsigntemplatepackageGetObjectV1ResponseAllOf.md)
 - [EzsigntemplatepackageGetObjectV1ResponseMPayload](docs/EzsigntemplatepackageGetObjectV1ResponseMPayload.md)
 - [EzsigntemplatepackageListElement](docs/EzsigntemplatepackageListElement.md)
 - [EzsigntemplatepackageRequest](docs/EzsigntemplatepackageRequest.md)
 - [EzsigntemplatepackageRequestCompound](docs/EzsigntemplatepackageRequestCompound.md)
 - [EzsigntemplatepackageResponse](docs/EzsigntemplatepackageResponse.md)
 - [EzsigntemplatepackageResponseCompound](docs/EzsigntemplatepackageResponseCompound.md)
 - [EzsigntemplatepackageResponseCompoundAllOf](docs/EzsigntemplatepackageResponseCompoundAllOf.md)
 - [EzsigntemplatepackagemembershipCreateObjectV1Request](docs/EzsigntemplatepackagemembershipCreateObjectV1Request.md)
 - [EzsigntemplatepackagemembershipCreateObjectV1Response](docs/EzsigntemplatepackagemembershipCreateObjectV1Response.md)
 - [EzsigntemplatepackagemembershipCreateObjectV1ResponseAllOf](docs/EzsigntemplatepackagemembershipCreateObjectV1ResponseAllOf.md)
 - [EzsigntemplatepackagemembershipCreateObjectV1ResponseMPayload](docs/EzsigntemplatepackagemembershipCreateObjectV1ResponseMPayload.md)
 - [EzsigntemplatepackagemembershipDeleteObjectV1Response](docs/EzsigntemplatepackagemembershipDeleteObjectV1Response.md)
 - [EzsigntemplatepackagemembershipGetObjectV1Response](docs/EzsigntemplatepackagemembershipGetObjectV1Response.md)
 - [EzsigntemplatepackagemembershipGetObjectV1ResponseAllOf](docs/EzsigntemplatepackagemembershipGetObjectV1ResponseAllOf.md)
 - [EzsigntemplatepackagemembershipGetObjectV1ResponseMPayload](docs/EzsigntemplatepackagemembershipGetObjectV1ResponseMPayload.md)
 - [EzsigntemplatepackagemembershipRequest](docs/EzsigntemplatepackagemembershipRequest.md)
 - [EzsigntemplatepackagemembershipRequestCompound](docs/EzsigntemplatepackagemembershipRequestCompound.md)
 - [EzsigntemplatepackagemembershipResponse](docs/EzsigntemplatepackagemembershipResponse.md)
 - [EzsigntemplatepackagemembershipResponseCompound](docs/EzsigntemplatepackagemembershipResponseCompound.md)
 - [EzsigntemplatepackagemembershipResponseCompoundAllOf](docs/EzsigntemplatepackagemembershipResponseCompoundAllOf.md)
 - [EzsigntemplatepackagesignerCreateObjectV1Request](docs/EzsigntemplatepackagesignerCreateObjectV1Request.md)
 - [EzsigntemplatepackagesignerCreateObjectV1Response](docs/EzsigntemplatepackagesignerCreateObjectV1Response.md)
 - [EzsigntemplatepackagesignerCreateObjectV1ResponseAllOf](docs/EzsigntemplatepackagesignerCreateObjectV1ResponseAllOf.md)
 - [EzsigntemplatepackagesignerCreateObjectV1ResponseMPayload](docs/EzsigntemplatepackagesignerCreateObjectV1ResponseMPayload.md)
 - [EzsigntemplatepackagesignerDeleteObjectV1Response](docs/EzsigntemplatepackagesignerDeleteObjectV1Response.md)
 - [EzsigntemplatepackagesignerDeleteObjectV1ResponseAllOf](docs/EzsigntemplatepackagesignerDeleteObjectV1ResponseAllOf.md)
 - [EzsigntemplatepackagesignerDeleteObjectV1ResponseMPayload](docs/EzsigntemplatepackagesignerDeleteObjectV1ResponseMPayload.md)
 - [EzsigntemplatepackagesignerEditObjectV1Request](docs/EzsigntemplatepackagesignerEditObjectV1Request.md)
 - [EzsigntemplatepackagesignerEditObjectV1Response](docs/EzsigntemplatepackagesignerEditObjectV1Response.md)
 - [EzsigntemplatepackagesignerGetObjectV1Response](docs/EzsigntemplatepackagesignerGetObjectV1Response.md)
 - [EzsigntemplatepackagesignerGetObjectV1ResponseAllOf](docs/EzsigntemplatepackagesignerGetObjectV1ResponseAllOf.md)
 - [EzsigntemplatepackagesignerGetObjectV1ResponseMPayload](docs/EzsigntemplatepackagesignerGetObjectV1ResponseMPayload.md)
 - [EzsigntemplatepackagesignerRequest](docs/EzsigntemplatepackagesignerRequest.md)
 - [EzsigntemplatepackagesignerRequestCompound](docs/EzsigntemplatepackagesignerRequestCompound.md)
 - [EzsigntemplatepackagesignerResponse](docs/EzsigntemplatepackagesignerResponse.md)
 - [EzsigntemplatepackagesignerResponseCompound](docs/EzsigntemplatepackagesignerResponseCompound.md)
 - [EzsigntemplatepackagesignermembershipCreateObjectV1Request](docs/EzsigntemplatepackagesignermembershipCreateObjectV1Request.md)
 - [EzsigntemplatepackagesignermembershipCreateObjectV1Response](docs/EzsigntemplatepackagesignermembershipCreateObjectV1Response.md)
 - [EzsigntemplatepackagesignermembershipCreateObjectV1ResponseAllOf](docs/EzsigntemplatepackagesignermembershipCreateObjectV1ResponseAllOf.md)
 - [EzsigntemplatepackagesignermembershipCreateObjectV1ResponseMPayload](docs/EzsigntemplatepackagesignermembershipCreateObjectV1ResponseMPayload.md)
 - [EzsigntemplatepackagesignermembershipDeleteObjectV1Response](docs/EzsigntemplatepackagesignermembershipDeleteObjectV1Response.md)
 - [EzsigntemplatepackagesignermembershipDeleteObjectV1ResponseAllOf](docs/EzsigntemplatepackagesignermembershipDeleteObjectV1ResponseAllOf.md)
 - [EzsigntemplatepackagesignermembershipDeleteObjectV1ResponseMPayload](docs/EzsigntemplatepackagesignermembershipDeleteObjectV1ResponseMPayload.md)
 - [EzsigntemplatepackagesignermembershipGetObjectV1Response](docs/EzsigntemplatepackagesignermembershipGetObjectV1Response.md)
 - [EzsigntemplatepackagesignermembershipGetObjectV1ResponseAllOf](docs/EzsigntemplatepackagesignermembershipGetObjectV1ResponseAllOf.md)
 - [EzsigntemplatepackagesignermembershipGetObjectV1ResponseMPayload](docs/EzsigntemplatepackagesignermembershipGetObjectV1ResponseMPayload.md)
 - [EzsigntemplatepackagesignermembershipRequest](docs/EzsigntemplatepackagesignermembershipRequest.md)
 - [EzsigntemplatepackagesignermembershipRequestCompound](docs/EzsigntemplatepackagesignermembershipRequestCompound.md)
 - [EzsigntemplatepackagesignermembershipResponse](docs/EzsigntemplatepackagesignermembershipResponse.md)
 - [EzsigntemplatepackagesignermembershipResponseCompound](docs/EzsigntemplatepackagesignermembershipResponseCompound.md)
 - [EzsigntemplatesignatureCreateObjectV1Request](docs/EzsigntemplatesignatureCreateObjectV1Request.md)
 - [EzsigntemplatesignatureCreateObjectV1Response](docs/EzsigntemplatesignatureCreateObjectV1Response.md)
 - [EzsigntemplatesignatureCreateObjectV1ResponseAllOf](docs/EzsigntemplatesignatureCreateObjectV1ResponseAllOf.md)
 - [EzsigntemplatesignatureCreateObjectV1ResponseMPayload](docs/EzsigntemplatesignatureCreateObjectV1ResponseMPayload.md)
 - [EzsigntemplatesignatureDeleteObjectV1Response](docs/EzsigntemplatesignatureDeleteObjectV1Response.md)
 - [EzsigntemplatesignatureEditObjectV1Request](docs/EzsigntemplatesignatureEditObjectV1Request.md)
 - [EzsigntemplatesignatureEditObjectV1Response](docs/EzsigntemplatesignatureEditObjectV1Response.md)
 - [EzsigntemplatesignatureGetObjectV1Response](docs/EzsigntemplatesignatureGetObjectV1Response.md)
 - [EzsigntemplatesignatureGetObjectV1ResponseAllOf](docs/EzsigntemplatesignatureGetObjectV1ResponseAllOf.md)
 - [EzsigntemplatesignatureGetObjectV1ResponseMPayload](docs/EzsigntemplatesignatureGetObjectV1ResponseMPayload.md)
 - [EzsigntemplatesignatureRequest](docs/EzsigntemplatesignatureRequest.md)
 - [EzsigntemplatesignatureRequestCompound](docs/EzsigntemplatesignatureRequestCompound.md)
 - [EzsigntemplatesignatureRequestCompoundAllOf](docs/EzsigntemplatesignatureRequestCompoundAllOf.md)
 - [EzsigntemplatesignatureResponse](docs/EzsigntemplatesignatureResponse.md)
 - [EzsigntemplatesignatureResponseCompound](docs/EzsigntemplatesignatureResponseCompound.md)
 - [EzsigntemplatesignatureResponseCompoundAllOf](docs/EzsigntemplatesignatureResponseCompoundAllOf.md)
 - [EzsigntemplatesignaturecustomdateRequest](docs/EzsigntemplatesignaturecustomdateRequest.md)
 - [EzsigntemplatesignaturecustomdateRequestCompound](docs/EzsigntemplatesignaturecustomdateRequestCompound.md)
 - [EzsigntemplatesignaturecustomdateResponse](docs/EzsigntemplatesignaturecustomdateResponse.md)
 - [EzsigntemplatesignaturecustomdateResponseCompound](docs/EzsigntemplatesignaturecustomdateResponseCompound.md)
 - [EzsigntemplatesignerCreateObjectV1Request](docs/EzsigntemplatesignerCreateObjectV1Request.md)
 - [EzsigntemplatesignerCreateObjectV1Response](docs/EzsigntemplatesignerCreateObjectV1Response.md)
 - [EzsigntemplatesignerCreateObjectV1ResponseAllOf](docs/EzsigntemplatesignerCreateObjectV1ResponseAllOf.md)
 - [EzsigntemplatesignerCreateObjectV1ResponseMPayload](docs/EzsigntemplatesignerCreateObjectV1ResponseMPayload.md)
 - [EzsigntemplatesignerDeleteObjectV1Response](docs/EzsigntemplatesignerDeleteObjectV1Response.md)
 - [EzsigntemplatesignerEditObjectV1Request](docs/EzsigntemplatesignerEditObjectV1Request.md)
 - [EzsigntemplatesignerEditObjectV1Response](docs/EzsigntemplatesignerEditObjectV1Response.md)
 - [EzsigntemplatesignerGetObjectV1Response](docs/EzsigntemplatesignerGetObjectV1Response.md)
 - [EzsigntemplatesignerGetObjectV1ResponseAllOf](docs/EzsigntemplatesignerGetObjectV1ResponseAllOf.md)
 - [EzsigntemplatesignerGetObjectV1ResponseMPayload](docs/EzsigntemplatesignerGetObjectV1ResponseMPayload.md)
 - [EzsigntemplatesignerRequest](docs/EzsigntemplatesignerRequest.md)
 - [EzsigntemplatesignerRequestCompound](docs/EzsigntemplatesignerRequestCompound.md)
 - [EzsigntemplatesignerResponse](docs/EzsigntemplatesignerResponse.md)
 - [EzsigntemplatesignerResponseCompound](docs/EzsigntemplatesignerResponseCompound.md)
 - [FieldEActivesessionUsertype](docs/FieldEActivesessionUsertype.md)
 - [FieldEActivesessionWeekdaystart](docs/FieldEActivesessionWeekdaystart.md)
 - [FieldEEzsigndocumentStep](docs/FieldEEzsigndocumentStep.md)
 - [FieldEEzsigndocumentlogType](docs/FieldEEzsigndocumentlogType.md)
 - [FieldEEzsignfolderSendreminderfrequency](docs/FieldEEzsignfolderSendreminderfrequency.md)
 - [FieldEEzsignfolderStep](docs/FieldEEzsignfolderStep.md)
 - [FieldEEzsignfoldertypePrivacylevel](docs/FieldEEzsignfoldertypePrivacylevel.md)
 - [FieldEEzsignformfieldgroupSignerrequirement](docs/FieldEEzsignformfieldgroupSignerrequirement.md)
 - [FieldEEzsignformfieldgroupTooltipposition](docs/FieldEEzsignformfieldgroupTooltipposition.md)
 - [FieldEEzsignformfieldgroupType](docs/FieldEEzsignformfieldgroupType.md)
 - [FieldEEzsignsignatureFont](docs/FieldEEzsignsignatureFont.md)
 - [FieldEEzsignsignatureTooltipposition](docs/FieldEEzsignsignatureTooltipposition.md)
 - [FieldEEzsignsignatureType](docs/FieldEEzsignsignatureType.md)
 - [FieldEEzsigntemplateformfieldgroupSignerrequirement](docs/FieldEEzsigntemplateformfieldgroupSignerrequirement.md)
 - [FieldEEzsigntemplateformfieldgroupTooltipposition](docs/FieldEEzsigntemplateformfieldgroupTooltipposition.md)
 - [FieldEEzsigntemplateformfieldgroupType](docs/FieldEEzsigntemplateformfieldgroupType.md)
 - [FieldEEzsigntemplatesignatureFont](docs/FieldEEzsigntemplatesignatureFont.md)
 - [FieldEEzsigntemplatesignatureTooltipposition](docs/FieldEEzsigntemplatesignatureTooltipposition.md)
 - [FieldEEzsigntemplatesignatureType](docs/FieldEEzsigntemplatesignatureType.md)
 - [FieldENotificationpreferenceStatus](docs/FieldENotificationpreferenceStatus.md)
 - [FieldEPhoneType](docs/FieldEPhoneType.md)
 - [FieldEUserEzsignsendreminderfrequency](docs/FieldEUserEzsignsendreminderfrequency.md)
 - [FieldEUserType](docs/FieldEUserType.md)
 - [FranchisereferalincomeCreateObjectV1Request](docs/FranchisereferalincomeCreateObjectV1Request.md)
 - [FranchisereferalincomeCreateObjectV1Response](docs/FranchisereferalincomeCreateObjectV1Response.md)
 - [FranchisereferalincomeCreateObjectV1ResponseAllOf](docs/FranchisereferalincomeCreateObjectV1ResponseAllOf.md)
 - [FranchisereferalincomeCreateObjectV1ResponseMPayload](docs/FranchisereferalincomeCreateObjectV1ResponseMPayload.md)
 - [FranchisereferalincomeCreateObjectV2Request](docs/FranchisereferalincomeCreateObjectV2Request.md)
 - [FranchisereferalincomeCreateObjectV2Response](docs/FranchisereferalincomeCreateObjectV2Response.md)
 - [FranchisereferalincomeCreateObjectV2ResponseAllOf](docs/FranchisereferalincomeCreateObjectV2ResponseAllOf.md)
 - [FranchisereferalincomeCreateObjectV2ResponseMPayload](docs/FranchisereferalincomeCreateObjectV2ResponseMPayload.md)
 - [FranchisereferalincomeRequest](docs/FranchisereferalincomeRequest.md)
 - [FranchisereferalincomeRequestCompound](docs/FranchisereferalincomeRequestCompound.md)
 - [FranchisereferalincomeRequestCompoundAllOf](docs/FranchisereferalincomeRequestCompoundAllOf.md)
 - [GlobalCustomerGetEndpointV1Response](docs/GlobalCustomerGetEndpointV1Response.md)
 - [HeaderAcceptLanguage](docs/HeaderAcceptLanguage.md)
 - [MultilingualApikeyDescription](docs/MultilingualApikeyDescription.md)
 - [NotificationsectionGetNotificationtestsV1Response](docs/NotificationsectionGetNotificationtestsV1Response.md)
 - [NotificationsectionGetNotificationtestsV1ResponseAllOf](docs/NotificationsectionGetNotificationtestsV1ResponseAllOf.md)
 - [NotificationsectionGetNotificationtestsV1ResponseMPayload](docs/NotificationsectionGetNotificationtestsV1ResponseMPayload.md)
 - [NotificationsubsectionResponse](docs/NotificationsubsectionResponse.md)
 - [NotificationtestGetElementsV1Response](docs/NotificationtestGetElementsV1Response.md)
 - [NotificationtestGetElementsV1ResponseAllOf](docs/NotificationtestGetElementsV1ResponseAllOf.md)
 - [NotificationtestGetElementsV1ResponseMPayload](docs/NotificationtestGetElementsV1ResponseMPayload.md)
 - [NotificationtestResponse](docs/NotificationtestResponse.md)
 - [PhoneRequest](docs/PhoneRequest.md)
 - [PhoneRequestCompound](docs/PhoneRequestCompound.md)
 - [UserCreateEzsignuserV1Request](docs/UserCreateEzsignuserV1Request.md)
 - [UserCreateEzsignuserV1Response](docs/UserCreateEzsignuserV1Response.md)
 - [UserCreateEzsignuserV1ResponseAllOf](docs/UserCreateEzsignuserV1ResponseAllOf.md)
 - [UserCreateEzsignuserV1ResponseMPayload](docs/UserCreateEzsignuserV1ResponseMPayload.md)
 - [UserResponse](docs/UserResponse.md)
 - [UserResponseCompound](docs/UserResponseCompound.md)
 - [WebhookEzsignDocumentCompleted](docs/WebhookEzsignDocumentCompleted.md)
 - [WebhookEzsignDocumentCompletedAllOf](docs/WebhookEzsignDocumentCompletedAllOf.md)
 - [WebhookEzsignFolderCompleted](docs/WebhookEzsignFolderCompleted.md)
 - [WebhookEzsignFolderCompletedAllOf](docs/WebhookEzsignFolderCompletedAllOf.md)
 - [WebhookResponse](docs/WebhookResponse.md)
 - [WebhookUserUserCreated](docs/WebhookUserUserCreated.md)
 - [WebhookUserUserCreatedAllOf](docs/WebhookUserUserCreatedAllOf.md)
 - [WebsiteRequest](docs/WebsiteRequest.md)
 - [WebsiteRequestCompound](docs/WebsiteRequestCompound.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Authorization

- **Type**: API key

- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support-api@ezmax.ca

