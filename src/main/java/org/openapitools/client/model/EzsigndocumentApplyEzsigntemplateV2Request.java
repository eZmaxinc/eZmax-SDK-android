/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.5
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
 * Request for the /2/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate API Request
 **/
@ApiModel(description = "Request for the /2/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate API Request")
public class EzsigndocumentApplyEzsigntemplateV2Request {
  
  @SerializedName("fkiEzsigntemplateID")
  private Integer fkiEzsigntemplateID = null;
  @SerializedName("a_sEzsigntemplatesigner")
  private List<String> aSEzsigntemplatesigner = null;
  @SerializedName("a_pkiEzsignfoldersignerassociationID")
  private List<Integer> aPkiEzsignfoldersignerassociationID = null;

  /**
   * The unique ID of the Ezsigndocument
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigndocument")
  public Integer getFkiEzsigntemplateID() {
    return fkiEzsigntemplateID;
  }
  public void setFkiEzsigntemplateID(Integer fkiEzsigntemplateID) {
    this.fkiEzsigntemplateID = fkiEzsigntemplateID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getASEzsigntemplatesigner() {
    return aSEzsigntemplatesigner;
  }
  public void setASEzsigntemplatesigner(List<String> aSEzsigntemplatesigner) {
    this.aSEzsigntemplatesigner = aSEzsigntemplatesigner;
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
    EzsigndocumentApplyEzsigntemplateV2Request ezsigndocumentApplyEzsigntemplateV2Request = (EzsigndocumentApplyEzsigntemplateV2Request) o;
    return (this.fkiEzsigntemplateID == null ? ezsigndocumentApplyEzsigntemplateV2Request.fkiEzsigntemplateID == null : this.fkiEzsigntemplateID.equals(ezsigndocumentApplyEzsigntemplateV2Request.fkiEzsigntemplateID)) &&
        (this.aSEzsigntemplatesigner == null ? ezsigndocumentApplyEzsigntemplateV2Request.aSEzsigntemplatesigner == null : this.aSEzsigntemplatesigner.equals(ezsigndocumentApplyEzsigntemplateV2Request.aSEzsigntemplatesigner)) &&
        (this.aPkiEzsignfoldersignerassociationID == null ? ezsigndocumentApplyEzsigntemplateV2Request.aPkiEzsignfoldersignerassociationID == null : this.aPkiEzsignfoldersignerassociationID.equals(ezsigndocumentApplyEzsigntemplateV2Request.aPkiEzsignfoldersignerassociationID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiEzsigntemplateID == null ? 0: this.fkiEzsigntemplateID.hashCode());
    result = 31 * result + (this.aSEzsigntemplatesigner == null ? 0: this.aSEzsigntemplatesigner.hashCode());
    result = 31 * result + (this.aPkiEzsignfoldersignerassociationID == null ? 0: this.aPkiEzsignfoldersignerassociationID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentApplyEzsigntemplateV2Request {\n");
    
    sb.append("  fkiEzsigntemplateID: ").append(fkiEzsigntemplateID).append("\n");
    sb.append("  aSEzsigntemplatesigner: ").append(aSEzsigntemplatesigner).append("\n");
    sb.append("  aPkiEzsignfoldersignerassociationID: ").append(aPkiEzsignfoldersignerassociationID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
