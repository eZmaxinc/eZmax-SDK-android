/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
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
 * Payload for POST /1/object/usergroup
 **/
@ApiModel(description = "Payload for POST /1/object/usergroup")
public class UsergroupCreateObjectV1ResponseMPayload {
  
  @SerializedName("a_pkiUsergroupID")
  private List<Integer> aPkiUsergroupID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiUsergroupID() {
    return aPkiUsergroupID;
  }
  public void setAPkiUsergroupID(List<Integer> aPkiUsergroupID) {
    this.aPkiUsergroupID = aPkiUsergroupID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsergroupCreateObjectV1ResponseMPayload usergroupCreateObjectV1ResponseMPayload = (UsergroupCreateObjectV1ResponseMPayload) o;
    return (this.aPkiUsergroupID == null ? usergroupCreateObjectV1ResponseMPayload.aPkiUsergroupID == null : this.aPkiUsergroupID.equals(usergroupCreateObjectV1ResponseMPayload.aPkiUsergroupID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiUsergroupID == null ? 0: this.aPkiUsergroupID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsergroupCreateObjectV1ResponseMPayload {\n");
    
    sb.append("  aPkiUsergroupID: ").append(aPkiUsergroupID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
