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

import org.openapitools.client.model.FieldEEzsignfoldertypePrivacylevel;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignfoldertype List Element
 **/
@ApiModel(description = "An Ezsignfoldertype List Element")
public class EzsignfoldertypeListElement {
  
  @SerializedName("pkiEzsignfoldertypeID")
  private Integer pkiEzsignfoldertypeID = null;
  @SerializedName("eEzsignfoldertypePrivacylevel")
  private FieldEEzsignfoldertypePrivacylevel eEzsignfoldertypePrivacylevel = null;
  @SerializedName("sEzsignfoldertypeNameX")
  private String sEzsignfoldertypeNameX = null;
  @SerializedName("bEzsignfoldertypeIsactive")
  private Boolean bEzsignfoldertypeIsactive = null;

  /**
   * The unique ID of the Ezsignfoldertype.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfoldertype.")
  public Integer getPkiEzsignfoldertypeID() {
    return pkiEzsignfoldertypeID;
  }
  public void setPkiEzsignfoldertypeID(Integer pkiEzsignfoldertypeID) {
    this.pkiEzsignfoldertypeID = pkiEzsignfoldertypeID;
  }

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
    EzsignfoldertypeListElement ezsignfoldertypeListElement = (EzsignfoldertypeListElement) o;
    return (this.pkiEzsignfoldertypeID == null ? ezsignfoldertypeListElement.pkiEzsignfoldertypeID == null : this.pkiEzsignfoldertypeID.equals(ezsignfoldertypeListElement.pkiEzsignfoldertypeID)) &&
        (this.eEzsignfoldertypePrivacylevel == null ? ezsignfoldertypeListElement.eEzsignfoldertypePrivacylevel == null : this.eEzsignfoldertypePrivacylevel.equals(ezsignfoldertypeListElement.eEzsignfoldertypePrivacylevel)) &&
        (this.sEzsignfoldertypeNameX == null ? ezsignfoldertypeListElement.sEzsignfoldertypeNameX == null : this.sEzsignfoldertypeNameX.equals(ezsignfoldertypeListElement.sEzsignfoldertypeNameX)) &&
        (this.bEzsignfoldertypeIsactive == null ? ezsignfoldertypeListElement.bEzsignfoldertypeIsactive == null : this.bEzsignfoldertypeIsactive.equals(ezsignfoldertypeListElement.bEzsignfoldertypeIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignfoldertypeID == null ? 0: this.pkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.eEzsignfoldertypePrivacylevel == null ? 0: this.eEzsignfoldertypePrivacylevel.hashCode());
    result = 31 * result + (this.sEzsignfoldertypeNameX == null ? 0: this.sEzsignfoldertypeNameX.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeIsactive == null ? 0: this.bEzsignfoldertypeIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldertypeListElement {\n");
    
    sb.append("  pkiEzsignfoldertypeID: ").append(pkiEzsignfoldertypeID).append("\n");
    sb.append("  eEzsignfoldertypePrivacylevel: ").append(eEzsignfoldertypePrivacylevel).append("\n");
    sb.append("  sEzsignfoldertypeNameX: ").append(sEzsignfoldertypeNameX).append("\n");
    sb.append("  bEzsignfoldertypeIsactive: ").append(bEzsignfoldertypeIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
