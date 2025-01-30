/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
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
 * An Ezsigndocument Object and children to create a complete structure
 **/
@ApiModel(description = "An Ezsigndocument Object and children to create a complete structure")
public class EzsigndocumentRequestCompound {
  
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
     Keep,  Convert,  Discard,  Flatten, 
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
   * If the document contains an existing PDF form this property must be set.  **Keep** leaves the form as-is in the document.  **Convert** removes the form and convert all the existing fields to Ezsignformfieldgroups and assign them to the specified **fkiEzsignfoldersignerassociationID**  **Discard** removes the form from the document.  **Flatten** prints the form values in the document.
   **/
  @ApiModelProperty(value = "If the document contains an existing PDF form this property must be set.  **Keep** leaves the form as-is in the document.  **Convert** removes the form and convert all the existing fields to Ezsignformfieldgroups and assign them to the specified **fkiEzsignfoldersignerassociationID**  **Discard** removes the form from the document.  **Flatten** prints the form values in the document.")
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
    EzsigndocumentRequestCompound ezsigndocumentRequestCompound = (EzsigndocumentRequestCompound) o;
    return (this.pkiEzsigndocumentID == null ? ezsigndocumentRequestCompound.pkiEzsigndocumentID == null : this.pkiEzsigndocumentID.equals(ezsigndocumentRequestCompound.pkiEzsigndocumentID)) &&
        (this.fkiEzsignfolderID == null ? ezsigndocumentRequestCompound.fkiEzsignfolderID == null : this.fkiEzsignfolderID.equals(ezsigndocumentRequestCompound.fkiEzsignfolderID)) &&
        (this.fkiEzsigntemplateID == null ? ezsigndocumentRequestCompound.fkiEzsigntemplateID == null : this.fkiEzsigntemplateID.equals(ezsigndocumentRequestCompound.fkiEzsigntemplateID)) &&
        (this.fkiEzsignfoldersignerassociationID == null ? ezsigndocumentRequestCompound.fkiEzsignfoldersignerassociationID == null : this.fkiEzsignfoldersignerassociationID.equals(ezsigndocumentRequestCompound.fkiEzsignfoldersignerassociationID)) &&
        (this.fkiLanguageID == null ? ezsigndocumentRequestCompound.fkiLanguageID == null : this.fkiLanguageID.equals(ezsigndocumentRequestCompound.fkiLanguageID)) &&
        (this.eEzsigndocumentSource == null ? ezsigndocumentRequestCompound.eEzsigndocumentSource == null : this.eEzsigndocumentSource.equals(ezsigndocumentRequestCompound.eEzsigndocumentSource)) &&
        (this.eEzsigndocumentFormat == null ? ezsigndocumentRequestCompound.eEzsigndocumentFormat == null : this.eEzsigndocumentFormat.equals(ezsigndocumentRequestCompound.eEzsigndocumentFormat)) &&
        (this.sEzsigndocumentBase64 == null ? ezsigndocumentRequestCompound.sEzsigndocumentBase64 == null : this.sEzsigndocumentBase64.equals(ezsigndocumentRequestCompound.sEzsigndocumentBase64)) &&
        (this.sEzsigndocumentUrl == null ? ezsigndocumentRequestCompound.sEzsigndocumentUrl == null : this.sEzsigndocumentUrl.equals(ezsigndocumentRequestCompound.sEzsigndocumentUrl)) &&
        (this.bEzsigndocumentForcerepair == null ? ezsigndocumentRequestCompound.bEzsigndocumentForcerepair == null : this.bEzsigndocumentForcerepair.equals(ezsigndocumentRequestCompound.bEzsigndocumentForcerepair)) &&
        (this.sEzsigndocumentPassword == null ? ezsigndocumentRequestCompound.sEzsigndocumentPassword == null : this.sEzsigndocumentPassword.equals(ezsigndocumentRequestCompound.sEzsigndocumentPassword)) &&
        (this.eEzsigndocumentForm == null ? ezsigndocumentRequestCompound.eEzsigndocumentForm == null : this.eEzsigndocumentForm.equals(ezsigndocumentRequestCompound.eEzsigndocumentForm)) &&
        (this.dtEzsigndocumentDuedate == null ? ezsigndocumentRequestCompound.dtEzsigndocumentDuedate == null : this.dtEzsigndocumentDuedate.equals(ezsigndocumentRequestCompound.dtEzsigndocumentDuedate)) &&
        (this.sEzsigndocumentName == null ? ezsigndocumentRequestCompound.sEzsigndocumentName == null : this.sEzsigndocumentName.equals(ezsigndocumentRequestCompound.sEzsigndocumentName)) &&
        (this.sEzsigndocumentExternalid == null ? ezsigndocumentRequestCompound.sEzsigndocumentExternalid == null : this.sEzsigndocumentExternalid.equals(ezsigndocumentRequestCompound.sEzsigndocumentExternalid));
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
    sb.append("class EzsigndocumentRequestCompound {\n");
    
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
