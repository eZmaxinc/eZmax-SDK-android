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

import org.openapitools.client.model.EzsignsignergroupmembershipResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/ezsignsignergroupmembership/{pkiEzsignsignergroupmembershipID}
 **/
@ApiModel(description = "Payload for GET /2/object/ezsignsignergroupmembership/{pkiEzsignsignergroupmembershipID}")
public class EzsignsignergroupmembershipGetObjectV2ResponseMPayload {
  
  @SerializedName("objEzsignsignergroupmembership")
  private EzsignsignergroupmembershipResponseCompound objEzsignsignergroupmembership = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignsignergroupmembershipResponseCompound getObjEzsignsignergroupmembership() {
    return objEzsignsignergroupmembership;
  }
  public void setObjEzsignsignergroupmembership(EzsignsignergroupmembershipResponseCompound objEzsignsignergroupmembership) {
    this.objEzsignsignergroupmembership = objEzsignsignergroupmembership;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignergroupmembershipGetObjectV2ResponseMPayload ezsignsignergroupmembershipGetObjectV2ResponseMPayload = (EzsignsignergroupmembershipGetObjectV2ResponseMPayload) o;
    return (this.objEzsignsignergroupmembership == null ? ezsignsignergroupmembershipGetObjectV2ResponseMPayload.objEzsignsignergroupmembership == null : this.objEzsignsignergroupmembership.equals(ezsignsignergroupmembershipGetObjectV2ResponseMPayload.objEzsignsignergroupmembership));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignsignergroupmembership == null ? 0: this.objEzsignsignergroupmembership.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignergroupmembershipGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objEzsignsignergroupmembership: ").append(objEzsignsignergroupmembership).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
