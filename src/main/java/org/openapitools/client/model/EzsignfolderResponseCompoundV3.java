/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.1
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.CommonAudit;
import org.openapitools.client.model.ComputedEEzsignfolderAccess;
import org.openapitools.client.model.CustomTimezoneWithCodeResponse;
import org.openapitools.client.model.FieldEEzsignfolderCompletion;
import org.openapitools.client.model.FieldEEzsignfolderDocumentdependency;
import org.openapitools.client.model.FieldEEzsignfolderStep;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignfolder Object and children to create a complete structure
 **/
@ApiModel(description = "An Ezsignfolder Object and children to create a complete structure")
public class EzsignfolderResponseCompoundV3 {
  
  @SerializedName("pkiEzsignfolderID")
  private Integer pkiEzsignfolderID = null;
  @SerializedName("fkiEzsignfoldertypeID")
  private Integer fkiEzsignfoldertypeID = null;
  @SerializedName("objEzsignfoldertype")
  private Object objEzsignfoldertype = null;
  @SerializedName("fkiTimezoneID")
  private Integer fkiTimezoneID = null;
  @SerializedName("eEzsignfolderCompletion")
  private FieldEEzsignfolderCompletion eEzsignfolderCompletion = null;
  @SerializedName("eEzsignfolderDocumentdependency")
  private FieldEEzsignfolderDocumentdependency eEzsignfolderDocumentdependency = null;
  @SerializedName("sEzsignfoldertypeNameX")
  private String sEzsignfoldertypeNameX = null;
  @SerializedName("fkiBillingentityinternalID")
  private Integer fkiBillingentityinternalID = null;
  @SerializedName("sBillingentityinternalDescriptionX")
  private String sBillingentityinternalDescriptionX = null;
  @SerializedName("fkiEzsigntsarequirementID")
  private Integer fkiEzsigntsarequirementID = null;
  @SerializedName("sEzsigntsarequirementDescriptionX")
  private String sEzsigntsarequirementDescriptionX = null;
  @SerializedName("sEzsignfolderDescription")
  private String sEzsignfolderDescription = null;
  @SerializedName("tEzsignfolderNote")
  private String tEzsignfolderNote = null;
  @SerializedName("bEzsignfolderIsdisposable")
  private Boolean bEzsignfolderIsdisposable = null;
  @SerializedName("iEzsignfolderSendreminderfirstdays")
  private Integer iEzsignfolderSendreminderfirstdays = null;
  @SerializedName("iEzsignfolderSendreminderotherdays")
  private Integer iEzsignfolderSendreminderotherdays = null;
  @SerializedName("dtEzsignfolderDelayedsenddate")
  private String dtEzsignfolderDelayedsenddate = null;
  @SerializedName("dtEzsignfolderDuedate")
  private String dtEzsignfolderDuedate = null;
  @SerializedName("dtEzsignfolderSentdate")
  private String dtEzsignfolderSentdate = null;
  @SerializedName("dtEzsignfolderScheduledarchive")
  private String dtEzsignfolderScheduledarchive = null;
  @SerializedName("dtEzsignfolderScheduleddispose")
  private String dtEzsignfolderScheduleddispose = null;
  @SerializedName("eEzsignfolderStep")
  private FieldEEzsignfolderStep eEzsignfolderStep = null;
  @SerializedName("dtEzsignfolderClose")
  private String dtEzsignfolderClose = null;
  @SerializedName("tEzsignfolderMessage")
  private String tEzsignfolderMessage = null;
  @SerializedName("objAudit")
  private CommonAudit objAudit = null;
  @SerializedName("sEzsignfolderExternalid")
  private String sEzsignfolderExternalid = null;
  @SerializedName("eEzsignfolderAccess")
  private ComputedEEzsignfolderAccess eEzsignfolderAccess = null;
  @SerializedName("objTimezone")
  private CustomTimezoneWithCodeResponse objTimezone = null;

  /**
   * The unique ID of the Ezsignfolder
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfolder")
  public Integer getPkiEzsignfolderID() {
    return pkiEzsignfolderID;
  }
  public void setPkiEzsignfolderID(Integer pkiEzsignfolderID) {
    this.pkiEzsignfolderID = pkiEzsignfolderID;
  }

  /**
   * The unique ID of the Ezsignfoldertype.
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignfoldertype.")
  public Integer getFkiEzsignfoldertypeID() {
    return fkiEzsignfoldertypeID;
  }
  public void setFkiEzsignfoldertypeID(Integer fkiEzsignfoldertypeID) {
    this.fkiEzsignfoldertypeID = fkiEzsignfoldertypeID;
  }

  /**
   * A Custom Ezsignfoldertype Object
   **/
  @ApiModelProperty(value = "A Custom Ezsignfoldertype Object")
  public Object getObjEzsignfoldertype() {
    return objEzsignfoldertype;
  }
  public void setObjEzsignfoldertype(Object objEzsignfoldertype) {
    this.objEzsignfoldertype = objEzsignfoldertype;
  }

  /**
   * The unique ID of the Timezone
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Timezone")
  public Integer getFkiTimezoneID() {
    return fkiTimezoneID;
  }
  public void setFkiTimezoneID(Integer fkiTimezoneID) {
    this.fkiTimezoneID = fkiTimezoneID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsignfolderCompletion getEEzsignfolderCompletion() {
    return eEzsignfolderCompletion;
  }
  public void setEEzsignfolderCompletion(FieldEEzsignfolderCompletion eEzsignfolderCompletion) {
    this.eEzsignfolderCompletion = eEzsignfolderCompletion;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsignfolderDocumentdependency getEEzsignfolderDocumentdependency() {
    return eEzsignfolderDocumentdependency;
  }
  public void setEEzsignfolderDocumentdependency(FieldEEzsignfolderDocumentdependency eEzsignfolderDocumentdependency) {
    this.eEzsignfolderDocumentdependency = eEzsignfolderDocumentdependency;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSEzsignfoldertypeNameX() {
    return sEzsignfoldertypeNameX;
  }
  public void setSEzsignfoldertypeNameX(String sEzsignfoldertypeNameX) {
    this.sEzsignfoldertypeNameX = sEzsignfoldertypeNameX;
  }

  /**
   * The unique ID of the Billingentityinternal.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Billingentityinternal.")
  public Integer getFkiBillingentityinternalID() {
    return fkiBillingentityinternalID;
  }
  public void setFkiBillingentityinternalID(Integer fkiBillingentityinternalID) {
    this.fkiBillingentityinternalID = fkiBillingentityinternalID;
  }

  /**
   * The description of the Billingentityinternal in the language of the requester
   **/
  @ApiModelProperty(value = "The description of the Billingentityinternal in the language of the requester")
  public String getSBillingentityinternalDescriptionX() {
    return sBillingentityinternalDescriptionX;
  }
  public void setSBillingentityinternalDescriptionX(String sBillingentityinternalDescriptionX) {
    this.sBillingentityinternalDescriptionX = sBillingentityinternalDescriptionX;
  }

  /**
   * The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**|
   * minimum: 1
   * maximum: 3
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**|")
  public Integer getFkiEzsigntsarequirementID() {
    return fkiEzsigntsarequirementID;
  }
  public void setFkiEzsigntsarequirementID(Integer fkiEzsigntsarequirementID) {
    this.fkiEzsigntsarequirementID = fkiEzsigntsarequirementID;
  }

  /**
   * The description of the Ezsigntsarequirement in the language of the requester
   **/
  @ApiModelProperty(value = "The description of the Ezsigntsarequirement in the language of the requester")
  public String getSEzsigntsarequirementDescriptionX() {
    return sEzsigntsarequirementDescriptionX;
  }
  public void setSEzsigntsarequirementDescriptionX(String sEzsigntsarequirementDescriptionX) {
    this.sEzsigntsarequirementDescriptionX = sEzsigntsarequirementDescriptionX;
  }

  /**
   * The description of the Ezsignfolder
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezsignfolder")
  public String getSEzsignfolderDescription() {
    return sEzsignfolderDescription;
  }
  public void setSEzsignfolderDescription(String sEzsignfolderDescription) {
    this.sEzsignfolderDescription = sEzsignfolderDescription;
  }

  /**
   * Note about the Ezsignfolder
   **/
  @ApiModelProperty(value = "Note about the Ezsignfolder")
  public String getTEzsignfolderNote() {
    return tEzsignfolderNote;
  }
  public void setTEzsignfolderNote(String tEzsignfolderNote) {
    this.tEzsignfolderNote = tEzsignfolderNote;
  }

  /**
   * If the Ezsigndocument can be disposed
   **/
  @ApiModelProperty(value = "If the Ezsigndocument can be disposed")
  public Boolean getBEzsignfolderIsdisposable() {
    return bEzsignfolderIsdisposable;
  }
  public void setBEzsignfolderIsdisposable(Boolean bEzsignfolderIsdisposable) {
    this.bEzsignfolderIsdisposable = bEzsignfolderIsdisposable;
  }

  /**
   * The number of days before the the first reminder sending
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(value = "The number of days before the the first reminder sending")
  public Integer getIEzsignfolderSendreminderfirstdays() {
    return iEzsignfolderSendreminderfirstdays;
  }
  public void setIEzsignfolderSendreminderfirstdays(Integer iEzsignfolderSendreminderfirstdays) {
    this.iEzsignfolderSendreminderfirstdays = iEzsignfolderSendreminderfirstdays;
  }

  /**
   * The number of days after the first reminder sending
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(value = "The number of days after the first reminder sending")
  public Integer getIEzsignfolderSendreminderotherdays() {
    return iEzsignfolderSendreminderotherdays;
  }
  public void setIEzsignfolderSendreminderotherdays(Integer iEzsignfolderSendreminderotherdays) {
    this.iEzsignfolderSendreminderotherdays = iEzsignfolderSendreminderotherdays;
  }

  /**
   * The date and time at which the Ezsignfolder will be sent in the future.
   **/
  @ApiModelProperty(value = "The date and time at which the Ezsignfolder will be sent in the future.")
  public String getDtEzsignfolderDelayedsenddate() {
    return dtEzsignfolderDelayedsenddate;
  }
  public void setDtEzsignfolderDelayedsenddate(String dtEzsignfolderDelayedsenddate) {
    this.dtEzsignfolderDelayedsenddate = dtEzsignfolderDelayedsenddate;
  }

  /**
   * The maximum date and time at which the Ezsignfolder can be signed.
   **/
  @ApiModelProperty(value = "The maximum date and time at which the Ezsignfolder can be signed.")
  public String getDtEzsignfolderDuedate() {
    return dtEzsignfolderDuedate;
  }
  public void setDtEzsignfolderDuedate(String dtEzsignfolderDuedate) {
    this.dtEzsignfolderDuedate = dtEzsignfolderDuedate;
  }

  /**
   * The date and time at which the Ezsignfolder was sent the last time.
   **/
  @ApiModelProperty(value = "The date and time at which the Ezsignfolder was sent the last time.")
  public String getDtEzsignfolderSentdate() {
    return dtEzsignfolderSentdate;
  }
  public void setDtEzsignfolderSentdate(String dtEzsignfolderSentdate) {
    this.dtEzsignfolderSentdate = dtEzsignfolderSentdate;
  }

  /**
   * The scheduled date and time at which the Ezsignfolder should be archived.
   **/
  @ApiModelProperty(value = "The scheduled date and time at which the Ezsignfolder should be archived.")
  public String getDtEzsignfolderScheduledarchive() {
    return dtEzsignfolderScheduledarchive;
  }
  public void setDtEzsignfolderScheduledarchive(String dtEzsignfolderScheduledarchive) {
    this.dtEzsignfolderScheduledarchive = dtEzsignfolderScheduledarchive;
  }

  /**
   * The scheduled date at which the Ezsignfolder should be Disposed.
   **/
  @ApiModelProperty(value = "The scheduled date at which the Ezsignfolder should be Disposed.")
  public String getDtEzsignfolderScheduleddispose() {
    return dtEzsignfolderScheduleddispose;
  }
  public void setDtEzsignfolderScheduleddispose(String dtEzsignfolderScheduleddispose) {
    this.dtEzsignfolderScheduleddispose = dtEzsignfolderScheduleddispose;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsignfolderStep getEEzsignfolderStep() {
    return eEzsignfolderStep;
  }
  public void setEEzsignfolderStep(FieldEEzsignfolderStep eEzsignfolderStep) {
    this.eEzsignfolderStep = eEzsignfolderStep;
  }

  /**
   * The date and time at which the Ezsignfolder was closed. Either by applying the last signature or by completing it prematurely.
   **/
  @ApiModelProperty(value = "The date and time at which the Ezsignfolder was closed. Either by applying the last signature or by completing it prematurely.")
  public String getDtEzsignfolderClose() {
    return dtEzsignfolderClose;
  }
  public void setDtEzsignfolderClose(String dtEzsignfolderClose) {
    this.dtEzsignfolderClose = dtEzsignfolderClose;
  }

  /**
   * A custom text message that will be added to the email sent.
   **/
  @ApiModelProperty(value = "A custom text message that will be added to the email sent.")
  public String getTEzsignfolderMessage() {
    return tEzsignfolderMessage;
  }
  public void setTEzsignfolderMessage(String tEzsignfolderMessage) {
    this.tEzsignfolderMessage = tEzsignfolderMessage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CommonAudit getObjAudit() {
    return objAudit;
  }
  public void setObjAudit(CommonAudit objAudit) {
    this.objAudit = objAudit;
  }

  /**
   * This field can be used to store an External ID from the client's system.  Anything can be stored in this field, it will never be evaluated by the eZmax system and will be returned AS-IS.  To store multiple values, consider using a JSON formatted structure, a URL encoded string, a CSV or any other custom format. 
   **/
  @ApiModelProperty(value = "This field can be used to store an External ID from the client's system.  Anything can be stored in this field, it will never be evaluated by the eZmax system and will be returned AS-IS.  To store multiple values, consider using a JSON formatted structure, a URL encoded string, a CSV or any other custom format. ")
  public String getSEzsignfolderExternalid() {
    return sEzsignfolderExternalid;
  }
  public void setSEzsignfolderExternalid(String sEzsignfolderExternalid) {
    this.sEzsignfolderExternalid = sEzsignfolderExternalid;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ComputedEEzsignfolderAccess getEEzsignfolderAccess() {
    return eEzsignfolderAccess;
  }
  public void setEEzsignfolderAccess(ComputedEEzsignfolderAccess eEzsignfolderAccess) {
    this.eEzsignfolderAccess = eEzsignfolderAccess;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CustomTimezoneWithCodeResponse getObjTimezone() {
    return objTimezone;
  }
  public void setObjTimezone(CustomTimezoneWithCodeResponse objTimezone) {
    this.objTimezone = objTimezone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderResponseCompoundV3 ezsignfolderResponseCompoundV3 = (EzsignfolderResponseCompoundV3) o;
    return (this.pkiEzsignfolderID == null ? ezsignfolderResponseCompoundV3.pkiEzsignfolderID == null : this.pkiEzsignfolderID.equals(ezsignfolderResponseCompoundV3.pkiEzsignfolderID)) &&
        (this.fkiEzsignfoldertypeID == null ? ezsignfolderResponseCompoundV3.fkiEzsignfoldertypeID == null : this.fkiEzsignfoldertypeID.equals(ezsignfolderResponseCompoundV3.fkiEzsignfoldertypeID)) &&
        (this.objEzsignfoldertype == null ? ezsignfolderResponseCompoundV3.objEzsignfoldertype == null : this.objEzsignfoldertype.equals(ezsignfolderResponseCompoundV3.objEzsignfoldertype)) &&
        (this.fkiTimezoneID == null ? ezsignfolderResponseCompoundV3.fkiTimezoneID == null : this.fkiTimezoneID.equals(ezsignfolderResponseCompoundV3.fkiTimezoneID)) &&
        (this.eEzsignfolderCompletion == null ? ezsignfolderResponseCompoundV3.eEzsignfolderCompletion == null : this.eEzsignfolderCompletion.equals(ezsignfolderResponseCompoundV3.eEzsignfolderCompletion)) &&
        (this.eEzsignfolderDocumentdependency == null ? ezsignfolderResponseCompoundV3.eEzsignfolderDocumentdependency == null : this.eEzsignfolderDocumentdependency.equals(ezsignfolderResponseCompoundV3.eEzsignfolderDocumentdependency)) &&
        (this.sEzsignfoldertypeNameX == null ? ezsignfolderResponseCompoundV3.sEzsignfoldertypeNameX == null : this.sEzsignfoldertypeNameX.equals(ezsignfolderResponseCompoundV3.sEzsignfoldertypeNameX)) &&
        (this.fkiBillingentityinternalID == null ? ezsignfolderResponseCompoundV3.fkiBillingentityinternalID == null : this.fkiBillingentityinternalID.equals(ezsignfolderResponseCompoundV3.fkiBillingentityinternalID)) &&
        (this.sBillingentityinternalDescriptionX == null ? ezsignfolderResponseCompoundV3.sBillingentityinternalDescriptionX == null : this.sBillingentityinternalDescriptionX.equals(ezsignfolderResponseCompoundV3.sBillingentityinternalDescriptionX)) &&
        (this.fkiEzsigntsarequirementID == null ? ezsignfolderResponseCompoundV3.fkiEzsigntsarequirementID == null : this.fkiEzsigntsarequirementID.equals(ezsignfolderResponseCompoundV3.fkiEzsigntsarequirementID)) &&
        (this.sEzsigntsarequirementDescriptionX == null ? ezsignfolderResponseCompoundV3.sEzsigntsarequirementDescriptionX == null : this.sEzsigntsarequirementDescriptionX.equals(ezsignfolderResponseCompoundV3.sEzsigntsarequirementDescriptionX)) &&
        (this.sEzsignfolderDescription == null ? ezsignfolderResponseCompoundV3.sEzsignfolderDescription == null : this.sEzsignfolderDescription.equals(ezsignfolderResponseCompoundV3.sEzsignfolderDescription)) &&
        (this.tEzsignfolderNote == null ? ezsignfolderResponseCompoundV3.tEzsignfolderNote == null : this.tEzsignfolderNote.equals(ezsignfolderResponseCompoundV3.tEzsignfolderNote)) &&
        (this.bEzsignfolderIsdisposable == null ? ezsignfolderResponseCompoundV3.bEzsignfolderIsdisposable == null : this.bEzsignfolderIsdisposable.equals(ezsignfolderResponseCompoundV3.bEzsignfolderIsdisposable)) &&
        (this.iEzsignfolderSendreminderfirstdays == null ? ezsignfolderResponseCompoundV3.iEzsignfolderSendreminderfirstdays == null : this.iEzsignfolderSendreminderfirstdays.equals(ezsignfolderResponseCompoundV3.iEzsignfolderSendreminderfirstdays)) &&
        (this.iEzsignfolderSendreminderotherdays == null ? ezsignfolderResponseCompoundV3.iEzsignfolderSendreminderotherdays == null : this.iEzsignfolderSendreminderotherdays.equals(ezsignfolderResponseCompoundV3.iEzsignfolderSendreminderotherdays)) &&
        (this.dtEzsignfolderDelayedsenddate == null ? ezsignfolderResponseCompoundV3.dtEzsignfolderDelayedsenddate == null : this.dtEzsignfolderDelayedsenddate.equals(ezsignfolderResponseCompoundV3.dtEzsignfolderDelayedsenddate)) &&
        (this.dtEzsignfolderDuedate == null ? ezsignfolderResponseCompoundV3.dtEzsignfolderDuedate == null : this.dtEzsignfolderDuedate.equals(ezsignfolderResponseCompoundV3.dtEzsignfolderDuedate)) &&
        (this.dtEzsignfolderSentdate == null ? ezsignfolderResponseCompoundV3.dtEzsignfolderSentdate == null : this.dtEzsignfolderSentdate.equals(ezsignfolderResponseCompoundV3.dtEzsignfolderSentdate)) &&
        (this.dtEzsignfolderScheduledarchive == null ? ezsignfolderResponseCompoundV3.dtEzsignfolderScheduledarchive == null : this.dtEzsignfolderScheduledarchive.equals(ezsignfolderResponseCompoundV3.dtEzsignfolderScheduledarchive)) &&
        (this.dtEzsignfolderScheduleddispose == null ? ezsignfolderResponseCompoundV3.dtEzsignfolderScheduleddispose == null : this.dtEzsignfolderScheduleddispose.equals(ezsignfolderResponseCompoundV3.dtEzsignfolderScheduleddispose)) &&
        (this.eEzsignfolderStep == null ? ezsignfolderResponseCompoundV3.eEzsignfolderStep == null : this.eEzsignfolderStep.equals(ezsignfolderResponseCompoundV3.eEzsignfolderStep)) &&
        (this.dtEzsignfolderClose == null ? ezsignfolderResponseCompoundV3.dtEzsignfolderClose == null : this.dtEzsignfolderClose.equals(ezsignfolderResponseCompoundV3.dtEzsignfolderClose)) &&
        (this.tEzsignfolderMessage == null ? ezsignfolderResponseCompoundV3.tEzsignfolderMessage == null : this.tEzsignfolderMessage.equals(ezsignfolderResponseCompoundV3.tEzsignfolderMessage)) &&
        (this.objAudit == null ? ezsignfolderResponseCompoundV3.objAudit == null : this.objAudit.equals(ezsignfolderResponseCompoundV3.objAudit)) &&
        (this.sEzsignfolderExternalid == null ? ezsignfolderResponseCompoundV3.sEzsignfolderExternalid == null : this.sEzsignfolderExternalid.equals(ezsignfolderResponseCompoundV3.sEzsignfolderExternalid)) &&
        (this.eEzsignfolderAccess == null ? ezsignfolderResponseCompoundV3.eEzsignfolderAccess == null : this.eEzsignfolderAccess.equals(ezsignfolderResponseCompoundV3.eEzsignfolderAccess)) &&
        (this.objTimezone == null ? ezsignfolderResponseCompoundV3.objTimezone == null : this.objTimezone.equals(ezsignfolderResponseCompoundV3.objTimezone));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignfolderID == null ? 0: this.pkiEzsignfolderID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldertypeID == null ? 0: this.fkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.objEzsignfoldertype == null ? 0: this.objEzsignfoldertype.hashCode());
    result = 31 * result + (this.fkiTimezoneID == null ? 0: this.fkiTimezoneID.hashCode());
    result = 31 * result + (this.eEzsignfolderCompletion == null ? 0: this.eEzsignfolderCompletion.hashCode());
    result = 31 * result + (this.eEzsignfolderDocumentdependency == null ? 0: this.eEzsignfolderDocumentdependency.hashCode());
    result = 31 * result + (this.sEzsignfoldertypeNameX == null ? 0: this.sEzsignfoldertypeNameX.hashCode());
    result = 31 * result + (this.fkiBillingentityinternalID == null ? 0: this.fkiBillingentityinternalID.hashCode());
    result = 31 * result + (this.sBillingentityinternalDescriptionX == null ? 0: this.sBillingentityinternalDescriptionX.hashCode());
    result = 31 * result + (this.fkiEzsigntsarequirementID == null ? 0: this.fkiEzsigntsarequirementID.hashCode());
    result = 31 * result + (this.sEzsigntsarequirementDescriptionX == null ? 0: this.sEzsigntsarequirementDescriptionX.hashCode());
    result = 31 * result + (this.sEzsignfolderDescription == null ? 0: this.sEzsignfolderDescription.hashCode());
    result = 31 * result + (this.tEzsignfolderNote == null ? 0: this.tEzsignfolderNote.hashCode());
    result = 31 * result + (this.bEzsignfolderIsdisposable == null ? 0: this.bEzsignfolderIsdisposable.hashCode());
    result = 31 * result + (this.iEzsignfolderSendreminderfirstdays == null ? 0: this.iEzsignfolderSendreminderfirstdays.hashCode());
    result = 31 * result + (this.iEzsignfolderSendreminderotherdays == null ? 0: this.iEzsignfolderSendreminderotherdays.hashCode());
    result = 31 * result + (this.dtEzsignfolderDelayedsenddate == null ? 0: this.dtEzsignfolderDelayedsenddate.hashCode());
    result = 31 * result + (this.dtEzsignfolderDuedate == null ? 0: this.dtEzsignfolderDuedate.hashCode());
    result = 31 * result + (this.dtEzsignfolderSentdate == null ? 0: this.dtEzsignfolderSentdate.hashCode());
    result = 31 * result + (this.dtEzsignfolderScheduledarchive == null ? 0: this.dtEzsignfolderScheduledarchive.hashCode());
    result = 31 * result + (this.dtEzsignfolderScheduleddispose == null ? 0: this.dtEzsignfolderScheduleddispose.hashCode());
    result = 31 * result + (this.eEzsignfolderStep == null ? 0: this.eEzsignfolderStep.hashCode());
    result = 31 * result + (this.dtEzsignfolderClose == null ? 0: this.dtEzsignfolderClose.hashCode());
    result = 31 * result + (this.tEzsignfolderMessage == null ? 0: this.tEzsignfolderMessage.hashCode());
    result = 31 * result + (this.objAudit == null ? 0: this.objAudit.hashCode());
    result = 31 * result + (this.sEzsignfolderExternalid == null ? 0: this.sEzsignfolderExternalid.hashCode());
    result = 31 * result + (this.eEzsignfolderAccess == null ? 0: this.eEzsignfolderAccess.hashCode());
    result = 31 * result + (this.objTimezone == null ? 0: this.objTimezone.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderResponseCompoundV3 {\n");
    
    sb.append("  pkiEzsignfolderID: ").append(pkiEzsignfolderID).append("\n");
    sb.append("  fkiEzsignfoldertypeID: ").append(fkiEzsignfoldertypeID).append("\n");
    sb.append("  objEzsignfoldertype: ").append(objEzsignfoldertype).append("\n");
    sb.append("  fkiTimezoneID: ").append(fkiTimezoneID).append("\n");
    sb.append("  eEzsignfolderCompletion: ").append(eEzsignfolderCompletion).append("\n");
    sb.append("  eEzsignfolderDocumentdependency: ").append(eEzsignfolderDocumentdependency).append("\n");
    sb.append("  sEzsignfoldertypeNameX: ").append(sEzsignfoldertypeNameX).append("\n");
    sb.append("  fkiBillingentityinternalID: ").append(fkiBillingentityinternalID).append("\n");
    sb.append("  sBillingentityinternalDescriptionX: ").append(sBillingentityinternalDescriptionX).append("\n");
    sb.append("  fkiEzsigntsarequirementID: ").append(fkiEzsigntsarequirementID).append("\n");
    sb.append("  sEzsigntsarequirementDescriptionX: ").append(sEzsigntsarequirementDescriptionX).append("\n");
    sb.append("  sEzsignfolderDescription: ").append(sEzsignfolderDescription).append("\n");
    sb.append("  tEzsignfolderNote: ").append(tEzsignfolderNote).append("\n");
    sb.append("  bEzsignfolderIsdisposable: ").append(bEzsignfolderIsdisposable).append("\n");
    sb.append("  iEzsignfolderSendreminderfirstdays: ").append(iEzsignfolderSendreminderfirstdays).append("\n");
    sb.append("  iEzsignfolderSendreminderotherdays: ").append(iEzsignfolderSendreminderotherdays).append("\n");
    sb.append("  dtEzsignfolderDelayedsenddate: ").append(dtEzsignfolderDelayedsenddate).append("\n");
    sb.append("  dtEzsignfolderDuedate: ").append(dtEzsignfolderDuedate).append("\n");
    sb.append("  dtEzsignfolderSentdate: ").append(dtEzsignfolderSentdate).append("\n");
    sb.append("  dtEzsignfolderScheduledarchive: ").append(dtEzsignfolderScheduledarchive).append("\n");
    sb.append("  dtEzsignfolderScheduleddispose: ").append(dtEzsignfolderScheduleddispose).append("\n");
    sb.append("  eEzsignfolderStep: ").append(eEzsignfolderStep).append("\n");
    sb.append("  dtEzsignfolderClose: ").append(dtEzsignfolderClose).append("\n");
    sb.append("  tEzsignfolderMessage: ").append(tEzsignfolderMessage).append("\n");
    sb.append("  objAudit: ").append(objAudit).append("\n");
    sb.append("  sEzsignfolderExternalid: ").append(sEzsignfolderExternalid).append("\n");
    sb.append("  eEzsignfolderAccess: ").append(eEzsignfolderAccess).append("\n");
    sb.append("  objTimezone: ").append(objTimezone).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
