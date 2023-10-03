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
 * Payload for POST /1/object/cors
 **/
@ApiModel(description = "Payload for POST /1/object/cors")
public class CorsCreateObjectV1ResponseMPayload {
  
  @SerializedName("a_pkiCorsID")
  private List<Integer> aPkiCorsID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiCorsID() {
    return aPkiCorsID;
  }
  public void setAPkiCorsID(List<Integer> aPkiCorsID) {
    this.aPkiCorsID = aPkiCorsID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorsCreateObjectV1ResponseMPayload corsCreateObjectV1ResponseMPayload = (CorsCreateObjectV1ResponseMPayload) o;
    return (this.aPkiCorsID == null ? corsCreateObjectV1ResponseMPayload.aPkiCorsID == null : this.aPkiCorsID.equals(corsCreateObjectV1ResponseMPayload.aPkiCorsID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiCorsID == null ? 0: this.aPkiCorsID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorsCreateObjectV1ResponseMPayload {\n");
    
    sb.append("  aPkiCorsID: ").append(aPkiCorsID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}