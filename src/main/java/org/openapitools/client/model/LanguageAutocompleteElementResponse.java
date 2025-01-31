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
 * A Language AutocompleteElement Response
 **/
@ApiModel(description = "A Language AutocompleteElement Response")
public class LanguageAutocompleteElementResponse {
  
  @SerializedName("pkiLanguageID")
  private Integer pkiLanguageID = null;
  @SerializedName("sLanguageNameX")
  private String sLanguageNameX = null;
  @SerializedName("bLanguageIsactive")
  private Boolean bLanguageIsactive = null;

  /**
   * The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
   * minimum: 1
   * maximum: 2
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|")
  public Integer getPkiLanguageID() {
    return pkiLanguageID;
  }
  public void setPkiLanguageID(Integer pkiLanguageID) {
    this.pkiLanguageID = pkiLanguageID;
  }

  /**
   * The Name of the Language in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The Name of the Language in the language of the requester")
  public String getSLanguageNameX() {
    return sLanguageNameX;
  }
  public void setSLanguageNameX(String sLanguageNameX) {
    this.sLanguageNameX = sLanguageNameX;
  }

  /**
   * Whether the Language is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Language is active or not")
  public Boolean getBLanguageIsactive() {
    return bLanguageIsactive;
  }
  public void setBLanguageIsactive(Boolean bLanguageIsactive) {
    this.bLanguageIsactive = bLanguageIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguageAutocompleteElementResponse languageAutocompleteElementResponse = (LanguageAutocompleteElementResponse) o;
    return (this.pkiLanguageID == null ? languageAutocompleteElementResponse.pkiLanguageID == null : this.pkiLanguageID.equals(languageAutocompleteElementResponse.pkiLanguageID)) &&
        (this.sLanguageNameX == null ? languageAutocompleteElementResponse.sLanguageNameX == null : this.sLanguageNameX.equals(languageAutocompleteElementResponse.sLanguageNameX)) &&
        (this.bLanguageIsactive == null ? languageAutocompleteElementResponse.bLanguageIsactive == null : this.bLanguageIsactive.equals(languageAutocompleteElementResponse.bLanguageIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiLanguageID == null ? 0: this.pkiLanguageID.hashCode());
    result = 31 * result + (this.sLanguageNameX == null ? 0: this.sLanguageNameX.hashCode());
    result = 31 * result + (this.bLanguageIsactive == null ? 0: this.bLanguageIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageAutocompleteElementResponse {\n");
    
    sb.append("  pkiLanguageID: ").append(pkiLanguageID).append("\n");
    sb.append("  sLanguageNameX: ").append(sLanguageNameX).append("\n");
    sb.append("  bLanguageIsactive: ").append(bLanguageIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
