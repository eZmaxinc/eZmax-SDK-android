/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
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
public class CustomWebhookResponseAllOf {
  
  @SerializedName("pksCustomerCode")
  private String pksCustomerCode = null;
  @SerializedName("bWebhookTest")
  private Boolean bWebhookTest = null;

  /**
   * The customer code assigned to your account
   **/
  @ApiModelProperty(required = true, value = "The customer code assigned to your account")
  public String getPksCustomerCode() {
    return pksCustomerCode;
  }
  public void setPksCustomerCode(String pksCustomerCode) {
    this.pksCustomerCode = pksCustomerCode;
  }

  /**
   * Wheter the webhook received is a manual test or a real event
   **/
  @ApiModelProperty(required = true, value = "Wheter the webhook received is a manual test or a real event")
  public Boolean getBWebhookTest() {
    return bWebhookTest;
  }
  public void setBWebhookTest(Boolean bWebhookTest) {
    this.bWebhookTest = bWebhookTest;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomWebhookResponseAllOf customWebhookResponseAllOf = (CustomWebhookResponseAllOf) o;
    return (this.pksCustomerCode == null ? customWebhookResponseAllOf.pksCustomerCode == null : this.pksCustomerCode.equals(customWebhookResponseAllOf.pksCustomerCode)) &&
        (this.bWebhookTest == null ? customWebhookResponseAllOf.bWebhookTest == null : this.bWebhookTest.equals(customWebhookResponseAllOf.bWebhookTest));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pksCustomerCode == null ? 0: this.pksCustomerCode.hashCode());
    result = 31 * result + (this.bWebhookTest == null ? 0: this.bWebhookTest.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomWebhookResponseAllOf {\n");
    
    sb.append("  pksCustomerCode: ").append(pksCustomerCode).append("\n");
    sb.append("  bWebhookTest: ").append(bWebhookTest).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
