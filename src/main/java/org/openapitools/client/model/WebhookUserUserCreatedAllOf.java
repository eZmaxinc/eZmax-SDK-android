/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.9
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.UserResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class WebhookUserUserCreatedAllOf {
  
  @SerializedName("objUser")
  private UserResponseCompound objUser = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public UserResponseCompound getObjUser() {
    return objUser;
  }
  public void setObjUser(UserResponseCompound objUser) {
    this.objUser = objUser;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookUserUserCreatedAllOf webhookUserUserCreatedAllOf = (WebhookUserUserCreatedAllOf) o;
    return (this.objUser == null ? webhookUserUserCreatedAllOf.objUser == null : this.objUser.equals(webhookUserUserCreatedAllOf.objUser));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objUser == null ? 0: this.objUser.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookUserUserCreatedAllOf {\n");
    
    sb.append("  objUser: ").append(objUser).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
