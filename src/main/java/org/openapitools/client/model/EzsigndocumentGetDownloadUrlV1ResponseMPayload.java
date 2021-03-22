/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.38
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
 * Payload for the /1/object/ezsigndocument/{pkiEzsigndocument}/getDownloadUrl API Request
 **/
@ApiModel(description = "Payload for the /1/object/ezsigndocument/{pkiEzsigndocument}/getDownloadUrl API Request")
public class EzsigndocumentGetDownloadUrlV1ResponseMPayload {
  
  @SerializedName("sDownloadUrl")
  private String sDownloadUrl = null;

  /**
   * The Url to the requested document.  Url will expire after 5 minutes.
   **/
  @ApiModelProperty(required = true, value = "The Url to the requested document.  Url will expire after 5 minutes.")
  public String getSDownloadUrl() {
    return sDownloadUrl;
  }
  public void setSDownloadUrl(String sDownloadUrl) {
    this.sDownloadUrl = sDownloadUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentGetDownloadUrlV1ResponseMPayload ezsigndocumentGetDownloadUrlV1ResponseMPayload = (EzsigndocumentGetDownloadUrlV1ResponseMPayload) o;
    return (this.sDownloadUrl == null ? ezsigndocumentGetDownloadUrlV1ResponseMPayload.sDownloadUrl == null : this.sDownloadUrl.equals(ezsigndocumentGetDownloadUrlV1ResponseMPayload.sDownloadUrl));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sDownloadUrl == null ? 0: this.sDownloadUrl.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentGetDownloadUrlV1ResponseMPayload {\n");
    
    sb.append("  sDownloadUrl: ").append(sDownloadUrl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
