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
*GlobalEzmaxclientApi* | [**globalEzmaxclientVersionV1**](docs/GlobalEzmaxclientApi.md#globalEzmaxclientVersionV1) | **GET** /1/ezmaxclient/{pksEzmaxclientOs}/version | Retrieve the latest version of the Ezmaxclient
*GlobalEzmaxcustomerApi* | [**globalEzmaxcustomerGetConfigurationV1**](docs/GlobalEzmaxcustomerApi.md#globalEzmaxcustomerGetConfigurationV1) | **GET** /1/ezmaxcustomer/{pksEzmaxcustomerCode}/getConfiguration | Get ezmaxcustomer configuration
*ModuleReportApi* | [**reportGetReportFromCacheV1**](docs/ModuleReportApi.md#reportGetReportFromCacheV1) | **GET** /1/module/report/getReportFromCache/{sReportgroupCacheID} | Retrieve report from cache
*ModuleUserApi* | [**userCreateEzsignuserV1**](docs/ModuleUserApi.md#userCreateEzsignuserV1) | **POST** /1/module/user/createezsignuser | Create a new User of type Ezsignuser
*ObjectActivesessionApi* | [**activesessionGenerateFederationTokenV1**](docs/ObjectActivesessionApi.md#activesessionGenerateFederationTokenV1) | **POST** /1/object/activesession/generateFederationToken | Generate a federation token
*ObjectActivesessionApi* | [**activesessionGetCurrentV1**](docs/ObjectActivesessionApi.md#activesessionGetCurrentV1) | **GET** /1/object/activesession/getCurrent | Get Current Activesession
*ObjectActivesessionApi* | [**activesessionGetCurrentV2**](docs/ObjectActivesessionApi.md#activesessionGetCurrentV2) | **GET** /2/object/activesession/getCurrent | Get Current Activesession
*ObjectActivesessionApi* | [**activesessionGetListV1**](docs/ObjectActivesessionApi.md#activesessionGetListV1) | **GET** /1/object/activesession/getList | Retrieve Activesession list
*ObjectApikeyApi* | [**apikeyCreateObjectV2**](docs/ObjectApikeyApi.md#apikeyCreateObjectV2) | **POST** /2/object/apikey | Create a new Apikey
*ObjectApikeyApi* | [**apikeyEditObjectV1**](docs/ObjectApikeyApi.md#apikeyEditObjectV1) | **PUT** /1/object/apikey/{pkiApikeyID} | Edit an existing Apikey
*ObjectApikeyApi* | [**apikeyEditPermissionsV1**](docs/ObjectApikeyApi.md#apikeyEditPermissionsV1) | **PUT** /1/object/apikey/{pkiApikeyID}/editPermissions | Edit multiple Permissions
*ObjectApikeyApi* | [**apikeyGenerateDelegatedCredentialsV1**](docs/ObjectApikeyApi.md#apikeyGenerateDelegatedCredentialsV1) | **POST** /1/object/apikey/generateDelegatedCredentials | Generate a delegated credentials
*ObjectApikeyApi* | [**apikeyGetCorsV1**](docs/ObjectApikeyApi.md#apikeyGetCorsV1) | **GET** /1/object/apikey/{pkiApikeyID}/getCors | Retrieve an existing Apikey&#39;s cors
*ObjectApikeyApi* | [**apikeyGetListV1**](docs/ObjectApikeyApi.md#apikeyGetListV1) | **GET** /1/object/apikey/getList | Retrieve Apikey list
*ObjectApikeyApi* | [**apikeyGetObjectV2**](docs/ObjectApikeyApi.md#apikeyGetObjectV2) | **GET** /2/object/apikey/{pkiApikeyID} | Retrieve an existing Apikey
*ObjectApikeyApi* | [**apikeyGetPermissionsV1**](docs/ObjectApikeyApi.md#apikeyGetPermissionsV1) | **GET** /1/object/apikey/{pkiApikeyID}/getPermissions | Retrieve an existing Apikey&#39;s Permissions
*ObjectApikeyApi* | [**apikeyGetSubnetsV1**](docs/ObjectApikeyApi.md#apikeyGetSubnetsV1) | **GET** /1/object/apikey/{pkiApikeyID}/getSubnets | Retrieve an existing Apikey&#39;s subnets
*ObjectApikeyApi* | [**apikeyRegenerateV1**](docs/ObjectApikeyApi.md#apikeyRegenerateV1) | **POST** /1/object/apikey/{pkiApikeyID}/regenerate | Regenerate the Apikey
*ObjectAttachmentApi* | [**attachmentDownloadV1**](docs/ObjectAttachmentApi.md#attachmentDownloadV1) | **GET** /1/object/attachment/{pkiAttachmentID}/download | Retrieve the content
*ObjectAttachmentApi* | [**attachmentGetAttachmentlogsV1**](docs/ObjectAttachmentApi.md#attachmentGetAttachmentlogsV1) | **GET** /1/object/attachment/{pkiAttachmentID}/getAttachmentlogs | Retrieve the Attachmentlogs
*ObjectAuthenticationexternalApi* | [**authenticationexternalCreateObjectV1**](docs/ObjectAuthenticationexternalApi.md#authenticationexternalCreateObjectV1) | **POST** /1/object/authenticationexternal | Create a new Authenticationexternal
*ObjectAuthenticationexternalApi* | [**authenticationexternalDeleteObjectV1**](docs/ObjectAuthenticationexternalApi.md#authenticationexternalDeleteObjectV1) | **DELETE** /1/object/authenticationexternal/{pkiAuthenticationexternalID} | Delete an existing Authenticationexternal
*ObjectAuthenticationexternalApi* | [**authenticationexternalEditObjectV1**](docs/ObjectAuthenticationexternalApi.md#authenticationexternalEditObjectV1) | **PUT** /1/object/authenticationexternal/{pkiAuthenticationexternalID} | Edit an existing Authenticationexternal
*ObjectAuthenticationexternalApi* | [**authenticationexternalGetAutocompleteV2**](docs/ObjectAuthenticationexternalApi.md#authenticationexternalGetAutocompleteV2) | **GET** /2/object/authenticationexternal/getAutocomplete/{sSelector} | Retrieve Authenticationexternals and IDs
*ObjectAuthenticationexternalApi* | [**authenticationexternalGetListV1**](docs/ObjectAuthenticationexternalApi.md#authenticationexternalGetListV1) | **GET** /1/object/authenticationexternal/getList | Retrieve Authenticationexternal list
*ObjectAuthenticationexternalApi* | [**authenticationexternalGetObjectV2**](docs/ObjectAuthenticationexternalApi.md#authenticationexternalGetObjectV2) | **GET** /2/object/authenticationexternal/{pkiAuthenticationexternalID} | Retrieve an existing Authenticationexternal
*ObjectAuthenticationexternalApi* | [**authenticationexternalResetAuthorizationV1**](docs/ObjectAuthenticationexternalApi.md#authenticationexternalResetAuthorizationV1) | **POST** /1/object/authenticationexternal/{pkiAuthenticationexternalID}/resetAuthorization | Reset the Authenticationexternal authorization
*ObjectBillingentityexternalApi* | [**billingentityexternalGenerateFederationTokenV1**](docs/ObjectBillingentityexternalApi.md#billingentityexternalGenerateFederationTokenV1) | **POST** /1/object/billingentityexternal/{pkiBillingentityexternalID}/generateFederationToken | Generate a federation token
*ObjectBillingentityexternalApi* | [**billingentityexternalGetAutocompleteV2**](docs/ObjectBillingentityexternalApi.md#billingentityexternalGetAutocompleteV2) | **GET** /2/object/billingentityexternal/getAutocomplete/{sSelector} | Retrieve Billingentityexternals and IDs
*ObjectBillingentityinternalApi* | [**billingentityinternalCreateObjectV1**](docs/ObjectBillingentityinternalApi.md#billingentityinternalCreateObjectV1) | **POST** /1/object/billingentityinternal | Create a new Billingentityinternal
*ObjectBillingentityinternalApi* | [**billingentityinternalEditObjectV1**](docs/ObjectBillingentityinternalApi.md#billingentityinternalEditObjectV1) | **PUT** /1/object/billingentityinternal/{pkiBillingentityinternalID} | Edit an existing Billingentityinternal
*ObjectBillingentityinternalApi* | [**billingentityinternalGetAutocompleteV2**](docs/ObjectBillingentityinternalApi.md#billingentityinternalGetAutocompleteV2) | **GET** /2/object/billingentityinternal/getAutocomplete/{sSelector} | Retrieve Billingentityinternals and IDs
*ObjectBillingentityinternalApi* | [**billingentityinternalGetListV1**](docs/ObjectBillingentityinternalApi.md#billingentityinternalGetListV1) | **GET** /1/object/billingentityinternal/getList | Retrieve Billingentityinternal list
*ObjectBillingentityinternalApi* | [**billingentityinternalGetObjectV2**](docs/ObjectBillingentityinternalApi.md#billingentityinternalGetObjectV2) | **GET** /2/object/billingentityinternal/{pkiBillingentityinternalID} | Retrieve an existing Billingentityinternal
*ObjectBrandingApi* | [**brandingCreateObjectV2**](docs/ObjectBrandingApi.md#brandingCreateObjectV2) | **POST** /2/object/branding | Create a new Branding
*ObjectBrandingApi* | [**brandingEditObjectV2**](docs/ObjectBrandingApi.md#brandingEditObjectV2) | **PUT** /2/object/branding/{pkiBrandingID} | Edit an existing Branding
*ObjectBrandingApi* | [**brandingGetAutocompleteV2**](docs/ObjectBrandingApi.md#brandingGetAutocompleteV2) | **GET** /2/object/branding/getAutocomplete/{sSelector} | Retrieve Brandings and IDs
*ObjectBrandingApi* | [**brandingGetListV1**](docs/ObjectBrandingApi.md#brandingGetListV1) | **GET** /1/object/branding/getList | Retrieve Branding list
*ObjectBrandingApi* | [**brandingGetObjectV3**](docs/ObjectBrandingApi.md#brandingGetObjectV3) | **GET** /3/object/branding/{pkiBrandingID} | Retrieve an existing Branding
*ObjectBuyercontractApi* | [**buyercontractGetCommunicationCountV1**](docs/ObjectBuyercontractApi.md#buyercontractGetCommunicationCountV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationCount | Retrieve Communication count
*ObjectBuyercontractApi* | [**buyercontractGetCommunicationListV1**](docs/ObjectBuyercontractApi.md#buyercontractGetCommunicationListV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationList | Retrieve Communication list
*ObjectBuyercontractApi* | [**buyercontractGetCommunicationrecipientsV1**](docs/ObjectBuyercontractApi.md#buyercontractGetCommunicationrecipientsV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationrecipients | Retrieve Buyercontract&#39;s Communicationrecipient
*ObjectBuyercontractApi* | [**buyercontractGetCommunicationsendersV1**](docs/ObjectBuyercontractApi.md#buyercontractGetCommunicationsendersV1) | **GET** /1/object/buyercontract/{pkiBuyercontractID}/getCommunicationsenders | Retrieve Buyercontract&#39;s Communicationsender
*ObjectClonehistoryApi* | [**clonehistoryGetListV1**](docs/ObjectClonehistoryApi.md#clonehistoryGetListV1) | **GET** /1/object/clonehistory/getList | Retrieve Clonehistory list
*ObjectCommunicationApi* | [**communicationGetCommunicationBodyV1**](docs/ObjectCommunicationApi.md#communicationGetCommunicationBodyV1) | **GET** /1/object/communication/{pkiCommunicationID}/getCommunicationBody | Retrieve the communication body.
*ObjectCommunicationApi* | [**communicationSendV1**](docs/ObjectCommunicationApi.md#communicationSendV1) | **POST** /1/object/communication/send | Send a new Communication
*ObjectCompanyApi* | [**companyGetAutocompleteV2**](docs/ObjectCompanyApi.md#companyGetAutocompleteV2) | **GET** /2/object/company/getAutocomplete/{sSelector} | Retrieve Companys and IDs
*ObjectContacttitleApi* | [**contacttitleGetAutocompleteV2**](docs/ObjectContacttitleApi.md#contacttitleGetAutocompleteV2) | **GET** /2/object/contacttitle/getAutocomplete/{sSelector} | Retrieve Contacttitles and IDs
*ObjectCorsApi* | [**corsCreateObjectV1**](docs/ObjectCorsApi.md#corsCreateObjectV1) | **POST** /1/object/cors | Create a new Cors
*ObjectCorsApi* | [**corsDeleteObjectV1**](docs/ObjectCorsApi.md#corsDeleteObjectV1) | **DELETE** /1/object/cors/{pkiCorsID} | Delete an existing Cors
*ObjectCorsApi* | [**corsEditObjectV1**](docs/ObjectCorsApi.md#corsEditObjectV1) | **PUT** /1/object/cors/{pkiCorsID} | Edit an existing Cors
*ObjectCorsApi* | [**corsGetObjectV2**](docs/ObjectCorsApi.md#corsGetObjectV2) | **GET** /2/object/cors/{pkiCorsID} | Retrieve an existing Cors
*ObjectCountryApi* | [**countryGetAutocompleteV2**](docs/ObjectCountryApi.md#countryGetAutocompleteV2) | **GET** /2/object/country/getAutocomplete/{sSelector} | Retrieve Countries and IDs
*ObjectCreditcardclientApi* | [**creditcardclientCreateObjectV1**](docs/ObjectCreditcardclientApi.md#creditcardclientCreateObjectV1) | **POST** /1/object/creditcardclient | Create a new Creditcardclient
*ObjectCreditcardclientApi* | [**creditcardclientDeleteObjectV1**](docs/ObjectCreditcardclientApi.md#creditcardclientDeleteObjectV1) | **DELETE** /1/object/creditcardclient/{pkiCreditcardclientID} | Delete an existing Creditcardclient
*ObjectCreditcardclientApi* | [**creditcardclientEditObjectV1**](docs/ObjectCreditcardclientApi.md#creditcardclientEditObjectV1) | **PUT** /1/object/creditcardclient/{pkiCreditcardclientID} | Edit an existing Creditcardclient
*ObjectCreditcardclientApi* | [**creditcardclientGetAutocompleteV2**](docs/ObjectCreditcardclientApi.md#creditcardclientGetAutocompleteV2) | **GET** /2/object/creditcardclient/getAutocomplete/{sSelector} | Retrieve Creditcardclients and IDs
*ObjectCreditcardclientApi* | [**creditcardclientGetListV1**](docs/ObjectCreditcardclientApi.md#creditcardclientGetListV1) | **GET** /1/object/creditcardclient/getList | Retrieve Creditcardclient list
*ObjectCreditcardclientApi* | [**creditcardclientGetObjectV2**](docs/ObjectCreditcardclientApi.md#creditcardclientGetObjectV2) | **GET** /2/object/creditcardclient/{pkiCreditcardclientID} | Retrieve an existing Creditcardclient
*ObjectCreditcardclientApi* | [**creditcardclientPatchObjectV1**](docs/ObjectCreditcardclientApi.md#creditcardclientPatchObjectV1) | **PATCH** /1/object/creditcardclient/{pkiCreditcardclientID} | Patch an existing Creditcardclient
*ObjectCreditcardtypeApi* | [**creditcardtypeGetAutocompleteV2**](docs/ObjectCreditcardtypeApi.md#creditcardtypeGetAutocompleteV2) | **GET** /2/object/creditcardtype/getAutocomplete/{sSelector} | Retrieve Creditcardtypes and IDs
*ObjectCustomerApi* | [**customerCreateObjectV1**](docs/ObjectCustomerApi.md#customerCreateObjectV1) | **POST** /1/object/customer | Create a new Customer
*ObjectCustomerApi* | [**customerGetObjectV2**](docs/ObjectCustomerApi.md#customerGetObjectV2) | **GET** /2/object/customer/{pkiCustomerID} | Retrieve an existing Customer
*ObjectDepartmentApi* | [**departmentGetAutocompleteV2**](docs/ObjectDepartmentApi.md#departmentGetAutocompleteV2) | **GET** /2/object/department/getAutocomplete/{sSelector} | Retrieve Departments and IDs
*ObjectDiscussionApi* | [**discussionCreateObjectV1**](docs/ObjectDiscussionApi.md#discussionCreateObjectV1) | **POST** /1/object/discussion | Create a new Discussion
*ObjectDiscussionApi* | [**discussionDeleteObjectV1**](docs/ObjectDiscussionApi.md#discussionDeleteObjectV1) | **DELETE** /1/object/discussion/{pkiDiscussionID} | Delete an existing Discussion
*ObjectDiscussionApi* | [**discussionGetObjectV2**](docs/ObjectDiscussionApi.md#discussionGetObjectV2) | **GET** /2/object/discussion/{pkiDiscussionID} | Retrieve an existing Discussion
*ObjectDiscussionApi* | [**discussionPatchObjectV1**](docs/ObjectDiscussionApi.md#discussionPatchObjectV1) | **PATCH** /1/object/discussion/{pkiDiscussionID} | Patch an existing Discussion
*ObjectDiscussionApi* | [**discussionUpdateDiscussionreadstatusV1**](docs/ObjectDiscussionApi.md#discussionUpdateDiscussionreadstatusV1) | **POST** /1/object/discussion/{pkiDiscussionID}/updateDiscussionreadstatus | Update the read status of the discussion
*ObjectDiscussionmembershipApi* | [**discussionmembershipCreateObjectV1**](docs/ObjectDiscussionmembershipApi.md#discussionmembershipCreateObjectV1) | **POST** /1/object/discussionmembership | Create a new Discussionmembership
*ObjectDiscussionmembershipApi* | [**discussionmembershipDeleteObjectV1**](docs/ObjectDiscussionmembershipApi.md#discussionmembershipDeleteObjectV1) | **DELETE** /1/object/discussionmembership/{pkiDiscussionmembershipID} | Delete an existing Discussionmembership
*ObjectDiscussionmessageApi* | [**discussionmessageCreateObjectV1**](docs/ObjectDiscussionmessageApi.md#discussionmessageCreateObjectV1) | **POST** /1/object/discussionmessage | Create a new Discussionmessage
*ObjectDiscussionmessageApi* | [**discussionmessageDeleteObjectV1**](docs/ObjectDiscussionmessageApi.md#discussionmessageDeleteObjectV1) | **DELETE** /1/object/discussionmessage/{pkiDiscussionmessageID} | Delete an existing Discussionmessage
*ObjectDiscussionmessageApi* | [**discussionmessagePatchObjectV1**](docs/ObjectDiscussionmessageApi.md#discussionmessagePatchObjectV1) | **PATCH** /1/object/discussionmessage/{pkiDiscussionmessageID} | Patch an existing Discussionmessage
*ObjectDomainApi* | [**domainCreateObjectV1**](docs/ObjectDomainApi.md#domainCreateObjectV1) | **POST** /1/object/domain | Create a new Domain
*ObjectDomainApi* | [**domainDeleteObjectV1**](docs/ObjectDomainApi.md#domainDeleteObjectV1) | **DELETE** /1/object/domain/{pkiDomainID} | Delete an existing Domain
*ObjectDomainApi* | [**domainGetListV1**](docs/ObjectDomainApi.md#domainGetListV1) | **GET** /1/object/domain/getList | Retrieve Domain list
*ObjectDomainApi* | [**domainGetObjectV2**](docs/ObjectDomainApi.md#domainGetObjectV2) | **GET** /2/object/domain/{pkiDomainID} | Retrieve an existing Domain
*ObjectElectronicfundstransferApi* | [**electronicfundstransferGetCommunicationCountV1**](docs/ObjectElectronicfundstransferApi.md#electronicfundstransferGetCommunicationCountV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getCommunicationCount | Retrieve Communication count
*ObjectElectronicfundstransferApi* | [**electronicfundstransferGetCommunicationListV1**](docs/ObjectElectronicfundstransferApi.md#electronicfundstransferGetCommunicationListV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getCommunicationList | Retrieve Communication list
*ObjectElectronicfundstransferApi* | [**electronicfundstransferGetCommunicationrecipientsV1**](docs/ObjectElectronicfundstransferApi.md#electronicfundstransferGetCommunicationrecipientsV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getCommunicationrecipients | Retrieve Electronicfundstransfer&#39;s Communicationrecipient
*ObjectElectronicfundstransferApi* | [**electronicfundstransferGetCommunicationsendersV1**](docs/ObjectElectronicfundstransferApi.md#electronicfundstransferGetCommunicationsendersV1) | **GET** /1/object/electronicfundstransfer/{pkiElectronicfundstransferID}/getCommunicationsenders | Retrieve Electronicfundstransfer&#39;s Communicationsender
*ObjectEmailtypeApi* | [**emailtypeGetAutocompleteV2**](docs/ObjectEmailtypeApi.md#emailtypeGetAutocompleteV2) | **GET** /2/object/emailtype/getAutocomplete/{sSelector} | Retrieve Emailtypes and IDs
*ObjectEzdoctemplatedocumentApi* | [**ezdoctemplatedocumentCreateObjectV1**](docs/ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentCreateObjectV1) | **POST** /1/object/ezdoctemplatedocument | Create a new Ezdoctemplatedocument
*ObjectEzdoctemplatedocumentApi* | [**ezdoctemplatedocumentDownloadV1**](docs/ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentDownloadV1) | **GET** /1/object/ezdoctemplatedocument/{pkiEzdoctemplatedocumentID}/download | Retrieve the content
*ObjectEzdoctemplatedocumentApi* | [**ezdoctemplatedocumentEditObjectV1**](docs/ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentEditObjectV1) | **PUT** /1/object/ezdoctemplatedocument/{pkiEzdoctemplatedocumentID} | Edit an existing Ezdoctemplatedocument
*ObjectEzdoctemplatedocumentApi* | [**ezdoctemplatedocumentGetAutocompleteV2**](docs/ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentGetAutocompleteV2) | **GET** /2/object/ezdoctemplatedocument/getAutocomplete/{sSelector} | Retrieve Ezdoctemplatedocuments and IDs
*ObjectEzdoctemplatedocumentApi* | [**ezdoctemplatedocumentGetListV1**](docs/ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentGetListV1) | **GET** /1/object/ezdoctemplatedocument/getList | Retrieve Ezdoctemplatedocument list
*ObjectEzdoctemplatedocumentApi* | [**ezdoctemplatedocumentGetObjectV2**](docs/ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentGetObjectV2) | **GET** /2/object/ezdoctemplatedocument/{pkiEzdoctemplatedocumentID} | Retrieve an existing Ezdoctemplatedocument
*ObjectEzdoctemplatedocumentApi* | [**ezdoctemplatedocumentPatchObjectV1**](docs/ObjectEzdoctemplatedocumentApi.md#ezdoctemplatedocumentPatchObjectV1) | **PATCH** /1/object/ezdoctemplatedocument/{pkiEzdoctemplatedocumentID} | Patch an existing Ezdoctemplatedocument
*ObjectEzdoctemplatefieldtypecategoryApi* | [**ezdoctemplatefieldtypecategoryGetAutocompleteV2**](docs/ObjectEzdoctemplatefieldtypecategoryApi.md#ezdoctemplatefieldtypecategoryGetAutocompleteV2) | **GET** /2/object/ezdoctemplatefieldtypecategory/getAutocomplete/{sSelector} | Retrieve Ezdoctemplatefieldtypecategorys and IDs
*ObjectEzdoctemplatetypeApi* | [**ezdoctemplatetypeGetAutocompleteV2**](docs/ObjectEzdoctemplatetypeApi.md#ezdoctemplatetypeGetAutocompleteV2) | **GET** /2/object/ezdoctemplatetype/getAutocomplete/{sSelector} | Retrieve Ezdoctemplatetypes and IDs
*ObjectEzmaxinvoicingApi* | [**ezmaxinvoicingGetAutocompleteV2**](docs/ObjectEzmaxinvoicingApi.md#ezmaxinvoicingGetAutocompleteV2) | **GET** /2/object/ezmaxinvoicing/getAutocomplete/{sSelector} | Retrieve Ezmaxinvoicings and IDs
*ObjectEzmaxinvoicingApi* | [**ezmaxinvoicingGetObjectV2**](docs/ObjectEzmaxinvoicingApi.md#ezmaxinvoicingGetObjectV2) | **GET** /2/object/ezmaxinvoicing/{pkiEzmaxinvoicingID} | Retrieve an existing Ezmaxinvoicing
*ObjectEzmaxinvoicingApi* | [**ezmaxinvoicingGetProvisionalV1**](docs/ObjectEzmaxinvoicingApi.md#ezmaxinvoicingGetProvisionalV1) | **GET** /1/object/ezmaxinvoicing/getProvisional | Retrieve provisional Ezmaxinvoicing
*ObjectEzmaxproductApi* | [**ezmaxproductGetAutocompleteV2**](docs/ObjectEzmaxproductApi.md#ezmaxproductGetAutocompleteV2) | **GET** /2/object/ezmaxproduct/getAutocomplete/{sSelector} | Retrieve Ezmaxproducts and IDs
*ObjectEzsignannotationApi* | [**ezsignannotationCreateObjectV1**](docs/ObjectEzsignannotationApi.md#ezsignannotationCreateObjectV1) | **POST** /1/object/ezsignannotation | Create a new Ezsignannotation
*ObjectEzsignannotationApi* | [**ezsignannotationDeleteObjectV1**](docs/ObjectEzsignannotationApi.md#ezsignannotationDeleteObjectV1) | **DELETE** /1/object/ezsignannotation/{pkiEzsignannotationID} | Delete an existing Ezsignannotation
*ObjectEzsignannotationApi* | [**ezsignannotationEditObjectV1**](docs/ObjectEzsignannotationApi.md#ezsignannotationEditObjectV1) | **PUT** /1/object/ezsignannotation/{pkiEzsignannotationID} | Edit an existing Ezsignannotation
*ObjectEzsignannotationApi* | [**ezsignannotationGetObjectV2**](docs/ObjectEzsignannotationApi.md#ezsignannotationGetObjectV2) | **GET** /2/object/ezsignannotation/{pkiEzsignannotationID} | Retrieve an existing Ezsignannotation
*ObjectEzsignbulksendApi* | [**ezsignbulksendCreateEzsignbulksendtransmissionV2**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendCreateEzsignbulksendtransmissionV2) | **POST** /2/object/ezsignbulksend/{pkiEzsignbulksendID}/createEzsignbulksendtransmission | Create a new Ezsignbulksendtransmission in the Ezsignbulksend
*ObjectEzsignbulksendApi* | [**ezsignbulksendCreateObjectV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendCreateObjectV1) | **POST** /1/object/ezsignbulksend | Create a new Ezsignbulksend
*ObjectEzsignbulksendApi* | [**ezsignbulksendDeleteObjectV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendDeleteObjectV1) | **DELETE** /1/object/ezsignbulksend/{pkiEzsignbulksendID} | Delete an existing Ezsignbulksend
*ObjectEzsignbulksendApi* | [**ezsignbulksendEditObjectV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendEditObjectV1) | **PUT** /1/object/ezsignbulksend/{pkiEzsignbulksendID} | Edit an existing Ezsignbulksend
*ObjectEzsignbulksendApi* | [**ezsignbulksendGetCsvTemplateV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendGetCsvTemplateV1) | **GET** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/getCsvTemplate | Retrieve an existing Ezsignbulksend&#39;s empty Csv template
*ObjectEzsignbulksendApi* | [**ezsignbulksendGetEzsignbulksendtransmissionsV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendGetEzsignbulksendtransmissionsV1) | **GET** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/getEzsignbulksendtransmissions | Retrieve an existing Ezsignbulksend&#39;s Ezsignbulksendtransmissions
*ObjectEzsignbulksendApi* | [**ezsignbulksendGetEzsignsignaturesAutomaticV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendGetEzsignsignaturesAutomaticV1) | **GET** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/getEzsignsignaturesAutomatic | Retrieve an existing Ezsignbulksend&#39;s automatic Ezsignsignatures
*ObjectEzsignbulksendApi* | [**ezsignbulksendGetFormsDataV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendGetFormsDataV1) | **GET** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/getFormsData | Retrieve an existing Ezsignbulksend&#39;s forms data
*ObjectEzsignbulksendApi* | [**ezsignbulksendGetListV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendGetListV1) | **GET** /1/object/ezsignbulksend/getList | Retrieve Ezsignbulksend list
*ObjectEzsignbulksendApi* | [**ezsignbulksendGetObjectV2**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendGetObjectV2) | **GET** /2/object/ezsignbulksend/{pkiEzsignbulksendID} | Retrieve an existing Ezsignbulksend
*ObjectEzsignbulksendApi* | [**ezsignbulksendReorderV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendReorderV1) | **POST** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/reorder | Reorder Ezsignbulksenddocumentmappings in the Ezsignbulksend
*ObjectEzsignbulksenddocumentmappingApi* | [**ezsignbulksenddocumentmappingCreateObjectV1**](docs/ObjectEzsignbulksenddocumentmappingApi.md#ezsignbulksenddocumentmappingCreateObjectV1) | **POST** /1/object/ezsignbulksenddocumentmapping | Create a new Ezsignbulksenddocumentmapping
*ObjectEzsignbulksenddocumentmappingApi* | [**ezsignbulksenddocumentmappingDeleteObjectV1**](docs/ObjectEzsignbulksenddocumentmappingApi.md#ezsignbulksenddocumentmappingDeleteObjectV1) | **DELETE** /1/object/ezsignbulksenddocumentmapping/{pkiEzsignbulksenddocumentmappingID} | Delete an existing Ezsignbulksenddocumentmapping
*ObjectEzsignbulksenddocumentmappingApi* | [**ezsignbulksenddocumentmappingGetObjectV2**](docs/ObjectEzsignbulksenddocumentmappingApi.md#ezsignbulksenddocumentmappingGetObjectV2) | **GET** /2/object/ezsignbulksenddocumentmapping/{pkiEzsignbulksenddocumentmappingID} | Retrieve an existing Ezsignbulksenddocumentmapping
*ObjectEzsignbulksendsignermappingApi* | [**ezsignbulksendsignermappingCreateObjectV1**](docs/ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingCreateObjectV1) | **POST** /1/object/ezsignbulksendsignermapping | Create a new Ezsignbulksendsignermapping
*ObjectEzsignbulksendsignermappingApi* | [**ezsignbulksendsignermappingDeleteObjectV1**](docs/ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingDeleteObjectV1) | **DELETE** /1/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID} | Delete an existing Ezsignbulksendsignermapping
*ObjectEzsignbulksendsignermappingApi* | [**ezsignbulksendsignermappingGetObjectV2**](docs/ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingGetObjectV2) | **GET** /2/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID} | Retrieve an existing Ezsignbulksendsignermapping
*ObjectEzsignbulksendtransmissionApi* | [**ezsignbulksendtransmissionGetCsvErrorsV1**](docs/ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissionGetCsvErrorsV1) | **GET** /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getCsvErrors | Retrieve an existing Ezsignbulksendtransmission&#39;s Csv containing errors
*ObjectEzsignbulksendtransmissionApi* | [**ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1**](docs/ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissionGetEzsignsignaturesAutomaticV1) | **GET** /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getEzsignsignaturesAutomatic | Retrieve an existing Ezsignbulksendtransmission&#39;s automatic Ezsignsignatures
*ObjectEzsignbulksendtransmissionApi* | [**ezsignbulksendtransmissionGetFormsDataV1**](docs/ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissionGetFormsDataV1) | **GET** /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getFormsData | Retrieve an existing Ezsignbulksendtransmission&#39;s forms data
*ObjectEzsignbulksendtransmissionApi* | [**ezsignbulksendtransmissionGetObjectV2**](docs/ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissionGetObjectV2) | **GET** /2/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID} | Retrieve an existing Ezsignbulksendtransmission
*ObjectEzsigndiscussionApi* | [**ezsigndiscussionCreateObjectV1**](docs/ObjectEzsigndiscussionApi.md#ezsigndiscussionCreateObjectV1) | **POST** /1/object/ezsigndiscussion | Create a new Ezsigndiscussion
*ObjectEzsigndiscussionApi* | [**ezsigndiscussionDeleteObjectV1**](docs/ObjectEzsigndiscussionApi.md#ezsigndiscussionDeleteObjectV1) | **DELETE** /1/object/ezsigndiscussion/{pkiEzsigndiscussionID} | Delete an existing Ezsigndiscussion
*ObjectEzsigndiscussionApi* | [**ezsigndiscussionGetObjectV2**](docs/ObjectEzsigndiscussionApi.md#ezsigndiscussionGetObjectV2) | **GET** /2/object/ezsigndiscussion/{pkiEzsigndiscussionID} | Retrieve an existing Ezsigndiscussion
*ObjectEzsigndocumentApi* | [**ezsigndocumentApplyEzsigntemplateV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentApplyEzsigntemplateV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate | Apply an Ezsigntemplate to the Ezsigndocument.
*ObjectEzsigndocumentApi* | [**ezsigndocumentApplyEzsigntemplateV2**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentApplyEzsigntemplateV2) | **POST** /2/object/ezsigndocument/{pkiEzsigndocumentID}/applyEzsigntemplate | Apply an Ezsigntemplate to the Ezsigndocument.
*ObjectEzsigndocumentApi* | [**ezsigndocumentApplyEzsigntemplateglobalV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentApplyEzsigntemplateglobalV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/applyEzsigntemplateglobal | Apply an Ezsigntemplateglobal to the Ezsigndocument.
*ObjectEzsigndocumentApi* | [**ezsigndocumentCreateEzsignelementsPositionedByWordV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentCreateEzsignelementsPositionedByWordV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/createEzsignelementsPositionedByWord | Create multiple Ezsignsignatures/Ezsignformfieldgroups
*ObjectEzsigndocumentApi* | [**ezsigndocumentCreateObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentCreateObjectV1) | **POST** /1/object/ezsigndocument | Create a new Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentCreateObjectV2**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentCreateObjectV2) | **POST** /2/object/ezsigndocument | Create a new Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentCreateObjectV3**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentCreateObjectV3) | **POST** /3/object/ezsigndocument | Create a new Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentDeclineToSignV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentDeclineToSignV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/declineToSign | Decline to sign
*ObjectEzsigndocumentApi* | [**ezsigndocumentDeleteObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentDeleteObjectV1) | **DELETE** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Delete an existing Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentEditEzsignannotationsV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentEditEzsignannotationsV1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignannotations | Edit multiple Ezsignannotations
*ObjectEzsigndocumentApi* | [**ezsigndocumentEditEzsignformfieldgroupsV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentEditEzsignformfieldgroupsV1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignformfieldgroups | Edit multiple Ezsignformfieldgroups
*ObjectEzsigndocumentApi* | [**ezsigndocumentEditEzsignsignaturesV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentEditEzsignsignaturesV1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignsignatures | Edit multiple Ezsignsignatures
*ObjectEzsigndocumentApi* | [**ezsigndocumentEditObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentEditObjectV1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Edit an existing Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentEndPrematurelyV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentEndPrematurelyV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/endPrematurely | End prematurely
*ObjectEzsigndocumentApi* | [**ezsigndocumentExtractTextV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentExtractTextV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/extractText | Extract text from Ezsigndocument area
*ObjectEzsigndocumentApi* | [**ezsigndocumentFlattenV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentFlattenV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/flatten | Flatten
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetActionableElementsV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetActionableElementsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getActionableElements | Retrieve actionable elements for the Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetAttachmentsV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetAttachmentsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getAttachments | Retrieve Ezsigndocument&#39;s Attachments
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetCompletedElementsV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetCompletedElementsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getCompletedElements | Retrieve completed elements for the Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetDownloadUrlV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetDownloadUrlV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getDownloadUrl/{eDocumentType} | Retrieve a URL to download documents.
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetEzsignannotationsV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignannotationsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignannotations | Retrieve an existing Ezsigndocument&#39;s Ezsignannotations
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetEzsigndiscussionsV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsigndiscussionsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsigndiscussions | Retrieve an existing Ezsigndocument&#39;s Ezsigndiscussions
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetEzsignformfieldgroupsV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignformfieldgroupsV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignformfieldgroups | Retrieve an existing Ezsigndocument&#39;s Ezsignformfieldgroups
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetEzsignpagesV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignpagesV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignpages | Retrieve an existing Ezsigndocument&#39;s Ezsignpages
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetEzsignsignaturesAutomaticV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignsignaturesAutomaticV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignsignaturesAutomatic | Retrieve an existing Ezsigndocument&#39;s automatic Ezsignsignatures
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetEzsignsignaturesV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetEzsignsignaturesV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignsignatures | Retrieve an existing Ezsigndocument&#39;s Ezsignsignatures
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetFormDataV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetFormDataV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getFormData | Retrieve an existing Ezsigndocument&#39;s Form Data
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetObjectV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Retrieve an existing Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetObjectV2**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetObjectV2) | **GET** /2/object/ezsigndocument/{pkiEzsigndocumentID} | Retrieve an existing Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetTemporaryProofV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetTemporaryProofV1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getTemporaryProof | Retrieve the temporary proof
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetWordsPositionsV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentGetWordsPositionsV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getWordsPositions | Retrieve positions X,Y of given words from a Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentPatchObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentPatchObjectV1) | **PATCH** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Patch an existing Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentSubmitEzsignformV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentSubmitEzsignformV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/submitEzsignform | Submit the Ezsignform
*ObjectEzsigndocumentApi* | [**ezsigndocumentUnsendV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentUnsendV1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/unsend | Unsend the Ezsigndocument
*ObjectEzsignfolderApi* | [**ezsignfolderArchiveV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderArchiveV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/archive | Archive the Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderBatchDownloadV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderBatchDownloadV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/batchDownload | Download multiples files from an Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderCreateObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderCreateObjectV1) | **POST** /1/object/ezsignfolder | Create a new Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderCreateObjectV2**](docs/ObjectEzsignfolderApi.md#ezsignfolderCreateObjectV2) | **POST** /2/object/ezsignfolder | Create a new Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderCreateObjectV3**](docs/ObjectEzsignfolderApi.md#ezsignfolderCreateObjectV3) | **POST** /3/object/ezsignfolder | Create a new Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderDeleteObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderDeleteObjectV1) | **DELETE** /1/object/ezsignfolder/{pkiEzsignfolderID} | Delete an existing Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderDisposeEzsignfoldersV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderDisposeEzsignfoldersV1) | **POST** /1/object/ezsignfolder/disposeEzsignfolders | Dispose Ezsignfolders
*ObjectEzsignfolderApi* | [**ezsignfolderDisposeV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderDisposeV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/dispose | Dispose the Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderEditObjectV3**](docs/ObjectEzsignfolderApi.md#ezsignfolderEditObjectV3) | **PUT** /3/object/ezsignfolder/{pkiEzsignfolderID} | Edit an existing Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderEndPrematurelyV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderEndPrematurelyV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/endPrematurely | End prematurely
*ObjectEzsignfolderApi* | [**ezsignfolderGetActionableElementsV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderGetActionableElementsV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getActionableElements | Retrieve actionable elements for the Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderGetAttachmentCountV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderGetAttachmentCountV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getAttachmentCount | Retrieve Attachment count
*ObjectEzsignfolderApi* | [**ezsignfolderGetAttachmentsV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderGetAttachmentsV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getAttachments | Retrieve Ezsignfolder&#39;s Attachments
*ObjectEzsignfolderApi* | [**ezsignfolderGetCommunicationCountV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderGetCommunicationCountV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getCommunicationCount | Retrieve Communication count
*ObjectEzsignfolderApi* | [**ezsignfolderGetCommunicationListV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderGetCommunicationListV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getCommunicationList | Retrieve Communication list
*ObjectEzsignfolderApi* | [**ezsignfolderGetCommunicationrecipientsV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderGetCommunicationrecipientsV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getCommunicationrecipients | Retrieve Ezsignfolder&#39;s Communicationrecipient
*ObjectEzsignfolderApi* | [**ezsignfolderGetCommunicationsendersV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderGetCommunicationsendersV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getCommunicationsenders | Retrieve Ezsignfolder&#39;s Communicationsender
*ObjectEzsignfolderApi* | [**ezsignfolderGetEzsigndocumentsV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderGetEzsigndocumentsV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getEzsigndocuments | Retrieve an existing Ezsignfolder&#39;s Ezsigndocuments
*ObjectEzsignfolderApi* | [**ezsignfolderGetEzsignfoldersignerassociationsV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderGetEzsignfoldersignerassociationsV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getEzsignfoldersignerassociations | Retrieve an existing Ezsignfolder&#39;s Ezsignfoldersignerassociations
*ObjectEzsignfolderApi* | [**ezsignfolderGetEzsignsignaturesAutomaticV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderGetEzsignsignaturesAutomaticV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getEzsignsignaturesAutomatic | Retrieve an existing Ezsignfolder&#39;s automatic Ezsignsignatures
*ObjectEzsignfolderApi* | [**ezsignfolderGetFormsDataV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderGetFormsDataV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getFormsData | Retrieve an existing Ezsignfolder&#39;s forms data
*ObjectEzsignfolderApi* | [**ezsignfolderGetListV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderGetListV1) | **GET** /1/object/ezsignfolder/getList | Retrieve Ezsignfolder list
*ObjectEzsignfolderApi* | [**ezsignfolderGetObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderGetObjectV1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID} | Retrieve an existing Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderGetObjectV2**](docs/ObjectEzsignfolderApi.md#ezsignfolderGetObjectV2) | **GET** /2/object/ezsignfolder/{pkiEzsignfolderID} | Retrieve an existing Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderGetObjectV3**](docs/ObjectEzsignfolderApi.md#ezsignfolderGetObjectV3) | **GET** /3/object/ezsignfolder/{pkiEzsignfolderID} | Retrieve an existing Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderImportEzsignfoldersignerassociationsV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderImportEzsignfoldersignerassociationsV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/importEzsignfoldersignerassociations | Import an existing Ezsignfoldersignerassociation into this Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderImportEzsigntemplatepackageV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderImportEzsigntemplatepackageV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/importEzsigntemplatepackage | Import an Ezsigntemplatepackage in the Ezsignfolder.
*ObjectEzsignfolderApi* | [**ezsignfolderReorderV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderReorderV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/reorder | Reorder Ezsigndocuments in the Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderReorderV2**](docs/ObjectEzsignfolderApi.md#ezsignfolderReorderV2) | **POST** /2/object/ezsignfolder/{pkiEzsignfolderID}/reorder | Reorder Ezsigndocuments in the Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderSendV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderSendV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/send | Send the Ezsignfolder to the signatories for signature
*ObjectEzsignfolderApi* | [**ezsignfolderSendV3**](docs/ObjectEzsignfolderApi.md#ezsignfolderSendV3) | **POST** /3/object/ezsignfolder/{pkiEzsignfolderID}/send | Send the Ezsignfolder to the signatories for signature
*ObjectEzsignfolderApi* | [**ezsignfolderUnsendV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderUnsendV1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/unsend | Unsend the Ezsignfolder
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationCreateEmbeddedUrlV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationCreateEmbeddedUrlV1) | **POST** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/createEmbeddedUrl | Creates an Url to allow embedded signing
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationCreateObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationCreateObjectV1) | **POST** /1/object/ezsignfoldersignerassociation | Create a new Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationCreateObjectV2**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationCreateObjectV2) | **POST** /2/object/ezsignfoldersignerassociation | Create a new Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationDeleteObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationDeleteObjectV1) | **DELETE** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Delete an existing Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationEditObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationEditObjectV1) | **PUT** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Edit an existing Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationForceDisconnectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationForceDisconnectV1) | **POST** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/forceDisconnect | Disconnects the Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationGetInPersonLoginUrlV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationGetInPersonLoginUrlV1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/getInPersonLoginUrl | Retrieve a Login Url to allow In-Person signing
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationGetObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationGetObjectV1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Retrieve an existing Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationGetObjectV2**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationGetObjectV2) | **GET** /2/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Retrieve an existing Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationPatchObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationPatchObjectV1) | **PATCH** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Patch an existing Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationReassignV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationReassignV1) | **POST** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/reassign | Reassign remaining unsigned signatures and forms
*ObjectEzsignfoldertypeApi* | [**ezsignfoldertypeCreateObjectV3**](docs/ObjectEzsignfoldertypeApi.md#ezsignfoldertypeCreateObjectV3) | **POST** /3/object/ezsignfoldertype | Create a new Ezsignfoldertype
*ObjectEzsignfoldertypeApi* | [**ezsignfoldertypeEditObjectV3**](docs/ObjectEzsignfoldertypeApi.md#ezsignfoldertypeEditObjectV3) | **PUT** /3/object/ezsignfoldertype/{pkiEzsignfoldertypeID} | Edit an existing Ezsignfoldertype
*ObjectEzsignfoldertypeApi* | [**ezsignfoldertypeGetAutocompleteV2**](docs/ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetAutocompleteV2) | **GET** /2/object/ezsignfoldertype/getAutocomplete/{sSelector} | Retrieve Ezsignfoldertypes and IDs
*ObjectEzsignfoldertypeApi* | [**ezsignfoldertypeGetListV1**](docs/ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetListV1) | **GET** /1/object/ezsignfoldertype/getList | Retrieve Ezsignfoldertype list
*ObjectEzsignfoldertypeApi* | [**ezsignfoldertypeGetObjectV2**](docs/ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetObjectV2) | **GET** /2/object/ezsignfoldertype/{pkiEzsignfoldertypeID} | Retrieve an existing Ezsignfoldertype
*ObjectEzsignfoldertypeApi* | [**ezsignfoldertypeGetObjectV4**](docs/ObjectEzsignfoldertypeApi.md#ezsignfoldertypeGetObjectV4) | **GET** /4/object/ezsignfoldertype/{pkiEzsignfoldertypeID} | Retrieve an existing Ezsignfoldertype
*ObjectEzsignformfieldgroupApi* | [**ezsignformfieldgroupCreateObjectV1**](docs/ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupCreateObjectV1) | **POST** /1/object/ezsignformfieldgroup | Create a new Ezsignformfieldgroup
*ObjectEzsignformfieldgroupApi* | [**ezsignformfieldgroupDeleteObjectV1**](docs/ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupDeleteObjectV1) | **DELETE** /1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID} | Delete an existing Ezsignformfieldgroup
*ObjectEzsignformfieldgroupApi* | [**ezsignformfieldgroupEditObjectV1**](docs/ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupEditObjectV1) | **PUT** /1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID} | Edit an existing Ezsignformfieldgroup
*ObjectEzsignformfieldgroupApi* | [**ezsignformfieldgroupGetObjectV2**](docs/ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupGetObjectV2) | **GET** /2/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID} | Retrieve an existing Ezsignformfieldgroup
*ObjectEzsignpageApi* | [**ezsignpageConsultV1**](docs/ObjectEzsignpageApi.md#ezsignpageConsultV1) | **POST** /1/object/ezsignpage/{pkiEzsignpageID}/consult | Consult an Ezsignpage
*ObjectEzsignsignatureApi* | [**ezsignsignatureCreateObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignatureCreateObjectV1) | **POST** /1/object/ezsignsignature | Create a new Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureCreateObjectV2**](docs/ObjectEzsignsignatureApi.md#ezsignsignatureCreateObjectV2) | **POST** /2/object/ezsignsignature | Create a new Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureCreateObjectV3**](docs/ObjectEzsignsignatureApi.md#ezsignsignatureCreateObjectV3) | **POST** /3/object/ezsignsignature | Create a new Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureDeleteObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignatureDeleteObjectV1) | **DELETE** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Delete an existing Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureEditObjectV2**](docs/ObjectEzsignsignatureApi.md#ezsignsignatureEditObjectV2) | **PUT** /2/object/ezsignsignature/{pkiEzsignsignatureID} | Edit an existing Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureGetEzsignsignatureattachmentV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignatureGetEzsignsignatureattachmentV1) | **GET** /1/object/ezsignsignature/{pkiEzsignsignatureID}/getEzsignsignatureattachment | Retrieve an existing Ezsignsignature&#39;s Ezsignsignatureattachments
*ObjectEzsignsignatureApi* | [**ezsignsignatureGetEzsignsignaturesAutomaticV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignatureGetEzsignsignaturesAutomaticV1) | **GET** /1/object/ezsignsignature/getEzsignsignaturesAutomatic | Retrieve all automatic Ezsignsignatures
*ObjectEzsignsignatureApi* | [**ezsignsignatureGetObjectV3**](docs/ObjectEzsignsignatureApi.md#ezsignsignatureGetObjectV3) | **GET** /3/object/ezsignsignature/{pkiEzsignsignatureID} | Retrieve an existing Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureSignV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignatureSignV1) | **POST** /1/object/ezsignsignature/{pkiEzsignsignatureID}/sign | Sign the Ezsignsignature
*ObjectEzsignsignergroupApi* | [**ezsignsignergroupCreateObjectV1**](docs/ObjectEzsignsignergroupApi.md#ezsignsignergroupCreateObjectV1) | **POST** /1/object/ezsignsignergroup | Create a new Ezsignsignergroup
*ObjectEzsignsignergroupApi* | [**ezsignsignergroupDeleteObjectV1**](docs/ObjectEzsignsignergroupApi.md#ezsignsignergroupDeleteObjectV1) | **DELETE** /1/object/ezsignsignergroup/{pkiEzsignsignergroupID} | Delete an existing Ezsignsignergroup
*ObjectEzsignsignergroupApi* | [**ezsignsignergroupEditEzsignsignergroupmembershipsV1**](docs/ObjectEzsignsignergroupApi.md#ezsignsignergroupEditEzsignsignergroupmembershipsV1) | **PUT** /1/object/ezsignsignergroup/{pkiEzsignsignergroupID}/editEzsignsignergroupmemberships | Edit multiple Ezsignsignergroupmemberships
*ObjectEzsignsignergroupApi* | [**ezsignsignergroupEditObjectV1**](docs/ObjectEzsignsignergroupApi.md#ezsignsignergroupEditObjectV1) | **PUT** /1/object/ezsignsignergroup/{pkiEzsignsignergroupID} | Edit an existing Ezsignsignergroup
*ObjectEzsignsignergroupApi* | [**ezsignsignergroupGetEzsignsignergroupmembershipsV1**](docs/ObjectEzsignsignergroupApi.md#ezsignsignergroupGetEzsignsignergroupmembershipsV1) | **GET** /1/object/ezsignsignergroup/{pkiEzsignsignergroupID}/getEzsignsignergroupmemberships | Retrieve an existing Ezsignsignergroup&#39;s Ezsignsignergroupmemberships
*ObjectEzsignsignergroupApi* | [**ezsignsignergroupGetObjectV2**](docs/ObjectEzsignsignergroupApi.md#ezsignsignergroupGetObjectV2) | **GET** /2/object/ezsignsignergroup/{pkiEzsignsignergroupID} | Retrieve an existing Ezsignsignergroup
*ObjectEzsignsignergroupmembershipApi* | [**ezsignsignergroupmembershipCreateObjectV1**](docs/ObjectEzsignsignergroupmembershipApi.md#ezsignsignergroupmembershipCreateObjectV1) | **POST** /1/object/ezsignsignergroupmembership | Create a new Ezsignsignergroupmembership
*ObjectEzsignsignergroupmembershipApi* | [**ezsignsignergroupmembershipDeleteObjectV1**](docs/ObjectEzsignsignergroupmembershipApi.md#ezsignsignergroupmembershipDeleteObjectV1) | **DELETE** /1/object/ezsignsignergroupmembership/{pkiEzsignsignergroupmembershipID} | Delete an existing Ezsignsignergroupmembership
*ObjectEzsignsignergroupmembershipApi* | [**ezsignsignergroupmembershipGetObjectV2**](docs/ObjectEzsignsignergroupmembershipApi.md#ezsignsignergroupmembershipGetObjectV2) | **GET** /2/object/ezsignsignergroupmembership/{pkiEzsignsignergroupmembershipID} | Retrieve an existing Ezsignsignergroupmembership
*ObjectEzsignsigningreasonApi* | [**ezsignsigningreasonCreateObjectV1**](docs/ObjectEzsignsigningreasonApi.md#ezsignsigningreasonCreateObjectV1) | **POST** /1/object/ezsignsigningreason | Create a new Ezsignsigningreason
*ObjectEzsignsigningreasonApi* | [**ezsignsigningreasonEditObjectV1**](docs/ObjectEzsignsigningreasonApi.md#ezsignsigningreasonEditObjectV1) | **PUT** /1/object/ezsignsigningreason/{pkiEzsignsigningreasonID} | Edit an existing Ezsignsigningreason
*ObjectEzsignsigningreasonApi* | [**ezsignsigningreasonGetAutocompleteV2**](docs/ObjectEzsignsigningreasonApi.md#ezsignsigningreasonGetAutocompleteV2) | **GET** /2/object/ezsignsigningreason/getAutocomplete/{sSelector} | Retrieve Ezsignsigningreasons and IDs
*ObjectEzsignsigningreasonApi* | [**ezsignsigningreasonGetListV1**](docs/ObjectEzsignsigningreasonApi.md#ezsignsigningreasonGetListV1) | **GET** /1/object/ezsignsigningreason/getList | Retrieve Ezsignsigningreason list
*ObjectEzsignsigningreasonApi* | [**ezsignsigningreasonGetObjectV2**](docs/ObjectEzsignsigningreasonApi.md#ezsignsigningreasonGetObjectV2) | **GET** /2/object/ezsignsigningreason/{pkiEzsignsigningreasonID} | Retrieve an existing Ezsignsigningreason
*ObjectEzsigntemplateApi* | [**ezsigntemplateCopyV1**](docs/ObjectEzsigntemplateApi.md#ezsigntemplateCopyV1) | **POST** /1/object/ezsigntemplate/{pkiEzsigntemplateID}/copy | Copy the Ezsigntemplate
*ObjectEzsigntemplateApi* | [**ezsigntemplateCreateObjectV3**](docs/ObjectEzsigntemplateApi.md#ezsigntemplateCreateObjectV3) | **POST** /3/object/ezsigntemplate | Create a new Ezsigntemplate
*ObjectEzsigntemplateApi* | [**ezsigntemplateDeleteObjectV1**](docs/ObjectEzsigntemplateApi.md#ezsigntemplateDeleteObjectV1) | **DELETE** /1/object/ezsigntemplate/{pkiEzsigntemplateID} | Delete an existing Ezsigntemplate
*ObjectEzsigntemplateApi* | [**ezsigntemplateEditObjectV3**](docs/ObjectEzsigntemplateApi.md#ezsigntemplateEditObjectV3) | **PUT** /3/object/ezsigntemplate/{pkiEzsigntemplateID} | Edit an existing Ezsigntemplate
*ObjectEzsigntemplateApi* | [**ezsigntemplateGetAutocompleteV2**](docs/ObjectEzsigntemplateApi.md#ezsigntemplateGetAutocompleteV2) | **GET** /2/object/ezsigntemplate/getAutocomplete/{sSelector} | Retrieve Ezsigntemplates and IDs
*ObjectEzsigntemplateApi* | [**ezsigntemplateGetListV1**](docs/ObjectEzsigntemplateApi.md#ezsigntemplateGetListV1) | **GET** /1/object/ezsigntemplate/getList | Retrieve Ezsigntemplate list
*ObjectEzsigntemplateApi* | [**ezsigntemplateGetObjectV3**](docs/ObjectEzsigntemplateApi.md#ezsigntemplateGetObjectV3) | **GET** /3/object/ezsigntemplate/{pkiEzsigntemplateID} | Retrieve an existing Ezsigntemplate
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentCreateObjectV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentCreateObjectV1) | **POST** /1/object/ezsigntemplatedocument | Create a new Ezsigntemplatedocument
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1) | **PUT** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/editEzsigntemplatedocumentpagerecognitions | Edit multiple Ezsigntemplatedocumentpagerecognitions
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1) | **PUT** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/editEzsigntemplateformfieldgroups | Edit multiple Ezsigntemplateformfieldgroups
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentEditEzsigntemplatesignaturesV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentEditEzsigntemplatesignaturesV1) | **PUT** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/editEzsigntemplatesignatures | Edit multiple Ezsigntemplatesignatures
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentEditObjectV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentEditObjectV1) | **PUT** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID} | Edit an existing Ezsigntemplatedocument
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentExtractTextV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentExtractTextV1) | **POST** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/extractText | Extract text from Ezsigntemplatedocument area
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentFlattenV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentFlattenV1) | **POST** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/flatten | Flatten
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentGetEzsigntemplatedocumentpagerecognitionsV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentGetEzsigntemplatedocumentpagerecognitionsV1) | **GET** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getEzsigntemplatedocumentpagerecognitions | Retrieve an existing Ezsigntemplatedocument&#39;s Ezsigntemplatedocumentpagerecognitions
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentGetEzsigntemplatedocumentpagesV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentGetEzsigntemplatedocumentpagesV1) | **GET** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getEzsigntemplatedocumentpages | Retrieve an existing Ezsigntemplatedocument&#39;s Ezsigntemplatedocumentpages
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1) | **GET** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getEzsigntemplateformfieldgroups | Retrieve an existing Ezsigntemplatedocument&#39;s Ezsigntemplateformfieldgroups
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentGetEzsigntemplatesignaturesV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentGetEzsigntemplatesignaturesV1) | **GET** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getEzsigntemplatesignatures | Retrieve an existing Ezsigntemplatedocument&#39;s Ezsigntemplatesignatures
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentGetObjectV2**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentGetObjectV2) | **GET** /2/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID} | Retrieve an existing Ezsigntemplatedocument
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentGetWordsPositionsV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentGetWordsPositionsV1) | **POST** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getWordsPositions | Retrieve positions X,Y of given words from a Ezsigntemplatedocument
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentPatchObjectV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentPatchObjectV1) | **PATCH** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID} | Patch an existing Ezsigntemplatedocument
*ObjectEzsigntemplatedocumentpagerecognitionApi* | [**ezsigntemplatedocumentpagerecognitionCreateObjectV1**](docs/ObjectEzsigntemplatedocumentpagerecognitionApi.md#ezsigntemplatedocumentpagerecognitionCreateObjectV1) | **POST** /1/object/ezsigntemplatedocumentpagerecognition | Create a new Ezsigntemplatedocumentpagerecognition
*ObjectEzsigntemplatedocumentpagerecognitionApi* | [**ezsigntemplatedocumentpagerecognitionDeleteObjectV1**](docs/ObjectEzsigntemplatedocumentpagerecognitionApi.md#ezsigntemplatedocumentpagerecognitionDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatedocumentpagerecognition/{pkiEzsigntemplatedocumentpagerecognitionID} | Delete an existing Ezsigntemplatedocumentpagerecognition
*ObjectEzsigntemplatedocumentpagerecognitionApi* | [**ezsigntemplatedocumentpagerecognitionEditObjectV1**](docs/ObjectEzsigntemplatedocumentpagerecognitionApi.md#ezsigntemplatedocumentpagerecognitionEditObjectV1) | **PUT** /1/object/ezsigntemplatedocumentpagerecognition/{pkiEzsigntemplatedocumentpagerecognitionID} | Edit an existing Ezsigntemplatedocumentpagerecognition
*ObjectEzsigntemplatedocumentpagerecognitionApi* | [**ezsigntemplatedocumentpagerecognitionGetObjectV2**](docs/ObjectEzsigntemplatedocumentpagerecognitionApi.md#ezsigntemplatedocumentpagerecognitionGetObjectV2) | **GET** /2/object/ezsigntemplatedocumentpagerecognition/{pkiEzsigntemplatedocumentpagerecognitionID} | Retrieve an existing Ezsigntemplatedocumentpagerecognition
*ObjectEzsigntemplateformfieldgroupApi* | [**ezsigntemplateformfieldgroupCreateObjectV1**](docs/ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupCreateObjectV1) | **POST** /1/object/ezsigntemplateformfieldgroup | Create a new Ezsigntemplateformfieldgroup
*ObjectEzsigntemplateformfieldgroupApi* | [**ezsigntemplateformfieldgroupDeleteObjectV1**](docs/ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupDeleteObjectV1) | **DELETE** /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Delete an existing Ezsigntemplateformfieldgroup
*ObjectEzsigntemplateformfieldgroupApi* | [**ezsigntemplateformfieldgroupEditObjectV1**](docs/ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupEditObjectV1) | **PUT** /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Edit an existing Ezsigntemplateformfieldgroup
*ObjectEzsigntemplateformfieldgroupApi* | [**ezsigntemplateformfieldgroupGetObjectV2**](docs/ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupGetObjectV2) | **GET** /2/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Retrieve an existing Ezsigntemplateformfieldgroup
*ObjectEzsigntemplateglobalApi* | [**ezsigntemplateglobalGetAutocompleteV2**](docs/ObjectEzsigntemplateglobalApi.md#ezsigntemplateglobalGetAutocompleteV2) | **GET** /2/object/ezsigntemplateglobal/getAutocomplete/{sSelector} | Retrieve Ezsigntemplateglobals and IDs
*ObjectEzsigntemplateglobalApi* | [**ezsigntemplateglobalGetObjectV2**](docs/ObjectEzsigntemplateglobalApi.md#ezsigntemplateglobalGetObjectV2) | **GET** /2/object/ezsigntemplateglobal/{pkiEzsigntemplateglobalID} | Retrieve an existing Ezsigntemplateglobal
*ObjectEzsigntemplatepackageApi* | [**ezsigntemplatepackageCreateObjectV1**](docs/ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageCreateObjectV1) | **POST** /1/object/ezsigntemplatepackage | Create a new Ezsigntemplatepackage
*ObjectEzsigntemplatepackageApi* | [**ezsigntemplatepackageDeleteObjectV1**](docs/ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID} | Delete an existing Ezsigntemplatepackage
*ObjectEzsigntemplatepackageApi* | [**ezsigntemplatepackageEditEzsigntemplatepackagesignersV1**](docs/ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageEditEzsigntemplatepackagesignersV1) | **PUT** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID}/editEzsigntemplatepackagesigners | Edit multiple Ezsigntemplatepackagesigners
*ObjectEzsigntemplatepackageApi* | [**ezsigntemplatepackageEditObjectV1**](docs/ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageEditObjectV1) | **PUT** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID} | Edit an existing Ezsigntemplatepackage
*ObjectEzsigntemplatepackageApi* | [**ezsigntemplatepackageGetAutocompleteV2**](docs/ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageGetAutocompleteV2) | **GET** /2/object/ezsigntemplatepackage/getAutocomplete/{sSelector} | Retrieve Ezsigntemplatepackages and IDs
*ObjectEzsigntemplatepackageApi* | [**ezsigntemplatepackageGetListV1**](docs/ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageGetListV1) | **GET** /1/object/ezsigntemplatepackage/getList | Retrieve Ezsigntemplatepackage list
*ObjectEzsigntemplatepackageApi* | [**ezsigntemplatepackageGetObjectV2**](docs/ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageGetObjectV2) | **GET** /2/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID} | Retrieve an existing Ezsigntemplatepackage
*ObjectEzsigntemplatepackagemembershipApi* | [**ezsigntemplatepackagemembershipCreateObjectV1**](docs/ObjectEzsigntemplatepackagemembershipApi.md#ezsigntemplatepackagemembershipCreateObjectV1) | **POST** /1/object/ezsigntemplatepackagemembership | Create a new Ezsigntemplatepackagemembership
*ObjectEzsigntemplatepackagemembershipApi* | [**ezsigntemplatepackagemembershipDeleteObjectV1**](docs/ObjectEzsigntemplatepackagemembershipApi.md#ezsigntemplatepackagemembershipDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatepackagemembership/{pkiEzsigntemplatepackagemembershipID} | Delete an existing Ezsigntemplatepackagemembership
*ObjectEzsigntemplatepackagemembershipApi* | [**ezsigntemplatepackagemembershipGetObjectV2**](docs/ObjectEzsigntemplatepackagemembershipApi.md#ezsigntemplatepackagemembershipGetObjectV2) | **GET** /2/object/ezsigntemplatepackagemembership/{pkiEzsigntemplatepackagemembershipID} | Retrieve an existing Ezsigntemplatepackagemembership
*ObjectEzsigntemplatepackagesignerApi* | [**ezsigntemplatepackagesignerCreateObjectV1**](docs/ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerCreateObjectV1) | **POST** /1/object/ezsigntemplatepackagesigner | Create a new Ezsigntemplatepackagesigner
*ObjectEzsigntemplatepackagesignerApi* | [**ezsigntemplatepackagesignerDeleteObjectV1**](docs/ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID} | Delete an existing Ezsigntemplatepackagesigner
*ObjectEzsigntemplatepackagesignerApi* | [**ezsigntemplatepackagesignerEditObjectV1**](docs/ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerEditObjectV1) | **PUT** /1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID} | Edit an existing Ezsigntemplatepackagesigner
*ObjectEzsigntemplatepackagesignerApi* | [**ezsigntemplatepackagesignerGetObjectV2**](docs/ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerGetObjectV2) | **GET** /2/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID} | Retrieve an existing Ezsigntemplatepackagesigner
*ObjectEzsigntemplatepackagesignermembershipApi* | [**ezsigntemplatepackagesignermembershipCreateObjectV1**](docs/ObjectEzsigntemplatepackagesignermembershipApi.md#ezsigntemplatepackagesignermembershipCreateObjectV1) | **POST** /1/object/ezsigntemplatepackagesignermembership | Create a new Ezsigntemplatepackagesignermembership
*ObjectEzsigntemplatepackagesignermembershipApi* | [**ezsigntemplatepackagesignermembershipDeleteObjectV1**](docs/ObjectEzsigntemplatepackagesignermembershipApi.md#ezsigntemplatepackagesignermembershipDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatepackagesignermembership/{pkiEzsigntemplatepackagesignermembershipID} | Delete an existing Ezsigntemplatepackagesignermembership
*ObjectEzsigntemplatepackagesignermembershipApi* | [**ezsigntemplatepackagesignermembershipGetObjectV2**](docs/ObjectEzsigntemplatepackagesignermembershipApi.md#ezsigntemplatepackagesignermembershipGetObjectV2) | **GET** /2/object/ezsigntemplatepackagesignermembership/{pkiEzsigntemplatepackagesignermembershipID} | Retrieve an existing Ezsigntemplatepackagesignermembership
*ObjectEzsigntemplatepublicApi* | [**ezsigntemplatepublicCreateEzsignfolderV1**](docs/ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicCreateEzsignfolderV1) | **POST** /1/object/ezsigntemplatepublic/createEzsignfolder | Create an Ezsignfolder
*ObjectEzsigntemplatepublicApi* | [**ezsigntemplatepublicCreateObjectV1**](docs/ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicCreateObjectV1) | **POST** /1/object/ezsigntemplatepublic | Create a new Ezsigntemplatepublic
*ObjectEzsigntemplatepublicApi* | [**ezsigntemplatepublicEditObjectV1**](docs/ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicEditObjectV1) | **PUT** /1/object/ezsigntemplatepublic/{pkiEzsigntemplatepublicID} | Edit an existing Ezsigntemplatepublic
*ObjectEzsigntemplatepublicApi* | [**ezsigntemplatepublicGetEzsigntemplatepublicDetailsV1**](docs/ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicGetEzsigntemplatepublicDetailsV1) | **POST** /1/object/ezsigntemplatepublic/getEzsigntemplatepublicDetails | Retrieve the Ezsigntemplatepublic details
*ObjectEzsigntemplatepublicApi* | [**ezsigntemplatepublicGetFormsDataV1**](docs/ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicGetFormsDataV1) | **GET** /1/object/ezsigntemplatepublic/{pkiEzsigntemplatepublicID}/getFormsData | Retrieve an existing Ezsigntemplatepublic&#39;s forms data
*ObjectEzsigntemplatepublicApi* | [**ezsigntemplatepublicGetListV1**](docs/ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicGetListV1) | **GET** /1/object/ezsigntemplatepublic/getList | Retrieve Ezsigntemplatepublic list
*ObjectEzsigntemplatepublicApi* | [**ezsigntemplatepublicGetObjectV2**](docs/ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicGetObjectV2) | **GET** /2/object/ezsigntemplatepublic/{pkiEzsigntemplatepublicID} | Retrieve an existing Ezsigntemplatepublic
*ObjectEzsigntemplatepublicApi* | [**ezsigntemplatepublicResetLimitExceededCounterV1**](docs/ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicResetLimitExceededCounterV1) | **POST** /1/object/ezsigntemplatepublic/{pkiEzsigntemplatepublicID}/resetLimitExceededCounter | Reset the limit exceeded counter
*ObjectEzsigntemplatepublicApi* | [**ezsigntemplatepublicResetUrlV1**](docs/ObjectEzsigntemplatepublicApi.md#ezsigntemplatepublicResetUrlV1) | **POST** /1/object/ezsigntemplatepublic/{pkiEzsigntemplatepublicID}/resetUrl | Reset the Ezsigntemplatepublic url
*ObjectEzsigntemplatesignatureApi* | [**ezsigntemplatesignatureCreateObjectV2**](docs/ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureCreateObjectV2) | **POST** /2/object/ezsigntemplatesignature | Create a new Ezsigntemplatesignature
*ObjectEzsigntemplatesignatureApi* | [**ezsigntemplatesignatureDeleteObjectV1**](docs/ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Delete an existing Ezsigntemplatesignature
*ObjectEzsigntemplatesignatureApi* | [**ezsigntemplatesignatureEditObjectV2**](docs/ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureEditObjectV2) | **PUT** /2/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Edit an existing Ezsigntemplatesignature
*ObjectEzsigntemplatesignatureApi* | [**ezsigntemplatesignatureGetObjectV3**](docs/ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureGetObjectV3) | **GET** /3/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Retrieve an existing Ezsigntemplatesignature
*ObjectEzsigntemplatesignerApi* | [**ezsigntemplatesignerCreateObjectV1**](docs/ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerCreateObjectV1) | **POST** /1/object/ezsigntemplatesigner | Create a new Ezsigntemplatesigner
*ObjectEzsigntemplatesignerApi* | [**ezsigntemplatesignerDeleteObjectV1**](docs/ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerDeleteObjectV1) | **DELETE** /1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID} | Delete an existing Ezsigntemplatesigner
*ObjectEzsigntemplatesignerApi* | [**ezsigntemplatesignerEditObjectV1**](docs/ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerEditObjectV1) | **PUT** /1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID} | Edit an existing Ezsigntemplatesigner
*ObjectEzsigntemplatesignerApi* | [**ezsigntemplatesignerGetObjectV2**](docs/ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerGetObjectV2) | **GET** /2/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID} | Retrieve an existing Ezsigntemplatesigner
*ObjectEzsigntsarequirementApi* | [**ezsigntsarequirementGetAutocompleteV2**](docs/ObjectEzsigntsarequirementApi.md#ezsigntsarequirementGetAutocompleteV2) | **GET** /2/object/ezsigntsarequirement/getAutocomplete/{sSelector} | Retrieve Ezsigntsarequirements and IDs
*ObjectEzsignuserApi* | [**ezsignuserEditObjectV1**](docs/ObjectEzsignuserApi.md#ezsignuserEditObjectV1) | **PUT** /1/object/ezsignuser/{pkiEzsignuserID} | Edit an existing Ezsignuser
*ObjectEzsignuserApi* | [**ezsignuserGetObjectV2**](docs/ObjectEzsignuserApi.md#ezsignuserGetObjectV2) | **GET** /2/object/ezsignuser/{pkiEzsignuserID} | Retrieve an existing Ezsignuser
*ObjectFontApi* | [**fontGetAutocompleteV2**](docs/ObjectFontApi.md#fontGetAutocompleteV2) | **GET** /2/object/font/getAutocomplete/{sSelector} | Retrieve Fonts and IDs
*ObjectFranchisebrokerApi* | [**franchisebrokerGetAutocompleteV2**](docs/ObjectFranchisebrokerApi.md#franchisebrokerGetAutocompleteV2) | **GET** /2/object/franchisebroker/getAutocomplete/{sSelector} | Retrieve Franchisebrokers and IDs
*ObjectFranchiseofficeApi* | [**franchiseofficeGetAutocompleteV2**](docs/ObjectFranchiseofficeApi.md#franchiseofficeGetAutocompleteV2) | **GET** /2/object/franchiseoffice/getAutocomplete/{sSelector} | Retrieve Franchiseoffices and IDs
*ObjectFranchisereferalincomeApi* | [**franchisereferalincomeCreateObjectV2**](docs/ObjectFranchisereferalincomeApi.md#franchisereferalincomeCreateObjectV2) | **POST** /2/object/franchisereferalincome | Create a new Franchisereferalincome
*ObjectGlaccountApi* | [**glaccountGetAutocompleteV2**](docs/ObjectGlaccountApi.md#glaccountGetAutocompleteV2) | **GET** /2/object/glaccount/getAutocomplete/{sSelector} | Retrieve Glaccounts and IDs
*ObjectGlaccountcontainerApi* | [**glaccountcontainerGetAutocompleteV2**](docs/ObjectGlaccountcontainerApi.md#glaccountcontainerGetAutocompleteV2) | **GET** /2/object/glaccountcontainer/getAutocomplete/{sSelector} | Retrieve Glaccountcontainers and IDs
*ObjectInscriptionApi* | [**inscriptionGetAttachmentsV1**](docs/ObjectInscriptionApi.md#inscriptionGetAttachmentsV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getAttachments | Retrieve Inscription&#39;s Attachments
*ObjectInscriptionApi* | [**inscriptionGetCommunicationCountV1**](docs/ObjectInscriptionApi.md#inscriptionGetCommunicationCountV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getCommunicationCount | Retrieve Communication count
*ObjectInscriptionApi* | [**inscriptionGetCommunicationListV1**](docs/ObjectInscriptionApi.md#inscriptionGetCommunicationListV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getCommunicationList | Retrieve Communication list
*ObjectInscriptionApi* | [**inscriptionGetCommunicationrecipientsV1**](docs/ObjectInscriptionApi.md#inscriptionGetCommunicationrecipientsV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getCommunicationrecipients | Retrieve Inscription&#39;s Communicationrecipient
*ObjectInscriptionApi* | [**inscriptionGetCommunicationsendersV1**](docs/ObjectInscriptionApi.md#inscriptionGetCommunicationsendersV1) | **GET** /1/object/inscription/{pkiInscriptionID}/getCommunicationsenders | Retrieve Inscription&#39;s Communicationsender
*ObjectInscriptionnotauthenticatedApi* | [**inscriptionnotauthenticatedGetCommunicationCountV1**](docs/ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetCommunicationCountV1) | **GET** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getCommunicationCount | Retrieve Communication count
*ObjectInscriptionnotauthenticatedApi* | [**inscriptionnotauthenticatedGetCommunicationListV1**](docs/ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetCommunicationListV1) | **GET** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getCommunicationList | Retrieve Communication list
*ObjectInscriptionnotauthenticatedApi* | [**inscriptionnotauthenticatedGetCommunicationrecipientsV1**](docs/ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetCommunicationrecipientsV1) | **GET** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getCommunicationrecipients | Retrieve Inscriptionnotauthenticated&#39;s Communicationrecipient
*ObjectInscriptionnotauthenticatedApi* | [**inscriptionnotauthenticatedGetCommunicationsendersV1**](docs/ObjectInscriptionnotauthenticatedApi.md#inscriptionnotauthenticatedGetCommunicationsendersV1) | **GET** /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getCommunicationsenders | Retrieve Inscriptionnotauthenticated&#39;s Communicationsender
*ObjectInscriptiontempApi* | [**inscriptiontempGetCommunicationCountV1**](docs/ObjectInscriptiontempApi.md#inscriptiontempGetCommunicationCountV1) | **GET** /1/object/inscriptiontemp/{pkiInscriptiontempID}/getCommunicationCount | Retrieve Communication count
*ObjectInscriptiontempApi* | [**inscriptiontempGetCommunicationListV1**](docs/ObjectInscriptiontempApi.md#inscriptiontempGetCommunicationListV1) | **GET** /1/object/inscriptiontemp/{pkiInscriptiontempID}/getCommunicationList | Retrieve Communication list
*ObjectInscriptiontempApi* | [**inscriptiontempGetCommunicationrecipientsV1**](docs/ObjectInscriptiontempApi.md#inscriptiontempGetCommunicationrecipientsV1) | **GET** /1/object/inscriptiontemp/{pkiInscriptiontempID}/getCommunicationrecipients | Retrieve Inscriptiontemp&#39;s Communicationrecipient
*ObjectInscriptiontempApi* | [**inscriptiontempGetCommunicationsendersV1**](docs/ObjectInscriptiontempApi.md#inscriptiontempGetCommunicationsendersV1) | **GET** /1/object/inscriptiontemp/{pkiInscriptiontempID}/getCommunicationsenders | Retrieve Inscriptiontemp&#39;s Communicationsender
*ObjectInvoiceApi* | [**invoiceGetAttachmentsV1**](docs/ObjectInvoiceApi.md#invoiceGetAttachmentsV1) | **GET** /1/object/invoice/{pkiInvoiceID}/getAttachments | Retrieve Invoice&#39;s Attachments
*ObjectInvoiceApi* | [**invoiceGetCommunicationCountV1**](docs/ObjectInvoiceApi.md#invoiceGetCommunicationCountV1) | **GET** /1/object/invoice/{pkiInvoiceID}/getCommunicationCount | Retrieve Communication count
*ObjectInvoiceApi* | [**invoiceGetCommunicationListV1**](docs/ObjectInvoiceApi.md#invoiceGetCommunicationListV1) | **GET** /1/object/invoice/{pkiInvoiceID}/getCommunicationList | Retrieve Communication list
*ObjectInvoiceApi* | [**invoiceGetCommunicationrecipientsV1**](docs/ObjectInvoiceApi.md#invoiceGetCommunicationrecipientsV1) | **GET** /1/object/invoice/{pkiInvoiceID}/getCommunicationrecipients | Retrieve Invoice&#39;s Communicationrecipient
*ObjectInvoiceApi* | [**invoiceGetCommunicationsendersV1**](docs/ObjectInvoiceApi.md#invoiceGetCommunicationsendersV1) | **GET** /1/object/invoice/{pkiInvoiceID}/getCommunicationsenders | Retrieve Invoice&#39;s Communicationsender
*ObjectLanguageApi* | [**languageGetAutocompleteV2**](docs/ObjectLanguageApi.md#languageGetAutocompleteV2) | **GET** /2/object/language/getAutocomplete/{sSelector} | Retrieve Languages and IDs
*ObjectModuleApi* | [**moduleGetAutocompleteV2**](docs/ObjectModuleApi.md#moduleGetAutocompleteV2) | **GET** /2/object/module/getAutocomplete/{sSelector} | Retrieve Modules and IDs
*ObjectModulegroupApi* | [**modulegroupGetAllV1**](docs/ObjectModulegroupApi.md#modulegroupGetAllV1) | **GET** /1/object/modulegroup/getAll/{eContext} | Retrieve all Modulegroups
*ObjectNotificationsectionApi* | [**notificationsectionGetNotificationtestsV1**](docs/ObjectNotificationsectionApi.md#notificationsectionGetNotificationtestsV1) | **GET** /1/object/notificationsection/{pkiNotificationsectionID}/getNotificationtests | Retrieve an existing Notificationsection&#39;s Notificationtests
*ObjectNotificationtestApi* | [**notificationtestGetElementsV1**](docs/ObjectNotificationtestApi.md#notificationtestGetElementsV1) | **GET** /1/object/notificationtest/{pkiNotificationtestID}/getElements | Retrieve an existing Notificationtest&#39;s Elements
*ObjectOtherincomeApi* | [**otherincomeGetCommunicationCountV1**](docs/ObjectOtherincomeApi.md#otherincomeGetCommunicationCountV1) | **GET** /1/object/otherincome/{pkiOtherincomeID}/getCommunicationCount | Retrieve Communication count
*ObjectOtherincomeApi* | [**otherincomeGetCommunicationListV1**](docs/ObjectOtherincomeApi.md#otherincomeGetCommunicationListV1) | **GET** /1/object/otherincome/{pkiOtherincomeID}/getCommunicationList | Retrieve Communication list
*ObjectOtherincomeApi* | [**otherincomeGetCommunicationrecipientsV1**](docs/ObjectOtherincomeApi.md#otherincomeGetCommunicationrecipientsV1) | **GET** /1/object/otherincome/{pkiOtherincomeID}/getCommunicationrecipients | Retrieve Otherincome&#39;s Communicationrecipient
*ObjectOtherincomeApi* | [**otherincomeGetCommunicationsendersV1**](docs/ObjectOtherincomeApi.md#otherincomeGetCommunicationsendersV1) | **GET** /1/object/otherincome/{pkiOtherincomeID}/getCommunicationsenders | Retrieve Otherincome&#39;s Communicationsender
*ObjectPaymenttermApi* | [**paymenttermCreateObjectV1**](docs/ObjectPaymenttermApi.md#paymenttermCreateObjectV1) | **POST** /1/object/paymentterm | Create a new Paymentterm
*ObjectPaymenttermApi* | [**paymenttermEditObjectV1**](docs/ObjectPaymenttermApi.md#paymenttermEditObjectV1) | **PUT** /1/object/paymentterm/{pkiPaymenttermID} | Edit an existing Paymentterm
*ObjectPaymenttermApi* | [**paymenttermGetAutocompleteV2**](docs/ObjectPaymenttermApi.md#paymenttermGetAutocompleteV2) | **GET** /2/object/paymentterm/getAutocomplete/{sSelector} | Retrieve Paymentterms and IDs
*ObjectPaymenttermApi* | [**paymenttermGetListV1**](docs/ObjectPaymenttermApi.md#paymenttermGetListV1) | **GET** /1/object/paymentterm/getList | Retrieve Paymentterm list
*ObjectPaymenttermApi* | [**paymenttermGetObjectV2**](docs/ObjectPaymenttermApi.md#paymenttermGetObjectV2) | **GET** /2/object/paymentterm/{pkiPaymenttermID} | Retrieve an existing Paymentterm
*ObjectPdfalevelApi* | [**pdfalevelGetAutocompleteV2**](docs/ObjectPdfalevelApi.md#pdfalevelGetAutocompleteV2) | **GET** /2/object/pdfalevel/getAutocomplete/{sSelector} | Retrieve Pdfalevels and IDs
*ObjectPeriodApi* | [**periodGetAutocompleteV2**](docs/ObjectPeriodApi.md#periodGetAutocompleteV2) | **GET** /2/object/period/getAutocomplete/{sSelector} | Retrieve Periods and IDs
*ObjectPermissionApi* | [**permissionCreateObjectV1**](docs/ObjectPermissionApi.md#permissionCreateObjectV1) | **POST** /1/object/permission | Create a new Permission
*ObjectPermissionApi* | [**permissionDeleteObjectV1**](docs/ObjectPermissionApi.md#permissionDeleteObjectV1) | **DELETE** /1/object/permission/{pkiPermissionID} | Delete an existing Permission
*ObjectPermissionApi* | [**permissionEditObjectV1**](docs/ObjectPermissionApi.md#permissionEditObjectV1) | **PUT** /1/object/permission/{pkiPermissionID} | Edit an existing Permission
*ObjectPermissionApi* | [**permissionGetObjectV2**](docs/ObjectPermissionApi.md#permissionGetObjectV2) | **GET** /2/object/permission/{pkiPermissionID} | Retrieve an existing Permission
*ObjectPhonetypeApi* | [**phonetypeGetAutocompleteV2**](docs/ObjectPhonetypeApi.md#phonetypeGetAutocompleteV2) | **GET** /2/object/phonetype/getAutocomplete/{sSelector} | Retrieve Phonetypes and IDs
*ObjectProvinceApi* | [**provinceGetAutocompleteV2**](docs/ObjectProvinceApi.md#provinceGetAutocompleteV2) | **GET** /2/object/province/getAutocomplete/{sSelector} | Retrieve Provinces and IDs
*ObjectRejectedoffertopurchaseApi* | [**rejectedoffertopurchaseGetCommunicationCountV1**](docs/ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseGetCommunicationCountV1) | **GET** /1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationCount | Retrieve Communication count
*ObjectRejectedoffertopurchaseApi* | [**rejectedoffertopurchaseGetCommunicationListV1**](docs/ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseGetCommunicationListV1) | **GET** /1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationList | Retrieve Communication list
*ObjectRejectedoffertopurchaseApi* | [**rejectedoffertopurchaseGetCommunicationrecipientsV1**](docs/ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseGetCommunicationrecipientsV1) | **GET** /1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationrecipients | Retrieve Rejectedoffertopurchase&#39;s Communicationrecipient
*ObjectRejectedoffertopurchaseApi* | [**rejectedoffertopurchaseGetCommunicationsendersV1**](docs/ObjectRejectedoffertopurchaseApi.md#rejectedoffertopurchaseGetCommunicationsendersV1) | **GET** /1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationsenders | Retrieve Rejectedoffertopurchase&#39;s Communicationsender
*ObjectSecretquestionApi* | [**secretquestionGetAutocompleteV2**](docs/ObjectSecretquestionApi.md#secretquestionGetAutocompleteV2) | **GET** /2/object/secretquestion/getAutocomplete/{sSelector} | Retrieve Secretquestions and IDs
*ObjectSessionhistoryApi* | [**sessionhistoryGetListV1**](docs/ObjectSessionhistoryApi.md#sessionhistoryGetListV1) | **GET** /1/object/sessionhistory/getList | Retrieve Sessionhistory list
*ObjectSignatureApi* | [**signatureCreateObjectV1**](docs/ObjectSignatureApi.md#signatureCreateObjectV1) | **POST** /1/object/signature | Create a new Signature
*ObjectSignatureApi* | [**signatureDeleteObjectV1**](docs/ObjectSignatureApi.md#signatureDeleteObjectV1) | **DELETE** /1/object/signature/{pkiSignatureID} | Delete an existing Signature
*ObjectSignatureApi* | [**signatureEditObjectV1**](docs/ObjectSignatureApi.md#signatureEditObjectV1) | **PUT** /1/object/signature/{pkiSignatureID} | Edit an existing Signature
*ObjectSignatureApi* | [**signatureGetObjectV2**](docs/ObjectSignatureApi.md#signatureGetObjectV2) | **GET** /2/object/signature/{pkiSignatureID} | Retrieve an existing Signature
*ObjectSignatureApi* | [**signatureGetObjectV3**](docs/ObjectSignatureApi.md#signatureGetObjectV3) | **GET** /3/object/signature/{pkiSignatureID} | Retrieve an existing Signature
*ObjectSignatureApi* | [**signatureGetSVGInitialsV1**](docs/ObjectSignatureApi.md#signatureGetSVGInitialsV1) | **GET** /1/object/signature/{pkiSignatureID}/getSVGInitials | Retrieve an existing Signature initial SVG
*ObjectSignatureApi* | [**signatureGetSVGSignatureV1**](docs/ObjectSignatureApi.md#signatureGetSVGSignatureV1) | **GET** /1/object/signature/{pkiSignatureID}/getSVGSignature | Retrieve an existing Signature SVG
*ObjectSubnetApi* | [**subnetCreateObjectV1**](docs/ObjectSubnetApi.md#subnetCreateObjectV1) | **POST** /1/object/subnet | Create a new Subnet
*ObjectSubnetApi* | [**subnetDeleteObjectV1**](docs/ObjectSubnetApi.md#subnetDeleteObjectV1) | **DELETE** /1/object/subnet/{pkiSubnetID} | Delete an existing Subnet
*ObjectSubnetApi* | [**subnetEditObjectV1**](docs/ObjectSubnetApi.md#subnetEditObjectV1) | **PUT** /1/object/subnet/{pkiSubnetID} | Edit an existing Subnet
*ObjectSubnetApi* | [**subnetGetObjectV2**](docs/ObjectSubnetApi.md#subnetGetObjectV2) | **GET** /2/object/subnet/{pkiSubnetID} | Retrieve an existing Subnet
*ObjectSupplyApi* | [**supplyCreateObjectV1**](docs/ObjectSupplyApi.md#supplyCreateObjectV1) | **POST** /1/object/supply | Create a new Supply
*ObjectSupplyApi* | [**supplyDeleteObjectV1**](docs/ObjectSupplyApi.md#supplyDeleteObjectV1) | **DELETE** /1/object/supply/{pkiSupplyID} | Delete an existing Supply
*ObjectSupplyApi* | [**supplyEditObjectV1**](docs/ObjectSupplyApi.md#supplyEditObjectV1) | **PUT** /1/object/supply/{pkiSupplyID} | Edit an existing Supply
*ObjectSupplyApi* | [**supplyGetAutocompleteV2**](docs/ObjectSupplyApi.md#supplyGetAutocompleteV2) | **GET** /2/object/supply/getAutocomplete/{sSelector} | Retrieve Supplys and IDs
*ObjectSupplyApi* | [**supplyGetListV1**](docs/ObjectSupplyApi.md#supplyGetListV1) | **GET** /1/object/supply/getList | Retrieve Supply list
*ObjectSupplyApi* | [**supplyGetObjectV2**](docs/ObjectSupplyApi.md#supplyGetObjectV2) | **GET** /2/object/supply/{pkiSupplyID} | Retrieve an existing Supply
*ObjectSystemconfigurationApi* | [**systemconfigurationEditObjectV1**](docs/ObjectSystemconfigurationApi.md#systemconfigurationEditObjectV1) | **PUT** /1/object/systemconfiguration/{pkiSystemconfigurationID} | Edit an existing Systemconfiguration
*ObjectSystemconfigurationApi* | [**systemconfigurationGetObjectV2**](docs/ObjectSystemconfigurationApi.md#systemconfigurationGetObjectV2) | **GET** /2/object/systemconfiguration/{pkiSystemconfigurationID} | Retrieve an existing Systemconfiguration
*ObjectTaxassignmentApi* | [**taxassignmentGetAutocompleteV2**](docs/ObjectTaxassignmentApi.md#taxassignmentGetAutocompleteV2) | **GET** /2/object/taxassignment/getAutocomplete/{sSelector} | Retrieve Taxassignments and IDs
*ObjectTimezoneApi* | [**timezoneGetAutocompleteV2**](docs/ObjectTimezoneApi.md#timezoneGetAutocompleteV2) | **GET** /2/object/timezone/getAutocomplete/{sSelector} | Retrieve Timezones and IDs
*ObjectTranqcontractApi* | [**tranqcontractGetCommunicationCountV1**](docs/ObjectTranqcontractApi.md#tranqcontractGetCommunicationCountV1) | **GET** /1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationCount | Retrieve Communication count
*ObjectTranqcontractApi* | [**tranqcontractGetCommunicationListV1**](docs/ObjectTranqcontractApi.md#tranqcontractGetCommunicationListV1) | **GET** /1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationList | Retrieve Communication list
*ObjectTranqcontractApi* | [**tranqcontractGetCommunicationrecipientsV1**](docs/ObjectTranqcontractApi.md#tranqcontractGetCommunicationrecipientsV1) | **GET** /1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationrecipients | Retrieve Tranqcontract&#39;s Communicationrecipient
*ObjectTranqcontractApi* | [**tranqcontractGetCommunicationsendersV1**](docs/ObjectTranqcontractApi.md#tranqcontractGetCommunicationsendersV1) | **GET** /1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationsenders | Retrieve Tranqcontract&#39;s Communicationsender
*ObjectUserApi* | [**userCreateObjectV1**](docs/ObjectUserApi.md#userCreateObjectV1) | **POST** /1/object/user | Create a new User
*ObjectUserApi* | [**userCreateObjectV2**](docs/ObjectUserApi.md#userCreateObjectV2) | **POST** /2/object/user | Create a new User
*ObjectUserApi* | [**userEditColleaguesV2**](docs/ObjectUserApi.md#userEditColleaguesV2) | **PUT** /2/object/user/{pkiUserID}/editColleagues | Edit multiple Colleagues
*ObjectUserApi* | [**userEditObjectV1**](docs/ObjectUserApi.md#userEditObjectV1) | **PUT** /1/object/user/{pkiUserID} | Edit an existing User
*ObjectUserApi* | [**userEditPermissionsV1**](docs/ObjectUserApi.md#userEditPermissionsV1) | **PUT** /1/object/user/{pkiUserID}/editPermissions | Edit multiple Permissions
*ObjectUserApi* | [**userGetApikeysV1**](docs/ObjectUserApi.md#userGetApikeysV1) | **GET** /1/object/user/{pkiUserID}/getApikeys | Retrieve an existing User&#39;s Apikeys
*ObjectUserApi* | [**userGetAutocompleteV2**](docs/ObjectUserApi.md#userGetAutocompleteV2) | **GET** /2/object/user/getAutocomplete/{sSelector} | Retrieve Users and IDs
*ObjectUserApi* | [**userGetColleaguesV2**](docs/ObjectUserApi.md#userGetColleaguesV2) | **GET** /2/object/user/{pkiUserID}/getColleagues | Retrieve an existing User&#39;s Colleagues
*ObjectUserApi* | [**userGetEffectivePermissionsV1**](docs/ObjectUserApi.md#userGetEffectivePermissionsV1) | **GET** /1/object/user/{pkiUserID}/getEffectivePermissions | Retrieve an existing User&#39;s Effective Permissions
*ObjectUserApi* | [**userGetListV1**](docs/ObjectUserApi.md#userGetListV1) | **GET** /1/object/user/getList | Retrieve User list
*ObjectUserApi* | [**userGetObjectV2**](docs/ObjectUserApi.md#userGetObjectV2) | **GET** /2/object/user/{pkiUserID} | Retrieve an existing User
*ObjectUserApi* | [**userGetPermissionsV1**](docs/ObjectUserApi.md#userGetPermissionsV1) | **GET** /1/object/user/{pkiUserID}/getPermissions | Retrieve an existing User&#39;s Permissions
*ObjectUserApi* | [**userGetSubnetsV1**](docs/ObjectUserApi.md#userGetSubnetsV1) | **GET** /1/object/user/{pkiUserID}/getSubnets | Retrieve an existing User&#39;s Subnets
*ObjectUserApi* | [**userGetUsergroupexternalsV1**](docs/ObjectUserApi.md#userGetUsergroupexternalsV1) | **GET** /1/object/user/{pkiUserID}/getUsergroupexternals | Get User&#39;s Usergroupexternals
*ObjectUserApi* | [**userGetUsergroupsV1**](docs/ObjectUserApi.md#userGetUsergroupsV1) | **GET** /1/object/user/{pkiUserID}/getUsergroups | Get User&#39;s Usergroups
*ObjectUserApi* | [**userSendPasswordResetV1**](docs/ObjectUserApi.md#userSendPasswordResetV1) | **POST** /1/object/user/{pkiUserID}/sendPasswordReset | Send password reset
*ObjectUsergroupApi* | [**usergroupCreateObjectV1**](docs/ObjectUsergroupApi.md#usergroupCreateObjectV1) | **POST** /1/object/usergroup | Create a new Usergroup
*ObjectUsergroupApi* | [**usergroupEditObjectV1**](docs/ObjectUsergroupApi.md#usergroupEditObjectV1) | **PUT** /1/object/usergroup/{pkiUsergroupID} | Edit an existing Usergroup
*ObjectUsergroupApi* | [**usergroupEditPermissionsV1**](docs/ObjectUsergroupApi.md#usergroupEditPermissionsV1) | **PUT** /1/object/usergroup/{pkiUsergroupID}/editPermissions | Edit multiple Permissions
*ObjectUsergroupApi* | [**usergroupEditUsergroupdelegationsV1**](docs/ObjectUsergroupApi.md#usergroupEditUsergroupdelegationsV1) | **PUT** /1/object/usergroup/{pkiUsergroupID}/editUsergroupdelegations | Edit multiple Usergroupdelegations
*ObjectUsergroupApi* | [**usergroupEditUsergroupmembershipsV1**](docs/ObjectUsergroupApi.md#usergroupEditUsergroupmembershipsV1) | **PUT** /1/object/usergroup/{pkiUsergroupID}/editUsergroupmemberships | Edit multiple Usergroupmemberships
*ObjectUsergroupApi* | [**usergroupGetAutocompleteV2**](docs/ObjectUsergroupApi.md#usergroupGetAutocompleteV2) | **GET** /2/object/usergroup/getAutocomplete/{sSelector} | Retrieve Usergroups and IDs
*ObjectUsergroupApi* | [**usergroupGetListV1**](docs/ObjectUsergroupApi.md#usergroupGetListV1) | **GET** /1/object/usergroup/getList | Retrieve Usergroup list
*ObjectUsergroupApi* | [**usergroupGetObjectV2**](docs/ObjectUsergroupApi.md#usergroupGetObjectV2) | **GET** /2/object/usergroup/{pkiUsergroupID} | Retrieve an existing Usergroup
*ObjectUsergroupApi* | [**usergroupGetPermissionsV1**](docs/ObjectUsergroupApi.md#usergroupGetPermissionsV1) | **GET** /1/object/usergroup/{pkiUsergroupID}/getPermissions | Retrieve an existing Usergroup&#39;s Permissions
*ObjectUsergroupApi* | [**usergroupGetUsergroupdelegationsV1**](docs/ObjectUsergroupApi.md#usergroupGetUsergroupdelegationsV1) | **GET** /1/object/usergroup/{pkiUsergroupID}/getUsergroupdelegations | Retrieve an existing Usergroup&#39;s Usergroupdelegations
*ObjectUsergroupApi* | [**usergroupGetUsergroupmembershipsV1**](docs/ObjectUsergroupApi.md#usergroupGetUsergroupmembershipsV1) | **GET** /1/object/usergroup/{pkiUsergroupID}/getUsergroupmemberships | Retrieve an existing Usergroup&#39;s Usergroupmemberships
*ObjectUsergroupdelegationApi* | [**usergroupdelegationCreateObjectV1**](docs/ObjectUsergroupdelegationApi.md#usergroupdelegationCreateObjectV1) | **POST** /1/object/usergroupdelegation | Create a new Usergroupdelegation
*ObjectUsergroupdelegationApi* | [**usergroupdelegationDeleteObjectV1**](docs/ObjectUsergroupdelegationApi.md#usergroupdelegationDeleteObjectV1) | **DELETE** /1/object/usergroupdelegation/{pkiUsergroupdelegationID} | Delete an existing Usergroupdelegation
*ObjectUsergroupdelegationApi* | [**usergroupdelegationEditObjectV1**](docs/ObjectUsergroupdelegationApi.md#usergroupdelegationEditObjectV1) | **PUT** /1/object/usergroupdelegation/{pkiUsergroupdelegationID} | Edit an existing Usergroupdelegation
*ObjectUsergroupdelegationApi* | [**usergroupdelegationGetObjectV2**](docs/ObjectUsergroupdelegationApi.md#usergroupdelegationGetObjectV2) | **GET** /2/object/usergroupdelegation/{pkiUsergroupdelegationID} | Retrieve an existing Usergroupdelegation
*ObjectUsergroupexternalApi* | [**usergroupexternalCreateObjectV1**](docs/ObjectUsergroupexternalApi.md#usergroupexternalCreateObjectV1) | **POST** /1/object/usergroupexternal | Create a new Usergroupexternal
*ObjectUsergroupexternalApi* | [**usergroupexternalDeleteObjectV1**](docs/ObjectUsergroupexternalApi.md#usergroupexternalDeleteObjectV1) | **DELETE** /1/object/usergroupexternal/{pkiUsergroupexternalID} | Delete an existing Usergroupexternal
*ObjectUsergroupexternalApi* | [**usergroupexternalEditObjectV1**](docs/ObjectUsergroupexternalApi.md#usergroupexternalEditObjectV1) | **PUT** /1/object/usergroupexternal/{pkiUsergroupexternalID} | Edit an existing Usergroupexternal
*ObjectUsergroupexternalApi* | [**usergroupexternalGetAutocompleteV2**](docs/ObjectUsergroupexternalApi.md#usergroupexternalGetAutocompleteV2) | **GET** /2/object/usergroupexternal/getAutocomplete/{sSelector} | Retrieve Usergroupexternals and IDs
*ObjectUsergroupexternalApi* | [**usergroupexternalGetListV1**](docs/ObjectUsergroupexternalApi.md#usergroupexternalGetListV1) | **GET** /1/object/usergroupexternal/getList | Retrieve Usergroupexternal list
*ObjectUsergroupexternalApi* | [**usergroupexternalGetObjectV2**](docs/ObjectUsergroupexternalApi.md#usergroupexternalGetObjectV2) | **GET** /2/object/usergroupexternal/{pkiUsergroupexternalID} | Retrieve an existing Usergroupexternal
*ObjectUsergroupexternalApi* | [**usergroupexternalGetUsergroupexternalmembershipsV1**](docs/ObjectUsergroupexternalApi.md#usergroupexternalGetUsergroupexternalmembershipsV1) | **GET** /1/object/usergroupexternal/{pkiUsergroupexternalID}/getUsergroupexternalmemberships | Retrieve an existing Usergroupexternal&#39;s Usergroupexternalmemberships
*ObjectUsergroupexternalApi* | [**usergroupexternalGetUsergroupsV1**](docs/ObjectUsergroupexternalApi.md#usergroupexternalGetUsergroupsV1) | **GET** /1/object/usergroupexternal/{pkiUsergroupexternalID}/getUsergroups | Get Usergroupexternal&#39;s Usergroups
*ObjectUsergroupmembershipApi* | [**usergroupmembershipCreateObjectV1**](docs/ObjectUsergroupmembershipApi.md#usergroupmembershipCreateObjectV1) | **POST** /1/object/usergroupmembership | Create a new Usergroupmembership
*ObjectUsergroupmembershipApi* | [**usergroupmembershipDeleteObjectV1**](docs/ObjectUsergroupmembershipApi.md#usergroupmembershipDeleteObjectV1) | **DELETE** /1/object/usergroupmembership/{pkiUsergroupmembershipID} | Delete an existing Usergroupmembership
*ObjectUsergroupmembershipApi* | [**usergroupmembershipEditObjectV1**](docs/ObjectUsergroupmembershipApi.md#usergroupmembershipEditObjectV1) | **PUT** /1/object/usergroupmembership/{pkiUsergroupmembershipID} | Edit an existing Usergroupmembership
*ObjectUsergroupmembershipApi* | [**usergroupmembershipGetObjectV2**](docs/ObjectUsergroupmembershipApi.md#usergroupmembershipGetObjectV2) | **GET** /2/object/usergroupmembership/{pkiUsergroupmembershipID} | Retrieve an existing Usergroupmembership
*ObjectUserlogintypeApi* | [**userlogintypeGetAutocompleteV2**](docs/ObjectUserlogintypeApi.md#userlogintypeGetAutocompleteV2) | **GET** /2/object/userlogintype/getAutocomplete/{sSelector} | Retrieve Userlogintypes and IDs
*ObjectUserstagedApi* | [**userstagedCreateUserV1**](docs/ObjectUserstagedApi.md#userstagedCreateUserV1) | **POST** /1/object/userstaged/{pkiUserstagedID}/createUser | Create a User from a Userstaged and then map it
*ObjectUserstagedApi* | [**userstagedDeleteObjectV1**](docs/ObjectUserstagedApi.md#userstagedDeleteObjectV1) | **DELETE** /1/object/userstaged/{pkiUserstagedID} | Delete an existing Userstaged
*ObjectUserstagedApi* | [**userstagedGetListV1**](docs/ObjectUserstagedApi.md#userstagedGetListV1) | **GET** /1/object/userstaged/getList | Retrieve Userstaged list
*ObjectUserstagedApi* | [**userstagedGetObjectV2**](docs/ObjectUserstagedApi.md#userstagedGetObjectV2) | **GET** /2/object/userstaged/{pkiUserstagedID} | Retrieve an existing Userstaged
*ObjectUserstagedApi* | [**userstagedMapV1**](docs/ObjectUserstagedApi.md#userstagedMapV1) | **POST** /1/object/userstaged/{pkiUserstagedID}/map | Map the Userstaged to an existing user
*ObjectVariableexpenseApi* | [**variableexpenseCreateObjectV1**](docs/ObjectVariableexpenseApi.md#variableexpenseCreateObjectV1) | **POST** /1/object/variableexpense | Create a new Variableexpense
*ObjectVariableexpenseApi* | [**variableexpenseEditObjectV1**](docs/ObjectVariableexpenseApi.md#variableexpenseEditObjectV1) | **PUT** /1/object/variableexpense/{pkiVariableexpenseID} | Edit an existing Variableexpense
*ObjectVariableexpenseApi* | [**variableexpenseGetAutocompleteV2**](docs/ObjectVariableexpenseApi.md#variableexpenseGetAutocompleteV2) | **GET** /2/object/variableexpense/getAutocomplete/{sSelector} | Retrieve Variableexpenses and IDs
*ObjectVariableexpenseApi* | [**variableexpenseGetListV1**](docs/ObjectVariableexpenseApi.md#variableexpenseGetListV1) | **GET** /1/object/variableexpense/getList | Retrieve Variableexpense list
*ObjectVariableexpenseApi* | [**variableexpenseGetObjectV2**](docs/ObjectVariableexpenseApi.md#variableexpenseGetObjectV2) | **GET** /2/object/variableexpense/{pkiVariableexpenseID} | Retrieve an existing Variableexpense
*ObjectVersionhistoryApi* | [**versionhistoryGetObjectV2**](docs/ObjectVersionhistoryApi.md#versionhistoryGetObjectV2) | **GET** /2/object/versionhistory/{pkiVersionhistoryID} | Retrieve an existing Versionhistory
*ObjectWebhookApi* | [**webhookCreateObjectV2**](docs/ObjectWebhookApi.md#webhookCreateObjectV2) | **POST** /2/object/webhook | Create a new Webhook
*ObjectWebhookApi* | [**webhookDeleteObjectV1**](docs/ObjectWebhookApi.md#webhookDeleteObjectV1) | **DELETE** /1/object/webhook/{pkiWebhookID} | Delete an existing Webhook
*ObjectWebhookApi* | [**webhookEditObjectV1**](docs/ObjectWebhookApi.md#webhookEditObjectV1) | **PUT** /1/object/webhook/{pkiWebhookID} | Edit an existing Webhook
*ObjectWebhookApi* | [**webhookGetHistoryV1**](docs/ObjectWebhookApi.md#webhookGetHistoryV1) | **GET** /1/object/webhook/{pkiWebhookID}/getHistory | Retrieve the logs for recent Webhook calls
*ObjectWebhookApi* | [**webhookGetListV1**](docs/ObjectWebhookApi.md#webhookGetListV1) | **GET** /1/object/webhook/getList | Retrieve Webhook list
*ObjectWebhookApi* | [**webhookGetObjectV2**](docs/ObjectWebhookApi.md#webhookGetObjectV2) | **GET** /2/object/webhook/{pkiWebhookID} | Retrieve an existing Webhook
*ObjectWebhookApi* | [**webhookRegenerateApikeyV1**](docs/ObjectWebhookApi.md#webhookRegenerateApikeyV1) | **POST** /1/object/webhook/{pkiWebhookID}/regenerateApikey | Regenerate the Apikey
*ObjectWebhookApi* | [**webhookSendWebhookV1**](docs/ObjectWebhookApi.md#webhookSendWebhookV1) | **POST** /1/object/webhook/sendWebhook | Emit a Webhook event
*ObjectWebhookApi* | [**webhookTestV1**](docs/ObjectWebhookApi.md#webhookTestV1) | **POST** /1/object/webhook/{pkiWebhookID}/test | Test the Webhook by calling the Url
*ScimGroupsApi* | [**groupsCreateObjectScimV2**](docs/ScimGroupsApi.md#groupsCreateObjectScimV2) | **POST** /2/scim/Groups | Create a new Usergroup
*ScimGroupsApi* | [**groupsDeleteObjectScimV2**](docs/ScimGroupsApi.md#groupsDeleteObjectScimV2) | **DELETE** /2/scim/Groups/{groupId} | Delete an existing Usergroup
*ScimGroupsApi* | [**groupsEditObjectScimV2**](docs/ScimGroupsApi.md#groupsEditObjectScimV2) | **PUT** /2/scim/Groups/{groupId} | Edit an existing Usergroup
*ScimGroupsApi* | [**groupsGetListScimV2**](docs/ScimGroupsApi.md#groupsGetListScimV2) | **GET** /2/scim/Groups | Retrieve Usergroup list
*ScimGroupsApi* | [**groupsGetObjectScimV2**](docs/ScimGroupsApi.md#groupsGetObjectScimV2) | **GET** /2/scim/Groups/{groupId} | Retrieve an existing Usergroup
*ScimServiceProviderConfigApi* | [**serviceProviderConfigGetObjectScimV2**](docs/ScimServiceProviderConfigApi.md#serviceProviderConfigGetObjectScimV2) | **GET** /2/scim/ServiceProviderConfig | Get Service Provider Configuration
*ScimUsersApi* | [**usersCreateObjectScimV2**](docs/ScimUsersApi.md#usersCreateObjectScimV2) | **POST** /2/scim/Users | Create a new User
*ScimUsersApi* | [**usersDeleteObjectScimV2**](docs/ScimUsersApi.md#usersDeleteObjectScimV2) | **DELETE** /2/scim/Users/{userId} | Delete an existing User
*ScimUsersApi* | [**usersEditObjectScimV2**](docs/ScimUsersApi.md#usersEditObjectScimV2) | **PUT** /2/scim/Users/{userId} | Edit an existing User
*ScimUsersApi* | [**usersGetListScimV2**](docs/ScimUsersApi.md#usersGetListScimV2) | **GET** /2/scim/Users | Retrieve User list
*ScimUsersApi* | [**usersGetObjectScimV2**](docs/ScimUsersApi.md#usersGetObjectScimV2) | **GET** /2/scim/Users/{userId} | Retrieve an existing User


## Documentation for Models

 - [ActivesessionGenerateFederationTokenV1Request](docs/ActivesessionGenerateFederationTokenV1Request.md)
 - [ActivesessionGenerateFederationTokenV1Response](docs/ActivesessionGenerateFederationTokenV1Response.md)
 - [ActivesessionGenerateFederationTokenV1ResponseMPayload](docs/ActivesessionGenerateFederationTokenV1ResponseMPayload.md)
 - [ActivesessionGetCurrentV1Response](docs/ActivesessionGetCurrentV1Response.md)
 - [ActivesessionGetCurrentV1ResponseMPayload](docs/ActivesessionGetCurrentV1ResponseMPayload.md)
 - [ActivesessionGetCurrentV2Response](docs/ActivesessionGetCurrentV2Response.md)
 - [ActivesessionGetCurrentV2ResponseMPayload](docs/ActivesessionGetCurrentV2ResponseMPayload.md)
 - [ActivesessionGetListV1Response](docs/ActivesessionGetListV1Response.md)
 - [ActivesessionGetListV1ResponseMPayload](docs/ActivesessionGetListV1ResponseMPayload.md)
 - [ActivesessionListElement](docs/ActivesessionListElement.md)
 - [ActivesessionResponse](docs/ActivesessionResponse.md)
 - [ActivesessionResponseCompound](docs/ActivesessionResponseCompound.md)
 - [ActivesessionResponseCompoundApikey](docs/ActivesessionResponseCompoundApikey.md)
 - [ActivesessionResponseCompoundUser](docs/ActivesessionResponseCompoundUser.md)
 - [AddressRequest](docs/AddressRequest.md)
 - [AddressRequestCompound](docs/AddressRequestCompound.md)
 - [AddressResponse](docs/AddressResponse.md)
 - [AddressResponseCompound](docs/AddressResponseCompound.md)
 - [ApikeyCreateObjectV2Request](docs/ApikeyCreateObjectV2Request.md)
 - [ApikeyCreateObjectV2Response](docs/ApikeyCreateObjectV2Response.md)
 - [ApikeyCreateObjectV2ResponseMPayload](docs/ApikeyCreateObjectV2ResponseMPayload.md)
 - [ApikeyEditObjectV1Request](docs/ApikeyEditObjectV1Request.md)
 - [ApikeyEditObjectV1Response](docs/ApikeyEditObjectV1Response.md)
 - [ApikeyEditPermissionsV1Request](docs/ApikeyEditPermissionsV1Request.md)
 - [ApikeyEditPermissionsV1Response](docs/ApikeyEditPermissionsV1Response.md)
 - [ApikeyEditPermissionsV1ResponseMPayload](docs/ApikeyEditPermissionsV1ResponseMPayload.md)
 - [ApikeyGenerateDelegatedCredentialsV1Request](docs/ApikeyGenerateDelegatedCredentialsV1Request.md)
 - [ApikeyGenerateDelegatedCredentialsV1Response](docs/ApikeyGenerateDelegatedCredentialsV1Response.md)
 - [ApikeyGenerateDelegatedCredentialsV1ResponseMPayload](docs/ApikeyGenerateDelegatedCredentialsV1ResponseMPayload.md)
 - [ApikeyGetCorsV1Response](docs/ApikeyGetCorsV1Response.md)
 - [ApikeyGetCorsV1ResponseMPayload](docs/ApikeyGetCorsV1ResponseMPayload.md)
 - [ApikeyGetListV1Response](docs/ApikeyGetListV1Response.md)
 - [ApikeyGetListV1ResponseMPayload](docs/ApikeyGetListV1ResponseMPayload.md)
 - [ApikeyGetObjectV2Response](docs/ApikeyGetObjectV2Response.md)
 - [ApikeyGetObjectV2ResponseMPayload](docs/ApikeyGetObjectV2ResponseMPayload.md)
 - [ApikeyGetPermissionsV1Response](docs/ApikeyGetPermissionsV1Response.md)
 - [ApikeyGetPermissionsV1ResponseMPayload](docs/ApikeyGetPermissionsV1ResponseMPayload.md)
 - [ApikeyGetSubnetsV1Response](docs/ApikeyGetSubnetsV1Response.md)
 - [ApikeyGetSubnetsV1ResponseMPayload](docs/ApikeyGetSubnetsV1ResponseMPayload.md)
 - [ApikeyListElement](docs/ApikeyListElement.md)
 - [ApikeyRegenerateV1Request](docs/ApikeyRegenerateV1Request.md)
 - [ApikeyRegenerateV1Response](docs/ApikeyRegenerateV1Response.md)
 - [ApikeyRegenerateV1ResponseMPayload](docs/ApikeyRegenerateV1ResponseMPayload.md)
 - [ApikeyRequest](docs/ApikeyRequest.md)
 - [ApikeyRequestCompound](docs/ApikeyRequestCompound.md)
 - [ApikeyResponse](docs/ApikeyResponse.md)
 - [ApikeyResponseCompound](docs/ApikeyResponseCompound.md)
 - [AttachmentGetAttachmentlogsV1Response](docs/AttachmentGetAttachmentlogsV1Response.md)
 - [AttachmentGetAttachmentlogsV1ResponseMPayload](docs/AttachmentGetAttachmentlogsV1ResponseMPayload.md)
 - [AttachmentResponse](docs/AttachmentResponse.md)
 - [AttachmentResponseCompound](docs/AttachmentResponseCompound.md)
 - [AttachmentlogResponse](docs/AttachmentlogResponse.md)
 - [AttachmentlogResponseCompound](docs/AttachmentlogResponseCompound.md)
 - [AttemptResponse](docs/AttemptResponse.md)
 - [AttemptResponseCompound](docs/AttemptResponseCompound.md)
 - [AuthenticationexternalAutocompleteElementResponse](docs/AuthenticationexternalAutocompleteElementResponse.md)
 - [AuthenticationexternalCreateObjectV1Request](docs/AuthenticationexternalCreateObjectV1Request.md)
 - [AuthenticationexternalCreateObjectV1Response](docs/AuthenticationexternalCreateObjectV1Response.md)
 - [AuthenticationexternalCreateObjectV1ResponseMPayload](docs/AuthenticationexternalCreateObjectV1ResponseMPayload.md)
 - [AuthenticationexternalDeleteObjectV1Response](docs/AuthenticationexternalDeleteObjectV1Response.md)
 - [AuthenticationexternalEditObjectV1Request](docs/AuthenticationexternalEditObjectV1Request.md)
 - [AuthenticationexternalEditObjectV1Response](docs/AuthenticationexternalEditObjectV1Response.md)
 - [AuthenticationexternalGetAutocompleteV2Response](docs/AuthenticationexternalGetAutocompleteV2Response.md)
 - [AuthenticationexternalGetAutocompleteV2ResponseMPayload](docs/AuthenticationexternalGetAutocompleteV2ResponseMPayload.md)
 - [AuthenticationexternalGetListV1Response](docs/AuthenticationexternalGetListV1Response.md)
 - [AuthenticationexternalGetListV1ResponseMPayload](docs/AuthenticationexternalGetListV1ResponseMPayload.md)
 - [AuthenticationexternalGetObjectV2Response](docs/AuthenticationexternalGetObjectV2Response.md)
 - [AuthenticationexternalGetObjectV2ResponseMPayload](docs/AuthenticationexternalGetObjectV2ResponseMPayload.md)
 - [AuthenticationexternalListElement](docs/AuthenticationexternalListElement.md)
 - [AuthenticationexternalRequest](docs/AuthenticationexternalRequest.md)
 - [AuthenticationexternalRequestCompound](docs/AuthenticationexternalRequestCompound.md)
 - [AuthenticationexternalResetAuthorizationV1Response](docs/AuthenticationexternalResetAuthorizationV1Response.md)
 - [AuthenticationexternalResponse](docs/AuthenticationexternalResponse.md)
 - [AuthenticationexternalResponseCompound](docs/AuthenticationexternalResponseCompound.md)
 - [BillingentityexternalAutocompleteElementResponse](docs/BillingentityexternalAutocompleteElementResponse.md)
 - [BillingentityexternalGenerateFederationTokenV1Request](docs/BillingentityexternalGenerateFederationTokenV1Request.md)
 - [BillingentityexternalGenerateFederationTokenV1Response](docs/BillingentityexternalGenerateFederationTokenV1Response.md)
 - [BillingentityexternalGenerateFederationTokenV1ResponseMPayload](docs/BillingentityexternalGenerateFederationTokenV1ResponseMPayload.md)
 - [BillingentityexternalGetAutocompleteV2Response](docs/BillingentityexternalGetAutocompleteV2Response.md)
 - [BillingentityexternalGetAutocompleteV2ResponseMPayload](docs/BillingentityexternalGetAutocompleteV2ResponseMPayload.md)
 - [BillingentityinternalAutocompleteElementResponse](docs/BillingentityinternalAutocompleteElementResponse.md)
 - [BillingentityinternalCreateObjectV1Request](docs/BillingentityinternalCreateObjectV1Request.md)
 - [BillingentityinternalCreateObjectV1Response](docs/BillingentityinternalCreateObjectV1Response.md)
 - [BillingentityinternalCreateObjectV1ResponseMPayload](docs/BillingentityinternalCreateObjectV1ResponseMPayload.md)
 - [BillingentityinternalEditObjectV1Request](docs/BillingentityinternalEditObjectV1Request.md)
 - [BillingentityinternalEditObjectV1Response](docs/BillingentityinternalEditObjectV1Response.md)
 - [BillingentityinternalGetAutocompleteV2Response](docs/BillingentityinternalGetAutocompleteV2Response.md)
 - [BillingentityinternalGetAutocompleteV2ResponseMPayload](docs/BillingentityinternalGetAutocompleteV2ResponseMPayload.md)
 - [BillingentityinternalGetListV1Response](docs/BillingentityinternalGetListV1Response.md)
 - [BillingentityinternalGetListV1ResponseMPayload](docs/BillingentityinternalGetListV1ResponseMPayload.md)
 - [BillingentityinternalGetObjectV2Response](docs/BillingentityinternalGetObjectV2Response.md)
 - [BillingentityinternalGetObjectV2ResponseMPayload](docs/BillingentityinternalGetObjectV2ResponseMPayload.md)
 - [BillingentityinternalListElement](docs/BillingentityinternalListElement.md)
 - [BillingentityinternalRequest](docs/BillingentityinternalRequest.md)
 - [BillingentityinternalRequestCompound](docs/BillingentityinternalRequestCompound.md)
 - [BillingentityinternalResponse](docs/BillingentityinternalResponse.md)
 - [BillingentityinternalResponseCompound](docs/BillingentityinternalResponseCompound.md)
 - [BillingentityinternalproductRequest](docs/BillingentityinternalproductRequest.md)
 - [BillingentityinternalproductRequestCompound](docs/BillingentityinternalproductRequestCompound.md)
 - [BillingentityinternalproductResponse](docs/BillingentityinternalproductResponse.md)
 - [BillingentityinternalproductResponseCompound](docs/BillingentityinternalproductResponseCompound.md)
 - [BrandingAutocompleteElementResponse](docs/BrandingAutocompleteElementResponse.md)
 - [BrandingCreateObjectV2Request](docs/BrandingCreateObjectV2Request.md)
 - [BrandingCreateObjectV2Response](docs/BrandingCreateObjectV2Response.md)
 - [BrandingCreateObjectV2ResponseMPayload](docs/BrandingCreateObjectV2ResponseMPayload.md)
 - [BrandingEditObjectV2Request](docs/BrandingEditObjectV2Request.md)
 - [BrandingEditObjectV2Response](docs/BrandingEditObjectV2Response.md)
 - [BrandingGetAutocompleteV2Response](docs/BrandingGetAutocompleteV2Response.md)
 - [BrandingGetAutocompleteV2ResponseMPayload](docs/BrandingGetAutocompleteV2ResponseMPayload.md)
 - [BrandingGetListV1Response](docs/BrandingGetListV1Response.md)
 - [BrandingGetListV1ResponseMPayload](docs/BrandingGetListV1ResponseMPayload.md)
 - [BrandingGetObjectV3Response](docs/BrandingGetObjectV3Response.md)
 - [BrandingGetObjectV3ResponseMPayload](docs/BrandingGetObjectV3ResponseMPayload.md)
 - [BrandingListElement](docs/BrandingListElement.md)
 - [BrandingRequestCompoundV2](docs/BrandingRequestCompoundV2.md)
 - [BrandingRequestV2](docs/BrandingRequestV2.md)
 - [BrandingResponseCompoundV3](docs/BrandingResponseCompoundV3.md)
 - [BrandingResponseV3](docs/BrandingResponseV3.md)
 - [BuyercontractGetCommunicationCountV1Response](docs/BuyercontractGetCommunicationCountV1Response.md)
 - [BuyercontractGetCommunicationCountV1ResponseMPayload](docs/BuyercontractGetCommunicationCountV1ResponseMPayload.md)
 - [BuyercontractGetCommunicationListV1Response](docs/BuyercontractGetCommunicationListV1Response.md)
 - [BuyercontractGetCommunicationListV1ResponseMPayload](docs/BuyercontractGetCommunicationListV1ResponseMPayload.md)
 - [BuyercontractGetCommunicationrecipientsV1Response](docs/BuyercontractGetCommunicationrecipientsV1Response.md)
 - [BuyercontractGetCommunicationrecipientsV1ResponseMPayload](docs/BuyercontractGetCommunicationrecipientsV1ResponseMPayload.md)
 - [BuyercontractGetCommunicationsendersV1Response](docs/BuyercontractGetCommunicationsendersV1Response.md)
 - [BuyercontractGetCommunicationsendersV1ResponseMPayload](docs/BuyercontractGetCommunicationsendersV1ResponseMPayload.md)
 - [ClonehistoryGetListV1Response](docs/ClonehistoryGetListV1Response.md)
 - [ClonehistoryGetListV1ResponseMPayload](docs/ClonehistoryGetListV1ResponseMPayload.md)
 - [ClonehistoryListElement](docs/ClonehistoryListElement.md)
 - [ColleagueRequestCompoundV2](docs/ColleagueRequestCompoundV2.md)
 - [ColleagueRequestV2](docs/ColleagueRequestV2.md)
 - [ColleagueResponseCompoundV2](docs/ColleagueResponseCompoundV2.md)
 - [ColleagueResponseV2](docs/ColleagueResponseV2.md)
 - [CommonAudit](docs/CommonAudit.md)
 - [CommonAuditdetail](docs/CommonAuditdetail.md)
 - [CommonFile](docs/CommonFile.md)
 - [CommonGetListV1ResponseMPayload](docs/CommonGetListV1ResponseMPayload.md)
 - [CommonGetReportV1Response](docs/CommonGetReportV1Response.md)
 - [CommonGetReportV1ResponseMPayload](docs/CommonGetReportV1ResponseMPayload.md)
 - [CommonReport](docs/CommonReport.md)
 - [CommonReportcell](docs/CommonReportcell.md)
 - [CommonReportcellstyle](docs/CommonReportcellstyle.md)
 - [CommonReportcolumn](docs/CommonReportcolumn.md)
 - [CommonReportgroup](docs/CommonReportgroup.md)
 - [CommonReportrow](docs/CommonReportrow.md)
 - [CommonReportsection](docs/CommonReportsection.md)
 - [CommonReportsubsection](docs/CommonReportsubsection.md)
 - [CommonReportsubsectionpart](docs/CommonReportsubsectionpart.md)
 - [CommonResponse](docs/CommonResponse.md)
 - [CommonResponseError](docs/CommonResponseError.md)
 - [CommonResponseErrorCreditcardValidation](docs/CommonResponseErrorCreditcardValidation.md)
 - [CommonResponseErrorEzsignformValidation](docs/CommonResponseErrorEzsignformValidation.md)
 - [CommonResponseErrorSTemporaryFileUrl](docs/CommonResponseErrorSTemporaryFileUrl.md)
 - [CommonResponseErrorTooManyRequests](docs/CommonResponseErrorTooManyRequests.md)
 - [CommonResponseErrorWrongFranchiseoffice](docs/CommonResponseErrorWrongFranchiseoffice.md)
 - [CommonResponseFilter](docs/CommonResponseFilter.md)
 - [CommonResponseGetList](docs/CommonResponseGetList.md)
 - [CommonResponseObjDebug](docs/CommonResponseObjDebug.md)
 - [CommonResponseObjDebugPayload](docs/CommonResponseObjDebugPayload.md)
 - [CommonResponseObjDebugPayloadGetList](docs/CommonResponseObjDebugPayloadGetList.md)
 - [CommonResponseObjSQLQuery](docs/CommonResponseObjSQLQuery.md)
 - [CommonResponseRedirectSSecretquestionTextX](docs/CommonResponseRedirectSSecretquestionTextX.md)
 - [CommonResponseWarning](docs/CommonResponseWarning.md)
 - [CommonWebhook](docs/CommonWebhook.md)
 - [CommunicationRequest](docs/CommunicationRequest.md)
 - [CommunicationRequestCompound](docs/CommunicationRequestCompound.md)
 - [CommunicationSendV1Request](docs/CommunicationSendV1Request.md)
 - [CommunicationSendV1Response](docs/CommunicationSendV1Response.md)
 - [CommunicationSendV1ResponseMPayload](docs/CommunicationSendV1ResponseMPayload.md)
 - [CommunicationattachmentRequest](docs/CommunicationattachmentRequest.md)
 - [CommunicationattachmentRequestCompound](docs/CommunicationattachmentRequestCompound.md)
 - [CommunicationexternalrecipientRequest](docs/CommunicationexternalrecipientRequest.md)
 - [CommunicationexternalrecipientRequestCompound](docs/CommunicationexternalrecipientRequestCompound.md)
 - [CommunicationrecipientRequest](docs/CommunicationrecipientRequest.md)
 - [CommunicationrecipientRequestCompound](docs/CommunicationrecipientRequestCompound.md)
 - [CommunicationreferenceRequest](docs/CommunicationreferenceRequest.md)
 - [CommunicationreferenceRequestCompound](docs/CommunicationreferenceRequestCompound.md)
 - [CompanyAutocompleteElementResponse](docs/CompanyAutocompleteElementResponse.md)
 - [CompanyGetAutocompleteV2Response](docs/CompanyGetAutocompleteV2Response.md)
 - [CompanyGetAutocompleteV2ResponseMPayload](docs/CompanyGetAutocompleteV2ResponseMPayload.md)
 - [ComputedECommunicationDirection](docs/ComputedECommunicationDirection.md)
 - [ComputedEEzsigndocumentSteptype](docs/ComputedEEzsigndocumentSteptype.md)
 - [ComputedEEzsignfolderAccess](docs/ComputedEEzsignfolderAccess.md)
 - [ContactRequest](docs/ContactRequest.md)
 - [ContactRequestCompound](docs/ContactRequestCompound.md)
 - [ContactRequestCompoundV2](docs/ContactRequestCompoundV2.md)
 - [ContactRequestV2](docs/ContactRequestV2.md)
 - [ContactResponse](docs/ContactResponse.md)
 - [ContactResponseCompound](docs/ContactResponseCompound.md)
 - [ContactinformationsRequest](docs/ContactinformationsRequest.md)
 - [ContactinformationsRequestCompound](docs/ContactinformationsRequestCompound.md)
 - [ContactinformationsRequestCompoundV2](docs/ContactinformationsRequestCompoundV2.md)
 - [ContactinformationsRequestV2](docs/ContactinformationsRequestV2.md)
 - [ContactinformationsResponse](docs/ContactinformationsResponse.md)
 - [ContactinformationsResponseCompound](docs/ContactinformationsResponseCompound.md)
 - [ContacttitleAutocompleteElementResponse](docs/ContacttitleAutocompleteElementResponse.md)
 - [ContacttitleGetAutocompleteV2Response](docs/ContacttitleGetAutocompleteV2Response.md)
 - [ContacttitleGetAutocompleteV2ResponseMPayload](docs/ContacttitleGetAutocompleteV2ResponseMPayload.md)
 - [CorsCreateObjectV1Request](docs/CorsCreateObjectV1Request.md)
 - [CorsCreateObjectV1Response](docs/CorsCreateObjectV1Response.md)
 - [CorsCreateObjectV1ResponseMPayload](docs/CorsCreateObjectV1ResponseMPayload.md)
 - [CorsDeleteObjectV1Response](docs/CorsDeleteObjectV1Response.md)
 - [CorsEditObjectV1Request](docs/CorsEditObjectV1Request.md)
 - [CorsEditObjectV1Response](docs/CorsEditObjectV1Response.md)
 - [CorsGetObjectV2Response](docs/CorsGetObjectV2Response.md)
 - [CorsGetObjectV2ResponseMPayload](docs/CorsGetObjectV2ResponseMPayload.md)
 - [CorsRequest](docs/CorsRequest.md)
 - [CorsRequestCompound](docs/CorsRequestCompound.md)
 - [CorsResponse](docs/CorsResponse.md)
 - [CorsResponseCompound](docs/CorsResponseCompound.md)
 - [CountryAutocompleteElementResponse](docs/CountryAutocompleteElementResponse.md)
 - [CountryGetAutocompleteV2Response](docs/CountryGetAutocompleteV2Response.md)
 - [CountryGetAutocompleteV2ResponseMPayload](docs/CountryGetAutocompleteV2ResponseMPayload.md)
 - [CreditcardclientAutocompleteElementResponse](docs/CreditcardclientAutocompleteElementResponse.md)
 - [CreditcardclientCreateObjectV1Request](docs/CreditcardclientCreateObjectV1Request.md)
 - [CreditcardclientCreateObjectV1Response](docs/CreditcardclientCreateObjectV1Response.md)
 - [CreditcardclientCreateObjectV1ResponseMPayload](docs/CreditcardclientCreateObjectV1ResponseMPayload.md)
 - [CreditcardclientDeleteObjectV1Response](docs/CreditcardclientDeleteObjectV1Response.md)
 - [CreditcardclientEditObjectV1Request](docs/CreditcardclientEditObjectV1Request.md)
 - [CreditcardclientEditObjectV1Response](docs/CreditcardclientEditObjectV1Response.md)
 - [CreditcardclientGetAutocompleteV2Response](docs/CreditcardclientGetAutocompleteV2Response.md)
 - [CreditcardclientGetAutocompleteV2ResponseMPayload](docs/CreditcardclientGetAutocompleteV2ResponseMPayload.md)
 - [CreditcardclientGetListV1Response](docs/CreditcardclientGetListV1Response.md)
 - [CreditcardclientGetListV1ResponseMPayload](docs/CreditcardclientGetListV1ResponseMPayload.md)
 - [CreditcardclientGetObjectV2Response](docs/CreditcardclientGetObjectV2Response.md)
 - [CreditcardclientGetObjectV2ResponseMPayload](docs/CreditcardclientGetObjectV2ResponseMPayload.md)
 - [CreditcardclientListElement](docs/CreditcardclientListElement.md)
 - [CreditcardclientPatchObjectV1Request](docs/CreditcardclientPatchObjectV1Request.md)
 - [CreditcardclientPatchObjectV1Response](docs/CreditcardclientPatchObjectV1Response.md)
 - [CreditcardclientRequest](docs/CreditcardclientRequest.md)
 - [CreditcardclientRequestCompound](docs/CreditcardclientRequestCompound.md)
 - [CreditcardclientRequestPatch](docs/CreditcardclientRequestPatch.md)
 - [CreditcardclientResponse](docs/CreditcardclientResponse.md)
 - [CreditcardclientResponseCompound](docs/CreditcardclientResponseCompound.md)
 - [CreditcarddetailRequest](docs/CreditcarddetailRequest.md)
 - [CreditcarddetailResponse](docs/CreditcarddetailResponse.md)
 - [CreditcarddetailResponseCompound](docs/CreditcarddetailResponseCompound.md)
 - [CreditcardtypeAutocompleteElementResponse](docs/CreditcardtypeAutocompleteElementResponse.md)
 - [CreditcardtypeGetAutocompleteV2Response](docs/CreditcardtypeGetAutocompleteV2Response.md)
 - [CreditcardtypeGetAutocompleteV2ResponseMPayload](docs/CreditcardtypeGetAutocompleteV2ResponseMPayload.md)
 - [CustomApikey](docs/CustomApikey.md)
 - [CustomApikeyfederation](docs/CustomApikeyfederation.md)
 - [CustomAttachmentResponse](docs/CustomAttachmentResponse.md)
 - [CustomAttachmentdocumenttypeResponse](docs/CustomAttachmentdocumenttypeResponse.md)
 - [CustomBrandingResponse](docs/CustomBrandingResponse.md)
 - [CustomCommunicationListElementResponse](docs/CustomCommunicationListElementResponse.md)
 - [CustomCommunicationattachmentRequest](docs/CustomCommunicationattachmentRequest.md)
 - [CustomCommunicationrecipientsgroupResponse](docs/CustomCommunicationrecipientsgroupResponse.md)
 - [CustomCommunicationrecipientsrecipientResponse](docs/CustomCommunicationrecipientsrecipientResponse.md)
 - [CustomCommunicationsenderRequest](docs/CustomCommunicationsenderRequest.md)
 - [CustomCommunicationsenderResponse](docs/CustomCommunicationsenderResponse.md)
 - [CustomContactNameResponse](docs/CustomContactNameResponse.md)
 - [CustomCreateEzsignelementsPositionedByWordRequest](docs/CustomCreateEzsignelementsPositionedByWordRequest.md)
 - [CustomCreditcardtransactionResponse](docs/CustomCreditcardtransactionResponse.md)
 - [CustomCreditcardtransactionresponseResponse](docs/CustomCreditcardtransactionresponseResponse.md)
 - [CustomDiscussionconfigurationResponse](docs/CustomDiscussionconfigurationResponse.md)
 - [CustomDnsrecordResponse](docs/CustomDnsrecordResponse.md)
 - [CustomDropdownElementRequest](docs/CustomDropdownElementRequest.md)
 - [CustomDropdownElementRequestCompound](docs/CustomDropdownElementRequestCompound.md)
 - [CustomDropdownElementResponse](docs/CustomDropdownElementResponse.md)
 - [CustomDropdownElementResponseCompound](docs/CustomDropdownElementResponseCompound.md)
 - [CustomEWebhookEzsignevent](docs/CustomEWebhookEzsignevent.md)
 - [CustomEzmaxinvoicingEzsigndocumentResponse](docs/CustomEzmaxinvoicingEzsigndocumentResponse.md)
 - [CustomEzmaxinvoicingEzsignfolderResponse](docs/CustomEzmaxinvoicingEzsignfolderResponse.md)
 - [CustomEzmaxpricingResponse](docs/CustomEzmaxpricingResponse.md)
 - [CustomEzsigndocumentEzsignsignaturesAutomaticResponse](docs/CustomEzsigndocumentEzsignsignaturesAutomaticResponse.md)
 - [CustomEzsigndocumentRequest](docs/CustomEzsigndocumentRequest.md)
 - [CustomEzsignfolderEzsignsignaturesAutomaticResponse](docs/CustomEzsignfolderEzsignsignaturesAutomaticResponse.md)
 - [CustomEzsignfolderezsigntemplatepublicResponse](docs/CustomEzsignfolderezsigntemplatepublicResponse.md)
 - [CustomEzsignfolderezsigntemplatepublicSignerResponse](docs/CustomEzsignfolderezsigntemplatepublicSignerResponse.md)
 - [CustomEzsignfoldersignerassociationActionableElementResponse](docs/CustomEzsignfoldersignerassociationActionableElementResponse.md)
 - [CustomEzsignfoldersignerassociationstatusResponse](docs/CustomEzsignfoldersignerassociationstatusResponse.md)
 - [CustomEzsignfoldertransmissionResponse](docs/CustomEzsignfoldertransmissionResponse.md)
 - [CustomEzsignfoldertransmissionSignerResponse](docs/CustomEzsignfoldertransmissionSignerResponse.md)
 - [CustomEzsignfoldertypeResponse](docs/CustomEzsignfoldertypeResponse.md)
 - [CustomEzsignformfieldRequest](docs/CustomEzsignformfieldRequest.md)
 - [CustomEzsignformfielderrorResponse](docs/CustomEzsignformfielderrorResponse.md)
 - [CustomEzsignformfielderrortestResponse](docs/CustomEzsignformfielderrortestResponse.md)
 - [CustomEzsignformfieldgroupCreateEzsignelementsPositionedByWordRequest](docs/CustomEzsignformfieldgroupCreateEzsignelementsPositionedByWordRequest.md)
 - [CustomEzsignformfieldgroupRequest](docs/CustomEzsignformfieldgroupRequest.md)
 - [CustomEzsignsignatureCreateEzsignelementsPositionedByWordRequest](docs/CustomEzsignsignatureCreateEzsignelementsPositionedByWordRequest.md)
 - [CustomEzsignsignatureEzsignsignaturesAutomaticResponse](docs/CustomEzsignsignatureEzsignsignaturesAutomaticResponse.md)
 - [CustomEzsignsignaturestatusResponse](docs/CustomEzsignsignaturestatusResponse.md)
 - [CustomFormDataDocumentResponse](docs/CustomFormDataDocumentResponse.md)
 - [CustomFormDataEzsignformfieldResponse](docs/CustomFormDataEzsignformfieldResponse.md)
 - [CustomFormDataEzsignformfieldgroupResponse](docs/CustomFormDataEzsignformfieldgroupResponse.md)
 - [CustomFormDataSignerResponse](docs/CustomFormDataSignerResponse.md)
 - [CustomFormsDataFolderResponse](docs/CustomFormsDataFolderResponse.md)
 - [CustomImportEzsigntemplatepackageRelationRequest](docs/CustomImportEzsigntemplatepackageRelationRequest.md)
 - [CustomNotificationsubsectiongetnotificationtestsResponse](docs/CustomNotificationsubsectiongetnotificationtestsResponse.md)
 - [CustomNotificationtestgetnotificationtestsResponse](docs/CustomNotificationtestgetnotificationtestsResponse.md)
 - [CustomTimezoneWithCodeResponse](docs/CustomTimezoneWithCodeResponse.md)
 - [CustomUserNameResponse](docs/CustomUserNameResponse.md)
 - [CustomWebhookResponse](docs/CustomWebhookResponse.md)
 - [CustomWebhooklogResponse](docs/CustomWebhooklogResponse.md)
 - [CustomWordPositionOccurenceResponse](docs/CustomWordPositionOccurenceResponse.md)
 - [CustomWordPositionWordResponse](docs/CustomWordPositionWordResponse.md)
 - [CustomerCreateObjectV1Request](docs/CustomerCreateObjectV1Request.md)
 - [CustomerCreateObjectV1Response](docs/CustomerCreateObjectV1Response.md)
 - [CustomerCreateObjectV1ResponseMPayload](docs/CustomerCreateObjectV1ResponseMPayload.md)
 - [CustomerGetObjectV2Response](docs/CustomerGetObjectV2Response.md)
 - [CustomerGetObjectV2ResponseMPayload](docs/CustomerGetObjectV2ResponseMPayload.md)
 - [CustomerRequest](docs/CustomerRequest.md)
 - [CustomerRequestCompound](docs/CustomerRequestCompound.md)
 - [CustomerResponse](docs/CustomerResponse.md)
 - [CustomerResponseCompound](docs/CustomerResponseCompound.md)
 - [DepartmentAutocompleteElementResponse](docs/DepartmentAutocompleteElementResponse.md)
 - [DepartmentGetAutocompleteV2Response](docs/DepartmentGetAutocompleteV2Response.md)
 - [DepartmentGetAutocompleteV2ResponseMPayload](docs/DepartmentGetAutocompleteV2ResponseMPayload.md)
 - [DiscussionCreateObjectV1Request](docs/DiscussionCreateObjectV1Request.md)
 - [DiscussionCreateObjectV1Response](docs/DiscussionCreateObjectV1Response.md)
 - [DiscussionCreateObjectV1ResponseMPayload](docs/DiscussionCreateObjectV1ResponseMPayload.md)
 - [DiscussionDeleteObjectV1Response](docs/DiscussionDeleteObjectV1Response.md)
 - [DiscussionGetObjectV2Response](docs/DiscussionGetObjectV2Response.md)
 - [DiscussionGetObjectV2ResponseMPayload](docs/DiscussionGetObjectV2ResponseMPayload.md)
 - [DiscussionPatchObjectV1Request](docs/DiscussionPatchObjectV1Request.md)
 - [DiscussionPatchObjectV1Response](docs/DiscussionPatchObjectV1Response.md)
 - [DiscussionRequest](docs/DiscussionRequest.md)
 - [DiscussionRequestCompound](docs/DiscussionRequestCompound.md)
 - [DiscussionRequestPatch](docs/DiscussionRequestPatch.md)
 - [DiscussionResponse](docs/DiscussionResponse.md)
 - [DiscussionResponseCompound](docs/DiscussionResponseCompound.md)
 - [DiscussionUpdateDiscussionreadstatusV1Request](docs/DiscussionUpdateDiscussionreadstatusV1Request.md)
 - [DiscussionUpdateDiscussionreadstatusV1Response](docs/DiscussionUpdateDiscussionreadstatusV1Response.md)
 - [DiscussionmembershipCreateObjectV1Request](docs/DiscussionmembershipCreateObjectV1Request.md)
 - [DiscussionmembershipCreateObjectV1Response](docs/DiscussionmembershipCreateObjectV1Response.md)
 - [DiscussionmembershipCreateObjectV1ResponseMPayload](docs/DiscussionmembershipCreateObjectV1ResponseMPayload.md)
 - [DiscussionmembershipDeleteObjectV1Response](docs/DiscussionmembershipDeleteObjectV1Response.md)
 - [DiscussionmembershipRequest](docs/DiscussionmembershipRequest.md)
 - [DiscussionmembershipRequestCompound](docs/DiscussionmembershipRequestCompound.md)
 - [DiscussionmembershipResponse](docs/DiscussionmembershipResponse.md)
 - [DiscussionmembershipResponseCompound](docs/DiscussionmembershipResponseCompound.md)
 - [DiscussionmessageCreateObjectV1Request](docs/DiscussionmessageCreateObjectV1Request.md)
 - [DiscussionmessageCreateObjectV1Response](docs/DiscussionmessageCreateObjectV1Response.md)
 - [DiscussionmessageCreateObjectV1ResponseMPayload](docs/DiscussionmessageCreateObjectV1ResponseMPayload.md)
 - [DiscussionmessageDeleteObjectV1Response](docs/DiscussionmessageDeleteObjectV1Response.md)
 - [DiscussionmessagePatchObjectV1Request](docs/DiscussionmessagePatchObjectV1Request.md)
 - [DiscussionmessagePatchObjectV1Response](docs/DiscussionmessagePatchObjectV1Response.md)
 - [DiscussionmessageRequest](docs/DiscussionmessageRequest.md)
 - [DiscussionmessageRequestCompound](docs/DiscussionmessageRequestCompound.md)
 - [DiscussionmessageRequestPatch](docs/DiscussionmessageRequestPatch.md)
 - [DiscussionmessageResponse](docs/DiscussionmessageResponse.md)
 - [DiscussionmessageResponseCompound](docs/DiscussionmessageResponseCompound.md)
 - [DomainCreateObjectV1Request](docs/DomainCreateObjectV1Request.md)
 - [DomainCreateObjectV1Response](docs/DomainCreateObjectV1Response.md)
 - [DomainCreateObjectV1ResponseMPayload](docs/DomainCreateObjectV1ResponseMPayload.md)
 - [DomainDeleteObjectV1Response](docs/DomainDeleteObjectV1Response.md)
 - [DomainGetListV1Response](docs/DomainGetListV1Response.md)
 - [DomainGetListV1ResponseMPayload](docs/DomainGetListV1ResponseMPayload.md)
 - [DomainGetObjectV2Response](docs/DomainGetObjectV2Response.md)
 - [DomainGetObjectV2ResponseMPayload](docs/DomainGetObjectV2ResponseMPayload.md)
 - [DomainListElement](docs/DomainListElement.md)
 - [DomainRequest](docs/DomainRequest.md)
 - [DomainRequestCompound](docs/DomainRequestCompound.md)
 - [DomainResponse](docs/DomainResponse.md)
 - [DomainResponseCompound](docs/DomainResponseCompound.md)
 - [ElectronicfundstransferGetCommunicationCountV1Response](docs/ElectronicfundstransferGetCommunicationCountV1Response.md)
 - [ElectronicfundstransferGetCommunicationCountV1ResponseMPayload](docs/ElectronicfundstransferGetCommunicationCountV1ResponseMPayload.md)
 - [ElectronicfundstransferGetCommunicationListV1Response](docs/ElectronicfundstransferGetCommunicationListV1Response.md)
 - [ElectronicfundstransferGetCommunicationListV1ResponseMPayload](docs/ElectronicfundstransferGetCommunicationListV1ResponseMPayload.md)
 - [ElectronicfundstransferGetCommunicationrecipientsV1Response](docs/ElectronicfundstransferGetCommunicationrecipientsV1Response.md)
 - [ElectronicfundstransferGetCommunicationrecipientsV1ResponseMPayload](docs/ElectronicfundstransferGetCommunicationrecipientsV1ResponseMPayload.md)
 - [ElectronicfundstransferGetCommunicationsendersV1Response](docs/ElectronicfundstransferGetCommunicationsendersV1Response.md)
 - [ElectronicfundstransferGetCommunicationsendersV1ResponseMPayload](docs/ElectronicfundstransferGetCommunicationsendersV1ResponseMPayload.md)
 - [EmailRequest](docs/EmailRequest.md)
 - [EmailRequestCompound](docs/EmailRequestCompound.md)
 - [EmailResponse](docs/EmailResponse.md)
 - [EmailResponseCompound](docs/EmailResponseCompound.md)
 - [EmailtypeAutocompleteElementResponse](docs/EmailtypeAutocompleteElementResponse.md)
 - [EmailtypeGetAutocompleteV2Response](docs/EmailtypeGetAutocompleteV2Response.md)
 - [EmailtypeGetAutocompleteV2ResponseMPayload](docs/EmailtypeGetAutocompleteV2ResponseMPayload.md)
 - [EnumFontunderline](docs/EnumFontunderline.md)
 - [EnumFontweight](docs/EnumFontweight.md)
 - [EnumHorizontalalignment](docs/EnumHorizontalalignment.md)
 - [EnumTextvalidation](docs/EnumTextvalidation.md)
 - [EnumVerticalalignment](docs/EnumVerticalalignment.md)
 - [EzdoctemplatedocumentAutocompleteElementResponse](docs/EzdoctemplatedocumentAutocompleteElementResponse.md)
 - [EzdoctemplatedocumentCreateObjectV1Request](docs/EzdoctemplatedocumentCreateObjectV1Request.md)
 - [EzdoctemplatedocumentCreateObjectV1Response](docs/EzdoctemplatedocumentCreateObjectV1Response.md)
 - [EzdoctemplatedocumentCreateObjectV1ResponseMPayload](docs/EzdoctemplatedocumentCreateObjectV1ResponseMPayload.md)
 - [EzdoctemplatedocumentEditObjectV1Request](docs/EzdoctemplatedocumentEditObjectV1Request.md)
 - [EzdoctemplatedocumentEditObjectV1Response](docs/EzdoctemplatedocumentEditObjectV1Response.md)
 - [EzdoctemplatedocumentGetAutocompleteV2Response](docs/EzdoctemplatedocumentGetAutocompleteV2Response.md)
 - [EzdoctemplatedocumentGetAutocompleteV2ResponseMPayload](docs/EzdoctemplatedocumentGetAutocompleteV2ResponseMPayload.md)
 - [EzdoctemplatedocumentGetListV1Response](docs/EzdoctemplatedocumentGetListV1Response.md)
 - [EzdoctemplatedocumentGetListV1ResponseMPayload](docs/EzdoctemplatedocumentGetListV1ResponseMPayload.md)
 - [EzdoctemplatedocumentGetObjectV2Response](docs/EzdoctemplatedocumentGetObjectV2Response.md)
 - [EzdoctemplatedocumentGetObjectV2ResponseMPayload](docs/EzdoctemplatedocumentGetObjectV2ResponseMPayload.md)
 - [EzdoctemplatedocumentListElement](docs/EzdoctemplatedocumentListElement.md)
 - [EzdoctemplatedocumentPatchObjectV1Request](docs/EzdoctemplatedocumentPatchObjectV1Request.md)
 - [EzdoctemplatedocumentPatchObjectV1Response](docs/EzdoctemplatedocumentPatchObjectV1Response.md)
 - [EzdoctemplatedocumentRequest](docs/EzdoctemplatedocumentRequest.md)
 - [EzdoctemplatedocumentRequestCompound](docs/EzdoctemplatedocumentRequestCompound.md)
 - [EzdoctemplatedocumentRequestPatch](docs/EzdoctemplatedocumentRequestPatch.md)
 - [EzdoctemplatedocumentResponse](docs/EzdoctemplatedocumentResponse.md)
 - [EzdoctemplatedocumentResponseCompound](docs/EzdoctemplatedocumentResponseCompound.md)
 - [EzdoctemplatefieldtypecategoryAutocompleteElementResponse](docs/EzdoctemplatefieldtypecategoryAutocompleteElementResponse.md)
 - [EzdoctemplatefieldtypecategoryGetAutocompleteV2Response](docs/EzdoctemplatefieldtypecategoryGetAutocompleteV2Response.md)
 - [EzdoctemplatefieldtypecategoryGetAutocompleteV2ResponseMPayload](docs/EzdoctemplatefieldtypecategoryGetAutocompleteV2ResponseMPayload.md)
 - [EzdoctemplatetypeAutocompleteElementResponse](docs/EzdoctemplatetypeAutocompleteElementResponse.md)
 - [EzdoctemplatetypeGetAutocompleteV2Response](docs/EzdoctemplatetypeGetAutocompleteV2Response.md)
 - [EzdoctemplatetypeGetAutocompleteV2ResponseMPayload](docs/EzdoctemplatetypeGetAutocompleteV2ResponseMPayload.md)
 - [EzmaxinvoicingAutocompleteElementResponse](docs/EzmaxinvoicingAutocompleteElementResponse.md)
 - [EzmaxinvoicingGetAutocompleteV2Response](docs/EzmaxinvoicingGetAutocompleteV2Response.md)
 - [EzmaxinvoicingGetAutocompleteV2ResponseMPayload](docs/EzmaxinvoicingGetAutocompleteV2ResponseMPayload.md)
 - [EzmaxinvoicingGetObjectV2Response](docs/EzmaxinvoicingGetObjectV2Response.md)
 - [EzmaxinvoicingGetObjectV2ResponseMPayload](docs/EzmaxinvoicingGetObjectV2ResponseMPayload.md)
 - [EzmaxinvoicingGetProvisionalV1Response](docs/EzmaxinvoicingGetProvisionalV1Response.md)
 - [EzmaxinvoicingGetProvisionalV1ResponseMPayload](docs/EzmaxinvoicingGetProvisionalV1ResponseMPayload.md)
 - [EzmaxinvoicingResponse](docs/EzmaxinvoicingResponse.md)
 - [EzmaxinvoicingResponseCompound](docs/EzmaxinvoicingResponseCompound.md)
 - [EzmaxinvoicingagentResponse](docs/EzmaxinvoicingagentResponse.md)
 - [EzmaxinvoicingagentResponseCompound](docs/EzmaxinvoicingagentResponseCompound.md)
 - [EzmaxinvoicingcommissionResponse](docs/EzmaxinvoicingcommissionResponse.md)
 - [EzmaxinvoicingcommissionResponseCompound](docs/EzmaxinvoicingcommissionResponseCompound.md)
 - [EzmaxinvoicingcontractResponse](docs/EzmaxinvoicingcontractResponse.md)
 - [EzmaxinvoicingcontractResponseCompound](docs/EzmaxinvoicingcontractResponseCompound.md)
 - [EzmaxinvoicingsummaryexternalResponse](docs/EzmaxinvoicingsummaryexternalResponse.md)
 - [EzmaxinvoicingsummaryexternalResponseCompound](docs/EzmaxinvoicingsummaryexternalResponseCompound.md)
 - [EzmaxinvoicingsummaryexternaldetailResponse](docs/EzmaxinvoicingsummaryexternaldetailResponse.md)
 - [EzmaxinvoicingsummaryexternaldetailResponseCompound](docs/EzmaxinvoicingsummaryexternaldetailResponseCompound.md)
 - [EzmaxinvoicingsummaryglobalResponse](docs/EzmaxinvoicingsummaryglobalResponse.md)
 - [EzmaxinvoicingsummaryglobalResponseCompound](docs/EzmaxinvoicingsummaryglobalResponseCompound.md)
 - [EzmaxinvoicingsummaryinternalResponse](docs/EzmaxinvoicingsummaryinternalResponse.md)
 - [EzmaxinvoicingsummaryinternalResponseCompound](docs/EzmaxinvoicingsummaryinternalResponseCompound.md)
 - [EzmaxinvoicingsummaryinternaldetailResponse](docs/EzmaxinvoicingsummaryinternaldetailResponse.md)
 - [EzmaxinvoicingsummaryinternaldetailResponseCompound](docs/EzmaxinvoicingsummaryinternaldetailResponseCompound.md)
 - [EzmaxinvoicinguserResponse](docs/EzmaxinvoicinguserResponse.md)
 - [EzmaxinvoicinguserResponseCompound](docs/EzmaxinvoicinguserResponseCompound.md)
 - [EzmaxproductAutocompleteElementResponse](docs/EzmaxproductAutocompleteElementResponse.md)
 - [EzmaxproductGetAutocompleteV2Response](docs/EzmaxproductGetAutocompleteV2Response.md)
 - [EzmaxproductGetAutocompleteV2ResponseMPayload](docs/EzmaxproductGetAutocompleteV2ResponseMPayload.md)
 - [EzsignannotationCreateObjectV1Request](docs/EzsignannotationCreateObjectV1Request.md)
 - [EzsignannotationCreateObjectV1Response](docs/EzsignannotationCreateObjectV1Response.md)
 - [EzsignannotationCreateObjectV1ResponseMPayload](docs/EzsignannotationCreateObjectV1ResponseMPayload.md)
 - [EzsignannotationDeleteObjectV1Response](docs/EzsignannotationDeleteObjectV1Response.md)
 - [EzsignannotationEditObjectV1Request](docs/EzsignannotationEditObjectV1Request.md)
 - [EzsignannotationEditObjectV1Response](docs/EzsignannotationEditObjectV1Response.md)
 - [EzsignannotationGetObjectV2Response](docs/EzsignannotationGetObjectV2Response.md)
 - [EzsignannotationGetObjectV2ResponseMPayload](docs/EzsignannotationGetObjectV2ResponseMPayload.md)
 - [EzsignannotationRequest](docs/EzsignannotationRequest.md)
 - [EzsignannotationRequestCompound](docs/EzsignannotationRequestCompound.md)
 - [EzsignannotationResponse](docs/EzsignannotationResponse.md)
 - [EzsignannotationResponseCompound](docs/EzsignannotationResponseCompound.md)
 - [EzsignbulksendCreateEzsignbulksendtransmissionV2Request](docs/EzsignbulksendCreateEzsignbulksendtransmissionV2Request.md)
 - [EzsignbulksendCreateEzsignbulksendtransmissionV2Response](docs/EzsignbulksendCreateEzsignbulksendtransmissionV2Response.md)
 - [EzsignbulksendCreateEzsignbulksendtransmissionV2ResponseMPayload](docs/EzsignbulksendCreateEzsignbulksendtransmissionV2ResponseMPayload.md)
 - [EzsignbulksendCreateObjectV1Request](docs/EzsignbulksendCreateObjectV1Request.md)
 - [EzsignbulksendCreateObjectV1Response](docs/EzsignbulksendCreateObjectV1Response.md)
 - [EzsignbulksendCreateObjectV1ResponseMPayload](docs/EzsignbulksendCreateObjectV1ResponseMPayload.md)
 - [EzsignbulksendDeleteObjectV1Response](docs/EzsignbulksendDeleteObjectV1Response.md)
 - [EzsignbulksendEditObjectV1Request](docs/EzsignbulksendEditObjectV1Request.md)
 - [EzsignbulksendEditObjectV1Response](docs/EzsignbulksendEditObjectV1Response.md)
 - [EzsignbulksendGetEzsignbulksendtransmissionsV1Response](docs/EzsignbulksendGetEzsignbulksendtransmissionsV1Response.md)
 - [EzsignbulksendGetEzsignbulksendtransmissionsV1ResponseMPayload](docs/EzsignbulksendGetEzsignbulksendtransmissionsV1ResponseMPayload.md)
 - [EzsignbulksendGetEzsignsignaturesAutomaticV1Response](docs/EzsignbulksendGetEzsignsignaturesAutomaticV1Response.md)
 - [EzsignbulksendGetEzsignsignaturesAutomaticV1ResponseMPayload](docs/EzsignbulksendGetEzsignsignaturesAutomaticV1ResponseMPayload.md)
 - [EzsignbulksendGetFormsDataV1Response](docs/EzsignbulksendGetFormsDataV1Response.md)
 - [EzsignbulksendGetFormsDataV1ResponseMPayload](docs/EzsignbulksendGetFormsDataV1ResponseMPayload.md)
 - [EzsignbulksendGetListV1Response](docs/EzsignbulksendGetListV1Response.md)
 - [EzsignbulksendGetListV1ResponseMPayload](docs/EzsignbulksendGetListV1ResponseMPayload.md)
 - [EzsignbulksendGetObjectV2Response](docs/EzsignbulksendGetObjectV2Response.md)
 - [EzsignbulksendGetObjectV2ResponseMPayload](docs/EzsignbulksendGetObjectV2ResponseMPayload.md)
 - [EzsignbulksendListElement](docs/EzsignbulksendListElement.md)
 - [EzsignbulksendReorderV1Request](docs/EzsignbulksendReorderV1Request.md)
 - [EzsignbulksendReorderV1Response](docs/EzsignbulksendReorderV1Response.md)
 - [EzsignbulksendRequest](docs/EzsignbulksendRequest.md)
 - [EzsignbulksendRequestCompound](docs/EzsignbulksendRequestCompound.md)
 - [EzsignbulksendResponse](docs/EzsignbulksendResponse.md)
 - [EzsignbulksendResponseCompound](docs/EzsignbulksendResponseCompound.md)
 - [EzsignbulksenddocumentmappingCreateObjectV1Request](docs/EzsignbulksenddocumentmappingCreateObjectV1Request.md)
 - [EzsignbulksenddocumentmappingCreateObjectV1Response](docs/EzsignbulksenddocumentmappingCreateObjectV1Response.md)
 - [EzsignbulksenddocumentmappingCreateObjectV1ResponseMPayload](docs/EzsignbulksenddocumentmappingCreateObjectV1ResponseMPayload.md)
 - [EzsignbulksenddocumentmappingDeleteObjectV1Response](docs/EzsignbulksenddocumentmappingDeleteObjectV1Response.md)
 - [EzsignbulksenddocumentmappingGetObjectV2Response](docs/EzsignbulksenddocumentmappingGetObjectV2Response.md)
 - [EzsignbulksenddocumentmappingGetObjectV2ResponseMPayload](docs/EzsignbulksenddocumentmappingGetObjectV2ResponseMPayload.md)
 - [EzsignbulksenddocumentmappingRequest](docs/EzsignbulksenddocumentmappingRequest.md)
 - [EzsignbulksenddocumentmappingRequestCompound](docs/EzsignbulksenddocumentmappingRequestCompound.md)
 - [EzsignbulksenddocumentmappingResponse](docs/EzsignbulksenddocumentmappingResponse.md)
 - [EzsignbulksenddocumentmappingResponseCompound](docs/EzsignbulksenddocumentmappingResponseCompound.md)
 - [EzsignbulksendsignermappingCreateObjectV1Request](docs/EzsignbulksendsignermappingCreateObjectV1Request.md)
 - [EzsignbulksendsignermappingCreateObjectV1Response](docs/EzsignbulksendsignermappingCreateObjectV1Response.md)
 - [EzsignbulksendsignermappingCreateObjectV1ResponseMPayload](docs/EzsignbulksendsignermappingCreateObjectV1ResponseMPayload.md)
 - [EzsignbulksendsignermappingDeleteObjectV1Response](docs/EzsignbulksendsignermappingDeleteObjectV1Response.md)
 - [EzsignbulksendsignermappingGetObjectV2Response](docs/EzsignbulksendsignermappingGetObjectV2Response.md)
 - [EzsignbulksendsignermappingGetObjectV2ResponseMPayload](docs/EzsignbulksendsignermappingGetObjectV2ResponseMPayload.md)
 - [EzsignbulksendsignermappingRequest](docs/EzsignbulksendsignermappingRequest.md)
 - [EzsignbulksendsignermappingRequestCompound](docs/EzsignbulksendsignermappingRequestCompound.md)
 - [EzsignbulksendsignermappingResponse](docs/EzsignbulksendsignermappingResponse.md)
 - [EzsignbulksendsignermappingResponseCompound](docs/EzsignbulksendsignermappingResponseCompound.md)
 - [EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1Response](docs/EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1Response.md)
 - [EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload](docs/EzsignbulksendtransmissionGetEzsignsignaturesAutomaticV1ResponseMPayload.md)
 - [EzsignbulksendtransmissionGetFormsDataV1Response](docs/EzsignbulksendtransmissionGetFormsDataV1Response.md)
 - [EzsignbulksendtransmissionGetFormsDataV1ResponseMPayload](docs/EzsignbulksendtransmissionGetFormsDataV1ResponseMPayload.md)
 - [EzsignbulksendtransmissionGetObjectV2Response](docs/EzsignbulksendtransmissionGetObjectV2Response.md)
 - [EzsignbulksendtransmissionGetObjectV2ResponseMPayload](docs/EzsignbulksendtransmissionGetObjectV2ResponseMPayload.md)
 - [EzsignbulksendtransmissionResponse](docs/EzsignbulksendtransmissionResponse.md)
 - [EzsignbulksendtransmissionResponseCompound](docs/EzsignbulksendtransmissionResponseCompound.md)
 - [EzsigndiscussionCreateObjectV1Request](docs/EzsigndiscussionCreateObjectV1Request.md)
 - [EzsigndiscussionCreateObjectV1Response](docs/EzsigndiscussionCreateObjectV1Response.md)
 - [EzsigndiscussionCreateObjectV1ResponseMPayload](docs/EzsigndiscussionCreateObjectV1ResponseMPayload.md)
 - [EzsigndiscussionDeleteObjectV1Response](docs/EzsigndiscussionDeleteObjectV1Response.md)
 - [EzsigndiscussionGetObjectV2Response](docs/EzsigndiscussionGetObjectV2Response.md)
 - [EzsigndiscussionGetObjectV2ResponseMPayload](docs/EzsigndiscussionGetObjectV2ResponseMPayload.md)
 - [EzsigndiscussionRequest](docs/EzsigndiscussionRequest.md)
 - [EzsigndiscussionRequestCompound](docs/EzsigndiscussionRequestCompound.md)
 - [EzsigndiscussionResponse](docs/EzsigndiscussionResponse.md)
 - [EzsigndiscussionResponseCompound](docs/EzsigndiscussionResponseCompound.md)
 - [EzsigndocumentApplyEzsigntemplateV1Request](docs/EzsigndocumentApplyEzsigntemplateV1Request.md)
 - [EzsigndocumentApplyEzsigntemplateV1Response](docs/EzsigndocumentApplyEzsigntemplateV1Response.md)
 - [EzsigndocumentApplyEzsigntemplateV2Request](docs/EzsigndocumentApplyEzsigntemplateV2Request.md)
 - [EzsigndocumentApplyEzsigntemplateV2Response](docs/EzsigndocumentApplyEzsigntemplateV2Response.md)
 - [EzsigndocumentApplyEzsigntemplateglobalV1Request](docs/EzsigndocumentApplyEzsigntemplateglobalV1Request.md)
 - [EzsigndocumentApplyEzsigntemplateglobalV1Response](docs/EzsigndocumentApplyEzsigntemplateglobalV1Response.md)
 - [EzsigndocumentCreateElementV3Response](docs/EzsigndocumentCreateElementV3Response.md)
 - [EzsigndocumentCreateEzsignelementsPositionedByWordV1Request](docs/EzsigndocumentCreateEzsignelementsPositionedByWordV1Request.md)
 - [EzsigndocumentCreateEzsignelementsPositionedByWordV1Response](docs/EzsigndocumentCreateEzsignelementsPositionedByWordV1Response.md)
 - [EzsigndocumentCreateEzsignelementsPositionedByWordV1ResponseMPayload](docs/EzsigndocumentCreateEzsignelementsPositionedByWordV1ResponseMPayload.md)
 - [EzsigndocumentCreateObjectV1Request](docs/EzsigndocumentCreateObjectV1Request.md)
 - [EzsigndocumentCreateObjectV1Response](docs/EzsigndocumentCreateObjectV1Response.md)
 - [EzsigndocumentCreateObjectV1ResponseMPayload](docs/EzsigndocumentCreateObjectV1ResponseMPayload.md)
 - [EzsigndocumentCreateObjectV2Request](docs/EzsigndocumentCreateObjectV2Request.md)
 - [EzsigndocumentCreateObjectV2Response](docs/EzsigndocumentCreateObjectV2Response.md)
 - [EzsigndocumentCreateObjectV2ResponseMPayload](docs/EzsigndocumentCreateObjectV2ResponseMPayload.md)
 - [EzsigndocumentCreateObjectV3Request](docs/EzsigndocumentCreateObjectV3Request.md)
 - [EzsigndocumentCreateObjectV3Response](docs/EzsigndocumentCreateObjectV3Response.md)
 - [EzsigndocumentCreateObjectV3ResponseMPayload](docs/EzsigndocumentCreateObjectV3ResponseMPayload.md)
 - [EzsigndocumentDeclineToSignV1Request](docs/EzsigndocumentDeclineToSignV1Request.md)
 - [EzsigndocumentDeclineToSignV1Response](docs/EzsigndocumentDeclineToSignV1Response.md)
 - [EzsigndocumentDeleteObjectV1Response](docs/EzsigndocumentDeleteObjectV1Response.md)
 - [EzsigndocumentEditEzsignannotationsV1Request](docs/EzsigndocumentEditEzsignannotationsV1Request.md)
 - [EzsigndocumentEditEzsignannotationsV1Response](docs/EzsigndocumentEditEzsignannotationsV1Response.md)
 - [EzsigndocumentEditEzsignannotationsV1ResponseMPayload](docs/EzsigndocumentEditEzsignannotationsV1ResponseMPayload.md)
 - [EzsigndocumentEditEzsignformfieldgroupsV1Request](docs/EzsigndocumentEditEzsignformfieldgroupsV1Request.md)
 - [EzsigndocumentEditEzsignformfieldgroupsV1Response](docs/EzsigndocumentEditEzsignformfieldgroupsV1Response.md)
 - [EzsigndocumentEditEzsignformfieldgroupsV1ResponseMPayload](docs/EzsigndocumentEditEzsignformfieldgroupsV1ResponseMPayload.md)
 - [EzsigndocumentEditEzsignsignaturesV1Request](docs/EzsigndocumentEditEzsignsignaturesV1Request.md)
 - [EzsigndocumentEditEzsignsignaturesV1Response](docs/EzsigndocumentEditEzsignsignaturesV1Response.md)
 - [EzsigndocumentEditEzsignsignaturesV1ResponseMPayload](docs/EzsigndocumentEditEzsignsignaturesV1ResponseMPayload.md)
 - [EzsigndocumentEditObjectV1Request](docs/EzsigndocumentEditObjectV1Request.md)
 - [EzsigndocumentEditObjectV1Response](docs/EzsigndocumentEditObjectV1Response.md)
 - [EzsigndocumentEndPrematurelyV1Response](docs/EzsigndocumentEndPrematurelyV1Response.md)
 - [EzsigndocumentExtractTextV1Request](docs/EzsigndocumentExtractTextV1Request.md)
 - [EzsigndocumentExtractTextV1Response](docs/EzsigndocumentExtractTextV1Response.md)
 - [EzsigndocumentExtractTextV1ResponseMPayload](docs/EzsigndocumentExtractTextV1ResponseMPayload.md)
 - [EzsigndocumentFlattenV1Response](docs/EzsigndocumentFlattenV1Response.md)
 - [EzsigndocumentGetActionableElementsV1Response](docs/EzsigndocumentGetActionableElementsV1Response.md)
 - [EzsigndocumentGetActionableElementsV1ResponseMPayload](docs/EzsigndocumentGetActionableElementsV1ResponseMPayload.md)
 - [EzsigndocumentGetAttachmentsV1Response](docs/EzsigndocumentGetAttachmentsV1Response.md)
 - [EzsigndocumentGetAttachmentsV1ResponseMPayload](docs/EzsigndocumentGetAttachmentsV1ResponseMPayload.md)
 - [EzsigndocumentGetCompletedElementsV1Response](docs/EzsigndocumentGetCompletedElementsV1Response.md)
 - [EzsigndocumentGetCompletedElementsV1ResponseMPayload](docs/EzsigndocumentGetCompletedElementsV1ResponseMPayload.md)
 - [EzsigndocumentGetDownloadUrlV1Response](docs/EzsigndocumentGetDownloadUrlV1Response.md)
 - [EzsigndocumentGetDownloadUrlV1ResponseMPayload](docs/EzsigndocumentGetDownloadUrlV1ResponseMPayload.md)
 - [EzsigndocumentGetEzsignannotationsV1Response](docs/EzsigndocumentGetEzsignannotationsV1Response.md)
 - [EzsigndocumentGetEzsignannotationsV1ResponseMPayload](docs/EzsigndocumentGetEzsignannotationsV1ResponseMPayload.md)
 - [EzsigndocumentGetEzsigndiscussionsV1Response](docs/EzsigndocumentGetEzsigndiscussionsV1Response.md)
 - [EzsigndocumentGetEzsigndiscussionsV1ResponseMPayload](docs/EzsigndocumentGetEzsigndiscussionsV1ResponseMPayload.md)
 - [EzsigndocumentGetEzsignformfieldgroupsV1Response](docs/EzsigndocumentGetEzsignformfieldgroupsV1Response.md)
 - [EzsigndocumentGetEzsignformfieldgroupsV1ResponseMPayload](docs/EzsigndocumentGetEzsignformfieldgroupsV1ResponseMPayload.md)
 - [EzsigndocumentGetEzsignpagesV1Response](docs/EzsigndocumentGetEzsignpagesV1Response.md)
 - [EzsigndocumentGetEzsignpagesV1ResponseMPayload](docs/EzsigndocumentGetEzsignpagesV1ResponseMPayload.md)
 - [EzsigndocumentGetEzsignsignaturesAutomaticV1Response](docs/EzsigndocumentGetEzsignsignaturesAutomaticV1Response.md)
 - [EzsigndocumentGetEzsignsignaturesAutomaticV1ResponseMPayload](docs/EzsigndocumentGetEzsignsignaturesAutomaticV1ResponseMPayload.md)
 - [EzsigndocumentGetEzsignsignaturesV1Response](docs/EzsigndocumentGetEzsignsignaturesV1Response.md)
 - [EzsigndocumentGetEzsignsignaturesV1ResponseMPayload](docs/EzsigndocumentGetEzsignsignaturesV1ResponseMPayload.md)
 - [EzsigndocumentGetFormDataV1Response](docs/EzsigndocumentGetFormDataV1Response.md)
 - [EzsigndocumentGetFormDataV1ResponseMPayload](docs/EzsigndocumentGetFormDataV1ResponseMPayload.md)
 - [EzsigndocumentGetObjectV1Response](docs/EzsigndocumentGetObjectV1Response.md)
 - [EzsigndocumentGetObjectV1ResponseMPayload](docs/EzsigndocumentGetObjectV1ResponseMPayload.md)
 - [EzsigndocumentGetObjectV2Response](docs/EzsigndocumentGetObjectV2Response.md)
 - [EzsigndocumentGetObjectV2ResponseMPayload](docs/EzsigndocumentGetObjectV2ResponseMPayload.md)
 - [EzsigndocumentGetTemporaryProofV1Response](docs/EzsigndocumentGetTemporaryProofV1Response.md)
 - [EzsigndocumentGetTemporaryProofV1ResponseMPayload](docs/EzsigndocumentGetTemporaryProofV1ResponseMPayload.md)
 - [EzsigndocumentGetWordsPositionsV1Request](docs/EzsigndocumentGetWordsPositionsV1Request.md)
 - [EzsigndocumentGetWordsPositionsV1Response](docs/EzsigndocumentGetWordsPositionsV1Response.md)
 - [EzsigndocumentMatchingtemplateV3Response](docs/EzsigndocumentMatchingtemplateV3Response.md)
 - [EzsigndocumentPatchObjectV1Request](docs/EzsigndocumentPatchObjectV1Request.md)
 - [EzsigndocumentPatchObjectV1Response](docs/EzsigndocumentPatchObjectV1Response.md)
 - [EzsigndocumentRequest](docs/EzsigndocumentRequest.md)
 - [EzsigndocumentRequestCompound](docs/EzsigndocumentRequestCompound.md)
 - [EzsigndocumentRequestPatch](docs/EzsigndocumentRequestPatch.md)
 - [EzsigndocumentResponse](docs/EzsigndocumentResponse.md)
 - [EzsigndocumentResponseCompound](docs/EzsigndocumentResponseCompound.md)
 - [EzsigndocumentSubmitEzsignformV1Request](docs/EzsigndocumentSubmitEzsignformV1Request.md)
 - [EzsigndocumentSubmitEzsignformV1Response](docs/EzsigndocumentSubmitEzsignformV1Response.md)
 - [EzsigndocumentUnsendV1Response](docs/EzsigndocumentUnsendV1Response.md)
 - [EzsigndocumentdependencyRequest](docs/EzsigndocumentdependencyRequest.md)
 - [EzsigndocumentdependencyRequestCompound](docs/EzsigndocumentdependencyRequestCompound.md)
 - [EzsigndocumentdependencyResponse](docs/EzsigndocumentdependencyResponse.md)
 - [EzsigndocumentlogResponse](docs/EzsigndocumentlogResponse.md)
 - [EzsigndocumentlogResponseCompound](docs/EzsigndocumentlogResponseCompound.md)
 - [EzsignelementdependencyRequest](docs/EzsignelementdependencyRequest.md)
 - [EzsignelementdependencyRequestCompound](docs/EzsignelementdependencyRequestCompound.md)
 - [EzsignelementdependencyResponse](docs/EzsignelementdependencyResponse.md)
 - [EzsignelementdependencyResponseCompound](docs/EzsignelementdependencyResponseCompound.md)
 - [EzsignfolderArchiveV1Response](docs/EzsignfolderArchiveV1Response.md)
 - [EzsignfolderBatchDownloadV1Request](docs/EzsignfolderBatchDownloadV1Request.md)
 - [EzsignfolderCreateObjectV1Request](docs/EzsignfolderCreateObjectV1Request.md)
 - [EzsignfolderCreateObjectV1Response](docs/EzsignfolderCreateObjectV1Response.md)
 - [EzsignfolderCreateObjectV1ResponseMPayload](docs/EzsignfolderCreateObjectV1ResponseMPayload.md)
 - [EzsignfolderCreateObjectV2Request](docs/EzsignfolderCreateObjectV2Request.md)
 - [EzsignfolderCreateObjectV2Response](docs/EzsignfolderCreateObjectV2Response.md)
 - [EzsignfolderCreateObjectV2ResponseMPayload](docs/EzsignfolderCreateObjectV2ResponseMPayload.md)
 - [EzsignfolderCreateObjectV3Request](docs/EzsignfolderCreateObjectV3Request.md)
 - [EzsignfolderCreateObjectV3Response](docs/EzsignfolderCreateObjectV3Response.md)
 - [EzsignfolderCreateObjectV3ResponseMPayload](docs/EzsignfolderCreateObjectV3ResponseMPayload.md)
 - [EzsignfolderDeleteObjectV1Response](docs/EzsignfolderDeleteObjectV1Response.md)
 - [EzsignfolderDisposeEzsignfoldersV1Request](docs/EzsignfolderDisposeEzsignfoldersV1Request.md)
 - [EzsignfolderDisposeEzsignfoldersV1Response](docs/EzsignfolderDisposeEzsignfoldersV1Response.md)
 - [EzsignfolderDisposeV1Response](docs/EzsignfolderDisposeV1Response.md)
 - [EzsignfolderEditObjectV3Request](docs/EzsignfolderEditObjectV3Request.md)
 - [EzsignfolderEditObjectV3Response](docs/EzsignfolderEditObjectV3Response.md)
 - [EzsignfolderEndPrematurelyV1Response](docs/EzsignfolderEndPrematurelyV1Response.md)
 - [EzsignfolderGetActionableElementsV1Response](docs/EzsignfolderGetActionableElementsV1Response.md)
 - [EzsignfolderGetActionableElementsV1ResponseMPayload](docs/EzsignfolderGetActionableElementsV1ResponseMPayload.md)
 - [EzsignfolderGetAttachmentCountV1Response](docs/EzsignfolderGetAttachmentCountV1Response.md)
 - [EzsignfolderGetAttachmentCountV1ResponseMPayload](docs/EzsignfolderGetAttachmentCountV1ResponseMPayload.md)
 - [EzsignfolderGetAttachmentsV1Response](docs/EzsignfolderGetAttachmentsV1Response.md)
 - [EzsignfolderGetAttachmentsV1ResponseMPayload](docs/EzsignfolderGetAttachmentsV1ResponseMPayload.md)
 - [EzsignfolderGetCommunicationCountV1Response](docs/EzsignfolderGetCommunicationCountV1Response.md)
 - [EzsignfolderGetCommunicationCountV1ResponseMPayload](docs/EzsignfolderGetCommunicationCountV1ResponseMPayload.md)
 - [EzsignfolderGetCommunicationListV1Response](docs/EzsignfolderGetCommunicationListV1Response.md)
 - [EzsignfolderGetCommunicationListV1ResponseMPayload](docs/EzsignfolderGetCommunicationListV1ResponseMPayload.md)
 - [EzsignfolderGetCommunicationrecipientsV1Response](docs/EzsignfolderGetCommunicationrecipientsV1Response.md)
 - [EzsignfolderGetCommunicationrecipientsV1ResponseMPayload](docs/EzsignfolderGetCommunicationrecipientsV1ResponseMPayload.md)
 - [EzsignfolderGetCommunicationsendersV1Response](docs/EzsignfolderGetCommunicationsendersV1Response.md)
 - [EzsignfolderGetCommunicationsendersV1ResponseMPayload](docs/EzsignfolderGetCommunicationsendersV1ResponseMPayload.md)
 - [EzsignfolderGetEzsigndocumentsV1Response](docs/EzsignfolderGetEzsigndocumentsV1Response.md)
 - [EzsignfolderGetEzsigndocumentsV1ResponseMPayload](docs/EzsignfolderGetEzsigndocumentsV1ResponseMPayload.md)
 - [EzsignfolderGetEzsignfoldersignerassociationsV1Response](docs/EzsignfolderGetEzsignfoldersignerassociationsV1Response.md)
 - [EzsignfolderGetEzsignfoldersignerassociationsV1ResponseMPayload](docs/EzsignfolderGetEzsignfoldersignerassociationsV1ResponseMPayload.md)
 - [EzsignfolderGetEzsignsignaturesAutomaticV1Response](docs/EzsignfolderGetEzsignsignaturesAutomaticV1Response.md)
 - [EzsignfolderGetEzsignsignaturesAutomaticV1ResponseMPayload](docs/EzsignfolderGetEzsignsignaturesAutomaticV1ResponseMPayload.md)
 - [EzsignfolderGetFormsDataV1Response](docs/EzsignfolderGetFormsDataV1Response.md)
 - [EzsignfolderGetFormsDataV1ResponseMPayload](docs/EzsignfolderGetFormsDataV1ResponseMPayload.md)
 - [EzsignfolderGetListV1Response](docs/EzsignfolderGetListV1Response.md)
 - [EzsignfolderGetListV1ResponseMPayload](docs/EzsignfolderGetListV1ResponseMPayload.md)
 - [EzsignfolderGetObjectV1Response](docs/EzsignfolderGetObjectV1Response.md)
 - [EzsignfolderGetObjectV1ResponseMPayload](docs/EzsignfolderGetObjectV1ResponseMPayload.md)
 - [EzsignfolderGetObjectV2Response](docs/EzsignfolderGetObjectV2Response.md)
 - [EzsignfolderGetObjectV2ResponseMPayload](docs/EzsignfolderGetObjectV2ResponseMPayload.md)
 - [EzsignfolderGetObjectV3Response](docs/EzsignfolderGetObjectV3Response.md)
 - [EzsignfolderGetObjectV3ResponseMPayload](docs/EzsignfolderGetObjectV3ResponseMPayload.md)
 - [EzsignfolderImportEzsignfoldersignerassociationsV1Request](docs/EzsignfolderImportEzsignfoldersignerassociationsV1Request.md)
 - [EzsignfolderImportEzsignfoldersignerassociationsV1Response](docs/EzsignfolderImportEzsignfoldersignerassociationsV1Response.md)
 - [EzsignfolderImportEzsignfoldersignerassociationsV1ResponseMPayload](docs/EzsignfolderImportEzsignfoldersignerassociationsV1ResponseMPayload.md)
 - [EzsignfolderImportEzsigntemplatepackageV1Request](docs/EzsignfolderImportEzsigntemplatepackageV1Request.md)
 - [EzsignfolderImportEzsigntemplatepackageV1Response](docs/EzsignfolderImportEzsigntemplatepackageV1Response.md)
 - [EzsignfolderImportEzsigntemplatepackageV1ResponseMPayload](docs/EzsignfolderImportEzsigntemplatepackageV1ResponseMPayload.md)
 - [EzsignfolderListElement](docs/EzsignfolderListElement.md)
 - [EzsignfolderReorderV1Request](docs/EzsignfolderReorderV1Request.md)
 - [EzsignfolderReorderV1Response](docs/EzsignfolderReorderV1Response.md)
 - [EzsignfolderReorderV2Request](docs/EzsignfolderReorderV2Request.md)
 - [EzsignfolderReorderV2Response](docs/EzsignfolderReorderV2Response.md)
 - [EzsignfolderRequest](docs/EzsignfolderRequest.md)
 - [EzsignfolderRequestCompound](docs/EzsignfolderRequestCompound.md)
 - [EzsignfolderRequestCompoundV3](docs/EzsignfolderRequestCompoundV3.md)
 - [EzsignfolderRequestV3](docs/EzsignfolderRequestV3.md)
 - [EzsignfolderResponse](docs/EzsignfolderResponse.md)
 - [EzsignfolderResponseCompound](docs/EzsignfolderResponseCompound.md)
 - [EzsignfolderResponseCompoundV3](docs/EzsignfolderResponseCompoundV3.md)
 - [EzsignfolderResponseV3](docs/EzsignfolderResponseV3.md)
 - [EzsignfolderSendV1Request](docs/EzsignfolderSendV1Request.md)
 - [EzsignfolderSendV1Response](docs/EzsignfolderSendV1Response.md)
 - [EzsignfolderSendV3Request](docs/EzsignfolderSendV3Request.md)
 - [EzsignfolderSendV3Response](docs/EzsignfolderSendV3Response.md)
 - [EzsignfolderUnsendV1Response](docs/EzsignfolderUnsendV1Response.md)
 - [EzsignfoldersignerassociationCreateEmbeddedUrlV1Request](docs/EzsignfoldersignerassociationCreateEmbeddedUrlV1Request.md)
 - [EzsignfoldersignerassociationCreateEmbeddedUrlV1Response](docs/EzsignfoldersignerassociationCreateEmbeddedUrlV1Response.md)
 - [EzsignfoldersignerassociationCreateEmbeddedUrlV1ResponseMPayload](docs/EzsignfoldersignerassociationCreateEmbeddedUrlV1ResponseMPayload.md)
 - [EzsignfoldersignerassociationCreateObjectV1Request](docs/EzsignfoldersignerassociationCreateObjectV1Request.md)
 - [EzsignfoldersignerassociationCreateObjectV1Response](docs/EzsignfoldersignerassociationCreateObjectV1Response.md)
 - [EzsignfoldersignerassociationCreateObjectV1ResponseMPayload](docs/EzsignfoldersignerassociationCreateObjectV1ResponseMPayload.md)
 - [EzsignfoldersignerassociationCreateObjectV2Request](docs/EzsignfoldersignerassociationCreateObjectV2Request.md)
 - [EzsignfoldersignerassociationCreateObjectV2Response](docs/EzsignfoldersignerassociationCreateObjectV2Response.md)
 - [EzsignfoldersignerassociationCreateObjectV2ResponseMPayload](docs/EzsignfoldersignerassociationCreateObjectV2ResponseMPayload.md)
 - [EzsignfoldersignerassociationDeleteObjectV1Response](docs/EzsignfoldersignerassociationDeleteObjectV1Response.md)
 - [EzsignfoldersignerassociationEditObjectV1Request](docs/EzsignfoldersignerassociationEditObjectV1Request.md)
 - [EzsignfoldersignerassociationEditObjectV1Response](docs/EzsignfoldersignerassociationEditObjectV1Response.md)
 - [EzsignfoldersignerassociationForceDisconnectV1Response](docs/EzsignfoldersignerassociationForceDisconnectV1Response.md)
 - [EzsignfoldersignerassociationGetInPersonLoginUrlV1Response](docs/EzsignfoldersignerassociationGetInPersonLoginUrlV1Response.md)
 - [EzsignfoldersignerassociationGetInPersonLoginUrlV1ResponseMPayload](docs/EzsignfoldersignerassociationGetInPersonLoginUrlV1ResponseMPayload.md)
 - [EzsignfoldersignerassociationGetObjectV1Response](docs/EzsignfoldersignerassociationGetObjectV1Response.md)
 - [EzsignfoldersignerassociationGetObjectV1ResponseMPayload](docs/EzsignfoldersignerassociationGetObjectV1ResponseMPayload.md)
 - [EzsignfoldersignerassociationGetObjectV2Response](docs/EzsignfoldersignerassociationGetObjectV2Response.md)
 - [EzsignfoldersignerassociationGetObjectV2ResponseMPayload](docs/EzsignfoldersignerassociationGetObjectV2ResponseMPayload.md)
 - [EzsignfoldersignerassociationPatchObjectV1Request](docs/EzsignfoldersignerassociationPatchObjectV1Request.md)
 - [EzsignfoldersignerassociationPatchObjectV1Response](docs/EzsignfoldersignerassociationPatchObjectV1Response.md)
 - [EzsignfoldersignerassociationReassignV1Request](docs/EzsignfoldersignerassociationReassignV1Request.md)
 - [EzsignfoldersignerassociationReassignV1Response](docs/EzsignfoldersignerassociationReassignV1Response.md)
 - [EzsignfoldersignerassociationRequest](docs/EzsignfoldersignerassociationRequest.md)
 - [EzsignfoldersignerassociationRequestCompound](docs/EzsignfoldersignerassociationRequestCompound.md)
 - [EzsignfoldersignerassociationRequestPatch](docs/EzsignfoldersignerassociationRequestPatch.md)
 - [EzsignfoldersignerassociationResponse](docs/EzsignfoldersignerassociationResponse.md)
 - [EzsignfoldersignerassociationResponseCompound](docs/EzsignfoldersignerassociationResponseCompound.md)
 - [EzsignfoldersignerassociationResponseCompoundUser](docs/EzsignfoldersignerassociationResponseCompoundUser.md)
 - [EzsignfoldertypeAutocompleteElementResponse](docs/EzsignfoldertypeAutocompleteElementResponse.md)
 - [EzsignfoldertypeCreateObjectV3Request](docs/EzsignfoldertypeCreateObjectV3Request.md)
 - [EzsignfoldertypeCreateObjectV3Response](docs/EzsignfoldertypeCreateObjectV3Response.md)
 - [EzsignfoldertypeCreateObjectV3ResponseMPayload](docs/EzsignfoldertypeCreateObjectV3ResponseMPayload.md)
 - [EzsignfoldertypeEditObjectV3Request](docs/EzsignfoldertypeEditObjectV3Request.md)
 - [EzsignfoldertypeEditObjectV3Response](docs/EzsignfoldertypeEditObjectV3Response.md)
 - [EzsignfoldertypeGetAutocompleteV2Response](docs/EzsignfoldertypeGetAutocompleteV2Response.md)
 - [EzsignfoldertypeGetAutocompleteV2ResponseMPayload](docs/EzsignfoldertypeGetAutocompleteV2ResponseMPayload.md)
 - [EzsignfoldertypeGetListV1Response](docs/EzsignfoldertypeGetListV1Response.md)
 - [EzsignfoldertypeGetListV1ResponseMPayload](docs/EzsignfoldertypeGetListV1ResponseMPayload.md)
 - [EzsignfoldertypeGetObjectV2Response](docs/EzsignfoldertypeGetObjectV2Response.md)
 - [EzsignfoldertypeGetObjectV2ResponseMPayload](docs/EzsignfoldertypeGetObjectV2ResponseMPayload.md)
 - [EzsignfoldertypeGetObjectV4Response](docs/EzsignfoldertypeGetObjectV4Response.md)
 - [EzsignfoldertypeGetObjectV4ResponseMPayload](docs/EzsignfoldertypeGetObjectV4ResponseMPayload.md)
 - [EzsignfoldertypeListElement](docs/EzsignfoldertypeListElement.md)
 - [EzsignfoldertypeRequestCompoundV3](docs/EzsignfoldertypeRequestCompoundV3.md)
 - [EzsignfoldertypeRequestV3](docs/EzsignfoldertypeRequestV3.md)
 - [EzsignfoldertypeResponse](docs/EzsignfoldertypeResponse.md)
 - [EzsignfoldertypeResponseCompound](docs/EzsignfoldertypeResponseCompound.md)
 - [EzsignfoldertypeResponseCompoundV4](docs/EzsignfoldertypeResponseCompoundV4.md)
 - [EzsignfoldertypeResponseV4](docs/EzsignfoldertypeResponseV4.md)
 - [EzsignformfieldRequest](docs/EzsignformfieldRequest.md)
 - [EzsignformfieldRequestCompound](docs/EzsignformfieldRequestCompound.md)
 - [EzsignformfieldResponse](docs/EzsignformfieldResponse.md)
 - [EzsignformfieldResponseCompound](docs/EzsignformfieldResponseCompound.md)
 - [EzsignformfieldgroupCreateObjectV1Request](docs/EzsignformfieldgroupCreateObjectV1Request.md)
 - [EzsignformfieldgroupCreateObjectV1Response](docs/EzsignformfieldgroupCreateObjectV1Response.md)
 - [EzsignformfieldgroupCreateObjectV1ResponseMPayload](docs/EzsignformfieldgroupCreateObjectV1ResponseMPayload.md)
 - [EzsignformfieldgroupDeleteObjectV1Response](docs/EzsignformfieldgroupDeleteObjectV1Response.md)
 - [EzsignformfieldgroupEditObjectV1Request](docs/EzsignformfieldgroupEditObjectV1Request.md)
 - [EzsignformfieldgroupEditObjectV1Response](docs/EzsignformfieldgroupEditObjectV1Response.md)
 - [EzsignformfieldgroupGetObjectV2Response](docs/EzsignformfieldgroupGetObjectV2Response.md)
 - [EzsignformfieldgroupGetObjectV2ResponseMPayload](docs/EzsignformfieldgroupGetObjectV2ResponseMPayload.md)
 - [EzsignformfieldgroupRequest](docs/EzsignformfieldgroupRequest.md)
 - [EzsignformfieldgroupRequestCompound](docs/EzsignformfieldgroupRequestCompound.md)
 - [EzsignformfieldgroupResponse](docs/EzsignformfieldgroupResponse.md)
 - [EzsignformfieldgroupResponseCompound](docs/EzsignformfieldgroupResponseCompound.md)
 - [EzsignformfieldgroupsignerRequest](docs/EzsignformfieldgroupsignerRequest.md)
 - [EzsignformfieldgroupsignerRequestCompound](docs/EzsignformfieldgroupsignerRequestCompound.md)
 - [EzsignformfieldgroupsignerResponse](docs/EzsignformfieldgroupsignerResponse.md)
 - [EzsignformfieldgroupsignerResponseCompound](docs/EzsignformfieldgroupsignerResponseCompound.md)
 - [EzsignpageConsultV1Response](docs/EzsignpageConsultV1Response.md)
 - [EzsignpageResponse](docs/EzsignpageResponse.md)
 - [EzsignpageResponseCompound](docs/EzsignpageResponseCompound.md)
 - [EzsignsignatureCreateObjectV1Request](docs/EzsignsignatureCreateObjectV1Request.md)
 - [EzsignsignatureCreateObjectV1Response](docs/EzsignsignatureCreateObjectV1Response.md)
 - [EzsignsignatureCreateObjectV1ResponseMPayload](docs/EzsignsignatureCreateObjectV1ResponseMPayload.md)
 - [EzsignsignatureCreateObjectV2Request](docs/EzsignsignatureCreateObjectV2Request.md)
 - [EzsignsignatureCreateObjectV2Response](docs/EzsignsignatureCreateObjectV2Response.md)
 - [EzsignsignatureCreateObjectV2ResponseMPayload](docs/EzsignsignatureCreateObjectV2ResponseMPayload.md)
 - [EzsignsignatureCreateObjectV3Request](docs/EzsignsignatureCreateObjectV3Request.md)
 - [EzsignsignatureCreateObjectV3Response](docs/EzsignsignatureCreateObjectV3Response.md)
 - [EzsignsignatureCreateObjectV3ResponseMPayload](docs/EzsignsignatureCreateObjectV3ResponseMPayload.md)
 - [EzsignsignatureDeleteObjectV1Response](docs/EzsignsignatureDeleteObjectV1Response.md)
 - [EzsignsignatureEditObjectV2Request](docs/EzsignsignatureEditObjectV2Request.md)
 - [EzsignsignatureEditObjectV2Response](docs/EzsignsignatureEditObjectV2Response.md)
 - [EzsignsignatureGetEzsignsignatureattachmentV1Response](docs/EzsignsignatureGetEzsignsignatureattachmentV1Response.md)
 - [EzsignsignatureGetEzsignsignatureattachmentV1ResponseMPayload](docs/EzsignsignatureGetEzsignsignatureattachmentV1ResponseMPayload.md)
 - [EzsignsignatureGetEzsignsignaturesAutomaticV1Response](docs/EzsignsignatureGetEzsignsignaturesAutomaticV1Response.md)
 - [EzsignsignatureGetEzsignsignaturesAutomaticV1ResponseMPayload](docs/EzsignsignatureGetEzsignsignaturesAutomaticV1ResponseMPayload.md)
 - [EzsignsignatureGetObjectV3Response](docs/EzsignsignatureGetObjectV3Response.md)
 - [EzsignsignatureGetObjectV3ResponseMPayload](docs/EzsignsignatureGetObjectV3ResponseMPayload.md)
 - [EzsignsignatureRequest](docs/EzsignsignatureRequest.md)
 - [EzsignsignatureRequestCompound](docs/EzsignsignatureRequestCompound.md)
 - [EzsignsignatureRequestCompoundV2](docs/EzsignsignatureRequestCompoundV2.md)
 - [EzsignsignatureResponse](docs/EzsignsignatureResponse.md)
 - [EzsignsignatureResponseCompound](docs/EzsignsignatureResponseCompound.md)
 - [EzsignsignatureResponseCompoundV3](docs/EzsignsignatureResponseCompoundV3.md)
 - [EzsignsignatureSignV1Request](docs/EzsignsignatureSignV1Request.md)
 - [EzsignsignatureSignV1Response](docs/EzsignsignatureSignV1Response.md)
 - [EzsignsignatureSignV1ResponseMPayload](docs/EzsignsignatureSignV1ResponseMPayload.md)
 - [EzsignsignatureattachmentResponse](docs/EzsignsignatureattachmentResponse.md)
 - [EzsignsignaturecustomdateRequest](docs/EzsignsignaturecustomdateRequest.md)
 - [EzsignsignaturecustomdateRequestCompound](docs/EzsignsignaturecustomdateRequestCompound.md)
 - [EzsignsignaturecustomdateRequestCompoundV2](docs/EzsignsignaturecustomdateRequestCompoundV2.md)
 - [EzsignsignaturecustomdateRequestV2](docs/EzsignsignaturecustomdateRequestV2.md)
 - [EzsignsignaturecustomdateResponse](docs/EzsignsignaturecustomdateResponse.md)
 - [EzsignsignaturecustomdateResponseCompound](docs/EzsignsignaturecustomdateResponseCompound.md)
 - [EzsignsignaturecustomdateResponseCompoundV2](docs/EzsignsignaturecustomdateResponseCompoundV2.md)
 - [EzsignsignaturecustomdateResponseV2](docs/EzsignsignaturecustomdateResponseV2.md)
 - [EzsignsignerRequest](docs/EzsignsignerRequest.md)
 - [EzsignsignerRequestCompound](docs/EzsignsignerRequestCompound.md)
 - [EzsignsignerRequestCompoundContact](docs/EzsignsignerRequestCompoundContact.md)
 - [EzsignsignerResponse](docs/EzsignsignerResponse.md)
 - [EzsignsignerResponseCompound](docs/EzsignsignerResponseCompound.md)
 - [EzsignsignerResponseCompoundContact](docs/EzsignsignerResponseCompoundContact.md)
 - [EzsignsignergroupCreateObjectV1Request](docs/EzsignsignergroupCreateObjectV1Request.md)
 - [EzsignsignergroupCreateObjectV1Response](docs/EzsignsignergroupCreateObjectV1Response.md)
 - [EzsignsignergroupCreateObjectV1ResponseMPayload](docs/EzsignsignergroupCreateObjectV1ResponseMPayload.md)
 - [EzsignsignergroupDeleteObjectV1Response](docs/EzsignsignergroupDeleteObjectV1Response.md)
 - [EzsignsignergroupEditEzsignsignergroupmembershipsV1Request](docs/EzsignsignergroupEditEzsignsignergroupmembershipsV1Request.md)
 - [EzsignsignergroupEditEzsignsignergroupmembershipsV1Response](docs/EzsignsignergroupEditEzsignsignergroupmembershipsV1Response.md)
 - [EzsignsignergroupEditEzsignsignergroupmembershipsV1ResponseMPayload](docs/EzsignsignergroupEditEzsignsignergroupmembershipsV1ResponseMPayload.md)
 - [EzsignsignergroupEditObjectV1Request](docs/EzsignsignergroupEditObjectV1Request.md)
 - [EzsignsignergroupEditObjectV1Response](docs/EzsignsignergroupEditObjectV1Response.md)
 - [EzsignsignergroupGetEzsignsignergroupmembershipsV1Response](docs/EzsignsignergroupGetEzsignsignergroupmembershipsV1Response.md)
 - [EzsignsignergroupGetEzsignsignergroupmembershipsV1ResponseMPayload](docs/EzsignsignergroupGetEzsignsignergroupmembershipsV1ResponseMPayload.md)
 - [EzsignsignergroupGetObjectV2Response](docs/EzsignsignergroupGetObjectV2Response.md)
 - [EzsignsignergroupGetObjectV2ResponseMPayload](docs/EzsignsignergroupGetObjectV2ResponseMPayload.md)
 - [EzsignsignergroupRequest](docs/EzsignsignergroupRequest.md)
 - [EzsignsignergroupRequestCompound](docs/EzsignsignergroupRequestCompound.md)
 - [EzsignsignergroupResponse](docs/EzsignsignergroupResponse.md)
 - [EzsignsignergroupResponseCompound](docs/EzsignsignergroupResponseCompound.md)
 - [EzsignsignergroupmembershipCreateObjectV1Request](docs/EzsignsignergroupmembershipCreateObjectV1Request.md)
 - [EzsignsignergroupmembershipCreateObjectV1Response](docs/EzsignsignergroupmembershipCreateObjectV1Response.md)
 - [EzsignsignergroupmembershipCreateObjectV1ResponseMPayload](docs/EzsignsignergroupmembershipCreateObjectV1ResponseMPayload.md)
 - [EzsignsignergroupmembershipDeleteObjectV1Response](docs/EzsignsignergroupmembershipDeleteObjectV1Response.md)
 - [EzsignsignergroupmembershipGetObjectV2Response](docs/EzsignsignergroupmembershipGetObjectV2Response.md)
 - [EzsignsignergroupmembershipGetObjectV2ResponseMPayload](docs/EzsignsignergroupmembershipGetObjectV2ResponseMPayload.md)
 - [EzsignsignergroupmembershipRequest](docs/EzsignsignergroupmembershipRequest.md)
 - [EzsignsignergroupmembershipRequestCompound](docs/EzsignsignergroupmembershipRequestCompound.md)
 - [EzsignsignergroupmembershipResponse](docs/EzsignsignergroupmembershipResponse.md)
 - [EzsignsignergroupmembershipResponseCompound](docs/EzsignsignergroupmembershipResponseCompound.md)
 - [EzsignsigningreasonAutocompleteElementResponse](docs/EzsignsigningreasonAutocompleteElementResponse.md)
 - [EzsignsigningreasonCreateObjectV1Request](docs/EzsignsigningreasonCreateObjectV1Request.md)
 - [EzsignsigningreasonCreateObjectV1Response](docs/EzsignsigningreasonCreateObjectV1Response.md)
 - [EzsignsigningreasonCreateObjectV1ResponseMPayload](docs/EzsignsigningreasonCreateObjectV1ResponseMPayload.md)
 - [EzsignsigningreasonEditObjectV1Request](docs/EzsignsigningreasonEditObjectV1Request.md)
 - [EzsignsigningreasonEditObjectV1Response](docs/EzsignsigningreasonEditObjectV1Response.md)
 - [EzsignsigningreasonGetAutocompleteV2Response](docs/EzsignsigningreasonGetAutocompleteV2Response.md)
 - [EzsignsigningreasonGetAutocompleteV2ResponseMPayload](docs/EzsignsigningreasonGetAutocompleteV2ResponseMPayload.md)
 - [EzsignsigningreasonGetListV1Response](docs/EzsignsigningreasonGetListV1Response.md)
 - [EzsignsigningreasonGetListV1ResponseMPayload](docs/EzsignsigningreasonGetListV1ResponseMPayload.md)
 - [EzsignsigningreasonGetObjectV2Response](docs/EzsignsigningreasonGetObjectV2Response.md)
 - [EzsignsigningreasonGetObjectV2ResponseMPayload](docs/EzsignsigningreasonGetObjectV2ResponseMPayload.md)
 - [EzsignsigningreasonListElement](docs/EzsignsigningreasonListElement.md)
 - [EzsignsigningreasonRequest](docs/EzsignsigningreasonRequest.md)
 - [EzsignsigningreasonRequestCompound](docs/EzsignsigningreasonRequestCompound.md)
 - [EzsignsigningreasonResponse](docs/EzsignsigningreasonResponse.md)
 - [EzsignsigningreasonResponseCompound](docs/EzsignsigningreasonResponseCompound.md)
 - [EzsigntemplateAutocompleteElementResponse](docs/EzsigntemplateAutocompleteElementResponse.md)
 - [EzsigntemplateCopyV1Request](docs/EzsigntemplateCopyV1Request.md)
 - [EzsigntemplateCopyV1Response](docs/EzsigntemplateCopyV1Response.md)
 - [EzsigntemplateCopyV1ResponseMPayload](docs/EzsigntemplateCopyV1ResponseMPayload.md)
 - [EzsigntemplateCreateObjectV3Request](docs/EzsigntemplateCreateObjectV3Request.md)
 - [EzsigntemplateCreateObjectV3Response](docs/EzsigntemplateCreateObjectV3Response.md)
 - [EzsigntemplateCreateObjectV3ResponseMPayload](docs/EzsigntemplateCreateObjectV3ResponseMPayload.md)
 - [EzsigntemplateDeleteObjectV1Response](docs/EzsigntemplateDeleteObjectV1Response.md)
 - [EzsigntemplateEditObjectV3Request](docs/EzsigntemplateEditObjectV3Request.md)
 - [EzsigntemplateEditObjectV3Response](docs/EzsigntemplateEditObjectV3Response.md)
 - [EzsigntemplateGetAutocompleteV2Response](docs/EzsigntemplateGetAutocompleteV2Response.md)
 - [EzsigntemplateGetAutocompleteV2ResponseMPayload](docs/EzsigntemplateGetAutocompleteV2ResponseMPayload.md)
 - [EzsigntemplateGetListV1Response](docs/EzsigntemplateGetListV1Response.md)
 - [EzsigntemplateGetListV1ResponseMPayload](docs/EzsigntemplateGetListV1ResponseMPayload.md)
 - [EzsigntemplateGetObjectV3Response](docs/EzsigntemplateGetObjectV3Response.md)
 - [EzsigntemplateGetObjectV3ResponseMPayload](docs/EzsigntemplateGetObjectV3ResponseMPayload.md)
 - [EzsigntemplateListElement](docs/EzsigntemplateListElement.md)
 - [EzsigntemplateRequestCompoundV3](docs/EzsigntemplateRequestCompoundV3.md)
 - [EzsigntemplateRequestV3](docs/EzsigntemplateRequestV3.md)
 - [EzsigntemplateResponse](docs/EzsigntemplateResponse.md)
 - [EzsigntemplateResponseCompound](docs/EzsigntemplateResponseCompound.md)
 - [EzsigntemplateResponseCompoundV3](docs/EzsigntemplateResponseCompoundV3.md)
 - [EzsigntemplateResponseV3](docs/EzsigntemplateResponseV3.md)
 - [EzsigntemplatedocumentCreateObjectV1Request](docs/EzsigntemplatedocumentCreateObjectV1Request.md)
 - [EzsigntemplatedocumentCreateObjectV1Response](docs/EzsigntemplatedocumentCreateObjectV1Response.md)
 - [EzsigntemplatedocumentCreateObjectV1ResponseMPayload](docs/EzsigntemplatedocumentCreateObjectV1ResponseMPayload.md)
 - [EzsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1Request](docs/EzsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1Request.md)
 - [EzsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1Response](docs/EzsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1Response.md)
 - [EzsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1ResponseMPayload](docs/EzsigntemplatedocumentEditEzsigntemplatedocumentpagerecognitionsV1ResponseMPayload.md)
 - [EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Request](docs/EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Request.md)
 - [EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Response](docs/EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1Response.md)
 - [EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1ResponseMPayload](docs/EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1ResponseMPayload.md)
 - [EzsigntemplatedocumentEditEzsigntemplatesignaturesV1Request](docs/EzsigntemplatedocumentEditEzsigntemplatesignaturesV1Request.md)
 - [EzsigntemplatedocumentEditEzsigntemplatesignaturesV1Response](docs/EzsigntemplatedocumentEditEzsigntemplatesignaturesV1Response.md)
 - [EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload](docs/EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseMPayload.md)
 - [EzsigntemplatedocumentEditObjectV1Request](docs/EzsigntemplatedocumentEditObjectV1Request.md)
 - [EzsigntemplatedocumentEditObjectV1Response](docs/EzsigntemplatedocumentEditObjectV1Response.md)
 - [EzsigntemplatedocumentExtractTextV1Request](docs/EzsigntemplatedocumentExtractTextV1Request.md)
 - [EzsigntemplatedocumentExtractTextV1Response](docs/EzsigntemplatedocumentExtractTextV1Response.md)
 - [EzsigntemplatedocumentExtractTextV1ResponseMPayload](docs/EzsigntemplatedocumentExtractTextV1ResponseMPayload.md)
 - [EzsigntemplatedocumentFlattenV1Response](docs/EzsigntemplatedocumentFlattenV1Response.md)
 - [EzsigntemplatedocumentGetEzsigntemplatedocumentpagerecognitionsV1Response](docs/EzsigntemplatedocumentGetEzsigntemplatedocumentpagerecognitionsV1Response.md)
 - [EzsigntemplatedocumentGetEzsigntemplatedocumentpagerecognitionsV1ResponseMPayload](docs/EzsigntemplatedocumentGetEzsigntemplatedocumentpagerecognitionsV1ResponseMPayload.md)
 - [EzsigntemplatedocumentGetEzsigntemplatedocumentpagesV1Response](docs/EzsigntemplatedocumentGetEzsigntemplatedocumentpagesV1Response.md)
 - [EzsigntemplatedocumentGetEzsigntemplatedocumentpagesV1ResponseMPayload](docs/EzsigntemplatedocumentGetEzsigntemplatedocumentpagesV1ResponseMPayload.md)
 - [EzsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1Response](docs/EzsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1Response.md)
 - [EzsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1ResponseMPayload](docs/EzsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1ResponseMPayload.md)
 - [EzsigntemplatedocumentGetEzsigntemplatesignaturesV1Response](docs/EzsigntemplatedocumentGetEzsigntemplatesignaturesV1Response.md)
 - [EzsigntemplatedocumentGetEzsigntemplatesignaturesV1ResponseMPayload](docs/EzsigntemplatedocumentGetEzsigntemplatesignaturesV1ResponseMPayload.md)
 - [EzsigntemplatedocumentGetObjectV2Response](docs/EzsigntemplatedocumentGetObjectV2Response.md)
 - [EzsigntemplatedocumentGetObjectV2ResponseMPayload](docs/EzsigntemplatedocumentGetObjectV2ResponseMPayload.md)
 - [EzsigntemplatedocumentGetWordsPositionsV1Request](docs/EzsigntemplatedocumentGetWordsPositionsV1Request.md)
 - [EzsigntemplatedocumentGetWordsPositionsV1Response](docs/EzsigntemplatedocumentGetWordsPositionsV1Response.md)
 - [EzsigntemplatedocumentPatchObjectV1Request](docs/EzsigntemplatedocumentPatchObjectV1Request.md)
 - [EzsigntemplatedocumentPatchObjectV1Response](docs/EzsigntemplatedocumentPatchObjectV1Response.md)
 - [EzsigntemplatedocumentRequest](docs/EzsigntemplatedocumentRequest.md)
 - [EzsigntemplatedocumentRequestCompound](docs/EzsigntemplatedocumentRequestCompound.md)
 - [EzsigntemplatedocumentRequestPatch](docs/EzsigntemplatedocumentRequestPatch.md)
 - [EzsigntemplatedocumentResponse](docs/EzsigntemplatedocumentResponse.md)
 - [EzsigntemplatedocumentResponseCompound](docs/EzsigntemplatedocumentResponseCompound.md)
 - [EzsigntemplatedocumentpageResponse](docs/EzsigntemplatedocumentpageResponse.md)
 - [EzsigntemplatedocumentpageResponseCompound](docs/EzsigntemplatedocumentpageResponseCompound.md)
 - [EzsigntemplatedocumentpagerecognitionCreateObjectV1Request](docs/EzsigntemplatedocumentpagerecognitionCreateObjectV1Request.md)
 - [EzsigntemplatedocumentpagerecognitionCreateObjectV1Response](docs/EzsigntemplatedocumentpagerecognitionCreateObjectV1Response.md)
 - [EzsigntemplatedocumentpagerecognitionCreateObjectV1ResponseMPayload](docs/EzsigntemplatedocumentpagerecognitionCreateObjectV1ResponseMPayload.md)
 - [EzsigntemplatedocumentpagerecognitionDeleteObjectV1Response](docs/EzsigntemplatedocumentpagerecognitionDeleteObjectV1Response.md)
 - [EzsigntemplatedocumentpagerecognitionEditObjectV1Request](docs/EzsigntemplatedocumentpagerecognitionEditObjectV1Request.md)
 - [EzsigntemplatedocumentpagerecognitionEditObjectV1Response](docs/EzsigntemplatedocumentpagerecognitionEditObjectV1Response.md)
 - [EzsigntemplatedocumentpagerecognitionGetObjectV2Response](docs/EzsigntemplatedocumentpagerecognitionGetObjectV2Response.md)
 - [EzsigntemplatedocumentpagerecognitionGetObjectV2ResponseMPayload](docs/EzsigntemplatedocumentpagerecognitionGetObjectV2ResponseMPayload.md)
 - [EzsigntemplatedocumentpagerecognitionRequest](docs/EzsigntemplatedocumentpagerecognitionRequest.md)
 - [EzsigntemplatedocumentpagerecognitionRequestCompound](docs/EzsigntemplatedocumentpagerecognitionRequestCompound.md)
 - [EzsigntemplatedocumentpagerecognitionResponse](docs/EzsigntemplatedocumentpagerecognitionResponse.md)
 - [EzsigntemplatedocumentpagerecognitionResponseCompound](docs/EzsigntemplatedocumentpagerecognitionResponseCompound.md)
 - [EzsigntemplateelementdependencyRequest](docs/EzsigntemplateelementdependencyRequest.md)
 - [EzsigntemplateelementdependencyRequestCompound](docs/EzsigntemplateelementdependencyRequestCompound.md)
 - [EzsigntemplateelementdependencyResponse](docs/EzsigntemplateelementdependencyResponse.md)
 - [EzsigntemplateelementdependencyResponseCompound](docs/EzsigntemplateelementdependencyResponseCompound.md)
 - [EzsigntemplateformfieldRequest](docs/EzsigntemplateformfieldRequest.md)
 - [EzsigntemplateformfieldRequestCompound](docs/EzsigntemplateformfieldRequestCompound.md)
 - [EzsigntemplateformfieldResponse](docs/EzsigntemplateformfieldResponse.md)
 - [EzsigntemplateformfieldResponseCompound](docs/EzsigntemplateformfieldResponseCompound.md)
 - [EzsigntemplateformfieldgroupCreateObjectV1Request](docs/EzsigntemplateformfieldgroupCreateObjectV1Request.md)
 - [EzsigntemplateformfieldgroupCreateObjectV1Response](docs/EzsigntemplateformfieldgroupCreateObjectV1Response.md)
 - [EzsigntemplateformfieldgroupCreateObjectV1ResponseMPayload](docs/EzsigntemplateformfieldgroupCreateObjectV1ResponseMPayload.md)
 - [EzsigntemplateformfieldgroupDeleteObjectV1Response](docs/EzsigntemplateformfieldgroupDeleteObjectV1Response.md)
 - [EzsigntemplateformfieldgroupEditObjectV1Request](docs/EzsigntemplateformfieldgroupEditObjectV1Request.md)
 - [EzsigntemplateformfieldgroupEditObjectV1Response](docs/EzsigntemplateformfieldgroupEditObjectV1Response.md)
 - [EzsigntemplateformfieldgroupGetObjectV2Response](docs/EzsigntemplateformfieldgroupGetObjectV2Response.md)
 - [EzsigntemplateformfieldgroupGetObjectV2ResponseMPayload](docs/EzsigntemplateformfieldgroupGetObjectV2ResponseMPayload.md)
 - [EzsigntemplateformfieldgroupRequest](docs/EzsigntemplateformfieldgroupRequest.md)
 - [EzsigntemplateformfieldgroupRequestCompound](docs/EzsigntemplateformfieldgroupRequestCompound.md)
 - [EzsigntemplateformfieldgroupResponse](docs/EzsigntemplateformfieldgroupResponse.md)
 - [EzsigntemplateformfieldgroupResponseCompound](docs/EzsigntemplateformfieldgroupResponseCompound.md)
 - [EzsigntemplateformfieldgroupsignerRequest](docs/EzsigntemplateformfieldgroupsignerRequest.md)
 - [EzsigntemplateformfieldgroupsignerRequestCompound](docs/EzsigntemplateformfieldgroupsignerRequestCompound.md)
 - [EzsigntemplateformfieldgroupsignerResponse](docs/EzsigntemplateformfieldgroupsignerResponse.md)
 - [EzsigntemplateformfieldgroupsignerResponseCompound](docs/EzsigntemplateformfieldgroupsignerResponseCompound.md)
 - [EzsigntemplateglobalAutocompleteElementResponse](docs/EzsigntemplateglobalAutocompleteElementResponse.md)
 - [EzsigntemplateglobalGetAutocompleteV2Response](docs/EzsigntemplateglobalGetAutocompleteV2Response.md)
 - [EzsigntemplateglobalGetAutocompleteV2ResponseMPayload](docs/EzsigntemplateglobalGetAutocompleteV2ResponseMPayload.md)
 - [EzsigntemplateglobalGetObjectV2Response](docs/EzsigntemplateglobalGetObjectV2Response.md)
 - [EzsigntemplateglobalGetObjectV2ResponseMPayload](docs/EzsigntemplateglobalGetObjectV2ResponseMPayload.md)
 - [EzsigntemplateglobalResponse](docs/EzsigntemplateglobalResponse.md)
 - [EzsigntemplateglobalResponseCompound](docs/EzsigntemplateglobalResponseCompound.md)
 - [EzsigntemplateglobaldocumentResponse](docs/EzsigntemplateglobaldocumentResponse.md)
 - [EzsigntemplateglobalsignerResponse](docs/EzsigntemplateglobalsignerResponse.md)
 - [EzsigntemplateglobalsignerResponseCompound](docs/EzsigntemplateglobalsignerResponseCompound.md)
 - [EzsigntemplatepackageAutocompleteElementResponse](docs/EzsigntemplatepackageAutocompleteElementResponse.md)
 - [EzsigntemplatepackageCreateObjectV1Request](docs/EzsigntemplatepackageCreateObjectV1Request.md)
 - [EzsigntemplatepackageCreateObjectV1Response](docs/EzsigntemplatepackageCreateObjectV1Response.md)
 - [EzsigntemplatepackageCreateObjectV1ResponseMPayload](docs/EzsigntemplatepackageCreateObjectV1ResponseMPayload.md)
 - [EzsigntemplatepackageDeleteObjectV1Response](docs/EzsigntemplatepackageDeleteObjectV1Response.md)
 - [EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Request](docs/EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Request.md)
 - [EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Response](docs/EzsigntemplatepackageEditEzsigntemplatepackagesignersV1Response.md)
 - [EzsigntemplatepackageEditEzsigntemplatepackagesignersV1ResponseMPayload](docs/EzsigntemplatepackageEditEzsigntemplatepackagesignersV1ResponseMPayload.md)
 - [EzsigntemplatepackageEditObjectV1Request](docs/EzsigntemplatepackageEditObjectV1Request.md)
 - [EzsigntemplatepackageEditObjectV1Response](docs/EzsigntemplatepackageEditObjectV1Response.md)
 - [EzsigntemplatepackageGetAutocompleteV2Response](docs/EzsigntemplatepackageGetAutocompleteV2Response.md)
 - [EzsigntemplatepackageGetAutocompleteV2ResponseMPayload](docs/EzsigntemplatepackageGetAutocompleteV2ResponseMPayload.md)
 - [EzsigntemplatepackageGetListV1Response](docs/EzsigntemplatepackageGetListV1Response.md)
 - [EzsigntemplatepackageGetListV1ResponseMPayload](docs/EzsigntemplatepackageGetListV1ResponseMPayload.md)
 - [EzsigntemplatepackageGetObjectV2Response](docs/EzsigntemplatepackageGetObjectV2Response.md)
 - [EzsigntemplatepackageGetObjectV2ResponseMPayload](docs/EzsigntemplatepackageGetObjectV2ResponseMPayload.md)
 - [EzsigntemplatepackageListElement](docs/EzsigntemplatepackageListElement.md)
 - [EzsigntemplatepackageRequest](docs/EzsigntemplatepackageRequest.md)
 - [EzsigntemplatepackageRequestCompound](docs/EzsigntemplatepackageRequestCompound.md)
 - [EzsigntemplatepackageResponse](docs/EzsigntemplatepackageResponse.md)
 - [EzsigntemplatepackageResponseCompound](docs/EzsigntemplatepackageResponseCompound.md)
 - [EzsigntemplatepackagemembershipCreateObjectV1Request](docs/EzsigntemplatepackagemembershipCreateObjectV1Request.md)
 - [EzsigntemplatepackagemembershipCreateObjectV1Response](docs/EzsigntemplatepackagemembershipCreateObjectV1Response.md)
 - [EzsigntemplatepackagemembershipCreateObjectV1ResponseMPayload](docs/EzsigntemplatepackagemembershipCreateObjectV1ResponseMPayload.md)
 - [EzsigntemplatepackagemembershipDeleteObjectV1Response](docs/EzsigntemplatepackagemembershipDeleteObjectV1Response.md)
 - [EzsigntemplatepackagemembershipGetObjectV2Response](docs/EzsigntemplatepackagemembershipGetObjectV2Response.md)
 - [EzsigntemplatepackagemembershipGetObjectV2ResponseMPayload](docs/EzsigntemplatepackagemembershipGetObjectV2ResponseMPayload.md)
 - [EzsigntemplatepackagemembershipRequest](docs/EzsigntemplatepackagemembershipRequest.md)
 - [EzsigntemplatepackagemembershipRequestCompound](docs/EzsigntemplatepackagemembershipRequestCompound.md)
 - [EzsigntemplatepackagemembershipResponse](docs/EzsigntemplatepackagemembershipResponse.md)
 - [EzsigntemplatepackagemembershipResponseCompound](docs/EzsigntemplatepackagemembershipResponseCompound.md)
 - [EzsigntemplatepackagesignerCreateObjectV1Request](docs/EzsigntemplatepackagesignerCreateObjectV1Request.md)
 - [EzsigntemplatepackagesignerCreateObjectV1Response](docs/EzsigntemplatepackagesignerCreateObjectV1Response.md)
 - [EzsigntemplatepackagesignerCreateObjectV1ResponseMPayload](docs/EzsigntemplatepackagesignerCreateObjectV1ResponseMPayload.md)
 - [EzsigntemplatepackagesignerDeleteObjectV1Response](docs/EzsigntemplatepackagesignerDeleteObjectV1Response.md)
 - [EzsigntemplatepackagesignerDeleteObjectV1ResponseMPayload](docs/EzsigntemplatepackagesignerDeleteObjectV1ResponseMPayload.md)
 - [EzsigntemplatepackagesignerEditObjectV1Request](docs/EzsigntemplatepackagesignerEditObjectV1Request.md)
 - [EzsigntemplatepackagesignerEditObjectV1Response](docs/EzsigntemplatepackagesignerEditObjectV1Response.md)
 - [EzsigntemplatepackagesignerGetObjectV2Response](docs/EzsigntemplatepackagesignerGetObjectV2Response.md)
 - [EzsigntemplatepackagesignerGetObjectV2ResponseMPayload](docs/EzsigntemplatepackagesignerGetObjectV2ResponseMPayload.md)
 - [EzsigntemplatepackagesignerRequest](docs/EzsigntemplatepackagesignerRequest.md)
 - [EzsigntemplatepackagesignerRequestCompound](docs/EzsigntemplatepackagesignerRequestCompound.md)
 - [EzsigntemplatepackagesignerResponse](docs/EzsigntemplatepackagesignerResponse.md)
 - [EzsigntemplatepackagesignerResponseCompound](docs/EzsigntemplatepackagesignerResponseCompound.md)
 - [EzsigntemplatepackagesignermembershipCreateObjectV1Request](docs/EzsigntemplatepackagesignermembershipCreateObjectV1Request.md)
 - [EzsigntemplatepackagesignermembershipCreateObjectV1Response](docs/EzsigntemplatepackagesignermembershipCreateObjectV1Response.md)
 - [EzsigntemplatepackagesignermembershipCreateObjectV1ResponseMPayload](docs/EzsigntemplatepackagesignermembershipCreateObjectV1ResponseMPayload.md)
 - [EzsigntemplatepackagesignermembershipDeleteObjectV1Response](docs/EzsigntemplatepackagesignermembershipDeleteObjectV1Response.md)
 - [EzsigntemplatepackagesignermembershipDeleteObjectV1ResponseMPayload](docs/EzsigntemplatepackagesignermembershipDeleteObjectV1ResponseMPayload.md)
 - [EzsigntemplatepackagesignermembershipGetObjectV2Response](docs/EzsigntemplatepackagesignermembershipGetObjectV2Response.md)
 - [EzsigntemplatepackagesignermembershipGetObjectV2ResponseMPayload](docs/EzsigntemplatepackagesignermembershipGetObjectV2ResponseMPayload.md)
 - [EzsigntemplatepackagesignermembershipRequest](docs/EzsigntemplatepackagesignermembershipRequest.md)
 - [EzsigntemplatepackagesignermembershipRequestCompound](docs/EzsigntemplatepackagesignermembershipRequestCompound.md)
 - [EzsigntemplatepackagesignermembershipResponse](docs/EzsigntemplatepackagesignermembershipResponse.md)
 - [EzsigntemplatepackagesignermembershipResponseCompound](docs/EzsigntemplatepackagesignermembershipResponseCompound.md)
 - [EzsigntemplatepublicCreateEzsignfolderV1Request](docs/EzsigntemplatepublicCreateEzsignfolderV1Request.md)
 - [EzsigntemplatepublicCreateEzsignfolderV1Response](docs/EzsigntemplatepublicCreateEzsignfolderV1Response.md)
 - [EzsigntemplatepublicCreateEzsignfolderV1ResponseMPayload](docs/EzsigntemplatepublicCreateEzsignfolderV1ResponseMPayload.md)
 - [EzsigntemplatepublicCreateObjectV1Request](docs/EzsigntemplatepublicCreateObjectV1Request.md)
 - [EzsigntemplatepublicCreateObjectV1Response](docs/EzsigntemplatepublicCreateObjectV1Response.md)
 - [EzsigntemplatepublicCreateObjectV1ResponseMPayload](docs/EzsigntemplatepublicCreateObjectV1ResponseMPayload.md)
 - [EzsigntemplatepublicEditObjectV1Request](docs/EzsigntemplatepublicEditObjectV1Request.md)
 - [EzsigntemplatepublicEditObjectV1Response](docs/EzsigntemplatepublicEditObjectV1Response.md)
 - [EzsigntemplatepublicGetEzsigntemplatepublicDetailsV1Request](docs/EzsigntemplatepublicGetEzsigntemplatepublicDetailsV1Request.md)
 - [EzsigntemplatepublicGetEzsigntemplatepublicDetailsV1Response](docs/EzsigntemplatepublicGetEzsigntemplatepublicDetailsV1Response.md)
 - [EzsigntemplatepublicGetEzsigntemplatepublicDetailsV1ResponseMPayload](docs/EzsigntemplatepublicGetEzsigntemplatepublicDetailsV1ResponseMPayload.md)
 - [EzsigntemplatepublicGetFormsDataV1Response](docs/EzsigntemplatepublicGetFormsDataV1Response.md)
 - [EzsigntemplatepublicGetFormsDataV1ResponseMPayload](docs/EzsigntemplatepublicGetFormsDataV1ResponseMPayload.md)
 - [EzsigntemplatepublicGetListV1Response](docs/EzsigntemplatepublicGetListV1Response.md)
 - [EzsigntemplatepublicGetListV1ResponseMPayload](docs/EzsigntemplatepublicGetListV1ResponseMPayload.md)
 - [EzsigntemplatepublicGetObjectV2Response](docs/EzsigntemplatepublicGetObjectV2Response.md)
 - [EzsigntemplatepublicGetObjectV2ResponseMPayload](docs/EzsigntemplatepublicGetObjectV2ResponseMPayload.md)
 - [EzsigntemplatepublicListElement](docs/EzsigntemplatepublicListElement.md)
 - [EzsigntemplatepublicRequest](docs/EzsigntemplatepublicRequest.md)
 - [EzsigntemplatepublicRequestCompound](docs/EzsigntemplatepublicRequestCompound.md)
 - [EzsigntemplatepublicResetLimitExceededCounterV1Response](docs/EzsigntemplatepublicResetLimitExceededCounterV1Response.md)
 - [EzsigntemplatepublicResetLimitExceededCounterV1ResponseMPayload](docs/EzsigntemplatepublicResetLimitExceededCounterV1ResponseMPayload.md)
 - [EzsigntemplatepublicResetUrlV1Response](docs/EzsigntemplatepublicResetUrlV1Response.md)
 - [EzsigntemplatepublicResetUrlV1ResponseMPayload](docs/EzsigntemplatepublicResetUrlV1ResponseMPayload.md)
 - [EzsigntemplatepublicResponse](docs/EzsigntemplatepublicResponse.md)
 - [EzsigntemplatepublicResponseCompound](docs/EzsigntemplatepublicResponseCompound.md)
 - [EzsigntemplatesignatureCreateObjectV2Request](docs/EzsigntemplatesignatureCreateObjectV2Request.md)
 - [EzsigntemplatesignatureCreateObjectV2Response](docs/EzsigntemplatesignatureCreateObjectV2Response.md)
 - [EzsigntemplatesignatureCreateObjectV2ResponseMPayload](docs/EzsigntemplatesignatureCreateObjectV2ResponseMPayload.md)
 - [EzsigntemplatesignatureDeleteObjectV1Response](docs/EzsigntemplatesignatureDeleteObjectV1Response.md)
 - [EzsigntemplatesignatureEditObjectV2Request](docs/EzsigntemplatesignatureEditObjectV2Request.md)
 - [EzsigntemplatesignatureEditObjectV2Response](docs/EzsigntemplatesignatureEditObjectV2Response.md)
 - [EzsigntemplatesignatureGetObjectV3Response](docs/EzsigntemplatesignatureGetObjectV3Response.md)
 - [EzsigntemplatesignatureGetObjectV3ResponseMPayload](docs/EzsigntemplatesignatureGetObjectV3ResponseMPayload.md)
 - [EzsigntemplatesignatureRequest](docs/EzsigntemplatesignatureRequest.md)
 - [EzsigntemplatesignatureRequestCompound](docs/EzsigntemplatesignatureRequestCompound.md)
 - [EzsigntemplatesignatureRequestCompoundV2](docs/EzsigntemplatesignatureRequestCompoundV2.md)
 - [EzsigntemplatesignatureResponse](docs/EzsigntemplatesignatureResponse.md)
 - [EzsigntemplatesignatureResponseCompound](docs/EzsigntemplatesignatureResponseCompound.md)
 - [EzsigntemplatesignatureResponseCompoundV3](docs/EzsigntemplatesignatureResponseCompoundV3.md)
 - [EzsigntemplatesignaturecustomdateRequest](docs/EzsigntemplatesignaturecustomdateRequest.md)
 - [EzsigntemplatesignaturecustomdateRequestCompound](docs/EzsigntemplatesignaturecustomdateRequestCompound.md)
 - [EzsigntemplatesignaturecustomdateRequestCompoundV2](docs/EzsigntemplatesignaturecustomdateRequestCompoundV2.md)
 - [EzsigntemplatesignaturecustomdateRequestV2](docs/EzsigntemplatesignaturecustomdateRequestV2.md)
 - [EzsigntemplatesignaturecustomdateResponse](docs/EzsigntemplatesignaturecustomdateResponse.md)
 - [EzsigntemplatesignaturecustomdateResponseCompound](docs/EzsigntemplatesignaturecustomdateResponseCompound.md)
 - [EzsigntemplatesignaturecustomdateResponseCompoundV2](docs/EzsigntemplatesignaturecustomdateResponseCompoundV2.md)
 - [EzsigntemplatesignaturecustomdateResponseV2](docs/EzsigntemplatesignaturecustomdateResponseV2.md)
 - [EzsigntemplatesignerCreateObjectV1Request](docs/EzsigntemplatesignerCreateObjectV1Request.md)
 - [EzsigntemplatesignerCreateObjectV1Response](docs/EzsigntemplatesignerCreateObjectV1Response.md)
 - [EzsigntemplatesignerCreateObjectV1ResponseMPayload](docs/EzsigntemplatesignerCreateObjectV1ResponseMPayload.md)
 - [EzsigntemplatesignerDeleteObjectV1Response](docs/EzsigntemplatesignerDeleteObjectV1Response.md)
 - [EzsigntemplatesignerEditObjectV1Request](docs/EzsigntemplatesignerEditObjectV1Request.md)
 - [EzsigntemplatesignerEditObjectV1Response](docs/EzsigntemplatesignerEditObjectV1Response.md)
 - [EzsigntemplatesignerGetObjectV2Response](docs/EzsigntemplatesignerGetObjectV2Response.md)
 - [EzsigntemplatesignerGetObjectV2ResponseMPayload](docs/EzsigntemplatesignerGetObjectV2ResponseMPayload.md)
 - [EzsigntemplatesignerRequest](docs/EzsigntemplatesignerRequest.md)
 - [EzsigntemplatesignerRequestCompound](docs/EzsigntemplatesignerRequestCompound.md)
 - [EzsigntemplatesignerResponse](docs/EzsigntemplatesignerResponse.md)
 - [EzsigntemplatesignerResponseCompound](docs/EzsigntemplatesignerResponseCompound.md)
 - [EzsigntsarequirementAutocompleteElementResponse](docs/EzsigntsarequirementAutocompleteElementResponse.md)
 - [EzsigntsarequirementGetAutocompleteV2Response](docs/EzsigntsarequirementGetAutocompleteV2Response.md)
 - [EzsigntsarequirementGetAutocompleteV2ResponseMPayload](docs/EzsigntsarequirementGetAutocompleteV2ResponseMPayload.md)
 - [EzsignuserEditObjectV1Request](docs/EzsignuserEditObjectV1Request.md)
 - [EzsignuserEditObjectV1Response](docs/EzsignuserEditObjectV1Response.md)
 - [EzsignuserGetObjectV2Response](docs/EzsignuserGetObjectV2Response.md)
 - [EzsignuserGetObjectV2ResponseMPayload](docs/EzsignuserGetObjectV2ResponseMPayload.md)
 - [EzsignuserRequest](docs/EzsignuserRequest.md)
 - [EzsignuserRequestCompound](docs/EzsignuserRequestCompound.md)
 - [EzsignuserResponse](docs/EzsignuserResponse.md)
 - [EzsignuserResponseCompound](docs/EzsignuserResponseCompound.md)
 - [FieldEActivesessionEzsign](docs/FieldEActivesessionEzsign.md)
 - [FieldEActivesessionEzsignaccess](docs/FieldEActivesessionEzsignaccess.md)
 - [FieldEActivesessionEzsignprepaid](docs/FieldEActivesessionEzsignprepaid.md)
 - [FieldEActivesessionOrigin](docs/FieldEActivesessionOrigin.md)
 - [FieldEActivesessionRealestateinprogress](docs/FieldEActivesessionRealestateinprogress.md)
 - [FieldEActivesessionUsertype](docs/FieldEActivesessionUsertype.md)
 - [FieldEActivesessionWeekdaystart](docs/FieldEActivesessionWeekdaystart.md)
 - [FieldEAttachmentDocumenttype](docs/FieldEAttachmentDocumenttype.md)
 - [FieldEAttachmentPrivacy](docs/FieldEAttachmentPrivacy.md)
 - [FieldEAttachmentType](docs/FieldEAttachmentType.md)
 - [FieldEAttachmentVerified](docs/FieldEAttachmentVerified.md)
 - [FieldEAttachmentlogType](docs/FieldEAttachmentlogType.md)
 - [FieldEAuthenticationexternalType](docs/FieldEAuthenticationexternalType.md)
 - [FieldEBrandingAlignlogo](docs/FieldEBrandingAlignlogo.md)
 - [FieldEBrandingLogo](docs/FieldEBrandingLogo.md)
 - [FieldEColleagueEzsign](docs/FieldEColleagueEzsign.md)
 - [FieldEColleagueRealestateinprogess](docs/FieldEColleagueRealestateinprogess.md)
 - [FieldECommunicationImportance](docs/FieldECommunicationImportance.md)
 - [FieldECommunicationType](docs/FieldECommunicationType.md)
 - [FieldECommunicationexternalrecipientType](docs/FieldECommunicationexternalrecipientType.md)
 - [FieldECommunicationrecipientType](docs/FieldECommunicationrecipientType.md)
 - [FieldEContactType](docs/FieldEContactType.md)
 - [FieldEContactinformationsType](docs/FieldEContactinformationsType.md)
 - [FieldECreditcardtransactionAvsresult](docs/FieldECreditcardtransactionAvsresult.md)
 - [FieldECreditcardtransactionCvdresult](docs/FieldECreditcardtransactionCvdresult.md)
 - [FieldECreditcardtypeCodename](docs/FieldECreditcardtypeCodename.md)
 - [FieldECustomerMarketingcorrespondence](docs/FieldECustomerMarketingcorrespondence.md)
 - [FieldECustomerType](docs/FieldECustomerType.md)
 - [FieldEDiscussionmessageStatus](docs/FieldEDiscussionmessageStatus.md)
 - [FieldEErrorCode](docs/FieldEErrorCode.md)
 - [FieldEEzdoctemplatedocumentPrivacylevel](docs/FieldEEzdoctemplatedocumentPrivacylevel.md)
 - [FieldEEzmaxinvoicingPaymenttype](docs/FieldEEzmaxinvoicingPaymenttype.md)
 - [FieldEEzmaxinvoicingagentVariationezmax](docs/FieldEEzmaxinvoicingagentVariationezmax.md)
 - [FieldEEzmaxinvoicingagentVariationezsign](docs/FieldEEzmaxinvoicingagentVariationezsign.md)
 - [FieldEEzmaxinvoicingcontractPaymenttype](docs/FieldEEzmaxinvoicingcontractPaymenttype.md)
 - [FieldEEzmaxinvoicinguserVariationezsign](docs/FieldEEzmaxinvoicinguserVariationezsign.md)
 - [FieldEEzsignannotationType](docs/FieldEEzsignannotationType.md)
 - [FieldEEzsigndocumentStep](docs/FieldEEzsigndocumentStep.md)
 - [FieldEEzsigndocumentlogType](docs/FieldEEzsigndocumentlogType.md)
 - [FieldEEzsignelementdependencyOperator](docs/FieldEEzsignelementdependencyOperator.md)
 - [FieldEEzsignelementdependencyValidation](docs/FieldEEzsignelementdependencyValidation.md)
 - [FieldEEzsignfolderCompletion](docs/FieldEEzsignfolderCompletion.md)
 - [FieldEEzsignfolderDocumentdependency](docs/FieldEEzsignfolderDocumentdependency.md)
 - [FieldEEzsignfolderMessageorder](docs/FieldEEzsignfolderMessageorder.md)
 - [FieldEEzsignfolderSendreminderfrequency](docs/FieldEEzsignfolderSendreminderfrequency.md)
 - [FieldEEzsignfolderStep](docs/FieldEEzsignfolderStep.md)
 - [FieldEEzsignfoldertypeCompletion](docs/FieldEEzsignfoldertypeCompletion.md)
 - [FieldEEzsignfoldertypeDisposal](docs/FieldEEzsignfoldertypeDisposal.md)
 - [FieldEEzsignfoldertypeDocumentdependency](docs/FieldEEzsignfoldertypeDocumentdependency.md)
 - [FieldEEzsignfoldertypePdfanoncompliantaction](docs/FieldEEzsignfoldertypePdfanoncompliantaction.md)
 - [FieldEEzsignfoldertypePdfarequirement](docs/FieldEEzsignfoldertypePdfarequirement.md)
 - [FieldEEzsignfoldertypePrivacylevel](docs/FieldEEzsignfoldertypePrivacylevel.md)
 - [FieldEEzsignfoldertypeSendreminderfrequency](docs/FieldEEzsignfoldertypeSendreminderfrequency.md)
 - [FieldEEzsignfoldertypeSigneraccess](docs/FieldEEzsignfoldertypeSigneraccess.md)
 - [FieldEEzsignformfieldDependencyrequirement](docs/FieldEEzsignformfieldDependencyrequirement.md)
 - [FieldEEzsignformfieldgroupSignerrequirement](docs/FieldEEzsignformfieldgroupSignerrequirement.md)
 - [FieldEEzsignformfieldgroupTooltipposition](docs/FieldEEzsignformfieldgroupTooltipposition.md)
 - [FieldEEzsignformfieldgroupType](docs/FieldEEzsignformfieldgroupType.md)
 - [FieldEEzsignsignatureAttachmentnamesource](docs/FieldEEzsignsignatureAttachmentnamesource.md)
 - [FieldEEzsignsignatureConsultationtrigger](docs/FieldEEzsignsignatureConsultationtrigger.md)
 - [FieldEEzsignsignatureDependencyrequirement](docs/FieldEEzsignsignatureDependencyrequirement.md)
 - [FieldEEzsignsignatureFont](docs/FieldEEzsignsignatureFont.md)
 - [FieldEEzsignsignatureTooltipposition](docs/FieldEEzsignsignatureTooltipposition.md)
 - [FieldEEzsignsignatureType](docs/FieldEEzsignsignatureType.md)
 - [FieldEEzsigntemplateRecognition](docs/FieldEEzsigntemplateRecognition.md)
 - [FieldEEzsigntemplateType](docs/FieldEEzsigntemplateType.md)
 - [FieldEEzsigntemplatedocumentpagerecognitionOperator](docs/FieldEEzsigntemplatedocumentpagerecognitionOperator.md)
 - [FieldEEzsigntemplatedocumentpagerecognitionSection](docs/FieldEEzsigntemplatedocumentpagerecognitionSection.md)
 - [FieldEEzsigntemplateelementdependencyOperator](docs/FieldEEzsigntemplateelementdependencyOperator.md)
 - [FieldEEzsigntemplateelementdependencyValidation](docs/FieldEEzsigntemplateelementdependencyValidation.md)
 - [FieldEEzsigntemplateformfieldDependencyrequirement](docs/FieldEEzsigntemplateformfieldDependencyrequirement.md)
 - [FieldEEzsigntemplateformfieldPositioning](docs/FieldEEzsigntemplateformfieldPositioning.md)
 - [FieldEEzsigntemplateformfieldPositioningoccurence](docs/FieldEEzsigntemplateformfieldPositioningoccurence.md)
 - [FieldEEzsigntemplateformfieldgroupSignerrequirement](docs/FieldEEzsigntemplateformfieldgroupSignerrequirement.md)
 - [FieldEEzsigntemplateformfieldgroupTooltipposition](docs/FieldEEzsigntemplateformfieldgroupTooltipposition.md)
 - [FieldEEzsigntemplateformfieldgroupType](docs/FieldEEzsigntemplateformfieldgroupType.md)
 - [FieldEEzsigntemplateglobalModule](docs/FieldEEzsigntemplateglobalModule.md)
 - [FieldEEzsigntemplateglobalSupplier](docs/FieldEEzsigntemplateglobalSupplier.md)
 - [FieldEEzsigntemplatepackagesignerMapping](docs/FieldEEzsigntemplatepackagesignerMapping.md)
 - [FieldEEzsigntemplatepublicLimittype](docs/FieldEEzsigntemplatepublicLimittype.md)
 - [FieldEEzsigntemplatesignatureAttachmentnamesource](docs/FieldEEzsigntemplatesignatureAttachmentnamesource.md)
 - [FieldEEzsigntemplatesignatureConsultationtrigger](docs/FieldEEzsigntemplatesignatureConsultationtrigger.md)
 - [FieldEEzsigntemplatesignatureDependencyrequirement](docs/FieldEEzsigntemplatesignatureDependencyrequirement.md)
 - [FieldEEzsigntemplatesignatureFont](docs/FieldEEzsigntemplatesignatureFont.md)
 - [FieldEEzsigntemplatesignaturePositioning](docs/FieldEEzsigntemplatesignaturePositioning.md)
 - [FieldEEzsigntemplatesignaturePositioningoccurence](docs/FieldEEzsigntemplatesignaturePositioningoccurence.md)
 - [FieldEEzsigntemplatesignatureTooltipposition](docs/FieldEEzsigntemplatesignatureTooltipposition.md)
 - [FieldEEzsigntemplatesignatureType](docs/FieldEEzsigntemplatesignatureType.md)
 - [FieldEEzsigntemplatesignerMapping](docs/FieldEEzsigntemplatesignerMapping.md)
 - [FieldENotificationpreferenceStatus](docs/FieldENotificationpreferenceStatus.md)
 - [FieldEPaymenttermType](docs/FieldEPaymenttermType.md)
 - [FieldEPhoneType](docs/FieldEPhoneType.md)
 - [FieldESessionhistoryEndby](docs/FieldESessionhistoryEndby.md)
 - [FieldESignaturePreference](docs/FieldESignaturePreference.md)
 - [FieldESystemconfigurationEzsign](docs/FieldESystemconfigurationEzsign.md)
 - [FieldESystemconfigurationEzsignofficeplan](docs/FieldESystemconfigurationEzsignofficeplan.md)
 - [FieldESystemconfigurationLanguage1](docs/FieldESystemconfigurationLanguage1.md)
 - [FieldESystemconfigurationLanguage2](docs/FieldESystemconfigurationLanguage2.md)
 - [FieldESystemconfigurationNewexternaluseraction](docs/FieldESystemconfigurationNewexternaluseraction.md)
 - [FieldEUserEzsignaccess](docs/FieldEUserEzsignaccess.md)
 - [FieldEUserEzsignprepaid](docs/FieldEUserEzsignprepaid.md)
 - [FieldEUserEzsignsendreminderfrequency](docs/FieldEUserEzsignsendreminderfrequency.md)
 - [FieldEUserLogintype](docs/FieldEUserLogintype.md)
 - [FieldEUserOrigin](docs/FieldEUserOrigin.md)
 - [FieldEUserType](docs/FieldEUserType.md)
 - [FieldEVariableexpenseTaxable](docs/FieldEVariableexpenseTaxable.md)
 - [FieldEVersionhistoryType](docs/FieldEVersionhistoryType.md)
 - [FieldEVersionhistoryUsertype](docs/FieldEVersionhistoryUsertype.md)
 - [FieldEWebhookEzsignevent](docs/FieldEWebhookEzsignevent.md)
 - [FieldEWebhookManagementevent](docs/FieldEWebhookManagementevent.md)
 - [FieldEWebhookModule](docs/FieldEWebhookModule.md)
 - [FieldPksEzmaxclientOs](docs/FieldPksEzmaxclientOs.md)
 - [FontAutocompleteElementResponse](docs/FontAutocompleteElementResponse.md)
 - [FontGetAutocompleteV2Response](docs/FontGetAutocompleteV2Response.md)
 - [FontGetAutocompleteV2ResponseMPayload](docs/FontGetAutocompleteV2ResponseMPayload.md)
 - [FranchisebrokerAutocompleteElementResponse](docs/FranchisebrokerAutocompleteElementResponse.md)
 - [FranchisebrokerGetAutocompleteV2Response](docs/FranchisebrokerGetAutocompleteV2Response.md)
 - [FranchisebrokerGetAutocompleteV2ResponseMPayload](docs/FranchisebrokerGetAutocompleteV2ResponseMPayload.md)
 - [FranchiseofficeAutocompleteElementResponse](docs/FranchiseofficeAutocompleteElementResponse.md)
 - [FranchiseofficeGetAutocompleteV2Response](docs/FranchiseofficeGetAutocompleteV2Response.md)
 - [FranchiseofficeGetAutocompleteV2ResponseMPayload](docs/FranchiseofficeGetAutocompleteV2ResponseMPayload.md)
 - [FranchisereferalincomeCreateObjectV2Request](docs/FranchisereferalincomeCreateObjectV2Request.md)
 - [FranchisereferalincomeCreateObjectV2Response](docs/FranchisereferalincomeCreateObjectV2Response.md)
 - [FranchisereferalincomeCreateObjectV2ResponseMPayload](docs/FranchisereferalincomeCreateObjectV2ResponseMPayload.md)
 - [FranchisereferalincomeRequest](docs/FranchisereferalincomeRequest.md)
 - [FranchisereferalincomeRequestCompound](docs/FranchisereferalincomeRequestCompound.md)
 - [GlaccountAutocompleteElementResponse](docs/GlaccountAutocompleteElementResponse.md)
 - [GlaccountGetAutocompleteV2Response](docs/GlaccountGetAutocompleteV2Response.md)
 - [GlaccountGetAutocompleteV2ResponseMPayload](docs/GlaccountGetAutocompleteV2ResponseMPayload.md)
 - [GlaccountcontainerAutocompleteElementResponse](docs/GlaccountcontainerAutocompleteElementResponse.md)
 - [GlaccountcontainerGetAutocompleteV2Response](docs/GlaccountcontainerGetAutocompleteV2Response.md)
 - [GlaccountcontainerGetAutocompleteV2ResponseMPayload](docs/GlaccountcontainerGetAutocompleteV2ResponseMPayload.md)
 - [GlobalCustomerGetEndpointV1Response](docs/GlobalCustomerGetEndpointV1Response.md)
 - [GlobalEzmaxclientVersionV1Response](docs/GlobalEzmaxclientVersionV1Response.md)
 - [GlobalEzmaxcustomerGetConfigurationV1Response](docs/GlobalEzmaxcustomerGetConfigurationV1Response.md)
 - [HeaderAcceptLanguage](docs/HeaderAcceptLanguage.md)
 - [InscriptionGetAttachmentsV1Response](docs/InscriptionGetAttachmentsV1Response.md)
 - [InscriptionGetAttachmentsV1ResponseMPayload](docs/InscriptionGetAttachmentsV1ResponseMPayload.md)
 - [InscriptionGetCommunicationCountV1Response](docs/InscriptionGetCommunicationCountV1Response.md)
 - [InscriptionGetCommunicationCountV1ResponseMPayload](docs/InscriptionGetCommunicationCountV1ResponseMPayload.md)
 - [InscriptionGetCommunicationListV1Response](docs/InscriptionGetCommunicationListV1Response.md)
 - [InscriptionGetCommunicationListV1ResponseMPayload](docs/InscriptionGetCommunicationListV1ResponseMPayload.md)
 - [InscriptionGetCommunicationrecipientsV1Response](docs/InscriptionGetCommunicationrecipientsV1Response.md)
 - [InscriptionGetCommunicationrecipientsV1ResponseMPayload](docs/InscriptionGetCommunicationrecipientsV1ResponseMPayload.md)
 - [InscriptionGetCommunicationsendersV1Response](docs/InscriptionGetCommunicationsendersV1Response.md)
 - [InscriptionGetCommunicationsendersV1ResponseMPayload](docs/InscriptionGetCommunicationsendersV1ResponseMPayload.md)
 - [InscriptionnotauthenticatedGetCommunicationCountV1Response](docs/InscriptionnotauthenticatedGetCommunicationCountV1Response.md)
 - [InscriptionnotauthenticatedGetCommunicationCountV1ResponseMPayload](docs/InscriptionnotauthenticatedGetCommunicationCountV1ResponseMPayload.md)
 - [InscriptionnotauthenticatedGetCommunicationListV1Response](docs/InscriptionnotauthenticatedGetCommunicationListV1Response.md)
 - [InscriptionnotauthenticatedGetCommunicationListV1ResponseMPayload](docs/InscriptionnotauthenticatedGetCommunicationListV1ResponseMPayload.md)
 - [InscriptionnotauthenticatedGetCommunicationrecipientsV1Response](docs/InscriptionnotauthenticatedGetCommunicationrecipientsV1Response.md)
 - [InscriptionnotauthenticatedGetCommunicationrecipientsV1ResponseMPayload](docs/InscriptionnotauthenticatedGetCommunicationrecipientsV1ResponseMPayload.md)
 - [InscriptionnotauthenticatedGetCommunicationsendersV1Response](docs/InscriptionnotauthenticatedGetCommunicationsendersV1Response.md)
 - [InscriptionnotauthenticatedGetCommunicationsendersV1ResponseMPayload](docs/InscriptionnotauthenticatedGetCommunicationsendersV1ResponseMPayload.md)
 - [InscriptiontempGetCommunicationCountV1Response](docs/InscriptiontempGetCommunicationCountV1Response.md)
 - [InscriptiontempGetCommunicationCountV1ResponseMPayload](docs/InscriptiontempGetCommunicationCountV1ResponseMPayload.md)
 - [InscriptiontempGetCommunicationListV1Response](docs/InscriptiontempGetCommunicationListV1Response.md)
 - [InscriptiontempGetCommunicationListV1ResponseMPayload](docs/InscriptiontempGetCommunicationListV1ResponseMPayload.md)
 - [InscriptiontempGetCommunicationrecipientsV1Response](docs/InscriptiontempGetCommunicationrecipientsV1Response.md)
 - [InscriptiontempGetCommunicationrecipientsV1ResponseMPayload](docs/InscriptiontempGetCommunicationrecipientsV1ResponseMPayload.md)
 - [InscriptiontempGetCommunicationsendersV1Response](docs/InscriptiontempGetCommunicationsendersV1Response.md)
 - [InscriptiontempGetCommunicationsendersV1ResponseMPayload](docs/InscriptiontempGetCommunicationsendersV1ResponseMPayload.md)
 - [InvoiceGetAttachmentsV1Response](docs/InvoiceGetAttachmentsV1Response.md)
 - [InvoiceGetAttachmentsV1ResponseMPayload](docs/InvoiceGetAttachmentsV1ResponseMPayload.md)
 - [InvoiceGetCommunicationCountV1Response](docs/InvoiceGetCommunicationCountV1Response.md)
 - [InvoiceGetCommunicationCountV1ResponseMPayload](docs/InvoiceGetCommunicationCountV1ResponseMPayload.md)
 - [InvoiceGetCommunicationListV1Response](docs/InvoiceGetCommunicationListV1Response.md)
 - [InvoiceGetCommunicationListV1ResponseMPayload](docs/InvoiceGetCommunicationListV1ResponseMPayload.md)
 - [InvoiceGetCommunicationrecipientsV1Response](docs/InvoiceGetCommunicationrecipientsV1Response.md)
 - [InvoiceGetCommunicationrecipientsV1ResponseMPayload](docs/InvoiceGetCommunicationrecipientsV1ResponseMPayload.md)
 - [InvoiceGetCommunicationsendersV1Response](docs/InvoiceGetCommunicationsendersV1Response.md)
 - [InvoiceGetCommunicationsendersV1ResponseMPayload](docs/InvoiceGetCommunicationsendersV1ResponseMPayload.md)
 - [LanguageAutocompleteElementResponse](docs/LanguageAutocompleteElementResponse.md)
 - [LanguageGetAutocompleteV2Response](docs/LanguageGetAutocompleteV2Response.md)
 - [LanguageGetAutocompleteV2ResponseMPayload](docs/LanguageGetAutocompleteV2ResponseMPayload.md)
 - [ModuleAutocompleteElementResponse](docs/ModuleAutocompleteElementResponse.md)
 - [ModuleGetAutocompleteV2Response](docs/ModuleGetAutocompleteV2Response.md)
 - [ModuleGetAutocompleteV2ResponseMPayload](docs/ModuleGetAutocompleteV2ResponseMPayload.md)
 - [ModuleResponse](docs/ModuleResponse.md)
 - [ModuleResponseCompound](docs/ModuleResponseCompound.md)
 - [ModulegroupGetAllV1Response](docs/ModulegroupGetAllV1Response.md)
 - [ModulegroupGetAllV1ResponseMPayload](docs/ModulegroupGetAllV1ResponseMPayload.md)
 - [ModulegroupResponse](docs/ModulegroupResponse.md)
 - [ModulegroupResponseCompound](docs/ModulegroupResponseCompound.md)
 - [ModulesectionResponse](docs/ModulesectionResponse.md)
 - [ModulesectionResponseCompound](docs/ModulesectionResponseCompound.md)
 - [MultilingualApikeyDescription](docs/MultilingualApikeyDescription.md)
 - [MultilingualBillingentityinternalDescription](docs/MultilingualBillingentityinternalDescription.md)
 - [MultilingualBrandingDescription](docs/MultilingualBrandingDescription.md)
 - [MultilingualEzdoctemplatedocumentName](docs/MultilingualEzdoctemplatedocumentName.md)
 - [MultilingualEzmaxinvoicingsummaryinternalDescription](docs/MultilingualEzmaxinvoicingsummaryinternalDescription.md)
 - [MultilingualEzsignfoldertypeName](docs/MultilingualEzsignfoldertypeName.md)
 - [MultilingualEzsignsignergroupDescription](docs/MultilingualEzsignsignergroupDescription.md)
 - [MultilingualEzsignsigningreasonDescription](docs/MultilingualEzsignsigningreasonDescription.md)
 - [MultilingualNotificationsubsectionName](docs/MultilingualNotificationsubsectionName.md)
 - [MultilingualNotificationtestName](docs/MultilingualNotificationtestName.md)
 - [MultilingualPaymenttermDescription](docs/MultilingualPaymenttermDescription.md)
 - [MultilingualSubnetDescription](docs/MultilingualSubnetDescription.md)
 - [MultilingualSupplyDescription](docs/MultilingualSupplyDescription.md)
 - [MultilingualUsergroupName](docs/MultilingualUsergroupName.md)
 - [MultilingualUserlogintypeDescription](docs/MultilingualUserlogintypeDescription.md)
 - [MultilingualVariableexpenseDescription](docs/MultilingualVariableexpenseDescription.md)
 - [MultilingualVersionhistoryDetail](docs/MultilingualVersionhistoryDetail.md)
 - [NotificationsectionGetNotificationtestsV1Response](docs/NotificationsectionGetNotificationtestsV1Response.md)
 - [NotificationsectionGetNotificationtestsV1ResponseMPayload](docs/NotificationsectionGetNotificationtestsV1ResponseMPayload.md)
 - [NotificationsubsectionResponse](docs/NotificationsubsectionResponse.md)
 - [NotificationtestGetElementsV1Response](docs/NotificationtestGetElementsV1Response.md)
 - [NotificationtestGetElementsV1ResponseMPayload](docs/NotificationtestGetElementsV1ResponseMPayload.md)
 - [NotificationtestResponse](docs/NotificationtestResponse.md)
 - [OtherincomeGetCommunicationCountV1Response](docs/OtherincomeGetCommunicationCountV1Response.md)
 - [OtherincomeGetCommunicationCountV1ResponseMPayload](docs/OtherincomeGetCommunicationCountV1ResponseMPayload.md)
 - [OtherincomeGetCommunicationListV1Response](docs/OtherincomeGetCommunicationListV1Response.md)
 - [OtherincomeGetCommunicationListV1ResponseMPayload](docs/OtherincomeGetCommunicationListV1ResponseMPayload.md)
 - [OtherincomeGetCommunicationrecipientsV1Response](docs/OtherincomeGetCommunicationrecipientsV1Response.md)
 - [OtherincomeGetCommunicationrecipientsV1ResponseMPayload](docs/OtherincomeGetCommunicationrecipientsV1ResponseMPayload.md)
 - [OtherincomeGetCommunicationsendersV1Response](docs/OtherincomeGetCommunicationsendersV1Response.md)
 - [OtherincomeGetCommunicationsendersV1ResponseMPayload](docs/OtherincomeGetCommunicationsendersV1ResponseMPayload.md)
 - [PaymenttermAutocompleteElementResponse](docs/PaymenttermAutocompleteElementResponse.md)
 - [PaymenttermCreateObjectV1Request](docs/PaymenttermCreateObjectV1Request.md)
 - [PaymenttermCreateObjectV1Response](docs/PaymenttermCreateObjectV1Response.md)
 - [PaymenttermCreateObjectV1ResponseMPayload](docs/PaymenttermCreateObjectV1ResponseMPayload.md)
 - [PaymenttermEditObjectV1Request](docs/PaymenttermEditObjectV1Request.md)
 - [PaymenttermEditObjectV1Response](docs/PaymenttermEditObjectV1Response.md)
 - [PaymenttermGetAutocompleteV2Response](docs/PaymenttermGetAutocompleteV2Response.md)
 - [PaymenttermGetAutocompleteV2ResponseMPayload](docs/PaymenttermGetAutocompleteV2ResponseMPayload.md)
 - [PaymenttermGetListV1Response](docs/PaymenttermGetListV1Response.md)
 - [PaymenttermGetListV1ResponseMPayload](docs/PaymenttermGetListV1ResponseMPayload.md)
 - [PaymenttermGetObjectV2Response](docs/PaymenttermGetObjectV2Response.md)
 - [PaymenttermGetObjectV2ResponseMPayload](docs/PaymenttermGetObjectV2ResponseMPayload.md)
 - [PaymenttermListElement](docs/PaymenttermListElement.md)
 - [PaymenttermRequest](docs/PaymenttermRequest.md)
 - [PaymenttermRequestCompound](docs/PaymenttermRequestCompound.md)
 - [PaymenttermResponse](docs/PaymenttermResponse.md)
 - [PaymenttermResponseCompound](docs/PaymenttermResponseCompound.md)
 - [PdfalevelAutocompleteElementResponse](docs/PdfalevelAutocompleteElementResponse.md)
 - [PdfalevelGetAutocompleteV2Response](docs/PdfalevelGetAutocompleteV2Response.md)
 - [PdfalevelGetAutocompleteV2ResponseMPayload](docs/PdfalevelGetAutocompleteV2ResponseMPayload.md)
 - [PeriodAutocompleteElementResponse](docs/PeriodAutocompleteElementResponse.md)
 - [PeriodGetAutocompleteV2Response](docs/PeriodGetAutocompleteV2Response.md)
 - [PeriodGetAutocompleteV2ResponseMPayload](docs/PeriodGetAutocompleteV2ResponseMPayload.md)
 - [PermissionCreateObjectV1Request](docs/PermissionCreateObjectV1Request.md)
 - [PermissionCreateObjectV1Response](docs/PermissionCreateObjectV1Response.md)
 - [PermissionCreateObjectV1ResponseMPayload](docs/PermissionCreateObjectV1ResponseMPayload.md)
 - [PermissionDeleteObjectV1Response](docs/PermissionDeleteObjectV1Response.md)
 - [PermissionEditObjectV1Request](docs/PermissionEditObjectV1Request.md)
 - [PermissionEditObjectV1Response](docs/PermissionEditObjectV1Response.md)
 - [PermissionGetObjectV2Response](docs/PermissionGetObjectV2Response.md)
 - [PermissionGetObjectV2ResponseMPayload](docs/PermissionGetObjectV2ResponseMPayload.md)
 - [PermissionRequest](docs/PermissionRequest.md)
 - [PermissionRequestCompound](docs/PermissionRequestCompound.md)
 - [PermissionResponse](docs/PermissionResponse.md)
 - [PermissionResponseCompound](docs/PermissionResponseCompound.md)
 - [PhoneRequest](docs/PhoneRequest.md)
 - [PhoneRequestCompound](docs/PhoneRequestCompound.md)
 - [PhoneRequestCompoundV2](docs/PhoneRequestCompoundV2.md)
 - [PhoneRequestV2](docs/PhoneRequestV2.md)
 - [PhoneResponse](docs/PhoneResponse.md)
 - [PhoneResponseCompound](docs/PhoneResponseCompound.md)
 - [PhonetypeAutocompleteElementResponse](docs/PhonetypeAutocompleteElementResponse.md)
 - [PhonetypeGetAutocompleteV2Response](docs/PhonetypeGetAutocompleteV2Response.md)
 - [PhonetypeGetAutocompleteV2ResponseMPayload](docs/PhonetypeGetAutocompleteV2ResponseMPayload.md)
 - [ProvinceAutocompleteElementResponse](docs/ProvinceAutocompleteElementResponse.md)
 - [ProvinceGetAutocompleteV2Response](docs/ProvinceGetAutocompleteV2Response.md)
 - [ProvinceGetAutocompleteV2ResponseMPayload](docs/ProvinceGetAutocompleteV2ResponseMPayload.md)
 - [RejectedoffertopurchaseGetCommunicationCountV1Response](docs/RejectedoffertopurchaseGetCommunicationCountV1Response.md)
 - [RejectedoffertopurchaseGetCommunicationCountV1ResponseMPayload](docs/RejectedoffertopurchaseGetCommunicationCountV1ResponseMPayload.md)
 - [RejectedoffertopurchaseGetCommunicationListV1Response](docs/RejectedoffertopurchaseGetCommunicationListV1Response.md)
 - [RejectedoffertopurchaseGetCommunicationListV1ResponseMPayload](docs/RejectedoffertopurchaseGetCommunicationListV1ResponseMPayload.md)
 - [RejectedoffertopurchaseGetCommunicationrecipientsV1Response](docs/RejectedoffertopurchaseGetCommunicationrecipientsV1Response.md)
 - [RejectedoffertopurchaseGetCommunicationrecipientsV1ResponseMPayload](docs/RejectedoffertopurchaseGetCommunicationrecipientsV1ResponseMPayload.md)
 - [RejectedoffertopurchaseGetCommunicationsendersV1Response](docs/RejectedoffertopurchaseGetCommunicationsendersV1Response.md)
 - [RejectedoffertopurchaseGetCommunicationsendersV1ResponseMPayload](docs/RejectedoffertopurchaseGetCommunicationsendersV1ResponseMPayload.md)
 - [ScimAuthenticationScheme](docs/ScimAuthenticationScheme.md)
 - [ScimEmail](docs/ScimEmail.md)
 - [ScimGroup](docs/ScimGroup.md)
 - [ScimGroupMember](docs/ScimGroupMember.md)
 - [ScimServiceProviderConfig](docs/ScimServiceProviderConfig.md)
 - [ScimServiceProviderConfigBulk](docs/ScimServiceProviderConfigBulk.md)
 - [ScimServiceProviderConfigChangePassword](docs/ScimServiceProviderConfigChangePassword.md)
 - [ScimServiceProviderConfigEtag](docs/ScimServiceProviderConfigEtag.md)
 - [ScimServiceProviderConfigFilter](docs/ScimServiceProviderConfigFilter.md)
 - [ScimServiceProviderConfigPatch](docs/ScimServiceProviderConfigPatch.md)
 - [ScimServiceProviderConfigSort](docs/ScimServiceProviderConfigSort.md)
 - [ScimUser](docs/ScimUser.md)
 - [ScimUserList](docs/ScimUserList.md)
 - [SecretquestionAutocompleteElementResponse](docs/SecretquestionAutocompleteElementResponse.md)
 - [SecretquestionGetAutocompleteV2Response](docs/SecretquestionGetAutocompleteV2Response.md)
 - [SecretquestionGetAutocompleteV2ResponseMPayload](docs/SecretquestionGetAutocompleteV2ResponseMPayload.md)
 - [SessionhistoryGetListV1Response](docs/SessionhistoryGetListV1Response.md)
 - [SessionhistoryGetListV1ResponseMPayload](docs/SessionhistoryGetListV1ResponseMPayload.md)
 - [SessionhistoryListElement](docs/SessionhistoryListElement.md)
 - [SignatureCreateObjectV1Request](docs/SignatureCreateObjectV1Request.md)
 - [SignatureCreateObjectV1Response](docs/SignatureCreateObjectV1Response.md)
 - [SignatureCreateObjectV1ResponseMPayload](docs/SignatureCreateObjectV1ResponseMPayload.md)
 - [SignatureDeleteObjectV1Response](docs/SignatureDeleteObjectV1Response.md)
 - [SignatureEditObjectV1Request](docs/SignatureEditObjectV1Request.md)
 - [SignatureEditObjectV1Response](docs/SignatureEditObjectV1Response.md)
 - [SignatureGetObjectV2Response](docs/SignatureGetObjectV2Response.md)
 - [SignatureGetObjectV2ResponseMPayload](docs/SignatureGetObjectV2ResponseMPayload.md)
 - [SignatureGetObjectV3Response](docs/SignatureGetObjectV3Response.md)
 - [SignatureGetObjectV3ResponseMPayload](docs/SignatureGetObjectV3ResponseMPayload.md)
 - [SignatureRequest](docs/SignatureRequest.md)
 - [SignatureRequestCompound](docs/SignatureRequestCompound.md)
 - [SignatureResponse](docs/SignatureResponse.md)
 - [SignatureResponseCompound](docs/SignatureResponseCompound.md)
 - [SignatureResponseCompoundV3](docs/SignatureResponseCompoundV3.md)
 - [SignatureResponseV3](docs/SignatureResponseV3.md)
 - [SubnetCreateObjectV1Request](docs/SubnetCreateObjectV1Request.md)
 - [SubnetCreateObjectV1Response](docs/SubnetCreateObjectV1Response.md)
 - [SubnetCreateObjectV1ResponseMPayload](docs/SubnetCreateObjectV1ResponseMPayload.md)
 - [SubnetDeleteObjectV1Response](docs/SubnetDeleteObjectV1Response.md)
 - [SubnetEditObjectV1Request](docs/SubnetEditObjectV1Request.md)
 - [SubnetEditObjectV1Response](docs/SubnetEditObjectV1Response.md)
 - [SubnetGetObjectV2Response](docs/SubnetGetObjectV2Response.md)
 - [SubnetGetObjectV2ResponseMPayload](docs/SubnetGetObjectV2ResponseMPayload.md)
 - [SubnetRequest](docs/SubnetRequest.md)
 - [SubnetRequestCompound](docs/SubnetRequestCompound.md)
 - [SubnetResponse](docs/SubnetResponse.md)
 - [SubnetResponseCompound](docs/SubnetResponseCompound.md)
 - [SupplyAutocompleteElementResponse](docs/SupplyAutocompleteElementResponse.md)
 - [SupplyCreateObjectV1Request](docs/SupplyCreateObjectV1Request.md)
 - [SupplyCreateObjectV1Response](docs/SupplyCreateObjectV1Response.md)
 - [SupplyCreateObjectV1ResponseMPayload](docs/SupplyCreateObjectV1ResponseMPayload.md)
 - [SupplyDeleteObjectV1Response](docs/SupplyDeleteObjectV1Response.md)
 - [SupplyEditObjectV1Request](docs/SupplyEditObjectV1Request.md)
 - [SupplyEditObjectV1Response](docs/SupplyEditObjectV1Response.md)
 - [SupplyGetAutocompleteV2Response](docs/SupplyGetAutocompleteV2Response.md)
 - [SupplyGetAutocompleteV2ResponseMPayload](docs/SupplyGetAutocompleteV2ResponseMPayload.md)
 - [SupplyGetListV1Response](docs/SupplyGetListV1Response.md)
 - [SupplyGetListV1ResponseMPayload](docs/SupplyGetListV1ResponseMPayload.md)
 - [SupplyGetObjectV2Response](docs/SupplyGetObjectV2Response.md)
 - [SupplyGetObjectV2ResponseMPayload](docs/SupplyGetObjectV2ResponseMPayload.md)
 - [SupplyListElement](docs/SupplyListElement.md)
 - [SupplyRequest](docs/SupplyRequest.md)
 - [SupplyRequestCompound](docs/SupplyRequestCompound.md)
 - [SupplyResponse](docs/SupplyResponse.md)
 - [SupplyResponseCompound](docs/SupplyResponseCompound.md)
 - [SystemconfigurationEditObjectV1Request](docs/SystemconfigurationEditObjectV1Request.md)
 - [SystemconfigurationEditObjectV1Response](docs/SystemconfigurationEditObjectV1Response.md)
 - [SystemconfigurationGetObjectV2Response](docs/SystemconfigurationGetObjectV2Response.md)
 - [SystemconfigurationGetObjectV2ResponseMPayload](docs/SystemconfigurationGetObjectV2ResponseMPayload.md)
 - [SystemconfigurationRequest](docs/SystemconfigurationRequest.md)
 - [SystemconfigurationRequestCompound](docs/SystemconfigurationRequestCompound.md)
 - [SystemconfigurationResponse](docs/SystemconfigurationResponse.md)
 - [SystemconfigurationResponseCompound](docs/SystemconfigurationResponseCompound.md)
 - [TaxassignmentAutocompleteElementResponse](docs/TaxassignmentAutocompleteElementResponse.md)
 - [TaxassignmentGetAutocompleteV2Response](docs/TaxassignmentGetAutocompleteV2Response.md)
 - [TaxassignmentGetAutocompleteV2ResponseMPayload](docs/TaxassignmentGetAutocompleteV2ResponseMPayload.md)
 - [TextstylestaticRequest](docs/TextstylestaticRequest.md)
 - [TextstylestaticRequestCompound](docs/TextstylestaticRequestCompound.md)
 - [TextstylestaticResponse](docs/TextstylestaticResponse.md)
 - [TextstylestaticResponseCompound](docs/TextstylestaticResponseCompound.md)
 - [TimezoneAutocompleteElementResponse](docs/TimezoneAutocompleteElementResponse.md)
 - [TimezoneGetAutocompleteV2Response](docs/TimezoneGetAutocompleteV2Response.md)
 - [TimezoneGetAutocompleteV2ResponseMPayload](docs/TimezoneGetAutocompleteV2ResponseMPayload.md)
 - [TranqcontractGetCommunicationCountV1Response](docs/TranqcontractGetCommunicationCountV1Response.md)
 - [TranqcontractGetCommunicationCountV1ResponseMPayload](docs/TranqcontractGetCommunicationCountV1ResponseMPayload.md)
 - [TranqcontractGetCommunicationListV1Response](docs/TranqcontractGetCommunicationListV1Response.md)
 - [TranqcontractGetCommunicationListV1ResponseMPayload](docs/TranqcontractGetCommunicationListV1ResponseMPayload.md)
 - [TranqcontractGetCommunicationrecipientsV1Response](docs/TranqcontractGetCommunicationrecipientsV1Response.md)
 - [TranqcontractGetCommunicationrecipientsV1ResponseMPayload](docs/TranqcontractGetCommunicationrecipientsV1ResponseMPayload.md)
 - [TranqcontractGetCommunicationsendersV1Response](docs/TranqcontractGetCommunicationsendersV1Response.md)
 - [TranqcontractGetCommunicationsendersV1ResponseMPayload](docs/TranqcontractGetCommunicationsendersV1ResponseMPayload.md)
 - [UserAutocompleteElementResponse](docs/UserAutocompleteElementResponse.md)
 - [UserCreateEzsignuserV1Request](docs/UserCreateEzsignuserV1Request.md)
 - [UserCreateEzsignuserV1Response](docs/UserCreateEzsignuserV1Response.md)
 - [UserCreateEzsignuserV1ResponseMPayload](docs/UserCreateEzsignuserV1ResponseMPayload.md)
 - [UserCreateObjectV1Request](docs/UserCreateObjectV1Request.md)
 - [UserCreateObjectV1Response](docs/UserCreateObjectV1Response.md)
 - [UserCreateObjectV1ResponseMPayload](docs/UserCreateObjectV1ResponseMPayload.md)
 - [UserCreateObjectV2Request](docs/UserCreateObjectV2Request.md)
 - [UserCreateObjectV2Response](docs/UserCreateObjectV2Response.md)
 - [UserCreateObjectV2ResponseMPayload](docs/UserCreateObjectV2ResponseMPayload.md)
 - [UserEditColleaguesV2Request](docs/UserEditColleaguesV2Request.md)
 - [UserEditColleaguesV2Response](docs/UserEditColleaguesV2Response.md)
 - [UserEditColleaguesV2ResponseMPayload](docs/UserEditColleaguesV2ResponseMPayload.md)
 - [UserEditObjectV1Request](docs/UserEditObjectV1Request.md)
 - [UserEditObjectV1Response](docs/UserEditObjectV1Response.md)
 - [UserEditPermissionsV1Request](docs/UserEditPermissionsV1Request.md)
 - [UserEditPermissionsV1Response](docs/UserEditPermissionsV1Response.md)
 - [UserEditPermissionsV1ResponseMPayload](docs/UserEditPermissionsV1ResponseMPayload.md)
 - [UserGetApikeysV1Response](docs/UserGetApikeysV1Response.md)
 - [UserGetApikeysV1ResponseMPayload](docs/UserGetApikeysV1ResponseMPayload.md)
 - [UserGetAutocompleteV2Response](docs/UserGetAutocompleteV2Response.md)
 - [UserGetAutocompleteV2ResponseMPayload](docs/UserGetAutocompleteV2ResponseMPayload.md)
 - [UserGetColleaguesV2Response](docs/UserGetColleaguesV2Response.md)
 - [UserGetColleaguesV2ResponseMPayload](docs/UserGetColleaguesV2ResponseMPayload.md)
 - [UserGetEffectivePermissionsV1Response](docs/UserGetEffectivePermissionsV1Response.md)
 - [UserGetEffectivePermissionsV1ResponseMPayload](docs/UserGetEffectivePermissionsV1ResponseMPayload.md)
 - [UserGetListV1Response](docs/UserGetListV1Response.md)
 - [UserGetListV1ResponseMPayload](docs/UserGetListV1ResponseMPayload.md)
 - [UserGetObjectV2Response](docs/UserGetObjectV2Response.md)
 - [UserGetObjectV2ResponseMPayload](docs/UserGetObjectV2ResponseMPayload.md)
 - [UserGetPermissionsV1Response](docs/UserGetPermissionsV1Response.md)
 - [UserGetPermissionsV1ResponseMPayload](docs/UserGetPermissionsV1ResponseMPayload.md)
 - [UserGetSubnetsV1Response](docs/UserGetSubnetsV1Response.md)
 - [UserGetSubnetsV1ResponseMPayload](docs/UserGetSubnetsV1ResponseMPayload.md)
 - [UserGetUsergroupexternalsV1Response](docs/UserGetUsergroupexternalsV1Response.md)
 - [UserGetUsergroupexternalsV1ResponseMPayload](docs/UserGetUsergroupexternalsV1ResponseMPayload.md)
 - [UserGetUsergroupsV1Response](docs/UserGetUsergroupsV1Response.md)
 - [UserGetUsergroupsV1ResponseMPayload](docs/UserGetUsergroupsV1ResponseMPayload.md)
 - [UserListElement](docs/UserListElement.md)
 - [UserRequest](docs/UserRequest.md)
 - [UserRequestCompound](docs/UserRequestCompound.md)
 - [UserRequestCompoundV2](docs/UserRequestCompoundV2.md)
 - [UserRequestV2](docs/UserRequestV2.md)
 - [UserResponse](docs/UserResponse.md)
 - [UserResponseCompound](docs/UserResponseCompound.md)
 - [UserSendPasswordResetV1Response](docs/UserSendPasswordResetV1Response.md)
 - [UsergroupAutocompleteElementResponse](docs/UsergroupAutocompleteElementResponse.md)
 - [UsergroupCreateObjectV1Request](docs/UsergroupCreateObjectV1Request.md)
 - [UsergroupCreateObjectV1Response](docs/UsergroupCreateObjectV1Response.md)
 - [UsergroupCreateObjectV1ResponseMPayload](docs/UsergroupCreateObjectV1ResponseMPayload.md)
 - [UsergroupEditObjectV1Request](docs/UsergroupEditObjectV1Request.md)
 - [UsergroupEditObjectV1Response](docs/UsergroupEditObjectV1Response.md)
 - [UsergroupEditPermissionsV1Request](docs/UsergroupEditPermissionsV1Request.md)
 - [UsergroupEditPermissionsV1Response](docs/UsergroupEditPermissionsV1Response.md)
 - [UsergroupEditPermissionsV1ResponseMPayload](docs/UsergroupEditPermissionsV1ResponseMPayload.md)
 - [UsergroupEditUsergroupdelegationsV1Request](docs/UsergroupEditUsergroupdelegationsV1Request.md)
 - [UsergroupEditUsergroupdelegationsV1Response](docs/UsergroupEditUsergroupdelegationsV1Response.md)
 - [UsergroupEditUsergroupdelegationsV1ResponseMPayload](docs/UsergroupEditUsergroupdelegationsV1ResponseMPayload.md)
 - [UsergroupEditUsergroupmembershipsV1Request](docs/UsergroupEditUsergroupmembershipsV1Request.md)
 - [UsergroupEditUsergroupmembershipsV1Response](docs/UsergroupEditUsergroupmembershipsV1Response.md)
 - [UsergroupEditUsergroupmembershipsV1ResponseMPayload](docs/UsergroupEditUsergroupmembershipsV1ResponseMPayload.md)
 - [UsergroupGetAutocompleteV2Response](docs/UsergroupGetAutocompleteV2Response.md)
 - [UsergroupGetAutocompleteV2ResponseMPayload](docs/UsergroupGetAutocompleteV2ResponseMPayload.md)
 - [UsergroupGetListV1Response](docs/UsergroupGetListV1Response.md)
 - [UsergroupGetListV1ResponseMPayload](docs/UsergroupGetListV1ResponseMPayload.md)
 - [UsergroupGetObjectV2Response](docs/UsergroupGetObjectV2Response.md)
 - [UsergroupGetObjectV2ResponseMPayload](docs/UsergroupGetObjectV2ResponseMPayload.md)
 - [UsergroupGetPermissionsV1Response](docs/UsergroupGetPermissionsV1Response.md)
 - [UsergroupGetPermissionsV1ResponseMPayload](docs/UsergroupGetPermissionsV1ResponseMPayload.md)
 - [UsergroupGetUsergroupdelegationsV1Response](docs/UsergroupGetUsergroupdelegationsV1Response.md)
 - [UsergroupGetUsergroupdelegationsV1ResponseMPayload](docs/UsergroupGetUsergroupdelegationsV1ResponseMPayload.md)
 - [UsergroupGetUsergroupmembershipsV1Response](docs/UsergroupGetUsergroupmembershipsV1Response.md)
 - [UsergroupGetUsergroupmembershipsV1ResponseMPayload](docs/UsergroupGetUsergroupmembershipsV1ResponseMPayload.md)
 - [UsergroupListElement](docs/UsergroupListElement.md)
 - [UsergroupRequest](docs/UsergroupRequest.md)
 - [UsergroupRequestCompound](docs/UsergroupRequestCompound.md)
 - [UsergroupResponse](docs/UsergroupResponse.md)
 - [UsergroupResponseCompound](docs/UsergroupResponseCompound.md)
 - [UsergroupdelegationCreateObjectV1Request](docs/UsergroupdelegationCreateObjectV1Request.md)
 - [UsergroupdelegationCreateObjectV1Response](docs/UsergroupdelegationCreateObjectV1Response.md)
 - [UsergroupdelegationCreateObjectV1ResponseMPayload](docs/UsergroupdelegationCreateObjectV1ResponseMPayload.md)
 - [UsergroupdelegationDeleteObjectV1Response](docs/UsergroupdelegationDeleteObjectV1Response.md)
 - [UsergroupdelegationEditObjectV1Request](docs/UsergroupdelegationEditObjectV1Request.md)
 - [UsergroupdelegationEditObjectV1Response](docs/UsergroupdelegationEditObjectV1Response.md)
 - [UsergroupdelegationGetObjectV2Response](docs/UsergroupdelegationGetObjectV2Response.md)
 - [UsergroupdelegationGetObjectV2ResponseMPayload](docs/UsergroupdelegationGetObjectV2ResponseMPayload.md)
 - [UsergroupdelegationRequest](docs/UsergroupdelegationRequest.md)
 - [UsergroupdelegationRequestCompound](docs/UsergroupdelegationRequestCompound.md)
 - [UsergroupdelegationResponse](docs/UsergroupdelegationResponse.md)
 - [UsergroupdelegationResponseCompound](docs/UsergroupdelegationResponseCompound.md)
 - [UsergroupexternalAutocompleteElementResponse](docs/UsergroupexternalAutocompleteElementResponse.md)
 - [UsergroupexternalCreateObjectV1Request](docs/UsergroupexternalCreateObjectV1Request.md)
 - [UsergroupexternalCreateObjectV1Response](docs/UsergroupexternalCreateObjectV1Response.md)
 - [UsergroupexternalCreateObjectV1ResponseMPayload](docs/UsergroupexternalCreateObjectV1ResponseMPayload.md)
 - [UsergroupexternalDeleteObjectV1Response](docs/UsergroupexternalDeleteObjectV1Response.md)
 - [UsergroupexternalEditObjectV1Request](docs/UsergroupexternalEditObjectV1Request.md)
 - [UsergroupexternalEditObjectV1Response](docs/UsergroupexternalEditObjectV1Response.md)
 - [UsergroupexternalGetAutocompleteV2Response](docs/UsergroupexternalGetAutocompleteV2Response.md)
 - [UsergroupexternalGetAutocompleteV2ResponseMPayload](docs/UsergroupexternalGetAutocompleteV2ResponseMPayload.md)
 - [UsergroupexternalGetListV1Response](docs/UsergroupexternalGetListV1Response.md)
 - [UsergroupexternalGetListV1ResponseMPayload](docs/UsergroupexternalGetListV1ResponseMPayload.md)
 - [UsergroupexternalGetObjectV2Response](docs/UsergroupexternalGetObjectV2Response.md)
 - [UsergroupexternalGetObjectV2ResponseMPayload](docs/UsergroupexternalGetObjectV2ResponseMPayload.md)
 - [UsergroupexternalGetUsergroupexternalmembershipsV1Response](docs/UsergroupexternalGetUsergroupexternalmembershipsV1Response.md)
 - [UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload](docs/UsergroupexternalGetUsergroupexternalmembershipsV1ResponseMPayload.md)
 - [UsergroupexternalGetUsergroupsV1Response](docs/UsergroupexternalGetUsergroupsV1Response.md)
 - [UsergroupexternalGetUsergroupsV1ResponseMPayload](docs/UsergroupexternalGetUsergroupsV1ResponseMPayload.md)
 - [UsergroupexternalListElement](docs/UsergroupexternalListElement.md)
 - [UsergroupexternalRequest](docs/UsergroupexternalRequest.md)
 - [UsergroupexternalRequestCompound](docs/UsergroupexternalRequestCompound.md)
 - [UsergroupexternalResponse](docs/UsergroupexternalResponse.md)
 - [UsergroupexternalResponseCompound](docs/UsergroupexternalResponseCompound.md)
 - [UsergroupexternalmembershipResponse](docs/UsergroupexternalmembershipResponse.md)
 - [UsergroupexternalmembershipResponseCompound](docs/UsergroupexternalmembershipResponseCompound.md)
 - [UsergroupmembershipCreateObjectV1Request](docs/UsergroupmembershipCreateObjectV1Request.md)
 - [UsergroupmembershipCreateObjectV1Response](docs/UsergroupmembershipCreateObjectV1Response.md)
 - [UsergroupmembershipCreateObjectV1ResponseMPayload](docs/UsergroupmembershipCreateObjectV1ResponseMPayload.md)
 - [UsergroupmembershipDeleteObjectV1Response](docs/UsergroupmembershipDeleteObjectV1Response.md)
 - [UsergroupmembershipEditObjectV1Request](docs/UsergroupmembershipEditObjectV1Request.md)
 - [UsergroupmembershipEditObjectV1Response](docs/UsergroupmembershipEditObjectV1Response.md)
 - [UsergroupmembershipGetObjectV2Response](docs/UsergroupmembershipGetObjectV2Response.md)
 - [UsergroupmembershipGetObjectV2ResponseMPayload](docs/UsergroupmembershipGetObjectV2ResponseMPayload.md)
 - [UsergroupmembershipRequest](docs/UsergroupmembershipRequest.md)
 - [UsergroupmembershipRequestCompound](docs/UsergroupmembershipRequestCompound.md)
 - [UsergroupmembershipResponse](docs/UsergroupmembershipResponse.md)
 - [UsergroupmembershipResponseCompound](docs/UsergroupmembershipResponseCompound.md)
 - [UserlogintypeAutocompleteElementResponse](docs/UserlogintypeAutocompleteElementResponse.md)
 - [UserlogintypeGetAutocompleteV2Response](docs/UserlogintypeGetAutocompleteV2Response.md)
 - [UserlogintypeGetAutocompleteV2ResponseMPayload](docs/UserlogintypeGetAutocompleteV2ResponseMPayload.md)
 - [UserlogintypeResponse](docs/UserlogintypeResponse.md)
 - [UserstagedCreateUserV1Response](docs/UserstagedCreateUserV1Response.md)
 - [UserstagedCreateUserV1ResponseMPayload](docs/UserstagedCreateUserV1ResponseMPayload.md)
 - [UserstagedDeleteObjectV1Response](docs/UserstagedDeleteObjectV1Response.md)
 - [UserstagedGetListV1Response](docs/UserstagedGetListV1Response.md)
 - [UserstagedGetListV1ResponseMPayload](docs/UserstagedGetListV1ResponseMPayload.md)
 - [UserstagedGetObjectV2Response](docs/UserstagedGetObjectV2Response.md)
 - [UserstagedGetObjectV2ResponseMPayload](docs/UserstagedGetObjectV2ResponseMPayload.md)
 - [UserstagedListElement](docs/UserstagedListElement.md)
 - [UserstagedMapV1Request](docs/UserstagedMapV1Request.md)
 - [UserstagedMapV1Response](docs/UserstagedMapV1Response.md)
 - [UserstagedResponse](docs/UserstagedResponse.md)
 - [UserstagedResponseCompound](docs/UserstagedResponseCompound.md)
 - [VariableexpenseAutocompleteElementResponse](docs/VariableexpenseAutocompleteElementResponse.md)
 - [VariableexpenseCreateObjectV1Request](docs/VariableexpenseCreateObjectV1Request.md)
 - [VariableexpenseCreateObjectV1Response](docs/VariableexpenseCreateObjectV1Response.md)
 - [VariableexpenseCreateObjectV1ResponseMPayload](docs/VariableexpenseCreateObjectV1ResponseMPayload.md)
 - [VariableexpenseEditObjectV1Request](docs/VariableexpenseEditObjectV1Request.md)
 - [VariableexpenseEditObjectV1Response](docs/VariableexpenseEditObjectV1Response.md)
 - [VariableexpenseGetAutocompleteV2Response](docs/VariableexpenseGetAutocompleteV2Response.md)
 - [VariableexpenseGetAutocompleteV2ResponseMPayload](docs/VariableexpenseGetAutocompleteV2ResponseMPayload.md)
 - [VariableexpenseGetListV1Response](docs/VariableexpenseGetListV1Response.md)
 - [VariableexpenseGetListV1ResponseMPayload](docs/VariableexpenseGetListV1ResponseMPayload.md)
 - [VariableexpenseGetObjectV2Response](docs/VariableexpenseGetObjectV2Response.md)
 - [VariableexpenseGetObjectV2ResponseMPayload](docs/VariableexpenseGetObjectV2ResponseMPayload.md)
 - [VariableexpenseListElement](docs/VariableexpenseListElement.md)
 - [VariableexpenseRequest](docs/VariableexpenseRequest.md)
 - [VariableexpenseRequestCompound](docs/VariableexpenseRequestCompound.md)
 - [VariableexpenseResponse](docs/VariableexpenseResponse.md)
 - [VariableexpenseResponseCompound](docs/VariableexpenseResponseCompound.md)
 - [VersionhistoryGetObjectV2Response](docs/VersionhistoryGetObjectV2Response.md)
 - [VersionhistoryGetObjectV2ResponseMPayload](docs/VersionhistoryGetObjectV2ResponseMPayload.md)
 - [VersionhistoryResponse](docs/VersionhistoryResponse.md)
 - [VersionhistoryResponseCompound](docs/VersionhistoryResponseCompound.md)
 - [WebhookCreateObjectV2Request](docs/WebhookCreateObjectV2Request.md)
 - [WebhookCreateObjectV2Response](docs/WebhookCreateObjectV2Response.md)
 - [WebhookCreateObjectV2ResponseMPayload](docs/WebhookCreateObjectV2ResponseMPayload.md)
 - [WebhookDeleteObjectV1Response](docs/WebhookDeleteObjectV1Response.md)
 - [WebhookEditObjectV1Request](docs/WebhookEditObjectV1Request.md)
 - [WebhookEditObjectV1Response](docs/WebhookEditObjectV1Response.md)
 - [WebhookEzsignDocumentCompleted](docs/WebhookEzsignDocumentCompleted.md)
 - [WebhookEzsignDocumentFormCompleted](docs/WebhookEzsignDocumentFormCompleted.md)
 - [WebhookEzsignDocumentUnsent](docs/WebhookEzsignDocumentUnsent.md)
 - [WebhookEzsignEzsignsignerAcceptclause](docs/WebhookEzsignEzsignsignerAcceptclause.md)
 - [WebhookEzsignEzsignsignerConnect](docs/WebhookEzsignEzsignsignerConnect.md)
 - [WebhookEzsignFolderCompleted](docs/WebhookEzsignFolderCompleted.md)
 - [WebhookEzsignFolderDisposed](docs/WebhookEzsignFolderDisposed.md)
 - [WebhookEzsignFolderSent](docs/WebhookEzsignFolderSent.md)
 - [WebhookEzsignFolderUnsent](docs/WebhookEzsignFolderUnsent.md)
 - [WebhookEzsignSignatureSigned](docs/WebhookEzsignSignatureSigned.md)
 - [WebhookGetHistoryV1Response](docs/WebhookGetHistoryV1Response.md)
 - [WebhookGetHistoryV1ResponseMPayload](docs/WebhookGetHistoryV1ResponseMPayload.md)
 - [WebhookGetListV1Response](docs/WebhookGetListV1Response.md)
 - [WebhookGetListV1ResponseMPayload](docs/WebhookGetListV1ResponseMPayload.md)
 - [WebhookGetObjectV2Response](docs/WebhookGetObjectV2Response.md)
 - [WebhookGetObjectV2ResponseMPayload](docs/WebhookGetObjectV2ResponseMPayload.md)
 - [WebhookListElement](docs/WebhookListElement.md)
 - [WebhookRegenerateApikeyV1Request](docs/WebhookRegenerateApikeyV1Request.md)
 - [WebhookRegenerateApikeyV1Response](docs/WebhookRegenerateApikeyV1Response.md)
 - [WebhookRegenerateApikeyV1ResponseMPayload](docs/WebhookRegenerateApikeyV1ResponseMPayload.md)
 - [WebhookRequest](docs/WebhookRequest.md)
 - [WebhookRequestCompound](docs/WebhookRequestCompound.md)
 - [WebhookResponse](docs/WebhookResponse.md)
 - [WebhookResponseCompound](docs/WebhookResponseCompound.md)
 - [WebhookSendWebhookV1Request](docs/WebhookSendWebhookV1Request.md)
 - [WebhookSendWebhookV1Response](docs/WebhookSendWebhookV1Response.md)
 - [WebhookTestV1Response](docs/WebhookTestV1Response.md)
 - [WebhookUserUserCreated](docs/WebhookUserUserCreated.md)
 - [WebhookUserstagedUserstagedCreated](docs/WebhookUserstagedUserstagedCreated.md)
 - [WebhookheaderRequest](docs/WebhookheaderRequest.md)
 - [WebhookheaderRequestCompound](docs/WebhookheaderRequestCompound.md)
 - [WebhookheaderResponse](docs/WebhookheaderResponse.md)
 - [WebhookheaderResponseCompound](docs/WebhookheaderResponseCompound.md)
 - [WebsiteRequest](docs/WebsiteRequest.md)
 - [WebsiteRequestCompound](docs/WebsiteRequestCompound.md)
 - [WebsiteResponse](docs/WebsiteResponse.md)
 - [WebsiteResponseCompound](docs/WebsiteResponseCompound.md)
 - [WebsocketRequestServerGetWebsocketIDV1](docs/WebsocketRequestServerGetWebsocketIDV1.md)
 - [WebsocketResponseErrorV1](docs/WebsocketResponseErrorV1.md)
 - [WebsocketResponseErrorV1MPayload](docs/WebsocketResponseErrorV1MPayload.md)
 - [WebsocketResponseGetWebsocketIDV1](docs/WebsocketResponseGetWebsocketIDV1.md)
 - [WebsocketResponseGetWebsocketIDV1MPayload](docs/WebsocketResponseGetWebsocketIDV1MPayload.md)
 - [WebsocketResponseInformationV1](docs/WebsocketResponseInformationV1.md)
 - [WebsocketResponseInformationV1MPayload](docs/WebsocketResponseInformationV1MPayload.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Authorization

- **Type**: API key

- **API key parameter name**: Authorization
- **Location**: HTTP header

### Bearer

- **Type**: HTTP Bearer Token authentication

### Presigned

- **Type**: API key

- **API key parameter name**: sAuthorization
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support-api@ezmax.ca

