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

import java.util.*;
import org.openapitools.client.model.BillingentityinternalproductRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BillingentityinternalRequestCompoundAllOf {
  
  @SerializedName("a_objBillingentityinternalproduct")
  private List<BillingentityinternalproductRequestCompound> aObjBillingentityinternalproduct = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<BillingentityinternalproductRequestCompound> getAObjBillingentityinternalproduct() {
    return aObjBillingentityinternalproduct;
  }
  public void setAObjBillingentityinternalproduct(List<BillingentityinternalproductRequestCompound> aObjBillingentityinternalproduct) {
    this.aObjBillingentityinternalproduct = aObjBillingentityinternalproduct;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingentityinternalRequestCompoundAllOf billingentityinternalRequestCompoundAllOf = (BillingentityinternalRequestCompoundAllOf) o;
    return (this.aObjBillingentityinternalproduct == null ? billingentityinternalRequestCompoundAllOf.aObjBillingentityinternalproduct == null : this.aObjBillingentityinternalproduct.equals(billingentityinternalRequestCompoundAllOf.aObjBillingentityinternalproduct));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjBillingentityinternalproduct == null ? 0: this.aObjBillingentityinternalproduct.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingentityinternalRequestCompoundAllOf {\n");
    
    sb.append("  aObjBillingentityinternalproduct: ").append(aObjBillingentityinternalproduct).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
