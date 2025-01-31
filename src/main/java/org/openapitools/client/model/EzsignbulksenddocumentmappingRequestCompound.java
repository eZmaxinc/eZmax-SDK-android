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
 * A Ezsignbulksenddocumentmapping Object and children
 **/
@ApiModel(description = "A Ezsignbulksenddocumentmapping Object and children")
public class EzsignbulksenddocumentmappingRequestCompound {
  
  @SerializedName("pkiEzsignbulksenddocumentmappingID")
  private Integer pkiEzsignbulksenddocumentmappingID = null;
  @SerializedName("fkiEzsignbulksendID")
  private Integer fkiEzsignbulksendID = null;
  @SerializedName("fkiEzsigntemplatepackageID")
  private Integer fkiEzsigntemplatepackageID = null;
  @SerializedName("fkiEzsigntemplateID")
  private Integer fkiEzsigntemplateID = null;

  /**
   * The unique ID of the Ezsignbulksenddocumentmapping.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignbulksenddocumentmapping.")
  public Integer getPkiEzsignbulksenddocumentmappingID() {
    return pkiEzsignbulksenddocumentmappingID;
  }
  public void setPkiEzsignbulksenddocumentmappingID(Integer pkiEzsignbulksenddocumentmappingID) {
    this.pkiEzsignbulksenddocumentmappingID = pkiEzsignbulksenddocumentmappingID;
  }

  /**
   * The unique ID of the Ezsignbulksend
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignbulksend")
  public Integer getFkiEzsignbulksendID() {
    return fkiEzsignbulksendID;
  }
  public void setFkiEzsignbulksendID(Integer fkiEzsignbulksendID) {
    this.fkiEzsignbulksendID = fkiEzsignbulksendID;
  }

  /**
   * The unique ID of the Ezsigntemplatepackage
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsigntemplatepackage")
  public Integer getFkiEzsigntemplatepackageID() {
    return fkiEzsigntemplatepackageID;
  }
  public void setFkiEzsigntemplatepackageID(Integer fkiEzsigntemplatepackageID) {
    this.fkiEzsigntemplatepackageID = fkiEzsigntemplatepackageID;
  }

  /**
   * The unique ID of the Ezsigntemplate
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsigntemplate")
  public Integer getFkiEzsigntemplateID() {
    return fkiEzsigntemplateID;
  }
  public void setFkiEzsigntemplateID(Integer fkiEzsigntemplateID) {
    this.fkiEzsigntemplateID = fkiEzsigntemplateID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksenddocumentmappingRequestCompound ezsignbulksenddocumentmappingRequestCompound = (EzsignbulksenddocumentmappingRequestCompound) o;
    return (this.pkiEzsignbulksenddocumentmappingID == null ? ezsignbulksenddocumentmappingRequestCompound.pkiEzsignbulksenddocumentmappingID == null : this.pkiEzsignbulksenddocumentmappingID.equals(ezsignbulksenddocumentmappingRequestCompound.pkiEzsignbulksenddocumentmappingID)) &&
        (this.fkiEzsignbulksendID == null ? ezsignbulksenddocumentmappingRequestCompound.fkiEzsignbulksendID == null : this.fkiEzsignbulksendID.equals(ezsignbulksenddocumentmappingRequestCompound.fkiEzsignbulksendID)) &&
        (this.fkiEzsigntemplatepackageID == null ? ezsignbulksenddocumentmappingRequestCompound.fkiEzsigntemplatepackageID == null : this.fkiEzsigntemplatepackageID.equals(ezsignbulksenddocumentmappingRequestCompound.fkiEzsigntemplatepackageID)) &&
        (this.fkiEzsigntemplateID == null ? ezsignbulksenddocumentmappingRequestCompound.fkiEzsigntemplateID == null : this.fkiEzsigntemplateID.equals(ezsignbulksenddocumentmappingRequestCompound.fkiEzsigntemplateID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignbulksenddocumentmappingID == null ? 0: this.pkiEzsignbulksenddocumentmappingID.hashCode());
    result = 31 * result + (this.fkiEzsignbulksendID == null ? 0: this.fkiEzsignbulksendID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplatepackageID == null ? 0: this.fkiEzsigntemplatepackageID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplateID == null ? 0: this.fkiEzsigntemplateID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksenddocumentmappingRequestCompound {\n");
    
    sb.append("  pkiEzsignbulksenddocumentmappingID: ").append(pkiEzsignbulksenddocumentmappingID).append("\n");
    sb.append("  fkiEzsignbulksendID: ").append(fkiEzsignbulksendID).append("\n");
    sb.append("  fkiEzsigntemplatepackageID: ").append(fkiEzsigntemplatepackageID).append("\n");
    sb.append("  fkiEzsigntemplateID: ").append(fkiEzsigntemplateID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
