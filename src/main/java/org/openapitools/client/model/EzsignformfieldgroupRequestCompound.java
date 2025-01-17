/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.1
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CustomDropdownElementRequest;
import org.openapitools.client.model.EnumTextvalidation;
import org.openapitools.client.model.EzsignformfieldRequestCompound;
import org.openapitools.client.model.EzsignformfieldgroupRequest;
import org.openapitools.client.model.EzsignformfieldgroupsignerRequest;
import org.openapitools.client.model.FieldEEzsignformfieldgroupSignerrequirement;
import org.openapitools.client.model.FieldEEzsignformfieldgroupTooltipposition;
import org.openapitools.client.model.FieldEEzsignformfieldgroupType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignformfieldgroup Object and children to create a complete structure
 **/
@ApiModel(description = "An Ezsignformfieldgroup Object and children to create a complete structure")
public class EzsignformfieldgroupRequestCompound extends EzsignformfieldgroupRequest {
  
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
  @SerializedName("sEzsignformfieldgroupTextvalidationcustommessage")
  private String sEzsignformfieldgroupTextvalidationcustommessage = null;
  @SerializedName("tEzsignformfieldgroupTooltip")
  private String tEzsignformfieldgroupTooltip = null;
  @SerializedName("eEzsignformfieldgroupTooltipposition")
  private FieldEEzsignformfieldgroupTooltipposition eEzsignformfieldgroupTooltipposition = null;
  @SerializedName("eEzsignformfieldgroupTextvalidation")
  private EnumTextvalidation eEzsignformfieldgroupTextvalidation = null;
  @SerializedName("a_objEzsignformfieldgroupsigner")
  private List<EzsignformfieldgroupsignerRequestCompound> aObjEzsignformfieldgroupsigner = null;
  @SerializedName("a_objDropdownElement")
  private List<CustomDropdownElementRequestCompound> aObjDropdownElement = null;
  @SerializedName("a_objEzsignformfield")
  private List<EzsignformfieldRequestCompound> aObjEzsignformfield = null;

  /**
   * The unique ID of the Ezsignformfieldgroup
   * minimum: 0
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
   * minimum: 0
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
  @ApiModelProperty(value = "")
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
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The step when the Ezsignsigner will be invited to fill the form fields")
  public Integer getIEzsignformfieldgroupStep() {
    return iEzsignformfieldgroupStep;
  }
  public void setIEzsignformfieldgroupStep(Integer iEzsignformfieldgroupStep) {
    this.iEzsignformfieldgroupStep = iEzsignformfieldgroupStep;
  }

  /**
   * The default value for the Ezsignformfieldgroup  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sCompany} | Company name | eZmax Solutions Inc. | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 |
   **/
  @ApiModelProperty(value = "The default value for the Ezsignformfieldgroup  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sCompany} | Company name | eZmax Solutions Inc. | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 |")
  public String getSEzsignformfieldgroupDefaultvalue() {
    return sEzsignformfieldgroupDefaultvalue;
  }
  public void setSEzsignformfieldgroupDefaultvalue(String sEzsignformfieldgroupDefaultvalue) {
    this.sEzsignformfieldgroupDefaultvalue = sEzsignformfieldgroupDefaultvalue;
  }

  /**
   * The minimum number of Ezsignformfield that must be filled in the Ezsignformfieldgroup
   * minimum: 0
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
   * minimum: 0
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
   * minimum: 0
   * maximum: 65535
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
   * Description of validation rule. Show by signatory.
   **/
  @ApiModelProperty(value = "Description of validation rule. Show by signatory.")
  public String getSEzsignformfieldgroupTextvalidationcustommessage() {
    return sEzsignformfieldgroupTextvalidationcustommessage;
  }
  public void setSEzsignformfieldgroupTextvalidationcustommessage(String sEzsignformfieldgroupTextvalidationcustommessage) {
    this.sEzsignformfieldgroupTextvalidationcustommessage = sEzsignformfieldgroupTextvalidationcustommessage;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public EnumTextvalidation getEEzsignformfieldgroupTextvalidation() {
    return eEzsignformfieldgroupTextvalidation;
  }
  public void setEEzsignformfieldgroupTextvalidation(EnumTextvalidation eEzsignformfieldgroupTextvalidation) {
    this.eEzsignformfieldgroupTextvalidation = eEzsignformfieldgroupTextvalidation;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignformfieldgroupsignerRequestCompound> getAObjEzsignformfieldgroupsigner() {
    return aObjEzsignformfieldgroupsigner;
  }
  public void setAObjEzsignformfieldgroupsigner(List<EzsignformfieldgroupsignerRequestCompound> aObjEzsignformfieldgroupsigner) {
    this.aObjEzsignformfieldgroupsigner = aObjEzsignformfieldgroupsigner;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CustomDropdownElementRequestCompound> getAObjDropdownElement() {
    return aObjDropdownElement;
  }
  public void setAObjDropdownElement(List<CustomDropdownElementRequestCompound> aObjDropdownElement) {
    this.aObjDropdownElement = aObjDropdownElement;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignformfieldRequestCompound> getAObjEzsignformfield() {
    return aObjEzsignformfield;
  }
  public void setAObjEzsignformfield(List<EzsignformfieldRequestCompound> aObjEzsignformfield) {
    this.aObjEzsignformfield = aObjEzsignformfield;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignformfieldgroupRequestCompound ezsignformfieldgroupRequestCompound = (EzsignformfieldgroupRequestCompound) o;
    return (this.pkiEzsignformfieldgroupID == null ? ezsignformfieldgroupRequestCompound.pkiEzsignformfieldgroupID == null : this.pkiEzsignformfieldgroupID.equals(ezsignformfieldgroupRequestCompound.pkiEzsignformfieldgroupID)) &&
        (this.fkiEzsigndocumentID == null ? ezsignformfieldgroupRequestCompound.fkiEzsigndocumentID == null : this.fkiEzsigndocumentID.equals(ezsignformfieldgroupRequestCompound.fkiEzsigndocumentID)) &&
        (this.eEzsignformfieldgroupType == null ? ezsignformfieldgroupRequestCompound.eEzsignformfieldgroupType == null : this.eEzsignformfieldgroupType.equals(ezsignformfieldgroupRequestCompound.eEzsignformfieldgroupType)) &&
        (this.eEzsignformfieldgroupSignerrequirement == null ? ezsignformfieldgroupRequestCompound.eEzsignformfieldgroupSignerrequirement == null : this.eEzsignformfieldgroupSignerrequirement.equals(ezsignformfieldgroupRequestCompound.eEzsignformfieldgroupSignerrequirement)) &&
        (this.sEzsignformfieldgroupLabel == null ? ezsignformfieldgroupRequestCompound.sEzsignformfieldgroupLabel == null : this.sEzsignformfieldgroupLabel.equals(ezsignformfieldgroupRequestCompound.sEzsignformfieldgroupLabel)) &&
        (this.iEzsignformfieldgroupStep == null ? ezsignformfieldgroupRequestCompound.iEzsignformfieldgroupStep == null : this.iEzsignformfieldgroupStep.equals(ezsignformfieldgroupRequestCompound.iEzsignformfieldgroupStep)) &&
        (this.sEzsignformfieldgroupDefaultvalue == null ? ezsignformfieldgroupRequestCompound.sEzsignformfieldgroupDefaultvalue == null : this.sEzsignformfieldgroupDefaultvalue.equals(ezsignformfieldgroupRequestCompound.sEzsignformfieldgroupDefaultvalue)) &&
        (this.iEzsignformfieldgroupFilledmin == null ? ezsignformfieldgroupRequestCompound.iEzsignformfieldgroupFilledmin == null : this.iEzsignformfieldgroupFilledmin.equals(ezsignformfieldgroupRequestCompound.iEzsignformfieldgroupFilledmin)) &&
        (this.iEzsignformfieldgroupFilledmax == null ? ezsignformfieldgroupRequestCompound.iEzsignformfieldgroupFilledmax == null : this.iEzsignformfieldgroupFilledmax.equals(ezsignformfieldgroupRequestCompound.iEzsignformfieldgroupFilledmax)) &&
        (this.bEzsignformfieldgroupReadonly == null ? ezsignformfieldgroupRequestCompound.bEzsignformfieldgroupReadonly == null : this.bEzsignformfieldgroupReadonly.equals(ezsignformfieldgroupRequestCompound.bEzsignformfieldgroupReadonly)) &&
        (this.iEzsignformfieldgroupMaxlength == null ? ezsignformfieldgroupRequestCompound.iEzsignformfieldgroupMaxlength == null : this.iEzsignformfieldgroupMaxlength.equals(ezsignformfieldgroupRequestCompound.iEzsignformfieldgroupMaxlength)) &&
        (this.bEzsignformfieldgroupEncrypted == null ? ezsignformfieldgroupRequestCompound.bEzsignformfieldgroupEncrypted == null : this.bEzsignformfieldgroupEncrypted.equals(ezsignformfieldgroupRequestCompound.bEzsignformfieldgroupEncrypted)) &&
        (this.sEzsignformfieldgroupRegexp == null ? ezsignformfieldgroupRequestCompound.sEzsignformfieldgroupRegexp == null : this.sEzsignformfieldgroupRegexp.equals(ezsignformfieldgroupRequestCompound.sEzsignformfieldgroupRegexp)) &&
        (this.sEzsignformfieldgroupTextvalidationcustommessage == null ? ezsignformfieldgroupRequestCompound.sEzsignformfieldgroupTextvalidationcustommessage == null : this.sEzsignformfieldgroupTextvalidationcustommessage.equals(ezsignformfieldgroupRequestCompound.sEzsignformfieldgroupTextvalidationcustommessage)) &&
        (this.tEzsignformfieldgroupTooltip == null ? ezsignformfieldgroupRequestCompound.tEzsignformfieldgroupTooltip == null : this.tEzsignformfieldgroupTooltip.equals(ezsignformfieldgroupRequestCompound.tEzsignformfieldgroupTooltip)) &&
        (this.eEzsignformfieldgroupTooltipposition == null ? ezsignformfieldgroupRequestCompound.eEzsignformfieldgroupTooltipposition == null : this.eEzsignformfieldgroupTooltipposition.equals(ezsignformfieldgroupRequestCompound.eEzsignformfieldgroupTooltipposition)) &&
        (this.eEzsignformfieldgroupTextvalidation == null ? ezsignformfieldgroupRequestCompound.eEzsignformfieldgroupTextvalidation == null : this.eEzsignformfieldgroupTextvalidation.equals(ezsignformfieldgroupRequestCompound.eEzsignformfieldgroupTextvalidation)) &&
        (this.aObjEzsignformfieldgroupsigner == null ? ezsignformfieldgroupRequestCompound.aObjEzsignformfieldgroupsigner == null : this.aObjEzsignformfieldgroupsigner.equals(ezsignformfieldgroupRequestCompound.aObjEzsignformfieldgroupsigner)) &&
        (this.aObjDropdownElement == null ? ezsignformfieldgroupRequestCompound.aObjDropdownElement == null : this.aObjDropdownElement.equals(ezsignformfieldgroupRequestCompound.aObjDropdownElement)) &&
        (this.aObjEzsignformfield == null ? ezsignformfieldgroupRequestCompound.aObjEzsignformfield == null : this.aObjEzsignformfield.equals(ezsignformfieldgroupRequestCompound.aObjEzsignformfield));
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
    result = 31 * result + (this.sEzsignformfieldgroupTextvalidationcustommessage == null ? 0: this.sEzsignformfieldgroupTextvalidationcustommessage.hashCode());
    result = 31 * result + (this.tEzsignformfieldgroupTooltip == null ? 0: this.tEzsignformfieldgroupTooltip.hashCode());
    result = 31 * result + (this.eEzsignformfieldgroupTooltipposition == null ? 0: this.eEzsignformfieldgroupTooltipposition.hashCode());
    result = 31 * result + (this.eEzsignformfieldgroupTextvalidation == null ? 0: this.eEzsignformfieldgroupTextvalidation.hashCode());
    result = 31 * result + (this.aObjEzsignformfieldgroupsigner == null ? 0: this.aObjEzsignformfieldgroupsigner.hashCode());
    result = 31 * result + (this.aObjDropdownElement == null ? 0: this.aObjDropdownElement.hashCode());
    result = 31 * result + (this.aObjEzsignformfield == null ? 0: this.aObjEzsignformfield.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignformfieldgroupRequestCompound {\n");
    sb.append("  " + super.toString()).append("\n");
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
    sb.append("  sEzsignformfieldgroupTextvalidationcustommessage: ").append(sEzsignformfieldgroupTextvalidationcustommessage).append("\n");
    sb.append("  tEzsignformfieldgroupTooltip: ").append(tEzsignformfieldgroupTooltip).append("\n");
    sb.append("  eEzsignformfieldgroupTooltipposition: ").append(eEzsignformfieldgroupTooltipposition).append("\n");
    sb.append("  eEzsignformfieldgroupTextvalidation: ").append(eEzsignformfieldgroupTextvalidation).append("\n");
    sb.append("  aObjEzsignformfieldgroupsigner: ").append(aObjEzsignformfieldgroupsigner).append("\n");
    sb.append("  aObjDropdownElement: ").append(aObjDropdownElement).append("\n");
    sb.append("  aObjEzsignformfield: ").append(aObjEzsignformfield).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
