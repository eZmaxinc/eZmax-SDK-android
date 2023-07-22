/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
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
 * A Module Object
 **/
@ApiModel(description = "A Module Object")
public class ModuleResponse {
  
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModuleResponse moduleResponse = (ModuleResponse) o;
    return (this.pkiModuleID == null ? moduleResponse.pkiModuleID == null : this.pkiModuleID.equals(moduleResponse.pkiModuleID)) &&
        (this.fkiModulegroupID == null ? moduleResponse.fkiModulegroupID == null : this.fkiModulegroupID.equals(moduleResponse.fkiModulegroupID)) &&
        (this.eModuleInternalname == null ? moduleResponse.eModuleInternalname == null : this.eModuleInternalname.equals(moduleResponse.eModuleInternalname)) &&
        (this.sModuleNameX == null ? moduleResponse.sModuleNameX == null : this.sModuleNameX.equals(moduleResponse.sModuleNameX)) &&
        (this.bModuleRegistered == null ? moduleResponse.bModuleRegistered == null : this.bModuleRegistered.equals(moduleResponse.bModuleRegistered)) &&
        (this.bModuleRegisteredapi == null ? moduleResponse.bModuleRegisteredapi == null : this.bModuleRegisteredapi.equals(moduleResponse.bModuleRegisteredapi));
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
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModuleResponse {\n");
    
    sb.append("  pkiModuleID: ").append(pkiModuleID).append("\n");
    sb.append("  fkiModulegroupID: ").append(fkiModulegroupID).append("\n");
    sb.append("  eModuleInternalname: ").append(eModuleInternalname).append("\n");
    sb.append("  sModuleNameX: ").append(sModuleNameX).append("\n");
    sb.append("  bModuleRegistered: ").append(bModuleRegistered).append("\n");
    sb.append("  bModuleRegisteredapi: ").append(bModuleRegisteredapi).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}