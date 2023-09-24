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
 * Payload for POST /1/object/subnet
 **/
@ApiModel(description = "Payload for POST /1/object/subnet")
public class SubnetCreateObjectV1ResponseMPayload {
  
  @SerializedName("a_pkiSubnetID")
  private List<Integer> aPkiSubnetID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiSubnetID() {
    return aPkiSubnetID;
  }
  public void setAPkiSubnetID(List<Integer> aPkiSubnetID) {
    this.aPkiSubnetID = aPkiSubnetID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubnetCreateObjectV1ResponseMPayload subnetCreateObjectV1ResponseMPayload = (SubnetCreateObjectV1ResponseMPayload) o;
    return (this.aPkiSubnetID == null ? subnetCreateObjectV1ResponseMPayload.aPkiSubnetID == null : this.aPkiSubnetID.equals(subnetCreateObjectV1ResponseMPayload.aPkiSubnetID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiSubnetID == null ? 0: this.aPkiSubnetID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubnetCreateObjectV1ResponseMPayload {\n");
    
    sb.append("  aPkiSubnetID: ").append(aPkiSubnetID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
