/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign application.  We provide SDKs for customers. They are generated using OpenAPI codegen, we encourage customers to use them as we also provide samples for them.  You can choose to build your own implementation manually or can use any compatible OpenAPI 3.0 generator like Swagger Codegen, OpenAPI codegen or any commercial generators.  If you need helping understanding how to use this API, don't waste too much time looking for it. Contact support-api@ezmax.ca, we're here to help. We are developpers so we know programmers don't like bad documentation. If you don't find what you need in the documentation, let us know, we'll improve it and put you rapidly up on track.
 *
 * The version of the OpenAPI document: 1.0.29
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
 * Request for the /1/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate API Request
 **/
@ApiModel(description = "Request for the /1/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate API Request")
public class EzsigndocumentApplyEzsigntemplateV1Request {
  
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
    EzsigndocumentApplyEzsigntemplateV1Request ezsigndocumentApplyEzsigntemplateV1Request = (EzsigndocumentApplyEzsigntemplateV1Request) o;
    return (this.fkiEzsigntemplateID == null ? ezsigndocumentApplyEzsigntemplateV1Request.fkiEzsigntemplateID == null : this.fkiEzsigntemplateID.equals(ezsigndocumentApplyEzsigntemplateV1Request.fkiEzsigntemplateID)) &&
        (this.aSEzsigntemplatesigner == null ? ezsigndocumentApplyEzsigntemplateV1Request.aSEzsigntemplatesigner == null : this.aSEzsigntemplatesigner.equals(ezsigndocumentApplyEzsigntemplateV1Request.aSEzsigntemplatesigner)) &&
        (this.aPkiEzsignfoldersignerassociationID == null ? ezsigndocumentApplyEzsigntemplateV1Request.aPkiEzsignfoldersignerassociationID == null : this.aPkiEzsignfoldersignerassociationID.equals(ezsigndocumentApplyEzsigntemplateV1Request.aPkiEzsignfoldersignerassociationID));
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
    sb.append("class EzsigndocumentApplyEzsigntemplateV1Request {\n");
    
    sb.append("  fkiEzsigntemplateID: ").append(fkiEzsigntemplateID).append("\n");
    sb.append("  aSEzsigntemplatesigner: ").append(aSEzsigntemplatesigner).append("\n");
    sb.append("  aPkiEzsignfoldersignerassociationID: ").append(aPkiEzsignfoldersignerassociationID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
