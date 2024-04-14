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
 * Payload for POST /2/object/franchisereferalincome
 **/
@ApiModel(description = "Payload for POST /2/object/franchisereferalincome")
public class FranchisereferalincomeCreateObjectV2ResponseMPayload {
  
  @SerializedName("a_pkiFranchisereferalincomeID")
  private List<Integer> aPkiFranchisereferalincomeID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiFranchisereferalincomeID() {
    return aPkiFranchisereferalincomeID;
  }
  public void setAPkiFranchisereferalincomeID(List<Integer> aPkiFranchisereferalincomeID) {
    this.aPkiFranchisereferalincomeID = aPkiFranchisereferalincomeID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FranchisereferalincomeCreateObjectV2ResponseMPayload franchisereferalincomeCreateObjectV2ResponseMPayload = (FranchisereferalincomeCreateObjectV2ResponseMPayload) o;
    return (this.aPkiFranchisereferalincomeID == null ? franchisereferalincomeCreateObjectV2ResponseMPayload.aPkiFranchisereferalincomeID == null : this.aPkiFranchisereferalincomeID.equals(franchisereferalincomeCreateObjectV2ResponseMPayload.aPkiFranchisereferalincomeID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiFranchisereferalincomeID == null ? 0: this.aPkiFranchisereferalincomeID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FranchisereferalincomeCreateObjectV2ResponseMPayload {\n");
    
    sb.append("  aPkiFranchisereferalincomeID: ").append(aPkiFranchisereferalincomeID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
