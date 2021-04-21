/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.42
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.MultilingualApikeyDescription;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Apikey Object
 **/
@ApiModel(description = "An Apikey Object")
public class ApikeyRequest {
  
  @SerializedName("fkiUserID")
  private Integer fkiUserID = null;
  @SerializedName("objApikeyDescription")
  private MultilingualApikeyDescription objApikeyDescription = null;

  /**
   * The unique ID of the User
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the User")
  public Integer getFkiUserID() {
    return fkiUserID;
  }
  public void setFkiUserID(Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public MultilingualApikeyDescription getObjApikeyDescription() {
    return objApikeyDescription;
  }
  public void setObjApikeyDescription(MultilingualApikeyDescription objApikeyDescription) {
    this.objApikeyDescription = objApikeyDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApikeyRequest apikeyRequest = (ApikeyRequest) o;
    return (this.fkiUserID == null ? apikeyRequest.fkiUserID == null : this.fkiUserID.equals(apikeyRequest.fkiUserID)) &&
        (this.objApikeyDescription == null ? apikeyRequest.objApikeyDescription == null : this.objApikeyDescription.equals(apikeyRequest.objApikeyDescription));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiUserID == null ? 0: this.fkiUserID.hashCode());
    result = 31 * result + (this.objApikeyDescription == null ? 0: this.objApikeyDescription.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApikeyRequest {\n");
    
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("  objApikeyDescription: ").append(objApikeyDescription).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
