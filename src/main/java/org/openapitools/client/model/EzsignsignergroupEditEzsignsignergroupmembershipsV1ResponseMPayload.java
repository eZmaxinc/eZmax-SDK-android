/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
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
 * Response for PUT /1/object/ezsignsignergroup/{pkiEzsignsignergroupID}/editEzsignsignergroupmemberships
 **/
@ApiModel(description = "Response for PUT /1/object/ezsignsignergroup/{pkiEzsignsignergroupID}/editEzsignsignergroupmemberships")
public class EzsignsignergroupEditEzsignsignergroupmembershipsV1ResponseMPayload {
  
  @SerializedName("a_pkiEzsignsignergroupmembershipID")
  private List<Integer> aPkiEzsignsignergroupmembershipID = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
    EzsignsignergroupEditEzsignsignergroupmembershipsV1ResponseMPayload ezsignsignergroupEditEzsignsignergroupmembershipsV1ResponseMPayload = (EzsignsignergroupEditEzsignsignergroupmembershipsV1ResponseMPayload) o;
    return (this.aPkiEzsignsignergroupmembershipID == null ? ezsignsignergroupEditEzsignsignergroupmembershipsV1ResponseMPayload.aPkiEzsignsignergroupmembershipID == null : this.aPkiEzsignsignergroupmembershipID.equals(ezsignsignergroupEditEzsignsignergroupmembershipsV1ResponseMPayload.aPkiEzsignsignergroupmembershipID));
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
    sb.append("class EzsignsignergroupEditEzsignsignergroupmembershipsV1ResponseMPayload {\n");
    
    sb.append("  aPkiEzsignsignergroupmembershipID: ").append(aPkiEzsignsignergroupmembershipID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
