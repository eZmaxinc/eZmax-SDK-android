/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.13
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsignbulksendsignermappingResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID}
 **/
@ApiModel(description = "Payload for GET /1/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID}")
public class EzsignbulksendsignermappingGetObjectV1ResponseMPayload {
  
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
    EzsignbulksendsignermappingGetObjectV1ResponseMPayload ezsignbulksendsignermappingGetObjectV1ResponseMPayload = (EzsignbulksendsignermappingGetObjectV1ResponseMPayload) o;
    return (this.pkiEzsignbulksendsignermappingID == null ? ezsignbulksendsignermappingGetObjectV1ResponseMPayload.pkiEzsignbulksendsignermappingID == null : this.pkiEzsignbulksendsignermappingID.equals(ezsignbulksendsignermappingGetObjectV1ResponseMPayload.pkiEzsignbulksendsignermappingID)) &&
        (this.fkiEzsignbulksendID == null ? ezsignbulksendsignermappingGetObjectV1ResponseMPayload.fkiEzsignbulksendID == null : this.fkiEzsignbulksendID.equals(ezsignbulksendsignermappingGetObjectV1ResponseMPayload.fkiEzsignbulksendID)) &&
        (this.fkiUserID == null ? ezsignbulksendsignermappingGetObjectV1ResponseMPayload.fkiUserID == null : this.fkiUserID.equals(ezsignbulksendsignermappingGetObjectV1ResponseMPayload.fkiUserID)) &&
        (this.sEzsignbulksendsignermappingDescription == null ? ezsignbulksendsignermappingGetObjectV1ResponseMPayload.sEzsignbulksendsignermappingDescription == null : this.sEzsignbulksendsignermappingDescription.equals(ezsignbulksendsignermappingGetObjectV1ResponseMPayload.sEzsignbulksendsignermappingDescription));
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
    sb.append("class EzsignbulksendsignermappingGetObjectV1ResponseMPayload {\n");
    
    sb.append("  pkiEzsignbulksendsignermappingID: ").append(pkiEzsignbulksendsignermappingID).append("\n");
    sb.append("  fkiEzsignbulksendID: ").append(fkiEzsignbulksendID).append("\n");
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("  sEzsignbulksendsignermappingDescription: ").append(sEzsignbulksendsignermappingDescription).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
