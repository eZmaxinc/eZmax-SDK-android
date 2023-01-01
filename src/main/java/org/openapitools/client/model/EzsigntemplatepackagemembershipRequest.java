/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
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
 * A Ezsigntemplatepackagemembership Object
 **/
@ApiModel(description = "A Ezsigntemplatepackagemembership Object")
public class EzsigntemplatepackagemembershipRequest {
  
  @SerializedName("pkiEzsigntemplatepackagemembershipID")
  private Integer pkiEzsigntemplatepackagemembershipID = null;
  @SerializedName("fkiEzsigntemplatepackageID")
  private Integer fkiEzsigntemplatepackageID = null;
  @SerializedName("fkiEzsigntemplateID")
  private Integer fkiEzsigntemplateID = null;

  /**
   * The unique ID of the Ezsigntemplatepackagemembership
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsigntemplatepackagemembership")
  public Integer getPkiEzsigntemplatepackagemembershipID() {
    return pkiEzsigntemplatepackagemembershipID;
  }
  public void setPkiEzsigntemplatepackagemembershipID(Integer pkiEzsigntemplatepackagemembershipID) {
    this.pkiEzsigntemplatepackagemembershipID = pkiEzsigntemplatepackagemembershipID;
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
   * The unique ID of the Ezsigntemplate
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplate")
  public Integer getFkiEzsigntemplateID() {
    return fkiEzsigntemplateID;
  }
  public void setFkiEzsigntemplateID(Integer fkiEzsigntemplateID) {
    this.fkiEzsigntemplateID = fkiEzsigntemplateID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatepackagemembershipRequest ezsigntemplatepackagemembershipRequest = (EzsigntemplatepackagemembershipRequest) o;
    return (this.pkiEzsigntemplatepackagemembershipID == null ? ezsigntemplatepackagemembershipRequest.pkiEzsigntemplatepackagemembershipID == null : this.pkiEzsigntemplatepackagemembershipID.equals(ezsigntemplatepackagemembershipRequest.pkiEzsigntemplatepackagemembershipID)) &&
        (this.fkiEzsigntemplatepackageID == null ? ezsigntemplatepackagemembershipRequest.fkiEzsigntemplatepackageID == null : this.fkiEzsigntemplatepackageID.equals(ezsigntemplatepackagemembershipRequest.fkiEzsigntemplatepackageID)) &&
        (this.fkiEzsigntemplateID == null ? ezsigntemplatepackagemembershipRequest.fkiEzsigntemplateID == null : this.fkiEzsigntemplateID.equals(ezsigntemplatepackagemembershipRequest.fkiEzsigntemplateID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplatepackagemembershipID == null ? 0: this.pkiEzsigntemplatepackagemembershipID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplatepackageID == null ? 0: this.fkiEzsigntemplatepackageID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplateID == null ? 0: this.fkiEzsigntemplateID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepackagemembershipRequest {\n");
    
    sb.append("  pkiEzsigntemplatepackagemembershipID: ").append(pkiEzsigntemplatepackagemembershipID).append("\n");
    sb.append("  fkiEzsigntemplatepackageID: ").append(fkiEzsigntemplatepackageID).append("\n");
    sb.append("  fkiEzsigntemplateID: ").append(fkiEzsigntemplateID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
