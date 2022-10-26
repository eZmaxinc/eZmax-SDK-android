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

import org.openapitools.client.model.EzsignbulksendsignermappingResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsignbulksendsignermapping Object
 **/
@ApiModel(description = "A Ezsignbulksendsignermapping Object")
public class EzsignbulksendsignermappingResponseCompound {
  
  @SerializedName("pkiEzsignbulksendsignermappingID")
  private Integer pkiEzsignbulksendsignermappingID = null;
  @SerializedName("fkiEzsignbulksendID")
  private Integer fkiEzsignbulksendID = null;
  @SerializedName("fkiUserID")
  private Integer fkiUserID = null;
  @SerializedName("sEzsignbulksendsignermappingDescription")
  private String sEzsignbulksendsignermappingDescription = null;

  /**
   * The unique ID of the Ezsignbulksendsignermapping
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignbulksendsignermapping")
  public Integer getPkiEzsignbulksendsignermappingID() {
    return pkiEzsignbulksendsignermappingID;
  }
  public void setPkiEzsignbulksendsignermappingID(Integer pkiEzsignbulksendsignermappingID) {
    this.pkiEzsignbulksendsignermappingID = pkiEzsignbulksendsignermappingID;
  }

  /**
   * The unique ID of the Ezsignbulksend
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignbulksend")
  public Integer getFkiEzsignbulksendID() {
    return fkiEzsignbulksendID;
  }
  public void setFkiEzsignbulksendID(Integer fkiEzsignbulksendID) {
    this.fkiEzsignbulksendID = fkiEzsignbulksendID;
  }

  /**
   * The unique ID of the User
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the User")
  public Integer getFkiUserID() {
    return fkiUserID;
  }
  public void setFkiUserID(Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
  }

  /**
   * The description of the Ezsignbulksendsignermapping
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezsignbulksendsignermapping")
  public String getSEzsignbulksendsignermappingDescription() {
    return sEzsignbulksendsignermappingDescription;
  }
  public void setSEzsignbulksendsignermappingDescription(String sEzsignbulksendsignermappingDescription) {
    this.sEzsignbulksendsignermappingDescription = sEzsignbulksendsignermappingDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksendsignermappingResponseCompound ezsignbulksendsignermappingResponseCompound = (EzsignbulksendsignermappingResponseCompound) o;
    return (this.pkiEzsignbulksendsignermappingID == null ? ezsignbulksendsignermappingResponseCompound.pkiEzsignbulksendsignermappingID == null : this.pkiEzsignbulksendsignermappingID.equals(ezsignbulksendsignermappingResponseCompound.pkiEzsignbulksendsignermappingID)) &&
        (this.fkiEzsignbulksendID == null ? ezsignbulksendsignermappingResponseCompound.fkiEzsignbulksendID == null : this.fkiEzsignbulksendID.equals(ezsignbulksendsignermappingResponseCompound.fkiEzsignbulksendID)) &&
        (this.fkiUserID == null ? ezsignbulksendsignermappingResponseCompound.fkiUserID == null : this.fkiUserID.equals(ezsignbulksendsignermappingResponseCompound.fkiUserID)) &&
        (this.sEzsignbulksendsignermappingDescription == null ? ezsignbulksendsignermappingResponseCompound.sEzsignbulksendsignermappingDescription == null : this.sEzsignbulksendsignermappingDescription.equals(ezsignbulksendsignermappingResponseCompound.sEzsignbulksendsignermappingDescription));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignbulksendsignermappingID == null ? 0: this.pkiEzsignbulksendsignermappingID.hashCode());
    result = 31 * result + (this.fkiEzsignbulksendID == null ? 0: this.fkiEzsignbulksendID.hashCode());
    result = 31 * result + (this.fkiUserID == null ? 0: this.fkiUserID.hashCode());
    result = 31 * result + (this.sEzsignbulksendsignermappingDescription == null ? 0: this.sEzsignbulksendsignermappingDescription.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendsignermappingResponseCompound {\n");
    
    sb.append("  pkiEzsignbulksendsignermappingID: ").append(pkiEzsignbulksendsignermappingID).append("\n");
    sb.append("  fkiEzsignbulksendID: ").append(fkiEzsignbulksendID).append("\n");
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("  sEzsignbulksendsignermappingDescription: ").append(sEzsignbulksendsignermappingDescription).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
