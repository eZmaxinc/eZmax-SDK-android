/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
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
 * Payload for POST /1/object/ezsigntemplatesignature
 **/
@ApiModel(description = "Payload for POST /1/object/ezsigntemplatesignature")
public class EzsigntemplatesignatureCreateObjectV1ResponseMPayload {
  
  @SerializedName("a_pkiEzsigntemplatesignatureID")
  private List<Integer> aPkiEzsigntemplatesignatureID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiEzsigntemplatesignatureID() {
    return aPkiEzsigntemplatesignatureID;
  }
  public void setAPkiEzsigntemplatesignatureID(List<Integer> aPkiEzsigntemplatesignatureID) {
    this.aPkiEzsigntemplatesignatureID = aPkiEzsigntemplatesignatureID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatesignatureCreateObjectV1ResponseMPayload ezsigntemplatesignatureCreateObjectV1ResponseMPayload = (EzsigntemplatesignatureCreateObjectV1ResponseMPayload) o;
    return (this.aPkiEzsigntemplatesignatureID == null ? ezsigntemplatesignatureCreateObjectV1ResponseMPayload.aPkiEzsigntemplatesignatureID == null : this.aPkiEzsigntemplatesignatureID.equals(ezsigntemplatesignatureCreateObjectV1ResponseMPayload.aPkiEzsigntemplatesignatureID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiEzsigntemplatesignatureID == null ? 0: this.aPkiEzsigntemplatesignatureID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatesignatureCreateObjectV1ResponseMPayload {\n");
    
    sb.append("  aPkiEzsigntemplatesignatureID: ").append(aPkiEzsigntemplatesignatureID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}