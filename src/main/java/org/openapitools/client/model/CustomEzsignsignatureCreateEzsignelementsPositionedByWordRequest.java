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
import org.openapitools.client.model.CustomCreateEzsignelementsPositionedByWordRequest;
import org.openapitools.client.model.EnumTextvalidation;
import org.openapitools.client.model.EzsignelementdependencyRequest;
import org.openapitools.client.model.EzsignsignatureRequestCompound;
import org.openapitools.client.model.EzsignsignaturecustomdateRequest;
import org.openapitools.client.model.FieldEEzsignsignatureAttachmentnamesource;
import org.openapitools.client.model.FieldEEzsignsignatureConsultationtrigger;
import org.openapitools.client.model.FieldEEzsignsignatureDependencyrequirement;
import org.openapitools.client.model.FieldEEzsignsignatureFont;
import org.openapitools.client.model.FieldEEzsignsignatureTooltipposition;
import org.openapitools.client.model.FieldEEzsignsignatureType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignsignature Object in the context of an CreateEzsignelementsPositionedByWord path
 **/
@ApiModel(description = "An Ezsignsignature Object in the context of an CreateEzsignelementsPositionedByWord path")
public class CustomEzsignsignatureCreateEzsignelementsPositionedByWordRequest extends EzsignsignatureRequestCompound {
  
  @SerializedName("pkiEzsignsignatureID")
  private Integer pkiEzsignsignatureID = null;
  @SerializedName("fkiEzsignfoldersignerassociationID")
  private Integer fkiEzsignfoldersignerassociationID = null;
  @SerializedName("iEzsignpagePagenumber")
  private Integer iEzsignpagePagenumber = null;
  @SerializedName("iEzsignsignatureX")
  private Integer iEzsignsignatureX = null;
  @SerializedName("iEzsignsignatureY")
  private Integer iEzsignsignatureY = null;
  @SerializedName("iEzsignsignatureWidth")
  private Integer iEzsignsignatureWidth = null;
  @SerializedName("iEzsignsignatureHeight")
  private Integer iEzsignsignatureHeight = null;
  @SerializedName("iEzsignsignatureStep")
  private Integer iEzsignsignatureStep = null;
  @SerializedName("eEzsignsignatureType")
  private FieldEEzsignsignatureType eEzsignsignatureType = null;
  @SerializedName("fkiEzsigndocumentID")
  private Integer fkiEzsigndocumentID = null;
  @SerializedName("tEzsignsignatureTooltip")
  private String tEzsignsignatureTooltip = null;
  @SerializedName("eEzsignsignatureTooltipposition")
  private FieldEEzsignsignatureTooltipposition eEzsignsignatureTooltipposition = null;
  @SerializedName("eEzsignsignatureFont")
  private FieldEEzsignsignatureFont eEzsignsignatureFont = null;
  @SerializedName("fkiEzsignfoldersignerassociationIDValidation")
  private Integer fkiEzsignfoldersignerassociationIDValidation = null;
  @SerializedName("bEzsignsignatureHandwritten")
  private Boolean bEzsignsignatureHandwritten = null;
  @SerializedName("bEzsignsignatureReason")
  private Boolean bEzsignsignatureReason = null;
  @SerializedName("bEzsignsignatureRequired")
  private Boolean bEzsignsignatureRequired = null;
  @SerializedName("eEzsignsignatureAttachmentnamesource")
  private FieldEEzsignsignatureAttachmentnamesource eEzsignsignatureAttachmentnamesource = null;
  @SerializedName("sEzsignsignatureAttachmentdescription")
  private String sEzsignsignatureAttachmentdescription = null;
  @SerializedName("eEzsignsignatureConsultationtrigger")
  private FieldEEzsignsignatureConsultationtrigger eEzsignsignatureConsultationtrigger = null;
  @SerializedName("iEzsignsignatureValidationstep")
  private Integer iEzsignsignatureValidationstep = null;
  @SerializedName("iEzsignsignatureMaxlength")
  private Integer iEzsignsignatureMaxlength = null;
  @SerializedName("sEzsignsignatureDefaultvalue")
  private String sEzsignsignatureDefaultvalue = null;
  @SerializedName("eEzsignsignatureTextvalidation")
  private EnumTextvalidation eEzsignsignatureTextvalidation = null;
  @SerializedName("sEzsignsignatureTextvalidationcustommessage")
  private String sEzsignsignatureTextvalidationcustommessage = null;
  @SerializedName("sEzsignsignatureRegexp")
  private String sEzsignsignatureRegexp = null;
  @SerializedName("eEzsignsignatureDependencyrequirement")
  private FieldEEzsignsignatureDependencyrequirement eEzsignsignatureDependencyrequirement = null;
  @SerializedName("bEzsignsignatureCustomdate")
  private Boolean bEzsignsignatureCustomdate = null;
  @SerializedName("a_objEzsignsignaturecustomdate")
  private List<EzsignsignaturecustomdateRequestCompound> aObjEzsignsignaturecustomdate = null;
  @SerializedName("a_objEzsignelementdependency")
  private List<EzsignelementdependencyRequestCompound> aObjEzsignelementdependency = null;
  @SerializedName("objCreateezsignelementspositionedbyword")
  private CustomCreateEzsignelementsPositionedByWordRequest objCreateezsignelementspositionedbyword = null;

  /**
   * The unique ID of the Ezsignsignature
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignsignature")
  public Integer getPkiEzsignsignatureID() {
    return pkiEzsignsignatureID;
  }
  public void setPkiEzsignsignatureID(Integer pkiEzsignsignatureID) {
    this.pkiEzsignsignatureID = pkiEzsignsignatureID;
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
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsignsignatureType getEEzsignsignatureType() {
    return eEzsignsignatureType;
  }
  public void setEEzsignsignatureType(FieldEEzsignsignatureType eEzsignsignatureType) {
    this.eEzsignsignatureType = eEzsignsignatureType;
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
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsignsignatureAttachmentnamesource getEEzsignsignatureAttachmentnamesource() {
    return eEzsignsignatureAttachmentnamesource;
  }
  public void setEEzsignsignatureAttachmentnamesource(FieldEEzsignsignatureAttachmentnamesource eEzsignsignatureAttachmentnamesource) {
    this.eEzsignsignatureAttachmentnamesource = eEzsignsignatureAttachmentnamesource;
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
  public FieldEEzsignsignatureConsultationtrigger getEEzsignsignatureConsultationtrigger() {
    return eEzsignsignatureConsultationtrigger;
  }
  public void setEEzsignsignatureConsultationtrigger(FieldEEzsignsignatureConsultationtrigger eEzsignsignatureConsultationtrigger) {
    this.eEzsignsignatureConsultationtrigger = eEzsignsignatureConsultationtrigger;
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
  @ApiModelProperty(value = "")
  public FieldEEzsignsignatureDependencyrequirement getEEzsignsignatureDependencyrequirement() {
    return eEzsignsignatureDependencyrequirement;
  }
  public void setEEzsignsignatureDependencyrequirement(FieldEEzsignsignatureDependencyrequirement eEzsignsignatureDependencyrequirement) {
    this.eEzsignsignatureDependencyrequirement = eEzsignsignatureDependencyrequirement;
  }

  /**
   * Whether the Ezsignsignature has a custom date format or not. (Only possible when eEzsignsignatureType is **Name** or **Handwritten**)
   **/
  @ApiModelProperty(value = "Whether the Ezsignsignature has a custom date format or not. (Only possible when eEzsignsignatureType is **Name** or **Handwritten**)")
  public Boolean getBEzsignsignatureCustomdate() {
    return bEzsignsignatureCustomdate;
  }
  public void setBEzsignsignatureCustomdate(Boolean bEzsignsignatureCustomdate) {
    this.bEzsignsignatureCustomdate = bEzsignsignatureCustomdate;
  }

  /**
   * An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsignsignatureCustomdate is true.  Use an empty array if you don't want to have a date at all.
   **/
  @ApiModelProperty(value = "An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsignsignatureCustomdate is true.  Use an empty array if you don't want to have a date at all.")
  public List<EzsignsignaturecustomdateRequestCompound> getAObjEzsignsignaturecustomdate() {
    return aObjEzsignsignaturecustomdate;
  }
  public void setAObjEzsignsignaturecustomdate(List<EzsignsignaturecustomdateRequestCompound> aObjEzsignsignaturecustomdate) {
    this.aObjEzsignsignaturecustomdate = aObjEzsignsignaturecustomdate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<EzsignelementdependencyRequestCompound> getAObjEzsignelementdependency() {
    return aObjEzsignelementdependency;
  }
  public void setAObjEzsignelementdependency(List<EzsignelementdependencyRequestCompound> aObjEzsignelementdependency) {
    this.aObjEzsignelementdependency = aObjEzsignelementdependency;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CustomCreateEzsignelementsPositionedByWordRequest getObjCreateezsignelementspositionedbyword() {
    return objCreateezsignelementspositionedbyword;
  }
  public void setObjCreateezsignelementspositionedbyword(CustomCreateEzsignelementsPositionedByWordRequest objCreateezsignelementspositionedbyword) {
    this.objCreateezsignelementspositionedbyword = objCreateezsignelementspositionedbyword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEzsignsignatureCreateEzsignelementsPositionedByWordRequest customEzsignsignatureCreateEzsignelementsPositionedByWordRequest = (CustomEzsignsignatureCreateEzsignelementsPositionedByWordRequest) o;
    return (this.pkiEzsignsignatureID == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.pkiEzsignsignatureID == null : this.pkiEzsignsignatureID.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.pkiEzsignsignatureID)) &&
        (this.fkiEzsignfoldersignerassociationID == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.fkiEzsignfoldersignerassociationID == null : this.fkiEzsignfoldersignerassociationID.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.fkiEzsignfoldersignerassociationID)) &&
        (this.iEzsignpagePagenumber == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.iEzsignpagePagenumber == null : this.iEzsignpagePagenumber.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.iEzsignpagePagenumber)) &&
        (this.iEzsignsignatureX == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.iEzsignsignatureX == null : this.iEzsignsignatureX.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.iEzsignsignatureX)) &&
        (this.iEzsignsignatureY == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.iEzsignsignatureY == null : this.iEzsignsignatureY.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.iEzsignsignatureY)) &&
        (this.iEzsignsignatureWidth == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.iEzsignsignatureWidth == null : this.iEzsignsignatureWidth.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.iEzsignsignatureWidth)) &&
        (this.iEzsignsignatureHeight == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.iEzsignsignatureHeight == null : this.iEzsignsignatureHeight.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.iEzsignsignatureHeight)) &&
        (this.iEzsignsignatureStep == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.iEzsignsignatureStep == null : this.iEzsignsignatureStep.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.iEzsignsignatureStep)) &&
        (this.eEzsignsignatureType == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.eEzsignsignatureType == null : this.eEzsignsignatureType.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.eEzsignsignatureType)) &&
        (this.fkiEzsigndocumentID == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.fkiEzsigndocumentID == null : this.fkiEzsigndocumentID.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.fkiEzsigndocumentID)) &&
        (this.tEzsignsignatureTooltip == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.tEzsignsignatureTooltip == null : this.tEzsignsignatureTooltip.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.tEzsignsignatureTooltip)) &&
        (this.eEzsignsignatureTooltipposition == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.eEzsignsignatureTooltipposition == null : this.eEzsignsignatureTooltipposition.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.eEzsignsignatureTooltipposition)) &&
        (this.eEzsignsignatureFont == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.eEzsignsignatureFont == null : this.eEzsignsignatureFont.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.eEzsignsignatureFont)) &&
        (this.fkiEzsignfoldersignerassociationIDValidation == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.fkiEzsignfoldersignerassociationIDValidation == null : this.fkiEzsignfoldersignerassociationIDValidation.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.fkiEzsignfoldersignerassociationIDValidation)) &&
        (this.bEzsignsignatureHandwritten == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.bEzsignsignatureHandwritten == null : this.bEzsignsignatureHandwritten.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.bEzsignsignatureHandwritten)) &&
        (this.bEzsignsignatureReason == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.bEzsignsignatureReason == null : this.bEzsignsignatureReason.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.bEzsignsignatureReason)) &&
        (this.bEzsignsignatureRequired == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.bEzsignsignatureRequired == null : this.bEzsignsignatureRequired.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.bEzsignsignatureRequired)) &&
        (this.eEzsignsignatureAttachmentnamesource == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.eEzsignsignatureAttachmentnamesource == null : this.eEzsignsignatureAttachmentnamesource.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.eEzsignsignatureAttachmentnamesource)) &&
        (this.sEzsignsignatureAttachmentdescription == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.sEzsignsignatureAttachmentdescription == null : this.sEzsignsignatureAttachmentdescription.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.sEzsignsignatureAttachmentdescription)) &&
        (this.eEzsignsignatureConsultationtrigger == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.eEzsignsignatureConsultationtrigger == null : this.eEzsignsignatureConsultationtrigger.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.eEzsignsignatureConsultationtrigger)) &&
        (this.iEzsignsignatureValidationstep == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.iEzsignsignatureValidationstep == null : this.iEzsignsignatureValidationstep.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.iEzsignsignatureValidationstep)) &&
        (this.iEzsignsignatureMaxlength == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.iEzsignsignatureMaxlength == null : this.iEzsignsignatureMaxlength.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.iEzsignsignatureMaxlength)) &&
        (this.sEzsignsignatureDefaultvalue == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.sEzsignsignatureDefaultvalue == null : this.sEzsignsignatureDefaultvalue.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.sEzsignsignatureDefaultvalue)) &&
        (this.eEzsignsignatureTextvalidation == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.eEzsignsignatureTextvalidation == null : this.eEzsignsignatureTextvalidation.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.eEzsignsignatureTextvalidation)) &&
        (this.sEzsignsignatureTextvalidationcustommessage == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.sEzsignsignatureTextvalidationcustommessage == null : this.sEzsignsignatureTextvalidationcustommessage.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.sEzsignsignatureTextvalidationcustommessage)) &&
        (this.sEzsignsignatureRegexp == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.sEzsignsignatureRegexp == null : this.sEzsignsignatureRegexp.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.sEzsignsignatureRegexp)) &&
        (this.eEzsignsignatureDependencyrequirement == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.eEzsignsignatureDependencyrequirement == null : this.eEzsignsignatureDependencyrequirement.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.eEzsignsignatureDependencyrequirement)) &&
        (this.bEzsignsignatureCustomdate == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.bEzsignsignatureCustomdate == null : this.bEzsignsignatureCustomdate.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.bEzsignsignatureCustomdate)) &&
        (this.aObjEzsignsignaturecustomdate == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.aObjEzsignsignaturecustomdate == null : this.aObjEzsignsignaturecustomdate.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.aObjEzsignsignaturecustomdate)) &&
        (this.aObjEzsignelementdependency == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.aObjEzsignelementdependency == null : this.aObjEzsignelementdependency.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.aObjEzsignelementdependency)) &&
        (this.objCreateezsignelementspositionedbyword == null ? customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.objCreateezsignelementspositionedbyword == null : this.objCreateezsignelementspositionedbyword.equals(customEzsignsignatureCreateEzsignelementsPositionedByWordRequest.objCreateezsignelementspositionedbyword));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignsignatureID == null ? 0: this.pkiEzsignsignatureID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldersignerassociationID == null ? 0: this.fkiEzsignfoldersignerassociationID.hashCode());
    result = 31 * result + (this.iEzsignpagePagenumber == null ? 0: this.iEzsignpagePagenumber.hashCode());
    result = 31 * result + (this.iEzsignsignatureX == null ? 0: this.iEzsignsignatureX.hashCode());
    result = 31 * result + (this.iEzsignsignatureY == null ? 0: this.iEzsignsignatureY.hashCode());
    result = 31 * result + (this.iEzsignsignatureWidth == null ? 0: this.iEzsignsignatureWidth.hashCode());
    result = 31 * result + (this.iEzsignsignatureHeight == null ? 0: this.iEzsignsignatureHeight.hashCode());
    result = 31 * result + (this.iEzsignsignatureStep == null ? 0: this.iEzsignsignatureStep.hashCode());
    result = 31 * result + (this.eEzsignsignatureType == null ? 0: this.eEzsignsignatureType.hashCode());
    result = 31 * result + (this.fkiEzsigndocumentID == null ? 0: this.fkiEzsigndocumentID.hashCode());
    result = 31 * result + (this.tEzsignsignatureTooltip == null ? 0: this.tEzsignsignatureTooltip.hashCode());
    result = 31 * result + (this.eEzsignsignatureTooltipposition == null ? 0: this.eEzsignsignatureTooltipposition.hashCode());
    result = 31 * result + (this.eEzsignsignatureFont == null ? 0: this.eEzsignsignatureFont.hashCode());
    result = 31 * result + (this.fkiEzsignfoldersignerassociationIDValidation == null ? 0: this.fkiEzsignfoldersignerassociationIDValidation.hashCode());
    result = 31 * result + (this.bEzsignsignatureHandwritten == null ? 0: this.bEzsignsignatureHandwritten.hashCode());
    result = 31 * result + (this.bEzsignsignatureReason == null ? 0: this.bEzsignsignatureReason.hashCode());
    result = 31 * result + (this.bEzsignsignatureRequired == null ? 0: this.bEzsignsignatureRequired.hashCode());
    result = 31 * result + (this.eEzsignsignatureAttachmentnamesource == null ? 0: this.eEzsignsignatureAttachmentnamesource.hashCode());
    result = 31 * result + (this.sEzsignsignatureAttachmentdescription == null ? 0: this.sEzsignsignatureAttachmentdescription.hashCode());
    result = 31 * result + (this.eEzsignsignatureConsultationtrigger == null ? 0: this.eEzsignsignatureConsultationtrigger.hashCode());
    result = 31 * result + (this.iEzsignsignatureValidationstep == null ? 0: this.iEzsignsignatureValidationstep.hashCode());
    result = 31 * result + (this.iEzsignsignatureMaxlength == null ? 0: this.iEzsignsignatureMaxlength.hashCode());
    result = 31 * result + (this.sEzsignsignatureDefaultvalue == null ? 0: this.sEzsignsignatureDefaultvalue.hashCode());
    result = 31 * result + (this.eEzsignsignatureTextvalidation == null ? 0: this.eEzsignsignatureTextvalidation.hashCode());
    result = 31 * result + (this.sEzsignsignatureTextvalidationcustommessage == null ? 0: this.sEzsignsignatureTextvalidationcustommessage.hashCode());
    result = 31 * result + (this.sEzsignsignatureRegexp == null ? 0: this.sEzsignsignatureRegexp.hashCode());
    result = 31 * result + (this.eEzsignsignatureDependencyrequirement == null ? 0: this.eEzsignsignatureDependencyrequirement.hashCode());
    result = 31 * result + (this.bEzsignsignatureCustomdate == null ? 0: this.bEzsignsignatureCustomdate.hashCode());
    result = 31 * result + (this.aObjEzsignsignaturecustomdate == null ? 0: this.aObjEzsignsignaturecustomdate.hashCode());
    result = 31 * result + (this.aObjEzsignelementdependency == null ? 0: this.aObjEzsignelementdependency.hashCode());
    result = 31 * result + (this.objCreateezsignelementspositionedbyword == null ? 0: this.objCreateezsignelementspositionedbyword.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEzsignsignatureCreateEzsignelementsPositionedByWordRequest {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  pkiEzsignsignatureID: ").append(pkiEzsignsignatureID).append("\n");
    sb.append("  fkiEzsignfoldersignerassociationID: ").append(fkiEzsignfoldersignerassociationID).append("\n");
    sb.append("  iEzsignpagePagenumber: ").append(iEzsignpagePagenumber).append("\n");
    sb.append("  iEzsignsignatureX: ").append(iEzsignsignatureX).append("\n");
    sb.append("  iEzsignsignatureY: ").append(iEzsignsignatureY).append("\n");
    sb.append("  iEzsignsignatureWidth: ").append(iEzsignsignatureWidth).append("\n");
    sb.append("  iEzsignsignatureHeight: ").append(iEzsignsignatureHeight).append("\n");
    sb.append("  iEzsignsignatureStep: ").append(iEzsignsignatureStep).append("\n");
    sb.append("  eEzsignsignatureType: ").append(eEzsignsignatureType).append("\n");
    sb.append("  fkiEzsigndocumentID: ").append(fkiEzsigndocumentID).append("\n");
    sb.append("  tEzsignsignatureTooltip: ").append(tEzsignsignatureTooltip).append("\n");
    sb.append("  eEzsignsignatureTooltipposition: ").append(eEzsignsignatureTooltipposition).append("\n");
    sb.append("  eEzsignsignatureFont: ").append(eEzsignsignatureFont).append("\n");
    sb.append("  fkiEzsignfoldersignerassociationIDValidation: ").append(fkiEzsignfoldersignerassociationIDValidation).append("\n");
    sb.append("  bEzsignsignatureHandwritten: ").append(bEzsignsignatureHandwritten).append("\n");
    sb.append("  bEzsignsignatureReason: ").append(bEzsignsignatureReason).append("\n");
    sb.append("  bEzsignsignatureRequired: ").append(bEzsignsignatureRequired).append("\n");
    sb.append("  eEzsignsignatureAttachmentnamesource: ").append(eEzsignsignatureAttachmentnamesource).append("\n");
    sb.append("  sEzsignsignatureAttachmentdescription: ").append(sEzsignsignatureAttachmentdescription).append("\n");
    sb.append("  eEzsignsignatureConsultationtrigger: ").append(eEzsignsignatureConsultationtrigger).append("\n");
    sb.append("  iEzsignsignatureValidationstep: ").append(iEzsignsignatureValidationstep).append("\n");
    sb.append("  iEzsignsignatureMaxlength: ").append(iEzsignsignatureMaxlength).append("\n");
    sb.append("  sEzsignsignatureDefaultvalue: ").append(sEzsignsignatureDefaultvalue).append("\n");
    sb.append("  eEzsignsignatureTextvalidation: ").append(eEzsignsignatureTextvalidation).append("\n");
    sb.append("  sEzsignsignatureTextvalidationcustommessage: ").append(sEzsignsignatureTextvalidationcustommessage).append("\n");
    sb.append("  sEzsignsignatureRegexp: ").append(sEzsignsignatureRegexp).append("\n");
    sb.append("  eEzsignsignatureDependencyrequirement: ").append(eEzsignsignatureDependencyrequirement).append("\n");
    sb.append("  bEzsignsignatureCustomdate: ").append(bEzsignsignatureCustomdate).append("\n");
    sb.append("  aObjEzsignsignaturecustomdate: ").append(aObjEzsignsignaturecustomdate).append("\n");
    sb.append("  aObjEzsignelementdependency: ").append(aObjEzsignelementdependency).append("\n");
    sb.append("  objCreateezsignelementspositionedbyword: ").append(objCreateezsignelementspositionedbyword).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
