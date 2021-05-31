/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.44
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.CommonAudit;
import org.openapitools.client.model.EzsigndocumentResponseAllOf;
import org.openapitools.client.model.FieldEEzsigndocumentStep;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsigndocument Object
 **/
@ApiModel(description = "An Ezsigndocument Object")
public class EzsigndocumentResponse {
  
  @SerializedName("fkiEzsignfolderID")
  private Integer fkiEzsignfolderID = null;
  @SerializedName("dtEzsigndocumentDuedate")
  private String dtEzsigndocumentDuedate = null;
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
  @SerializedName("objAudit")
  private CommonAudit objAudit = null;

  /**
   * The unique ID of the Ezsignfolder
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfolder")
  public Integer getFkiEzsignfolderID() {
    return fkiEzsignfolderID;
  }
  public void setFkiEzsignfolderID(Integer fkiEzsignfolderID) {
    this.fkiEzsignfolderID = fkiEzsignfolderID;
  }

  /**
   * The maximum date and time at which the document can be signed.
   **/
  @ApiModelProperty(required = true, value = "The maximum date and time at which the document can be signed.")
  public String getDtEzsigndocumentDuedate() {
    return dtEzsigndocumentDuedate;
  }
  public void setDtEzsigndocumentDuedate(String dtEzsigndocumentDuedate) {
    this.dtEzsigndocumentDuedate = dtEzsigndocumentDuedate;
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
   * The unique ID of the Ezsigntemplate
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplate")
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
  @ApiModelProperty(required = true, value = "The date and time when the Ezsigndocument was first sent.")
  public String getDtEzsigndocumentFirstsend() {
    return dtEzsigndocumentFirstsend;
  }
  public void setDtEzsigndocumentFirstsend(String dtEzsigndocumentFirstsend) {
    this.dtEzsigndocumentFirstsend = dtEzsigndocumentFirstsend;
  }

  /**
   * The date and time when the Ezsigndocument was sent the last time.
   **/
  @ApiModelProperty(required = true, value = "The date and time when the Ezsigndocument was sent the last time.")
  public String getDtEzsigndocumentLastsend() {
    return dtEzsigndocumentLastsend;
  }
  public void setDtEzsigndocumentLastsend(String dtEzsigndocumentLastsend) {
    this.dtEzsigndocumentLastsend = dtEzsigndocumentLastsend;
  }

  /**
   * The order in which the Ezsigndocument will be presented to the signatory in the Ezsignfolder.
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
   **/
  @ApiModelProperty(required = true, value = "")
  public CommonAudit getObjAudit() {
    return objAudit;
  }
  public void setObjAudit(CommonAudit objAudit) {
    this.objAudit = objAudit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentResponse ezsigndocumentResponse = (EzsigndocumentResponse) o;
    return (this.fkiEzsignfolderID == null ? ezsigndocumentResponse.fkiEzsignfolderID == null : this.fkiEzsignfolderID.equals(ezsigndocumentResponse.fkiEzsignfolderID)) &&
        (this.dtEzsigndocumentDuedate == null ? ezsigndocumentResponse.dtEzsigndocumentDuedate == null : this.dtEzsigndocumentDuedate.equals(ezsigndocumentResponse.dtEzsigndocumentDuedate)) &&
        (this.fkiLanguageID == null ? ezsigndocumentResponse.fkiLanguageID == null : this.fkiLanguageID.equals(ezsigndocumentResponse.fkiLanguageID)) &&
        (this.sEzsigndocumentName == null ? ezsigndocumentResponse.sEzsigndocumentName == null : this.sEzsigndocumentName.equals(ezsigndocumentResponse.sEzsigndocumentName)) &&
        (this.pkiEzsigndocumentID == null ? ezsigndocumentResponse.pkiEzsigndocumentID == null : this.pkiEzsigndocumentID.equals(ezsigndocumentResponse.pkiEzsigndocumentID)) &&
        (this.eEzsigndocumentStep == null ? ezsigndocumentResponse.eEzsigndocumentStep == null : this.eEzsigndocumentStep.equals(ezsigndocumentResponse.eEzsigndocumentStep)) &&
        (this.dtEzsigndocumentFirstsend == null ? ezsigndocumentResponse.dtEzsigndocumentFirstsend == null : this.dtEzsigndocumentFirstsend.equals(ezsigndocumentResponse.dtEzsigndocumentFirstsend)) &&
        (this.dtEzsigndocumentLastsend == null ? ezsigndocumentResponse.dtEzsigndocumentLastsend == null : this.dtEzsigndocumentLastsend.equals(ezsigndocumentResponse.dtEzsigndocumentLastsend)) &&
        (this.iEzsigndocumentOrder == null ? ezsigndocumentResponse.iEzsigndocumentOrder == null : this.iEzsigndocumentOrder.equals(ezsigndocumentResponse.iEzsigndocumentOrder)) &&
        (this.iEzsigndocumentPagetotal == null ? ezsigndocumentResponse.iEzsigndocumentPagetotal == null : this.iEzsigndocumentPagetotal.equals(ezsigndocumentResponse.iEzsigndocumentPagetotal)) &&
        (this.iEzsigndocumentSignaturesigned == null ? ezsigndocumentResponse.iEzsigndocumentSignaturesigned == null : this.iEzsigndocumentSignaturesigned.equals(ezsigndocumentResponse.iEzsigndocumentSignaturesigned)) &&
        (this.iEzsigndocumentSignaturetotal == null ? ezsigndocumentResponse.iEzsigndocumentSignaturetotal == null : this.iEzsigndocumentSignaturetotal.equals(ezsigndocumentResponse.iEzsigndocumentSignaturetotal)) &&
        (this.sEzsigndocumentMD5initial == null ? ezsigndocumentResponse.sEzsigndocumentMD5initial == null : this.sEzsigndocumentMD5initial.equals(ezsigndocumentResponse.sEzsigndocumentMD5initial)) &&
        (this.sEzsigndocumentMD5signed == null ? ezsigndocumentResponse.sEzsigndocumentMD5signed == null : this.sEzsigndocumentMD5signed.equals(ezsigndocumentResponse.sEzsigndocumentMD5signed)) &&
        (this.objAudit == null ? ezsigndocumentResponse.objAudit == null : this.objAudit.equals(ezsigndocumentResponse.objAudit));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiEzsignfolderID == null ? 0: this.fkiEzsignfolderID.hashCode());
    result = 31 * result + (this.dtEzsigndocumentDuedate == null ? 0: this.dtEzsigndocumentDuedate.hashCode());
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
    result = 31 * result + (this.objAudit == null ? 0: this.objAudit.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentResponse {\n");
    
    sb.append("  fkiEzsignfolderID: ").append(fkiEzsignfolderID).append("\n");
    sb.append("  dtEzsigndocumentDuedate: ").append(dtEzsigndocumentDuedate).append("\n");
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
    sb.append("  objAudit: ").append(objAudit).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
