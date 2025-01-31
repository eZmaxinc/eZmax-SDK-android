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
import org.openapitools.client.model.CustomDropdownElementRequestCompound;
import org.openapitools.client.model.EnumTextvalidation;
import org.openapitools.client.model.EzsigntemplateformfieldRequestCompound;
import org.openapitools.client.model.EzsigntemplateformfieldgroupsignerRequestCompound;
import org.openapitools.client.model.FieldEEzsigntemplateformfieldgroupSignerrequirement;
import org.openapitools.client.model.FieldEEzsigntemplateformfieldgroupTooltipposition;
import org.openapitools.client.model.FieldEEzsigntemplateformfieldgroupType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsigntemplateformfieldgroup Object and children
 **/
@ApiModel(description = "A Ezsigntemplateformfieldgroup Object and children")
public class EzsigntemplateformfieldgroupRequestCompound {
  
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
  @SerializedName("sEzsigntemplateformfieldgroupTextvalidationcustommessage")
  private String sEzsigntemplateformfieldgroupTextvalidationcustommessage = null;
  @SerializedName("eEzsigntemplateformfieldgroupTextvalidation")
  private EnumTextvalidation eEzsigntemplateformfieldgroupTextvalidation = null;
  @SerializedName("tEzsigntemplateformfieldgroupTooltip")
  private String tEzsigntemplateformfieldgroupTooltip = null;
  @SerializedName("eEzsigntemplateformfieldgroupTooltipposition")
  private FieldEEzsigntemplateformfieldgroupTooltipposition eEzsigntemplateformfieldgroupTooltipposition = null;
  @SerializedName("a_objEzsigntemplateformfieldgroupsigner")
  private List<EzsigntemplateformfieldgroupsignerRequestCompound> aObjEzsigntemplateformfieldgroupsigner = null;
  @SerializedName("a_objDropdownElement")
  private List<CustomDropdownElementRequestCompound> aObjDropdownElement = null;
  @SerializedName("a_objEzsigntemplateformfield")
  private List<EzsigntemplateformfieldRequestCompound> aObjEzsigntemplateformfield = null;

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
  @ApiModelProperty(value = "")
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
   * The default value for the Ezsigntemplateformfieldgroup  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 |
   **/
  @ApiModelProperty(required = true, value = "The default value for the Ezsigntemplateformfieldgroup  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 |")
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
   * maximum: 65535
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
   * Description of validation rule. Show by signatory.
   **/
  @ApiModelProperty(value = "Description of validation rule. Show by signatory.")
  public String getSEzsigntemplateformfieldgroupTextvalidationcustommessage() {
    return sEzsigntemplateformfieldgroupTextvalidationcustommessage;
  }
  public void setSEzsigntemplateformfieldgroupTextvalidationcustommessage(String sEzsigntemplateformfieldgroupTextvalidationcustommessage) {
    this.sEzsigntemplateformfieldgroupTextvalidationcustommessage = sEzsigntemplateformfieldgroupTextvalidationcustommessage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EnumTextvalidation getEEzsigntemplateformfieldgroupTextvalidation() {
    return eEzsigntemplateformfieldgroupTextvalidation;
  }
  public void setEEzsigntemplateformfieldgroupTextvalidation(EnumTextvalidation eEzsigntemplateformfieldgroupTextvalidation) {
    this.eEzsigntemplateformfieldgroupTextvalidation = eEzsigntemplateformfieldgroupTextvalidation;
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
  public List<EzsigntemplateformfieldgroupsignerRequestCompound> getAObjEzsigntemplateformfieldgroupsigner() {
    return aObjEzsigntemplateformfieldgroupsigner;
  }
  public void setAObjEzsigntemplateformfieldgroupsigner(List<EzsigntemplateformfieldgroupsignerRequestCompound> aObjEzsigntemplateformfieldgroupsigner) {
    this.aObjEzsigntemplateformfieldgroupsigner = aObjEzsigntemplateformfieldgroupsigner;
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
  public List<EzsigntemplateformfieldRequestCompound> getAObjEzsigntemplateformfield() {
    return aObjEzsigntemplateformfield;
  }
  public void setAObjEzsigntemplateformfield(List<EzsigntemplateformfieldRequestCompound> aObjEzsigntemplateformfield) {
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
    EzsigntemplateformfieldgroupRequestCompound ezsigntemplateformfieldgroupRequestCompound = (EzsigntemplateformfieldgroupRequestCompound) o;
    return (this.pkiEzsigntemplateformfieldgroupID == null ? ezsigntemplateformfieldgroupRequestCompound.pkiEzsigntemplateformfieldgroupID == null : this.pkiEzsigntemplateformfieldgroupID.equals(ezsigntemplateformfieldgroupRequestCompound.pkiEzsigntemplateformfieldgroupID)) &&
        (this.fkiEzsigntemplatedocumentID == null ? ezsigntemplateformfieldgroupRequestCompound.fkiEzsigntemplatedocumentID == null : this.fkiEzsigntemplatedocumentID.equals(ezsigntemplateformfieldgroupRequestCompound.fkiEzsigntemplatedocumentID)) &&
        (this.eEzsigntemplateformfieldgroupType == null ? ezsigntemplateformfieldgroupRequestCompound.eEzsigntemplateformfieldgroupType == null : this.eEzsigntemplateformfieldgroupType.equals(ezsigntemplateformfieldgroupRequestCompound.eEzsigntemplateformfieldgroupType)) &&
        (this.eEzsigntemplateformfieldgroupSignerrequirement == null ? ezsigntemplateformfieldgroupRequestCompound.eEzsigntemplateformfieldgroupSignerrequirement == null : this.eEzsigntemplateformfieldgroupSignerrequirement.equals(ezsigntemplateformfieldgroupRequestCompound.eEzsigntemplateformfieldgroupSignerrequirement)) &&
        (this.sEzsigntemplateformfieldgroupLabel == null ? ezsigntemplateformfieldgroupRequestCompound.sEzsigntemplateformfieldgroupLabel == null : this.sEzsigntemplateformfieldgroupLabel.equals(ezsigntemplateformfieldgroupRequestCompound.sEzsigntemplateformfieldgroupLabel)) &&
        (this.iEzsigntemplateformfieldgroupStep == null ? ezsigntemplateformfieldgroupRequestCompound.iEzsigntemplateformfieldgroupStep == null : this.iEzsigntemplateformfieldgroupStep.equals(ezsigntemplateformfieldgroupRequestCompound.iEzsigntemplateformfieldgroupStep)) &&
        (this.sEzsigntemplateformfieldgroupDefaultvalue == null ? ezsigntemplateformfieldgroupRequestCompound.sEzsigntemplateformfieldgroupDefaultvalue == null : this.sEzsigntemplateformfieldgroupDefaultvalue.equals(ezsigntemplateformfieldgroupRequestCompound.sEzsigntemplateformfieldgroupDefaultvalue)) &&
        (this.iEzsigntemplateformfieldgroupFilledmin == null ? ezsigntemplateformfieldgroupRequestCompound.iEzsigntemplateformfieldgroupFilledmin == null : this.iEzsigntemplateformfieldgroupFilledmin.equals(ezsigntemplateformfieldgroupRequestCompound.iEzsigntemplateformfieldgroupFilledmin)) &&
        (this.iEzsigntemplateformfieldgroupFilledmax == null ? ezsigntemplateformfieldgroupRequestCompound.iEzsigntemplateformfieldgroupFilledmax == null : this.iEzsigntemplateformfieldgroupFilledmax.equals(ezsigntemplateformfieldgroupRequestCompound.iEzsigntemplateformfieldgroupFilledmax)) &&
        (this.bEzsigntemplateformfieldgroupReadonly == null ? ezsigntemplateformfieldgroupRequestCompound.bEzsigntemplateformfieldgroupReadonly == null : this.bEzsigntemplateformfieldgroupReadonly.equals(ezsigntemplateformfieldgroupRequestCompound.bEzsigntemplateformfieldgroupReadonly)) &&
        (this.iEzsigntemplateformfieldgroupMaxlength == null ? ezsigntemplateformfieldgroupRequestCompound.iEzsigntemplateformfieldgroupMaxlength == null : this.iEzsigntemplateformfieldgroupMaxlength.equals(ezsigntemplateformfieldgroupRequestCompound.iEzsigntemplateformfieldgroupMaxlength)) &&
        (this.bEzsigntemplateformfieldgroupEncrypted == null ? ezsigntemplateformfieldgroupRequestCompound.bEzsigntemplateformfieldgroupEncrypted == null : this.bEzsigntemplateformfieldgroupEncrypted.equals(ezsigntemplateformfieldgroupRequestCompound.bEzsigntemplateformfieldgroupEncrypted)) &&
        (this.sEzsigntemplateformfieldgroupRegexp == null ? ezsigntemplateformfieldgroupRequestCompound.sEzsigntemplateformfieldgroupRegexp == null : this.sEzsigntemplateformfieldgroupRegexp.equals(ezsigntemplateformfieldgroupRequestCompound.sEzsigntemplateformfieldgroupRegexp)) &&
        (this.sEzsigntemplateformfieldgroupTextvalidationcustommessage == null ? ezsigntemplateformfieldgroupRequestCompound.sEzsigntemplateformfieldgroupTextvalidationcustommessage == null : this.sEzsigntemplateformfieldgroupTextvalidationcustommessage.equals(ezsigntemplateformfieldgroupRequestCompound.sEzsigntemplateformfieldgroupTextvalidationcustommessage)) &&
        (this.eEzsigntemplateformfieldgroupTextvalidation == null ? ezsigntemplateformfieldgroupRequestCompound.eEzsigntemplateformfieldgroupTextvalidation == null : this.eEzsigntemplateformfieldgroupTextvalidation.equals(ezsigntemplateformfieldgroupRequestCompound.eEzsigntemplateformfieldgroupTextvalidation)) &&
        (this.tEzsigntemplateformfieldgroupTooltip == null ? ezsigntemplateformfieldgroupRequestCompound.tEzsigntemplateformfieldgroupTooltip == null : this.tEzsigntemplateformfieldgroupTooltip.equals(ezsigntemplateformfieldgroupRequestCompound.tEzsigntemplateformfieldgroupTooltip)) &&
        (this.eEzsigntemplateformfieldgroupTooltipposition == null ? ezsigntemplateformfieldgroupRequestCompound.eEzsigntemplateformfieldgroupTooltipposition == null : this.eEzsigntemplateformfieldgroupTooltipposition.equals(ezsigntemplateformfieldgroupRequestCompound.eEzsigntemplateformfieldgroupTooltipposition)) &&
        (this.aObjEzsigntemplateformfieldgroupsigner == null ? ezsigntemplateformfieldgroupRequestCompound.aObjEzsigntemplateformfieldgroupsigner == null : this.aObjEzsigntemplateformfieldgroupsigner.equals(ezsigntemplateformfieldgroupRequestCompound.aObjEzsigntemplateformfieldgroupsigner)) &&
        (this.aObjDropdownElement == null ? ezsigntemplateformfieldgroupRequestCompound.aObjDropdownElement == null : this.aObjDropdownElement.equals(ezsigntemplateformfieldgroupRequestCompound.aObjDropdownElement)) &&
        (this.aObjEzsigntemplateformfield == null ? ezsigntemplateformfieldgroupRequestCompound.aObjEzsigntemplateformfield == null : this.aObjEzsigntemplateformfield.equals(ezsigntemplateformfieldgroupRequestCompound.aObjEzsigntemplateformfield));
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
    result = 31 * result + (this.sEzsigntemplateformfieldgroupTextvalidationcustommessage == null ? 0: this.sEzsigntemplateformfieldgroupTextvalidationcustommessage.hashCode());
    result = 31 * result + (this.eEzsigntemplateformfieldgroupTextvalidation == null ? 0: this.eEzsigntemplateformfieldgroupTextvalidation.hashCode());
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
    sb.append("class EzsigntemplateformfieldgroupRequestCompound {\n");
    
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
    sb.append("  sEzsigntemplateformfieldgroupTextvalidationcustommessage: ").append(sEzsigntemplateformfieldgroupTextvalidationcustommessage).append("\n");
    sb.append("  eEzsigntemplateformfieldgroupTextvalidation: ").append(eEzsigntemplateformfieldgroupTextvalidation).append("\n");
    sb.append("  tEzsigntemplateformfieldgroupTooltip: ").append(tEzsigntemplateformfieldgroupTooltip).append("\n");
    sb.append("  eEzsigntemplateformfieldgroupTooltipposition: ").append(eEzsigntemplateformfieldgroupTooltipposition).append("\n");
    sb.append("  aObjEzsigntemplateformfieldgroupsigner: ").append(aObjEzsigntemplateformfieldgroupsigner).append("\n");
    sb.append("  aObjDropdownElement: ").append(aObjDropdownElement).append("\n");
    sb.append("  aObjEzsigntemplateformfield: ").append(aObjEzsigntemplateformfield).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
