/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.10
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CommonResponseErrorSTemporaryFileUrlAllOf {
  
  @SerializedName("sTemporaryFileUrl")
  private String sTemporaryFileUrl = null;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonResponseErrorSTemporaryFileUrlAllOf commonResponseErrorSTemporaryFileUrlAllOf = (CommonResponseErrorSTemporaryFileUrlAllOf) o;
    return (this.sTemporaryFileUrl == null ? commonResponseErrorSTemporaryFileUrlAllOf.sTemporaryFileUrl == null : this.sTemporaryFileUrl.equals(commonResponseErrorSTemporaryFileUrlAllOf.sTemporaryFileUrl));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sTemporaryFileUrl == null ? 0: this.sTemporaryFileUrl.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonResponseErrorSTemporaryFileUrlAllOf {\n");
    
    sb.append("  sTemporaryFileUrl: ").append(sTemporaryFileUrl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
