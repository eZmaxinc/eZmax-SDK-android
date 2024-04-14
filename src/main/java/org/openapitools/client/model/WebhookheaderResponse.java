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
 * A webhookheader object
 **/
@ApiModel(description = "A webhookheader object")
public class WebhookheaderResponse {
  
  @SerializedName("pkiWebhookheaderID")
  private Integer pkiWebhookheaderID = null;
  @SerializedName("fkiWebhookID")
  private Integer fkiWebhookID = null;
  @SerializedName("sWebhookheaderName")
  private String sWebhookheaderName = null;
  @SerializedName("sWebhookheaderValue")
  private String sWebhookheaderValue = null;

  /**
   * The unique ID of the Webhookheader
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Webhookheader")
  public Integer getPkiWebhookheaderID() {
    return pkiWebhookheaderID;
  }
  public void setPkiWebhookheaderID(Integer pkiWebhookheaderID) {
    this.pkiWebhookheaderID = pkiWebhookheaderID;
  }

  /**
   * The unique ID of the Webhook
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Webhook")
  public Integer getFkiWebhookID() {
    return fkiWebhookID;
  }
  public void setFkiWebhookID(Integer fkiWebhookID) {
    this.fkiWebhookID = fkiWebhookID;
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
    WebhookheaderResponse webhookheaderResponse = (WebhookheaderResponse) o;
    return (this.pkiWebhookheaderID == null ? webhookheaderResponse.pkiWebhookheaderID == null : this.pkiWebhookheaderID.equals(webhookheaderResponse.pkiWebhookheaderID)) &&
        (this.fkiWebhookID == null ? webhookheaderResponse.fkiWebhookID == null : this.fkiWebhookID.equals(webhookheaderResponse.fkiWebhookID)) &&
        (this.sWebhookheaderName == null ? webhookheaderResponse.sWebhookheaderName == null : this.sWebhookheaderName.equals(webhookheaderResponse.sWebhookheaderName)) &&
        (this.sWebhookheaderValue == null ? webhookheaderResponse.sWebhookheaderValue == null : this.sWebhookheaderValue.equals(webhookheaderResponse.sWebhookheaderValue));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiWebhookheaderID == null ? 0: this.pkiWebhookheaderID.hashCode());
    result = 31 * result + (this.fkiWebhookID == null ? 0: this.fkiWebhookID.hashCode());
    result = 31 * result + (this.sWebhookheaderName == null ? 0: this.sWebhookheaderName.hashCode());
    result = 31 * result + (this.sWebhookheaderValue == null ? 0: this.sWebhookheaderValue.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookheaderResponse {\n");
    
    sb.append("  pkiWebhookheaderID: ").append(pkiWebhookheaderID).append("\n");
    sb.append("  fkiWebhookID: ").append(fkiWebhookID).append("\n");
    sb.append("  sWebhookheaderName: ").append(sWebhookheaderName).append("\n");
    sb.append("  sWebhookheaderValue: ").append(sWebhookheaderValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
