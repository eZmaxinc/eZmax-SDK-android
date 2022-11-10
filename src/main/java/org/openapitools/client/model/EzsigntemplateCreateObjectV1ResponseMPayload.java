/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
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
 * Payload for POST /1/object/ezsigntemplate
 **/
@ApiModel(description = "Payload for POST /1/object/ezsigntemplate")
public class EzsigntemplateCreateObjectV1ResponseMPayload {
  
  @SerializedName("a_pkiEzsigntemplateID")
  private List<Integer> aPkiEzsigntemplateID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiEzsigntemplateID() {
    return aPkiEzsigntemplateID;
  }
  public void setAPkiEzsigntemplateID(List<Integer> aPkiEzsigntemplateID) {
    this.aPkiEzsigntemplateID = aPkiEzsigntemplateID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplateCreateObjectV1ResponseMPayload ezsigntemplateCreateObjectV1ResponseMPayload = (EzsigntemplateCreateObjectV1ResponseMPayload) o;
    return (this.aPkiEzsigntemplateID == null ? ezsigntemplateCreateObjectV1ResponseMPayload.aPkiEzsigntemplateID == null : this.aPkiEzsigntemplateID.equals(ezsigntemplateCreateObjectV1ResponseMPayload.aPkiEzsigntemplateID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiEzsigntemplateID == null ? 0: this.aPkiEzsigntemplateID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplateCreateObjectV1ResponseMPayload {\n");
    
    sb.append("  aPkiEzsigntemplateID: ").append(aPkiEzsigntemplateID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
