/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.15
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
 * A Franchiseoffice AutocompleteElement Response
 **/
@ApiModel(description = "A Franchiseoffice AutocompleteElement Response")
public class FranchiseofficeAutocompleteElementResponse {
  
  @SerializedName("sFranchiseofficeDescription")
  private String sFranchiseofficeDescription = null;
  @SerializedName("pkiFranchiseofficeID")
  private Integer pkiFranchiseofficeID = null;
  @SerializedName("bFranchiseofficeIsactive")
  private Boolean bFranchiseofficeIsactive = null;

  /**
   * The description of the Franchiseoffice in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The description of the Franchiseoffice in the language of the requester")
  public String getSFranchiseofficeDescription() {
    return sFranchiseofficeDescription;
  }
  public void setSFranchiseofficeDescription(String sFranchiseofficeDescription) {
    this.sFranchiseofficeDescription = sFranchiseofficeDescription;
  }

  /**
   * The unique ID of the Franchisereoffice
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Franchisereoffice")
  public Integer getPkiFranchiseofficeID() {
    return pkiFranchiseofficeID;
  }
  public void setPkiFranchiseofficeID(Integer pkiFranchiseofficeID) {
    this.pkiFranchiseofficeID = pkiFranchiseofficeID;
  }

  /**
   * Whether the Franchiseoffice is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Franchiseoffice is active or not")
  public Boolean getBFranchiseofficeIsactive() {
    return bFranchiseofficeIsactive;
  }
  public void setBFranchiseofficeIsactive(Boolean bFranchiseofficeIsactive) {
    this.bFranchiseofficeIsactive = bFranchiseofficeIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FranchiseofficeAutocompleteElementResponse franchiseofficeAutocompleteElementResponse = (FranchiseofficeAutocompleteElementResponse) o;
    return (this.sFranchiseofficeDescription == null ? franchiseofficeAutocompleteElementResponse.sFranchiseofficeDescription == null : this.sFranchiseofficeDescription.equals(franchiseofficeAutocompleteElementResponse.sFranchiseofficeDescription)) &&
        (this.pkiFranchiseofficeID == null ? franchiseofficeAutocompleteElementResponse.pkiFranchiseofficeID == null : this.pkiFranchiseofficeID.equals(franchiseofficeAutocompleteElementResponse.pkiFranchiseofficeID)) &&
        (this.bFranchiseofficeIsactive == null ? franchiseofficeAutocompleteElementResponse.bFranchiseofficeIsactive == null : this.bFranchiseofficeIsactive.equals(franchiseofficeAutocompleteElementResponse.bFranchiseofficeIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sFranchiseofficeDescription == null ? 0: this.sFranchiseofficeDescription.hashCode());
    result = 31 * result + (this.pkiFranchiseofficeID == null ? 0: this.pkiFranchiseofficeID.hashCode());
    result = 31 * result + (this.bFranchiseofficeIsactive == null ? 0: this.bFranchiseofficeIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FranchiseofficeAutocompleteElementResponse {\n");
    
    sb.append("  sFranchiseofficeDescription: ").append(sFranchiseofficeDescription).append("\n");
    sb.append("  pkiFranchiseofficeID: ").append(pkiFranchiseofficeID).append("\n");
    sb.append("  bFranchiseofficeIsactive: ").append(bFranchiseofficeIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
