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

import org.openapitools.client.model.EzsignbulksenddocumentmappingResponse;
import org.openapitools.client.model.EzsigntemplateResponseCompound;
import org.openapitools.client.model.EzsigntemplatepackageResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsignbulksenddocumentmapping Object
 **/
@ApiModel(description = "A Ezsignbulksenddocumentmapping Object")
public class EzsignbulksenddocumentmappingResponseCompound extends EzsignbulksenddocumentmappingResponse {
  
  @SerializedName("pkiEzsignbulksenddocumentmappingID")
  private Integer pkiEzsignbulksenddocumentmappingID = null;
  @SerializedName("fkiEzsignbulksendID")
  private Integer fkiEzsignbulksendID = null;
  @SerializedName("fkiEzsigntemplatepackageID")
  private Integer fkiEzsigntemplatepackageID = null;
  @SerializedName("fkiEzsigntemplateID")
  private Integer fkiEzsigntemplateID = null;
  @SerializedName("iEzsignbulksenddocumentmappingOrder")
  private Integer iEzsignbulksenddocumentmappingOrder = null;
  @SerializedName("objEzsigntemplate")
  private EzsigntemplateResponseCompound objEzsigntemplate = null;
  @SerializedName("objEzsigntemplatepackage")
  private EzsigntemplatepackageResponseCompound objEzsigntemplatepackage = null;

  /**
   * The unique ID of the Ezsignbulksenddocumentmapping.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignbulksenddocumentmapping.")
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

  /**
   * The order in which the Ezsigntemplate or Ezsigntemplatepackage will be presented to the signatory in the Ezsignfolder.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The order in which the Ezsigntemplate or Ezsigntemplatepackage will be presented to the signatory in the Ezsignfolder.")
  public Integer getIEzsignbulksenddocumentmappingOrder() {
    return iEzsignbulksenddocumentmappingOrder;
  }
  public void setIEzsignbulksenddocumentmappingOrder(Integer iEzsignbulksenddocumentmappingOrder) {
    this.iEzsignbulksenddocumentmappingOrder = iEzsignbulksenddocumentmappingOrder;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsigntemplateResponseCompound getObjEzsigntemplate() {
    return objEzsigntemplate;
  }
  public void setObjEzsigntemplate(EzsigntemplateResponseCompound objEzsigntemplate) {
    this.objEzsigntemplate = objEzsigntemplate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsigntemplatepackageResponseCompound getObjEzsigntemplatepackage() {
    return objEzsigntemplatepackage;
  }
  public void setObjEzsigntemplatepackage(EzsigntemplatepackageResponseCompound objEzsigntemplatepackage) {
    this.objEzsigntemplatepackage = objEzsigntemplatepackage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksenddocumentmappingResponseCompound ezsignbulksenddocumentmappingResponseCompound = (EzsignbulksenddocumentmappingResponseCompound) o;
    return (this.pkiEzsignbulksenddocumentmappingID == null ? ezsignbulksenddocumentmappingResponseCompound.pkiEzsignbulksenddocumentmappingID == null : this.pkiEzsignbulksenddocumentmappingID.equals(ezsignbulksenddocumentmappingResponseCompound.pkiEzsignbulksenddocumentmappingID)) &&
        (this.fkiEzsignbulksendID == null ? ezsignbulksenddocumentmappingResponseCompound.fkiEzsignbulksendID == null : this.fkiEzsignbulksendID.equals(ezsignbulksenddocumentmappingResponseCompound.fkiEzsignbulksendID)) &&
        (this.fkiEzsigntemplatepackageID == null ? ezsignbulksenddocumentmappingResponseCompound.fkiEzsigntemplatepackageID == null : this.fkiEzsigntemplatepackageID.equals(ezsignbulksenddocumentmappingResponseCompound.fkiEzsigntemplatepackageID)) &&
        (this.fkiEzsigntemplateID == null ? ezsignbulksenddocumentmappingResponseCompound.fkiEzsigntemplateID == null : this.fkiEzsigntemplateID.equals(ezsignbulksenddocumentmappingResponseCompound.fkiEzsigntemplateID)) &&
        (this.iEzsignbulksenddocumentmappingOrder == null ? ezsignbulksenddocumentmappingResponseCompound.iEzsignbulksenddocumentmappingOrder == null : this.iEzsignbulksenddocumentmappingOrder.equals(ezsignbulksenddocumentmappingResponseCompound.iEzsignbulksenddocumentmappingOrder)) &&
        (this.objEzsigntemplate == null ? ezsignbulksenddocumentmappingResponseCompound.objEzsigntemplate == null : this.objEzsigntemplate.equals(ezsignbulksenddocumentmappingResponseCompound.objEzsigntemplate)) &&
        (this.objEzsigntemplatepackage == null ? ezsignbulksenddocumentmappingResponseCompound.objEzsigntemplatepackage == null : this.objEzsigntemplatepackage.equals(ezsignbulksenddocumentmappingResponseCompound.objEzsigntemplatepackage));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignbulksenddocumentmappingID == null ? 0: this.pkiEzsignbulksenddocumentmappingID.hashCode());
    result = 31 * result + (this.fkiEzsignbulksendID == null ? 0: this.fkiEzsignbulksendID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplatepackageID == null ? 0: this.fkiEzsigntemplatepackageID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplateID == null ? 0: this.fkiEzsigntemplateID.hashCode());
    result = 31 * result + (this.iEzsignbulksenddocumentmappingOrder == null ? 0: this.iEzsignbulksenddocumentmappingOrder.hashCode());
    result = 31 * result + (this.objEzsigntemplate == null ? 0: this.objEzsigntemplate.hashCode());
    result = 31 * result + (this.objEzsigntemplatepackage == null ? 0: this.objEzsigntemplatepackage.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksenddocumentmappingResponseCompound {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  pkiEzsignbulksenddocumentmappingID: ").append(pkiEzsignbulksenddocumentmappingID).append("\n");
    sb.append("  fkiEzsignbulksendID: ").append(fkiEzsignbulksendID).append("\n");
    sb.append("  fkiEzsigntemplatepackageID: ").append(fkiEzsigntemplatepackageID).append("\n");
    sb.append("  fkiEzsigntemplateID: ").append(fkiEzsigntemplateID).append("\n");
    sb.append("  iEzsignbulksenddocumentmappingOrder: ").append(iEzsignbulksenddocumentmappingOrder).append("\n");
    sb.append("  objEzsigntemplate: ").append(objEzsigntemplate).append("\n");
    sb.append("  objEzsigntemplatepackage: ").append(objEzsigntemplatepackage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
