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
 * Payload for POST /1/object/ezsignannotation
 **/
@ApiModel(description = "Payload for POST /1/object/ezsignannotation")
public class EzsignannotationCreateObjectV1ResponseMPayload {
  
  @SerializedName("a_pkiEzsignannotationID")
  private List<Integer> aPkiEzsignannotationID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiEzsignannotationID() {
    return aPkiEzsignannotationID;
  }
  public void setAPkiEzsignannotationID(List<Integer> aPkiEzsignannotationID) {
    this.aPkiEzsignannotationID = aPkiEzsignannotationID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignannotationCreateObjectV1ResponseMPayload ezsignannotationCreateObjectV1ResponseMPayload = (EzsignannotationCreateObjectV1ResponseMPayload) o;
    return (this.aPkiEzsignannotationID == null ? ezsignannotationCreateObjectV1ResponseMPayload.aPkiEzsignannotationID == null : this.aPkiEzsignannotationID.equals(ezsignannotationCreateObjectV1ResponseMPayload.aPkiEzsignannotationID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiEzsignannotationID == null ? 0: this.aPkiEzsignannotationID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignannotationCreateObjectV1ResponseMPayload {\n");
    
    sb.append("  aPkiEzsignannotationID: ").append(aPkiEzsignannotationID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
