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

import java.util.*;
import org.openapitools.client.model.CommonAudit;
import org.openapitools.client.model.ComputedEEzsigndocumentSteptype;
import org.openapitools.client.model.CustomEzsignfoldersignerassociationstatusResponse;
import org.openapitools.client.model.EzsigndocumentdependencyResponse;
import org.openapitools.client.model.FieldEEzsigndocumentStep;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/ezsigndocument/{pkiEzsigndocumentID}
 **/
@ApiModel(description = "Payload for GET /1/object/ezsigndocument/{pkiEzsigndocumentID}")
public class EzsigndocumentGetObjectV1ResponseMPayload {
  
  @SerializedName("pkiEzsigndocumentID")
  private Integer pkiEzsigndocumentID = null;
  @SerializedName("fkiEzsignfolderID")
  private Integer fkiEzsignfolderID = null;
  @SerializedName("fkiEzsignfoldersignerassociationIDDeclinedtosign")
  private Integer fkiEzsignfoldersignerassociationIDDeclinedtosign = null;
  @SerializedName("dtEzsigndocumentDuedate")
  private String dtEzsigndocumentDuedate = null;
  @SerializedName("dtEzsignformCompleted")
  private String dtEzsignformCompleted = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("sEzsigndocumentName")
  private String sEzsigndocumentName = null;
  @SerializedName("eEzsigndocumentStep")
  private FieldEEzsigndocumentStep eEzsigndocumentStep = null;
  @SerializedName("dtEzsigndocumentFirstsend")
  private String dtEzsigndocumentFirstsend = null;
  @SerializedName("dtEzsigndocumentLastsend")
  private String dtEzsigndocumentLastsend = null;
  @SerializedName("iEzsigndocumentOrder")
  private Integer iEzsigndocumentOrder = null;
  @SerializedName("iEzsigndocumentPagetotal")
  private Integer iEzsigndocumentPagetotal = null;
  @SerializedName("iEzsigndocumentSignaturesigned")
  private Integer iEzsigndocumentSignaturesigned = null;
  @SerializedName("iEzsigndocumentSignaturetotal")
  private Integer iEzsigndocumentSignaturetotal = null;
  @SerializedName("iEzsigndocumentFormfieldtotal")
  private Integer iEzsigndocumentFormfieldtotal = null;
  @SerializedName("sEzsigndocumentMD5initial")
  private String sEzsigndocumentMD5initial = null;
  @SerializedName("tEzsigndocumentDeclinedtosignreason")
  private String tEzsigndocumentDeclinedtosignreason = null;
  @SerializedName("sEzsigndocumentMD5signed")
  private String sEzsigndocumentMD5signed = null;
  @SerializedName("bEzsigndocumentEzsignform")
  private Boolean bEzsigndocumentEzsignform = null;
  @SerializedName("bEzsigndocumentHassignedsignatures")
  private Boolean bEzsigndocumentHassignedsignatures = null;
  @SerializedName("objAudit")
  private CommonAudit objAudit = null;
  @SerializedName("sEzsigndocumentExternalid")
  private String sEzsigndocumentExternalid = null;
  @SerializedName("iEzsigndocumentEzsignsignatureattachmenttotal")
  private Integer iEzsigndocumentEzsignsignatureattachmenttotal = null;
  @SerializedName("iEzsigndocumentEzsigndiscussiontotal")
  private Integer iEzsigndocumentEzsigndiscussiontotal = null;
  @SerializedName("eEzsigndocumentSteptype")
  private ComputedEEzsigndocumentSteptype eEzsigndocumentSteptype = null;
  @SerializedName("iEzsigndocumentStepformtotal")
  private Integer iEzsigndocumentStepformtotal = null;
  @SerializedName("iEzsigndocumentStepformcurrent")
  private Integer iEzsigndocumentStepformcurrent = null;
  @SerializedName("iEzsigndocumentStepsignaturetotal")
  private Integer iEzsigndocumentStepsignaturetotal = null;
  @SerializedName("iEzsigndocumentStepsignatureCurrent")
  private Integer iEzsigndocumentStepsignatureCurrent = null;
  @SerializedName("a_objEzsignfoldersignerassociationstatus")
  private List<CustomEzsignfoldersignerassociationstatusResponse> aObjEzsignfoldersignerassociationstatus = null;
  @SerializedName("a_objEzsigndocumentdependency")
  private List<EzsigndocumentdependencyResponse> aObjEzsigndocumentdependency = null;

  /**
   * The unique ID of the Ezsigndocument
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigndocument")
  public Integer getPkiEzsigndocumentID() {
    return pkiEzsigndocumentID;
  }
  public void setPkiEzsigndocumentID(Integer pkiEzsigndocumentID) {
    this.pkiEzsigndocumentID = pkiEzsigndocumentID;
  }

  /**
   * The unique ID of the Ezsignfolder
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfolder")
  public Integer getFkiEzsignfolderID() {
    return fkiEzsignfolderID;
  }
  public void setFkiEzsignfolderID(Integer fkiEzsignfolderID) {
    this.fkiEzsignfolderID = fkiEzsignfolderID;
  }

  /**
   * The unique ID of the Ezsignfoldersignerassociation
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignfoldersignerassociation")
  public Integer getFkiEzsignfoldersignerassociationIDDeclinedtosign() {
    return fkiEzsignfoldersignerassociationIDDeclinedtosign;
  }
  public void setFkiEzsignfoldersignerassociationIDDeclinedtosign(Integer fkiEzsignfoldersignerassociationIDDeclinedtosign) {
    this.fkiEzsignfoldersignerassociationIDDeclinedtosign = fkiEzsignfoldersignerassociationIDDeclinedtosign;
  }

  /**
   * The maximum date and time at which the Ezsigndocument can be signed.
   **/
  @ApiModelProperty(required = true, value = "The maximum date and time at which the Ezsigndocument can be signed.")
  public String getDtEzsigndocumentDuedate() {
    return dtEzsigndocumentDuedate;
  }
  public void setDtEzsigndocumentDuedate(String dtEzsigndocumentDuedate) {
    this.dtEzsigndocumentDuedate = dtEzsigndocumentDuedate;
  }

  /**
   * The date and time at which the Ezsignform has been completed.
   **/
  @ApiModelProperty(value = "The date and time at which the Ezsignform has been completed.")
  public String getDtEzsignformCompleted() {
    return dtEzsignformCompleted;
  }
  public void setDtEzsignformCompleted(String dtEzsignformCompleted) {
    this.dtEzsignformCompleted = dtEzsignformCompleted;
  }

  /**
   * The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
   * minimum: 1
   * maximum: 2
   **/
  @ApiModelProperty(value = "The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|")
  public Integer getFkiLanguageID() {
    return fkiLanguageID;
  }
  public void setFkiLanguageID(Integer fkiLanguageID) {
    this.fkiLanguageID = fkiLanguageID;
  }

  /**
   * The name of the document that will be presented to Ezsignfoldersignerassociations
   **/
  @ApiModelProperty(required = true, value = "The name of the document that will be presented to Ezsignfoldersignerassociations")
  public String getSEzsigndocumentName() {
    return sEzsigndocumentName;
  }
  public void setSEzsigndocumentName(String sEzsigndocumentName) {
    this.sEzsigndocumentName = sEzsigndocumentName;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsigndocumentStep getEEzsigndocumentStep() {
    return eEzsigndocumentStep;
  }
  public void setEEzsigndocumentStep(FieldEEzsigndocumentStep eEzsigndocumentStep) {
    this.eEzsigndocumentStep = eEzsigndocumentStep;
  }

  /**
   * The date and time when the Ezsigndocument was first sent.
   **/
  @ApiModelProperty(value = "The date and time when the Ezsigndocument was first sent.")
  public String getDtEzsigndocumentFirstsend() {
    return dtEzsigndocumentFirstsend;
  }
  public void setDtEzsigndocumentFirstsend(String dtEzsigndocumentFirstsend) {
    this.dtEzsigndocumentFirstsend = dtEzsigndocumentFirstsend;
  }

  /**
   * The date and time when the Ezsigndocument was sent the last time.
   **/
  @ApiModelProperty(value = "The date and time when the Ezsigndocument was sent the last time.")
  public String getDtEzsigndocumentLastsend() {
    return dtEzsigndocumentLastsend;
  }
  public void setDtEzsigndocumentLastsend(String dtEzsigndocumentLastsend) {
    this.dtEzsigndocumentLastsend = dtEzsigndocumentLastsend;
  }

  /**
   * The order in which the Ezsigndocument will be presented to the signatory in the Ezsignfolder.
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The order in which the Ezsigndocument will be presented to the signatory in the Ezsignfolder.")
  public Integer getIEzsigndocumentOrder() {
    return iEzsigndocumentOrder;
  }
  public void setIEzsigndocumentOrder(Integer iEzsigndocumentOrder) {
    this.iEzsigndocumentOrder = iEzsigndocumentOrder;
  }

  /**
   * The number of pages in the Ezsigndocument.
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The number of pages in the Ezsigndocument.")
  public Integer getIEzsigndocumentPagetotal() {
    return iEzsigndocumentPagetotal;
  }
  public void setIEzsigndocumentPagetotal(Integer iEzsigndocumentPagetotal) {
    this.iEzsigndocumentPagetotal = iEzsigndocumentPagetotal;
  }

  /**
   * The number of signatures that were signed in the document.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The number of signatures that were signed in the document.")
  public Integer getIEzsigndocumentSignaturesigned() {
    return iEzsigndocumentSignaturesigned;
  }
  public void setIEzsigndocumentSignaturesigned(Integer iEzsigndocumentSignaturesigned) {
    this.iEzsigndocumentSignaturesigned = iEzsigndocumentSignaturesigned;
  }

  /**
   * The number of total signatures that were requested in the Ezsigndocument.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The number of total signatures that were requested in the Ezsigndocument.")
  public Integer getIEzsigndocumentSignaturetotal() {
    return iEzsigndocumentSignaturetotal;
  }
  public void setIEzsigndocumentSignaturetotal(Integer iEzsigndocumentSignaturetotal) {
    this.iEzsigndocumentSignaturetotal = iEzsigndocumentSignaturetotal;
  }

  /**
   * The number of total Ezsignformfield that were requested in the Ezsigndocument.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The number of total Ezsignformfield that were requested in the Ezsigndocument.")
  public Integer getIEzsigndocumentFormfieldtotal() {
    return iEzsigndocumentFormfieldtotal;
  }
  public void setIEzsigndocumentFormfieldtotal(Integer iEzsigndocumentFormfieldtotal) {
    this.iEzsigndocumentFormfieldtotal = iEzsigndocumentFormfieldtotal;
  }

  /**
   * MD5 Hash of the initial PDF Document before signatures were applied to it.
   **/
  @ApiModelProperty(value = "MD5 Hash of the initial PDF Document before signatures were applied to it.")
  public String getSEzsigndocumentMD5initial() {
    return sEzsigndocumentMD5initial;
  }
  public void setSEzsigndocumentMD5initial(String sEzsigndocumentMD5initial) {
    this.sEzsigndocumentMD5initial = sEzsigndocumentMD5initial;
  }

  /**
   * A custom text message that will contain the refusal message if the Ezsigndocument is declined to sign
   **/
  @ApiModelProperty(value = "A custom text message that will contain the refusal message if the Ezsigndocument is declined to sign")
  public String getTEzsigndocumentDeclinedtosignreason() {
    return tEzsigndocumentDeclinedtosignreason;
  }
  public void setTEzsigndocumentDeclinedtosignreason(String tEzsigndocumentDeclinedtosignreason) {
    this.tEzsigndocumentDeclinedtosignreason = tEzsigndocumentDeclinedtosignreason;
  }

  /**
   * MD5 Hash of the final PDF Document after all signatures were applied to it.
   **/
  @ApiModelProperty(value = "MD5 Hash of the final PDF Document after all signatures were applied to it.")
  public String getSEzsigndocumentMD5signed() {
    return sEzsigndocumentMD5signed;
  }
  public void setSEzsigndocumentMD5signed(String sEzsigndocumentMD5signed) {
    this.sEzsigndocumentMD5signed = sEzsigndocumentMD5signed;
  }

  /**
   * If the Ezsigndocument contains an Ezsignform or not
   **/
  @ApiModelProperty(value = "If the Ezsigndocument contains an Ezsignform or not")
  public Boolean getBEzsigndocumentEzsignform() {
    return bEzsigndocumentEzsignform;
  }
  public void setBEzsigndocumentEzsignform(Boolean bEzsigndocumentEzsignform) {
    this.bEzsigndocumentEzsignform = bEzsigndocumentEzsignform;
  }

  /**
   * If the Ezsigndocument contains signed signatures (From internal or external sources)
   **/
  @ApiModelProperty(value = "If the Ezsigndocument contains signed signatures (From internal or external sources)")
  public Boolean getBEzsigndocumentHassignedsignatures() {
    return bEzsigndocumentHassignedsignatures;
  }
  public void setBEzsigndocumentHassignedsignatures(Boolean bEzsigndocumentHassignedsignatures) {
    this.bEzsigndocumentHassignedsignatures = bEzsigndocumentHassignedsignatures;
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
  public String getSEzsigndocumentExternalid() {
    return sEzsigndocumentExternalid;
  }
  public void setSEzsigndocumentExternalid(String sEzsigndocumentExternalid) {
    this.sEzsigndocumentExternalid = sEzsigndocumentExternalid;
  }

  /**
   * The number of Ezsigndocumentattachment total
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The number of Ezsigndocumentattachment total")
  public Integer getIEzsigndocumentEzsignsignatureattachmenttotal() {
    return iEzsigndocumentEzsignsignatureattachmenttotal;
  }
  public void setIEzsigndocumentEzsignsignatureattachmenttotal(Integer iEzsigndocumentEzsignsignatureattachmenttotal) {
    this.iEzsigndocumentEzsignsignatureattachmenttotal = iEzsigndocumentEzsignsignatureattachmenttotal;
  }

  /**
   * The total number of Ezsigndiscussions
   **/
  @ApiModelProperty(required = true, value = "The total number of Ezsigndiscussions")
  public Integer getIEzsigndocumentEzsigndiscussiontotal() {
    return iEzsigndocumentEzsigndiscussiontotal;
  }
  public void setIEzsigndocumentEzsigndiscussiontotal(Integer iEzsigndocumentEzsigndiscussiontotal) {
    this.iEzsigndocumentEzsigndiscussiontotal = iEzsigndocumentEzsigndiscussiontotal;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ComputedEEzsigndocumentSteptype getEEzsigndocumentSteptype() {
    return eEzsigndocumentSteptype;
  }
  public void setEEzsigndocumentSteptype(ComputedEEzsigndocumentSteptype eEzsigndocumentSteptype) {
    this.eEzsigndocumentSteptype = eEzsigndocumentSteptype;
  }

  /**
   * The total number of steps in the form filling phase
   **/
  @ApiModelProperty(required = true, value = "The total number of steps in the form filling phase")
  public Integer getIEzsigndocumentStepformtotal() {
    return iEzsigndocumentStepformtotal;
  }
  public void setIEzsigndocumentStepformtotal(Integer iEzsigndocumentStepformtotal) {
    this.iEzsigndocumentStepformtotal = iEzsigndocumentStepformtotal;
  }

  /**
   * The current step in the form filling phase
   **/
  @ApiModelProperty(required = true, value = "The current step in the form filling phase")
  public Integer getIEzsigndocumentStepformcurrent() {
    return iEzsigndocumentStepformcurrent;
  }
  public void setIEzsigndocumentStepformcurrent(Integer iEzsigndocumentStepformcurrent) {
    this.iEzsigndocumentStepformcurrent = iEzsigndocumentStepformcurrent;
  }

  /**
   * The total number of steps in the signature filling phase
   **/
  @ApiModelProperty(required = true, value = "The total number of steps in the signature filling phase")
  public Integer getIEzsigndocumentStepsignaturetotal() {
    return iEzsigndocumentStepsignaturetotal;
  }
  public void setIEzsigndocumentStepsignaturetotal(Integer iEzsigndocumentStepsignaturetotal) {
    this.iEzsigndocumentStepsignaturetotal = iEzsigndocumentStepsignaturetotal;
  }

  /**
   * The current step in the signature phase
   **/
  @ApiModelProperty(required = true, value = "The current step in the signature phase")
  public Integer getIEzsigndocumentStepsignatureCurrent() {
    return iEzsigndocumentStepsignatureCurrent;
  }
  public void setIEzsigndocumentStepsignatureCurrent(Integer iEzsigndocumentStepsignatureCurrent) {
    this.iEzsigndocumentStepsignatureCurrent = iEzsigndocumentStepsignatureCurrent;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomEzsignfoldersignerassociationstatusResponse> getAObjEzsignfoldersignerassociationstatus() {
    return aObjEzsignfoldersignerassociationstatus;
  }
  public void setAObjEzsignfoldersignerassociationstatus(List<CustomEzsignfoldersignerassociationstatusResponse> aObjEzsignfoldersignerassociationstatus) {
    this.aObjEzsignfoldersignerassociationstatus = aObjEzsignfoldersignerassociationstatus;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<EzsigndocumentdependencyResponse> getAObjEzsigndocumentdependency() {
    return aObjEzsigndocumentdependency;
  }
  public void setAObjEzsigndocumentdependency(List<EzsigndocumentdependencyResponse> aObjEzsigndocumentdependency) {
    this.aObjEzsigndocumentdependency = aObjEzsigndocumentdependency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentGetObjectV1ResponseMPayload ezsigndocumentGetObjectV1ResponseMPayload = (EzsigndocumentGetObjectV1ResponseMPayload) o;
    return (this.pkiEzsigndocumentID == null ? ezsigndocumentGetObjectV1ResponseMPayload.pkiEzsigndocumentID == null : this.pkiEzsigndocumentID.equals(ezsigndocumentGetObjectV1ResponseMPayload.pkiEzsigndocumentID)) &&
        (this.fkiEzsignfolderID == null ? ezsigndocumentGetObjectV1ResponseMPayload.fkiEzsignfolderID == null : this.fkiEzsignfolderID.equals(ezsigndocumentGetObjectV1ResponseMPayload.fkiEzsignfolderID)) &&
        (this.fkiEzsignfoldersignerassociationIDDeclinedtosign == null ? ezsigndocumentGetObjectV1ResponseMPayload.fkiEzsignfoldersignerassociationIDDeclinedtosign == null : this.fkiEzsignfoldersignerassociationIDDeclinedtosign.equals(ezsigndocumentGetObjectV1ResponseMPayload.fkiEzsignfoldersignerassociationIDDeclinedtosign)) &&
        (this.dtEzsigndocumentDuedate == null ? ezsigndocumentGetObjectV1ResponseMPayload.dtEzsigndocumentDuedate == null : this.dtEzsigndocumentDuedate.equals(ezsigndocumentGetObjectV1ResponseMPayload.dtEzsigndocumentDuedate)) &&
        (this.dtEzsignformCompleted == null ? ezsigndocumentGetObjectV1ResponseMPayload.dtEzsignformCompleted == null : this.dtEzsignformCompleted.equals(ezsigndocumentGetObjectV1ResponseMPayload.dtEzsignformCompleted)) &&
        (this.fkiLanguageID == null ? ezsigndocumentGetObjectV1ResponseMPayload.fkiLanguageID == null : this.fkiLanguageID.equals(ezsigndocumentGetObjectV1ResponseMPayload.fkiLanguageID)) &&
        (this.sEzsigndocumentName == null ? ezsigndocumentGetObjectV1ResponseMPayload.sEzsigndocumentName == null : this.sEzsigndocumentName.equals(ezsigndocumentGetObjectV1ResponseMPayload.sEzsigndocumentName)) &&
        (this.eEzsigndocumentStep == null ? ezsigndocumentGetObjectV1ResponseMPayload.eEzsigndocumentStep == null : this.eEzsigndocumentStep.equals(ezsigndocumentGetObjectV1ResponseMPayload.eEzsigndocumentStep)) &&
        (this.dtEzsigndocumentFirstsend == null ? ezsigndocumentGetObjectV1ResponseMPayload.dtEzsigndocumentFirstsend == null : this.dtEzsigndocumentFirstsend.equals(ezsigndocumentGetObjectV1ResponseMPayload.dtEzsigndocumentFirstsend)) &&
        (this.dtEzsigndocumentLastsend == null ? ezsigndocumentGetObjectV1ResponseMPayload.dtEzsigndocumentLastsend == null : this.dtEzsigndocumentLastsend.equals(ezsigndocumentGetObjectV1ResponseMPayload.dtEzsigndocumentLastsend)) &&
        (this.iEzsigndocumentOrder == null ? ezsigndocumentGetObjectV1ResponseMPayload.iEzsigndocumentOrder == null : this.iEzsigndocumentOrder.equals(ezsigndocumentGetObjectV1ResponseMPayload.iEzsigndocumentOrder)) &&
        (this.iEzsigndocumentPagetotal == null ? ezsigndocumentGetObjectV1ResponseMPayload.iEzsigndocumentPagetotal == null : this.iEzsigndocumentPagetotal.equals(ezsigndocumentGetObjectV1ResponseMPayload.iEzsigndocumentPagetotal)) &&
        (this.iEzsigndocumentSignaturesigned == null ? ezsigndocumentGetObjectV1ResponseMPayload.iEzsigndocumentSignaturesigned == null : this.iEzsigndocumentSignaturesigned.equals(ezsigndocumentGetObjectV1ResponseMPayload.iEzsigndocumentSignaturesigned)) &&
        (this.iEzsigndocumentSignaturetotal == null ? ezsigndocumentGetObjectV1ResponseMPayload.iEzsigndocumentSignaturetotal == null : this.iEzsigndocumentSignaturetotal.equals(ezsigndocumentGetObjectV1ResponseMPayload.iEzsigndocumentSignaturetotal)) &&
        (this.iEzsigndocumentFormfieldtotal == null ? ezsigndocumentGetObjectV1ResponseMPayload.iEzsigndocumentFormfieldtotal == null : this.iEzsigndocumentFormfieldtotal.equals(ezsigndocumentGetObjectV1ResponseMPayload.iEzsigndocumentFormfieldtotal)) &&
        (this.sEzsigndocumentMD5initial == null ? ezsigndocumentGetObjectV1ResponseMPayload.sEzsigndocumentMD5initial == null : this.sEzsigndocumentMD5initial.equals(ezsigndocumentGetObjectV1ResponseMPayload.sEzsigndocumentMD5initial)) &&
        (this.tEzsigndocumentDeclinedtosignreason == null ? ezsigndocumentGetObjectV1ResponseMPayload.tEzsigndocumentDeclinedtosignreason == null : this.tEzsigndocumentDeclinedtosignreason.equals(ezsigndocumentGetObjectV1ResponseMPayload.tEzsigndocumentDeclinedtosignreason)) &&
        (this.sEzsigndocumentMD5signed == null ? ezsigndocumentGetObjectV1ResponseMPayload.sEzsigndocumentMD5signed == null : this.sEzsigndocumentMD5signed.equals(ezsigndocumentGetObjectV1ResponseMPayload.sEzsigndocumentMD5signed)) &&
        (this.bEzsigndocumentEzsignform == null ? ezsigndocumentGetObjectV1ResponseMPayload.bEzsigndocumentEzsignform == null : this.bEzsigndocumentEzsignform.equals(ezsigndocumentGetObjectV1ResponseMPayload.bEzsigndocumentEzsignform)) &&
        (this.bEzsigndocumentHassignedsignatures == null ? ezsigndocumentGetObjectV1ResponseMPayload.bEzsigndocumentHassignedsignatures == null : this.bEzsigndocumentHassignedsignatures.equals(ezsigndocumentGetObjectV1ResponseMPayload.bEzsigndocumentHassignedsignatures)) &&
        (this.objAudit == null ? ezsigndocumentGetObjectV1ResponseMPayload.objAudit == null : this.objAudit.equals(ezsigndocumentGetObjectV1ResponseMPayload.objAudit)) &&
        (this.sEzsigndocumentExternalid == null ? ezsigndocumentGetObjectV1ResponseMPayload.sEzsigndocumentExternalid == null : this.sEzsigndocumentExternalid.equals(ezsigndocumentGetObjectV1ResponseMPayload.sEzsigndocumentExternalid)) &&
        (this.iEzsigndocumentEzsignsignatureattachmenttotal == null ? ezsigndocumentGetObjectV1ResponseMPayload.iEzsigndocumentEzsignsignatureattachmenttotal == null : this.iEzsigndocumentEzsignsignatureattachmenttotal.equals(ezsigndocumentGetObjectV1ResponseMPayload.iEzsigndocumentEzsignsignatureattachmenttotal)) &&
        (this.iEzsigndocumentEzsigndiscussiontotal == null ? ezsigndocumentGetObjectV1ResponseMPayload.iEzsigndocumentEzsigndiscussiontotal == null : this.iEzsigndocumentEzsigndiscussiontotal.equals(ezsigndocumentGetObjectV1ResponseMPayload.iEzsigndocumentEzsigndiscussiontotal)) &&
        (this.eEzsigndocumentSteptype == null ? ezsigndocumentGetObjectV1ResponseMPayload.eEzsigndocumentSteptype == null : this.eEzsigndocumentSteptype.equals(ezsigndocumentGetObjectV1ResponseMPayload.eEzsigndocumentSteptype)) &&
        (this.iEzsigndocumentStepformtotal == null ? ezsigndocumentGetObjectV1ResponseMPayload.iEzsigndocumentStepformtotal == null : this.iEzsigndocumentStepformtotal.equals(ezsigndocumentGetObjectV1ResponseMPayload.iEzsigndocumentStepformtotal)) &&
        (this.iEzsigndocumentStepformcurrent == null ? ezsigndocumentGetObjectV1ResponseMPayload.iEzsigndocumentStepformcurrent == null : this.iEzsigndocumentStepformcurrent.equals(ezsigndocumentGetObjectV1ResponseMPayload.iEzsigndocumentStepformcurrent)) &&
        (this.iEzsigndocumentStepsignaturetotal == null ? ezsigndocumentGetObjectV1ResponseMPayload.iEzsigndocumentStepsignaturetotal == null : this.iEzsigndocumentStepsignaturetotal.equals(ezsigndocumentGetObjectV1ResponseMPayload.iEzsigndocumentStepsignaturetotal)) &&
        (this.iEzsigndocumentStepsignatureCurrent == null ? ezsigndocumentGetObjectV1ResponseMPayload.iEzsigndocumentStepsignatureCurrent == null : this.iEzsigndocumentStepsignatureCurrent.equals(ezsigndocumentGetObjectV1ResponseMPayload.iEzsigndocumentStepsignatureCurrent)) &&
        (this.aObjEzsignfoldersignerassociationstatus == null ? ezsigndocumentGetObjectV1ResponseMPayload.aObjEzsignfoldersignerassociationstatus == null : this.aObjEzsignfoldersignerassociationstatus.equals(ezsigndocumentGetObjectV1ResponseMPayload.aObjEzsignfoldersignerassociationstatus)) &&
        (this.aObjEzsigndocumentdependency == null ? ezsigndocumentGetObjectV1ResponseMPayload.aObjEzsigndocumentdependency == null : this.aObjEzsigndocumentdependency.equals(ezsigndocumentGetObjectV1ResponseMPayload.aObjEzsigndocumentdependency));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigndocumentID == null ? 0: this.pkiEzsigndocumentID.hashCode());
    result = 31 * result + (this.fkiEzsignfolderID == null ? 0: this.fkiEzsignfolderID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldersignerassociationIDDeclinedtosign == null ? 0: this.fkiEzsignfoldersignerassociationIDDeclinedtosign.hashCode());
    result = 31 * result + (this.dtEzsigndocumentDuedate == null ? 0: this.dtEzsigndocumentDuedate.hashCode());
    result = 31 * result + (this.dtEzsignformCompleted == null ? 0: this.dtEzsignformCompleted.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.sEzsigndocumentName == null ? 0: this.sEzsigndocumentName.hashCode());
    result = 31 * result + (this.eEzsigndocumentStep == null ? 0: this.eEzsigndocumentStep.hashCode());
    result = 31 * result + (this.dtEzsigndocumentFirstsend == null ? 0: this.dtEzsigndocumentFirstsend.hashCode());
    result = 31 * result + (this.dtEzsigndocumentLastsend == null ? 0: this.dtEzsigndocumentLastsend.hashCode());
    result = 31 * result + (this.iEzsigndocumentOrder == null ? 0: this.iEzsigndocumentOrder.hashCode());
    result = 31 * result + (this.iEzsigndocumentPagetotal == null ? 0: this.iEzsigndocumentPagetotal.hashCode());
    result = 31 * result + (this.iEzsigndocumentSignaturesigned == null ? 0: this.iEzsigndocumentSignaturesigned.hashCode());
    result = 31 * result + (this.iEzsigndocumentSignaturetotal == null ? 0: this.iEzsigndocumentSignaturetotal.hashCode());
    result = 31 * result + (this.iEzsigndocumentFormfieldtotal == null ? 0: this.iEzsigndocumentFormfieldtotal.hashCode());
    result = 31 * result + (this.sEzsigndocumentMD5initial == null ? 0: this.sEzsigndocumentMD5initial.hashCode());
    result = 31 * result + (this.tEzsigndocumentDeclinedtosignreason == null ? 0: this.tEzsigndocumentDeclinedtosignreason.hashCode());
    result = 31 * result + (this.sEzsigndocumentMD5signed == null ? 0: this.sEzsigndocumentMD5signed.hashCode());
    result = 31 * result + (this.bEzsigndocumentEzsignform == null ? 0: this.bEzsigndocumentEzsignform.hashCode());
    result = 31 * result + (this.bEzsigndocumentHassignedsignatures == null ? 0: this.bEzsigndocumentHassignedsignatures.hashCode());
    result = 31 * result + (this.objAudit == null ? 0: this.objAudit.hashCode());
    result = 31 * result + (this.sEzsigndocumentExternalid == null ? 0: this.sEzsigndocumentExternalid.hashCode());
    result = 31 * result + (this.iEzsigndocumentEzsignsignatureattachmenttotal == null ? 0: this.iEzsigndocumentEzsignsignatureattachmenttotal.hashCode());
    result = 31 * result + (this.iEzsigndocumentEzsigndiscussiontotal == null ? 0: this.iEzsigndocumentEzsigndiscussiontotal.hashCode());
    result = 31 * result + (this.eEzsigndocumentSteptype == null ? 0: this.eEzsigndocumentSteptype.hashCode());
    result = 31 * result + (this.iEzsigndocumentStepformtotal == null ? 0: this.iEzsigndocumentStepformtotal.hashCode());
    result = 31 * result + (this.iEzsigndocumentStepformcurrent == null ? 0: this.iEzsigndocumentStepformcurrent.hashCode());
    result = 31 * result + (this.iEzsigndocumentStepsignaturetotal == null ? 0: this.iEzsigndocumentStepsignaturetotal.hashCode());
    result = 31 * result + (this.iEzsigndocumentStepsignatureCurrent == null ? 0: this.iEzsigndocumentStepsignatureCurrent.hashCode());
    result = 31 * result + (this.aObjEzsignfoldersignerassociationstatus == null ? 0: this.aObjEzsignfoldersignerassociationstatus.hashCode());
    result = 31 * result + (this.aObjEzsigndocumentdependency == null ? 0: this.aObjEzsigndocumentdependency.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentGetObjectV1ResponseMPayload {\n");
    
    sb.append("  pkiEzsigndocumentID: ").append(pkiEzsigndocumentID).append("\n");
    sb.append("  fkiEzsignfolderID: ").append(fkiEzsignfolderID).append("\n");
    sb.append("  fkiEzsignfoldersignerassociationIDDeclinedtosign: ").append(fkiEzsignfoldersignerassociationIDDeclinedtosign).append("\n");
    sb.append("  dtEzsigndocumentDuedate: ").append(dtEzsigndocumentDuedate).append("\n");
    sb.append("  dtEzsignformCompleted: ").append(dtEzsignformCompleted).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  sEzsigndocumentName: ").append(sEzsigndocumentName).append("\n");
    sb.append("  eEzsigndocumentStep: ").append(eEzsigndocumentStep).append("\n");
    sb.append("  dtEzsigndocumentFirstsend: ").append(dtEzsigndocumentFirstsend).append("\n");
    sb.append("  dtEzsigndocumentLastsend: ").append(dtEzsigndocumentLastsend).append("\n");
    sb.append("  iEzsigndocumentOrder: ").append(iEzsigndocumentOrder).append("\n");
    sb.append("  iEzsigndocumentPagetotal: ").append(iEzsigndocumentPagetotal).append("\n");
    sb.append("  iEzsigndocumentSignaturesigned: ").append(iEzsigndocumentSignaturesigned).append("\n");
    sb.append("  iEzsigndocumentSignaturetotal: ").append(iEzsigndocumentSignaturetotal).append("\n");
    sb.append("  iEzsigndocumentFormfieldtotal: ").append(iEzsigndocumentFormfieldtotal).append("\n");
    sb.append("  sEzsigndocumentMD5initial: ").append(sEzsigndocumentMD5initial).append("\n");
    sb.append("  tEzsigndocumentDeclinedtosignreason: ").append(tEzsigndocumentDeclinedtosignreason).append("\n");
    sb.append("  sEzsigndocumentMD5signed: ").append(sEzsigndocumentMD5signed).append("\n");
    sb.append("  bEzsigndocumentEzsignform: ").append(bEzsigndocumentEzsignform).append("\n");
    sb.append("  bEzsigndocumentHassignedsignatures: ").append(bEzsigndocumentHassignedsignatures).append("\n");
    sb.append("  objAudit: ").append(objAudit).append("\n");
    sb.append("  sEzsigndocumentExternalid: ").append(sEzsigndocumentExternalid).append("\n");
    sb.append("  iEzsigndocumentEzsignsignatureattachmenttotal: ").append(iEzsigndocumentEzsignsignatureattachmenttotal).append("\n");
    sb.append("  iEzsigndocumentEzsigndiscussiontotal: ").append(iEzsigndocumentEzsigndiscussiontotal).append("\n");
    sb.append("  eEzsigndocumentSteptype: ").append(eEzsigndocumentSteptype).append("\n");
    sb.append("  iEzsigndocumentStepformtotal: ").append(iEzsigndocumentStepformtotal).append("\n");
    sb.append("  iEzsigndocumentStepformcurrent: ").append(iEzsigndocumentStepformcurrent).append("\n");
    sb.append("  iEzsigndocumentStepsignaturetotal: ").append(iEzsigndocumentStepsignaturetotal).append("\n");
    sb.append("  iEzsigndocumentStepsignatureCurrent: ").append(iEzsigndocumentStepsignatureCurrent).append("\n");
    sb.append("  aObjEzsignfoldersignerassociationstatus: ").append(aObjEzsignfoldersignerassociationstatus).append("\n");
    sb.append("  aObjEzsigndocumentdependency: ").append(aObjEzsigndocumentdependency).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
