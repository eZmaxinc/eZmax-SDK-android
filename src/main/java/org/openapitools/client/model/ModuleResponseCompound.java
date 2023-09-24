/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.ModulesectionResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Module Object
 **/
@ApiModel(description = "A Module Object")
public class ModuleResponseCompound {
  
  @SerializedName("pkiModuleID")
  private Integer pkiModuleID = null;
  @SerializedName("fkiModulegroupID")
  private Integer fkiModulegroupID = null;
  @SerializedName("eModuleInternalname")
  private String eModuleInternalname = null;
  @SerializedName("sModuleNameX")
  private String sModuleNameX = null;
  @SerializedName("bModuleRegistered")
  private Boolean bModuleRegistered = null;
  @SerializedName("bModuleRegisteredapi")
  private Boolean bModuleRegisteredapi = null;
  @SerializedName("a_objModulesection")
  private List<ModulesectionResponseCompound> aObjModulesection = null;

  /**
   * The unique ID of the Module
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Module")
  public Integer getPkiModuleID() {
    return pkiModuleID;
  }
  public void setPkiModuleID(Integer pkiModuleID) {
    this.pkiModuleID = pkiModuleID;
  }

  /**
   * The unique ID of the Modulegroup
   * minimum: 1
   * maximum: 255
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Modulegroup")
  public Integer getFkiModulegroupID() {
    return fkiModulegroupID;
  }
  public void setFkiModulegroupID(Integer fkiModulegroupID) {
    this.fkiModulegroupID = fkiModulegroupID;
  }

  /**
   * The Internal name of the Module.  This is theoretically an enum field but there are so many possibles values we decided not to list them all.
   **/
  @ApiModelProperty(required = true, value = "The Internal name of the Module.  This is theoretically an enum field but there are so many possibles values we decided not to list them all.")
  public String getEModuleInternalname() {
    return eModuleInternalname;
  }
  public void setEModuleInternalname(String eModuleInternalname) {
    this.eModuleInternalname = eModuleInternalname;
  }

  /**
   * The Name of the Module in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The Name of the Module in the language of the requester")
  public String getSModuleNameX() {
    return sModuleNameX;
  }
  public void setSModuleNameX(String sModuleNameX) {
    this.sModuleNameX = sModuleNameX;
  }

  /**
   * Whether the Module is registered or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Module is registered or not")
  public Boolean getBModuleRegistered() {
    return bModuleRegistered;
  }
  public void setBModuleRegistered(Boolean bModuleRegistered) {
    this.bModuleRegistered = bModuleRegistered;
  }

  /**
   * Whether the Module is registered or not for api use
   **/
  @ApiModelProperty(required = true, value = "Whether the Module is registered or not for api use")
  public Boolean getBModuleRegisteredapi() {
    return bModuleRegisteredapi;
  }
  public void setBModuleRegisteredapi(Boolean bModuleRegisteredapi) {
    this.bModuleRegisteredapi = bModuleRegisteredapi;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ModulesectionResponseCompound> getAObjModulesection() {
    return aObjModulesection;
  }
  public void setAObjModulesection(List<ModulesectionResponseCompound> aObjModulesection) {
    this.aObjModulesection = aObjModulesection;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModuleResponseCompound moduleResponseCompound = (ModuleResponseCompound) o;
    return (this.pkiModuleID == null ? moduleResponseCompound.pkiModuleID == null : this.pkiModuleID.equals(moduleResponseCompound.pkiModuleID)) &&
        (this.fkiModulegroupID == null ? moduleResponseCompound.fkiModulegroupID == null : this.fkiModulegroupID.equals(moduleResponseCompound.fkiModulegroupID)) &&
        (this.eModuleInternalname == null ? moduleResponseCompound.eModuleInternalname == null : this.eModuleInternalname.equals(moduleResponseCompound.eModuleInternalname)) &&
        (this.sModuleNameX == null ? moduleResponseCompound.sModuleNameX == null : this.sModuleNameX.equals(moduleResponseCompound.sModuleNameX)) &&
        (this.bModuleRegistered == null ? moduleResponseCompound.bModuleRegistered == null : this.bModuleRegistered.equals(moduleResponseCompound.bModuleRegistered)) &&
        (this.bModuleRegisteredapi == null ? moduleResponseCompound.bModuleRegisteredapi == null : this.bModuleRegisteredapi.equals(moduleResponseCompound.bModuleRegisteredapi)) &&
        (this.aObjModulesection == null ? moduleResponseCompound.aObjModulesection == null : this.aObjModulesection.equals(moduleResponseCompound.aObjModulesection));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiModuleID == null ? 0: this.pkiModuleID.hashCode());
    result = 31 * result + (this.fkiModulegroupID == null ? 0: this.fkiModulegroupID.hashCode());
    result = 31 * result + (this.eModuleInternalname == null ? 0: this.eModuleInternalname.hashCode());
    result = 31 * result + (this.sModuleNameX == null ? 0: this.sModuleNameX.hashCode());
    result = 31 * result + (this.bModuleRegistered == null ? 0: this.bModuleRegistered.hashCode());
    result = 31 * result + (this.bModuleRegisteredapi == null ? 0: this.bModuleRegisteredapi.hashCode());
    result = 31 * result + (this.aObjModulesection == null ? 0: this.aObjModulesection.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModuleResponseCompound {\n");
    
    sb.append("  pkiModuleID: ").append(pkiModuleID).append("\n");
    sb.append("  fkiModulegroupID: ").append(fkiModulegroupID).append("\n");
    sb.append("  eModuleInternalname: ").append(eModuleInternalname).append("\n");
    sb.append("  sModuleNameX: ").append(sModuleNameX).append("\n");
    sb.append("  bModuleRegistered: ").append(bModuleRegistered).append("\n");
    sb.append("  bModuleRegisteredapi: ").append(bModuleRegisteredapi).append("\n");
    sb.append("  aObjModulesection: ").append(aObjModulesection).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
