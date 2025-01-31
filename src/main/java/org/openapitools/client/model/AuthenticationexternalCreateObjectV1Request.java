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
import org.openapitools.client.model.AuthenticationexternalRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/authenticationexternal
 **/
@ApiModel(description = "Request for POST /1/object/authenticationexternal")
public class AuthenticationexternalCreateObjectV1Request {
  
  @SerializedName("a_objAuthenticationexternal")
  private List<AuthenticationexternalRequestCompound> aObjAuthenticationexternal = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<AuthenticationexternalRequestCompound> getAObjAuthenticationexternal() {
    return aObjAuthenticationexternal;
  }
  public void setAObjAuthenticationexternal(List<AuthenticationexternalRequestCompound> aObjAuthenticationexternal) {
    this.aObjAuthenticationexternal = aObjAuthenticationexternal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationexternalCreateObjectV1Request authenticationexternalCreateObjectV1Request = (AuthenticationexternalCreateObjectV1Request) o;
    return (this.aObjAuthenticationexternal == null ? authenticationexternalCreateObjectV1Request.aObjAuthenticationexternal == null : this.aObjAuthenticationexternal.equals(authenticationexternalCreateObjectV1Request.aObjAuthenticationexternal));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjAuthenticationexternal == null ? 0: this.aObjAuthenticationexternal.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationexternalCreateObjectV1Request {\n");
    
    sb.append("  aObjAuthenticationexternal: ").append(aObjAuthenticationexternal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
