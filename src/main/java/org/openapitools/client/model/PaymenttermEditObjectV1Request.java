/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.PaymenttermRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/paymentterm/{pkiPaymenttermID}
 **/
@ApiModel(description = "Request for PUT /1/object/paymentterm/{pkiPaymenttermID}")
public class PaymenttermEditObjectV1Request {
  
  @SerializedName("objPaymentterm")
  private PaymenttermRequestCompound objPaymentterm = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public PaymenttermRequestCompound getObjPaymentterm() {
    return objPaymentterm;
  }
  public void setObjPaymentterm(PaymenttermRequestCompound objPaymentterm) {
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
    PaymenttermEditObjectV1Request paymenttermEditObjectV1Request = (PaymenttermEditObjectV1Request) o;
    return (this.objPaymentterm == null ? paymenttermEditObjectV1Request.objPaymentterm == null : this.objPaymentterm.equals(paymenttermEditObjectV1Request.objPaymentterm));
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
    sb.append("class PaymenttermEditObjectV1Request {\n");
    
    sb.append("  objPaymentterm: ").append(objPaymentterm).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
