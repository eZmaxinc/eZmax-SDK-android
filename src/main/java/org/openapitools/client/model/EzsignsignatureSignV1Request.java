/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CommonFile;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/ezsignsignature/{pkiEzsignsignatureID}/sign
 **/
@ApiModel(description = "Request for POST /1/object/ezsignsignature/{pkiEzsignsignatureID}/sign")
public class EzsignsignatureSignV1Request {
  
  @SerializedName("sValue")
  private String sValue = null;
  public enum EAttachmentsConfirmationDecisionEnum {
     Accepted,  Refused, 
  };
  @SerializedName("eAttachmentsConfirmationDecision")
  private EAttachmentsConfirmationDecisionEnum eAttachmentsConfirmationDecision = null;
  @SerializedName("sAttachmentsRefusalReason")
  private String sAttachmentsRefusalReason = null;
  @SerializedName("sSvg")
  private String sSvg = null;
  @SerializedName("a_objFile")
  private List<CommonFile> aObjFile = null;
  @SerializedName("bIsAutomatic")
  private Boolean bIsAutomatic = null;

  /**
   * The value required for the Ezsignsignature.  This can only be set if eEzsignsignatureType is **City**, **FieldText** or **FieldTextarea**
   **/
  @ApiModelProperty(value = "The value required for the Ezsignsignature.  This can only be set if eEzsignsignatureType is **City**, **FieldText** or **FieldTextarea**")
  public String getSValue() {
    return sValue;
  }
  public void setSValue(String sValue) {
    this.sValue = sValue;
  }

  /**
   * Whether the attachment are accepted or refused.  This can only be set if eEzsignsignatureType is **AttachmentsConfirmation**
   **/
  @ApiModelProperty(value = "Whether the attachment are accepted or refused.  This can only be set if eEzsignsignatureType is **AttachmentsConfirmation**")
  public EAttachmentsConfirmationDecisionEnum getEAttachmentsConfirmationDecision() {
    return eAttachmentsConfirmationDecision;
  }
  public void setEAttachmentsConfirmationDecision(EAttachmentsConfirmationDecisionEnum eAttachmentsConfirmationDecision) {
    this.eAttachmentsConfirmationDecision = eAttachmentsConfirmationDecision;
  }

  /**
   * The reason of refused.  This can only be set if eEzsignsignatureType is **AttachmentsConfirmation**
   **/
  @ApiModelProperty(value = "The reason of refused.  This can only be set if eEzsignsignatureType is **AttachmentsConfirmation**")
  public String getSAttachmentsRefusalReason() {
    return sAttachmentsRefusalReason;
  }
  public void setSAttachmentsRefusalReason(String sAttachmentsRefusalReason) {
    this.sAttachmentsRefusalReason = sAttachmentsRefusalReason;
  }

  /**
   * The SVG of the handwritten signature.  This can only be set if eEzsignsignatureType is **Handwritten** and **bIsAutomatic** is false
   **/
  @ApiModelProperty(value = "The SVG of the handwritten signature.  This can only be set if eEzsignsignatureType is **Handwritten** and **bIsAutomatic** is false")
  public String getSSvg() {
    return sSvg;
  }
  public void setSSvg(String sSvg) {
    this.sSvg = sSvg;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CommonFile> getAObjFile() {
    return aObjFile;
  }
  public void setAObjFile(List<CommonFile> aObjFile) {
    this.aObjFile = aObjFile;
  }

  /**
   * Indicates if the Ezsignsignature was part of an automatic process or not.  This can only be true if eEzsignsignatureType is **Acknowledgement**, **City**, **Handwritten**, **Initials**, **Name** or **Stamp**. 
   **/
  @ApiModelProperty(required = true, value = "Indicates if the Ezsignsignature was part of an automatic process or not.  This can only be true if eEzsignsignatureType is **Acknowledgement**, **City**, **Handwritten**, **Initials**, **Name** or **Stamp**. ")
  public Boolean getBIsAutomatic() {
    return bIsAutomatic;
  }
  public void setBIsAutomatic(Boolean bIsAutomatic) {
    this.bIsAutomatic = bIsAutomatic;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignatureSignV1Request ezsignsignatureSignV1Request = (EzsignsignatureSignV1Request) o;
    return (this.sValue == null ? ezsignsignatureSignV1Request.sValue == null : this.sValue.equals(ezsignsignatureSignV1Request.sValue)) &&
        (this.eAttachmentsConfirmationDecision == null ? ezsignsignatureSignV1Request.eAttachmentsConfirmationDecision == null : this.eAttachmentsConfirmationDecision.equals(ezsignsignatureSignV1Request.eAttachmentsConfirmationDecision)) &&
        (this.sAttachmentsRefusalReason == null ? ezsignsignatureSignV1Request.sAttachmentsRefusalReason == null : this.sAttachmentsRefusalReason.equals(ezsignsignatureSignV1Request.sAttachmentsRefusalReason)) &&
        (this.sSvg == null ? ezsignsignatureSignV1Request.sSvg == null : this.sSvg.equals(ezsignsignatureSignV1Request.sSvg)) &&
        (this.aObjFile == null ? ezsignsignatureSignV1Request.aObjFile == null : this.aObjFile.equals(ezsignsignatureSignV1Request.aObjFile)) &&
        (this.bIsAutomatic == null ? ezsignsignatureSignV1Request.bIsAutomatic == null : this.bIsAutomatic.equals(ezsignsignatureSignV1Request.bIsAutomatic));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sValue == null ? 0: this.sValue.hashCode());
    result = 31 * result + (this.eAttachmentsConfirmationDecision == null ? 0: this.eAttachmentsConfirmationDecision.hashCode());
    result = 31 * result + (this.sAttachmentsRefusalReason == null ? 0: this.sAttachmentsRefusalReason.hashCode());
    result = 31 * result + (this.sSvg == null ? 0: this.sSvg.hashCode());
    result = 31 * result + (this.aObjFile == null ? 0: this.aObjFile.hashCode());
    result = 31 * result + (this.bIsAutomatic == null ? 0: this.bIsAutomatic.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignatureSignV1Request {\n");
    
    sb.append("  sValue: ").append(sValue).append("\n");
    sb.append("  eAttachmentsConfirmationDecision: ").append(eAttachmentsConfirmationDecision).append("\n");
    sb.append("  sAttachmentsRefusalReason: ").append(sAttachmentsRefusalReason).append("\n");
    sb.append("  sSvg: ").append(sSvg).append("\n");
    sb.append("  aObjFile: ").append(aObjFile).append("\n");
    sb.append("  bIsAutomatic: ").append(bIsAutomatic).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
