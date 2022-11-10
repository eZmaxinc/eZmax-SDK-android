/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsigntemplate Object
 **/
@ApiModel(description = "A Ezsigntemplate Object")
public class EzsigntemplateRequest {
  
  @SerializedName("pkiEzsigntemplateID")
  private Integer pkiEzsigntemplateID = null;
  @SerializedName("fkiEzsignfoldertypeID")
  private Integer fkiEzsignfoldertypeID = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("sEzsigntemplateDescription")
  private String sEzsigntemplateDescription = null;
  @SerializedName("bEzsigntemplateAdminonly")
  private Boolean bEzsigntemplateAdminonly = null;

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
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfoldertype.")
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
   * Whether the Ezsigntemplate can be accessed by admin users only (eUserType=Normal)
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezsigntemplate can be accessed by admin users only (eUserType=Normal)")
  public Boolean getBEzsigntemplateAdminonly() {
    return bEzsigntemplateAdminonly;
  }
  public void setBEzsigntemplateAdminonly(Boolean bEzsigntemplateAdminonly) {
    this.bEzsigntemplateAdminonly = bEzsigntemplateAdminonly;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplateRequest ezsigntemplateRequest = (EzsigntemplateRequest) o;
    return (this.pkiEzsigntemplateID == null ? ezsigntemplateRequest.pkiEzsigntemplateID == null : this.pkiEzsigntemplateID.equals(ezsigntemplateRequest.pkiEzsigntemplateID)) &&
        (this.fkiEzsignfoldertypeID == null ? ezsigntemplateRequest.fkiEzsignfoldertypeID == null : this.fkiEzsignfoldertypeID.equals(ezsigntemplateRequest.fkiEzsignfoldertypeID)) &&
        (this.fkiLanguageID == null ? ezsigntemplateRequest.fkiLanguageID == null : this.fkiLanguageID.equals(ezsigntemplateRequest.fkiLanguageID)) &&
        (this.sEzsigntemplateDescription == null ? ezsigntemplateRequest.sEzsigntemplateDescription == null : this.sEzsigntemplateDescription.equals(ezsigntemplateRequest.sEzsigntemplateDescription)) &&
        (this.bEzsigntemplateAdminonly == null ? ezsigntemplateRequest.bEzsigntemplateAdminonly == null : this.bEzsigntemplateAdminonly.equals(ezsigntemplateRequest.bEzsigntemplateAdminonly));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplateID == null ? 0: this.pkiEzsigntemplateID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldertypeID == null ? 0: this.fkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.sEzsigntemplateDescription == null ? 0: this.sEzsigntemplateDescription.hashCode());
    result = 31 * result + (this.bEzsigntemplateAdminonly == null ? 0: this.bEzsigntemplateAdminonly.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplateRequest {\n");
    
    sb.append("  pkiEzsigntemplateID: ").append(pkiEzsigntemplateID).append("\n");
    sb.append("  fkiEzsignfoldertypeID: ").append(fkiEzsignfoldertypeID).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  sEzsigntemplateDescription: ").append(sEzsigntemplateDescription).append("\n");
    sb.append("  bEzsigntemplateAdminonly: ").append(bEzsigntemplateAdminonly).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
