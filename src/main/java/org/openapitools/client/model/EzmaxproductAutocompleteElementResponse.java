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
 * A Ezmaxproduct AutocompleteElement Response
 **/
@ApiModel(description = "A Ezmaxproduct AutocompleteElement Response")
public class EzmaxproductAutocompleteElementResponse {
  
  @SerializedName("pkiEzmaxproductID")
  private Integer pkiEzmaxproductID = null;
  @SerializedName("sEzmaxproductDescriptionX")
  private String sEzmaxproductDescriptionX = null;
  @SerializedName("bEzmaxproductIsactive")
  private Boolean bEzmaxproductIsactive = null;

  /**
   * The unique ID of the Ezmaxproduct
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezmaxproduct")
  public Integer getPkiEzmaxproductID() {
    return pkiEzmaxproductID;
  }
  public void setPkiEzmaxproductID(Integer pkiEzmaxproductID) {
    this.pkiEzmaxproductID = pkiEzmaxproductID;
  }

  /**
   * The description of the Ezmaxproduct in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezmaxproduct in the language of the requester")
  public String getSEzmaxproductDescriptionX() {
    return sEzmaxproductDescriptionX;
  }
  public void setSEzmaxproductDescriptionX(String sEzmaxproductDescriptionX) {
    this.sEzmaxproductDescriptionX = sEzmaxproductDescriptionX;
  }

  /**
   * Whether the Ezmaxproduct is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezmaxproduct is active or not")
  public Boolean getBEzmaxproductIsactive() {
    return bEzmaxproductIsactive;
  }
  public void setBEzmaxproductIsactive(Boolean bEzmaxproductIsactive) {
    this.bEzmaxproductIsactive = bEzmaxproductIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzmaxproductAutocompleteElementResponse ezmaxproductAutocompleteElementResponse = (EzmaxproductAutocompleteElementResponse) o;
    return (this.pkiEzmaxproductID == null ? ezmaxproductAutocompleteElementResponse.pkiEzmaxproductID == null : this.pkiEzmaxproductID.equals(ezmaxproductAutocompleteElementResponse.pkiEzmaxproductID)) &&
        (this.sEzmaxproductDescriptionX == null ? ezmaxproductAutocompleteElementResponse.sEzmaxproductDescriptionX == null : this.sEzmaxproductDescriptionX.equals(ezmaxproductAutocompleteElementResponse.sEzmaxproductDescriptionX)) &&
        (this.bEzmaxproductIsactive == null ? ezmaxproductAutocompleteElementResponse.bEzmaxproductIsactive == null : this.bEzmaxproductIsactive.equals(ezmaxproductAutocompleteElementResponse.bEzmaxproductIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzmaxproductID == null ? 0: this.pkiEzmaxproductID.hashCode());
    result = 31 * result + (this.sEzmaxproductDescriptionX == null ? 0: this.sEzmaxproductDescriptionX.hashCode());
    result = 31 * result + (this.bEzmaxproductIsactive == null ? 0: this.bEzmaxproductIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzmaxproductAutocompleteElementResponse {\n");
    
    sb.append("  pkiEzmaxproductID: ").append(pkiEzmaxproductID).append("\n");
    sb.append("  sEzmaxproductDescriptionX: ").append(sEzmaxproductDescriptionX).append("\n");
    sb.append("  bEzmaxproductIsactive: ").append(bEzmaxproductIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
