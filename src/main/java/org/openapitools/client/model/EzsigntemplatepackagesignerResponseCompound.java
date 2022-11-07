/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.15
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsigntemplatepackagesignerResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsigntemplatepackagesigner Object
 **/
@ApiModel(description = "A Ezsigntemplatepackagesigner Object")
public class EzsigntemplatepackagesignerResponseCompound {
  
  @SerializedName("pkiEzsigntemplatepackagesignerID")
  private Integer pkiEzsigntemplatepackagesignerID = null;
  @SerializedName("fkiEzsigntemplatepackageID")
  private Integer fkiEzsigntemplatepackageID = null;
  @SerializedName("sEzsigntemplatepackagesignerDescription")
  private String sEzsigntemplatepackagesignerDescription = null;

  /**
   * The unique ID of the Ezsigntemplatepackagesigner
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplatepackagesigner")
  public Integer getPkiEzsigntemplatepackagesignerID() {
    return pkiEzsigntemplatepackagesignerID;
  }
  public void setPkiEzsigntemplatepackagesignerID(Integer pkiEzsigntemplatepackagesignerID) {
    this.pkiEzsigntemplatepackagesignerID = pkiEzsigntemplatepackagesignerID;
  }

  /**
   * The unique ID of the Ezsigntemplatepackage
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplatepackage")
  public Integer getFkiEzsigntemplatepackageID() {
    return fkiEzsigntemplatepackageID;
  }
  public void setFkiEzsigntemplatepackageID(Integer fkiEzsigntemplatepackageID) {
    this.fkiEzsigntemplatepackageID = fkiEzsigntemplatepackageID;
  }

  /**
   * The description of the Ezsigntemplatepackagesigner
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezsigntemplatepackagesigner")
  public String getSEzsigntemplatepackagesignerDescription() {
    return sEzsigntemplatepackagesignerDescription;
  }
  public void setSEzsigntemplatepackagesignerDescription(String sEzsigntemplatepackagesignerDescription) {
    this.sEzsigntemplatepackagesignerDescription = sEzsigntemplatepackagesignerDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatepackagesignerResponseCompound ezsigntemplatepackagesignerResponseCompound = (EzsigntemplatepackagesignerResponseCompound) o;
    return (this.pkiEzsigntemplatepackagesignerID == null ? ezsigntemplatepackagesignerResponseCompound.pkiEzsigntemplatepackagesignerID == null : this.pkiEzsigntemplatepackagesignerID.equals(ezsigntemplatepackagesignerResponseCompound.pkiEzsigntemplatepackagesignerID)) &&
        (this.fkiEzsigntemplatepackageID == null ? ezsigntemplatepackagesignerResponseCompound.fkiEzsigntemplatepackageID == null : this.fkiEzsigntemplatepackageID.equals(ezsigntemplatepackagesignerResponseCompound.fkiEzsigntemplatepackageID)) &&
        (this.sEzsigntemplatepackagesignerDescription == null ? ezsigntemplatepackagesignerResponseCompound.sEzsigntemplatepackagesignerDescription == null : this.sEzsigntemplatepackagesignerDescription.equals(ezsigntemplatepackagesignerResponseCompound.sEzsigntemplatepackagesignerDescription));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplatepackagesignerID == null ? 0: this.pkiEzsigntemplatepackagesignerID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplatepackageID == null ? 0: this.fkiEzsigntemplatepackageID.hashCode());
    result = 31 * result + (this.sEzsigntemplatepackagesignerDescription == null ? 0: this.sEzsigntemplatepackagesignerDescription.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepackagesignerResponseCompound {\n");
    
    sb.append("  pkiEzsigntemplatepackagesignerID: ").append(pkiEzsigntemplatepackagesignerID).append("\n");
    sb.append("  fkiEzsigntemplatepackageID: ").append(fkiEzsigntemplatepackageID).append("\n");
    sb.append("  sEzsigntemplatepackagesignerDescription: ").append(sEzsigntemplatepackagesignerDescription).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
