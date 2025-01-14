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

import org.openapitools.client.model.EzsignuserRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/ezsignuser/{pkiEzsignuserID}
 **/
@ApiModel(description = "Request for PUT /1/object/ezsignuser/{pkiEzsignuserID}")
public class EzsignuserEditObjectV1Request {
  
  @SerializedName("objEzsignuser")
  private EzsignuserRequestCompound objEzsignuser = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignuserRequestCompound getObjEzsignuser() {
    return objEzsignuser;
  }
  public void setObjEzsignuser(EzsignuserRequestCompound objEzsignuser) {
    this.objEzsignuser = objEzsignuser;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignuserEditObjectV1Request ezsignuserEditObjectV1Request = (EzsignuserEditObjectV1Request) o;
    return (this.objEzsignuser == null ? ezsignuserEditObjectV1Request.objEzsignuser == null : this.objEzsignuser.equals(ezsignuserEditObjectV1Request.objEzsignuser));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignuser == null ? 0: this.objEzsignuser.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignuserEditObjectV1Request {\n");
    
    sb.append("  objEzsignuser: ").append(objEzsignuser).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
