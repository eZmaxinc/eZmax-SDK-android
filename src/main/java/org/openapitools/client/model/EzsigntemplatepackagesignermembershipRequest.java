/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
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
 * A Ezsigntemplatepackagesignermembership Object
 **/
@ApiModel(description = "A Ezsigntemplatepackagesignermembership Object")
public class EzsigntemplatepackagesignermembershipRequest {
  
  @SerializedName("pkiEzsigntemplatepackagesignermembershipID")
  private Integer pkiEzsigntemplatepackagesignermembershipID = null;
  @SerializedName("fkiEzsigntemplatepackagemembershipID")
  private Integer fkiEzsigntemplatepackagemembershipID = null;
  @SerializedName("fkiEzsigntemplatepackagesignerID")
  private Integer fkiEzsigntemplatepackagesignerID = null;
  @SerializedName("fkiEzsigntemplatesignerID")
  private Integer fkiEzsigntemplatesignerID = null;
  @SerializedName("iEzsigntemplatepackagesignermembershipCopy")
  private Integer iEzsigntemplatepackagesignermembershipCopy = null;

  /**
   * The unique ID of the Ezsigntemplatepackagesignermembership
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsigntemplatepackagesignermembership")
  public Integer getPkiEzsigntemplatepackagesignermembershipID() {
    return pkiEzsigntemplatepackagesignermembershipID;
  }
  public void setPkiEzsigntemplatepackagesignermembershipID(Integer pkiEzsigntemplatepackagesignermembershipID) {
    this.pkiEzsigntemplatepackagesignermembershipID = pkiEzsigntemplatepackagesignermembershipID;
  }

  /**
   * The unique ID of the Ezsigntemplatepackagemembership
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplatepackagemembership")
  public Integer getFkiEzsigntemplatepackagemembershipID() {
    return fkiEzsigntemplatepackagemembershipID;
  }
  public void setFkiEzsigntemplatepackagemembershipID(Integer fkiEzsigntemplatepackagemembershipID) {
    this.fkiEzsigntemplatepackagemembershipID = fkiEzsigntemplatepackagemembershipID;
  }

  /**
   * The unique ID of the Ezsigntemplatepackagesigner
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplatepackagesigner")
  public Integer getFkiEzsigntemplatepackagesignerID() {
    return fkiEzsigntemplatepackagesignerID;
  }
  public void setFkiEzsigntemplatepackagesignerID(Integer fkiEzsigntemplatepackagesignerID) {
    this.fkiEzsigntemplatepackagesignerID = fkiEzsigntemplatepackagesignerID;
  }

  /**
   * The unique ID of the Ezsigntemplatesigner
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplatesigner")
  public Integer getFkiEzsigntemplatesignerID() {
    return fkiEzsigntemplatesignerID;
  }
  public void setFkiEzsigntemplatesignerID(Integer fkiEzsigntemplatesignerID) {
    this.fkiEzsigntemplatesignerID = fkiEzsigntemplatesignerID;
  }

  /**
   * The Copy number in case of multiple copies.
   **/
  @ApiModelProperty(value = "The Copy number in case of multiple copies.")
  public Integer getIEzsigntemplatepackagesignermembershipCopy() {
    return iEzsigntemplatepackagesignermembershipCopy;
  }
  public void setIEzsigntemplatepackagesignermembershipCopy(Integer iEzsigntemplatepackagesignermembershipCopy) {
    this.iEzsigntemplatepackagesignermembershipCopy = iEzsigntemplatepackagesignermembershipCopy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatepackagesignermembershipRequest ezsigntemplatepackagesignermembershipRequest = (EzsigntemplatepackagesignermembershipRequest) o;
    return (this.pkiEzsigntemplatepackagesignermembershipID == null ? ezsigntemplatepackagesignermembershipRequest.pkiEzsigntemplatepackagesignermembershipID == null : this.pkiEzsigntemplatepackagesignermembershipID.equals(ezsigntemplatepackagesignermembershipRequest.pkiEzsigntemplatepackagesignermembershipID)) &&
        (this.fkiEzsigntemplatepackagemembershipID == null ? ezsigntemplatepackagesignermembershipRequest.fkiEzsigntemplatepackagemembershipID == null : this.fkiEzsigntemplatepackagemembershipID.equals(ezsigntemplatepackagesignermembershipRequest.fkiEzsigntemplatepackagemembershipID)) &&
        (this.fkiEzsigntemplatepackagesignerID == null ? ezsigntemplatepackagesignermembershipRequest.fkiEzsigntemplatepackagesignerID == null : this.fkiEzsigntemplatepackagesignerID.equals(ezsigntemplatepackagesignermembershipRequest.fkiEzsigntemplatepackagesignerID)) &&
        (this.fkiEzsigntemplatesignerID == null ? ezsigntemplatepackagesignermembershipRequest.fkiEzsigntemplatesignerID == null : this.fkiEzsigntemplatesignerID.equals(ezsigntemplatepackagesignermembershipRequest.fkiEzsigntemplatesignerID)) &&
        (this.iEzsigntemplatepackagesignermembershipCopy == null ? ezsigntemplatepackagesignermembershipRequest.iEzsigntemplatepackagesignermembershipCopy == null : this.iEzsigntemplatepackagesignermembershipCopy.equals(ezsigntemplatepackagesignermembershipRequest.iEzsigntemplatepackagesignermembershipCopy));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplatepackagesignermembershipID == null ? 0: this.pkiEzsigntemplatepackagesignermembershipID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplatepackagemembershipID == null ? 0: this.fkiEzsigntemplatepackagemembershipID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplatepackagesignerID == null ? 0: this.fkiEzsigntemplatepackagesignerID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplatesignerID == null ? 0: this.fkiEzsigntemplatesignerID.hashCode());
    result = 31 * result + (this.iEzsigntemplatepackagesignermembershipCopy == null ? 0: this.iEzsigntemplatepackagesignermembershipCopy.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepackagesignermembershipRequest {\n");
    
    sb.append("  pkiEzsigntemplatepackagesignermembershipID: ").append(pkiEzsigntemplatepackagesignermembershipID).append("\n");
    sb.append("  fkiEzsigntemplatepackagemembershipID: ").append(fkiEzsigntemplatepackagemembershipID).append("\n");
    sb.append("  fkiEzsigntemplatepackagesignerID: ").append(fkiEzsigntemplatepackagesignerID).append("\n");
    sb.append("  fkiEzsigntemplatesignerID: ").append(fkiEzsigntemplatesignerID).append("\n");
    sb.append("  iEzsigntemplatepackagesignermembershipCopy: ").append(iEzsigntemplatepackagesignermembershipCopy).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}