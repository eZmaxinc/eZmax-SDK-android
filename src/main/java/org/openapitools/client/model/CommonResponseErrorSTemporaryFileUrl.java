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

import org.openapitools.client.model.CommonResponseError;
import org.openapitools.client.model.CommonResponseErrorSTemporaryFileUrlAllOf;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Generic Error Message
 **/
@ApiModel(description = "Generic Error Message")
public class CommonResponseErrorSTemporaryFileUrl {
  
  @SerializedName("sTemporaryFileUrl")
  private String sTemporaryFileUrl = null;
  @SerializedName("sErrorMessage")
  private String sErrorMessage = null;
  @SerializedName("eErrorCode")
  private String eErrorCode = null;

  /**
   * The Temporary File Url of the document that was uploaded. That url can be reused instead of uploading the file again.
   **/
  @ApiModelProperty(value = "The Temporary File Url of the document that was uploaded. That url can be reused instead of uploading the file again.")
  public String getSTemporaryFileUrl() {
    return sTemporaryFileUrl;
  }
  public void setSTemporaryFileUrl(String sTemporaryFileUrl) {
    this.sTemporaryFileUrl = sTemporaryFileUrl;
  }

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

  /**
   * The error code. See documentation for valid values
   **/
  @ApiModelProperty(required = true, value = "The error code. See documentation for valid values")
  public String getEErrorCode() {
    return eErrorCode;
  }
  public void setEErrorCode(String eErrorCode) {
    this.eErrorCode = eErrorCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonResponseErrorSTemporaryFileUrl commonResponseErrorSTemporaryFileUrl = (CommonResponseErrorSTemporaryFileUrl) o;
    return (this.sTemporaryFileUrl == null ? commonResponseErrorSTemporaryFileUrl.sTemporaryFileUrl == null : this.sTemporaryFileUrl.equals(commonResponseErrorSTemporaryFileUrl.sTemporaryFileUrl)) &&
        (this.sErrorMessage == null ? commonResponseErrorSTemporaryFileUrl.sErrorMessage == null : this.sErrorMessage.equals(commonResponseErrorSTemporaryFileUrl.sErrorMessage)) &&
        (this.eErrorCode == null ? commonResponseErrorSTemporaryFileUrl.eErrorCode == null : this.eErrorCode.equals(commonResponseErrorSTemporaryFileUrl.eErrorCode));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sTemporaryFileUrl == null ? 0: this.sTemporaryFileUrl.hashCode());
    result = 31 * result + (this.sErrorMessage == null ? 0: this.sErrorMessage.hashCode());
    result = 31 * result + (this.eErrorCode == null ? 0: this.eErrorCode.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonResponseErrorSTemporaryFileUrl {\n");
    
    sb.append("  sTemporaryFileUrl: ").append(sTemporaryFileUrl).append("\n");
    sb.append("  sErrorMessage: ").append(sErrorMessage).append("\n");
    sb.append("  eErrorCode: ").append(eErrorCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
