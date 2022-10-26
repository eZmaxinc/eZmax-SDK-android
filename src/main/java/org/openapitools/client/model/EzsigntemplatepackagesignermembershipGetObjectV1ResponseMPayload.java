/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.12
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsigntemplatepackagesignermembershipResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/ezsigntemplatepackagesignermembership/{pkiEzsigntemplatepackagesignermembershipID}
 **/
@ApiModel(description = "Payload for GET /1/object/ezsigntemplatepackagesignermembership/{pkiEzsigntemplatepackagesignermembershipID}")
public class EzsigntemplatepackagesignermembershipGetObjectV1ResponseMPayload {
  
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
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplatepackagesignermembership")
  public Integer getPkiEzsigntemplatepackagesignermembershipID() {
    return pkiEzsigntemplatepackagesignermembershipID;
  }
  public void setPkiEzsigntemplatepackagesignermembershipID(Integer pkiEzsigntemplatepackagesignermembershipID) {
    this.pkiEzsigntemplatepackagesignermembershipID = pkiEzsigntemplatepackagesignermembershipID;
  }

  /**
   * The unique ID of the Ezsigntemplatepackagemembership
   * minimum: 0
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
   * minimum: 0
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
   * minimum: 0
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
   * minimum: 1
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
    EzsigntemplatepackagesignermembershipGetObjectV1ResponseMPayload ezsigntemplatepackagesignermembershipGetObjectV1ResponseMPayload = (EzsigntemplatepackagesignermembershipGetObjectV1ResponseMPayload) o;
    return (this.pkiEzsigntemplatepackagesignermembershipID == null ? ezsigntemplatepackagesignermembershipGetObjectV1ResponseMPayload.pkiEzsigntemplatepackagesignermembershipID == null : this.pkiEzsigntemplatepackagesignermembershipID.equals(ezsigntemplatepackagesignermembershipGetObjectV1ResponseMPayload.pkiEzsigntemplatepackagesignermembershipID)) &&
        (this.fkiEzsigntemplatepackagemembershipID == null ? ezsigntemplatepackagesignermembershipGetObjectV1ResponseMPayload.fkiEzsigntemplatepackagemembershipID == null : this.fkiEzsigntemplatepackagemembershipID.equals(ezsigntemplatepackagesignermembershipGetObjectV1ResponseMPayload.fkiEzsigntemplatepackagemembershipID)) &&
        (this.fkiEzsigntemplatepackagesignerID == null ? ezsigntemplatepackagesignermembershipGetObjectV1ResponseMPayload.fkiEzsigntemplatepackagesignerID == null : this.fkiEzsigntemplatepackagesignerID.equals(ezsigntemplatepackagesignermembershipGetObjectV1ResponseMPayload.fkiEzsigntemplatepackagesignerID)) &&
        (this.fkiEzsigntemplatesignerID == null ? ezsigntemplatepackagesignermembershipGetObjectV1ResponseMPayload.fkiEzsigntemplatesignerID == null : this.fkiEzsigntemplatesignerID.equals(ezsigntemplatepackagesignermembershipGetObjectV1ResponseMPayload.fkiEzsigntemplatesignerID)) &&
        (this.iEzsigntemplatepackagesignermembershipCopy == null ? ezsigntemplatepackagesignermembershipGetObjectV1ResponseMPayload.iEzsigntemplatepackagesignermembershipCopy == null : this.iEzsigntemplatepackagesignermembershipCopy.equals(ezsigntemplatepackagesignermembershipGetObjectV1ResponseMPayload.iEzsigntemplatepackagesignermembershipCopy));
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
    sb.append("class EzsigntemplatepackagesignermembershipGetObjectV1ResponseMPayload {\n");
    
    sb.append("  pkiEzsigntemplatepackagesignermembershipID: ").append(pkiEzsigntemplatepackagesignermembershipID).append("\n");
    sb.append("  fkiEzsigntemplatepackagemembershipID: ").append(fkiEzsigntemplatepackagemembershipID).append("\n");
    sb.append("  fkiEzsigntemplatepackagesignerID: ").append(fkiEzsigntemplatepackagesignerID).append("\n");
    sb.append("  fkiEzsigntemplatesignerID: ").append(fkiEzsigntemplatesignerID).append("\n");
    sb.append("  iEzsigntemplatepackagesignermembershipCopy: ").append(iEzsigntemplatepackagesignermembershipCopy).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
