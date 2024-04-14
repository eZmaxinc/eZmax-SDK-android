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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for GET /1/object/ezsignfolder/{pkiEzsignfolderID}/getAttachmentCount
 **/
@ApiModel(description = "Response for GET /1/object/ezsignfolder/{pkiEzsignfolderID}/getAttachmentCount")
public class EzsignfolderGetAttachmentCountV1ResponseMPayload {
  
  @SerializedName("iAttachmentCount")
  private Integer iAttachmentCount = null;

  /**
   * The count of Attachment.
   **/
  @ApiModelProperty(required = true, value = "The count of Attachment.")
  public Integer getIAttachmentCount() {
    return iAttachmentCount;
  }
  public void setIAttachmentCount(Integer iAttachmentCount) {
    this.iAttachmentCount = iAttachmentCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderGetAttachmentCountV1ResponseMPayload ezsignfolderGetAttachmentCountV1ResponseMPayload = (EzsignfolderGetAttachmentCountV1ResponseMPayload) o;
    return (this.iAttachmentCount == null ? ezsignfolderGetAttachmentCountV1ResponseMPayload.iAttachmentCount == null : this.iAttachmentCount.equals(ezsignfolderGetAttachmentCountV1ResponseMPayload.iAttachmentCount));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.iAttachmentCount == null ? 0: this.iAttachmentCount.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderGetAttachmentCountV1ResponseMPayload {\n");
    
    sb.append("  iAttachmentCount: ").append(iAttachmentCount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}