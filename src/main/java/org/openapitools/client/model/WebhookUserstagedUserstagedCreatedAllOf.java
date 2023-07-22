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

import org.openapitools.client.model.UserstagedResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class WebhookUserstagedUserstagedCreatedAllOf {
  
  @SerializedName("objUserstaged")
  private UserstagedResponseCompound objUserstaged = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public UserstagedResponseCompound getObjUserstaged() {
    return objUserstaged;
  }
  public void setObjUserstaged(UserstagedResponseCompound objUserstaged) {
    this.objUserstaged = objUserstaged;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookUserstagedUserstagedCreatedAllOf webhookUserstagedUserstagedCreatedAllOf = (WebhookUserstagedUserstagedCreatedAllOf) o;
    return (this.objUserstaged == null ? webhookUserstagedUserstagedCreatedAllOf.objUserstaged == null : this.objUserstaged.equals(webhookUserstagedUserstagedCreatedAllOf.objUserstaged));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objUserstaged == null ? 0: this.objUserstaged.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookUserstagedUserstagedCreatedAllOf {\n");
    
    sb.append("  objUserstaged: ").append(objUserstaged).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
