/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.FieldEEzsignfoldertypePrivacylevel;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsignfoldertype AutocompleteElement Response
 **/
@ApiModel(description = "A Ezsignfoldertype AutocompleteElement Response")
public class EzsignfoldertypeAutocompleteElementResponse {
  
  @SerializedName("eEzsignfoldertypePrivacylevel")
  private FieldEEzsignfoldertypePrivacylevel eEzsignfoldertypePrivacylevel = null;
  @SerializedName("sEzsignfoldertypeNameX")
  private String sEzsignfoldertypeNameX = null;
  @SerializedName("pkiEzsignfoldertypeID")
  private Integer pkiEzsignfoldertypeID = null;
  @SerializedName("bEzsignfoldertypeIsactive")
  private Boolean bEzsignfoldertypeIsactive = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsignfoldertypePrivacylevel getEEzsignfoldertypePrivacylevel() {
    return eEzsignfoldertypePrivacylevel;
  }
  public void setEEzsignfoldertypePrivacylevel(FieldEEzsignfoldertypePrivacylevel eEzsignfoldertypePrivacylevel) {
    this.eEzsignfoldertypePrivacylevel = eEzsignfoldertypePrivacylevel;
  }

  /**
   * The name of the Ezsignfoldertype in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The name of the Ezsignfoldertype in the language of the requester")
  public String getSEzsignfoldertypeNameX() {
    return sEzsignfoldertypeNameX;
  }
  public void setSEzsignfoldertypeNameX(String sEzsignfoldertypeNameX) {
    this.sEzsignfoldertypeNameX = sEzsignfoldertypeNameX;
  }

  /**
   * The unique ID of the Ezsignfoldertype.
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfoldertype.")
  public Integer getPkiEzsignfoldertypeID() {
    return pkiEzsignfoldertypeID;
  }
  public void setPkiEzsignfoldertypeID(Integer pkiEzsignfoldertypeID) {
    this.pkiEzsignfoldertypeID = pkiEzsignfoldertypeID;
  }

  /**
   * Whether the Ezsignfoldertype is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezsignfoldertype is active or not")
  public Boolean getBEzsignfoldertypeIsactive() {
    return bEzsignfoldertypeIsactive;
  }
  public void setBEzsignfoldertypeIsactive(Boolean bEzsignfoldertypeIsactive) {
    this.bEzsignfoldertypeIsactive = bEzsignfoldertypeIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfoldertypeAutocompleteElementResponse ezsignfoldertypeAutocompleteElementResponse = (EzsignfoldertypeAutocompleteElementResponse) o;
    return (this.eEzsignfoldertypePrivacylevel == null ? ezsignfoldertypeAutocompleteElementResponse.eEzsignfoldertypePrivacylevel == null : this.eEzsignfoldertypePrivacylevel.equals(ezsignfoldertypeAutocompleteElementResponse.eEzsignfoldertypePrivacylevel)) &&
        (this.sEzsignfoldertypeNameX == null ? ezsignfoldertypeAutocompleteElementResponse.sEzsignfoldertypeNameX == null : this.sEzsignfoldertypeNameX.equals(ezsignfoldertypeAutocompleteElementResponse.sEzsignfoldertypeNameX)) &&
        (this.pkiEzsignfoldertypeID == null ? ezsignfoldertypeAutocompleteElementResponse.pkiEzsignfoldertypeID == null : this.pkiEzsignfoldertypeID.equals(ezsignfoldertypeAutocompleteElementResponse.pkiEzsignfoldertypeID)) &&
        (this.bEzsignfoldertypeIsactive == null ? ezsignfoldertypeAutocompleteElementResponse.bEzsignfoldertypeIsactive == null : this.bEzsignfoldertypeIsactive.equals(ezsignfoldertypeAutocompleteElementResponse.bEzsignfoldertypeIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.eEzsignfoldertypePrivacylevel == null ? 0: this.eEzsignfoldertypePrivacylevel.hashCode());
    result = 31 * result + (this.sEzsignfoldertypeNameX == null ? 0: this.sEzsignfoldertypeNameX.hashCode());
    result = 31 * result + (this.pkiEzsignfoldertypeID == null ? 0: this.pkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeIsactive == null ? 0: this.bEzsignfoldertypeIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldertypeAutocompleteElementResponse {\n");
    
    sb.append("  eEzsignfoldertypePrivacylevel: ").append(eEzsignfoldertypePrivacylevel).append("\n");
    sb.append("  sEzsignfoldertypeNameX: ").append(sEzsignfoldertypeNameX).append("\n");
    sb.append("  pkiEzsignfoldertypeID: ").append(pkiEzsignfoldertypeID).append("\n");
    sb.append("  bEzsignfoldertypeIsactive: ").append(bEzsignfoldertypeIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
