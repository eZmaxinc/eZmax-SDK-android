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

import org.openapitools.client.model.UsergroupmembershipRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/usergroupmembership/{pkiUsergroupmembershipID}
 **/
@ApiModel(description = "Request for PUT /1/object/usergroupmembership/{pkiUsergroupmembershipID}")
public class UsergroupmembershipEditObjectV1Request {
  
  @SerializedName("objUsergroupmembership")
  private UsergroupmembershipRequestCompound objUsergroupmembership = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public UsergroupmembershipRequestCompound getObjUsergroupmembership() {
    return objUsergroupmembership;
  }
  public void setObjUsergroupmembership(UsergroupmembershipRequestCompound objUsergroupmembership) {
    this.objUsergroupmembership = objUsergroupmembership;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsergroupmembershipEditObjectV1Request usergroupmembershipEditObjectV1Request = (UsergroupmembershipEditObjectV1Request) o;
    return (this.objUsergroupmembership == null ? usergroupmembershipEditObjectV1Request.objUsergroupmembership == null : this.objUsergroupmembership.equals(usergroupmembershipEditObjectV1Request.objUsergroupmembership));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objUsergroupmembership == null ? 0: this.objUsergroupmembership.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsergroupmembershipEditObjectV1Request {\n");
    
    sb.append("  objUsergroupmembership: ").append(objUsergroupmembership).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
