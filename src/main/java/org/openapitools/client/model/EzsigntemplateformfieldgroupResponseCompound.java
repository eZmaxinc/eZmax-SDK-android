/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CustomDropdownElementResponseCompound;
import org.openapitools.client.model.EzsigntemplateformfieldResponseCompound;
import org.openapitools.client.model.EzsigntemplateformfieldgroupResponse;
import org.openapitools.client.model.EzsigntemplateformfieldgroupResponseCompoundAllOf;
import org.openapitools.client.model.EzsigntemplateformfieldgroupsignerResponseCompound;
import org.openapitools.client.model.FieldEEzsigntemplateformfieldgroupSignerrequirement;
import org.openapitools.client.model.FieldEEzsigntemplateformfieldgroupTooltipposition;
import org.openapitools.client.model.FieldEEzsigntemplateformfieldgroupType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsigntemplateformfieldgroup Object and children
 **/
@ApiModel(description = "A Ezsigntemplateformfieldgroup Object and children")
public class EzsigntemplateformfieldgroupResponseCompound {
  
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
  @SerializedName("a_objEzsigntemplateformfieldgroupsigner")
  private List<EzsigntemplateformfieldgroupsignerResponseCompound> aObjEzsigntemplateformfieldgroupsigner = null;
  @SerializedName("a_objDropdownElement")
  private List<CustomDropdownElementResponseCompound> aObjDropdownElement = null;
  @SerializedName("a_objEzsigntemplateformfield")
  private List<EzsigntemplateformfieldResponseCompound> aObjEzsigntemplateformfield = null;

  /**
   * The unique ID of the Ezsigntemplateformfieldgroup
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplateformfieldgroup")
  public Integer getPkiEzsigntemplateformfieldgroupID() {
    return pkiEzsigntemplateformfieldgroupID;
  }
  public void setPkiEzsigntemplateformfieldgroupID(Integer pkiEzsigntemplateformfieldgroupID) {
    this.pkiEzsigntemplateformfieldgroupID = pkiEzsigntemplateformfieldgroupID;
  }

  /**
   * The unique ID of the Ezsigntemplatedocument
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

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigntemplateformfieldgroupsignerResponseCompound> getAObjEzsigntemplateformfieldgroupsigner() {
    return aObjEzsigntemplateformfieldgroupsigner;
  }
  public void setAObjEzsigntemplateformfieldgroupsigner(List<EzsigntemplateformfieldgroupsignerResponseCompound> aObjEzsigntemplateformfieldgroupsigner) {
    this.aObjEzsigntemplateformfieldgroupsigner = aObjEzsigntemplateformfieldgroupsigner;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CustomDropdownElementResponseCompound> getAObjDropdownElement() {
    return aObjDropdownElement;
  }
  public void setAObjDropdownElement(List<CustomDropdownElementResponseCompound> aObjDropdownElement) {
    this.aObjDropdownElement = aObjDropdownElement;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigntemplateformfieldResponseCompound> getAObjEzsigntemplateformfield() {
    return aObjEzsigntemplateformfield;
  }
  public void setAObjEzsigntemplateformfield(List<EzsigntemplateformfieldResponseCompound> aObjEzsigntemplateformfield) {
    this.aObjEzsigntemplateformfield = aObjEzsigntemplateformfield;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplateformfieldgroupResponseCompound ezsigntemplateformfieldgroupResponseCompound = (EzsigntemplateformfieldgroupResponseCompound) o;
    return (this.pkiEzsigntemplateformfieldgroupID == null ? ezsigntemplateformfieldgroupResponseCompound.pkiEzsigntemplateformfieldgroupID == null : this.pkiEzsigntemplateformfieldgroupID.equals(ezsigntemplateformfieldgroupResponseCompound.pkiEzsigntemplateformfieldgroupID)) &&
        (this.fkiEzsigntemplatedocumentID == null ? ezsigntemplateformfieldgroupResponseCompound.fkiEzsigntemplatedocumentID == null : this.fkiEzsigntemplatedocumentID.equals(ezsigntemplateformfieldgroupResponseCompound.fkiEzsigntemplatedocumentID)) &&
        (this.eEzsigntemplateformfieldgroupType == null ? ezsigntemplateformfieldgroupResponseCompound.eEzsigntemplateformfieldgroupType == null : this.eEzsigntemplateformfieldgroupType.equals(ezsigntemplateformfieldgroupResponseCompound.eEzsigntemplateformfieldgroupType)) &&
        (this.eEzsigntemplateformfieldgroupSignerrequirement == null ? ezsigntemplateformfieldgroupResponseCompound.eEzsigntemplateformfieldgroupSignerrequirement == null : this.eEzsigntemplateformfieldgroupSignerrequirement.equals(ezsigntemplateformfieldgroupResponseCompound.eEzsigntemplateformfieldgroupSignerrequirement)) &&
        (this.sEzsigntemplateformfieldgroupLabel == null ? ezsigntemplateformfieldgroupResponseCompound.sEzsigntemplateformfieldgroupLabel == null : this.sEzsigntemplateformfieldgroupLabel.equals(ezsigntemplateformfieldgroupResponseCompound.sEzsigntemplateformfieldgroupLabel)) &&
        (this.iEzsigntemplateformfieldgroupStep == null ? ezsigntemplateformfieldgroupResponseCompound.iEzsigntemplateformfieldgroupStep == null : this.iEzsigntemplateformfieldgroupStep.equals(ezsigntemplateformfieldgroupResponseCompound.iEzsigntemplateformfieldgroupStep)) &&
        (this.sEzsigntemplateformfieldgroupDefaultvalue == null ? ezsigntemplateformfieldgroupResponseCompound.sEzsigntemplateformfieldgroupDefaultvalue == null : this.sEzsigntemplateformfieldgroupDefaultvalue.equals(ezsigntemplateformfieldgroupResponseCompound.sEzsigntemplateformfieldgroupDefaultvalue)) &&
        (this.iEzsigntemplateformfieldgroupFilledmin == null ? ezsigntemplateformfieldgroupResponseCompound.iEzsigntemplateformfieldgroupFilledmin == null : this.iEzsigntemplateformfieldgroupFilledmin.equals(ezsigntemplateformfieldgroupResponseCompound.iEzsigntemplateformfieldgroupFilledmin)) &&
        (this.iEzsigntemplateformfieldgroupFilledmax == null ? ezsigntemplateformfieldgroupResponseCompound.iEzsigntemplateformfieldgroupFilledmax == null : this.iEzsigntemplateformfieldgroupFilledmax.equals(ezsigntemplateformfieldgroupResponseCompound.iEzsigntemplateformfieldgroupFilledmax)) &&
        (this.bEzsigntemplateformfieldgroupReadonly == null ? ezsigntemplateformfieldgroupResponseCompound.bEzsigntemplateformfieldgroupReadonly == null : this.bEzsigntemplateformfieldgroupReadonly.equals(ezsigntemplateformfieldgroupResponseCompound.bEzsigntemplateformfieldgroupReadonly)) &&
        (this.iEzsigntemplateformfieldgroupMaxlength == null ? ezsigntemplateformfieldgroupResponseCompound.iEzsigntemplateformfieldgroupMaxlength == null : this.iEzsigntemplateformfieldgroupMaxlength.equals(ezsigntemplateformfieldgroupResponseCompound.iEzsigntemplateformfieldgroupMaxlength)) &&
        (this.bEzsigntemplateformfieldgroupEncrypted == null ? ezsigntemplateformfieldgroupResponseCompound.bEzsigntemplateformfieldgroupEncrypted == null : this.bEzsigntemplateformfieldgroupEncrypted.equals(ezsigntemplateformfieldgroupResponseCompound.bEzsigntemplateformfieldgroupEncrypted)) &&
        (this.sEzsigntemplateformfieldgroupRegexp == null ? ezsigntemplateformfieldgroupResponseCompound.sEzsigntemplateformfieldgroupRegexp == null : this.sEzsigntemplateformfieldgroupRegexp.equals(ezsigntemplateformfieldgroupResponseCompound.sEzsigntemplateformfieldgroupRegexp)) &&
        (this.tEzsigntemplateformfieldgroupTooltip == null ? ezsigntemplateformfieldgroupResponseCompound.tEzsigntemplateformfieldgroupTooltip == null : this.tEzsigntemplateformfieldgroupTooltip.equals(ezsigntemplateformfieldgroupResponseCompound.tEzsigntemplateformfieldgroupTooltip)) &&
        (this.eEzsigntemplateformfieldgroupTooltipposition == null ? ezsigntemplateformfieldgroupResponseCompound.eEzsigntemplateformfieldgroupTooltipposition == null : this.eEzsigntemplateformfieldgroupTooltipposition.equals(ezsigntemplateformfieldgroupResponseCompound.eEzsigntemplateformfieldgroupTooltipposition)) &&
        (this.aObjEzsigntemplateformfieldgroupsigner == null ? ezsigntemplateformfieldgroupResponseCompound.aObjEzsigntemplateformfieldgroupsigner == null : this.aObjEzsigntemplateformfieldgroupsigner.equals(ezsigntemplateformfieldgroupResponseCompound.aObjEzsigntemplateformfieldgroupsigner)) &&
        (this.aObjDropdownElement == null ? ezsigntemplateformfieldgroupResponseCompound.aObjDropdownElement == null : this.aObjDropdownElement.equals(ezsigntemplateformfieldgroupResponseCompound.aObjDropdownElement)) &&
        (this.aObjEzsigntemplateformfield == null ? ezsigntemplateformfieldgroupResponseCompound.aObjEzsigntemplateformfield == null : this.aObjEzsigntemplateformfield.equals(ezsigntemplateformfieldgroupResponseCompound.aObjEzsigntemplateformfield));
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
    result = 31 * result + (this.aObjEzsigntemplateformfieldgroupsigner == null ? 0: this.aObjEzsigntemplateformfieldgroupsigner.hashCode());
    result = 31 * result + (this.aObjDropdownElement == null ? 0: this.aObjDropdownElement.hashCode());
    result = 31 * result + (this.aObjEzsigntemplateformfield == null ? 0: this.aObjEzsigntemplateformfield.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplateformfieldgroupResponseCompound {\n");
    
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
    sb.append("  aObjEzsigntemplateformfieldgroupsigner: ").append(aObjEzsigntemplateformfieldgroupsigner).append("\n");
    sb.append("  aObjDropdownElement: ").append(aObjDropdownElement).append("\n");
    sb.append("  aObjEzsigntemplateformfield: ").append(aObjEzsigntemplateformfield).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}