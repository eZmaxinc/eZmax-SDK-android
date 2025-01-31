/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.1
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /1/object/user
 **/
@ApiModel(description = "Payload for POST /1/object/user")
public class UserCreateObjectV1ResponseMPayload {
  
  @SerializedName("a_pkiUserID")
  private List<Integer> aPkiUserID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiUserID() {
    return aPkiUserID;
  }
  public void setAPkiUserID(List<Integer> aPkiUserID) {
    this.aPkiUserID = aPkiUserID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCreateObjectV1ResponseMPayload userCreateObjectV1ResponseMPayload = (UserCreateObjectV1ResponseMPayload) o;
    return (this.aPkiUserID == null ? userCreateObjectV1ResponseMPayload.aPkiUserID == null : this.aPkiUserID.equals(userCreateObjectV1ResponseMPayload.aPkiUserID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiUserID == null ? 0: this.aPkiUserID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCreateObjectV1ResponseMPayload {\n");
    
    sb.append("  aPkiUserID: ").append(aPkiUserID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
