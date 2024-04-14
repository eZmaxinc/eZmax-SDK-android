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
 * Payload for POST /1/object/ezsignsignergroupmembership
 **/
@ApiModel(description = "Payload for POST /1/object/ezsignsignergroupmembership")
public class EzsignsignergroupmembershipCreateObjectV1ResponseMPayload {
  
  @SerializedName("a_pkiEzsignsignergroupmembershipID")
  private List<Integer> aPkiEzsignsignergroupmembershipID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiEzsignsignergroupmembershipID() {
    return aPkiEzsignsignergroupmembershipID;
  }
  public void setAPkiEzsignsignergroupmembershipID(List<Integer> aPkiEzsignsignergroupmembershipID) {
    this.aPkiEzsignsignergroupmembershipID = aPkiEzsignsignergroupmembershipID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignergroupmembershipCreateObjectV1ResponseMPayload ezsignsignergroupmembershipCreateObjectV1ResponseMPayload = (EzsignsignergroupmembershipCreateObjectV1ResponseMPayload) o;
    return (this.aPkiEzsignsignergroupmembershipID == null ? ezsignsignergroupmembershipCreateObjectV1ResponseMPayload.aPkiEzsignsignergroupmembershipID == null : this.aPkiEzsignsignergroupmembershipID.equals(ezsignsignergroupmembershipCreateObjectV1ResponseMPayload.aPkiEzsignsignergroupmembershipID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiEzsignsignergroupmembershipID == null ? 0: this.aPkiEzsignsignergroupmembershipID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignergroupmembershipCreateObjectV1ResponseMPayload {\n");
    
    sb.append("  aPkiEzsignsignergroupmembershipID: ").append(aPkiEzsignsignergroupmembershipID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
