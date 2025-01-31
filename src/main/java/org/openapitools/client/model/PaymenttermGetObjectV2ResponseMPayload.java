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

import org.openapitools.client.model.PaymenttermResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/paymentterm/{pkiPaymenttermID}
 **/
@ApiModel(description = "Payload for GET /2/object/paymentterm/{pkiPaymenttermID}")
public class PaymenttermGetObjectV2ResponseMPayload {
  
  @SerializedName("objPaymentterm")
  private PaymenttermResponseCompound objPaymentterm = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public PaymenttermResponseCompound getObjPaymentterm() {
    return objPaymentterm;
  }
  public void setObjPaymentterm(PaymenttermResponseCompound objPaymentterm) {
    this.objPaymentterm = objPaymentterm;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymenttermGetObjectV2ResponseMPayload paymenttermGetObjectV2ResponseMPayload = (PaymenttermGetObjectV2ResponseMPayload) o;
    return (this.objPaymentterm == null ? paymenttermGetObjectV2ResponseMPayload.objPaymentterm == null : this.objPaymentterm.equals(paymenttermGetObjectV2ResponseMPayload.objPaymentterm));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objPaymentterm == null ? 0: this.objPaymentterm.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymenttermGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objPaymentterm: ").append(objPaymentterm).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
