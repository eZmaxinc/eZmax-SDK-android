/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
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
 * Generic Warning Message
 **/
@ApiModel(description = "Generic Warning Message")
public class CommonResponseWarning {
  
  @SerializedName("sWarningMessage")
  private String sWarningMessage = null;
  @SerializedName("eWarningCode")
  private String eWarningCode = null;

  /**
   * More detail about the warning
   **/
  @ApiModelProperty(required = true, value = "More detail about the warning")
  public String getSWarningMessage() {
    return sWarningMessage;
  }
  public void setSWarningMessage(String sWarningMessage) {
    this.sWarningMessage = sWarningMessage;
  }

  /**
   * The warning code. See documentation for valid values
   **/
  @ApiModelProperty(required = true, value = "The warning code. See documentation for valid values")
  public String getEWarningCode() {
    return eWarningCode;
  }
  public void setEWarningCode(String eWarningCode) {
    this.eWarningCode = eWarningCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonResponseWarning commonResponseWarning = (CommonResponseWarning) o;
    return (this.sWarningMessage == null ? commonResponseWarning.sWarningMessage == null : this.sWarningMessage.equals(commonResponseWarning.sWarningMessage)) &&
        (this.eWarningCode == null ? commonResponseWarning.eWarningCode == null : this.eWarningCode.equals(commonResponseWarning.eWarningCode));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sWarningMessage == null ? 0: this.sWarningMessage.hashCode());
    result = 31 * result + (this.eWarningCode == null ? 0: this.eWarningCode.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonResponseWarning {\n");
    
    sb.append("  sWarningMessage: ").append(sWarningMessage).append("\n");
    sb.append("  eWarningCode: ").append(eWarningCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
