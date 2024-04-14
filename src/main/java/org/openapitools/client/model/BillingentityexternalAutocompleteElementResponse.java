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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Billingentityexternal AutocompleteElement Response
 **/
@ApiModel(description = "A Billingentityexternal AutocompleteElement Response")
public class BillingentityexternalAutocompleteElementResponse {
  
  @SerializedName("pkiBillingentityexternalID")
  private Integer pkiBillingentityexternalID = null;
  @SerializedName("sBillingentityexternalDescription")
  private String sBillingentityexternalDescription = null;
  @SerializedName("bBillingentityexternalIsactive")
  private Boolean bBillingentityexternalIsactive = null;

  /**
   * The unique ID of the Billingentityexternal
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Billingentityexternal")
  public Integer getPkiBillingentityexternalID() {
    return pkiBillingentityexternalID;
  }
  public void setPkiBillingentityexternalID(Integer pkiBillingentityexternalID) {
    this.pkiBillingentityexternalID = pkiBillingentityexternalID;
  }

  /**
   * The description of the Billingentityexternal
   **/
  @ApiModelProperty(required = true, value = "The description of the Billingentityexternal")
  public String getSBillingentityexternalDescription() {
    return sBillingentityexternalDescription;
  }
  public void setSBillingentityexternalDescription(String sBillingentityexternalDescription) {
    this.sBillingentityexternalDescription = sBillingentityexternalDescription;
  }

  /**
   * Whether the Billingentityexternal is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Billingentityexternal is active or not")
  public Boolean getBBillingentityexternalIsactive() {
    return bBillingentityexternalIsactive;
  }
  public void setBBillingentityexternalIsactive(Boolean bBillingentityexternalIsactive) {
    this.bBillingentityexternalIsactive = bBillingentityexternalIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingentityexternalAutocompleteElementResponse billingentityexternalAutocompleteElementResponse = (BillingentityexternalAutocompleteElementResponse) o;
    return (this.pkiBillingentityexternalID == null ? billingentityexternalAutocompleteElementResponse.pkiBillingentityexternalID == null : this.pkiBillingentityexternalID.equals(billingentityexternalAutocompleteElementResponse.pkiBillingentityexternalID)) &&
        (this.sBillingentityexternalDescription == null ? billingentityexternalAutocompleteElementResponse.sBillingentityexternalDescription == null : this.sBillingentityexternalDescription.equals(billingentityexternalAutocompleteElementResponse.sBillingentityexternalDescription)) &&
        (this.bBillingentityexternalIsactive == null ? billingentityexternalAutocompleteElementResponse.bBillingentityexternalIsactive == null : this.bBillingentityexternalIsactive.equals(billingentityexternalAutocompleteElementResponse.bBillingentityexternalIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiBillingentityexternalID == null ? 0: this.pkiBillingentityexternalID.hashCode());
    result = 31 * result + (this.sBillingentityexternalDescription == null ? 0: this.sBillingentityexternalDescription.hashCode());
    result = 31 * result + (this.bBillingentityexternalIsactive == null ? 0: this.bBillingentityexternalIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingentityexternalAutocompleteElementResponse {\n");
    
    sb.append("  pkiBillingentityexternalID: ").append(pkiBillingentityexternalID).append("\n");
    sb.append("  sBillingentityexternalDescription: ").append(sBillingentityexternalDescription).append("\n");
    sb.append("  bBillingentityexternalIsactive: ").append(bBillingentityexternalIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
