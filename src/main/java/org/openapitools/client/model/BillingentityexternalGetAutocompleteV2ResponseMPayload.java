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
import org.openapitools.client.model.BillingentityexternalAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/billingentityexternal/getAutocomplete
 **/
@ApiModel(description = "Payload for POST /2/object/billingentityexternal/getAutocomplete")
public class BillingentityexternalGetAutocompleteV2ResponseMPayload {
  
  @SerializedName("a_objBillingentityexternal")
  private List<BillingentityexternalAutocompleteElementResponse> aObjBillingentityexternal = null;

  /**
   * An array of Billingentityexternal autocomplete element response.
   **/
  @ApiModelProperty(required = true, value = "An array of Billingentityexternal autocomplete element response.")
  public List<BillingentityexternalAutocompleteElementResponse> getAObjBillingentityexternal() {
    return aObjBillingentityexternal;
  }
  public void setAObjBillingentityexternal(List<BillingentityexternalAutocompleteElementResponse> aObjBillingentityexternal) {
    this.aObjBillingentityexternal = aObjBillingentityexternal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingentityexternalGetAutocompleteV2ResponseMPayload billingentityexternalGetAutocompleteV2ResponseMPayload = (BillingentityexternalGetAutocompleteV2ResponseMPayload) o;
    return (this.aObjBillingentityexternal == null ? billingentityexternalGetAutocompleteV2ResponseMPayload.aObjBillingentityexternal == null : this.aObjBillingentityexternal.equals(billingentityexternalGetAutocompleteV2ResponseMPayload.aObjBillingentityexternal));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjBillingentityexternal == null ? 0: this.aObjBillingentityexternal.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingentityexternalGetAutocompleteV2ResponseMPayload {\n");
    
    sb.append("  aObjBillingentityexternal: ").append(aObjBillingentityexternal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
