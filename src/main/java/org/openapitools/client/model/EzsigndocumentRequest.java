/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsigndocument Object
 **/
@ApiModel(description = "An Ezsigndocument Object")
public class EzsigndocumentRequest {
  
  @SerializedName("pkiEzsigndocumentID")
  private Integer pkiEzsigndocumentID = null;
  @SerializedName("fkiEzsignfolderID")
  private Integer fkiEzsignfolderID = null;
  @SerializedName("fkiEzsigntemplateID")
  private Integer fkiEzsigntemplateID = null;
  @SerializedName("fkiEzsignfoldersignerassociationID")
  private Integer fkiEzsignfoldersignerassociationID = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  public enum EEzsigndocumentSourceEnum {
     Base64,  Ezsigntemplate,  Url, 
  };
  @SerializedName("eEzsigndocumentSource")
  private EEzsigndocumentSourceEnum eEzsigndocumentSource = null;
  public enum EEzsigndocumentFormatEnum {
     Pdf,  Doc,  Docx,  Xls,  Xlsx,  Ppt,  Pptx, 
  };
  @SerializedName("eEzsigndocumentFormat")
  private EEzsigndocumentFormatEnum eEzsigndocumentFormat = null;
  @SerializedName("sEzsigndocumentBase64")
  private byte[] sEzsigndocumentBase64 = null;
  @SerializedName("sEzsigndocumentUrl")
  private String sEzsigndocumentUrl = null;
  @SerializedName("bEzsigndocumentForcerepair")
  private Boolean bEzsigndocumentForcerepair = true;
  @SerializedName("sEzsigndocumentPassword")
  private String sEzsigndocumentPassword = null;
  public enum EEzsigndocumentFormEnum {
     Keep,  Convert, 
  };
  @SerializedName("eEzsigndocumentForm")
  private EEzsigndocumentFormEnum eEzsigndocumentForm = null;
  @SerializedName("dtEzsigndocumentDuedate")
  private String dtEzsigndocumentDuedate = null;
  @SerializedName("sEzsigndocumentName")
  private String sEzsigndocumentName = null;
  @SerializedName("sEzsigndocumentExternalid")
  private String sEzsigndocumentExternalid = null;

  /**
   * The unique ID of the Ezsigndocument
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsigndocument")
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
   * The unique ID of the Ezsigntemplate
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsigntemplate")
  public Integer getFkiEzsigntemplateID() {
    return fkiEzsigntemplateID;
  }
  public void setFkiEzsigntemplateID(Integer fkiEzsigntemplateID) {
    this.fkiEzsigntemplateID = fkiEzsigntemplateID;
  }

  /**
   * The unique ID of the Ezsignfoldersignerassociation
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignfoldersignerassociation")
  public Integer getFkiEzsignfoldersignerassociationID() {
    return fkiEzsignfoldersignerassociationID;
  }
  public void setFkiEzsignfoldersignerassociationID(Integer fkiEzsignfoldersignerassociationID) {
    this.fkiEzsignfoldersignerassociationID = fkiEzsignfoldersignerassociationID;
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
   * Indicates where to look for the document binary content.
   **/
  @ApiModelProperty(required = true, value = "Indicates where to look for the document binary content.")
  public EEzsigndocumentSourceEnum getEEzsigndocumentSource() {
    return eEzsigndocumentSource;
  }
  public void setEEzsigndocumentSource(EEzsigndocumentSourceEnum eEzsigndocumentSource) {
    this.eEzsigndocumentSource = eEzsigndocumentSource;
  }

  /**
   * Indicates the format of the document.
   **/
  @ApiModelProperty(value = "Indicates the format of the document.")
  public EEzsigndocumentFormatEnum getEEzsigndocumentFormat() {
    return eEzsigndocumentFormat;
  }
  public void setEEzsigndocumentFormat(EEzsigndocumentFormatEnum eEzsigndocumentFormat) {
    this.eEzsigndocumentFormat = eEzsigndocumentFormat;
  }

  /**
   * The Base64 encoded binary content of the document.  This field is Required when eEzsigndocumentSource = Base64.
   **/
  @ApiModelProperty(value = "The Base64 encoded binary content of the document.  This field is Required when eEzsigndocumentSource = Base64.")
  public byte[] getSEzsigndocumentBase64() {
    return sEzsigndocumentBase64;
  }
  public void setSEzsigndocumentBase64(byte[] sEzsigndocumentBase64) {
    this.sEzsigndocumentBase64 = sEzsigndocumentBase64;
  }

  /**
   * The url where the document content resides.  This field is Required when eEzsigndocumentSource = Url.
   **/
  @ApiModelProperty(value = "The url where the document content resides.  This field is Required when eEzsigndocumentSource = Url.")
  public String getSEzsigndocumentUrl() {
    return sEzsigndocumentUrl;
  }
  public void setSEzsigndocumentUrl(String sEzsigndocumentUrl) {
    this.sEzsigndocumentUrl = sEzsigndocumentUrl;
  }

  /**
   * Try to repair the document or flatten it if it cannot be used for electronic signature. 
   **/
  @ApiModelProperty(value = "Try to repair the document or flatten it if it cannot be used for electronic signature. ")
  public Boolean getBEzsigndocumentForcerepair() {
    return bEzsigndocumentForcerepair;
  }
  public void setBEzsigndocumentForcerepair(Boolean bEzsigndocumentForcerepair) {
    this.bEzsigndocumentForcerepair = bEzsigndocumentForcerepair;
  }

  /**
   * If the source document is password protected, the password to open/modify it.
   **/
  @ApiModelProperty(value = "If the source document is password protected, the password to open/modify it.")
  public String getSEzsigndocumentPassword() {
    return sEzsigndocumentPassword;
  }
  public void setSEzsigndocumentPassword(String sEzsigndocumentPassword) {
    this.sEzsigndocumentPassword = sEzsigndocumentPassword;
  }

  /**
   * If the document contains an existing PDF form this property must be set.  **Keep** leaves the form as-is in the document.  **Convert** removes the form and convert all the existing fields to Ezsignformfieldgroups and assign them to the specified **fkiEzsignfoldersignerassociationID**
   **/
  @ApiModelProperty(value = "If the document contains an existing PDF form this property must be set.  **Keep** leaves the form as-is in the document.  **Convert** removes the form and convert all the existing fields to Ezsignformfieldgroups and assign them to the specified **fkiEzsignfoldersignerassociationID**")
  public EEzsigndocumentFormEnum getEEzsigndocumentForm() {
    return eEzsigndocumentForm;
  }
  public void setEEzsigndocumentForm(EEzsigndocumentFormEnum eEzsigndocumentForm) {
    this.eEzsigndocumentForm = eEzsigndocumentForm;
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
   * This field can be used to store an External ID from the client's system.  Anything can be stored in this field, it will never be evaluated by the eZmax system and will be returned AS-IS.  To store multiple values, consider using a JSON formatted structure, a URL encoded string, a CSV or any other custom format. 
   **/
  @ApiModelProperty(value = "This field can be used to store an External ID from the client's system.  Anything can be stored in this field, it will never be evaluated by the eZmax system and will be returned AS-IS.  To store multiple values, consider using a JSON formatted structure, a URL encoded string, a CSV or any other custom format. ")
  public String getSEzsigndocumentExternalid() {
    return sEzsigndocumentExternalid;
  }
  public void setSEzsigndocumentExternalid(String sEzsigndocumentExternalid) {
    this.sEzsigndocumentExternalid = sEzsigndocumentExternalid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentRequest ezsigndocumentRequest = (EzsigndocumentRequest) o;
    return (this.pkiEzsigndocumentID == null ? ezsigndocumentRequest.pkiEzsigndocumentID == null : this.pkiEzsigndocumentID.equals(ezsigndocumentRequest.pkiEzsigndocumentID)) &&
        (this.fkiEzsignfolderID == null ? ezsigndocumentRequest.fkiEzsignfolderID == null : this.fkiEzsignfolderID.equals(ezsigndocumentRequest.fkiEzsignfolderID)) &&
        (this.fkiEzsigntemplateID == null ? ezsigndocumentRequest.fkiEzsigntemplateID == null : this.fkiEzsigntemplateID.equals(ezsigndocumentRequest.fkiEzsigntemplateID)) &&
        (this.fkiEzsignfoldersignerassociationID == null ? ezsigndocumentRequest.fkiEzsignfoldersignerassociationID == null : this.fkiEzsignfoldersignerassociationID.equals(ezsigndocumentRequest.fkiEzsignfoldersignerassociationID)) &&
        (this.fkiLanguageID == null ? ezsigndocumentRequest.fkiLanguageID == null : this.fkiLanguageID.equals(ezsigndocumentRequest.fkiLanguageID)) &&
        (this.eEzsigndocumentSource == null ? ezsigndocumentRequest.eEzsigndocumentSource == null : this.eEzsigndocumentSource.equals(ezsigndocumentRequest.eEzsigndocumentSource)) &&
        (this.eEzsigndocumentFormat == null ? ezsigndocumentRequest.eEzsigndocumentFormat == null : this.eEzsigndocumentFormat.equals(ezsigndocumentRequest.eEzsigndocumentFormat)) &&
        (this.sEzsigndocumentBase64 == null ? ezsigndocumentRequest.sEzsigndocumentBase64 == null : this.sEzsigndocumentBase64.equals(ezsigndocumentRequest.sEzsigndocumentBase64)) &&
        (this.sEzsigndocumentUrl == null ? ezsigndocumentRequest.sEzsigndocumentUrl == null : this.sEzsigndocumentUrl.equals(ezsigndocumentRequest.sEzsigndocumentUrl)) &&
        (this.bEzsigndocumentForcerepair == null ? ezsigndocumentRequest.bEzsigndocumentForcerepair == null : this.bEzsigndocumentForcerepair.equals(ezsigndocumentRequest.bEzsigndocumentForcerepair)) &&
        (this.sEzsigndocumentPassword == null ? ezsigndocumentRequest.sEzsigndocumentPassword == null : this.sEzsigndocumentPassword.equals(ezsigndocumentRequest.sEzsigndocumentPassword)) &&
        (this.eEzsigndocumentForm == null ? ezsigndocumentRequest.eEzsigndocumentForm == null : this.eEzsigndocumentForm.equals(ezsigndocumentRequest.eEzsigndocumentForm)) &&
        (this.dtEzsigndocumentDuedate == null ? ezsigndocumentRequest.dtEzsigndocumentDuedate == null : this.dtEzsigndocumentDuedate.equals(ezsigndocumentRequest.dtEzsigndocumentDuedate)) &&
        (this.sEzsigndocumentName == null ? ezsigndocumentRequest.sEzsigndocumentName == null : this.sEzsigndocumentName.equals(ezsigndocumentRequest.sEzsigndocumentName)) &&
        (this.sEzsigndocumentExternalid == null ? ezsigndocumentRequest.sEzsigndocumentExternalid == null : this.sEzsigndocumentExternalid.equals(ezsigndocumentRequest.sEzsigndocumentExternalid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigndocumentID == null ? 0: this.pkiEzsigndocumentID.hashCode());
    result = 31 * result + (this.fkiEzsignfolderID == null ? 0: this.fkiEzsignfolderID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplateID == null ? 0: this.fkiEzsigntemplateID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldersignerassociationID == null ? 0: this.fkiEzsignfoldersignerassociationID.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.eEzsigndocumentSource == null ? 0: this.eEzsigndocumentSource.hashCode());
    result = 31 * result + (this.eEzsigndocumentFormat == null ? 0: this.eEzsigndocumentFormat.hashCode());
    result = 31 * result + (this.sEzsigndocumentBase64 == null ? 0: this.sEzsigndocumentBase64.hashCode());
    result = 31 * result + (this.sEzsigndocumentUrl == null ? 0: this.sEzsigndocumentUrl.hashCode());
    result = 31 * result + (this.bEzsigndocumentForcerepair == null ? 0: this.bEzsigndocumentForcerepair.hashCode());
    result = 31 * result + (this.sEzsigndocumentPassword == null ? 0: this.sEzsigndocumentPassword.hashCode());
    result = 31 * result + (this.eEzsigndocumentForm == null ? 0: this.eEzsigndocumentForm.hashCode());
    result = 31 * result + (this.dtEzsigndocumentDuedate == null ? 0: this.dtEzsigndocumentDuedate.hashCode());
    result = 31 * result + (this.sEzsigndocumentName == null ? 0: this.sEzsigndocumentName.hashCode());
    result = 31 * result + (this.sEzsigndocumentExternalid == null ? 0: this.sEzsigndocumentExternalid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentRequest {\n");
    
    sb.append("  pkiEzsigndocumentID: ").append(pkiEzsigndocumentID).append("\n");
    sb.append("  fkiEzsignfolderID: ").append(fkiEzsignfolderID).append("\n");
    sb.append("  fkiEzsigntemplateID: ").append(fkiEzsigntemplateID).append("\n");
    sb.append("  fkiEzsignfoldersignerassociationID: ").append(fkiEzsignfoldersignerassociationID).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  eEzsigndocumentSource: ").append(eEzsigndocumentSource).append("\n");
    sb.append("  eEzsigndocumentFormat: ").append(eEzsigndocumentFormat).append("\n");
    sb.append("  sEzsigndocumentBase64: ").append(sEzsigndocumentBase64).append("\n");
    sb.append("  sEzsigndocumentUrl: ").append(sEzsigndocumentUrl).append("\n");
    sb.append("  bEzsigndocumentForcerepair: ").append(bEzsigndocumentForcerepair).append("\n");
    sb.append("  sEzsigndocumentPassword: ").append(sEzsigndocumentPassword).append("\n");
    sb.append("  eEzsigndocumentForm: ").append(eEzsigndocumentForm).append("\n");
    sb.append("  dtEzsigndocumentDuedate: ").append(dtEzsigndocumentDuedate).append("\n");
    sb.append("  sEzsigndocumentName: ").append(sEzsigndocumentName).append("\n");
    sb.append("  sEzsigndocumentExternalid: ").append(sEzsigndocumentExternalid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
