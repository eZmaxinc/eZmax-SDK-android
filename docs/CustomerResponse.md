

# CustomerResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiCustomerID** | **Integer** | The unique ID of the Customer. | 
**fkiCompanyID** | **Integer** | The unique ID of the Company | 
**fkiCustomergroupID** | **Integer** | The unique ID of the Customergroup | 
**sCustomerName** | **String** | The name of the Customer | 
**fkiContactinformationsID** | **Integer** | The unique ID of the Contactinformations | 
**fkiContactcontainerID** | **Integer** | The unique ID of the Contactcontainer | 
**fkiImageID** | **Integer** | The unique ID of the Image | 
**fkiGlaccountcontainerID** | **Integer** | The unique ID of the Glaccountcontainer | 
**fkiLanguageID** | **Integer** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| | 
**fkiDepartmentID** | **Integer** | The unique ID of the Department | 
**fkiPaymentmethodID** | **Integer** | The unique ID of the Paymentmethod | 
**fkiElectronicfundstransferbankaccountID** | **Integer** | The unique ID of the Electronicfundstransferbankaccount | 
**fkiElectronicfundstransferbankaccountIDDirectdebit** | **Integer** | The unique ID of the Electronicfundstransferbankaccount | 
**fkiSendingmethodID** | **Integer** | The unique ID of the Sendingmethod | 
**fkiTaxassignmentID** | **Integer** | The unique ID of the Taxassignment.  Valid values:  |Value|Description| |-|-| |1|No tax| |2|GST| |3|HST (ON)| |4|HST (NB)| |5|HST (NS)| |6|HST (NL)| |7|HST (PE)| |8|GST + QST (QC)| |9|GST + QST (QC) Non-Recoverable| |10|GST + PST (BC)| |11|GST + PST (SK)| |12|GST + RST (MB)| |13|GST + PST (BC) Non-Recoverable| |14|GST + PST (SK) Non-Recoverable| |15|GST + RST (MB) Non-Recoverable| | 
**fkiAttendancestatusID** | **Integer** | The unique ID of the Attendancestatus | 
**fkiAgentIDVariableexpensechargeto** | **Integer** | The unique ID of the Agent. | 
**fkiBrokerIDVariableexpensechargeto** | **Integer** | The unique ID of the Broker. | 
**fkiCustomerIDVariableexpensechargeto** | **Integer** | The unique ID of the Customer. | 
**fkiGlaccountcontainerIDVariableexpensechargeto** | **Integer** | The unique ID of the Glaccountcontainer | 
**fkiAgentIDSupplychargechargeto** | **Integer** | The unique ID of the Agent. | 
**fkiBrokerIDSupplychargechargeto** | **Integer** | The unique ID of the Broker. | 
**fkiCustomerIDSupplychargechargeto** | **Integer** | The unique ID of the Customer. | 
**fkiGlaccountcontainerIDSupplychargechargeto** | **Integer** | The unique ID of the Glaccountcontainer | 
**fkiInvoicealternatelogoID** | **Integer** | The unique ID of the Invoicealternatelogo | 
**fkiSynchronizationlinkserverID** | **Integer** | The unique ID of the Synchronizationlinkserver | 
**efkiUserID** | **Integer** | The unique ID of the User |  [optional]
**efksCustomerCode** | **String** | The code of the Customer |  [optional]
**sCustomerCode** | **String** | The code of the Customer | 
**dCustomerFulltimeequivalent** | **String** | The fulltimeequivalent of the Customer | 
**iCustomerPhotocopiercode** | **Integer** | The photocopiercode of the Customer | 
**iCustomerLongdistancecode** | **Integer** | The longdistancecode of the Customer | 
**iCustomerTimewindowstart** | **Integer** | The timewindowstart of the Customer | 
**iCustomerTimewindowend** | **Integer** | The timewindowend of the Customer | 
**dCustomerMinimumchargeableinterests** | **String** | The minimumchargeableinterests of the Customer | 
**dtCustomerBirthdate** | **String** | The birthdate of the Customer | 
**dtCustomerTransfer** | **String** | The transfer of the Customer | 
**dtCustomerTransferappointment** | **String** | The transferappointment of the Customer | 
**dtCustomerTransfersurvey** | **String** | The transfersurvey of the Customer | 
**bCustomerIsactive** | **Boolean** | Whether the customer is active or not | 
**bCustomerVariableexpensefinanced** | **Boolean** | Whether if it&#39;s an variableexpensefinanced | 
**bCustomerVariableexpensefinancedtaxes** | **Boolean** | Whether if it&#39;s an variableexpensefinancedtaxes | 
**bCustomerSupplychargefinanced** | **Boolean** | Whether if it&#39;s an supplychargefinanced | 
**bCustomerSupplychargefinancedtaxes** | **Boolean** | Whether if it&#39;s an supplychargefinancedtaxes | 
**bCustomerAttendance** | **Boolean** | Whether if it&#39;s an attendance | 
**eCustomerType** | [**FieldECustomerType**](FieldECustomerType.md) |  | 
**eCustomerMarketingcorrespondence** | [**FieldECustomerMarketingcorrespondence**](FieldECustomerMarketingcorrespondence.md) |  | 
**bCustomerBlackcopycarbon** | **Boolean** | Whether if it&#39;s an blackcopycarbon | 
**bCustomerUnsubscribeinfo** | **Boolean** | Whether if it&#39;s an unsubscribeinfo | 
**tCustomerComment** | **String** | The comment of the Customer | 
**IMPORTID** | **String** |  |  [optional]




