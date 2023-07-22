/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
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
 * Request for POST /1/object/userstaged/{pkiUserstagedID}/map
 **/
@ApiModel(description = "Request for POST /1/object/userstaged/{pkiUserstagedID}/map")
public class UserstagedMapV1Request {
  
  @SerializedName("fkiUserID")
  private Integer fkiUserID = null;

  /**
   * The unique ID of the User
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the User")
  public Integer getFkiUserID() {
    return fkiUserID;
  }
  public void setFkiUserID(Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserstagedMapV1Request userstagedMapV1Request = (UserstagedMapV1Request) o;
    return (this.fkiUserID == null ? userstagedMapV1Request.fkiUserID == null : this.fkiUserID.equals(userstagedMapV1Request.fkiUserID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiUserID == null ? 0: this.fkiUserID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserstagedMapV1Request {\n");
    
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
