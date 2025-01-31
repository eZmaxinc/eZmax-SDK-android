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
 * A Font AutocompleteElement Response
 **/
@ApiModel(description = "A Font AutocompleteElement Response")
public class FontAutocompleteElementResponse {
  
  @SerializedName("sFontName")
  private String sFontName = null;
  @SerializedName("pkiFontID")
  private Integer pkiFontID = null;
  @SerializedName("bFontIsactive")
  private Boolean bFontIsactive = null;

  /**
   * The name of the Font
   **/
  @ApiModelProperty(required = true, value = "The name of the Font")
  public String getSFontName() {
    return sFontName;
  }
  public void setSFontName(String sFontName) {
    this.sFontName = sFontName;
  }

  /**
   * The unique ID of the Font
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Font")
  public Integer getPkiFontID() {
    return pkiFontID;
  }
  public void setPkiFontID(Integer pkiFontID) {
    this.pkiFontID = pkiFontID;
  }

  /**
   * Whether the Font is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Font is active or not")
  public Boolean getBFontIsactive() {
    return bFontIsactive;
  }
  public void setBFontIsactive(Boolean bFontIsactive) {
    this.bFontIsactive = bFontIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FontAutocompleteElementResponse fontAutocompleteElementResponse = (FontAutocompleteElementResponse) o;
    return (this.sFontName == null ? fontAutocompleteElementResponse.sFontName == null : this.sFontName.equals(fontAutocompleteElementResponse.sFontName)) &&
        (this.pkiFontID == null ? fontAutocompleteElementResponse.pkiFontID == null : this.pkiFontID.equals(fontAutocompleteElementResponse.pkiFontID)) &&
        (this.bFontIsactive == null ? fontAutocompleteElementResponse.bFontIsactive == null : this.bFontIsactive.equals(fontAutocompleteElementResponse.bFontIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sFontName == null ? 0: this.sFontName.hashCode());
    result = 31 * result + (this.pkiFontID == null ? 0: this.pkiFontID.hashCode());
    result = 31 * result + (this.bFontIsactive == null ? 0: this.bFontIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FontAutocompleteElementResponse {\n");
    
    sb.append("  sFontName: ").append(sFontName).append("\n");
    sb.append("  pkiFontID: ").append(pkiFontID).append("\n");
    sb.append("  bFontIsactive: ").append(bFontIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
