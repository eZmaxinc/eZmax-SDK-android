/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.8
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsigntemplateResponseCompound;
import org.openapitools.client.model.EzsigntemplatepackagemembershipResponseCompound;
import org.openapitools.client.model.EzsigntemplatepackagesignermembershipResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/ezsigntemplatepackagemembership/{pkiEzsigntemplatepackagemembershipID}
 **/
@ApiModel(description = "Payload for GET /1/object/ezsigntemplatepackagemembership/{pkiEzsigntemplatepackagemembershipID}")
public class EzsigntemplatepackagemembershipGetObjectV1ResponseMPayload {
  
  @SerializedName("pkiEzsigntemplatepackagemembershipID")
  private Integer pkiEzsigntemplatepackagemembershipID = null;
  @SerializedName("fkiEzsigntemplatepackageID")
  private Integer fkiEzsigntemplatepackageID = null;
  @SerializedName("fkiEzsigntemplateID")
  private Integer fkiEzsigntemplateID = null;
  @SerializedName("iEzsigntemplatepackagemembershipOrder")
  private Integer iEzsigntemplatepackagemembershipOrder = null;
  @SerializedName("objEzsigntemplate")
  private EzsigntemplateResponseCompound objEzsigntemplate = null;
  @SerializedName("a_objEzsigntemplatepackagesignermembership")
  private List<EzsigntemplatepackagesignermembershipResponseCompound> aObjEzsigntemplatepackagesignermembership = null;

  /**
   * The unique ID of the Ezsigntemplatepackagemembership
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplatepackagemembership")
  public Integer getPkiEzsigntemplatepackagemembershipID() {
    return pkiEzsigntemplatepackagemembershipID;
  }
  public void setPkiEzsigntemplatepackagemembershipID(Integer pkiEzsigntemplatepackagemembershipID) {
    this.pkiEzsigntemplatepackagemembershipID = pkiEzsigntemplatepackagemembershipID;
  }

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
   * The order in which the Ezsigntemplate will be imported when using an Ezsigntemplatepackage.
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The order in which the Ezsigntemplate will be imported when using an Ezsigntemplatepackage.")
  public Integer getIEzsigntemplatepackagemembershipOrder() {
    return iEzsigntemplatepackagemembershipOrder;
  }
  public void setIEzsigntemplatepackagemembershipOrder(Integer iEzsigntemplatepackagemembershipOrder) {
    this.iEzsigntemplatepackagemembershipOrder = iEzsigntemplatepackagemembershipOrder;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsigntemplateResponseCompound getObjEzsigntemplate() {
    return objEzsigntemplate;
  }
  public void setObjEzsigntemplate(EzsigntemplateResponseCompound objEzsigntemplate) {
    this.objEzsigntemplate = objEzsigntemplate;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigntemplatepackagesignermembershipResponseCompound> getAObjEzsigntemplatepackagesignermembership() {
    return aObjEzsigntemplatepackagesignermembership;
  }
  public void setAObjEzsigntemplatepackagesignermembership(List<EzsigntemplatepackagesignermembershipResponseCompound> aObjEzsigntemplatepackagesignermembership) {
    this.aObjEzsigntemplatepackagesignermembership = aObjEzsigntemplatepackagesignermembership;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatepackagemembershipGetObjectV1ResponseMPayload ezsigntemplatepackagemembershipGetObjectV1ResponseMPayload = (EzsigntemplatepackagemembershipGetObjectV1ResponseMPayload) o;
    return (this.pkiEzsigntemplatepackagemembershipID == null ? ezsigntemplatepackagemembershipGetObjectV1ResponseMPayload.pkiEzsigntemplatepackagemembershipID == null : this.pkiEzsigntemplatepackagemembershipID.equals(ezsigntemplatepackagemembershipGetObjectV1ResponseMPayload.pkiEzsigntemplatepackagemembershipID)) &&
        (this.fkiEzsigntemplatepackageID == null ? ezsigntemplatepackagemembershipGetObjectV1ResponseMPayload.fkiEzsigntemplatepackageID == null : this.fkiEzsigntemplatepackageID.equals(ezsigntemplatepackagemembershipGetObjectV1ResponseMPayload.fkiEzsigntemplatepackageID)) &&
        (this.fkiEzsigntemplateID == null ? ezsigntemplatepackagemembershipGetObjectV1ResponseMPayload.fkiEzsigntemplateID == null : this.fkiEzsigntemplateID.equals(ezsigntemplatepackagemembershipGetObjectV1ResponseMPayload.fkiEzsigntemplateID)) &&
        (this.iEzsigntemplatepackagemembershipOrder == null ? ezsigntemplatepackagemembershipGetObjectV1ResponseMPayload.iEzsigntemplatepackagemembershipOrder == null : this.iEzsigntemplatepackagemembershipOrder.equals(ezsigntemplatepackagemembershipGetObjectV1ResponseMPayload.iEzsigntemplatepackagemembershipOrder)) &&
        (this.objEzsigntemplate == null ? ezsigntemplatepackagemembershipGetObjectV1ResponseMPayload.objEzsigntemplate == null : this.objEzsigntemplate.equals(ezsigntemplatepackagemembershipGetObjectV1ResponseMPayload.objEzsigntemplate)) &&
        (this.aObjEzsigntemplatepackagesignermembership == null ? ezsigntemplatepackagemembershipGetObjectV1ResponseMPayload.aObjEzsigntemplatepackagesignermembership == null : this.aObjEzsigntemplatepackagesignermembership.equals(ezsigntemplatepackagemembershipGetObjectV1ResponseMPayload.aObjEzsigntemplatepackagesignermembership));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplatepackagemembershipID == null ? 0: this.pkiEzsigntemplatepackagemembershipID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplatepackageID == null ? 0: this.fkiEzsigntemplatepackageID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplateID == null ? 0: this.fkiEzsigntemplateID.hashCode());
    result = 31 * result + (this.iEzsigntemplatepackagemembershipOrder == null ? 0: this.iEzsigntemplatepackagemembershipOrder.hashCode());
    result = 31 * result + (this.objEzsigntemplate == null ? 0: this.objEzsigntemplate.hashCode());
    result = 31 * result + (this.aObjEzsigntemplatepackagesignermembership == null ? 0: this.aObjEzsigntemplatepackagesignermembership.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepackagemembershipGetObjectV1ResponseMPayload {\n");
    
    sb.append("  pkiEzsigntemplatepackagemembershipID: ").append(pkiEzsigntemplatepackagemembershipID).append("\n");
    sb.append("  fkiEzsigntemplatepackageID: ").append(fkiEzsigntemplatepackageID).append("\n");
    sb.append("  fkiEzsigntemplateID: ").append(fkiEzsigntemplateID).append("\n");
    sb.append("  iEzsigntemplatepackagemembershipOrder: ").append(iEzsigntemplatepackagemembershipOrder).append("\n");
    sb.append("  objEzsigntemplate: ").append(objEzsigntemplate).append("\n");
    sb.append("  aObjEzsigntemplatepackagesignermembership: ").append(aObjEzsigntemplatepackagesignermembership).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
