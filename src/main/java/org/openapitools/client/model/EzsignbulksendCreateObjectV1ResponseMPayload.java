/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
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
 * Payload for POST /1/object/ezsignbulksend
 **/
@ApiModel(description = "Payload for POST /1/object/ezsignbulksend")
public class EzsignbulksendCreateObjectV1ResponseMPayload {
  
  @SerializedName("a_pkiEzsignbulksendID")
  private List<Integer> aPkiEzsignbulksendID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiEzsignbulksendID() {
    return aPkiEzsignbulksendID;
  }
  public void setAPkiEzsignbulksendID(List<Integer> aPkiEzsignbulksendID) {
    this.aPkiEzsignbulksendID = aPkiEzsignbulksendID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksendCreateObjectV1ResponseMPayload ezsignbulksendCreateObjectV1ResponseMPayload = (EzsignbulksendCreateObjectV1ResponseMPayload) o;
    return (this.aPkiEzsignbulksendID == null ? ezsignbulksendCreateObjectV1ResponseMPayload.aPkiEzsignbulksendID == null : this.aPkiEzsignbulksendID.equals(ezsignbulksendCreateObjectV1ResponseMPayload.aPkiEzsignbulksendID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiEzsignbulksendID == null ? 0: this.aPkiEzsignbulksendID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendCreateObjectV1ResponseMPayload {\n");
    
    sb.append("  aPkiEzsignbulksendID: ").append(aPkiEzsignbulksendID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
