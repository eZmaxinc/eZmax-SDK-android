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
 * A Ezsignsigningreason List Element
 **/
@ApiModel(description = "A Ezsignsigningreason List Element")
public class EzsignsigningreasonListElement {
  
  @SerializedName("pkiEzsignsigningreasonID")
  private Integer pkiEzsignsigningreasonID = null;
  @SerializedName("sEzsignsigningreasonDescriptionX")
  private String sEzsignsigningreasonDescriptionX = null;
  @SerializedName("bEzsignsigningreasonIsactive")
  private Boolean bEzsignsigningreasonIsactive = null;

  /**
   * The unique ID of the Ezsignsigningreason
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignsigningreason")
  public Integer getPkiEzsignsigningreasonID() {
    return pkiEzsignsigningreasonID;
  }
  public void setPkiEzsignsigningreasonID(Integer pkiEzsignsigningreasonID) {
    this.pkiEzsignsigningreasonID = pkiEzsignsigningreasonID;
  }

  /**
   * The description of the Ezsignsigningreason in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezsignsigningreason in the language of the requester")
  public String getSEzsignsigningreasonDescriptionX() {
    return sEzsignsigningreasonDescriptionX;
  }
  public void setSEzsignsigningreasonDescriptionX(String sEzsignsigningreasonDescriptionX) {
    this.sEzsignsigningreasonDescriptionX = sEzsignsigningreasonDescriptionX;
  }

  /**
   * Whether the ezsignsigningreason is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the ezsignsigningreason is active or not")
  public Boolean getBEzsignsigningreasonIsactive() {
    return bEzsignsigningreasonIsactive;
  }
  public void setBEzsignsigningreasonIsactive(Boolean bEzsignsigningreasonIsactive) {
    this.bEzsignsigningreasonIsactive = bEzsignsigningreasonIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsigningreasonListElement ezsignsigningreasonListElement = (EzsignsigningreasonListElement) o;
    return (this.pkiEzsignsigningreasonID == null ? ezsignsigningreasonListElement.pkiEzsignsigningreasonID == null : this.pkiEzsignsigningreasonID.equals(ezsignsigningreasonListElement.pkiEzsignsigningreasonID)) &&
        (this.sEzsignsigningreasonDescriptionX == null ? ezsignsigningreasonListElement.sEzsignsigningreasonDescriptionX == null : this.sEzsignsigningreasonDescriptionX.equals(ezsignsigningreasonListElement.sEzsignsigningreasonDescriptionX)) &&
        (this.bEzsignsigningreasonIsactive == null ? ezsignsigningreasonListElement.bEzsignsigningreasonIsactive == null : this.bEzsignsigningreasonIsactive.equals(ezsignsigningreasonListElement.bEzsignsigningreasonIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignsigningreasonID == null ? 0: this.pkiEzsignsigningreasonID.hashCode());
    result = 31 * result + (this.sEzsignsigningreasonDescriptionX == null ? 0: this.sEzsignsigningreasonDescriptionX.hashCode());
    result = 31 * result + (this.bEzsignsigningreasonIsactive == null ? 0: this.bEzsignsigningreasonIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsigningreasonListElement {\n");
    
    sb.append("  pkiEzsignsigningreasonID: ").append(pkiEzsignsigningreasonID).append("\n");
    sb.append("  sEzsignsigningreasonDescriptionX: ").append(sEzsignsigningreasonDescriptionX).append("\n");
    sb.append("  bEzsignsigningreasonIsactive: ").append(bEzsignsigningreasonIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
