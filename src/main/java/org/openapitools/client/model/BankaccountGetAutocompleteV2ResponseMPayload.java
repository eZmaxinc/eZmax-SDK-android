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
import org.openapitools.client.model.BankaccountAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/bankaccount/getAutocomplete
 **/
@ApiModel(description = "Payload for POST /2/object/bankaccount/getAutocomplete")
public class BankaccountGetAutocompleteV2ResponseMPayload {
  
  @SerializedName("a_objBankaccount")
  private List<BankaccountAutocompleteElementResponse> aObjBankaccount = null;

  /**
   * An array of Bankaccount autocomplete element response.
   **/
  @ApiModelProperty(required = true, value = "An array of Bankaccount autocomplete element response.")
  public List<BankaccountAutocompleteElementResponse> getAObjBankaccount() {
    return aObjBankaccount;
  }
  public void setAObjBankaccount(List<BankaccountAutocompleteElementResponse> aObjBankaccount) {
    this.aObjBankaccount = aObjBankaccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankaccountGetAutocompleteV2ResponseMPayload bankaccountGetAutocompleteV2ResponseMPayload = (BankaccountGetAutocompleteV2ResponseMPayload) o;
    return (this.aObjBankaccount == null ? bankaccountGetAutocompleteV2ResponseMPayload.aObjBankaccount == null : this.aObjBankaccount.equals(bankaccountGetAutocompleteV2ResponseMPayload.aObjBankaccount));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjBankaccount == null ? 0: this.aObjBankaccount.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankaccountGetAutocompleteV2ResponseMPayload {\n");
    
    sb.append("  aObjBankaccount: ").append(aObjBankaccount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
