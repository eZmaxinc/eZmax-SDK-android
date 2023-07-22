/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
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
 * A Ezmaxinvoicing AutocompleteElement Response
 **/
@ApiModel(description = "A Ezmaxinvoicing AutocompleteElement Response")
public class EzmaxinvoicingAutocompleteElementResponse {
  
  @SerializedName("yyyymmEzmaxinvoicing")
  private String yyyymmEzmaxinvoicing = null;
  @SerializedName("pkiEzmaxinvoicingID")
  private Integer pkiEzmaxinvoicingID = null;
  @SerializedName("bEzmaxinvoicingIsactive")
  private Boolean bEzmaxinvoicingIsactive = null;

  /**
   * The YYYYMM period of the Ezmaxinvoicing
   **/
  @ApiModelProperty(required = true, value = "The YYYYMM period of the Ezmaxinvoicing")
  public String getYyyymmEzmaxinvoicing() {
    return yyyymmEzmaxinvoicing;
  }
  public void setYyyymmEzmaxinvoicing(String yyyymmEzmaxinvoicing) {
    this.yyyymmEzmaxinvoicing = yyyymmEzmaxinvoicing;
  }

  /**
   * The unique ID of the Ezmaxinvoicing
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezmaxinvoicing")
  public Integer getPkiEzmaxinvoicingID() {
    return pkiEzmaxinvoicingID;
  }
  public void setPkiEzmaxinvoicingID(Integer pkiEzmaxinvoicingID) {
    this.pkiEzmaxinvoicingID = pkiEzmaxinvoicingID;
  }

  /**
   * Whether the Ezmaxinvoicing is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezmaxinvoicing is active or not")
  public Boolean getBEzmaxinvoicingIsactive() {
    return bEzmaxinvoicingIsactive;
  }
  public void setBEzmaxinvoicingIsactive(Boolean bEzmaxinvoicingIsactive) {
    this.bEzmaxinvoicingIsactive = bEzmaxinvoicingIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzmaxinvoicingAutocompleteElementResponse ezmaxinvoicingAutocompleteElementResponse = (EzmaxinvoicingAutocompleteElementResponse) o;
    return (this.yyyymmEzmaxinvoicing == null ? ezmaxinvoicingAutocompleteElementResponse.yyyymmEzmaxinvoicing == null : this.yyyymmEzmaxinvoicing.equals(ezmaxinvoicingAutocompleteElementResponse.yyyymmEzmaxinvoicing)) &&
        (this.pkiEzmaxinvoicingID == null ? ezmaxinvoicingAutocompleteElementResponse.pkiEzmaxinvoicingID == null : this.pkiEzmaxinvoicingID.equals(ezmaxinvoicingAutocompleteElementResponse.pkiEzmaxinvoicingID)) &&
        (this.bEzmaxinvoicingIsactive == null ? ezmaxinvoicingAutocompleteElementResponse.bEzmaxinvoicingIsactive == null : this.bEzmaxinvoicingIsactive.equals(ezmaxinvoicingAutocompleteElementResponse.bEzmaxinvoicingIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.yyyymmEzmaxinvoicing == null ? 0: this.yyyymmEzmaxinvoicing.hashCode());
    result = 31 * result + (this.pkiEzmaxinvoicingID == null ? 0: this.pkiEzmaxinvoicingID.hashCode());
    result = 31 * result + (this.bEzmaxinvoicingIsactive == null ? 0: this.bEzmaxinvoicingIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzmaxinvoicingAutocompleteElementResponse {\n");
    
    sb.append("  yyyymmEzmaxinvoicing: ").append(yyyymmEzmaxinvoicing).append("\n");
    sb.append("  pkiEzmaxinvoicingID: ").append(pkiEzmaxinvoicingID).append("\n");
    sb.append("  bEzmaxinvoicingIsactive: ").append(bEzmaxinvoicingIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
