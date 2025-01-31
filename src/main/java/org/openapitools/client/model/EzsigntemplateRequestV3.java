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

import org.openapitools.client.model.FieldEEzsigntemplateRecognition;
import org.openapitools.client.model.FieldEEzsigntemplateType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsigntemplate Object
 **/
@ApiModel(description = "A Ezsigntemplate Object")
public class EzsigntemplateRequestV3 {
  
  @SerializedName("pkiEzsigntemplateID")
  private Integer pkiEzsigntemplateID = null;
  @SerializedName("fkiEzsignfoldertypeID")
  private Integer fkiEzsignfoldertypeID = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("fkiEzdoctemplatedocumentID")
  private Integer fkiEzdoctemplatedocumentID = null;
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
  @SerializedName("eEzsigntemplateType")
  private FieldEEzsigntemplateType eEzsigntemplateType = null;

  /**
   * The unique ID of the Ezsigntemplate
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsigntemplate")
  public Integer getPkiEzsigntemplateID() {
    return pkiEzsigntemplateID;
  }
  public void setPkiEzsigntemplateID(Integer pkiEzsigntemplateID) {
    this.pkiEzsigntemplateID = pkiEzsigntemplateID;
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
   **/
  @ApiModelProperty(required = true, value = "")
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
    EzsigntemplateRequestV3 ezsigntemplateRequestV3 = (EzsigntemplateRequestV3) o;
    return (this.pkiEzsigntemplateID == null ? ezsigntemplateRequestV3.pkiEzsigntemplateID == null : this.pkiEzsigntemplateID.equals(ezsigntemplateRequestV3.pkiEzsigntemplateID)) &&
        (this.fkiEzsignfoldertypeID == null ? ezsigntemplateRequestV3.fkiEzsignfoldertypeID == null : this.fkiEzsignfoldertypeID.equals(ezsigntemplateRequestV3.fkiEzsignfoldertypeID)) &&
        (this.fkiLanguageID == null ? ezsigntemplateRequestV3.fkiLanguageID == null : this.fkiLanguageID.equals(ezsigntemplateRequestV3.fkiLanguageID)) &&
        (this.fkiEzdoctemplatedocumentID == null ? ezsigntemplateRequestV3.fkiEzdoctemplatedocumentID == null : this.fkiEzdoctemplatedocumentID.equals(ezsigntemplateRequestV3.fkiEzdoctemplatedocumentID)) &&
        (this.sEzsigntemplateDescription == null ? ezsigntemplateRequestV3.sEzsigntemplateDescription == null : this.sEzsigntemplateDescription.equals(ezsigntemplateRequestV3.sEzsigntemplateDescription)) &&
        (this.sEzsigntemplateExternaldescription == null ? ezsigntemplateRequestV3.sEzsigntemplateExternaldescription == null : this.sEzsigntemplateExternaldescription.equals(ezsigntemplateRequestV3.sEzsigntemplateExternaldescription)) &&
        (this.tEzsigntemplateComment == null ? ezsigntemplateRequestV3.tEzsigntemplateComment == null : this.tEzsigntemplateComment.equals(ezsigntemplateRequestV3.tEzsigntemplateComment)) &&
        (this.eEzsigntemplateRecognition == null ? ezsigntemplateRequestV3.eEzsigntemplateRecognition == null : this.eEzsigntemplateRecognition.equals(ezsigntemplateRequestV3.eEzsigntemplateRecognition)) &&
        (this.sEzsigntemplateFilenameregexp == null ? ezsigntemplateRequestV3.sEzsigntemplateFilenameregexp == null : this.sEzsigntemplateFilenameregexp.equals(ezsigntemplateRequestV3.sEzsigntemplateFilenameregexp)) &&
        (this.bEzsigntemplateAdminonly == null ? ezsigntemplateRequestV3.bEzsigntemplateAdminonly == null : this.bEzsigntemplateAdminonly.equals(ezsigntemplateRequestV3.bEzsigntemplateAdminonly)) &&
        (this.eEzsigntemplateType == null ? ezsigntemplateRequestV3.eEzsigntemplateType == null : this.eEzsigntemplateType.equals(ezsigntemplateRequestV3.eEzsigntemplateType));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplateID == null ? 0: this.pkiEzsigntemplateID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldertypeID == null ? 0: this.fkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.fkiEzdoctemplatedocumentID == null ? 0: this.fkiEzdoctemplatedocumentID.hashCode());
    result = 31 * result + (this.sEzsigntemplateDescription == null ? 0: this.sEzsigntemplateDescription.hashCode());
    result = 31 * result + (this.sEzsigntemplateExternaldescription == null ? 0: this.sEzsigntemplateExternaldescription.hashCode());
    result = 31 * result + (this.tEzsigntemplateComment == null ? 0: this.tEzsigntemplateComment.hashCode());
    result = 31 * result + (this.eEzsigntemplateRecognition == null ? 0: this.eEzsigntemplateRecognition.hashCode());
    result = 31 * result + (this.sEzsigntemplateFilenameregexp == null ? 0: this.sEzsigntemplateFilenameregexp.hashCode());
    result = 31 * result + (this.bEzsigntemplateAdminonly == null ? 0: this.bEzsigntemplateAdminonly.hashCode());
    result = 31 * result + (this.eEzsigntemplateType == null ? 0: this.eEzsigntemplateType.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplateRequestV3 {\n");
    
    sb.append("  pkiEzsigntemplateID: ").append(pkiEzsigntemplateID).append("\n");
    sb.append("  fkiEzsignfoldertypeID: ").append(fkiEzsignfoldertypeID).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  fkiEzdoctemplatedocumentID: ").append(fkiEzdoctemplatedocumentID).append("\n");
    sb.append("  sEzsigntemplateDescription: ").append(sEzsigntemplateDescription).append("\n");
    sb.append("  sEzsigntemplateExternaldescription: ").append(sEzsigntemplateExternaldescription).append("\n");
    sb.append("  tEzsigntemplateComment: ").append(tEzsigntemplateComment).append("\n");
    sb.append("  eEzsigntemplateRecognition: ").append(eEzsigntemplateRecognition).append("\n");
    sb.append("  sEzsigntemplateFilenameregexp: ").append(sEzsigntemplateFilenameregexp).append("\n");
    sb.append("  bEzsigntemplateAdminonly: ").append(bEzsigntemplateAdminonly).append("\n");
    sb.append("  eEzsigntemplateType: ").append(eEzsigntemplateType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
