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

import org.openapitools.client.model.FieldECreditcardtypeCodename;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A custom Creditcardtransaction Object
 **/
@ApiModel(description = "A custom Creditcardtransaction Object")
public class CustomCreditcardtransactionResponse {
  
  @SerializedName("eCreditcardtypeCodename")
  private FieldECreditcardtypeCodename eCreditcardtypeCodename = null;
  @SerializedName("dCreditcardtransactionAmount")
  private String dCreditcardtransactionAmount = null;
  @SerializedName("sCreditcardtransactionPartiallydecryptednumber")
  private String sCreditcardtransactionPartiallydecryptednumber = null;
  @SerializedName("sCreditcardtransactionReferencenumber")
  private String sCreditcardtransactionReferencenumber = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldECreditcardtypeCodename getECreditcardtypeCodename() {
    return eCreditcardtypeCodename;
  }
  public void setECreditcardtypeCodename(FieldECreditcardtypeCodename eCreditcardtypeCodename) {
    this.eCreditcardtypeCodename = eCreditcardtypeCodename;
  }

  /**
   * The amount of the Creditcardtransaction
   **/
  @ApiModelProperty(required = true, value = "The amount of the Creditcardtransaction")
  public String getDCreditcardtransactionAmount() {
    return dCreditcardtransactionAmount;
  }
  public void setDCreditcardtransactionAmount(String dCreditcardtransactionAmount) {
    this.dCreditcardtransactionAmount = dCreditcardtransactionAmount;
  }

  /**
   * The partially decrypted credit card number used in the Creditcardtransaction
   **/
  @ApiModelProperty(required = true, value = "The partially decrypted credit card number used in the Creditcardtransaction")
  public String getSCreditcardtransactionPartiallydecryptednumber() {
    return sCreditcardtransactionPartiallydecryptednumber;
  }
  public void setSCreditcardtransactionPartiallydecryptednumber(String sCreditcardtransactionPartiallydecryptednumber) {
    this.sCreditcardtransactionPartiallydecryptednumber = sCreditcardtransactionPartiallydecryptednumber;
  }

  /**
   * The reference number on the creditcard service for the Creditcardtransaction
   **/
  @ApiModelProperty(required = true, value = "The reference number on the creditcard service for the Creditcardtransaction")
  public String getSCreditcardtransactionReferencenumber() {
    return sCreditcardtransactionReferencenumber;
  }
  public void setSCreditcardtransactionReferencenumber(String sCreditcardtransactionReferencenumber) {
    this.sCreditcardtransactionReferencenumber = sCreditcardtransactionReferencenumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomCreditcardtransactionResponse customCreditcardtransactionResponse = (CustomCreditcardtransactionResponse) o;
    return (this.eCreditcardtypeCodename == null ? customCreditcardtransactionResponse.eCreditcardtypeCodename == null : this.eCreditcardtypeCodename.equals(customCreditcardtransactionResponse.eCreditcardtypeCodename)) &&
        (this.dCreditcardtransactionAmount == null ? customCreditcardtransactionResponse.dCreditcardtransactionAmount == null : this.dCreditcardtransactionAmount.equals(customCreditcardtransactionResponse.dCreditcardtransactionAmount)) &&
        (this.sCreditcardtransactionPartiallydecryptednumber == null ? customCreditcardtransactionResponse.sCreditcardtransactionPartiallydecryptednumber == null : this.sCreditcardtransactionPartiallydecryptednumber.equals(customCreditcardtransactionResponse.sCreditcardtransactionPartiallydecryptednumber)) &&
        (this.sCreditcardtransactionReferencenumber == null ? customCreditcardtransactionResponse.sCreditcardtransactionReferencenumber == null : this.sCreditcardtransactionReferencenumber.equals(customCreditcardtransactionResponse.sCreditcardtransactionReferencenumber));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.eCreditcardtypeCodename == null ? 0: this.eCreditcardtypeCodename.hashCode());
    result = 31 * result + (this.dCreditcardtransactionAmount == null ? 0: this.dCreditcardtransactionAmount.hashCode());
    result = 31 * result + (this.sCreditcardtransactionPartiallydecryptednumber == null ? 0: this.sCreditcardtransactionPartiallydecryptednumber.hashCode());
    result = 31 * result + (this.sCreditcardtransactionReferencenumber == null ? 0: this.sCreditcardtransactionReferencenumber.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomCreditcardtransactionResponse {\n");
    
    sb.append("  eCreditcardtypeCodename: ").append(eCreditcardtypeCodename).append("\n");
    sb.append("  dCreditcardtransactionAmount: ").append(dCreditcardtransactionAmount).append("\n");
    sb.append("  sCreditcardtransactionPartiallydecryptednumber: ").append(sCreditcardtransactionPartiallydecryptednumber).append("\n");
    sb.append("  sCreditcardtransactionReferencenumber: ").append(sCreditcardtransactionReferencenumber).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
