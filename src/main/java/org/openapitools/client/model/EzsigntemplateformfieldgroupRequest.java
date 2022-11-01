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

import org.openapitools.client.model.FieldEEzsigntemplateformfieldgroupSignerrequirement;
import org.openapitools.client.model.FieldEEzsigntemplateformfieldgroupTooltipposition;
import org.openapitools.client.model.FieldEEzsigntemplateformfieldgroupType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsigntemplateformfieldgroup Object
 **/
@ApiModel(description = "A Ezsigntemplateformfieldgroup Object")
public class EzsigntemplateformfieldgroupRequest {
  
  @SerializedName("pkiEzsigntemplateformfieldgroupID")
  private Integer pkiEzsigntemplateformfieldgroupID = null;
  @SerializedName("fkiEzsigntemplatedocumentID")
  private Integer fkiEzsigntemplatedocumentID = null;
  @SerializedName("eEzsigntemplateformfieldgroupType")
  private FieldEEzsigntemplateformfieldgroupType eEzsigntemplateformfieldgroupType = null;
  @SerializedName("eEzsigntemplateformfieldgroupSignerrequirement")
  private FieldEEzsigntemplateformfieldgroupSignerrequirement eEzsigntemplateformfieldgroupSignerrequirement = null;
  @SerializedName("sEzsigntemplateformfieldgroupLabel")
  private String sEzsigntemplateformfieldgroupLabel = null;
  @SerializedName("iEzsigntemplateformfieldgroupStep")
  private Integer iEzsigntemplateformfieldgroupStep = null;
  @SerializedName("sEzsigntemplateformfieldgroupDefaultvalue")
  private String sEzsigntemplateformfieldgroupDefaultvalue = null;
  @SerializedName("iEzsigntemplateformfieldgroupFilledmin")
  private Integer iEzsigntemplateformfieldgroupFilledmin = null;
  @SerializedName("iEzsigntemplateformfieldgroupFilledmax")
  private Integer iEzsigntemplateformfieldgroupFilledmax = null;
  @SerializedName("bEzsigntemplateformfieldgroupReadonly")
  private Boolean bEzsigntemplateformfieldgroupReadonly = null;
  @SerializedName("iEzsigntemplateformfieldgroupMaxlength")
  private Integer iEzsigntemplateformfieldgroupMaxlength = null;
  @SerializedName("bEzsigntemplateformfieldgroupEncrypted")
  private Boolean bEzsigntemplateformfieldgroupEncrypted = null;
  @SerializedName("sEzsigntemplateformfieldgroupRegexp")
  private String sEzsigntemplateformfieldgroupRegexp = null;
  @SerializedName("tEzsigntemplateformfieldgroupTooltip")
  private String tEzsigntemplateformfieldgroupTooltip = null;
  @SerializedName("eEzsigntemplateformfieldgroupTooltipposition")
  private FieldEEzsigntemplateformfieldgroupTooltipposition eEzsigntemplateformfieldgroupTooltipposition = null;

  /**
   * The unique ID of the Ezsigntemplateformfieldgroup
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsigntemplateformfieldgroup")
  public Integer getPkiEzsigntemplateformfieldgroupID() {
    return pkiEzsigntemplateformfieldgroupID;
  }
  public void setPkiEzsigntemplateformfieldgroupID(Integer pkiEzsigntemplateformfieldgroupID) {
    this.pkiEzsigntemplateformfieldgroupID = pkiEzsigntemplateformfieldgroupID;
  }

  /**
   * The unique ID of the Ezsigntemplatedocument
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplatedocument")
  public Integer getFkiEzsigntemplatedocumentID() {
    return fkiEzsigntemplatedocumentID;
  }
  public void setFkiEzsigntemplatedocumentID(Integer fkiEzsigntemplatedocumentID) {
    this.fkiEzsigntemplatedocumentID = fkiEzsigntemplatedocumentID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsigntemplateformfieldgroupType getEEzsigntemplateformfieldgroupType() {
    return eEzsigntemplateformfieldgroupType;
  }
  public void setEEzsigntemplateformfieldgroupType(FieldEEzsigntemplateformfieldgroupType eEzsigntemplateformfieldgroupType) {
    this.eEzsigntemplateformfieldgroupType = eEzsigntemplateformfieldgroupType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsigntemplateformfieldgroupSignerrequirement getEEzsigntemplateformfieldgroupSignerrequirement() {
    return eEzsigntemplateformfieldgroupSignerrequirement;
  }
  public void setEEzsigntemplateformfieldgroupSignerrequirement(FieldEEzsigntemplateformfieldgroupSignerrequirement eEzsigntemplateformfieldgroupSignerrequirement) {
    this.eEzsigntemplateformfieldgroupSignerrequirement = eEzsigntemplateformfieldgroupSignerrequirement;
  }

  /**
   * The Label for the Ezsigntemplateformfieldgroup
   **/
  @ApiModelProperty(required = true, value = "The Label for the Ezsigntemplateformfieldgroup")
  public String getSEzsigntemplateformfieldgroupLabel() {
    return sEzsigntemplateformfieldgroupLabel;
  }
  public void setSEzsigntemplateformfieldgroupLabel(String sEzsigntemplateformfieldgroupLabel) {
    this.sEzsigntemplateformfieldgroupLabel = sEzsigntemplateformfieldgroupLabel;
  }

  /**
   * The step when the Ezsigntemplatesigner will be invited to fill the form fields
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The step when the Ezsigntemplatesigner will be invited to fill the form fields")
  public Integer getIEzsigntemplateformfieldgroupStep() {
    return iEzsigntemplateformfieldgroupStep;
  }
  public void setIEzsigntemplateformfieldgroupStep(Integer iEzsigntemplateformfieldgroupStep) {
    this.iEzsigntemplateformfieldgroupStep = iEzsigntemplateformfieldgroupStep;
  }

  /**
   * The default value for the Ezsigntemplateformfieldgroup
   **/
  @ApiModelProperty(required = true, value = "The default value for the Ezsigntemplateformfieldgroup")
  public String getSEzsigntemplateformfieldgroupDefaultvalue() {
    return sEzsigntemplateformfieldgroupDefaultvalue;
  }
  public void setSEzsigntemplateformfieldgroupDefaultvalue(String sEzsigntemplateformfieldgroupDefaultvalue) {
    this.sEzsigntemplateformfieldgroupDefaultvalue = sEzsigntemplateformfieldgroupDefaultvalue;
  }

  /**
   * The minimum number of Ezsigntemplateformfield that must be filled in the Ezsigntemplateformfieldgroup
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The minimum number of Ezsigntemplateformfield that must be filled in the Ezsigntemplateformfieldgroup")
  public Integer getIEzsigntemplateformfieldgroupFilledmin() {
    return iEzsigntemplateformfieldgroupFilledmin;
  }
  public void setIEzsigntemplateformfieldgroupFilledmin(Integer iEzsigntemplateformfieldgroupFilledmin) {
    this.iEzsigntemplateformfieldgroupFilledmin = iEzsigntemplateformfieldgroupFilledmin;
  }

  /**
   * The maximum number of Ezsigntemplateformfield that must be filled in the Ezsigntemplateformfieldgroup
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The maximum number of Ezsigntemplateformfield that must be filled in the Ezsigntemplateformfieldgroup")
  public Integer getIEzsigntemplateformfieldgroupFilledmax() {
    return iEzsigntemplateformfieldgroupFilledmax;
  }
  public void setIEzsigntemplateformfieldgroupFilledmax(Integer iEzsigntemplateformfieldgroupFilledmax) {
    this.iEzsigntemplateformfieldgroupFilledmax = iEzsigntemplateformfieldgroupFilledmax;
  }

  /**
   * Whether the Ezsigntemplateformfieldgroup is read only or not.
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezsigntemplateformfieldgroup is read only or not.")
  public Boolean getBEzsigntemplateformfieldgroupReadonly() {
    return bEzsigntemplateformfieldgroupReadonly;
  }
  public void setBEzsigntemplateformfieldgroupReadonly(Boolean bEzsigntemplateformfieldgroupReadonly) {
    this.bEzsigntemplateformfieldgroupReadonly = bEzsigntemplateformfieldgroupReadonly;
  }

  /**
   * The maximum length for the value in the Ezsigntemplateformfieldgroup  This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea**
   * minimum: 0
   **/
  @ApiModelProperty(value = "The maximum length for the value in the Ezsigntemplateformfieldgroup  This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea**")
  public Integer getIEzsigntemplateformfieldgroupMaxlength() {
    return iEzsigntemplateformfieldgroupMaxlength;
  }
  public void setIEzsigntemplateformfieldgroupMaxlength(Integer iEzsigntemplateformfieldgroupMaxlength) {
    this.iEzsigntemplateformfieldgroupMaxlength = iEzsigntemplateformfieldgroupMaxlength;
  }

  /**
   * Whether the Ezsigntemplateformfieldgroup is encrypted in the database or not. Encrypted values are not displayed on the Ezsigndocument. This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea**
   **/
  @ApiModelProperty(value = "Whether the Ezsigntemplateformfieldgroup is encrypted in the database or not. Encrypted values are not displayed on the Ezsigndocument. This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea**")
  public Boolean getBEzsigntemplateformfieldgroupEncrypted() {
    return bEzsigntemplateformfieldgroupEncrypted;
  }
  public void setBEzsigntemplateformfieldgroupEncrypted(Boolean bEzsigntemplateformfieldgroupEncrypted) {
    this.bEzsigntemplateformfieldgroupEncrypted = bEzsigntemplateformfieldgroupEncrypted;
  }

  /**
   * A regular expression to indicate what values are acceptable for the Ezsigntemplateformfieldgroup.  This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea**
   **/
  @ApiModelProperty(value = "A regular expression to indicate what values are acceptable for the Ezsigntemplateformfieldgroup.  This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea**")
  public String getSEzsigntemplateformfieldgroupRegexp() {
    return sEzsigntemplateformfieldgroupRegexp;
  }
  public void setSEzsigntemplateformfieldgroupRegexp(String sEzsigntemplateformfieldgroupRegexp) {
    this.sEzsigntemplateformfieldgroupRegexp = sEzsigntemplateformfieldgroupRegexp;
  }

  /**
   * A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplateformfieldgroup
   **/
  @ApiModelProperty(value = "A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplateformfieldgroup")
  public String getTEzsigntemplateformfieldgroupTooltip() {
    return tEzsigntemplateformfieldgroupTooltip;
  }
  public void setTEzsigntemplateformfieldgroupTooltip(String tEzsigntemplateformfieldgroupTooltip) {
    this.tEzsigntemplateformfieldgroupTooltip = tEzsigntemplateformfieldgroupTooltip;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsigntemplateformfieldgroupTooltipposition getEEzsigntemplateformfieldgroupTooltipposition() {
    return eEzsigntemplateformfieldgroupTooltipposition;
  }
  public void setEEzsigntemplateformfieldgroupTooltipposition(FieldEEzsigntemplateformfieldgroupTooltipposition eEzsigntemplateformfieldgroupTooltipposition) {
    this.eEzsigntemplateformfieldgroupTooltipposition = eEzsigntemplateformfieldgroupTooltipposition;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplateformfieldgroupRequest ezsigntemplateformfieldgroupRequest = (EzsigntemplateformfieldgroupRequest) o;
    return (this.pkiEzsigntemplateformfieldgroupID == null ? ezsigntemplateformfieldgroupRequest.pkiEzsigntemplateformfieldgroupID == null : this.pkiEzsigntemplateformfieldgroupID.equals(ezsigntemplateformfieldgroupRequest.pkiEzsigntemplateformfieldgroupID)) &&
        (this.fkiEzsigntemplatedocumentID == null ? ezsigntemplateformfieldgroupRequest.fkiEzsigntemplatedocumentID == null : this.fkiEzsigntemplatedocumentID.equals(ezsigntemplateformfieldgroupRequest.fkiEzsigntemplatedocumentID)) &&
        (this.eEzsigntemplateformfieldgroupType == null ? ezsigntemplateformfieldgroupRequest.eEzsigntemplateformfieldgroupType == null : this.eEzsigntemplateformfieldgroupType.equals(ezsigntemplateformfieldgroupRequest.eEzsigntemplateformfieldgroupType)) &&
        (this.eEzsigntemplateformfieldgroupSignerrequirement == null ? ezsigntemplateformfieldgroupRequest.eEzsigntemplateformfieldgroupSignerrequirement == null : this.eEzsigntemplateformfieldgroupSignerrequirement.equals(ezsigntemplateformfieldgroupRequest.eEzsigntemplateformfieldgroupSignerrequirement)) &&
        (this.sEzsigntemplateformfieldgroupLabel == null ? ezsigntemplateformfieldgroupRequest.sEzsigntemplateformfieldgroupLabel == null : this.sEzsigntemplateformfieldgroupLabel.equals(ezsigntemplateformfieldgroupRequest.sEzsigntemplateformfieldgroupLabel)) &&
        (this.iEzsigntemplateformfieldgroupStep == null ? ezsigntemplateformfieldgroupRequest.iEzsigntemplateformfieldgroupStep == null : this.iEzsigntemplateformfieldgroupStep.equals(ezsigntemplateformfieldgroupRequest.iEzsigntemplateformfieldgroupStep)) &&
        (this.sEzsigntemplateformfieldgroupDefaultvalue == null ? ezsigntemplateformfieldgroupRequest.sEzsigntemplateformfieldgroupDefaultvalue == null : this.sEzsigntemplateformfieldgroupDefaultvalue.equals(ezsigntemplateformfieldgroupRequest.sEzsigntemplateformfieldgroupDefaultvalue)) &&
        (this.iEzsigntemplateformfieldgroupFilledmin == null ? ezsigntemplateformfieldgroupRequest.iEzsigntemplateformfieldgroupFilledmin == null : this.iEzsigntemplateformfieldgroupFilledmin.equals(ezsigntemplateformfieldgroupRequest.iEzsigntemplateformfieldgroupFilledmin)) &&
        (this.iEzsigntemplateformfieldgroupFilledmax == null ? ezsigntemplateformfieldgroupRequest.iEzsigntemplateformfieldgroupFilledmax == null : this.iEzsigntemplateformfieldgroupFilledmax.equals(ezsigntemplateformfieldgroupRequest.iEzsigntemplateformfieldgroupFilledmax)) &&
        (this.bEzsigntemplateformfieldgroupReadonly == null ? ezsigntemplateformfieldgroupRequest.bEzsigntemplateformfieldgroupReadonly == null : this.bEzsigntemplateformfieldgroupReadonly.equals(ezsigntemplateformfieldgroupRequest.bEzsigntemplateformfieldgroupReadonly)) &&
        (this.iEzsigntemplateformfieldgroupMaxlength == null ? ezsigntemplateformfieldgroupRequest.iEzsigntemplateformfieldgroupMaxlength == null : this.iEzsigntemplateformfieldgroupMaxlength.equals(ezsigntemplateformfieldgroupRequest.iEzsigntemplateformfieldgroupMaxlength)) &&
        (this.bEzsigntemplateformfieldgroupEncrypted == null ? ezsigntemplateformfieldgroupRequest.bEzsigntemplateformfieldgroupEncrypted == null : this.bEzsigntemplateformfieldgroupEncrypted.equals(ezsigntemplateformfieldgroupRequest.bEzsigntemplateformfieldgroupEncrypted)) &&
        (this.sEzsigntemplateformfieldgroupRegexp == null ? ezsigntemplateformfieldgroupRequest.sEzsigntemplateformfieldgroupRegexp == null : this.sEzsigntemplateformfieldgroupRegexp.equals(ezsigntemplateformfieldgroupRequest.sEzsigntemplateformfieldgroupRegexp)) &&
        (this.tEzsigntemplateformfieldgroupTooltip == null ? ezsigntemplateformfieldgroupRequest.tEzsigntemplateformfieldgroupTooltip == null : this.tEzsigntemplateformfieldgroupTooltip.equals(ezsigntemplateformfieldgroupRequest.tEzsigntemplateformfieldgroupTooltip)) &&
        (this.eEzsigntemplateformfieldgroupTooltipposition == null ? ezsigntemplateformfieldgroupRequest.eEzsigntemplateformfieldgroupTooltipposition == null : this.eEzsigntemplateformfieldgroupTooltipposition.equals(ezsigntemplateformfieldgroupRequest.eEzsigntemplateformfieldgroupTooltipposition));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplateformfieldgroupID == null ? 0: this.pkiEzsigntemplateformfieldgroupID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplatedocumentID == null ? 0: this.fkiEzsigntemplatedocumentID.hashCode());
    result = 31 * result + (this.eEzsigntemplateformfieldgroupType == null ? 0: this.eEzsigntemplateformfieldgroupType.hashCode());
    result = 31 * result + (this.eEzsigntemplateformfieldgroupSignerrequirement == null ? 0: this.eEzsigntemplateformfieldgroupSignerrequirement.hashCode());
    result = 31 * result + (this.sEzsigntemplateformfieldgroupLabel == null ? 0: this.sEzsigntemplateformfieldgroupLabel.hashCode());
    result = 31 * result + (this.iEzsigntemplateformfieldgroupStep == null ? 0: this.iEzsigntemplateformfieldgroupStep.hashCode());
    result = 31 * result + (this.sEzsigntemplateformfieldgroupDefaultvalue == null ? 0: this.sEzsigntemplateformfieldgroupDefaultvalue.hashCode());
    result = 31 * result + (this.iEzsigntemplateformfieldgroupFilledmin == null ? 0: this.iEzsigntemplateformfieldgroupFilledmin.hashCode());
    result = 31 * result + (this.iEzsigntemplateformfieldgroupFilledmax == null ? 0: this.iEzsigntemplateformfieldgroupFilledmax.hashCode());
    result = 31 * result + (this.bEzsigntemplateformfieldgroupReadonly == null ? 0: this.bEzsigntemplateformfieldgroupReadonly.hashCode());
    result = 31 * result + (this.iEzsigntemplateformfieldgroupMaxlength == null ? 0: this.iEzsigntemplateformfieldgroupMaxlength.hashCode());
    result = 31 * result + (this.bEzsigntemplateformfieldgroupEncrypted == null ? 0: this.bEzsigntemplateformfieldgroupEncrypted.hashCode());
    result = 31 * result + (this.sEzsigntemplateformfieldgroupRegexp == null ? 0: this.sEzsigntemplateformfieldgroupRegexp.hashCode());
    result = 31 * result + (this.tEzsigntemplateformfieldgroupTooltip == null ? 0: this.tEzsigntemplateformfieldgroupTooltip.hashCode());
    result = 31 * result + (this.eEzsigntemplateformfieldgroupTooltipposition == null ? 0: this.eEzsigntemplateformfieldgroupTooltipposition.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplateformfieldgroupRequest {\n");
    
    sb.append("  pkiEzsigntemplateformfieldgroupID: ").append(pkiEzsigntemplateformfieldgroupID).append("\n");
    sb.append("  fkiEzsigntemplatedocumentID: ").append(fkiEzsigntemplatedocumentID).append("\n");
    sb.append("  eEzsigntemplateformfieldgroupType: ").append(eEzsigntemplateformfieldgroupType).append("\n");
    sb.append("  eEzsigntemplateformfieldgroupSignerrequirement: ").append(eEzsigntemplateformfieldgroupSignerrequirement).append("\n");
    sb.append("  sEzsigntemplateformfieldgroupLabel: ").append(sEzsigntemplateformfieldgroupLabel).append("\n");
    sb.append("  iEzsigntemplateformfieldgroupStep: ").append(iEzsigntemplateformfieldgroupStep).append("\n");
    sb.append("  sEzsigntemplateformfieldgroupDefaultvalue: ").append(sEzsigntemplateformfieldgroupDefaultvalue).append("\n");
    sb.append("  iEzsigntemplateformfieldgroupFilledmin: ").append(iEzsigntemplateformfieldgroupFilledmin).append("\n");
    sb.append("  iEzsigntemplateformfieldgroupFilledmax: ").append(iEzsigntemplateformfieldgroupFilledmax).append("\n");
    sb.append("  bEzsigntemplateformfieldgroupReadonly: ").append(bEzsigntemplateformfieldgroupReadonly).append("\n");
    sb.append("  iEzsigntemplateformfieldgroupMaxlength: ").append(iEzsigntemplateformfieldgroupMaxlength).append("\n");
    sb.append("  bEzsigntemplateformfieldgroupEncrypted: ").append(bEzsigntemplateformfieldgroupEncrypted).append("\n");
    sb.append("  sEzsigntemplateformfieldgroupRegexp: ").append(sEzsigntemplateformfieldgroupRegexp).append("\n");
    sb.append("  tEzsigntemplateformfieldgroupTooltip: ").append(tEzsigntemplateformfieldgroupTooltip).append("\n");
    sb.append("  eEzsigntemplateformfieldgroupTooltipposition: ").append(eEzsigntemplateformfieldgroupTooltipposition).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
