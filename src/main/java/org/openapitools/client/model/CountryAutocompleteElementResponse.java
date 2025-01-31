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
 * A Country AutocompleteElement Response
 **/
@ApiModel(description = "A Country AutocompleteElement Response")
public class CountryAutocompleteElementResponse {
  
  @SerializedName("pkiCountryID")
  private Integer pkiCountryID = null;
  @SerializedName("sCountryNameX")
  private String sCountryNameX = null;
  @SerializedName("sCountryShortname")
  private String sCountryShortname = null;
  @SerializedName("bCountryIsactive")
  private Boolean bCountryIsactive = null;

  /**
   * The unique ID of the Country.  Here are some common values (Complete list must be retrieved from API):  |Value|Description| |-|-| |1|Canada| |2|United-States|
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Country.  Here are some common values (Complete list must be retrieved from API):  |Value|Description| |-|-| |1|Canada| |2|United-States|")
  public Integer getPkiCountryID() {
    return pkiCountryID;
  }
  public void setPkiCountryID(Integer pkiCountryID) {
    this.pkiCountryID = pkiCountryID;
  }

  /**
   * The name of the Country in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The name of the Country in the language of the requester")
  public String getSCountryNameX() {
    return sCountryNameX;
  }
  public void setSCountryNameX(String sCountryNameX) {
    this.sCountryNameX = sCountryNameX;
  }

  /**
   * The shortname of the Country
   **/
  @ApiModelProperty(required = true, value = "The shortname of the Country")
  public String getSCountryShortname() {
    return sCountryShortname;
  }
  public void setSCountryShortname(String sCountryShortname) {
    this.sCountryShortname = sCountryShortname;
  }

  /**
   * Whether the Country is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Country is active or not")
  public Boolean getBCountryIsactive() {
    return bCountryIsactive;
  }
  public void setBCountryIsactive(Boolean bCountryIsactive) {
    this.bCountryIsactive = bCountryIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryAutocompleteElementResponse countryAutocompleteElementResponse = (CountryAutocompleteElementResponse) o;
    return (this.pkiCountryID == null ? countryAutocompleteElementResponse.pkiCountryID == null : this.pkiCountryID.equals(countryAutocompleteElementResponse.pkiCountryID)) &&
        (this.sCountryNameX == null ? countryAutocompleteElementResponse.sCountryNameX == null : this.sCountryNameX.equals(countryAutocompleteElementResponse.sCountryNameX)) &&
        (this.sCountryShortname == null ? countryAutocompleteElementResponse.sCountryShortname == null : this.sCountryShortname.equals(countryAutocompleteElementResponse.sCountryShortname)) &&
        (this.bCountryIsactive == null ? countryAutocompleteElementResponse.bCountryIsactive == null : this.bCountryIsactive.equals(countryAutocompleteElementResponse.bCountryIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiCountryID == null ? 0: this.pkiCountryID.hashCode());
    result = 31 * result + (this.sCountryNameX == null ? 0: this.sCountryNameX.hashCode());
    result = 31 * result + (this.sCountryShortname == null ? 0: this.sCountryShortname.hashCode());
    result = 31 * result + (this.bCountryIsactive == null ? 0: this.bCountryIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryAutocompleteElementResponse {\n");
    
    sb.append("  pkiCountryID: ").append(pkiCountryID).append("\n");
    sb.append("  sCountryNameX: ").append(sCountryNameX).append("\n");
    sb.append("  sCountryShortname: ").append(sCountryShortname).append("\n");
    sb.append("  bCountryIsactive: ").append(bCountryIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
