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

import org.openapitools.client.model.EzsignuserResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/ezsignuser/{pkiEzsignuserID}
 **/
@ApiModel(description = "Payload for GET /2/object/ezsignuser/{pkiEzsignuserID}")
public class EzsignuserGetObjectV2ResponseMPayload {
  
  @SerializedName("objEzsignuser")
  private EzsignuserResponseCompound objEzsignuser = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignuserResponseCompound getObjEzsignuser() {
    return objEzsignuser;
  }
  public void setObjEzsignuser(EzsignuserResponseCompound objEzsignuser) {
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
    EzsignuserGetObjectV2ResponseMPayload ezsignuserGetObjectV2ResponseMPayload = (EzsignuserGetObjectV2ResponseMPayload) o;
    return (this.objEzsignuser == null ? ezsignuserGetObjectV2ResponseMPayload.objEzsignuser == null : this.objEzsignuser.equals(ezsignuserGetObjectV2ResponseMPayload.objEzsignuser));
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
    sb.append("class EzsignuserGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objEzsignuser: ").append(objEzsignuser).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
