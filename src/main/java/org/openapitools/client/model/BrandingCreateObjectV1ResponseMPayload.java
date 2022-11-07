/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.15
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
 * Payload for POST /1/object/branding
 **/
@ApiModel(description = "Payload for POST /1/object/branding")
public class BrandingCreateObjectV1ResponseMPayload {
  
  @SerializedName("a_pkiBrandingID")
  private List<Integer> aPkiBrandingID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiBrandingID() {
    return aPkiBrandingID;
  }
  public void setAPkiBrandingID(List<Integer> aPkiBrandingID) {
    this.aPkiBrandingID = aPkiBrandingID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandingCreateObjectV1ResponseMPayload brandingCreateObjectV1ResponseMPayload = (BrandingCreateObjectV1ResponseMPayload) o;
    return (this.aPkiBrandingID == null ? brandingCreateObjectV1ResponseMPayload.aPkiBrandingID == null : this.aPkiBrandingID.equals(brandingCreateObjectV1ResponseMPayload.aPkiBrandingID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiBrandingID == null ? 0: this.aPkiBrandingID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandingCreateObjectV1ResponseMPayload {\n");
    
    sb.append("  aPkiBrandingID: ").append(aPkiBrandingID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
