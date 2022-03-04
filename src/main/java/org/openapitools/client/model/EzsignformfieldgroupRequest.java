/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.5
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.FieldEEzsignformfieldgroupSignerrequirement;
import org.openapitools.client.model.FieldEEzsignformfieldgroupTooltipposition;
import org.openapitools.client.model.FieldEEzsignformfieldgroupType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignformfieldgroup Object
 **/
@ApiModel(description = "An Ezsignformfieldgroup Object")
public class EzsignformfieldgroupRequest {
  
  @SerializedName("pkiEzsignformfieldgroupID")
  private Integer pkiEzsignformfieldgroupID = null;
  @SerializedName("fkiEzsigndocumentID")
  private Integer fkiEzsigndocumentID = null;
  @SerializedName("eEzsignformfieldgroupType")
  private FieldEEzsignformfieldgroupType eEzsignformfieldgroupType = null;
  @SerializedName("eEzsignformfieldgroupSignerrequirement")
  private FieldEEzsignformfieldgroupSignerrequirement eEzsignformfieldgroupSignerrequirement = null;
  @SerializedName("sEzsignformfieldgroupLabel")
  private String sEzsignformfieldgroupLabel = null;
  @SerializedName("iEzsignformfieldgroupStep")
  private Integer iEzsignformfieldgroupStep = null;
  @SerializedName("sEzsignformfieldgroupDefaultvalue")
  private String sEzsignformfieldgroupDefaultvalue = null;
  @SerializedName("iEzsignformfieldgroupFilledmin")
  private Integer iEzsignformfieldgroupFilledmin = null;
  @SerializedName("iEzsignformfieldgroupFilledmax")
  private Integer iEzsignformfieldgroupFilledmax = null;
  @SerializedName("bEzsignformfieldgroupReadonly")
  private Boolean bEzsignformfieldgroupReadonly = null;
  @SerializedName("iEzsignformfieldgroupMaxlength")
  private Integer iEzsignformfieldgroupMaxlength = null;
  @SerializedName("bEzsignformfieldgroupEncrypted")
  private Boolean bEzsignformfieldgroupEncrypted = null;
  @SerializedName("sEzsignformfieldgroupRegexp")
  private String sEzsignformfieldgroupRegexp = null;
  @SerializedName("tEzsignformfieldgroupTooltip")
  private String tEzsignformfieldgroupTooltip = null;
  @SerializedName("eEzsignformfieldgroupTooltipposition")
  private FieldEEzsignformfieldgroupTooltipposition eEzsignformfieldgroupTooltipposition = null;

  /**
   * The unique ID of the Ezsignformfieldgroup
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignformfieldgroup")
  public Integer getPkiEzsignformfieldgroupID() {
    return pkiEzsignformfieldgroupID;
  }
  public void setPkiEzsignformfieldgroupID(Integer pkiEzsignformfieldgroupID) {
    this.pkiEzsignformfieldgroupID = pkiEzsignformfieldgroupID;
  }

  /**
   * The unique ID of the Ezsigndocument
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigndocument")
  public Integer getFkiEzsigndocumentID() {
    return fkiEzsigndocumentID;
  }
  public void setFkiEzsigndocumentID(Integer fkiEzsigndocumentID) {
    this.fkiEzsigndocumentID = fkiEzsigndocumentID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsignformfieldgroupType getEEzsignformfieldgroupType() {
    return eEzsignformfieldgroupType;
  }
  public void setEEzsignformfieldgroupType(FieldEEzsignformfieldgroupType eEzsignformfieldgroupType) {
    this.eEzsignformfieldgroupType = eEzsignformfieldgroupType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsignformfieldgroupSignerrequirement getEEzsignformfieldgroupSignerrequirement() {
    return eEzsignformfieldgroupSignerrequirement;
  }
  public void setEEzsignformfieldgroupSignerrequirement(FieldEEzsignformfieldgroupSignerrequirement eEzsignformfieldgroupSignerrequirement) {
    this.eEzsignformfieldgroupSignerrequirement = eEzsignformfieldgroupSignerrequirement;
  }

  /**
   * The Label for the Ezsignformfieldgroup
   **/
  @ApiModelProperty(required = true, value = "The Label for the Ezsignformfieldgroup")
  public String getSEzsignformfieldgroupLabel() {
    return sEzsignformfieldgroupLabel;
  }
  public void setSEzsignformfieldgroupLabel(String sEzsignformfieldgroupLabel) {
    this.sEzsignformfieldgroupLabel = sEzsignformfieldgroupLabel;
  }

  /**
   * The step when the Ezsignsigner will be invited to fill the form fields
   **/
  @ApiModelProperty(required = true, value = "The step when the Ezsignsigner will be invited to fill the form fields")
  public Integer getIEzsignformfieldgroupStep() {
    return iEzsignformfieldgroupStep;
  }
  public void setIEzsignformfieldgroupStep(Integer iEzsignformfieldgroupStep) {
    this.iEzsignformfieldgroupStep = iEzsignformfieldgroupStep;
  }

  /**
   * The default value for the Ezsignformfieldgroup
   **/
  @ApiModelProperty(required = true, value = "The default value for the Ezsignformfieldgroup")
  public String getSEzsignformfieldgroupDefaultvalue() {
    return sEzsignformfieldgroupDefaultvalue;
  }
  public void setSEzsignformfieldgroupDefaultvalue(String sEzsignformfieldgroupDefaultvalue) {
    this.sEzsignformfieldgroupDefaultvalue = sEzsignformfieldgroupDefaultvalue;
  }

  /**
   * The minimum number of Ezsignformfield that must be filled in the Ezsignformfieldgroup
   **/
  @ApiModelProperty(required = true, value = "The minimum number of Ezsignformfield that must be filled in the Ezsignformfieldgroup")
  public Integer getIEzsignformfieldgroupFilledmin() {
    return iEzsignformfieldgroupFilledmin;
  }
  public void setIEzsignformfieldgroupFilledmin(Integer iEzsignformfieldgroupFilledmin) {
    this.iEzsignformfieldgroupFilledmin = iEzsignformfieldgroupFilledmin;
  }

  /**
   * The maximum number of Ezsignformfield that must be filled in the Ezsignformfieldgroup
   **/
  @ApiModelProperty(required = true, value = "The maximum number of Ezsignformfield that must be filled in the Ezsignformfieldgroup")
  public Integer getIEzsignformfieldgroupFilledmax() {
    return iEzsignformfieldgroupFilledmax;
  }
  public void setIEzsignformfieldgroupFilledmax(Integer iEzsignformfieldgroupFilledmax) {
    this.iEzsignformfieldgroupFilledmax = iEzsignformfieldgroupFilledmax;
  }

  /**
   * Whether the Ezsignformfieldgroup is read only or not.
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezsignformfieldgroup is read only or not.")
  public Boolean getBEzsignformfieldgroupReadonly() {
    return bEzsignformfieldgroupReadonly;
  }
  public void setBEzsignformfieldgroupReadonly(Boolean bEzsignformfieldgroupReadonly) {
    this.bEzsignformfieldgroupReadonly = bEzsignformfieldgroupReadonly;
  }

  /**
   * The maximum length for the value in the Ezsignformfieldgroup  This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea**
   **/
  @ApiModelProperty(value = "The maximum length for the value in the Ezsignformfieldgroup  This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea**")
  public Integer getIEzsignformfieldgroupMaxlength() {
    return iEzsignformfieldgroupMaxlength;
  }
  public void setIEzsignformfieldgroupMaxlength(Integer iEzsignformfieldgroupMaxlength) {
    this.iEzsignformfieldgroupMaxlength = iEzsignformfieldgroupMaxlength;
  }

  /**
   * Whether the Ezsignformfieldgroup is encrypted in the database or not. Encrypted values are not displayed on the Ezsigndocument. This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea**
   **/
  @ApiModelProperty(value = "Whether the Ezsignformfieldgroup is encrypted in the database or not. Encrypted values are not displayed on the Ezsigndocument. This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea**")
  public Boolean getBEzsignformfieldgroupEncrypted() {
    return bEzsignformfieldgroupEncrypted;
  }
  public void setBEzsignformfieldgroupEncrypted(Boolean bEzsignformfieldgroupEncrypted) {
    this.bEzsignformfieldgroupEncrypted = bEzsignformfieldgroupEncrypted;
  }

  /**
   * A regular expression to indicate what values are acceptable for the Ezsignformfieldgroup.  This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea**
   **/
  @ApiModelProperty(value = "A regular expression to indicate what values are acceptable for the Ezsignformfieldgroup.  This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea**")
  public String getSEzsignformfieldgroupRegexp() {
    return sEzsignformfieldgroupRegexp;
  }
  public void setSEzsignformfieldgroupRegexp(String sEzsignformfieldgroupRegexp) {
    this.sEzsignformfieldgroupRegexp = sEzsignformfieldgroupRegexp;
  }

  /**
   * A tooltip that will be presented to Ezsignsigner about the Ezsignformfieldgroup
   **/
  @ApiModelProperty(value = "A tooltip that will be presented to Ezsignsigner about the Ezsignformfieldgroup")
  public String getTEzsignformfieldgroupTooltip() {
    return tEzsignformfieldgroupTooltip;
  }
  public void setTEzsignformfieldgroupTooltip(String tEzsignformfieldgroupTooltip) {
    this.tEzsignformfieldgroupTooltip = tEzsignformfieldgroupTooltip;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsignformfieldgroupTooltipposition getEEzsignformfieldgroupTooltipposition() {
    return eEzsignformfieldgroupTooltipposition;
  }
  public void setEEzsignformfieldgroupTooltipposition(FieldEEzsignformfieldgroupTooltipposition eEzsignformfieldgroupTooltipposition) {
    this.eEzsignformfieldgroupTooltipposition = eEzsignformfieldgroupTooltipposition;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignformfieldgroupRequest ezsignformfieldgroupRequest = (EzsignformfieldgroupRequest) o;
    return (this.pkiEzsignformfieldgroupID == null ? ezsignformfieldgroupRequest.pkiEzsignformfieldgroupID == null : this.pkiEzsignformfieldgroupID.equals(ezsignformfieldgroupRequest.pkiEzsignformfieldgroupID)) &&
        (this.fkiEzsigndocumentID == null ? ezsignformfieldgroupRequest.fkiEzsigndocumentID == null : this.fkiEzsigndocumentID.equals(ezsignformfieldgroupRequest.fkiEzsigndocumentID)) &&
        (this.eEzsignformfieldgroupType == null ? ezsignformfieldgroupRequest.eEzsignformfieldgroupType == null : this.eEzsignformfieldgroupType.equals(ezsignformfieldgroupRequest.eEzsignformfieldgroupType)) &&
        (this.eEzsignformfieldgroupSignerrequirement == null ? ezsignformfieldgroupRequest.eEzsignformfieldgroupSignerrequirement == null : this.eEzsignformfieldgroupSignerrequirement.equals(ezsignformfieldgroupRequest.eEzsignformfieldgroupSignerrequirement)) &&
        (this.sEzsignformfieldgroupLabel == null ? ezsignformfieldgroupRequest.sEzsignformfieldgroupLabel == null : this.sEzsignformfieldgroupLabel.equals(ezsignformfieldgroupRequest.sEzsignformfieldgroupLabel)) &&
        (this.iEzsignformfieldgroupStep == null ? ezsignformfieldgroupRequest.iEzsignformfieldgroupStep == null : this.iEzsignformfieldgroupStep.equals(ezsignformfieldgroupRequest.iEzsignformfieldgroupStep)) &&
        (this.sEzsignformfieldgroupDefaultvalue == null ? ezsignformfieldgroupRequest.sEzsignformfieldgroupDefaultvalue == null : this.sEzsignformfieldgroupDefaultvalue.equals(ezsignformfieldgroupRequest.sEzsignformfieldgroupDefaultvalue)) &&
        (this.iEzsignformfieldgroupFilledmin == null ? ezsignformfieldgroupRequest.iEzsignformfieldgroupFilledmin == null : this.iEzsignformfieldgroupFilledmin.equals(ezsignformfieldgroupRequest.iEzsignformfieldgroupFilledmin)) &&
        (this.iEzsignformfieldgroupFilledmax == null ? ezsignformfieldgroupRequest.iEzsignformfieldgroupFilledmax == null : this.iEzsignformfieldgroupFilledmax.equals(ezsignformfieldgroupRequest.iEzsignformfieldgroupFilledmax)) &&
        (this.bEzsignformfieldgroupReadonly == null ? ezsignformfieldgroupRequest.bEzsignformfieldgroupReadonly == null : this.bEzsignformfieldgroupReadonly.equals(ezsignformfieldgroupRequest.bEzsignformfieldgroupReadonly)) &&
        (this.iEzsignformfieldgroupMaxlength == null ? ezsignformfieldgroupRequest.iEzsignformfieldgroupMaxlength == null : this.iEzsignformfieldgroupMaxlength.equals(ezsignformfieldgroupRequest.iEzsignformfieldgroupMaxlength)) &&
        (this.bEzsignformfieldgroupEncrypted == null ? ezsignformfieldgroupRequest.bEzsignformfieldgroupEncrypted == null : this.bEzsignformfieldgroupEncrypted.equals(ezsignformfieldgroupRequest.bEzsignformfieldgroupEncrypted)) &&
        (this.sEzsignformfieldgroupRegexp == null ? ezsignformfieldgroupRequest.sEzsignformfieldgroupRegexp == null : this.sEzsignformfieldgroupRegexp.equals(ezsignformfieldgroupRequest.sEzsignformfieldgroupRegexp)) &&
        (this.tEzsignformfieldgroupTooltip == null ? ezsignformfieldgroupRequest.tEzsignformfieldgroupTooltip == null : this.tEzsignformfieldgroupTooltip.equals(ezsignformfieldgroupRequest.tEzsignformfieldgroupTooltip)) &&
        (this.eEzsignformfieldgroupTooltipposition == null ? ezsignformfieldgroupRequest.eEzsignformfieldgroupTooltipposition == null : this.eEzsignformfieldgroupTooltipposition.equals(ezsignformfieldgroupRequest.eEzsignformfieldgroupTooltipposition));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignformfieldgroupID == null ? 0: this.pkiEzsignformfieldgroupID.hashCode());
    result = 31 * result + (this.fkiEzsigndocumentID == null ? 0: this.fkiEzsigndocumentID.hashCode());
    result = 31 * result + (this.eEzsignformfieldgroupType == null ? 0: this.eEzsignformfieldgroupType.hashCode());
    result = 31 * result + (this.eEzsignformfieldgroupSignerrequirement == null ? 0: this.eEzsignformfieldgroupSignerrequirement.hashCode());
    result = 31 * result + (this.sEzsignformfieldgroupLabel == null ? 0: this.sEzsignformfieldgroupLabel.hashCode());
    result = 31 * result + (this.iEzsignformfieldgroupStep == null ? 0: this.iEzsignformfieldgroupStep.hashCode());
    result = 31 * result + (this.sEzsignformfieldgroupDefaultvalue == null ? 0: this.sEzsignformfieldgroupDefaultvalue.hashCode());
    result = 31 * result + (this.iEzsignformfieldgroupFilledmin == null ? 0: this.iEzsignformfieldgroupFilledmin.hashCode());
    result = 31 * result + (this.iEzsignformfieldgroupFilledmax == null ? 0: this.iEzsignformfieldgroupFilledmax.hashCode());
    result = 31 * result + (this.bEzsignformfieldgroupReadonly == null ? 0: this.bEzsignformfieldgroupReadonly.hashCode());
    result = 31 * result + (this.iEzsignformfieldgroupMaxlength == null ? 0: this.iEzsignformfieldgroupMaxlength.hashCode());
    result = 31 * result + (this.bEzsignformfieldgroupEncrypted == null ? 0: this.bEzsignformfieldgroupEncrypted.hashCode());
    result = 31 * result + (this.sEzsignformfieldgroupRegexp == null ? 0: this.sEzsignformfieldgroupRegexp.hashCode());
    result = 31 * result + (this.tEzsignformfieldgroupTooltip == null ? 0: this.tEzsignformfieldgroupTooltip.hashCode());
    result = 31 * result + (this.eEzsignformfieldgroupTooltipposition == null ? 0: this.eEzsignformfieldgroupTooltipposition.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignformfieldgroupRequest {\n");
    
    sb.append("  pkiEzsignformfieldgroupID: ").append(pkiEzsignformfieldgroupID).append("\n");
    sb.append("  fkiEzsigndocumentID: ").append(fkiEzsigndocumentID).append("\n");
    sb.append("  eEzsignformfieldgroupType: ").append(eEzsignformfieldgroupType).append("\n");
    sb.append("  eEzsignformfieldgroupSignerrequirement: ").append(eEzsignformfieldgroupSignerrequirement).append("\n");
    sb.append("  sEzsignformfieldgroupLabel: ").append(sEzsignformfieldgroupLabel).append("\n");
    sb.append("  iEzsignformfieldgroupStep: ").append(iEzsignformfieldgroupStep).append("\n");
    sb.append("  sEzsignformfieldgroupDefaultvalue: ").append(sEzsignformfieldgroupDefaultvalue).append("\n");
    sb.append("  iEzsignformfieldgroupFilledmin: ").append(iEzsignformfieldgroupFilledmin).append("\n");
    sb.append("  iEzsignformfieldgroupFilledmax: ").append(iEzsignformfieldgroupFilledmax).append("\n");
    sb.append("  bEzsignformfieldgroupReadonly: ").append(bEzsignformfieldgroupReadonly).append("\n");
    sb.append("  iEzsignformfieldgroupMaxlength: ").append(iEzsignformfieldgroupMaxlength).append("\n");
    sb.append("  bEzsignformfieldgroupEncrypted: ").append(bEzsignformfieldgroupEncrypted).append("\n");
    sb.append("  sEzsignformfieldgroupRegexp: ").append(sEzsignformfieldgroupRegexp).append("\n");
    sb.append("  tEzsignformfieldgroupTooltip: ").append(tEzsignformfieldgroupTooltip).append("\n");
    sb.append("  eEzsignformfieldgroupTooltipposition: ").append(eEzsignformfieldgroupTooltipposition).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
