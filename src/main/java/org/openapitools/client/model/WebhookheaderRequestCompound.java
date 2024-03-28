/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
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
 * A Webhookheader Object
 **/
@ApiModel(description = "A Webhookheader Object")
public class WebhookheaderRequestCompound {
  
  @SerializedName("pkiWebhookheaderID")
  private Integer pkiWebhookheaderID = null;
  @SerializedName("sWebhookheaderName")
  private String sWebhookheaderName = null;
  @SerializedName("sWebhookheaderValue")
  private String sWebhookheaderValue = null;

  /**
   * The unique ID of the Webhookheader
   **/
  @ApiModelProperty(value = "The unique ID of the Webhookheader")
  public Integer getPkiWebhookheaderID() {
    return pkiWebhookheaderID;
  }
  public void setPkiWebhookheaderID(Integer pkiWebhookheaderID) {
    this.pkiWebhookheaderID = pkiWebhookheaderID;
  }

  /**
   * The Name of the Webhookheader
   **/
  @ApiModelProperty(required = true, value = "The Name of the Webhookheader")
  public String getSWebhookheaderName() {
    return sWebhookheaderName;
  }
  public void setSWebhookheaderName(String sWebhookheaderName) {
    this.sWebhookheaderName = sWebhookheaderName;
  }

  /**
   * The Value of the Webhookheader
   **/
  @ApiModelProperty(required = true, value = "The Value of the Webhookheader")
  public String getSWebhookheaderValue() {
    return sWebhookheaderValue;
  }
  public void setSWebhookheaderValue(String sWebhookheaderValue) {
    this.sWebhookheaderValue = sWebhookheaderValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookheaderRequestCompound webhookheaderRequestCompound = (WebhookheaderRequestCompound) o;
    return (this.pkiWebhookheaderID == null ? webhookheaderRequestCompound.pkiWebhookheaderID == null : this.pkiWebhookheaderID.equals(webhookheaderRequestCompound.pkiWebhookheaderID)) &&
        (this.sWebhookheaderName == null ? webhookheaderRequestCompound.sWebhookheaderName == null : this.sWebhookheaderName.equals(webhookheaderRequestCompound.sWebhookheaderName)) &&
        (this.sWebhookheaderValue == null ? webhookheaderRequestCompound.sWebhookheaderValue == null : this.sWebhookheaderValue.equals(webhookheaderRequestCompound.sWebhookheaderValue));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiWebhookheaderID == null ? 0: this.pkiWebhookheaderID.hashCode());
    result = 31 * result + (this.sWebhookheaderName == null ? 0: this.sWebhookheaderName.hashCode());
    result = 31 * result + (this.sWebhookheaderValue == null ? 0: this.sWebhookheaderValue.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookheaderRequestCompound {\n");
    
    sb.append("  pkiWebhookheaderID: ").append(pkiWebhookheaderID).append("\n");
    sb.append("  sWebhookheaderName: ").append(sWebhookheaderName).append("\n");
    sb.append("  sWebhookheaderValue: ").append(sWebhookheaderValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
