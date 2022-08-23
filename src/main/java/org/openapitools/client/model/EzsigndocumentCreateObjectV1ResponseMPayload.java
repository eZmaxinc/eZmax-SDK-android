/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.10
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
 * Payload for POST /1/object/ezsigndocument
 **/
@ApiModel(description = "Payload for POST /1/object/ezsigndocument")
public class EzsigndocumentCreateObjectV1ResponseMPayload {
  
  @SerializedName("a_pkiEzsigndocumentID")
  private List<Integer> aPkiEzsigndocumentID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiEzsigndocumentID() {
    return aPkiEzsigndocumentID;
  }
  public void setAPkiEzsigndocumentID(List<Integer> aPkiEzsigndocumentID) {
    this.aPkiEzsigndocumentID = aPkiEzsigndocumentID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentCreateObjectV1ResponseMPayload ezsigndocumentCreateObjectV1ResponseMPayload = (EzsigndocumentCreateObjectV1ResponseMPayload) o;
    return (this.aPkiEzsigndocumentID == null ? ezsigndocumentCreateObjectV1ResponseMPayload.aPkiEzsigndocumentID == null : this.aPkiEzsigndocumentID.equals(ezsigndocumentCreateObjectV1ResponseMPayload.aPkiEzsigndocumentID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiEzsigndocumentID == null ? 0: this.aPkiEzsigndocumentID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentCreateObjectV1ResponseMPayload {\n");
    
    sb.append("  aPkiEzsigndocumentID: ").append(aPkiEzsigndocumentID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
