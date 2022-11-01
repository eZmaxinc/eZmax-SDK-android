/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CommonAudit;
import org.openapitools.client.model.CustomEzsignfoldersignerassociationstatusResponse;
import org.openapitools.client.model.EzsigndocumentResponse;
import org.openapitools.client.model.EzsigndocumentResponseCompoundAllOf;
import org.openapitools.client.model.FieldEEzsigndocumentStep;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsigndocument Object and children to create a complete structure
 **/
@ApiModel(description = "An Ezsigndocument Object and children to create a complete structure")
public class EzsigndocumentResponseCompound {
  
  @SerializedName("fkiEzsignfolderID")
  private Integer fkiEzsignfolderID = null;
  @SerializedName("dtEzsigndocumentDuedate")
  private String dtEzsigndocumentDuedate = null;
  @SerializedName("dtEzsignformCompleted")
  private String dtEzsignformCompleted = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("sEzsigndocumentName")
  private String sEzsigndocumentName = null;
  @SerializedName("pkiEzsigndocumentID")
  private Integer pkiEzsigndocumentID = null;
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
  @SerializedName("sEzsigndocumentMD5initial")
  private String sEzsigndocumentMD5initial = null;
  @SerializedName("sEzsigndocumentMD5signed")
  private String sEzsigndocumentMD5signed = null;
  @SerializedName("bEzsigndocumentEzsignform")
  private Boolean bEzsigndocumentEzsignform = null;
  @SerializedName("objAudit")
  private CommonAudit objAudit = null;
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
  @ApiModelProperty(required = true, value = "The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|")
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
   * MD5 Hash of the initial PDF Document before signatures were applied to it.
   **/
  @ApiModelProperty(required = true, value = "MD5 Hash of the initial PDF Document before signatures were applied to it.")
  public String getSEzsigndocumentMD5initial() {
    return sEzsigndocumentMD5initial;
  }
  public void setSEzsigndocumentMD5initial(String sEzsigndocumentMD5initial) {
    this.sEzsigndocumentMD5initial = sEzsigndocumentMD5initial;
  }

  /**
   * MD5 Hash of the final PDF Document after all signatures were applied to it.
   **/
  @ApiModelProperty(required = true, value = "MD5 Hash of the final PDF Document after all signatures were applied to it.")
  public String getSEzsigndocumentMD5signed() {
    return sEzsigndocumentMD5signed;
  }
  public void setSEzsigndocumentMD5signed(String sEzsigndocumentMD5signed) {
    this.sEzsigndocumentMD5signed = sEzsigndocumentMD5signed;
  }

  /**
   * If the Ezsigndocument contains an Ezsignform or not
   **/
  @ApiModelProperty(required = true, value = "If the Ezsigndocument contains an Ezsignform or not")
  public Boolean getBEzsigndocumentEzsignform() {
    return bEzsigndocumentEzsignform;
  }
  public void setBEzsigndocumentEzsignform(Boolean bEzsigndocumentEzsignform) {
    this.bEzsigndocumentEzsignform = bEzsigndocumentEzsignform;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CommonAudit getObjAudit() {
    return objAudit;
  }
  public void setObjAudit(CommonAudit objAudit) {
    this.objAudit = objAudit;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentResponseCompound ezsigndocumentResponseCompound = (EzsigndocumentResponseCompound) o;
    return (this.fkiEzsignfolderID == null ? ezsigndocumentResponseCompound.fkiEzsignfolderID == null : this.fkiEzsignfolderID.equals(ezsigndocumentResponseCompound.fkiEzsignfolderID)) &&
        (this.dtEzsigndocumentDuedate == null ? ezsigndocumentResponseCompound.dtEzsigndocumentDuedate == null : this.dtEzsigndocumentDuedate.equals(ezsigndocumentResponseCompound.dtEzsigndocumentDuedate)) &&
        (this.dtEzsignformCompleted == null ? ezsigndocumentResponseCompound.dtEzsignformCompleted == null : this.dtEzsignformCompleted.equals(ezsigndocumentResponseCompound.dtEzsignformCompleted)) &&
        (this.fkiLanguageID == null ? ezsigndocumentResponseCompound.fkiLanguageID == null : this.fkiLanguageID.equals(ezsigndocumentResponseCompound.fkiLanguageID)) &&
        (this.sEzsigndocumentName == null ? ezsigndocumentResponseCompound.sEzsigndocumentName == null : this.sEzsigndocumentName.equals(ezsigndocumentResponseCompound.sEzsigndocumentName)) &&
        (this.pkiEzsigndocumentID == null ? ezsigndocumentResponseCompound.pkiEzsigndocumentID == null : this.pkiEzsigndocumentID.equals(ezsigndocumentResponseCompound.pkiEzsigndocumentID)) &&
        (this.eEzsigndocumentStep == null ? ezsigndocumentResponseCompound.eEzsigndocumentStep == null : this.eEzsigndocumentStep.equals(ezsigndocumentResponseCompound.eEzsigndocumentStep)) &&
        (this.dtEzsigndocumentFirstsend == null ? ezsigndocumentResponseCompound.dtEzsigndocumentFirstsend == null : this.dtEzsigndocumentFirstsend.equals(ezsigndocumentResponseCompound.dtEzsigndocumentFirstsend)) &&
        (this.dtEzsigndocumentLastsend == null ? ezsigndocumentResponseCompound.dtEzsigndocumentLastsend == null : this.dtEzsigndocumentLastsend.equals(ezsigndocumentResponseCompound.dtEzsigndocumentLastsend)) &&
        (this.iEzsigndocumentOrder == null ? ezsigndocumentResponseCompound.iEzsigndocumentOrder == null : this.iEzsigndocumentOrder.equals(ezsigndocumentResponseCompound.iEzsigndocumentOrder)) &&
        (this.iEzsigndocumentPagetotal == null ? ezsigndocumentResponseCompound.iEzsigndocumentPagetotal == null : this.iEzsigndocumentPagetotal.equals(ezsigndocumentResponseCompound.iEzsigndocumentPagetotal)) &&
        (this.iEzsigndocumentSignaturesigned == null ? ezsigndocumentResponseCompound.iEzsigndocumentSignaturesigned == null : this.iEzsigndocumentSignaturesigned.equals(ezsigndocumentResponseCompound.iEzsigndocumentSignaturesigned)) &&
        (this.iEzsigndocumentSignaturetotal == null ? ezsigndocumentResponseCompound.iEzsigndocumentSignaturetotal == null : this.iEzsigndocumentSignaturetotal.equals(ezsigndocumentResponseCompound.iEzsigndocumentSignaturetotal)) &&
        (this.sEzsigndocumentMD5initial == null ? ezsigndocumentResponseCompound.sEzsigndocumentMD5initial == null : this.sEzsigndocumentMD5initial.equals(ezsigndocumentResponseCompound.sEzsigndocumentMD5initial)) &&
        (this.sEzsigndocumentMD5signed == null ? ezsigndocumentResponseCompound.sEzsigndocumentMD5signed == null : this.sEzsigndocumentMD5signed.equals(ezsigndocumentResponseCompound.sEzsigndocumentMD5signed)) &&
        (this.bEzsigndocumentEzsignform == null ? ezsigndocumentResponseCompound.bEzsigndocumentEzsignform == null : this.bEzsigndocumentEzsignform.equals(ezsigndocumentResponseCompound.bEzsigndocumentEzsignform)) &&
        (this.objAudit == null ? ezsigndocumentResponseCompound.objAudit == null : this.objAudit.equals(ezsigndocumentResponseCompound.objAudit)) &&
        (this.iEzsigndocumentStepformtotal == null ? ezsigndocumentResponseCompound.iEzsigndocumentStepformtotal == null : this.iEzsigndocumentStepformtotal.equals(ezsigndocumentResponseCompound.iEzsigndocumentStepformtotal)) &&
        (this.iEzsigndocumentStepformcurrent == null ? ezsigndocumentResponseCompound.iEzsigndocumentStepformcurrent == null : this.iEzsigndocumentStepformcurrent.equals(ezsigndocumentResponseCompound.iEzsigndocumentStepformcurrent)) &&
        (this.iEzsigndocumentStepsignaturetotal == null ? ezsigndocumentResponseCompound.iEzsigndocumentStepsignaturetotal == null : this.iEzsigndocumentStepsignaturetotal.equals(ezsigndocumentResponseCompound.iEzsigndocumentStepsignaturetotal)) &&
        (this.iEzsigndocumentStepsignatureCurrent == null ? ezsigndocumentResponseCompound.iEzsigndocumentStepsignatureCurrent == null : this.iEzsigndocumentStepsignatureCurrent.equals(ezsigndocumentResponseCompound.iEzsigndocumentStepsignatureCurrent)) &&
        (this.aObjEzsignfoldersignerassociationstatus == null ? ezsigndocumentResponseCompound.aObjEzsignfoldersignerassociationstatus == null : this.aObjEzsignfoldersignerassociationstatus.equals(ezsigndocumentResponseCompound.aObjEzsignfoldersignerassociationstatus));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiEzsignfolderID == null ? 0: this.fkiEzsignfolderID.hashCode());
    result = 31 * result + (this.dtEzsigndocumentDuedate == null ? 0: this.dtEzsigndocumentDuedate.hashCode());
    result = 31 * result + (this.dtEzsignformCompleted == null ? 0: this.dtEzsignformCompleted.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.sEzsigndocumentName == null ? 0: this.sEzsigndocumentName.hashCode());
    result = 31 * result + (this.pkiEzsigndocumentID == null ? 0: this.pkiEzsigndocumentID.hashCode());
    result = 31 * result + (this.eEzsigndocumentStep == null ? 0: this.eEzsigndocumentStep.hashCode());
    result = 31 * result + (this.dtEzsigndocumentFirstsend == null ? 0: this.dtEzsigndocumentFirstsend.hashCode());
    result = 31 * result + (this.dtEzsigndocumentLastsend == null ? 0: this.dtEzsigndocumentLastsend.hashCode());
    result = 31 * result + (this.iEzsigndocumentOrder == null ? 0: this.iEzsigndocumentOrder.hashCode());
    result = 31 * result + (this.iEzsigndocumentPagetotal == null ? 0: this.iEzsigndocumentPagetotal.hashCode());
    result = 31 * result + (this.iEzsigndocumentSignaturesigned == null ? 0: this.iEzsigndocumentSignaturesigned.hashCode());
    result = 31 * result + (this.iEzsigndocumentSignaturetotal == null ? 0: this.iEzsigndocumentSignaturetotal.hashCode());
    result = 31 * result + (this.sEzsigndocumentMD5initial == null ? 0: this.sEzsigndocumentMD5initial.hashCode());
    result = 31 * result + (this.sEzsigndocumentMD5signed == null ? 0: this.sEzsigndocumentMD5signed.hashCode());
    result = 31 * result + (this.bEzsigndocumentEzsignform == null ? 0: this.bEzsigndocumentEzsignform.hashCode());
    result = 31 * result + (this.objAudit == null ? 0: this.objAudit.hashCode());
    result = 31 * result + (this.iEzsigndocumentStepformtotal == null ? 0: this.iEzsigndocumentStepformtotal.hashCode());
    result = 31 * result + (this.iEzsigndocumentStepformcurrent == null ? 0: this.iEzsigndocumentStepformcurrent.hashCode());
    result = 31 * result + (this.iEzsigndocumentStepsignaturetotal == null ? 0: this.iEzsigndocumentStepsignaturetotal.hashCode());
    result = 31 * result + (this.iEzsigndocumentStepsignatureCurrent == null ? 0: this.iEzsigndocumentStepsignatureCurrent.hashCode());
    result = 31 * result + (this.aObjEzsignfoldersignerassociationstatus == null ? 0: this.aObjEzsignfoldersignerassociationstatus.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentResponseCompound {\n");
    
    sb.append("  fkiEzsignfolderID: ").append(fkiEzsignfolderID).append("\n");
    sb.append("  dtEzsigndocumentDuedate: ").append(dtEzsigndocumentDuedate).append("\n");
    sb.append("  dtEzsignformCompleted: ").append(dtEzsignformCompleted).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  sEzsigndocumentName: ").append(sEzsigndocumentName).append("\n");
    sb.append("  pkiEzsigndocumentID: ").append(pkiEzsigndocumentID).append("\n");
    sb.append("  eEzsigndocumentStep: ").append(eEzsigndocumentStep).append("\n");
    sb.append("  dtEzsigndocumentFirstsend: ").append(dtEzsigndocumentFirstsend).append("\n");
    sb.append("  dtEzsigndocumentLastsend: ").append(dtEzsigndocumentLastsend).append("\n");
    sb.append("  iEzsigndocumentOrder: ").append(iEzsigndocumentOrder).append("\n");
    sb.append("  iEzsigndocumentPagetotal: ").append(iEzsigndocumentPagetotal).append("\n");
    sb.append("  iEzsigndocumentSignaturesigned: ").append(iEzsigndocumentSignaturesigned).append("\n");
    sb.append("  iEzsigndocumentSignaturetotal: ").append(iEzsigndocumentSignaturetotal).append("\n");
    sb.append("  sEzsigndocumentMD5initial: ").append(sEzsigndocumentMD5initial).append("\n");
    sb.append("  sEzsigndocumentMD5signed: ").append(sEzsigndocumentMD5signed).append("\n");
    sb.append("  bEzsigndocumentEzsignform: ").append(bEzsigndocumentEzsignform).append("\n");
    sb.append("  objAudit: ").append(objAudit).append("\n");
    sb.append("  iEzsigndocumentStepformtotal: ").append(iEzsigndocumentStepformtotal).append("\n");
    sb.append("  iEzsigndocumentStepformcurrent: ").append(iEzsigndocumentStepformcurrent).append("\n");
    sb.append("  iEzsigndocumentStepsignaturetotal: ").append(iEzsigndocumentStepsignaturetotal).append("\n");
    sb.append("  iEzsigndocumentStepsignatureCurrent: ").append(iEzsigndocumentStepsignatureCurrent).append("\n");
    sb.append("  aObjEzsignfoldersignerassociationstatus: ").append(aObjEzsignfoldersignerassociationstatus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
