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
 * An Ezsigntemplateformfieldgroupsigner Object and children to create a complete structure
 **/
@ApiModel(description = "An Ezsigntemplateformfieldgroupsigner Object and children to create a complete structure")
public class EzsigntemplateformfieldgroupsignerRequestCompound {
  
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
    EzsigntemplateformfieldgroupsignerRequestCompound ezsigntemplateformfieldgroupsignerRequestCompound = (EzsigntemplateformfieldgroupsignerRequestCompound) o;
    return (this.pkiEzsigntemplateformfieldgroupsignerID == null ? ezsigntemplateformfieldgroupsignerRequestCompound.pkiEzsigntemplateformfieldgroupsignerID == null : this.pkiEzsigntemplateformfieldgroupsignerID.equals(ezsigntemplateformfieldgroupsignerRequestCompound.pkiEzsigntemplateformfieldgroupsignerID)) &&
        (this.fkiEzsigntemplatesignerID == null ? ezsigntemplateformfieldgroupsignerRequestCompound.fkiEzsigntemplatesignerID == null : this.fkiEzsigntemplatesignerID.equals(ezsigntemplateformfieldgroupsignerRequestCompound.fkiEzsigntemplatesignerID));
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
    sb.append("class EzsigntemplateformfieldgroupsignerRequestCompound {\n");
    
    sb.append("  pkiEzsigntemplateformfieldgroupsignerID: ").append(pkiEzsigntemplateformfieldgroupsignerID).append("\n");
    sb.append("  fkiEzsigntemplatesignerID: ").append(fkiEzsigntemplatesignerID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
