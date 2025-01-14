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

import org.openapitools.client.model.FieldEEzdoctemplatedocumentPrivacylevel;
import org.openapitools.client.model.MultilingualEzdoctemplatedocumentName;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezdoctemplatedocument Object
 **/
@ApiModel(description = "A Ezdoctemplatedocument Object")
public class EzdoctemplatedocumentResponse {
  
  @SerializedName("pkiEzdoctemplatedocumentID")
  private Integer pkiEzdoctemplatedocumentID = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("fkiEzsignfoldertypeID")
  private Integer fkiEzsignfoldertypeID = null;
  @SerializedName("fkiEzdoctemplatetypeID")
  private Integer fkiEzdoctemplatetypeID = null;
  @SerializedName("fkiEzdoctemplatefieldtypecategoryID")
  private Integer fkiEzdoctemplatefieldtypecategoryID = null;
  @SerializedName("eEzdoctemplatedocumentPrivacylevel")
  private FieldEEzdoctemplatedocumentPrivacylevel eEzdoctemplatedocumentPrivacylevel = null;
  @SerializedName("bEzdoctemplatedocumentIsactive")
  private Boolean bEzdoctemplatedocumentIsactive = null;
  @SerializedName("objEzdoctemplatedocumentName")
  private MultilingualEzdoctemplatedocumentName objEzdoctemplatedocumentName = null;
  @SerializedName("sEzdoctemplatedocumentNameX")
  private String sEzdoctemplatedocumentNameX = null;
  @SerializedName("sEzsignfoldertypeNameX")
  private String sEzsignfoldertypeNameX = null;
  @SerializedName("sEzdoctemplatefieldtypecategoryDescriptionX")
  private String sEzdoctemplatefieldtypecategoryDescriptionX = null;
  @SerializedName("sEzdoctemplatetypeDescriptionX")
  private String sEzdoctemplatetypeDescriptionX = null;

  /**
   * The unique ID of the Ezdoctemplatedocument
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezdoctemplatedocument")
  public Integer getPkiEzdoctemplatedocumentID() {
    return pkiEzdoctemplatedocumentID;
  }
  public void setPkiEzdoctemplatedocumentID(Integer pkiEzdoctemplatedocumentID) {
    this.pkiEzdoctemplatedocumentID = pkiEzdoctemplatedocumentID;
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
   * The unique ID of the Ezdoctemplatetype
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezdoctemplatetype")
  public Integer getFkiEzdoctemplatetypeID() {
    return fkiEzdoctemplatetypeID;
  }
  public void setFkiEzdoctemplatetypeID(Integer fkiEzdoctemplatetypeID) {
    this.fkiEzdoctemplatetypeID = fkiEzdoctemplatetypeID;
  }

  /**
   * The unique ID of the Ezdoctemplatefieldtypecategory
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezdoctemplatefieldtypecategory")
  public Integer getFkiEzdoctemplatefieldtypecategoryID() {
    return fkiEzdoctemplatefieldtypecategoryID;
  }
  public void setFkiEzdoctemplatefieldtypecategoryID(Integer fkiEzdoctemplatefieldtypecategoryID) {
    this.fkiEzdoctemplatefieldtypecategoryID = fkiEzdoctemplatefieldtypecategoryID;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzdoctemplatedocumentPrivacylevel getEEzdoctemplatedocumentPrivacylevel() {
    return eEzdoctemplatedocumentPrivacylevel;
  }
  public void setEEzdoctemplatedocumentPrivacylevel(FieldEEzdoctemplatedocumentPrivacylevel eEzdoctemplatedocumentPrivacylevel) {
    this.eEzdoctemplatedocumentPrivacylevel = eEzdoctemplatedocumentPrivacylevel;
  }

  /**
   * Whether the ezdoctemplatedocument is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the ezdoctemplatedocument is active or not")
  public Boolean getBEzdoctemplatedocumentIsactive() {
    return bEzdoctemplatedocumentIsactive;
  }
  public void setBEzdoctemplatedocumentIsactive(Boolean bEzdoctemplatedocumentIsactive) {
    this.bEzdoctemplatedocumentIsactive = bEzdoctemplatedocumentIsactive;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public MultilingualEzdoctemplatedocumentName getObjEzdoctemplatedocumentName() {
    return objEzdoctemplatedocumentName;
  }
  public void setObjEzdoctemplatedocumentName(MultilingualEzdoctemplatedocumentName objEzdoctemplatedocumentName) {
    this.objEzdoctemplatedocumentName = objEzdoctemplatedocumentName;
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
   * The description of the Ezdoctemplatefieldtypecategory in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezdoctemplatefieldtypecategory in the language of the requester")
  public String getSEzdoctemplatefieldtypecategoryDescriptionX() {
    return sEzdoctemplatefieldtypecategoryDescriptionX;
  }
  public void setSEzdoctemplatefieldtypecategoryDescriptionX(String sEzdoctemplatefieldtypecategoryDescriptionX) {
    this.sEzdoctemplatefieldtypecategoryDescriptionX = sEzdoctemplatefieldtypecategoryDescriptionX;
  }

  /**
   * The description of the Ezdoctemplatetype in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezdoctemplatetype in the language of the requester")
  public String getSEzdoctemplatetypeDescriptionX() {
    return sEzdoctemplatetypeDescriptionX;
  }
  public void setSEzdoctemplatetypeDescriptionX(String sEzdoctemplatetypeDescriptionX) {
    this.sEzdoctemplatetypeDescriptionX = sEzdoctemplatetypeDescriptionX;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzdoctemplatedocumentResponse ezdoctemplatedocumentResponse = (EzdoctemplatedocumentResponse) o;
    return (this.pkiEzdoctemplatedocumentID == null ? ezdoctemplatedocumentResponse.pkiEzdoctemplatedocumentID == null : this.pkiEzdoctemplatedocumentID.equals(ezdoctemplatedocumentResponse.pkiEzdoctemplatedocumentID)) &&
        (this.fkiLanguageID == null ? ezdoctemplatedocumentResponse.fkiLanguageID == null : this.fkiLanguageID.equals(ezdoctemplatedocumentResponse.fkiLanguageID)) &&
        (this.fkiEzsignfoldertypeID == null ? ezdoctemplatedocumentResponse.fkiEzsignfoldertypeID == null : this.fkiEzsignfoldertypeID.equals(ezdoctemplatedocumentResponse.fkiEzsignfoldertypeID)) &&
        (this.fkiEzdoctemplatetypeID == null ? ezdoctemplatedocumentResponse.fkiEzdoctemplatetypeID == null : this.fkiEzdoctemplatetypeID.equals(ezdoctemplatedocumentResponse.fkiEzdoctemplatetypeID)) &&
        (this.fkiEzdoctemplatefieldtypecategoryID == null ? ezdoctemplatedocumentResponse.fkiEzdoctemplatefieldtypecategoryID == null : this.fkiEzdoctemplatefieldtypecategoryID.equals(ezdoctemplatedocumentResponse.fkiEzdoctemplatefieldtypecategoryID)) &&
        (this.eEzdoctemplatedocumentPrivacylevel == null ? ezdoctemplatedocumentResponse.eEzdoctemplatedocumentPrivacylevel == null : this.eEzdoctemplatedocumentPrivacylevel.equals(ezdoctemplatedocumentResponse.eEzdoctemplatedocumentPrivacylevel)) &&
        (this.bEzdoctemplatedocumentIsactive == null ? ezdoctemplatedocumentResponse.bEzdoctemplatedocumentIsactive == null : this.bEzdoctemplatedocumentIsactive.equals(ezdoctemplatedocumentResponse.bEzdoctemplatedocumentIsactive)) &&
        (this.objEzdoctemplatedocumentName == null ? ezdoctemplatedocumentResponse.objEzdoctemplatedocumentName == null : this.objEzdoctemplatedocumentName.equals(ezdoctemplatedocumentResponse.objEzdoctemplatedocumentName)) &&
        (this.sEzdoctemplatedocumentNameX == null ? ezdoctemplatedocumentResponse.sEzdoctemplatedocumentNameX == null : this.sEzdoctemplatedocumentNameX.equals(ezdoctemplatedocumentResponse.sEzdoctemplatedocumentNameX)) &&
        (this.sEzsignfoldertypeNameX == null ? ezdoctemplatedocumentResponse.sEzsignfoldertypeNameX == null : this.sEzsignfoldertypeNameX.equals(ezdoctemplatedocumentResponse.sEzsignfoldertypeNameX)) &&
        (this.sEzdoctemplatefieldtypecategoryDescriptionX == null ? ezdoctemplatedocumentResponse.sEzdoctemplatefieldtypecategoryDescriptionX == null : this.sEzdoctemplatefieldtypecategoryDescriptionX.equals(ezdoctemplatedocumentResponse.sEzdoctemplatefieldtypecategoryDescriptionX)) &&
        (this.sEzdoctemplatetypeDescriptionX == null ? ezdoctemplatedocumentResponse.sEzdoctemplatetypeDescriptionX == null : this.sEzdoctemplatetypeDescriptionX.equals(ezdoctemplatedocumentResponse.sEzdoctemplatetypeDescriptionX));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzdoctemplatedocumentID == null ? 0: this.pkiEzdoctemplatedocumentID.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldertypeID == null ? 0: this.fkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.fkiEzdoctemplatetypeID == null ? 0: this.fkiEzdoctemplatetypeID.hashCode());
    result = 31 * result + (this.fkiEzdoctemplatefieldtypecategoryID == null ? 0: this.fkiEzdoctemplatefieldtypecategoryID.hashCode());
    result = 31 * result + (this.eEzdoctemplatedocumentPrivacylevel == null ? 0: this.eEzdoctemplatedocumentPrivacylevel.hashCode());
    result = 31 * result + (this.bEzdoctemplatedocumentIsactive == null ? 0: this.bEzdoctemplatedocumentIsactive.hashCode());
    result = 31 * result + (this.objEzdoctemplatedocumentName == null ? 0: this.objEzdoctemplatedocumentName.hashCode());
    result = 31 * result + (this.sEzdoctemplatedocumentNameX == null ? 0: this.sEzdoctemplatedocumentNameX.hashCode());
    result = 31 * result + (this.sEzsignfoldertypeNameX == null ? 0: this.sEzsignfoldertypeNameX.hashCode());
    result = 31 * result + (this.sEzdoctemplatefieldtypecategoryDescriptionX == null ? 0: this.sEzdoctemplatefieldtypecategoryDescriptionX.hashCode());
    result = 31 * result + (this.sEzdoctemplatetypeDescriptionX == null ? 0: this.sEzdoctemplatetypeDescriptionX.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzdoctemplatedocumentResponse {\n");
    
    sb.append("  pkiEzdoctemplatedocumentID: ").append(pkiEzdoctemplatedocumentID).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  fkiEzsignfoldertypeID: ").append(fkiEzsignfoldertypeID).append("\n");
    sb.append("  fkiEzdoctemplatetypeID: ").append(fkiEzdoctemplatetypeID).append("\n");
    sb.append("  fkiEzdoctemplatefieldtypecategoryID: ").append(fkiEzdoctemplatefieldtypecategoryID).append("\n");
    sb.append("  eEzdoctemplatedocumentPrivacylevel: ").append(eEzdoctemplatedocumentPrivacylevel).append("\n");
    sb.append("  bEzdoctemplatedocumentIsactive: ").append(bEzdoctemplatedocumentIsactive).append("\n");
    sb.append("  objEzdoctemplatedocumentName: ").append(objEzdoctemplatedocumentName).append("\n");
    sb.append("  sEzdoctemplatedocumentNameX: ").append(sEzdoctemplatedocumentNameX).append("\n");
    sb.append("  sEzsignfoldertypeNameX: ").append(sEzsignfoldertypeNameX).append("\n");
    sb.append("  sEzdoctemplatefieldtypecategoryDescriptionX: ").append(sEzdoctemplatefieldtypecategoryDescriptionX).append("\n");
    sb.append("  sEzdoctemplatetypeDescriptionX: ").append(sEzdoctemplatetypeDescriptionX).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
