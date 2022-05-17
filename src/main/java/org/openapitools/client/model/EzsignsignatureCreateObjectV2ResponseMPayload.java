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
 * Payload for POST /2/object/ezsignsignature
 **/
@ApiModel(description = "Payload for POST /2/object/ezsignsignature")
public class EzsignsignatureCreateObjectV2ResponseMPayload {
  
  @SerializedName("a_pkiEzsignsignatureID")
  private List<Integer> aPkiEzsignsignatureID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiEzsignsignatureID() {
    return aPkiEzsignsignatureID;
  }
  public void setAPkiEzsignsignatureID(List<Integer> aPkiEzsignsignatureID) {
    this.aPkiEzsignsignatureID = aPkiEzsignsignatureID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignatureCreateObjectV2ResponseMPayload ezsignsignatureCreateObjectV2ResponseMPayload = (EzsignsignatureCreateObjectV2ResponseMPayload) o;
    return (this.aPkiEzsignsignatureID == null ? ezsignsignatureCreateObjectV2ResponseMPayload.aPkiEzsignsignatureID == null : this.aPkiEzsignsignatureID.equals(ezsignsignatureCreateObjectV2ResponseMPayload.aPkiEzsignsignatureID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiEzsignsignatureID == null ? 0: this.aPkiEzsignsignatureID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignatureCreateObjectV2ResponseMPayload {\n");
    
    sb.append("  aPkiEzsignsignatureID: ").append(aPkiEzsignsignatureID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
