/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
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
 * Payload for POST /1/object/ezsigntemplatedocument
 **/
@ApiModel(description = "Payload for POST /1/object/ezsigntemplatedocument")
public class EzsigntemplatedocumentCreateObjectV1ResponseMPayload {
  
  @SerializedName("a_pkiEzsigntemplatedocumentID")
  private List<Integer> aPkiEzsigntemplatedocumentID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiEzsigntemplatedocumentID() {
    return aPkiEzsigntemplatedocumentID;
  }
  public void setAPkiEzsigntemplatedocumentID(List<Integer> aPkiEzsigntemplatedocumentID) {
    this.aPkiEzsigntemplatedocumentID = aPkiEzsigntemplatedocumentID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatedocumentCreateObjectV1ResponseMPayload ezsigntemplatedocumentCreateObjectV1ResponseMPayload = (EzsigntemplatedocumentCreateObjectV1ResponseMPayload) o;
    return (this.aPkiEzsigntemplatedocumentID == null ? ezsigntemplatedocumentCreateObjectV1ResponseMPayload.aPkiEzsigntemplatedocumentID == null : this.aPkiEzsigntemplatedocumentID.equals(ezsigntemplatedocumentCreateObjectV1ResponseMPayload.aPkiEzsigntemplatedocumentID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiEzsigntemplatedocumentID == null ? 0: this.aPkiEzsigntemplatedocumentID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatedocumentCreateObjectV1ResponseMPayload {\n");
    
    sb.append("  aPkiEzsigntemplatedocumentID: ").append(aPkiEzsigntemplatedocumentID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
