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
 * A Emailtype AutocompleteElement Response
 **/
@ApiModel(description = "A Emailtype AutocompleteElement Response")
public class EmailtypeAutocompleteElementResponse {
  
  @SerializedName("pkiEmailtypeID")
  private Integer pkiEmailtypeID = null;
  @SerializedName("sEmailtypeNameX")
  private String sEmailtypeNameX = null;
  @SerializedName("bEmailtypeIsactive")
  private Boolean bEmailtypeIsactive = null;

  /**
   * The unique ID of the Emailtype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home|
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Emailtype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home|")
  public Integer getPkiEmailtypeID() {
    return pkiEmailtypeID;
  }
  public void setPkiEmailtypeID(Integer pkiEmailtypeID) {
    this.pkiEmailtypeID = pkiEmailtypeID;
  }

  /**
   * The name of the Emailtype in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The name of the Emailtype in the language of the requester")
  public String getSEmailtypeNameX() {
    return sEmailtypeNameX;
  }
  public void setSEmailtypeNameX(String sEmailtypeNameX) {
    this.sEmailtypeNameX = sEmailtypeNameX;
  }

  /**
   * Whether the Emailtype is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Emailtype is active or not")
  public Boolean getBEmailtypeIsactive() {
    return bEmailtypeIsactive;
  }
  public void setBEmailtypeIsactive(Boolean bEmailtypeIsactive) {
    this.bEmailtypeIsactive = bEmailtypeIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailtypeAutocompleteElementResponse emailtypeAutocompleteElementResponse = (EmailtypeAutocompleteElementResponse) o;
    return (this.pkiEmailtypeID == null ? emailtypeAutocompleteElementResponse.pkiEmailtypeID == null : this.pkiEmailtypeID.equals(emailtypeAutocompleteElementResponse.pkiEmailtypeID)) &&
        (this.sEmailtypeNameX == null ? emailtypeAutocompleteElementResponse.sEmailtypeNameX == null : this.sEmailtypeNameX.equals(emailtypeAutocompleteElementResponse.sEmailtypeNameX)) &&
        (this.bEmailtypeIsactive == null ? emailtypeAutocompleteElementResponse.bEmailtypeIsactive == null : this.bEmailtypeIsactive.equals(emailtypeAutocompleteElementResponse.bEmailtypeIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEmailtypeID == null ? 0: this.pkiEmailtypeID.hashCode());
    result = 31 * result + (this.sEmailtypeNameX == null ? 0: this.sEmailtypeNameX.hashCode());
    result = 31 * result + (this.bEmailtypeIsactive == null ? 0: this.bEmailtypeIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailtypeAutocompleteElementResponse {\n");
    
    sb.append("  pkiEmailtypeID: ").append(pkiEmailtypeID).append("\n");
    sb.append("  sEmailtypeNameX: ").append(sEmailtypeNameX).append("\n");
    sb.append("  bEmailtypeIsactive: ").append(bEmailtypeIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
