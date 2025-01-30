/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
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
public class EzdoctemplatedocumentRequest {
  
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

  /**
   * The unique ID of the Ezdoctemplatedocument
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(value = "The unique ID of the Ezdoctemplatedocument")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzdoctemplatedocumentRequest ezdoctemplatedocumentRequest = (EzdoctemplatedocumentRequest) o;
    return (this.pkiEzdoctemplatedocumentID == null ? ezdoctemplatedocumentRequest.pkiEzdoctemplatedocumentID == null : this.pkiEzdoctemplatedocumentID.equals(ezdoctemplatedocumentRequest.pkiEzdoctemplatedocumentID)) &&
        (this.fkiLanguageID == null ? ezdoctemplatedocumentRequest.fkiLanguageID == null : this.fkiLanguageID.equals(ezdoctemplatedocumentRequest.fkiLanguageID)) &&
        (this.fkiEzsignfoldertypeID == null ? ezdoctemplatedocumentRequest.fkiEzsignfoldertypeID == null : this.fkiEzsignfoldertypeID.equals(ezdoctemplatedocumentRequest.fkiEzsignfoldertypeID)) &&
        (this.fkiEzdoctemplatetypeID == null ? ezdoctemplatedocumentRequest.fkiEzdoctemplatetypeID == null : this.fkiEzdoctemplatetypeID.equals(ezdoctemplatedocumentRequest.fkiEzdoctemplatetypeID)) &&
        (this.fkiEzdoctemplatefieldtypecategoryID == null ? ezdoctemplatedocumentRequest.fkiEzdoctemplatefieldtypecategoryID == null : this.fkiEzdoctemplatefieldtypecategoryID.equals(ezdoctemplatedocumentRequest.fkiEzdoctemplatefieldtypecategoryID)) &&
        (this.eEzdoctemplatedocumentPrivacylevel == null ? ezdoctemplatedocumentRequest.eEzdoctemplatedocumentPrivacylevel == null : this.eEzdoctemplatedocumentPrivacylevel.equals(ezdoctemplatedocumentRequest.eEzdoctemplatedocumentPrivacylevel)) &&
        (this.bEzdoctemplatedocumentIsactive == null ? ezdoctemplatedocumentRequest.bEzdoctemplatedocumentIsactive == null : this.bEzdoctemplatedocumentIsactive.equals(ezdoctemplatedocumentRequest.bEzdoctemplatedocumentIsactive)) &&
        (this.objEzdoctemplatedocumentName == null ? ezdoctemplatedocumentRequest.objEzdoctemplatedocumentName == null : this.objEzdoctemplatedocumentName.equals(ezdoctemplatedocumentRequest.objEzdoctemplatedocumentName));
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
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzdoctemplatedocumentRequest {\n");
    
    sb.append("  pkiEzdoctemplatedocumentID: ").append(pkiEzdoctemplatedocumentID).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  fkiEzsignfoldertypeID: ").append(fkiEzsignfoldertypeID).append("\n");
    sb.append("  fkiEzdoctemplatetypeID: ").append(fkiEzdoctemplatetypeID).append("\n");
    sb.append("  fkiEzdoctemplatefieldtypecategoryID: ").append(fkiEzdoctemplatefieldtypecategoryID).append("\n");
    sb.append("  eEzdoctemplatedocumentPrivacylevel: ").append(eEzdoctemplatedocumentPrivacylevel).append("\n");
    sb.append("  bEzdoctemplatedocumentIsactive: ").append(bEzdoctemplatedocumentIsactive).append("\n");
    sb.append("  objEzdoctemplatedocumentName: ").append(objEzdoctemplatedocumentName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
