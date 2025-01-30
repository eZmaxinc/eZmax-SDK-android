/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.AuthenticationexternalResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/authenticationexternal/{pkiAuthenticationexternalID}
 **/
@ApiModel(description = "Payload for GET /2/object/authenticationexternal/{pkiAuthenticationexternalID}")
public class AuthenticationexternalGetObjectV2ResponseMPayload {
  
  @SerializedName("objAuthenticationexternal")
  private AuthenticationexternalResponseCompound objAuthenticationexternal = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public AuthenticationexternalResponseCompound getObjAuthenticationexternal() {
    return objAuthenticationexternal;
  }
  public void setObjAuthenticationexternal(AuthenticationexternalResponseCompound objAuthenticationexternal) {
    this.objAuthenticationexternal = objAuthenticationexternal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationexternalGetObjectV2ResponseMPayload authenticationexternalGetObjectV2ResponseMPayload = (AuthenticationexternalGetObjectV2ResponseMPayload) o;
    return (this.objAuthenticationexternal == null ? authenticationexternalGetObjectV2ResponseMPayload.objAuthenticationexternal == null : this.objAuthenticationexternal.equals(authenticationexternalGetObjectV2ResponseMPayload.objAuthenticationexternal));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objAuthenticationexternal == null ? 0: this.objAuthenticationexternal.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationexternalGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objAuthenticationexternal: ").append(objAuthenticationexternal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
