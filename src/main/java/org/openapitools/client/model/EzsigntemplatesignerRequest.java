/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.9
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
 * A Ezsigntemplatesigner Object
 **/
@ApiModel(description = "A Ezsigntemplatesigner Object")
public class EzsigntemplatesignerRequest {
  
  @SerializedName("pkiEzsigntemplatesignerID")
  private Integer pkiEzsigntemplatesignerID = null;
  @SerializedName("fkiEzsigntemplateID")
  private Integer fkiEzsigntemplateID = null;
  @SerializedName("sEzsigntemplatesignerDescription")
  private String sEzsigntemplatesignerDescription = null;

  /**
   * The unique ID of the Ezsigntemplatesigner
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsigntemplatesigner")
  public Integer getPkiEzsigntemplatesignerID() {
    return pkiEzsigntemplatesignerID;
  }
  public void setPkiEzsigntemplatesignerID(Integer pkiEzsigntemplatesignerID) {
    this.pkiEzsigntemplatesignerID = pkiEzsigntemplatesignerID;
  }

  /**
   * The unique ID of the Ezsigntemplate
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplate")
  public Integer getFkiEzsigntemplateID() {
    return fkiEzsigntemplateID;
  }
  public void setFkiEzsigntemplateID(Integer fkiEzsigntemplateID) {
    this.fkiEzsigntemplateID = fkiEzsigntemplateID;
  }

  /**
   * The description of the Ezsigntemplatesigner
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezsigntemplatesigner")
  public String getSEzsigntemplatesignerDescription() {
    return sEzsigntemplatesignerDescription;
  }
  public void setSEzsigntemplatesignerDescription(String sEzsigntemplatesignerDescription) {
    this.sEzsigntemplatesignerDescription = sEzsigntemplatesignerDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatesignerRequest ezsigntemplatesignerRequest = (EzsigntemplatesignerRequest) o;
    return (this.pkiEzsigntemplatesignerID == null ? ezsigntemplatesignerRequest.pkiEzsigntemplatesignerID == null : this.pkiEzsigntemplatesignerID.equals(ezsigntemplatesignerRequest.pkiEzsigntemplatesignerID)) &&
        (this.fkiEzsigntemplateID == null ? ezsigntemplatesignerRequest.fkiEzsigntemplateID == null : this.fkiEzsigntemplateID.equals(ezsigntemplatesignerRequest.fkiEzsigntemplateID)) &&
        (this.sEzsigntemplatesignerDescription == null ? ezsigntemplatesignerRequest.sEzsigntemplatesignerDescription == null : this.sEzsigntemplatesignerDescription.equals(ezsigntemplatesignerRequest.sEzsigntemplatesignerDescription));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplatesignerID == null ? 0: this.pkiEzsigntemplatesignerID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplateID == null ? 0: this.fkiEzsigntemplateID.hashCode());
    result = 31 * result + (this.sEzsigntemplatesignerDescription == null ? 0: this.sEzsigntemplatesignerDescription.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatesignerRequest {\n");
    
    sb.append("  pkiEzsigntemplatesignerID: ").append(pkiEzsigntemplatesignerID).append("\n");
    sb.append("  fkiEzsigntemplateID: ").append(fkiEzsigntemplateID).append("\n");
    sb.append("  sEzsigntemplatesignerDescription: ").append(sEzsigntemplatesignerDescription).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
