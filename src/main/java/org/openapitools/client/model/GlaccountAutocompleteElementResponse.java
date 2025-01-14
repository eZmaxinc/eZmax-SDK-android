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
 * A Glaccount AutocompleteElement Response
 **/
@ApiModel(description = "A Glaccount AutocompleteElement Response")
public class GlaccountAutocompleteElementResponse {
  
  @SerializedName("pkiGlaccountID")
  private Integer pkiGlaccountID = null;
  @SerializedName("iGlaccountCode")
  private Integer iGlaccountCode = null;
  @SerializedName("sGlaccountDescriptionX")
  private String sGlaccountDescriptionX = null;
  @SerializedName("bGlaccountIsactive")
  private Boolean bGlaccountIsactive = null;

  /**
   * The unique ID of the Glaccount
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Glaccount")
  public Integer getPkiGlaccountID() {
    return pkiGlaccountID;
  }
  public void setPkiGlaccountID(Integer pkiGlaccountID) {
    this.pkiGlaccountID = pkiGlaccountID;
  }

  /**
   * The Code of the Glaccount
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The Code of the Glaccount")
  public Integer getIGlaccountCode() {
    return iGlaccountCode;
  }
  public void setIGlaccountCode(Integer iGlaccountCode) {
    this.iGlaccountCode = iGlaccountCode;
  }

  /**
   * The Description for the Glaccount in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The Description for the Glaccount in the language of the requester")
  public String getSGlaccountDescriptionX() {
    return sGlaccountDescriptionX;
  }
  public void setSGlaccountDescriptionX(String sGlaccountDescriptionX) {
    this.sGlaccountDescriptionX = sGlaccountDescriptionX;
  }

  /**
   * Whether the Glaccount is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Glaccount is active or not")
  public Boolean getBGlaccountIsactive() {
    return bGlaccountIsactive;
  }
  public void setBGlaccountIsactive(Boolean bGlaccountIsactive) {
    this.bGlaccountIsactive = bGlaccountIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlaccountAutocompleteElementResponse glaccountAutocompleteElementResponse = (GlaccountAutocompleteElementResponse) o;
    return (this.pkiGlaccountID == null ? glaccountAutocompleteElementResponse.pkiGlaccountID == null : this.pkiGlaccountID.equals(glaccountAutocompleteElementResponse.pkiGlaccountID)) &&
        (this.iGlaccountCode == null ? glaccountAutocompleteElementResponse.iGlaccountCode == null : this.iGlaccountCode.equals(glaccountAutocompleteElementResponse.iGlaccountCode)) &&
        (this.sGlaccountDescriptionX == null ? glaccountAutocompleteElementResponse.sGlaccountDescriptionX == null : this.sGlaccountDescriptionX.equals(glaccountAutocompleteElementResponse.sGlaccountDescriptionX)) &&
        (this.bGlaccountIsactive == null ? glaccountAutocompleteElementResponse.bGlaccountIsactive == null : this.bGlaccountIsactive.equals(glaccountAutocompleteElementResponse.bGlaccountIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiGlaccountID == null ? 0: this.pkiGlaccountID.hashCode());
    result = 31 * result + (this.iGlaccountCode == null ? 0: this.iGlaccountCode.hashCode());
    result = 31 * result + (this.sGlaccountDescriptionX == null ? 0: this.sGlaccountDescriptionX.hashCode());
    result = 31 * result + (this.bGlaccountIsactive == null ? 0: this.bGlaccountIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlaccountAutocompleteElementResponse {\n");
    
    sb.append("  pkiGlaccountID: ").append(pkiGlaccountID).append("\n");
    sb.append("  iGlaccountCode: ").append(iGlaccountCode).append("\n");
    sb.append("  sGlaccountDescriptionX: ").append(sGlaccountDescriptionX).append("\n");
    sb.append("  bGlaccountIsactive: ").append(bGlaccountIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
