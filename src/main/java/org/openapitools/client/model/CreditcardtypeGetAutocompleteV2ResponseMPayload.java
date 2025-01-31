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
import org.openapitools.client.model.CreditcardtypeAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/creditcardtype/getAutocomplete
 **/
@ApiModel(description = "Payload for POST /2/object/creditcardtype/getAutocomplete")
public class CreditcardtypeGetAutocompleteV2ResponseMPayload {
  
  @SerializedName("a_objCreditcardtype")
  private List<CreditcardtypeAutocompleteElementResponse> aObjCreditcardtype = null;

  /**
   * An array of Creditcardtype object containing the description, ID and active status about the element.
   **/
  @ApiModelProperty(required = true, value = "An array of Creditcardtype object containing the description, ID and active status about the element.")
  public List<CreditcardtypeAutocompleteElementResponse> getAObjCreditcardtype() {
    return aObjCreditcardtype;
  }
  public void setAObjCreditcardtype(List<CreditcardtypeAutocompleteElementResponse> aObjCreditcardtype) {
    this.aObjCreditcardtype = aObjCreditcardtype;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditcardtypeGetAutocompleteV2ResponseMPayload creditcardtypeGetAutocompleteV2ResponseMPayload = (CreditcardtypeGetAutocompleteV2ResponseMPayload) o;
    return (this.aObjCreditcardtype == null ? creditcardtypeGetAutocompleteV2ResponseMPayload.aObjCreditcardtype == null : this.aObjCreditcardtype.equals(creditcardtypeGetAutocompleteV2ResponseMPayload.aObjCreditcardtype));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjCreditcardtype == null ? 0: this.aObjCreditcardtype.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditcardtypeGetAutocompleteV2ResponseMPayload {\n");
    
    sb.append("  aObjCreditcardtype: ").append(aObjCreditcardtype).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
