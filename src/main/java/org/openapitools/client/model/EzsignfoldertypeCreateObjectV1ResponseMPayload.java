/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.12
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
 * Payload for POST /1/object/ezsignfoldertype
 **/
@ApiModel(description = "Payload for POST /1/object/ezsignfoldertype")
public class EzsignfoldertypeCreateObjectV1ResponseMPayload {
  
  @SerializedName("a_pkiEzsignfoldertypeID")
  private List<Integer> aPkiEzsignfoldertypeID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiEzsignfoldertypeID() {
    return aPkiEzsignfoldertypeID;
  }
  public void setAPkiEzsignfoldertypeID(List<Integer> aPkiEzsignfoldertypeID) {
    this.aPkiEzsignfoldertypeID = aPkiEzsignfoldertypeID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfoldertypeCreateObjectV1ResponseMPayload ezsignfoldertypeCreateObjectV1ResponseMPayload = (EzsignfoldertypeCreateObjectV1ResponseMPayload) o;
    return (this.aPkiEzsignfoldertypeID == null ? ezsignfoldertypeCreateObjectV1ResponseMPayload.aPkiEzsignfoldertypeID == null : this.aPkiEzsignfoldertypeID.equals(ezsignfoldertypeCreateObjectV1ResponseMPayload.aPkiEzsignfoldertypeID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiEzsignfoldertypeID == null ? 0: this.aPkiEzsignfoldertypeID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldertypeCreateObjectV1ResponseMPayload {\n");
    
    sb.append("  aPkiEzsignfoldertypeID: ").append(aPkiEzsignfoldertypeID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
