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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Creditcardclient Object
 **/
@ApiModel(description = "A Creditcardclient Object")
public class CreditcardclientRequestPatch {
  
  @SerializedName("bCreditcardclientrelationIsdefault")
  private Boolean bCreditcardclientrelationIsdefault = null;

  /**
   * Whether if it's the creditcardclient is the default one
   **/
  @ApiModelProperty(value = "Whether if it's the creditcardclient is the default one")
  public Boolean getBCreditcardclientrelationIsdefault() {
    return bCreditcardclientrelationIsdefault;
  }
  public void setBCreditcardclientrelationIsdefault(Boolean bCreditcardclientrelationIsdefault) {
    this.bCreditcardclientrelationIsdefault = bCreditcardclientrelationIsdefault;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditcardclientRequestPatch creditcardclientRequestPatch = (CreditcardclientRequestPatch) o;
    return (this.bCreditcardclientrelationIsdefault == null ? creditcardclientRequestPatch.bCreditcardclientrelationIsdefault == null : this.bCreditcardclientrelationIsdefault.equals(creditcardclientRequestPatch.bCreditcardclientrelationIsdefault));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.bCreditcardclientrelationIsdefault == null ? 0: this.bCreditcardclientrelationIsdefault.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditcardclientRequestPatch {\n");
    
    sb.append("  bCreditcardclientrelationIsdefault: ").append(bCreditcardclientrelationIsdefault).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
