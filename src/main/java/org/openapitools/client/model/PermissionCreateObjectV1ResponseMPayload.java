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

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /1/object/permission
 **/
@ApiModel(description = "Payload for POST /1/object/permission")
public class PermissionCreateObjectV1ResponseMPayload {
  
  @SerializedName("a_pkiPermissionID")
  private List<Integer> aPkiPermissionID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiPermissionID() {
    return aPkiPermissionID;
  }
  public void setAPkiPermissionID(List<Integer> aPkiPermissionID) {
    this.aPkiPermissionID = aPkiPermissionID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionCreateObjectV1ResponseMPayload permissionCreateObjectV1ResponseMPayload = (PermissionCreateObjectV1ResponseMPayload) o;
    return (this.aPkiPermissionID == null ? permissionCreateObjectV1ResponseMPayload.aPkiPermissionID == null : this.aPkiPermissionID.equals(permissionCreateObjectV1ResponseMPayload.aPkiPermissionID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiPermissionID == null ? 0: this.aPkiPermissionID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionCreateObjectV1ResponseMPayload {\n");
    
    sb.append("  aPkiPermissionID: ").append(aPkiPermissionID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}