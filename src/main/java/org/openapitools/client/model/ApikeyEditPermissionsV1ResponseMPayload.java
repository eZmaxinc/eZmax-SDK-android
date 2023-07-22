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
 * Payload for PUT /1/object/apikey/{pkiApikeyID}/editPermissions
 **/
@ApiModel(description = "Payload for PUT /1/object/apikey/{pkiApikeyID}/editPermissions")
public class ApikeyEditPermissionsV1ResponseMPayload {
  
  @SerializedName("a_pkiPermissionID")
  private List<Integer> aPkiPermissionID = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
    ApikeyEditPermissionsV1ResponseMPayload apikeyEditPermissionsV1ResponseMPayload = (ApikeyEditPermissionsV1ResponseMPayload) o;
    return (this.aPkiPermissionID == null ? apikeyEditPermissionsV1ResponseMPayload.aPkiPermissionID == null : this.aPkiPermissionID.equals(apikeyEditPermissionsV1ResponseMPayload.aPkiPermissionID));
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
    sb.append("class ApikeyEditPermissionsV1ResponseMPayload {\n");
    
    sb.append("  aPkiPermissionID: ").append(aPkiPermissionID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
