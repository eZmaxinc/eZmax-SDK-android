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
 * Payload for POST /1/object/authenticationexternal
 **/
@ApiModel(description = "Payload for POST /1/object/authenticationexternal")
public class AuthenticationexternalCreateObjectV1ResponseMPayload {
  
  @SerializedName("a_pkiAuthenticationexternalID")
  private List<Integer> aPkiAuthenticationexternalID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiAuthenticationexternalID() {
    return aPkiAuthenticationexternalID;
  }
  public void setAPkiAuthenticationexternalID(List<Integer> aPkiAuthenticationexternalID) {
    this.aPkiAuthenticationexternalID = aPkiAuthenticationexternalID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationexternalCreateObjectV1ResponseMPayload authenticationexternalCreateObjectV1ResponseMPayload = (AuthenticationexternalCreateObjectV1ResponseMPayload) o;
    return (this.aPkiAuthenticationexternalID == null ? authenticationexternalCreateObjectV1ResponseMPayload.aPkiAuthenticationexternalID == null : this.aPkiAuthenticationexternalID.equals(authenticationexternalCreateObjectV1ResponseMPayload.aPkiAuthenticationexternalID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiAuthenticationexternalID == null ? 0: this.aPkiAuthenticationexternalID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationexternalCreateObjectV1ResponseMPayload {\n");
    
    sb.append("  aPkiAuthenticationexternalID: ").append(aPkiAuthenticationexternalID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
