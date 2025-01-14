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

import org.openapitools.client.model.CustomContactNameResponse;
import org.openapitools.client.model.EnumTextvalidation;
import org.openapitools.client.model.FieldEEzsignsignatureAttachmentnamesource;
import org.openapitools.client.model.FieldEEzsignsignatureConsultationtrigger;
import org.openapitools.client.model.FieldEEzsignsignatureDependencyrequirement;
import org.openapitools.client.model.FieldEEzsignsignatureFont;
import org.openapitools.client.model.FieldEEzsignsignatureTooltipposition;
import org.openapitools.client.model.FieldEEzsignsignatureType;
import org.openapitools.client.model.SignatureResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignsignature Object
 **/
@ApiModel(description = "An Ezsignsignature Object")
public class EzsignsignatureResponse {
  
  @SerializedName("pkiEzsignsignatureID")
  private Integer pkiEzsignsignatureID = null;
  @SerializedName("fkiEzsigndocumentID")
  private Integer fkiEzsigndocumentID = null;
  @SerializedName("fkiEzsignfoldersignerassociationID")
  private Integer fkiEzsignfoldersignerassociationID = null;
  @SerializedName("fkiEzsignsigningreasonID")
  private Integer fkiEzsignsigningreasonID = null;
  @SerializedName("fkiFontID")
  private Integer fkiFontID = null;
  @SerializedName("sEzsignsigningreasonDescriptionX")
  private String sEzsignsigningreasonDescriptionX = null;
  @SerializedName("iEzsignpagePagenumber")
  private Integer iEzsignpagePagenumber = null;
  @SerializedName("iEzsignsignatureX")
  private Integer iEzsignsignatureX = null;
  @SerializedName("iEzsignsignatureY")
  private Integer iEzsignsignatureY = null;
  @SerializedName("iEzsignsignatureHeight")
  private Integer iEzsignsignatureHeight = null;
  @SerializedName("iEzsignsignatureWidth")
  private Integer iEzsignsignatureWidth = null;
  @SerializedName("iEzsignsignatureStep")
  private Integer iEzsignsignatureStep = null;
  @SerializedName("iEzsignsignatureStepadjusted")
  private Integer iEzsignsignatureStepadjusted = null;
  @SerializedName("eEzsignsignatureType")
  private FieldEEzsignsignatureType eEzsignsignatureType = null;
  @SerializedName("tEzsignsignatureTooltip")
  private String tEzsignsignatureTooltip = null;
  @SerializedName("eEzsignsignatureTooltipposition")
  private FieldEEzsignsignatureTooltipposition eEzsignsignatureTooltipposition = null;
  @SerializedName("eEzsignsignatureFont")
  private FieldEEzsignsignatureFont eEzsignsignatureFont = null;
  @SerializedName("iEzsignsignatureValidationstep")
  private Integer iEzsignsignatureValidationstep = null;
  @SerializedName("sEzsignsignatureAttachmentdescription")
  private String sEzsignsignatureAttachmentdescription = null;
  @SerializedName("eEzsignsignatureAttachmentnamesource")
  private FieldEEzsignsignatureAttachmentnamesource eEzsignsignatureAttachmentnamesource = null;
  @SerializedName("eEzsignsignatureConsultationtrigger")
  private FieldEEzsignsignatureConsultationtrigger eEzsignsignatureConsultationtrigger = null;
  @SerializedName("bEzsignsignatureHandwritten")
  private Boolean bEzsignsignatureHandwritten = null;
  @SerializedName("bEzsignsignatureReason")
  private Boolean bEzsignsignatureReason = null;
  @SerializedName("bEzsignsignatureRequired")
  private Boolean bEzsignsignatureRequired = null;
  @SerializedName("fkiEzsignfoldersignerassociationIDValidation")
  private Integer fkiEzsignfoldersignerassociationIDValidation = null;
  @SerializedName("dtEzsignsignatureDate")
  private String dtEzsignsignatureDate = null;
  @SerializedName("iEzsignsignatureattachmentCount")
  private Integer iEzsignsignatureattachmentCount = null;
  @SerializedName("sEzsignsignatureDescription")
  private String sEzsignsignatureDescription = null;
  @SerializedName("iEzsignsignatureMaxlength")
  private Integer iEzsignsignatureMaxlength = null;
  @SerializedName("eEzsignsignatureTextvalidation")
  private EnumTextvalidation eEzsignsignatureTextvalidation = null;
  @SerializedName("sEzsignsignatureTextvalidationcustommessage")
  private String sEzsignsignatureTextvalidationcustommessage = null;
  @SerializedName("eEzsignsignatureDependencyrequirement")
  private FieldEEzsignsignatureDependencyrequirement eEzsignsignatureDependencyrequirement = null;
  @SerializedName("sEzsignsignatureDefaultvalue")
  private String sEzsignsignatureDefaultvalue = null;
  @SerializedName("sEzsignsignatureRegexp")
  private String sEzsignsignatureRegexp = null;
  @SerializedName("objContactName")
  private CustomContactNameResponse objContactName = null;
  @SerializedName("objContactNameDelegation")
  private CustomContactNameResponse objContactNameDelegation = null;
  @SerializedName("objSignature")
  private SignatureResponseCompound objSignature = null;

  /**
   * The unique ID of the Ezsignsignature
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignsignature")
  public Integer getPkiEzsignsignatureID() {
    return pkiEzsignsignatureID;
  }
  public void setPkiEzsignsignatureID(Integer pkiEzsignsignatureID) {
    this.pkiEzsignsignatureID = pkiEzsignsignatureID;
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
   * The unique ID of the Ezsignfoldersignerassociation
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfoldersignerassociation")
  public Integer getFkiEzsignfoldersignerassociationID() {
    return fkiEzsignfoldersignerassociationID;
  }
  public void setFkiEzsignfoldersignerassociationID(Integer fkiEzsignfoldersignerassociationID) {
    this.fkiEzsignfoldersignerassociationID = fkiEzsignfoldersignerassociationID;
  }

  /**
   * The unique ID of the Ezsignsigningreason
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignsigningreason")
  public Integer getFkiEzsignsigningreasonID() {
    return fkiEzsignsigningreasonID;
  }
  public void setFkiEzsignsigningreasonID(Integer fkiEzsignsigningreasonID) {
    this.fkiEzsignsigningreasonID = fkiEzsignsigningreasonID;
  }

  /**
   * The unique ID of the Font
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Font")
  public Integer getFkiFontID() {
    return fkiFontID;
  }
  public void setFkiFontID(Integer fkiFontID) {
    this.fkiFontID = fkiFontID;
  }

  /**
   * The description of the Ezsignsigningreason in the language of the requester
   **/
  @ApiModelProperty(value = "The description of the Ezsignsigningreason in the language of the requester")
  public String getSEzsignsigningreasonDescriptionX() {
    return sEzsignsigningreasonDescriptionX;
  }
  public void setSEzsignsigningreasonDescriptionX(String sEzsignsigningreasonDescriptionX) {
    this.sEzsignsigningreasonDescriptionX = sEzsignsigningreasonDescriptionX;
  }

  /**
   * The page number in the Ezsigndocument
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The page number in the Ezsigndocument")
  public Integer getIEzsignpagePagenumber() {
    return iEzsignpagePagenumber;
  }
  public void setIEzsignpagePagenumber(Integer iEzsignpagePagenumber) {
    this.iEzsignpagePagenumber = iEzsignpagePagenumber;
  }

  /**
   * The X coordinate (Horizontal) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 2 inches from the left border of the page, you would use \"200\" for the X coordinate.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The X coordinate (Horizontal) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 2 inches from the left border of the page, you would use \"200\" for the X coordinate.")
  public Integer getIEzsignsignatureX() {
    return iEzsignsignatureX;
  }
  public void setIEzsignsignatureX(Integer iEzsignsignatureX) {
    this.iEzsignsignatureX = iEzsignsignatureX;
  }

  /**
   * The Y coordinate (Vertical) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The Y coordinate (Vertical) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.")
  public Integer getIEzsignsignatureY() {
    return iEzsignsignatureY;
  }
  public void setIEzsignsignatureY(Integer iEzsignsignatureY) {
    this.iEzsignsignatureY = iEzsignsignatureY;
  }

  /**
   * The height of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have an height of 2 inches, you would use \"200\" for the iEzsignsignatureHeight.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The height of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have an height of 2 inches, you would use \"200\" for the iEzsignsignatureHeight.")
  public Integer getIEzsignsignatureHeight() {
    return iEzsignsignatureHeight;
  }
  public void setIEzsignsignatureHeight(Integer iEzsignsignatureHeight) {
    this.iEzsignsignatureHeight = iEzsignsignatureHeight;
  }

  /**
   * The width of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have a width of 2 inches, you would use \"200\" for the iEzsignsignatureWidth.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The width of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have a width of 2 inches, you would use \"200\" for the iEzsignsignatureWidth.")
  public Integer getIEzsignsignatureWidth() {
    return iEzsignsignatureWidth;
  }
  public void setIEzsignsignatureWidth(Integer iEzsignsignatureWidth) {
    this.iEzsignsignatureWidth = iEzsignsignatureWidth;
  }

  /**
   * The step when the Ezsignsigner will be invited to sign
   **/
  @ApiModelProperty(required = true, value = "The step when the Ezsignsigner will be invited to sign")
  public Integer getIEzsignsignatureStep() {
    return iEzsignsignatureStep;
  }
  public void setIEzsignsignatureStep(Integer iEzsignsignatureStep) {
    this.iEzsignsignatureStep = iEzsignsignatureStep;
  }

  /**
   * The step when the Ezsignsigner will be invited to sign
   **/
  @ApiModelProperty(value = "The step when the Ezsignsigner will be invited to sign")
  public Integer getIEzsignsignatureStepadjusted() {
    return iEzsignsignatureStepadjusted;
  }
  public void setIEzsignsignatureStepadjusted(Integer iEzsignsignatureStepadjusted) {
    this.iEzsignsignatureStepadjusted = iEzsignsignatureStepadjusted;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsignsignatureType getEEzsignsignatureType() {
    return eEzsignsignatureType;
  }
  public void setEEzsignsignatureType(FieldEEzsignsignatureType eEzsignsignatureType) {
    this.eEzsignsignatureType = eEzsignsignatureType;
  }

  /**
   * A tooltip that will be presented to Ezsignsigner about the Ezsignsignature
   **/
  @ApiModelProperty(value = "A tooltip that will be presented to Ezsignsigner about the Ezsignsignature")
  public String getTEzsignsignatureTooltip() {
    return tEzsignsignatureTooltip;
  }
  public void setTEzsignsignatureTooltip(String tEzsignsignatureTooltip) {
    this.tEzsignsignatureTooltip = tEzsignsignatureTooltip;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsignsignatureTooltipposition getEEzsignsignatureTooltipposition() {
    return eEzsignsignatureTooltipposition;
  }
  public void setEEzsignsignatureTooltipposition(FieldEEzsignsignatureTooltipposition eEzsignsignatureTooltipposition) {
    this.eEzsignsignatureTooltipposition = eEzsignsignatureTooltipposition;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsignsignatureFont getEEzsignsignatureFont() {
    return eEzsignsignatureFont;
  }
  public void setEEzsignsignatureFont(FieldEEzsignsignatureFont eEzsignsignatureFont) {
    this.eEzsignsignatureFont = eEzsignsignatureFont;
  }

  /**
   * The step when the Ezsignsigner will be invited to validate the Ezsignsignature of eEzsignsignatureType Attachments
   **/
  @ApiModelProperty(value = "The step when the Ezsignsigner will be invited to validate the Ezsignsignature of eEzsignsignatureType Attachments")
  public Integer getIEzsignsignatureValidationstep() {
    return iEzsignsignatureValidationstep;
  }
  public void setIEzsignsignatureValidationstep(Integer iEzsignsignatureValidationstep) {
    this.iEzsignsignatureValidationstep = iEzsignsignatureValidationstep;
  }

  /**
   * The description attached to the attachment name added in Ezsignsignature of eEzsignsignatureType Attachments
   **/
  @ApiModelProperty(value = "The description attached to the attachment name added in Ezsignsignature of eEzsignsignatureType Attachments")
  public String getSEzsignsignatureAttachmentdescription() {
    return sEzsignsignatureAttachmentdescription;
  }
  public void setSEzsignsignatureAttachmentdescription(String sEzsignsignatureAttachmentdescription) {
    this.sEzsignsignatureAttachmentdescription = sEzsignsignatureAttachmentdescription;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsignsignatureAttachmentnamesource getEEzsignsignatureAttachmentnamesource() {
    return eEzsignsignatureAttachmentnamesource;
  }
  public void setEEzsignsignatureAttachmentnamesource(FieldEEzsignsignatureAttachmentnamesource eEzsignsignatureAttachmentnamesource) {
    this.eEzsignsignatureAttachmentnamesource = eEzsignsignatureAttachmentnamesource;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsignsignatureConsultationtrigger getEEzsignsignatureConsultationtrigger() {
    return eEzsignsignatureConsultationtrigger;
  }
  public void setEEzsignsignatureConsultationtrigger(FieldEEzsignsignatureConsultationtrigger eEzsignsignatureConsultationtrigger) {
    this.eEzsignsignatureConsultationtrigger = eEzsignsignatureConsultationtrigger;
  }

  /**
   * Whether the Ezsignsignature must be handwritten or not when eEzsignsignatureType = Signature.
   **/
  @ApiModelProperty(value = "Whether the Ezsignsignature must be handwritten or not when eEzsignsignatureType = Signature.")
  public Boolean getBEzsignsignatureHandwritten() {
    return bEzsignsignatureHandwritten;
  }
  public void setBEzsignsignatureHandwritten(Boolean bEzsignsignatureHandwritten) {
    this.bEzsignsignatureHandwritten = bEzsignsignatureHandwritten;
  }

  /**
   * Whether the Ezsignsignature must include a reason or not when eEzsignsignatureType = Signature.
   **/
  @ApiModelProperty(value = "Whether the Ezsignsignature must include a reason or not when eEzsignsignatureType = Signature.")
  public Boolean getBEzsignsignatureReason() {
    return bEzsignsignatureReason;
  }
  public void setBEzsignsignatureReason(Boolean bEzsignsignatureReason) {
    this.bEzsignsignatureReason = bEzsignsignatureReason;
  }

  /**
   * Whether the Ezsignsignature is required or not. This field is relevant only with Ezsignsignature with eEzsignsignatureType = Attachments, Text or Textarea.
   **/
  @ApiModelProperty(value = "Whether the Ezsignsignature is required or not. This field is relevant only with Ezsignsignature with eEzsignsignatureType = Attachments, Text or Textarea.")
  public Boolean getBEzsignsignatureRequired() {
    return bEzsignsignatureRequired;
  }
  public void setBEzsignsignatureRequired(Boolean bEzsignsignatureRequired) {
    this.bEzsignsignatureRequired = bEzsignsignatureRequired;
  }

  /**
   * The unique ID of the Ezsignfoldersignerassociation
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignfoldersignerassociation")
  public Integer getFkiEzsignfoldersignerassociationIDValidation() {
    return fkiEzsignfoldersignerassociationIDValidation;
  }
  public void setFkiEzsignfoldersignerassociationIDValidation(Integer fkiEzsignfoldersignerassociationIDValidation) {
    this.fkiEzsignfoldersignerassociationIDValidation = fkiEzsignfoldersignerassociationIDValidation;
  }

  /**
   * The date the Ezsignsignature was signed
   **/
  @ApiModelProperty(value = "The date the Ezsignsignature was signed")
  public String getDtEzsignsignatureDate() {
    return dtEzsignsignatureDate;
  }
  public void setDtEzsignsignatureDate(String dtEzsignsignatureDate) {
    this.dtEzsignsignatureDate = dtEzsignsignatureDate;
  }

  /**
   * The count of Ezsignsignatureattachment
   **/
  @ApiModelProperty(value = "The count of Ezsignsignatureattachment")
  public Integer getIEzsignsignatureattachmentCount() {
    return iEzsignsignatureattachmentCount;
  }
  public void setIEzsignsignatureattachmentCount(Integer iEzsignsignatureattachmentCount) {
    this.iEzsignsignatureattachmentCount = iEzsignsignatureattachmentCount;
  }

  /**
   * The value entered while signing Ezsignsignature of eEzsignsignatureType **City**, **FieldText** and **FieldTextarea**
   **/
  @ApiModelProperty(value = "The value entered while signing Ezsignsignature of eEzsignsignatureType **City**, **FieldText** and **FieldTextarea**")
  public String getSEzsignsignatureDescription() {
    return sEzsignsignatureDescription;
  }
  public void setSEzsignsignatureDescription(String sEzsignsignatureDescription) {
    this.sEzsignsignatureDescription = sEzsignsignatureDescription;
  }

  /**
   * The maximum length for the value in the Ezsignsignature  This can only be set if eEzsignsignatureType is **FieldText** or **FieldTextarea**
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(value = "The maximum length for the value in the Ezsignsignature  This can only be set if eEzsignsignatureType is **FieldText** or **FieldTextarea**")
  public Integer getIEzsignsignatureMaxlength() {
    return iEzsignsignatureMaxlength;
  }
  public void setIEzsignsignatureMaxlength(Integer iEzsignsignatureMaxlength) {
    this.iEzsignsignatureMaxlength = iEzsignsignatureMaxlength;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EnumTextvalidation getEEzsignsignatureTextvalidation() {
    return eEzsignsignatureTextvalidation;
  }
  public void setEEzsignsignatureTextvalidation(EnumTextvalidation eEzsignsignatureTextvalidation) {
    this.eEzsignsignatureTextvalidation = eEzsignsignatureTextvalidation;
  }

  /**
   * Description of validation rule. Show by signatory.
   **/
  @ApiModelProperty(value = "Description of validation rule. Show by signatory.")
  public String getSEzsignsignatureTextvalidationcustommessage() {
    return sEzsignsignatureTextvalidationcustommessage;
  }
  public void setSEzsignsignatureTextvalidationcustommessage(String sEzsignsignatureTextvalidationcustommessage) {
    this.sEzsignsignatureTextvalidationcustommessage = sEzsignsignatureTextvalidationcustommessage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsignsignatureDependencyrequirement getEEzsignsignatureDependencyrequirement() {
    return eEzsignsignatureDependencyrequirement;
  }
  public void setEEzsignsignatureDependencyrequirement(FieldEEzsignsignatureDependencyrequirement eEzsignsignatureDependencyrequirement) {
    this.eEzsignsignatureDependencyrequirement = eEzsignsignatureDependencyrequirement;
  }

  /**
   * The default value for the Ezsignsignature  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sCompany} | Company name | eZmax Solutions Inc. | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 |
   **/
  @ApiModelProperty(value = "The default value for the Ezsignsignature  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sCompany} | Company name | eZmax Solutions Inc. | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 |")
  public String getSEzsignsignatureDefaultvalue() {
    return sEzsignsignatureDefaultvalue;
  }
  public void setSEzsignsignatureDefaultvalue(String sEzsignsignatureDefaultvalue) {
    this.sEzsignsignatureDefaultvalue = sEzsignsignatureDefaultvalue;
  }

  /**
   * A regular expression to indicate what values are acceptable for the Ezsignsignature.  This can only be set if eEzsignsignatureType is **FieldText** or **FieldTextarea** and eEzsignsignatureTextvalidation is **Custom**
   **/
  @ApiModelProperty(value = "A regular expression to indicate what values are acceptable for the Ezsignsignature.  This can only be set if eEzsignsignatureType is **FieldText** or **FieldTextarea** and eEzsignsignatureTextvalidation is **Custom**")
  public String getSEzsignsignatureRegexp() {
    return sEzsignsignatureRegexp;
  }
  public void setSEzsignsignatureRegexp(String sEzsignsignatureRegexp) {
    this.sEzsignsignatureRegexp = sEzsignsignatureRegexp;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CustomContactNameResponse getObjContactName() {
    return objContactName;
  }
  public void setObjContactName(CustomContactNameResponse objContactName) {
    this.objContactName = objContactName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CustomContactNameResponse getObjContactNameDelegation() {
    return objContactNameDelegation;
  }
  public void setObjContactNameDelegation(CustomContactNameResponse objContactNameDelegation) {
    this.objContactNameDelegation = objContactNameDelegation;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public SignatureResponseCompound getObjSignature() {
    return objSignature;
  }
  public void setObjSignature(SignatureResponseCompound objSignature) {
    this.objSignature = objSignature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignatureResponse ezsignsignatureResponse = (EzsignsignatureResponse) o;
    return (this.pkiEzsignsignatureID == null ? ezsignsignatureResponse.pkiEzsignsignatureID == null : this.pkiEzsignsignatureID.equals(ezsignsignatureResponse.pkiEzsignsignatureID)) &&
        (this.fkiEzsigndocumentID == null ? ezsignsignatureResponse.fkiEzsigndocumentID == null : this.fkiEzsigndocumentID.equals(ezsignsignatureResponse.fkiEzsigndocumentID)) &&
        (this.fkiEzsignfoldersignerassociationID == null ? ezsignsignatureResponse.fkiEzsignfoldersignerassociationID == null : this.fkiEzsignfoldersignerassociationID.equals(ezsignsignatureResponse.fkiEzsignfoldersignerassociationID)) &&
        (this.fkiEzsignsigningreasonID == null ? ezsignsignatureResponse.fkiEzsignsigningreasonID == null : this.fkiEzsignsigningreasonID.equals(ezsignsignatureResponse.fkiEzsignsigningreasonID)) &&
        (this.fkiFontID == null ? ezsignsignatureResponse.fkiFontID == null : this.fkiFontID.equals(ezsignsignatureResponse.fkiFontID)) &&
        (this.sEzsignsigningreasonDescriptionX == null ? ezsignsignatureResponse.sEzsignsigningreasonDescriptionX == null : this.sEzsignsigningreasonDescriptionX.equals(ezsignsignatureResponse.sEzsignsigningreasonDescriptionX)) &&
        (this.iEzsignpagePagenumber == null ? ezsignsignatureResponse.iEzsignpagePagenumber == null : this.iEzsignpagePagenumber.equals(ezsignsignatureResponse.iEzsignpagePagenumber)) &&
        (this.iEzsignsignatureX == null ? ezsignsignatureResponse.iEzsignsignatureX == null : this.iEzsignsignatureX.equals(ezsignsignatureResponse.iEzsignsignatureX)) &&
        (this.iEzsignsignatureY == null ? ezsignsignatureResponse.iEzsignsignatureY == null : this.iEzsignsignatureY.equals(ezsignsignatureResponse.iEzsignsignatureY)) &&
        (this.iEzsignsignatureHeight == null ? ezsignsignatureResponse.iEzsignsignatureHeight == null : this.iEzsignsignatureHeight.equals(ezsignsignatureResponse.iEzsignsignatureHeight)) &&
        (this.iEzsignsignatureWidth == null ? ezsignsignatureResponse.iEzsignsignatureWidth == null : this.iEzsignsignatureWidth.equals(ezsignsignatureResponse.iEzsignsignatureWidth)) &&
        (this.iEzsignsignatureStep == null ? ezsignsignatureResponse.iEzsignsignatureStep == null : this.iEzsignsignatureStep.equals(ezsignsignatureResponse.iEzsignsignatureStep)) &&
        (this.iEzsignsignatureStepadjusted == null ? ezsignsignatureResponse.iEzsignsignatureStepadjusted == null : this.iEzsignsignatureStepadjusted.equals(ezsignsignatureResponse.iEzsignsignatureStepadjusted)) &&
        (this.eEzsignsignatureType == null ? ezsignsignatureResponse.eEzsignsignatureType == null : this.eEzsignsignatureType.equals(ezsignsignatureResponse.eEzsignsignatureType)) &&
        (this.tEzsignsignatureTooltip == null ? ezsignsignatureResponse.tEzsignsignatureTooltip == null : this.tEzsignsignatureTooltip.equals(ezsignsignatureResponse.tEzsignsignatureTooltip)) &&
        (this.eEzsignsignatureTooltipposition == null ? ezsignsignatureResponse.eEzsignsignatureTooltipposition == null : this.eEzsignsignatureTooltipposition.equals(ezsignsignatureResponse.eEzsignsignatureTooltipposition)) &&
        (this.eEzsignsignatureFont == null ? ezsignsignatureResponse.eEzsignsignatureFont == null : this.eEzsignsignatureFont.equals(ezsignsignatureResponse.eEzsignsignatureFont)) &&
        (this.iEzsignsignatureValidationstep == null ? ezsignsignatureResponse.iEzsignsignatureValidationstep == null : this.iEzsignsignatureValidationstep.equals(ezsignsignatureResponse.iEzsignsignatureValidationstep)) &&
        (this.sEzsignsignatureAttachmentdescription == null ? ezsignsignatureResponse.sEzsignsignatureAttachmentdescription == null : this.sEzsignsignatureAttachmentdescription.equals(ezsignsignatureResponse.sEzsignsignatureAttachmentdescription)) &&
        (this.eEzsignsignatureAttachmentnamesource == null ? ezsignsignatureResponse.eEzsignsignatureAttachmentnamesource == null : this.eEzsignsignatureAttachmentnamesource.equals(ezsignsignatureResponse.eEzsignsignatureAttachmentnamesource)) &&
        (this.eEzsignsignatureConsultationtrigger == null ? ezsignsignatureResponse.eEzsignsignatureConsultationtrigger == null : this.eEzsignsignatureConsultationtrigger.equals(ezsignsignatureResponse.eEzsignsignatureConsultationtrigger)) &&
        (this.bEzsignsignatureHandwritten == null ? ezsignsignatureResponse.bEzsignsignatureHandwritten == null : this.bEzsignsignatureHandwritten.equals(ezsignsignatureResponse.bEzsignsignatureHandwritten)) &&
        (this.bEzsignsignatureReason == null ? ezsignsignatureResponse.bEzsignsignatureReason == null : this.bEzsignsignatureReason.equals(ezsignsignatureResponse.bEzsignsignatureReason)) &&
        (this.bEzsignsignatureRequired == null ? ezsignsignatureResponse.bEzsignsignatureRequired == null : this.bEzsignsignatureRequired.equals(ezsignsignatureResponse.bEzsignsignatureRequired)) &&
        (this.fkiEzsignfoldersignerassociationIDValidation == null ? ezsignsignatureResponse.fkiEzsignfoldersignerassociationIDValidation == null : this.fkiEzsignfoldersignerassociationIDValidation.equals(ezsignsignatureResponse.fkiEzsignfoldersignerassociationIDValidation)) &&
        (this.dtEzsignsignatureDate == null ? ezsignsignatureResponse.dtEzsignsignatureDate == null : this.dtEzsignsignatureDate.equals(ezsignsignatureResponse.dtEzsignsignatureDate)) &&
        (this.iEzsignsignatureattachmentCount == null ? ezsignsignatureResponse.iEzsignsignatureattachmentCount == null : this.iEzsignsignatureattachmentCount.equals(ezsignsignatureResponse.iEzsignsignatureattachmentCount)) &&
        (this.sEzsignsignatureDescription == null ? ezsignsignatureResponse.sEzsignsignatureDescription == null : this.sEzsignsignatureDescription.equals(ezsignsignatureResponse.sEzsignsignatureDescription)) &&
        (this.iEzsignsignatureMaxlength == null ? ezsignsignatureResponse.iEzsignsignatureMaxlength == null : this.iEzsignsignatureMaxlength.equals(ezsignsignatureResponse.iEzsignsignatureMaxlength)) &&
        (this.eEzsignsignatureTextvalidation == null ? ezsignsignatureResponse.eEzsignsignatureTextvalidation == null : this.eEzsignsignatureTextvalidation.equals(ezsignsignatureResponse.eEzsignsignatureTextvalidation)) &&
        (this.sEzsignsignatureTextvalidationcustommessage == null ? ezsignsignatureResponse.sEzsignsignatureTextvalidationcustommessage == null : this.sEzsignsignatureTextvalidationcustommessage.equals(ezsignsignatureResponse.sEzsignsignatureTextvalidationcustommessage)) &&
        (this.eEzsignsignatureDependencyrequirement == null ? ezsignsignatureResponse.eEzsignsignatureDependencyrequirement == null : this.eEzsignsignatureDependencyrequirement.equals(ezsignsignatureResponse.eEzsignsignatureDependencyrequirement)) &&
        (this.sEzsignsignatureDefaultvalue == null ? ezsignsignatureResponse.sEzsignsignatureDefaultvalue == null : this.sEzsignsignatureDefaultvalue.equals(ezsignsignatureResponse.sEzsignsignatureDefaultvalue)) &&
        (this.sEzsignsignatureRegexp == null ? ezsignsignatureResponse.sEzsignsignatureRegexp == null : this.sEzsignsignatureRegexp.equals(ezsignsignatureResponse.sEzsignsignatureRegexp)) &&
        (this.objContactName == null ? ezsignsignatureResponse.objContactName == null : this.objContactName.equals(ezsignsignatureResponse.objContactName)) &&
        (this.objContactNameDelegation == null ? ezsignsignatureResponse.objContactNameDelegation == null : this.objContactNameDelegation.equals(ezsignsignatureResponse.objContactNameDelegation)) &&
        (this.objSignature == null ? ezsignsignatureResponse.objSignature == null : this.objSignature.equals(ezsignsignatureResponse.objSignature));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignsignatureID == null ? 0: this.pkiEzsignsignatureID.hashCode());
    result = 31 * result + (this.fkiEzsigndocumentID == null ? 0: this.fkiEzsigndocumentID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldersignerassociationID == null ? 0: this.fkiEzsignfoldersignerassociationID.hashCode());
    result = 31 * result + (this.fkiEzsignsigningreasonID == null ? 0: this.fkiEzsignsigningreasonID.hashCode());
    result = 31 * result + (this.fkiFontID == null ? 0: this.fkiFontID.hashCode());
    result = 31 * result + (this.sEzsignsigningreasonDescriptionX == null ? 0: this.sEzsignsigningreasonDescriptionX.hashCode());
    result = 31 * result + (this.iEzsignpagePagenumber == null ? 0: this.iEzsignpagePagenumber.hashCode());
    result = 31 * result + (this.iEzsignsignatureX == null ? 0: this.iEzsignsignatureX.hashCode());
    result = 31 * result + (this.iEzsignsignatureY == null ? 0: this.iEzsignsignatureY.hashCode());
    result = 31 * result + (this.iEzsignsignatureHeight == null ? 0: this.iEzsignsignatureHeight.hashCode());
    result = 31 * result + (this.iEzsignsignatureWidth == null ? 0: this.iEzsignsignatureWidth.hashCode());
    result = 31 * result + (this.iEzsignsignatureStep == null ? 0: this.iEzsignsignatureStep.hashCode());
    result = 31 * result + (this.iEzsignsignatureStepadjusted == null ? 0: this.iEzsignsignatureStepadjusted.hashCode());
    result = 31 * result + (this.eEzsignsignatureType == null ? 0: this.eEzsignsignatureType.hashCode());
    result = 31 * result + (this.tEzsignsignatureTooltip == null ? 0: this.tEzsignsignatureTooltip.hashCode());
    result = 31 * result + (this.eEzsignsignatureTooltipposition == null ? 0: this.eEzsignsignatureTooltipposition.hashCode());
    result = 31 * result + (this.eEzsignsignatureFont == null ? 0: this.eEzsignsignatureFont.hashCode());
    result = 31 * result + (this.iEzsignsignatureValidationstep == null ? 0: this.iEzsignsignatureValidationstep.hashCode());
    result = 31 * result + (this.sEzsignsignatureAttachmentdescription == null ? 0: this.sEzsignsignatureAttachmentdescription.hashCode());
    result = 31 * result + (this.eEzsignsignatureAttachmentnamesource == null ? 0: this.eEzsignsignatureAttachmentnamesource.hashCode());
    result = 31 * result + (this.eEzsignsignatureConsultationtrigger == null ? 0: this.eEzsignsignatureConsultationtrigger.hashCode());
    result = 31 * result + (this.bEzsignsignatureHandwritten == null ? 0: this.bEzsignsignatureHandwritten.hashCode());
    result = 31 * result + (this.bEzsignsignatureReason == null ? 0: this.bEzsignsignatureReason.hashCode());
    result = 31 * result + (this.bEzsignsignatureRequired == null ? 0: this.bEzsignsignatureRequired.hashCode());
    result = 31 * result + (this.fkiEzsignfoldersignerassociationIDValidation == null ? 0: this.fkiEzsignfoldersignerassociationIDValidation.hashCode());
    result = 31 * result + (this.dtEzsignsignatureDate == null ? 0: this.dtEzsignsignatureDate.hashCode());
    result = 31 * result + (this.iEzsignsignatureattachmentCount == null ? 0: this.iEzsignsignatureattachmentCount.hashCode());
    result = 31 * result + (this.sEzsignsignatureDescription == null ? 0: this.sEzsignsignatureDescription.hashCode());
    result = 31 * result + (this.iEzsignsignatureMaxlength == null ? 0: this.iEzsignsignatureMaxlength.hashCode());
    result = 31 * result + (this.eEzsignsignatureTextvalidation == null ? 0: this.eEzsignsignatureTextvalidation.hashCode());
    result = 31 * result + (this.sEzsignsignatureTextvalidationcustommessage == null ? 0: this.sEzsignsignatureTextvalidationcustommessage.hashCode());
    result = 31 * result + (this.eEzsignsignatureDependencyrequirement == null ? 0: this.eEzsignsignatureDependencyrequirement.hashCode());
    result = 31 * result + (this.sEzsignsignatureDefaultvalue == null ? 0: this.sEzsignsignatureDefaultvalue.hashCode());
    result = 31 * result + (this.sEzsignsignatureRegexp == null ? 0: this.sEzsignsignatureRegexp.hashCode());
    result = 31 * result + (this.objContactName == null ? 0: this.objContactName.hashCode());
    result = 31 * result + (this.objContactNameDelegation == null ? 0: this.objContactNameDelegation.hashCode());
    result = 31 * result + (this.objSignature == null ? 0: this.objSignature.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignatureResponse {\n");
    
    sb.append("  pkiEzsignsignatureID: ").append(pkiEzsignsignatureID).append("\n");
    sb.append("  fkiEzsigndocumentID: ").append(fkiEzsigndocumentID).append("\n");
    sb.append("  fkiEzsignfoldersignerassociationID: ").append(fkiEzsignfoldersignerassociationID).append("\n");
    sb.append("  fkiEzsignsigningreasonID: ").append(fkiEzsignsigningreasonID).append("\n");
    sb.append("  fkiFontID: ").append(fkiFontID).append("\n");
    sb.append("  sEzsignsigningreasonDescriptionX: ").append(sEzsignsigningreasonDescriptionX).append("\n");
    sb.append("  iEzsignpagePagenumber: ").append(iEzsignpagePagenumber).append("\n");
    sb.append("  iEzsignsignatureX: ").append(iEzsignsignatureX).append("\n");
    sb.append("  iEzsignsignatureY: ").append(iEzsignsignatureY).append("\n");
    sb.append("  iEzsignsignatureHeight: ").append(iEzsignsignatureHeight).append("\n");
    sb.append("  iEzsignsignatureWidth: ").append(iEzsignsignatureWidth).append("\n");
    sb.append("  iEzsignsignatureStep: ").append(iEzsignsignatureStep).append("\n");
    sb.append("  iEzsignsignatureStepadjusted: ").append(iEzsignsignatureStepadjusted).append("\n");
    sb.append("  eEzsignsignatureType: ").append(eEzsignsignatureType).append("\n");
    sb.append("  tEzsignsignatureTooltip: ").append(tEzsignsignatureTooltip).append("\n");
    sb.append("  eEzsignsignatureTooltipposition: ").append(eEzsignsignatureTooltipposition).append("\n");
    sb.append("  eEzsignsignatureFont: ").append(eEzsignsignatureFont).append("\n");
    sb.append("  iEzsignsignatureValidationstep: ").append(iEzsignsignatureValidationstep).append("\n");
    sb.append("  sEzsignsignatureAttachmentdescription: ").append(sEzsignsignatureAttachmentdescription).append("\n");
    sb.append("  eEzsignsignatureAttachmentnamesource: ").append(eEzsignsignatureAttachmentnamesource).append("\n");
    sb.append("  eEzsignsignatureConsultationtrigger: ").append(eEzsignsignatureConsultationtrigger).append("\n");
    sb.append("  bEzsignsignatureHandwritten: ").append(bEzsignsignatureHandwritten).append("\n");
    sb.append("  bEzsignsignatureReason: ").append(bEzsignsignatureReason).append("\n");
    sb.append("  bEzsignsignatureRequired: ").append(bEzsignsignatureRequired).append("\n");
    sb.append("  fkiEzsignfoldersignerassociationIDValidation: ").append(fkiEzsignfoldersignerassociationIDValidation).append("\n");
    sb.append("  dtEzsignsignatureDate: ").append(dtEzsignsignatureDate).append("\n");
    sb.append("  iEzsignsignatureattachmentCount: ").append(iEzsignsignatureattachmentCount).append("\n");
    sb.append("  sEzsignsignatureDescription: ").append(sEzsignsignatureDescription).append("\n");
    sb.append("  iEzsignsignatureMaxlength: ").append(iEzsignsignatureMaxlength).append("\n");
    sb.append("  eEzsignsignatureTextvalidation: ").append(eEzsignsignatureTextvalidation).append("\n");
    sb.append("  sEzsignsignatureTextvalidationcustommessage: ").append(sEzsignsignatureTextvalidationcustommessage).append("\n");
    sb.append("  eEzsignsignatureDependencyrequirement: ").append(eEzsignsignatureDependencyrequirement).append("\n");
    sb.append("  sEzsignsignatureDefaultvalue: ").append(sEzsignsignatureDefaultvalue).append("\n");
    sb.append("  sEzsignsignatureRegexp: ").append(sEzsignsignatureRegexp).append("\n");
    sb.append("  objContactName: ").append(objContactName).append("\n");
    sb.append("  objContactNameDelegation: ").append(objContactNameDelegation).append("\n");
    sb.append("  objSignature: ").append(objSignature).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
