/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
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
 * A Usergroup AutocompleteElement Response
 **/
@ApiModel(description = "A Usergroup AutocompleteElement Response")
public class UsergroupAutocompleteElementResponse {
  
  @SerializedName("sUsergroupNameX")
  private String sUsergroupNameX = null;
  @SerializedName("pkiUsergroupID")
  private Integer pkiUsergroupID = null;
  @SerializedName("bUsergroupIsactive")
  private Boolean bUsergroupIsactive = null;

  /**
   * The Name of the Usergroup in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The Name of the Usergroup in the language of the requester")
  public String getSUsergroupNameX() {
    return sUsergroupNameX;
  }
  public void setSUsergroupNameX(String sUsergroupNameX) {
    this.sUsergroupNameX = sUsergroupNameX;
  }

  /**
   * The unique ID of the Usergroup
   * minimum: 1
   * maximum: 255
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Usergroup")
  public Integer getPkiUsergroupID() {
    return pkiUsergroupID;
  }
  public void setPkiUsergroupID(Integer pkiUsergroupID) {
    this.pkiUsergroupID = pkiUsergroupID;
  }

  /**
   * Whether the Usergroup is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Usergroup is active or not")
  public Boolean getBUsergroupIsactive() {
    return bUsergroupIsactive;
  }
  public void setBUsergroupIsactive(Boolean bUsergroupIsactive) {
    this.bUsergroupIsactive = bUsergroupIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsergroupAutocompleteElementResponse usergroupAutocompleteElementResponse = (UsergroupAutocompleteElementResponse) o;
    return (this.sUsergroupNameX == null ? usergroupAutocompleteElementResponse.sUsergroupNameX == null : this.sUsergroupNameX.equals(usergroupAutocompleteElementResponse.sUsergroupNameX)) &&
        (this.pkiUsergroupID == null ? usergroupAutocompleteElementResponse.pkiUsergroupID == null : this.pkiUsergroupID.equals(usergroupAutocompleteElementResponse.pkiUsergroupID)) &&
        (this.bUsergroupIsactive == null ? usergroupAutocompleteElementResponse.bUsergroupIsactive == null : this.bUsergroupIsactive.equals(usergroupAutocompleteElementResponse.bUsergroupIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sUsergroupNameX == null ? 0: this.sUsergroupNameX.hashCode());
    result = 31 * result + (this.pkiUsergroupID == null ? 0: this.pkiUsergroupID.hashCode());
    result = 31 * result + (this.bUsergroupIsactive == null ? 0: this.bUsergroupIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsergroupAutocompleteElementResponse {\n");
    
    sb.append("  sUsergroupNameX: ").append(sUsergroupNameX).append("\n");
    sb.append("  pkiUsergroupID: ").append(pkiUsergroupID).append("\n");
    sb.append("  bUsergroupIsactive: ").append(bUsergroupIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
