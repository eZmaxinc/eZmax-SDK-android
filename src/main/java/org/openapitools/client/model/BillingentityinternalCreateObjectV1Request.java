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

import java.util.*;
import org.openapitools.client.model.BillingentityinternalRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/billingentityinternal
 **/
@ApiModel(description = "Request for POST /1/object/billingentityinternal")
public class BillingentityinternalCreateObjectV1Request {
  
  @SerializedName("a_objBillingentityinternal")
  private List<BillingentityinternalRequestCompound> aObjBillingentityinternal = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<BillingentityinternalRequestCompound> getAObjBillingentityinternal() {
    return aObjBillingentityinternal;
  }
  public void setAObjBillingentityinternal(List<BillingentityinternalRequestCompound> aObjBillingentityinternal) {
    this.aObjBillingentityinternal = aObjBillingentityinternal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingentityinternalCreateObjectV1Request billingentityinternalCreateObjectV1Request = (BillingentityinternalCreateObjectV1Request) o;
    return (this.aObjBillingentityinternal == null ? billingentityinternalCreateObjectV1Request.aObjBillingentityinternal == null : this.aObjBillingentityinternal.equals(billingentityinternalCreateObjectV1Request.aObjBillingentityinternal));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjBillingentityinternal == null ? 0: this.aObjBillingentityinternal.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingentityinternalCreateObjectV1Request {\n");
    
    sb.append("  aObjBillingentityinternal: ").append(aObjBillingentityinternal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
