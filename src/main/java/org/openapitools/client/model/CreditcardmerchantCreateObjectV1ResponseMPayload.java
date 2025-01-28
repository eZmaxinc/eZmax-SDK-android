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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /1/object/creditcardmerchant
 **/
@ApiModel(description = "Payload for POST /1/object/creditcardmerchant")
public class CreditcardmerchantCreateObjectV1ResponseMPayload {
  
  @SerializedName("a_pkiCreditcardmerchantID")
  private List<Integer> aPkiCreditcardmerchantID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiCreditcardmerchantID() {
    return aPkiCreditcardmerchantID;
  }
  public void setAPkiCreditcardmerchantID(List<Integer> aPkiCreditcardmerchantID) {
    this.aPkiCreditcardmerchantID = aPkiCreditcardmerchantID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditcardmerchantCreateObjectV1ResponseMPayload creditcardmerchantCreateObjectV1ResponseMPayload = (CreditcardmerchantCreateObjectV1ResponseMPayload) o;
    return (this.aPkiCreditcardmerchantID == null ? creditcardmerchantCreateObjectV1ResponseMPayload.aPkiCreditcardmerchantID == null : this.aPkiCreditcardmerchantID.equals(creditcardmerchantCreateObjectV1ResponseMPayload.aPkiCreditcardmerchantID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiCreditcardmerchantID == null ? 0: this.aPkiCreditcardmerchantID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditcardmerchantCreateObjectV1ResponseMPayload {\n");
    
    sb.append("  aPkiCreditcardmerchantID: ").append(aPkiCreditcardmerchantID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
