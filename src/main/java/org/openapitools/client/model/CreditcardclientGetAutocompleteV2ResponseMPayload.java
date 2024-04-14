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
import org.openapitools.client.model.CreditcardclientAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/creditcardclient/getAutocomplete
 **/
@ApiModel(description = "Payload for POST /2/object/creditcardclient/getAutocomplete")
public class CreditcardclientGetAutocompleteV2ResponseMPayload {
  
  @SerializedName("a_objCreditcardclient")
  private List<CreditcardclientAutocompleteElementResponse> aObjCreditcardclient = null;

  /**
   * An array of Creditcardclient autocomplete element response.
   **/
  @ApiModelProperty(required = true, value = "An array of Creditcardclient autocomplete element response.")
  public List<CreditcardclientAutocompleteElementResponse> getAObjCreditcardclient() {
    return aObjCreditcardclient;
  }
  public void setAObjCreditcardclient(List<CreditcardclientAutocompleteElementResponse> aObjCreditcardclient) {
    this.aObjCreditcardclient = aObjCreditcardclient;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditcardclientGetAutocompleteV2ResponseMPayload creditcardclientGetAutocompleteV2ResponseMPayload = (CreditcardclientGetAutocompleteV2ResponseMPayload) o;
    return (this.aObjCreditcardclient == null ? creditcardclientGetAutocompleteV2ResponseMPayload.aObjCreditcardclient == null : this.aObjCreditcardclient.equals(creditcardclientGetAutocompleteV2ResponseMPayload.aObjCreditcardclient));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjCreditcardclient == null ? 0: this.aObjCreditcardclient.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditcardclientGetAutocompleteV2ResponseMPayload {\n");
    
    sb.append("  aObjCreditcardclient: ").append(aObjCreditcardclient).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
