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
 * Payload for POST /1/object/ezsignbulksenddocumentmapping
 **/
@ApiModel(description = "Payload for POST /1/object/ezsignbulksenddocumentmapping")
public class EzsignbulksenddocumentmappingCreateObjectV1ResponseMPayload {
  
  @SerializedName("a_pkiEzsignbulksenddocumentmappingID")
  private List<Integer> aPkiEzsignbulksenddocumentmappingID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiEzsignbulksenddocumentmappingID() {
    return aPkiEzsignbulksenddocumentmappingID;
  }
  public void setAPkiEzsignbulksenddocumentmappingID(List<Integer> aPkiEzsignbulksenddocumentmappingID) {
    this.aPkiEzsignbulksenddocumentmappingID = aPkiEzsignbulksenddocumentmappingID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksenddocumentmappingCreateObjectV1ResponseMPayload ezsignbulksenddocumentmappingCreateObjectV1ResponseMPayload = (EzsignbulksenddocumentmappingCreateObjectV1ResponseMPayload) o;
    return (this.aPkiEzsignbulksenddocumentmappingID == null ? ezsignbulksenddocumentmappingCreateObjectV1ResponseMPayload.aPkiEzsignbulksenddocumentmappingID == null : this.aPkiEzsignbulksenddocumentmappingID.equals(ezsignbulksenddocumentmappingCreateObjectV1ResponseMPayload.aPkiEzsignbulksenddocumentmappingID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiEzsignbulksenddocumentmappingID == null ? 0: this.aPkiEzsignbulksenddocumentmappingID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksenddocumentmappingCreateObjectV1ResponseMPayload {\n");
    
    sb.append("  aPkiEzsignbulksenddocumentmappingID: ").append(aPkiEzsignbulksenddocumentmappingID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
