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
 * Request for POST /1/object/ezsignbulksend/{pkiEzsignbulksendID}/reorder
 **/
@ApiModel(description = "Request for POST /1/object/ezsignbulksend/{pkiEzsignbulksendID}/reorder")
public class EzsignbulksendReorderV1Request {
  
  @SerializedName("a_pkiEzsignbulksenddocumentmappingID")
  private List<Integer> aPkiEzsignbulksenddocumentmappingID = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
    EzsignbulksendReorderV1Request ezsignbulksendReorderV1Request = (EzsignbulksendReorderV1Request) o;
    return (this.aPkiEzsignbulksenddocumentmappingID == null ? ezsignbulksendReorderV1Request.aPkiEzsignbulksenddocumentmappingID == null : this.aPkiEzsignbulksenddocumentmappingID.equals(ezsignbulksendReorderV1Request.aPkiEzsignbulksenddocumentmappingID));
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
    sb.append("class EzsignbulksendReorderV1Request {\n");
    
    sb.append("  aPkiEzsignbulksenddocumentmappingID: ").append(aPkiEzsignbulksenddocumentmappingID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
