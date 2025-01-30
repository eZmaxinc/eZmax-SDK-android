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
 * A Paymentterm AutocompleteElement Response
 **/
@ApiModel(description = "A Paymentterm AutocompleteElement Response")
public class PaymenttermAutocompleteElementResponse {
  
  @SerializedName("pkiPaymenttermID")
  private Integer pkiPaymenttermID = null;
  @SerializedName("sPaymenttermDescriptionX")
  private String sPaymenttermDescriptionX = null;
  @SerializedName("bPaymenttermIsactive")
  private Boolean bPaymenttermIsactive = null;

  /**
   * The unique ID of the Paymentterm
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Paymentterm")
  public Integer getPkiPaymenttermID() {
    return pkiPaymenttermID;
  }
  public void setPkiPaymenttermID(Integer pkiPaymenttermID) {
    this.pkiPaymenttermID = pkiPaymenttermID;
  }

  /**
   * The description of the Paymentterm in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The description of the Paymentterm in the language of the requester")
  public String getSPaymenttermDescriptionX() {
    return sPaymenttermDescriptionX;
  }
  public void setSPaymenttermDescriptionX(String sPaymenttermDescriptionX) {
    this.sPaymenttermDescriptionX = sPaymenttermDescriptionX;
  }

  /**
   * Whether the Paymentterm is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Paymentterm is active or not")
  public Boolean getBPaymenttermIsactive() {
    return bPaymenttermIsactive;
  }
  public void setBPaymenttermIsactive(Boolean bPaymenttermIsactive) {
    this.bPaymenttermIsactive = bPaymenttermIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymenttermAutocompleteElementResponse paymenttermAutocompleteElementResponse = (PaymenttermAutocompleteElementResponse) o;
    return (this.pkiPaymenttermID == null ? paymenttermAutocompleteElementResponse.pkiPaymenttermID == null : this.pkiPaymenttermID.equals(paymenttermAutocompleteElementResponse.pkiPaymenttermID)) &&
        (this.sPaymenttermDescriptionX == null ? paymenttermAutocompleteElementResponse.sPaymenttermDescriptionX == null : this.sPaymenttermDescriptionX.equals(paymenttermAutocompleteElementResponse.sPaymenttermDescriptionX)) &&
        (this.bPaymenttermIsactive == null ? paymenttermAutocompleteElementResponse.bPaymenttermIsactive == null : this.bPaymenttermIsactive.equals(paymenttermAutocompleteElementResponse.bPaymenttermIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiPaymenttermID == null ? 0: this.pkiPaymenttermID.hashCode());
    result = 31 * result + (this.sPaymenttermDescriptionX == null ? 0: this.sPaymenttermDescriptionX.hashCode());
    result = 31 * result + (this.bPaymenttermIsactive == null ? 0: this.bPaymenttermIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymenttermAutocompleteElementResponse {\n");
    
    sb.append("  pkiPaymenttermID: ").append(pkiPaymenttermID).append("\n");
    sb.append("  sPaymenttermDescriptionX: ").append(sPaymenttermDescriptionX).append("\n");
    sb.append("  bPaymenttermIsactive: ").append(bPaymenttermIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
