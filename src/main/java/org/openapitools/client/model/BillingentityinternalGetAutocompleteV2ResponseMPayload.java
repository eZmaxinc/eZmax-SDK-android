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

import java.util.*;
import org.openapitools.client.model.BillingentityinternalAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/billingentityinternal/getAutocomplete
 **/
@ApiModel(description = "Payload for POST /2/object/billingentityinternal/getAutocomplete")
public class BillingentityinternalGetAutocompleteV2ResponseMPayload {
  
  @SerializedName("a_objBillingentityinternal")
  private List<BillingentityinternalAutocompleteElementResponse> aObjBillingentityinternal = null;

  /**
   * An array of Billingentityinternal object containing the description, ID and active status about the element.
   **/
  @ApiModelProperty(required = true, value = "An array of Billingentityinternal object containing the description, ID and active status about the element.")
  public List<BillingentityinternalAutocompleteElementResponse> getAObjBillingentityinternal() {
    return aObjBillingentityinternal;
  }
  public void setAObjBillingentityinternal(List<BillingentityinternalAutocompleteElementResponse> aObjBillingentityinternal) {
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
    BillingentityinternalGetAutocompleteV2ResponseMPayload billingentityinternalGetAutocompleteV2ResponseMPayload = (BillingentityinternalGetAutocompleteV2ResponseMPayload) o;
    return (this.aObjBillingentityinternal == null ? billingentityinternalGetAutocompleteV2ResponseMPayload.aObjBillingentityinternal == null : this.aObjBillingentityinternal.equals(billingentityinternalGetAutocompleteV2ResponseMPayload.aObjBillingentityinternal));
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
    sb.append("class BillingentityinternalGetAutocompleteV2ResponseMPayload {\n");
    
    sb.append("  aObjBillingentityinternal: ").append(aObjBillingentityinternal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
