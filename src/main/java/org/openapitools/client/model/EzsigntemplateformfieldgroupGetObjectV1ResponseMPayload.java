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
import org.openapitools.client.model.EzsigntemplateformfieldgroupResponseCompound;
import org.openapitools.client.model.EzsigntemplateformfieldgroupsignerResponseCompound;
import org.openapitools.client.model.FieldEEzsigntemplateformfieldgroupSignerrequirement;
import org.openapitools.client.model.FieldEEzsigntemplateformfieldgroupTooltipposition;
import org.openapitools.client.model.FieldEEzsigntemplateformfieldgroupType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID}
 **/
@ApiModel(description = "Payload for GET /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID}")
public class EzsigntemplateformfieldgroupGetObjectV1ResponseMPayload {
  
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
    EzsigntemplateformfieldgroupGetObjectV1ResponseMPayload ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload = (EzsigntemplateformfieldgroupGetObjectV1ResponseMPayload) o;
    return (this.pkiEzsigntemplateformfieldgroupID == null ? ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.pkiEzsigntemplateformfieldgroupID == null : this.pkiEzsigntemplateformfieldgroupID.equals(ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.pkiEzsigntemplateformfieldgroupID)) &&
        (this.fkiEzsigntemplatedocumentID == null ? ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.fkiEzsigntemplatedocumentID == null : this.fkiEzsigntemplatedocumentID.equals(ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.fkiEzsigntemplatedocumentID)) &&
        (this.eEzsigntemplateformfieldgroupType == null ? ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.eEzsigntemplateformfieldgroupType == null : this.eEzsigntemplateformfieldgroupType.equals(ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.eEzsigntemplateformfieldgroupType)) &&
        (this.eEzsigntemplateformfieldgroupSignerrequirement == null ? ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.eEzsigntemplateformfieldgroupSignerrequirement == null : this.eEzsigntemplateformfieldgroupSignerrequirement.equals(ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.eEzsigntemplateformfieldgroupSignerrequirement)) &&
        (this.sEzsigntemplateformfieldgroupLabel == null ? ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.sEzsigntemplateformfieldgroupLabel == null : this.sEzsigntemplateformfieldgroupLabel.equals(ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.sEzsigntemplateformfieldgroupLabel)) &&
        (this.iEzsigntemplateformfieldgroupStep == null ? ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.iEzsigntemplateformfieldgroupStep == null : this.iEzsigntemplateformfieldgroupStep.equals(ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.iEzsigntemplateformfieldgroupStep)) &&
        (this.sEzsigntemplateformfieldgroupDefaultvalue == null ? ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.sEzsigntemplateformfieldgroupDefaultvalue == null : this.sEzsigntemplateformfieldgroupDefaultvalue.equals(ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.sEzsigntemplateformfieldgroupDefaultvalue)) &&
        (this.iEzsigntemplateformfieldgroupFilledmin == null ? ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.iEzsigntemplateformfieldgroupFilledmin == null : this.iEzsigntemplateformfieldgroupFilledmin.equals(ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.iEzsigntemplateformfieldgroupFilledmin)) &&
        (this.iEzsigntemplateformfieldgroupFilledmax == null ? ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.iEzsigntemplateformfieldgroupFilledmax == null : this.iEzsigntemplateformfieldgroupFilledmax.equals(ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.iEzsigntemplateformfieldgroupFilledmax)) &&
        (this.bEzsigntemplateformfieldgroupReadonly == null ? ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.bEzsigntemplateformfieldgroupReadonly == null : this.bEzsigntemplateformfieldgroupReadonly.equals(ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.bEzsigntemplateformfieldgroupReadonly)) &&
        (this.iEzsigntemplateformfieldgroupMaxlength == null ? ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.iEzsigntemplateformfieldgroupMaxlength == null : this.iEzsigntemplateformfieldgroupMaxlength.equals(ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.iEzsigntemplateformfieldgroupMaxlength)) &&
        (this.bEzsigntemplateformfieldgroupEncrypted == null ? ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.bEzsigntemplateformfieldgroupEncrypted == null : this.bEzsigntemplateformfieldgroupEncrypted.equals(ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.bEzsigntemplateformfieldgroupEncrypted)) &&
        (this.sEzsigntemplateformfieldgroupRegexp == null ? ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.sEzsigntemplateformfieldgroupRegexp == null : this.sEzsigntemplateformfieldgroupRegexp.equals(ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.sEzsigntemplateformfieldgroupRegexp)) &&
        (this.tEzsigntemplateformfieldgroupTooltip == null ? ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.tEzsigntemplateformfieldgroupTooltip == null : this.tEzsigntemplateformfieldgroupTooltip.equals(ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.tEzsigntemplateformfieldgroupTooltip)) &&
        (this.eEzsigntemplateformfieldgroupTooltipposition == null ? ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.eEzsigntemplateformfieldgroupTooltipposition == null : this.eEzsigntemplateformfieldgroupTooltipposition.equals(ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.eEzsigntemplateformfieldgroupTooltipposition)) &&
        (this.aObjEzsigntemplateformfieldgroupsigner == null ? ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.aObjEzsigntemplateformfieldgroupsigner == null : this.aObjEzsigntemplateformfieldgroupsigner.equals(ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.aObjEzsigntemplateformfieldgroupsigner)) &&
        (this.aObjDropdownElement == null ? ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.aObjDropdownElement == null : this.aObjDropdownElement.equals(ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.aObjDropdownElement)) &&
        (this.aObjEzsigntemplateformfield == null ? ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.aObjEzsigntemplateformfield == null : this.aObjEzsigntemplateformfield.equals(ezsigntemplateformfieldgroupGetObjectV1ResponseMPayload.aObjEzsigntemplateformfield));
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
    sb.append("class EzsigntemplateformfieldgroupGetObjectV1ResponseMPayload {\n");
    
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