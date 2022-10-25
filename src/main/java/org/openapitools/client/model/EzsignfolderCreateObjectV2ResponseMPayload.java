/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
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
 * Payload for POST /2/object/ezsignfolder
 **/
@ApiModel(description = "Payload for POST /2/object/ezsignfolder")
public class EzsignfolderCreateObjectV2ResponseMPayload {
  
  @SerializedName("a_pkiEzsignfolderID")
  private List<Integer> aPkiEzsignfolderID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiEzsignfolderID() {
    return aPkiEzsignfolderID;
  }
  public void setAPkiEzsignfolderID(List<Integer> aPkiEzsignfolderID) {
    this.aPkiEzsignfolderID = aPkiEzsignfolderID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderCreateObjectV2ResponseMPayload ezsignfolderCreateObjectV2ResponseMPayload = (EzsignfolderCreateObjectV2ResponseMPayload) o;
    return (this.aPkiEzsignfolderID == null ? ezsignfolderCreateObjectV2ResponseMPayload.aPkiEzsignfolderID == null : this.aPkiEzsignfolderID.equals(ezsignfolderCreateObjectV2ResponseMPayload.aPkiEzsignfolderID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiEzsignfolderID == null ? 0: this.aPkiEzsignfolderID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderCreateObjectV2ResponseMPayload {\n");
    
    sb.append("  aPkiEzsignfolderID: ").append(aPkiEzsignfolderID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
