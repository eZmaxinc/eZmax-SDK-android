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

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/ezsigndocument/{pkiEzsigndocumentID}/applyEzsigntemplateglobal
 **/
@ApiModel(description = "Request for POST /1/object/ezsigndocument/{pkiEzsigndocumentID}/applyEzsigntemplateglobal")
public class EzsigndocumentApplyEzsigntemplateglobalV1Request {
  
  @SerializedName("fkiEzsigntemplateglobalID")
  private Integer fkiEzsigntemplateglobalID = null;
  @SerializedName("a_sEzsigntemplateglobalsigner")
  private List<String> aSEzsigntemplateglobalsigner = null;
  @SerializedName("a_pkiEzsignfoldersignerassociationID")
  private List<Integer> aPkiEzsignfoldersignerassociationID = null;

  /**
   * The unique ID of the Ezsigntemplateglobal
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplateglobal")
  public Integer getFkiEzsigntemplateglobalID() {
    return fkiEzsigntemplateglobalID;
  }
  public void setFkiEzsigntemplateglobalID(Integer fkiEzsigntemplateglobalID) {
    this.fkiEzsigntemplateglobalID = fkiEzsigntemplateglobalID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getASEzsigntemplateglobalsigner() {
    return aSEzsigntemplateglobalsigner;
  }
  public void setASEzsigntemplateglobalsigner(List<String> aSEzsigntemplateglobalsigner) {
    this.aSEzsigntemplateglobalsigner = aSEzsigntemplateglobalsigner;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Integer> getAPkiEzsignfoldersignerassociationID() {
    return aPkiEzsignfoldersignerassociationID;
  }
  public void setAPkiEzsignfoldersignerassociationID(List<Integer> aPkiEzsignfoldersignerassociationID) {
    this.aPkiEzsignfoldersignerassociationID = aPkiEzsignfoldersignerassociationID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentApplyEzsigntemplateglobalV1Request ezsigndocumentApplyEzsigntemplateglobalV1Request = (EzsigndocumentApplyEzsigntemplateglobalV1Request) o;
    return (this.fkiEzsigntemplateglobalID == null ? ezsigndocumentApplyEzsigntemplateglobalV1Request.fkiEzsigntemplateglobalID == null : this.fkiEzsigntemplateglobalID.equals(ezsigndocumentApplyEzsigntemplateglobalV1Request.fkiEzsigntemplateglobalID)) &&
        (this.aSEzsigntemplateglobalsigner == null ? ezsigndocumentApplyEzsigntemplateglobalV1Request.aSEzsigntemplateglobalsigner == null : this.aSEzsigntemplateglobalsigner.equals(ezsigndocumentApplyEzsigntemplateglobalV1Request.aSEzsigntemplateglobalsigner)) &&
        (this.aPkiEzsignfoldersignerassociationID == null ? ezsigndocumentApplyEzsigntemplateglobalV1Request.aPkiEzsignfoldersignerassociationID == null : this.aPkiEzsignfoldersignerassociationID.equals(ezsigndocumentApplyEzsigntemplateglobalV1Request.aPkiEzsignfoldersignerassociationID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiEzsigntemplateglobalID == null ? 0: this.fkiEzsigntemplateglobalID.hashCode());
    result = 31 * result + (this.aSEzsigntemplateglobalsigner == null ? 0: this.aSEzsigntemplateglobalsigner.hashCode());
    result = 31 * result + (this.aPkiEzsignfoldersignerassociationID == null ? 0: this.aPkiEzsignfoldersignerassociationID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentApplyEzsigntemplateglobalV1Request {\n");
    
    sb.append("  fkiEzsigntemplateglobalID: ").append(fkiEzsigntemplateglobalID).append("\n");
    sb.append("  aSEzsigntemplateglobalsigner: ").append(aSEzsigntemplateglobalsigner).append("\n");
    sb.append("  aPkiEzsignfoldersignerassociationID: ").append(aPkiEzsignfoldersignerassociationID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
