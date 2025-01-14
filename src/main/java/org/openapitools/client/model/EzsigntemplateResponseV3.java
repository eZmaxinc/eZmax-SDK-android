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

import org.openapitools.client.model.CommonAudit;
import org.openapitools.client.model.FieldEEzsigntemplateRecognition;
import org.openapitools.client.model.FieldEEzsigntemplateType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsigntemplate Object
 **/
@ApiModel(description = "A Ezsigntemplate Object")
public class EzsigntemplateResponseV3 {
  
  @SerializedName("pkiEzsigntemplateID")
  private Integer pkiEzsigntemplateID = null;
  @SerializedName("fkiEzsigntemplatedocumentID")
  private Integer fkiEzsigntemplatedocumentID = null;
  @SerializedName("fkiEzsignfoldertypeID")
  private Integer fkiEzsignfoldertypeID = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("fkiEzdoctemplatedocumentID")
  private Integer fkiEzdoctemplatedocumentID = null;
  @SerializedName("sEzdoctemplatedocumentNameX")
  private String sEzdoctemplatedocumentNameX = null;
  @SerializedName("sLanguageNameX")
  private String sLanguageNameX = null;
  @SerializedName("sEzsigntemplateDescription")
  private String sEzsigntemplateDescription = null;
  @SerializedName("sEzsigntemplateExternaldescription")
  private String sEzsigntemplateExternaldescription = null;
  @SerializedName("tEzsigntemplateComment")
  private String tEzsigntemplateComment = null;
  @SerializedName("eEzsigntemplateRecognition")
  private FieldEEzsigntemplateRecognition eEzsigntemplateRecognition = null;
  @SerializedName("sEzsigntemplateFilenameregexp")
  private String sEzsigntemplateFilenameregexp = null;
  @SerializedName("bEzsigntemplateAdminonly")
  private Boolean bEzsigntemplateAdminonly = null;
  @SerializedName("sEzsignfoldertypeNameX")
  private String sEzsignfoldertypeNameX = null;
  @SerializedName("objAudit")
  private CommonAudit objAudit = null;
  @SerializedName("bEzsigntemplateEditallowed")
  private Boolean bEzsigntemplateEditallowed = null;
  @SerializedName("eEzsigntemplateType")
  private FieldEEzsigntemplateType eEzsigntemplateType = null;

  /**
   * The unique ID of the Ezsigntemplate
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplate")
  public Integer getPkiEzsigntemplateID() {
    return pkiEzsigntemplateID;
  }
  public void setPkiEzsigntemplateID(Integer pkiEzsigntemplateID) {
    this.pkiEzsigntemplateID = pkiEzsigntemplateID;
  }

  /**
   * The unique ID of the Ezsigntemplatedocument
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsigntemplatedocument")
  public Integer getFkiEzsigntemplatedocumentID() {
    return fkiEzsigntemplatedocumentID;
  }
  public void setFkiEzsigntemplatedocumentID(Integer fkiEzsigntemplatedocumentID) {
    this.fkiEzsigntemplatedocumentID = fkiEzsigntemplatedocumentID;
  }

  /**
   * The unique ID of the Ezsignfoldertype.
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignfoldertype.")
  public Integer getFkiEzsignfoldertypeID() {
    return fkiEzsignfoldertypeID;
  }
  public void setFkiEzsignfoldertypeID(Integer fkiEzsignfoldertypeID) {
    this.fkiEzsignfoldertypeID = fkiEzsignfoldertypeID;
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
   * The unique ID of the Ezdoctemplatedocument
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(value = "The unique ID of the Ezdoctemplatedocument")
  public Integer getFkiEzdoctemplatedocumentID() {
    return fkiEzdoctemplatedocumentID;
  }
  public void setFkiEzdoctemplatedocumentID(Integer fkiEzdoctemplatedocumentID) {
    this.fkiEzdoctemplatedocumentID = fkiEzdoctemplatedocumentID;
  }

  /**
   * The name of the Ezdoctemplatedocument in the language of the requester
   **/
  @ApiModelProperty(value = "The name of the Ezdoctemplatedocument in the language of the requester")
  public String getSEzdoctemplatedocumentNameX() {
    return sEzdoctemplatedocumentNameX;
  }
  public void setSEzdoctemplatedocumentNameX(String sEzdoctemplatedocumentNameX) {
    this.sEzdoctemplatedocumentNameX = sEzdoctemplatedocumentNameX;
  }

  /**
   * The Name of the Language in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The Name of the Language in the language of the requester")
  public String getSLanguageNameX() {
    return sLanguageNameX;
  }
  public void setSLanguageNameX(String sLanguageNameX) {
    this.sLanguageNameX = sLanguageNameX;
  }

  /**
   * The description of the Ezsigntemplate
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezsigntemplate")
  public String getSEzsigntemplateDescription() {
    return sEzsigntemplateDescription;
  }
  public void setSEzsigntemplateDescription(String sEzsigntemplateDescription) {
    this.sEzsigntemplateDescription = sEzsigntemplateDescription;
  }

  /**
   * The external description of the Ezsigntemplate
   **/
  @ApiModelProperty(value = "The external description of the Ezsigntemplate")
  public String getSEzsigntemplateExternaldescription() {
    return sEzsigntemplateExternaldescription;
  }
  public void setSEzsigntemplateExternaldescription(String sEzsigntemplateExternaldescription) {
    this.sEzsigntemplateExternaldescription = sEzsigntemplateExternaldescription;
  }

  /**
   * The comment of the Ezsigntemplate
   **/
  @ApiModelProperty(value = "The comment of the Ezsigntemplate")
  public String getTEzsigntemplateComment() {
    return tEzsigntemplateComment;
  }
  public void setTEzsigntemplateComment(String tEzsigntemplateComment) {
    this.tEzsigntemplateComment = tEzsigntemplateComment;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsigntemplateRecognition getEEzsigntemplateRecognition() {
    return eEzsigntemplateRecognition;
  }
  public void setEEzsigntemplateRecognition(FieldEEzsigntemplateRecognition eEzsigntemplateRecognition) {
    this.eEzsigntemplateRecognition = eEzsigntemplateRecognition;
  }

  /**
   * The filename regexp of the Ezsigntemplate.
   **/
  @ApiModelProperty(value = "The filename regexp of the Ezsigntemplate.")
  public String getSEzsigntemplateFilenameregexp() {
    return sEzsigntemplateFilenameregexp;
  }
  public void setSEzsigntemplateFilenameregexp(String sEzsigntemplateFilenameregexp) {
    this.sEzsigntemplateFilenameregexp = sEzsigntemplateFilenameregexp;
  }

  /**
   * Whether the Ezsigntemplate can be accessed by admin users only (eUserType=Normal)
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezsigntemplate can be accessed by admin users only (eUserType=Normal)")
  public Boolean getBEzsigntemplateAdminonly() {
    return bEzsigntemplateAdminonly;
  }
  public void setBEzsigntemplateAdminonly(Boolean bEzsigntemplateAdminonly) {
    this.bEzsigntemplateAdminonly = bEzsigntemplateAdminonly;
  }

  /**
   * The name of the Ezsignfoldertype in the language of the requester
   **/
  @ApiModelProperty(value = "The name of the Ezsignfoldertype in the language of the requester")
  public String getSEzsignfoldertypeNameX() {
    return sEzsignfoldertypeNameX;
  }
  public void setSEzsignfoldertypeNameX(String sEzsignfoldertypeNameX) {
    this.sEzsignfoldertypeNameX = sEzsignfoldertypeNameX;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CommonAudit getObjAudit() {
    return objAudit;
  }
  public void setObjAudit(CommonAudit objAudit) {
    this.objAudit = objAudit;
  }

  /**
   * Whether the Ezsigntemplate if allowed to edit or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezsigntemplate if allowed to edit or not")
  public Boolean getBEzsigntemplateEditallowed() {
    return bEzsigntemplateEditallowed;
  }
  public void setBEzsigntemplateEditallowed(Boolean bEzsigntemplateEditallowed) {
    this.bEzsigntemplateEditallowed = bEzsigntemplateEditallowed;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsigntemplateType getEEzsigntemplateType() {
    return eEzsigntemplateType;
  }
  public void setEEzsigntemplateType(FieldEEzsigntemplateType eEzsigntemplateType) {
    this.eEzsigntemplateType = eEzsigntemplateType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplateResponseV3 ezsigntemplateResponseV3 = (EzsigntemplateResponseV3) o;
    return (this.pkiEzsigntemplateID == null ? ezsigntemplateResponseV3.pkiEzsigntemplateID == null : this.pkiEzsigntemplateID.equals(ezsigntemplateResponseV3.pkiEzsigntemplateID)) &&
        (this.fkiEzsigntemplatedocumentID == null ? ezsigntemplateResponseV3.fkiEzsigntemplatedocumentID == null : this.fkiEzsigntemplatedocumentID.equals(ezsigntemplateResponseV3.fkiEzsigntemplatedocumentID)) &&
        (this.fkiEzsignfoldertypeID == null ? ezsigntemplateResponseV3.fkiEzsignfoldertypeID == null : this.fkiEzsignfoldertypeID.equals(ezsigntemplateResponseV3.fkiEzsignfoldertypeID)) &&
        (this.fkiLanguageID == null ? ezsigntemplateResponseV3.fkiLanguageID == null : this.fkiLanguageID.equals(ezsigntemplateResponseV3.fkiLanguageID)) &&
        (this.fkiEzdoctemplatedocumentID == null ? ezsigntemplateResponseV3.fkiEzdoctemplatedocumentID == null : this.fkiEzdoctemplatedocumentID.equals(ezsigntemplateResponseV3.fkiEzdoctemplatedocumentID)) &&
        (this.sEzdoctemplatedocumentNameX == null ? ezsigntemplateResponseV3.sEzdoctemplatedocumentNameX == null : this.sEzdoctemplatedocumentNameX.equals(ezsigntemplateResponseV3.sEzdoctemplatedocumentNameX)) &&
        (this.sLanguageNameX == null ? ezsigntemplateResponseV3.sLanguageNameX == null : this.sLanguageNameX.equals(ezsigntemplateResponseV3.sLanguageNameX)) &&
        (this.sEzsigntemplateDescription == null ? ezsigntemplateResponseV3.sEzsigntemplateDescription == null : this.sEzsigntemplateDescription.equals(ezsigntemplateResponseV3.sEzsigntemplateDescription)) &&
        (this.sEzsigntemplateExternaldescription == null ? ezsigntemplateResponseV3.sEzsigntemplateExternaldescription == null : this.sEzsigntemplateExternaldescription.equals(ezsigntemplateResponseV3.sEzsigntemplateExternaldescription)) &&
        (this.tEzsigntemplateComment == null ? ezsigntemplateResponseV3.tEzsigntemplateComment == null : this.tEzsigntemplateComment.equals(ezsigntemplateResponseV3.tEzsigntemplateComment)) &&
        (this.eEzsigntemplateRecognition == null ? ezsigntemplateResponseV3.eEzsigntemplateRecognition == null : this.eEzsigntemplateRecognition.equals(ezsigntemplateResponseV3.eEzsigntemplateRecognition)) &&
        (this.sEzsigntemplateFilenameregexp == null ? ezsigntemplateResponseV3.sEzsigntemplateFilenameregexp == null : this.sEzsigntemplateFilenameregexp.equals(ezsigntemplateResponseV3.sEzsigntemplateFilenameregexp)) &&
        (this.bEzsigntemplateAdminonly == null ? ezsigntemplateResponseV3.bEzsigntemplateAdminonly == null : this.bEzsigntemplateAdminonly.equals(ezsigntemplateResponseV3.bEzsigntemplateAdminonly)) &&
        (this.sEzsignfoldertypeNameX == null ? ezsigntemplateResponseV3.sEzsignfoldertypeNameX == null : this.sEzsignfoldertypeNameX.equals(ezsigntemplateResponseV3.sEzsignfoldertypeNameX)) &&
        (this.objAudit == null ? ezsigntemplateResponseV3.objAudit == null : this.objAudit.equals(ezsigntemplateResponseV3.objAudit)) &&
        (this.bEzsigntemplateEditallowed == null ? ezsigntemplateResponseV3.bEzsigntemplateEditallowed == null : this.bEzsigntemplateEditallowed.equals(ezsigntemplateResponseV3.bEzsigntemplateEditallowed)) &&
        (this.eEzsigntemplateType == null ? ezsigntemplateResponseV3.eEzsigntemplateType == null : this.eEzsigntemplateType.equals(ezsigntemplateResponseV3.eEzsigntemplateType));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplateID == null ? 0: this.pkiEzsigntemplateID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplatedocumentID == null ? 0: this.fkiEzsigntemplatedocumentID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldertypeID == null ? 0: this.fkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.fkiEzdoctemplatedocumentID == null ? 0: this.fkiEzdoctemplatedocumentID.hashCode());
    result = 31 * result + (this.sEzdoctemplatedocumentNameX == null ? 0: this.sEzdoctemplatedocumentNameX.hashCode());
    result = 31 * result + (this.sLanguageNameX == null ? 0: this.sLanguageNameX.hashCode());
    result = 31 * result + (this.sEzsigntemplateDescription == null ? 0: this.sEzsigntemplateDescription.hashCode());
    result = 31 * result + (this.sEzsigntemplateExternaldescription == null ? 0: this.sEzsigntemplateExternaldescription.hashCode());
    result = 31 * result + (this.tEzsigntemplateComment == null ? 0: this.tEzsigntemplateComment.hashCode());
    result = 31 * result + (this.eEzsigntemplateRecognition == null ? 0: this.eEzsigntemplateRecognition.hashCode());
    result = 31 * result + (this.sEzsigntemplateFilenameregexp == null ? 0: this.sEzsigntemplateFilenameregexp.hashCode());
    result = 31 * result + (this.bEzsigntemplateAdminonly == null ? 0: this.bEzsigntemplateAdminonly.hashCode());
    result = 31 * result + (this.sEzsignfoldertypeNameX == null ? 0: this.sEzsignfoldertypeNameX.hashCode());
    result = 31 * result + (this.objAudit == null ? 0: this.objAudit.hashCode());
    result = 31 * result + (this.bEzsigntemplateEditallowed == null ? 0: this.bEzsigntemplateEditallowed.hashCode());
    result = 31 * result + (this.eEzsigntemplateType == null ? 0: this.eEzsigntemplateType.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplateResponseV3 {\n");
    
    sb.append("  pkiEzsigntemplateID: ").append(pkiEzsigntemplateID).append("\n");
    sb.append("  fkiEzsigntemplatedocumentID: ").append(fkiEzsigntemplatedocumentID).append("\n");
    sb.append("  fkiEzsignfoldertypeID: ").append(fkiEzsignfoldertypeID).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  fkiEzdoctemplatedocumentID: ").append(fkiEzdoctemplatedocumentID).append("\n");
    sb.append("  sEzdoctemplatedocumentNameX: ").append(sEzdoctemplatedocumentNameX).append("\n");
    sb.append("  sLanguageNameX: ").append(sLanguageNameX).append("\n");
    sb.append("  sEzsigntemplateDescription: ").append(sEzsigntemplateDescription).append("\n");
    sb.append("  sEzsigntemplateExternaldescription: ").append(sEzsigntemplateExternaldescription).append("\n");
    sb.append("  tEzsigntemplateComment: ").append(tEzsigntemplateComment).append("\n");
    sb.append("  eEzsigntemplateRecognition: ").append(eEzsigntemplateRecognition).append("\n");
    sb.append("  sEzsigntemplateFilenameregexp: ").append(sEzsigntemplateFilenameregexp).append("\n");
    sb.append("  bEzsigntemplateAdminonly: ").append(bEzsigntemplateAdminonly).append("\n");
    sb.append("  sEzsignfoldertypeNameX: ").append(sEzsignfoldertypeNameX).append("\n");
    sb.append("  objAudit: ").append(objAudit).append("\n");
    sb.append("  bEzsigntemplateEditallowed: ").append(bEzsigntemplateEditallowed).append("\n");
    sb.append("  eEzsigntemplateType: ").append(eEzsigntemplateType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
