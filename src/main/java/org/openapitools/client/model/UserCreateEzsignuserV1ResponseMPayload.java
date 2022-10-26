/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.12
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
 * Payload for POST /1/module/user/createEzsignuser
 **/
@ApiModel(description = "Payload for POST /1/module/user/createEzsignuser")
public class UserCreateEzsignuserV1ResponseMPayload {
  
  @SerializedName("a_sEmailAddressSuccess")
  private List<String> aSEmailAddressSuccess = null;
  @SerializedName("a_sEmailAddressFailure")
  private List<String> aSEmailAddressFailure = null;

  /**
   * An array of email addresses that succeeded.
   **/
  @ApiModelProperty(required = true, value = "An array of email addresses that succeeded.")
  public List<String> getASEmailAddressSuccess() {
    return aSEmailAddressSuccess;
  }
  public void setASEmailAddressSuccess(List<String> aSEmailAddressSuccess) {
    this.aSEmailAddressSuccess = aSEmailAddressSuccess;
  }

  /**
   * An array of email addresses that failed.
   **/
  @ApiModelProperty(required = true, value = "An array of email addresses that failed.")
  public List<String> getASEmailAddressFailure() {
    return aSEmailAddressFailure;
  }
  public void setASEmailAddressFailure(List<String> aSEmailAddressFailure) {
    this.aSEmailAddressFailure = aSEmailAddressFailure;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCreateEzsignuserV1ResponseMPayload userCreateEzsignuserV1ResponseMPayload = (UserCreateEzsignuserV1ResponseMPayload) o;
    return (this.aSEmailAddressSuccess == null ? userCreateEzsignuserV1ResponseMPayload.aSEmailAddressSuccess == null : this.aSEmailAddressSuccess.equals(userCreateEzsignuserV1ResponseMPayload.aSEmailAddressSuccess)) &&
        (this.aSEmailAddressFailure == null ? userCreateEzsignuserV1ResponseMPayload.aSEmailAddressFailure == null : this.aSEmailAddressFailure.equals(userCreateEzsignuserV1ResponseMPayload.aSEmailAddressFailure));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aSEmailAddressSuccess == null ? 0: this.aSEmailAddressSuccess.hashCode());
    result = 31 * result + (this.aSEmailAddressFailure == null ? 0: this.aSEmailAddressFailure.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCreateEzsignuserV1ResponseMPayload {\n");
    
    sb.append("  aSEmailAddressSuccess: ").append(aSEmailAddressSuccess).append("\n");
    sb.append("  aSEmailAddressFailure: ").append(aSEmailAddressFailure).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
