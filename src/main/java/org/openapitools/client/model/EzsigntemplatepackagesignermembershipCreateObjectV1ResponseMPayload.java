/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.9
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
 * Payload for POST /1/object/ezsigntemplatepackagesignermembership
 **/
@ApiModel(description = "Payload for POST /1/object/ezsigntemplatepackagesignermembership")
public class EzsigntemplatepackagesignermembershipCreateObjectV1ResponseMPayload {
  
  @SerializedName("a_pkiEzsigntemplatepackagesignermembershipID")
  private List<Integer> aPkiEzsigntemplatepackagesignermembershipID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiEzsigntemplatepackagesignermembershipID() {
    return aPkiEzsigntemplatepackagesignermembershipID;
  }
  public void setAPkiEzsigntemplatepackagesignermembershipID(List<Integer> aPkiEzsigntemplatepackagesignermembershipID) {
    this.aPkiEzsigntemplatepackagesignermembershipID = aPkiEzsigntemplatepackagesignermembershipID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatepackagesignermembershipCreateObjectV1ResponseMPayload ezsigntemplatepackagesignermembershipCreateObjectV1ResponseMPayload = (EzsigntemplatepackagesignermembershipCreateObjectV1ResponseMPayload) o;
    return (this.aPkiEzsigntemplatepackagesignermembershipID == null ? ezsigntemplatepackagesignermembershipCreateObjectV1ResponseMPayload.aPkiEzsigntemplatepackagesignermembershipID == null : this.aPkiEzsigntemplatepackagesignermembershipID.equals(ezsigntemplatepackagesignermembershipCreateObjectV1ResponseMPayload.aPkiEzsigntemplatepackagesignermembershipID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiEzsigntemplatepackagesignermembershipID == null ? 0: this.aPkiEzsigntemplatepackagesignermembershipID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepackagesignermembershipCreateObjectV1ResponseMPayload {\n");
    
    sb.append("  aPkiEzsigntemplatepackagesignermembershipID: ").append(aPkiEzsigntemplatepackagesignermembershipID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
