/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
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
 * A Ezsigntemplateformfieldgroupsigner Object
 **/
@ApiModel(description = "A Ezsigntemplateformfieldgroupsigner Object")
public class EzsigntemplateformfieldgroupsignerRequest {
  
  @SerializedName("pkiEzsigntemplateformfieldgroupsignerID")
  private Integer pkiEzsigntemplateformfieldgroupsignerID = null;
  @SerializedName("fkiEzsigntemplatesignerID")
  private Integer fkiEzsigntemplatesignerID = null;

  /**
   * The unique ID of the Ezsigntemplateformfieldgroupsigner
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsigntemplateformfieldgroupsigner")
  public Integer getPkiEzsigntemplateformfieldgroupsignerID() {
    return pkiEzsigntemplateformfieldgroupsignerID;
  }
  public void setPkiEzsigntemplateformfieldgroupsignerID(Integer pkiEzsigntemplateformfieldgroupsignerID) {
    this.pkiEzsigntemplateformfieldgroupsignerID = pkiEzsigntemplateformfieldgroupsignerID;
  }

  /**
   * The unique ID of the Ezsigntemplatesigner
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplatesigner")
  public Integer getFkiEzsigntemplatesignerID() {
    return fkiEzsigntemplatesignerID;
  }
  public void setFkiEzsigntemplatesignerID(Integer fkiEzsigntemplatesignerID) {
    this.fkiEzsigntemplatesignerID = fkiEzsigntemplatesignerID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplateformfieldgroupsignerRequest ezsigntemplateformfieldgroupsignerRequest = (EzsigntemplateformfieldgroupsignerRequest) o;
    return (this.pkiEzsigntemplateformfieldgroupsignerID == null ? ezsigntemplateformfieldgroupsignerRequest.pkiEzsigntemplateformfieldgroupsignerID == null : this.pkiEzsigntemplateformfieldgroupsignerID.equals(ezsigntemplateformfieldgroupsignerRequest.pkiEzsigntemplateformfieldgroupsignerID)) &&
        (this.fkiEzsigntemplatesignerID == null ? ezsigntemplateformfieldgroupsignerRequest.fkiEzsigntemplatesignerID == null : this.fkiEzsigntemplatesignerID.equals(ezsigntemplateformfieldgroupsignerRequest.fkiEzsigntemplatesignerID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplateformfieldgroupsignerID == null ? 0: this.pkiEzsigntemplateformfieldgroupsignerID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplatesignerID == null ? 0: this.fkiEzsigntemplatesignerID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplateformfieldgroupsignerRequest {\n");
    
    sb.append("  pkiEzsigntemplateformfieldgroupsignerID: ").append(pkiEzsigntemplateformfieldgroupsignerID).append("\n");
    sb.append("  fkiEzsigntemplatesignerID: ").append(fkiEzsigntemplatesignerID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
