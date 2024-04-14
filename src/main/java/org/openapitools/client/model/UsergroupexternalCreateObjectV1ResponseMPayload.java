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
 * Payload for POST /1/object/usergroupexternal
 **/
@ApiModel(description = "Payload for POST /1/object/usergroupexternal")
public class UsergroupexternalCreateObjectV1ResponseMPayload {
  
  @SerializedName("a_pkiUsergroupexternalID")
  private List<Integer> aPkiUsergroupexternalID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiUsergroupexternalID() {
    return aPkiUsergroupexternalID;
  }
  public void setAPkiUsergroupexternalID(List<Integer> aPkiUsergroupexternalID) {
    this.aPkiUsergroupexternalID = aPkiUsergroupexternalID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsergroupexternalCreateObjectV1ResponseMPayload usergroupexternalCreateObjectV1ResponseMPayload = (UsergroupexternalCreateObjectV1ResponseMPayload) o;
    return (this.aPkiUsergroupexternalID == null ? usergroupexternalCreateObjectV1ResponseMPayload.aPkiUsergroupexternalID == null : this.aPkiUsergroupexternalID.equals(usergroupexternalCreateObjectV1ResponseMPayload.aPkiUsergroupexternalID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiUsergroupexternalID == null ? 0: this.aPkiUsergroupexternalID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsergroupexternalCreateObjectV1ResponseMPayload {\n");
    
    sb.append("  aPkiUsergroupexternalID: ").append(aPkiUsergroupexternalID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}