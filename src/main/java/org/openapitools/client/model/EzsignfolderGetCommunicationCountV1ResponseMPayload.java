/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
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
 * Response for GET /1/object/ezsignfolder/{pkiEzsignfolderID}/getCommunicationCount
 **/
@ApiModel(description = "Response for GET /1/object/ezsignfolder/{pkiEzsignfolderID}/getCommunicationCount")
public class EzsignfolderGetCommunicationCountV1ResponseMPayload {
  
  @SerializedName("iCommunicationCount")
  private Integer iCommunicationCount = null;

  /**
   * The count of Communication.
   **/
  @ApiModelProperty(required = true, value = "The count of Communication.")
  public Integer getICommunicationCount() {
    return iCommunicationCount;
  }
  public void setICommunicationCount(Integer iCommunicationCount) {
    this.iCommunicationCount = iCommunicationCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderGetCommunicationCountV1ResponseMPayload ezsignfolderGetCommunicationCountV1ResponseMPayload = (EzsignfolderGetCommunicationCountV1ResponseMPayload) o;
    return (this.iCommunicationCount == null ? ezsignfolderGetCommunicationCountV1ResponseMPayload.iCommunicationCount == null : this.iCommunicationCount.equals(ezsignfolderGetCommunicationCountV1ResponseMPayload.iCommunicationCount));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.iCommunicationCount == null ? 0: this.iCommunicationCount.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderGetCommunicationCountV1ResponseMPayload {\n");
    
    sb.append("  iCommunicationCount: ").append(iCommunicationCount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}