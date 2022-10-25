/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
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
 * A Ezsigntemplatedocument Object
 **/
@ApiModel(description = "A Ezsigntemplatedocument Object")
public class EzsigntemplatedocumentRequest {
  
  @SerializedName("pkiEzsigntemplatedocumentID")
  private Integer pkiEzsigntemplatedocumentID = null;
  @SerializedName("fkiEzsigntemplateID")
  private Integer fkiEzsigntemplateID = null;
  @SerializedName("fkiEzsigndocumentID")
  private Integer fkiEzsigndocumentID = null;
  @SerializedName("fkiEzsigntemplatesignerID")
  private Integer fkiEzsigntemplatesignerID = null;
  @SerializedName("sEzsigntemplatedocumentName")
  private String sEzsigntemplatedocumentName = null;
  public enum EEzsigntemplatedocumentSourceEnum {
     Base64,  Url,  Ezsigndocument, 
  };
  @SerializedName("eEzsigntemplatedocumentSource")
  private EEzsigntemplatedocumentSourceEnum eEzsigntemplatedocumentSource = null;
  public enum EEzsigntemplatedocumentFormatEnum {
     Pdf, 
  };
  @SerializedName("eEzsigntemplatedocumentFormat")
  private EEzsigntemplatedocumentFormatEnum eEzsigntemplatedocumentFormat = null;
  @SerializedName("sEzsigntemplatedocumentBase64")
  private byte[] sEzsigntemplatedocumentBase64 = null;
  @SerializedName("sEzsigntemplatedocumentUrl")
  private String sEzsigntemplatedocumentUrl = null;
  @SerializedName("bEzsigntemplatedocumentForcerepair")
  private Boolean bEzsigntemplatedocumentForcerepair = null;
  public enum EEzsigntemplatedocumentFormEnum {
     Keep,  Convert, 
  };
  @SerializedName("eEzsigntemplatedocumentForm")
  private EEzsigntemplatedocumentFormEnum eEzsigntemplatedocumentForm = null;
  @SerializedName("sEzsigntemplatedocumentPassword")
  private String sEzsigntemplatedocumentPassword = ;

  /**
   * The unique ID of the Ezsigntemplatedocument
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsigntemplatedocument")
  public Integer getPkiEzsigntemplatedocumentID() {
    return pkiEzsigntemplatedocumentID;
  }
  public void setPkiEzsigntemplatedocumentID(Integer pkiEzsigntemplatedocumentID) {
    this.pkiEzsigntemplatedocumentID = pkiEzsigntemplatedocumentID;
  }

  /**
   * The unique ID of the Ezsigntemplate
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplate")
  public Integer getFkiEzsigntemplateID() {
    return fkiEzsigntemplateID;
  }
  public void setFkiEzsigntemplateID(Integer fkiEzsigntemplateID) {
    this.fkiEzsigntemplateID = fkiEzsigntemplateID;
  }

  /**
   * The unique ID of the Ezsigndocument
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsigndocument")
  public Integer getFkiEzsigndocumentID() {
    return fkiEzsigndocumentID;
  }
  public void setFkiEzsigndocumentID(Integer fkiEzsigndocumentID) {
    this.fkiEzsigndocumentID = fkiEzsigndocumentID;
  }

  /**
   * The unique ID of the Ezsigntemplatesigner
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsigntemplatesigner")
  public Integer getFkiEzsigntemplatesignerID() {
    return fkiEzsigntemplatesignerID;
  }
  public void setFkiEzsigntemplatesignerID(Integer fkiEzsigntemplatesignerID) {
    this.fkiEzsigntemplatesignerID = fkiEzsigntemplatesignerID;
  }

  /**
   * The name of the Ezsigntemplatedocument.
   **/
  @ApiModelProperty(required = true, value = "The name of the Ezsigntemplatedocument.")
  public String getSEzsigntemplatedocumentName() {
    return sEzsigntemplatedocumentName;
  }
  public void setSEzsigntemplatedocumentName(String sEzsigntemplatedocumentName) {
    this.sEzsigntemplatedocumentName = sEzsigntemplatedocumentName;
  }

  /**
   * Indicates where to look for the document binary content.
   **/
  @ApiModelProperty(required = true, value = "Indicates where to look for the document binary content.")
  public EEzsigntemplatedocumentSourceEnum getEEzsigntemplatedocumentSource() {
    return eEzsigntemplatedocumentSource;
  }
  public void setEEzsigntemplatedocumentSource(EEzsigntemplatedocumentSourceEnum eEzsigntemplatedocumentSource) {
    this.eEzsigntemplatedocumentSource = eEzsigntemplatedocumentSource;
  }

  /**
   * Indicates the format of the template.
   **/
  @ApiModelProperty(value = "Indicates the format of the template.")
  public EEzsigntemplatedocumentFormatEnum getEEzsigntemplatedocumentFormat() {
    return eEzsigntemplatedocumentFormat;
  }
  public void setEEzsigntemplatedocumentFormat(EEzsigntemplatedocumentFormatEnum eEzsigntemplatedocumentFormat) {
    this.eEzsigntemplatedocumentFormat = eEzsigntemplatedocumentFormat;
  }

  /**
   * The Base64 encoded binary content of the document.  This field is Required when eEzsigntemplatedocumentSource = Base64.
   **/
  @ApiModelProperty(value = "The Base64 encoded binary content of the document.  This field is Required when eEzsigntemplatedocumentSource = Base64.")
  public byte[] getSEzsigntemplatedocumentBase64() {
    return sEzsigntemplatedocumentBase64;
  }
  public void setSEzsigntemplatedocumentBase64(byte[] sEzsigntemplatedocumentBase64) {
    this.sEzsigntemplatedocumentBase64 = sEzsigntemplatedocumentBase64;
  }

  /**
   * The url where the document content resides.  This field is Required when eEzsigntemplatedocumentSource = Url.
   **/
  @ApiModelProperty(value = "The url where the document content resides.  This field is Required when eEzsigntemplatedocumentSource = Url.")
  public String getSEzsigntemplatedocumentUrl() {
    return sEzsigntemplatedocumentUrl;
  }
  public void setSEzsigntemplatedocumentUrl(String sEzsigntemplatedocumentUrl) {
    this.sEzsigntemplatedocumentUrl = sEzsigntemplatedocumentUrl;
  }

  /**
   * Try to repair the document or flatten it if it cannot be used for electronic signature.
   **/
  @ApiModelProperty(value = "Try to repair the document or flatten it if it cannot be used for electronic signature.")
  public Boolean getBEzsigntemplatedocumentForcerepair() {
    return bEzsigntemplatedocumentForcerepair;
  }
  public void setBEzsigntemplatedocumentForcerepair(Boolean bEzsigntemplatedocumentForcerepair) {
    this.bEzsigntemplatedocumentForcerepair = bEzsigntemplatedocumentForcerepair;
  }

  /**
   * If the document contains an existing PDF form this property must be set.  **Keep** leaves the form as-is in the document.  **Convert** removes the form and convert all the existing fields to Ezsigntemplateformfieldgroups and assign them to the specified **fkiEzsigntemplatesignerID**
   **/
  @ApiModelProperty(value = "If the document contains an existing PDF form this property must be set.  **Keep** leaves the form as-is in the document.  **Convert** removes the form and convert all the existing fields to Ezsigntemplateformfieldgroups and assign them to the specified **fkiEzsigntemplatesignerID**")
  public EEzsigntemplatedocumentFormEnum getEEzsigntemplatedocumentForm() {
    return eEzsigntemplatedocumentForm;
  }
  public void setEEzsigntemplatedocumentForm(EEzsigntemplatedocumentFormEnum eEzsigntemplatedocumentForm) {
    this.eEzsigntemplatedocumentForm = eEzsigntemplatedocumentForm;
  }

  /**
   * If the source template is password protected, the password to open/modify it.
   **/
  @ApiModelProperty(value = "If the source template is password protected, the password to open/modify it.")
  public String getSEzsigntemplatedocumentPassword() {
    return sEzsigntemplatedocumentPassword;
  }
  public void setSEzsigntemplatedocumentPassword(String sEzsigntemplatedocumentPassword) {
    this.sEzsigntemplatedocumentPassword = sEzsigntemplatedocumentPassword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatedocumentRequest ezsigntemplatedocumentRequest = (EzsigntemplatedocumentRequest) o;
    return (this.pkiEzsigntemplatedocumentID == null ? ezsigntemplatedocumentRequest.pkiEzsigntemplatedocumentID == null : this.pkiEzsigntemplatedocumentID.equals(ezsigntemplatedocumentRequest.pkiEzsigntemplatedocumentID)) &&
        (this.fkiEzsigntemplateID == null ? ezsigntemplatedocumentRequest.fkiEzsigntemplateID == null : this.fkiEzsigntemplateID.equals(ezsigntemplatedocumentRequest.fkiEzsigntemplateID)) &&
        (this.fkiEzsigndocumentID == null ? ezsigntemplatedocumentRequest.fkiEzsigndocumentID == null : this.fkiEzsigndocumentID.equals(ezsigntemplatedocumentRequest.fkiEzsigndocumentID)) &&
        (this.fkiEzsigntemplatesignerID == null ? ezsigntemplatedocumentRequest.fkiEzsigntemplatesignerID == null : this.fkiEzsigntemplatesignerID.equals(ezsigntemplatedocumentRequest.fkiEzsigntemplatesignerID)) &&
        (this.sEzsigntemplatedocumentName == null ? ezsigntemplatedocumentRequest.sEzsigntemplatedocumentName == null : this.sEzsigntemplatedocumentName.equals(ezsigntemplatedocumentRequest.sEzsigntemplatedocumentName)) &&
        (this.eEzsigntemplatedocumentSource == null ? ezsigntemplatedocumentRequest.eEzsigntemplatedocumentSource == null : this.eEzsigntemplatedocumentSource.equals(ezsigntemplatedocumentRequest.eEzsigntemplatedocumentSource)) &&
        (this.eEzsigntemplatedocumentFormat == null ? ezsigntemplatedocumentRequest.eEzsigntemplatedocumentFormat == null : this.eEzsigntemplatedocumentFormat.equals(ezsigntemplatedocumentRequest.eEzsigntemplatedocumentFormat)) &&
        (this.sEzsigntemplatedocumentBase64 == null ? ezsigntemplatedocumentRequest.sEzsigntemplatedocumentBase64 == null : this.sEzsigntemplatedocumentBase64.equals(ezsigntemplatedocumentRequest.sEzsigntemplatedocumentBase64)) &&
        (this.sEzsigntemplatedocumentUrl == null ? ezsigntemplatedocumentRequest.sEzsigntemplatedocumentUrl == null : this.sEzsigntemplatedocumentUrl.equals(ezsigntemplatedocumentRequest.sEzsigntemplatedocumentUrl)) &&
        (this.bEzsigntemplatedocumentForcerepair == null ? ezsigntemplatedocumentRequest.bEzsigntemplatedocumentForcerepair == null : this.bEzsigntemplatedocumentForcerepair.equals(ezsigntemplatedocumentRequest.bEzsigntemplatedocumentForcerepair)) &&
        (this.eEzsigntemplatedocumentForm == null ? ezsigntemplatedocumentRequest.eEzsigntemplatedocumentForm == null : this.eEzsigntemplatedocumentForm.equals(ezsigntemplatedocumentRequest.eEzsigntemplatedocumentForm)) &&
        (this.sEzsigntemplatedocumentPassword == null ? ezsigntemplatedocumentRequest.sEzsigntemplatedocumentPassword == null : this.sEzsigntemplatedocumentPassword.equals(ezsigntemplatedocumentRequest.sEzsigntemplatedocumentPassword));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplatedocumentID == null ? 0: this.pkiEzsigntemplatedocumentID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplateID == null ? 0: this.fkiEzsigntemplateID.hashCode());
    result = 31 * result + (this.fkiEzsigndocumentID == null ? 0: this.fkiEzsigndocumentID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplatesignerID == null ? 0: this.fkiEzsigntemplatesignerID.hashCode());
    result = 31 * result + (this.sEzsigntemplatedocumentName == null ? 0: this.sEzsigntemplatedocumentName.hashCode());
    result = 31 * result + (this.eEzsigntemplatedocumentSource == null ? 0: this.eEzsigntemplatedocumentSource.hashCode());
    result = 31 * result + (this.eEzsigntemplatedocumentFormat == null ? 0: this.eEzsigntemplatedocumentFormat.hashCode());
    result = 31 * result + (this.sEzsigntemplatedocumentBase64 == null ? 0: this.sEzsigntemplatedocumentBase64.hashCode());
    result = 31 * result + (this.sEzsigntemplatedocumentUrl == null ? 0: this.sEzsigntemplatedocumentUrl.hashCode());
    result = 31 * result + (this.bEzsigntemplatedocumentForcerepair == null ? 0: this.bEzsigntemplatedocumentForcerepair.hashCode());
    result = 31 * result + (this.eEzsigntemplatedocumentForm == null ? 0: this.eEzsigntemplatedocumentForm.hashCode());
    result = 31 * result + (this.sEzsigntemplatedocumentPassword == null ? 0: this.sEzsigntemplatedocumentPassword.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatedocumentRequest {\n");
    
    sb.append("  pkiEzsigntemplatedocumentID: ").append(pkiEzsigntemplatedocumentID).append("\n");
    sb.append("  fkiEzsigntemplateID: ").append(fkiEzsigntemplateID).append("\n");
    sb.append("  fkiEzsigndocumentID: ").append(fkiEzsigndocumentID).append("\n");
    sb.append("  fkiEzsigntemplatesignerID: ").append(fkiEzsigntemplatesignerID).append("\n");
    sb.append("  sEzsigntemplatedocumentName: ").append(sEzsigntemplatedocumentName).append("\n");
    sb.append("  eEzsigntemplatedocumentSource: ").append(eEzsigntemplatedocumentSource).append("\n");
    sb.append("  eEzsigntemplatedocumentFormat: ").append(eEzsigntemplatedocumentFormat).append("\n");
    sb.append("  sEzsigntemplatedocumentBase64: ").append(sEzsigntemplatedocumentBase64).append("\n");
    sb.append("  sEzsigntemplatedocumentUrl: ").append(sEzsigntemplatedocumentUrl).append("\n");
    sb.append("  bEzsigntemplatedocumentForcerepair: ").append(bEzsigntemplatedocumentForcerepair).append("\n");
    sb.append("  eEzsigntemplatedocumentForm: ").append(eEzsigntemplatedocumentForm).append("\n");
    sb.append("  sEzsigntemplatedocumentPassword: ").append(sEzsigntemplatedocumentPassword).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
