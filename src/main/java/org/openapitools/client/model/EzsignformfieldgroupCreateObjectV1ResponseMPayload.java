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
 * Payload for POST /1/object/ezsignformfieldgroup
 **/
@ApiModel(description = "Payload for POST /1/object/ezsignformfieldgroup")
public class EzsignformfieldgroupCreateObjectV1ResponseMPayload {
  
  @SerializedName("a_pkiEzsignformfieldgroupID")
  private List<Integer> aPkiEzsignformfieldgroupID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiEzsignformfieldgroupID() {
    return aPkiEzsignformfieldgroupID;
  }
  public void setAPkiEzsignformfieldgroupID(List<Integer> aPkiEzsignformfieldgroupID) {
    this.aPkiEzsignformfieldgroupID = aPkiEzsignformfieldgroupID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignformfieldgroupCreateObjectV1ResponseMPayload ezsignformfieldgroupCreateObjectV1ResponseMPayload = (EzsignformfieldgroupCreateObjectV1ResponseMPayload) o;
    return (this.aPkiEzsignformfieldgroupID == null ? ezsignformfieldgroupCreateObjectV1ResponseMPayload.aPkiEzsignformfieldgroupID == null : this.aPkiEzsignformfieldgroupID.equals(ezsignformfieldgroupCreateObjectV1ResponseMPayload.aPkiEzsignformfieldgroupID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiEzsignformfieldgroupID == null ? 0: this.aPkiEzsignformfieldgroupID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignformfieldgroupCreateObjectV1ResponseMPayload {\n");
    
    sb.append("  aPkiEzsignformfieldgroupID: ").append(aPkiEzsignformfieldgroupID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
