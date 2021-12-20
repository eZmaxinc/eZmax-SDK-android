/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.4
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
 * Request for the /1/object/ezsignfolder/{pkiEzsignfolderID}/send API Request
 **/
@ApiModel(description = "Request for the /1/object/ezsignfolder/{pkiEzsignfolderID}/send API Request")
public class EzsignfolderSendV1Request {
  
  @SerializedName("tExtraMessage")
  private String tExtraMessage = null;

  /**
   * A custom text message that will be added to the email sent to signatories inviting them to sign.  You can send an empty string and only the generic message will be sent.
   **/
  @ApiModelProperty(required = true, value = "A custom text message that will be added to the email sent to signatories inviting them to sign.  You can send an empty string and only the generic message will be sent.")
  public String getTExtraMessage() {
    return tExtraMessage;
  }
  public void setTExtraMessage(String tExtraMessage) {
    this.tExtraMessage = tExtraMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderSendV1Request ezsignfolderSendV1Request = (EzsignfolderSendV1Request) o;
    return (this.tExtraMessage == null ? ezsignfolderSendV1Request.tExtraMessage == null : this.tExtraMessage.equals(ezsignfolderSendV1Request.tExtraMessage));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.tExtraMessage == null ? 0: this.tExtraMessage.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderSendV1Request {\n");
    
    sb.append("  tExtraMessage: ").append(tExtraMessage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
