/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.38
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsigndocumentRequest;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsigndocument Object and children to create a complete structure
 **/
@ApiModel(description = "An Ezsigndocument Object and children to create a complete structure")
public class EzsigndocumentRequestCompound {
  
  public enum EEzsigndocumentSourceEnum {
     Base64, 
  };
  @SerializedName("eEzsigndocumentSource")
  private EEzsigndocumentSourceEnum eEzsigndocumentSource = null;
  public enum EEzsigndocumentFormatEnum {
     Pdf, 
  };
  @SerializedName("eEzsigndocumentFormat")
  private EEzsigndocumentFormatEnum eEzsigndocumentFormat = null;
  @SerializedName("sEzsigndocumentBase64")
  private byte[] sEzsigndocumentBase64 = null;
  @SerializedName("fkiEzsignfolderID")
  private Integer fkiEzsignfolderID = null;
  @SerializedName("dtEzsigndocumentDuedate")
  private String dtEzsigndocumentDuedate = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("sEzsigndocumentName")
  private String sEzsigndocumentName = null;

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
  @ApiModelProperty(required = true, value = "Indicates the format of the document.")
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
   * A reference to a valid Ezsignfolder.  That value is returned after a successful Ezsignfolder Creation.
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "A reference to a valid Ezsignfolder.  That value is returned after a successful Ezsignfolder Creation.")
  public Integer getFkiEzsignfolderID() {
    return fkiEzsignfolderID;
  }
  public void setFkiEzsignfolderID(Integer fkiEzsignfolderID) {
    this.fkiEzsignfolderID = fkiEzsignfolderID;
  }

  /**
   * Represent a Date Time. The timezone is the one configured in the User's profile.
   **/
  @ApiModelProperty(required = true, value = "Represent a Date Time. The timezone is the one configured in the User's profile.")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentRequestCompound ezsigndocumentRequestCompound = (EzsigndocumentRequestCompound) o;
    return (this.eEzsigndocumentSource == null ? ezsigndocumentRequestCompound.eEzsigndocumentSource == null : this.eEzsigndocumentSource.equals(ezsigndocumentRequestCompound.eEzsigndocumentSource)) &&
        (this.eEzsigndocumentFormat == null ? ezsigndocumentRequestCompound.eEzsigndocumentFormat == null : this.eEzsigndocumentFormat.equals(ezsigndocumentRequestCompound.eEzsigndocumentFormat)) &&
        (this.sEzsigndocumentBase64 == null ? ezsigndocumentRequestCompound.sEzsigndocumentBase64 == null : this.sEzsigndocumentBase64.equals(ezsigndocumentRequestCompound.sEzsigndocumentBase64)) &&
        (this.fkiEzsignfolderID == null ? ezsigndocumentRequestCompound.fkiEzsignfolderID == null : this.fkiEzsignfolderID.equals(ezsigndocumentRequestCompound.fkiEzsignfolderID)) &&
        (this.dtEzsigndocumentDuedate == null ? ezsigndocumentRequestCompound.dtEzsigndocumentDuedate == null : this.dtEzsigndocumentDuedate.equals(ezsigndocumentRequestCompound.dtEzsigndocumentDuedate)) &&
        (this.fkiLanguageID == null ? ezsigndocumentRequestCompound.fkiLanguageID == null : this.fkiLanguageID.equals(ezsigndocumentRequestCompound.fkiLanguageID)) &&
        (this.sEzsigndocumentName == null ? ezsigndocumentRequestCompound.sEzsigndocumentName == null : this.sEzsigndocumentName.equals(ezsigndocumentRequestCompound.sEzsigndocumentName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.eEzsigndocumentSource == null ? 0: this.eEzsigndocumentSource.hashCode());
    result = 31 * result + (this.eEzsigndocumentFormat == null ? 0: this.eEzsigndocumentFormat.hashCode());
    result = 31 * result + (this.sEzsigndocumentBase64 == null ? 0: this.sEzsigndocumentBase64.hashCode());
    result = 31 * result + (this.fkiEzsignfolderID == null ? 0: this.fkiEzsignfolderID.hashCode());
    result = 31 * result + (this.dtEzsigndocumentDuedate == null ? 0: this.dtEzsigndocumentDuedate.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.sEzsigndocumentName == null ? 0: this.sEzsigndocumentName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentRequestCompound {\n");
    
    sb.append("  eEzsigndocumentSource: ").append(eEzsigndocumentSource).append("\n");
    sb.append("  eEzsigndocumentFormat: ").append(eEzsigndocumentFormat).append("\n");
    sb.append("  sEzsigndocumentBase64: ").append(sEzsigndocumentBase64).append("\n");
    sb.append("  fkiEzsignfolderID: ").append(fkiEzsignfolderID).append("\n");
    sb.append("  dtEzsigndocumentDuedate: ").append(dtEzsigndocumentDuedate).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  sEzsigndocumentName: ").append(sEzsigndocumentName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
