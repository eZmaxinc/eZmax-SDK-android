/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.BillingentityinternalResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/billingentityinternal/{pkiBillingentityinternalID}
 **/
@ApiModel(description = "Payload for GET /2/object/billingentityinternal/{pkiBillingentityinternalID}")
public class BillingentityinternalGetObjectV2ResponseMPayload {
  
  @SerializedName("objBillingentityinternal")
  private BillingentityinternalResponseCompound objBillingentityinternal = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BillingentityinternalResponseCompound getObjBillingentityinternal() {
    return objBillingentityinternal;
  }
  public void setObjBillingentityinternal(BillingentityinternalResponseCompound objBillingentityinternal) {
    this.objBillingentityinternal = objBillingentityinternal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingentityinternalGetObjectV2ResponseMPayload billingentityinternalGetObjectV2ResponseMPayload = (BillingentityinternalGetObjectV2ResponseMPayload) o;
    return (this.objBillingentityinternal == null ? billingentityinternalGetObjectV2ResponseMPayload.objBillingentityinternal == null : this.objBillingentityinternal.equals(billingentityinternalGetObjectV2ResponseMPayload.objBillingentityinternal));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objBillingentityinternal == null ? 0: this.objBillingentityinternal.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingentityinternalGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objBillingentityinternal: ").append(objBillingentityinternal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
