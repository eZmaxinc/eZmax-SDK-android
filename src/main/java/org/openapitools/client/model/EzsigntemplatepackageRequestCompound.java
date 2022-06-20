/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.8
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsigntemplatepackageRequest;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsigntemplatepackage Object and children
 **/
@ApiModel(description = "A Ezsigntemplatepackage Object and children")
public class EzsigntemplatepackageRequestCompound {
  
  @SerializedName("pkiEzsigntemplatepackageID")
  private Integer pkiEzsigntemplatepackageID = null;
  @SerializedName("fkiEzsignfoldertypeID")
  private Integer fkiEzsignfoldertypeID = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("sEzsigntemplatepackageDescription")
  private String sEzsigntemplatepackageDescription = null;
  @SerializedName("bEzsigntemplatepackageAdminonly")
  private Boolean bEzsigntemplatepackageAdminonly = null;
  @SerializedName("bEzsigntemplatepackageIsactive")
  private Boolean bEzsigntemplatepackageIsactive = null;

  /**
   * The unique ID of the Ezsigntemplatepackage
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsigntemplatepackage")
  public Integer getPkiEzsigntemplatepackageID() {
    return pkiEzsigntemplatepackageID;
  }
  public void setPkiEzsigntemplatepackageID(Integer pkiEzsigntemplatepackageID) {
    this.pkiEzsigntemplatepackageID = pkiEzsigntemplatepackageID;
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
   * The description of the Ezsigntemplatepackage
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezsigntemplatepackage")
  public String getSEzsigntemplatepackageDescription() {
    return sEzsigntemplatepackageDescription;
  }
  public void setSEzsigntemplatepackageDescription(String sEzsigntemplatepackageDescription) {
    this.sEzsigntemplatepackageDescription = sEzsigntemplatepackageDescription;
  }

  /**
   * Whether the Ezsigntemplatepackage can be accessed by admin users only (eUserType=Normal)
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezsigntemplatepackage can be accessed by admin users only (eUserType=Normal)")
  public Boolean getBEzsigntemplatepackageAdminonly() {
    return bEzsigntemplatepackageAdminonly;
  }
  public void setBEzsigntemplatepackageAdminonly(Boolean bEzsigntemplatepackageAdminonly) {
    this.bEzsigntemplatepackageAdminonly = bEzsigntemplatepackageAdminonly;
  }

  /**
   * Whether the Ezsigntemplatepackage is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezsigntemplatepackage is active or not")
  public Boolean getBEzsigntemplatepackageIsactive() {
    return bEzsigntemplatepackageIsactive;
  }
  public void setBEzsigntemplatepackageIsactive(Boolean bEzsigntemplatepackageIsactive) {
    this.bEzsigntemplatepackageIsactive = bEzsigntemplatepackageIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatepackageRequestCompound ezsigntemplatepackageRequestCompound = (EzsigntemplatepackageRequestCompound) o;
    return (this.pkiEzsigntemplatepackageID == null ? ezsigntemplatepackageRequestCompound.pkiEzsigntemplatepackageID == null : this.pkiEzsigntemplatepackageID.equals(ezsigntemplatepackageRequestCompound.pkiEzsigntemplatepackageID)) &&
        (this.fkiEzsignfoldertypeID == null ? ezsigntemplatepackageRequestCompound.fkiEzsignfoldertypeID == null : this.fkiEzsignfoldertypeID.equals(ezsigntemplatepackageRequestCompound.fkiEzsignfoldertypeID)) &&
        (this.fkiLanguageID == null ? ezsigntemplatepackageRequestCompound.fkiLanguageID == null : this.fkiLanguageID.equals(ezsigntemplatepackageRequestCompound.fkiLanguageID)) &&
        (this.sEzsigntemplatepackageDescription == null ? ezsigntemplatepackageRequestCompound.sEzsigntemplatepackageDescription == null : this.sEzsigntemplatepackageDescription.equals(ezsigntemplatepackageRequestCompound.sEzsigntemplatepackageDescription)) &&
        (this.bEzsigntemplatepackageAdminonly == null ? ezsigntemplatepackageRequestCompound.bEzsigntemplatepackageAdminonly == null : this.bEzsigntemplatepackageAdminonly.equals(ezsigntemplatepackageRequestCompound.bEzsigntemplatepackageAdminonly)) &&
        (this.bEzsigntemplatepackageIsactive == null ? ezsigntemplatepackageRequestCompound.bEzsigntemplatepackageIsactive == null : this.bEzsigntemplatepackageIsactive.equals(ezsigntemplatepackageRequestCompound.bEzsigntemplatepackageIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplatepackageID == null ? 0: this.pkiEzsigntemplatepackageID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldertypeID == null ? 0: this.fkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.sEzsigntemplatepackageDescription == null ? 0: this.sEzsigntemplatepackageDescription.hashCode());
    result = 31 * result + (this.bEzsigntemplatepackageAdminonly == null ? 0: this.bEzsigntemplatepackageAdminonly.hashCode());
    result = 31 * result + (this.bEzsigntemplatepackageIsactive == null ? 0: this.bEzsigntemplatepackageIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepackageRequestCompound {\n");
    
    sb.append("  pkiEzsigntemplatepackageID: ").append(pkiEzsigntemplatepackageID).append("\n");
    sb.append("  fkiEzsignfoldertypeID: ").append(fkiEzsignfoldertypeID).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  sEzsigntemplatepackageDescription: ").append(sEzsigntemplatepackageDescription).append("\n");
    sb.append("  bEzsigntemplatepackageAdminonly: ").append(bEzsigntemplatepackageAdminonly).append("\n");
    sb.append("  bEzsigntemplatepackageIsactive: ").append(bEzsigntemplatepackageIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
