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

import org.openapitools.client.model.FieldECreditcardtypeCodename;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Creditcardtype AutocompleteElement Response
 **/
@ApiModel(description = "Creditcardtype AutocompleteElement Response")
public class CreditcardtypeAutocompleteElementResponse {
  
  @SerializedName("sCreditcardtypeName")
  private String sCreditcardtypeName = null;
  @SerializedName("pkiCreditcardtypeID")
  private Integer pkiCreditcardtypeID = null;
  @SerializedName("eCreditcardtypeCodename")
  private FieldECreditcardtypeCodename eCreditcardtypeCodename = null;

  /**
   * The name of the Creditcardtype
   **/
  @ApiModelProperty(required = true, value = "The name of the Creditcardtype")
  public String getSCreditcardtypeName() {
    return sCreditcardtypeName;
  }
  public void setSCreditcardtypeName(String sCreditcardtypeName) {
    this.sCreditcardtypeName = sCreditcardtypeName;
  }

  /**
   * The unique ID of the Creditcardtype
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Creditcardtype")
  public Integer getPkiCreditcardtypeID() {
    return pkiCreditcardtypeID;
  }
  public void setPkiCreditcardtypeID(Integer pkiCreditcardtypeID) {
    this.pkiCreditcardtypeID = pkiCreditcardtypeID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldECreditcardtypeCodename getECreditcardtypeCodename() {
    return eCreditcardtypeCodename;
  }
  public void setECreditcardtypeCodename(FieldECreditcardtypeCodename eCreditcardtypeCodename) {
    this.eCreditcardtypeCodename = eCreditcardtypeCodename;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditcardtypeAutocompleteElementResponse creditcardtypeAutocompleteElementResponse = (CreditcardtypeAutocompleteElementResponse) o;
    return (this.sCreditcardtypeName == null ? creditcardtypeAutocompleteElementResponse.sCreditcardtypeName == null : this.sCreditcardtypeName.equals(creditcardtypeAutocompleteElementResponse.sCreditcardtypeName)) &&
        (this.pkiCreditcardtypeID == null ? creditcardtypeAutocompleteElementResponse.pkiCreditcardtypeID == null : this.pkiCreditcardtypeID.equals(creditcardtypeAutocompleteElementResponse.pkiCreditcardtypeID)) &&
        (this.eCreditcardtypeCodename == null ? creditcardtypeAutocompleteElementResponse.eCreditcardtypeCodename == null : this.eCreditcardtypeCodename.equals(creditcardtypeAutocompleteElementResponse.eCreditcardtypeCodename));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sCreditcardtypeName == null ? 0: this.sCreditcardtypeName.hashCode());
    result = 31 * result + (this.pkiCreditcardtypeID == null ? 0: this.pkiCreditcardtypeID.hashCode());
    result = 31 * result + (this.eCreditcardtypeCodename == null ? 0: this.eCreditcardtypeCodename.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditcardtypeAutocompleteElementResponse {\n");
    
    sb.append("  sCreditcardtypeName: ").append(sCreditcardtypeName).append("\n");
    sb.append("  pkiCreditcardtypeID: ").append(pkiCreditcardtypeID).append("\n");
    sb.append("  eCreditcardtypeCodename: ").append(eCreditcardtypeCodename).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
