/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.41
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Generic Error Message
 **/
@ApiModel(description = "Generic Error Message")
public class CommonResponseError {
  
  @SerializedName("sErrorMessage")
  private String sErrorMessage = null;

  /**
   * More detail about the error
   **/
  @ApiModelProperty(required = true, value = "More detail about the error")
  public String getSErrorMessage() {
    return sErrorMessage;
  }
  public void setSErrorMessage(String sErrorMessage) {
    this.sErrorMessage = sErrorMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonResponseError commonResponseError = (CommonResponseError) o;
    return (this.sErrorMessage == null ? commonResponseError.sErrorMessage == null : this.sErrorMessage.equals(commonResponseError.sErrorMessage));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sErrorMessage == null ? 0: this.sErrorMessage.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonResponseError {\n");
    
    sb.append("  sErrorMessage: ").append(sErrorMessage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
