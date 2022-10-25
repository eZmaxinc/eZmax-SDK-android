/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CustomImportEzsigntemplatepackageRelationRequest;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/ezsignfolder/{pkiEzsignfolderID}/importEzsigntemplatepackage
 **/
@ApiModel(description = "Request for POST /1/object/ezsignfolder/{pkiEzsignfolderID}/importEzsigntemplatepackage")
public class EzsignfolderImportEzsigntemplatepackageV1Request {
  
  @SerializedName("fkiEzsigntemplatepackageID")
  private Integer fkiEzsigntemplatepackageID = null;
  @SerializedName("dtEzsigndocumentDuedate")
  private String dtEzsigndocumentDuedate = null;
  @SerializedName("a_objImportEzsigntemplatepackageRelation")
  private List<CustomImportEzsigntemplatepackageRelationRequest> aObjImportEzsigntemplatepackageRelation = null;

  /**
   * The unique ID of the Ezsigntemplatepackage
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplatepackage")
  public Integer getFkiEzsigntemplatepackageID() {
    return fkiEzsigntemplatepackageID;
  }
  public void setFkiEzsigntemplatepackageID(Integer fkiEzsigntemplatepackageID) {
    this.fkiEzsigntemplatepackageID = fkiEzsigntemplatepackageID;
  }

  /**
   * The maximum date and time at which the Ezsigndocument can be signed.
   **/
  @ApiModelProperty(required = true, value = "The maximum date and time at which the Ezsigndocument can be signed.")
  public String getDtEzsigndocumentDuedate() {
    return dtEzsigndocumentDuedate;
  }
  public void setDtEzsigndocumentDuedate(String dtEzsigndocumentDuedate) {
    this.dtEzsigndocumentDuedate = dtEzsigndocumentDuedate;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomImportEzsigntemplatepackageRelationRequest> getAObjImportEzsigntemplatepackageRelation() {
    return aObjImportEzsigntemplatepackageRelation;
  }
  public void setAObjImportEzsigntemplatepackageRelation(List<CustomImportEzsigntemplatepackageRelationRequest> aObjImportEzsigntemplatepackageRelation) {
    this.aObjImportEzsigntemplatepackageRelation = aObjImportEzsigntemplatepackageRelation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderImportEzsigntemplatepackageV1Request ezsignfolderImportEzsigntemplatepackageV1Request = (EzsignfolderImportEzsigntemplatepackageV1Request) o;
    return (this.fkiEzsigntemplatepackageID == null ? ezsignfolderImportEzsigntemplatepackageV1Request.fkiEzsigntemplatepackageID == null : this.fkiEzsigntemplatepackageID.equals(ezsignfolderImportEzsigntemplatepackageV1Request.fkiEzsigntemplatepackageID)) &&
        (this.dtEzsigndocumentDuedate == null ? ezsignfolderImportEzsigntemplatepackageV1Request.dtEzsigndocumentDuedate == null : this.dtEzsigndocumentDuedate.equals(ezsignfolderImportEzsigntemplatepackageV1Request.dtEzsigndocumentDuedate)) &&
        (this.aObjImportEzsigntemplatepackageRelation == null ? ezsignfolderImportEzsigntemplatepackageV1Request.aObjImportEzsigntemplatepackageRelation == null : this.aObjImportEzsigntemplatepackageRelation.equals(ezsignfolderImportEzsigntemplatepackageV1Request.aObjImportEzsigntemplatepackageRelation));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiEzsigntemplatepackageID == null ? 0: this.fkiEzsigntemplatepackageID.hashCode());
    result = 31 * result + (this.dtEzsigndocumentDuedate == null ? 0: this.dtEzsigndocumentDuedate.hashCode());
    result = 31 * result + (this.aObjImportEzsigntemplatepackageRelation == null ? 0: this.aObjImportEzsigntemplatepackageRelation.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderImportEzsigntemplatepackageV1Request {\n");
    
    sb.append("  fkiEzsigntemplatepackageID: ").append(fkiEzsigntemplatepackageID).append("\n");
    sb.append("  dtEzsigndocumentDuedate: ").append(dtEzsigndocumentDuedate).append("\n");
    sb.append("  aObjImportEzsigntemplatepackageRelation: ").append(aObjImportEzsigntemplatepackageRelation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
