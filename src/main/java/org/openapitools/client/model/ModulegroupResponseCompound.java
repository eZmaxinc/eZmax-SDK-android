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

import java.util.*;
import org.openapitools.client.model.ModuleResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Modulegroup Object
 **/
@ApiModel(description = "A Modulegroup Object")
public class ModulegroupResponseCompound {
  
  @SerializedName("pkiModulegroupID")
  private Integer pkiModulegroupID = null;
  @SerializedName("sModulegroupNameX")
  private String sModulegroupNameX = null;
  @SerializedName("a_objModule")
  private List<ModuleResponseCompound> aObjModule = null;

  /**
   * The unique ID of the Modulegroup
   * minimum: 1
   * maximum: 255
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Modulegroup")
  public Integer getPkiModulegroupID() {
    return pkiModulegroupID;
  }
  public void setPkiModulegroupID(Integer pkiModulegroupID) {
    this.pkiModulegroupID = pkiModulegroupID;
  }

  /**
   * The name of the Modulegroup in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The name of the Modulegroup in the language of the requester")
  public String getSModulegroupNameX() {
    return sModulegroupNameX;
  }
  public void setSModulegroupNameX(String sModulegroupNameX) {
    this.sModulegroupNameX = sModulegroupNameX;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ModuleResponseCompound> getAObjModule() {
    return aObjModule;
  }
  public void setAObjModule(List<ModuleResponseCompound> aObjModule) {
    this.aObjModule = aObjModule;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModulegroupResponseCompound modulegroupResponseCompound = (ModulegroupResponseCompound) o;
    return (this.pkiModulegroupID == null ? modulegroupResponseCompound.pkiModulegroupID == null : this.pkiModulegroupID.equals(modulegroupResponseCompound.pkiModulegroupID)) &&
        (this.sModulegroupNameX == null ? modulegroupResponseCompound.sModulegroupNameX == null : this.sModulegroupNameX.equals(modulegroupResponseCompound.sModulegroupNameX)) &&
        (this.aObjModule == null ? modulegroupResponseCompound.aObjModule == null : this.aObjModule.equals(modulegroupResponseCompound.aObjModule));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiModulegroupID == null ? 0: this.pkiModulegroupID.hashCode());
    result = 31 * result + (this.sModulegroupNameX == null ? 0: this.sModulegroupNameX.hashCode());
    result = 31 * result + (this.aObjModule == null ? 0: this.aObjModule.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModulegroupResponseCompound {\n");
    
    sb.append("  pkiModulegroupID: ").append(pkiModulegroupID).append("\n");
    sb.append("  sModulegroupNameX: ").append(sModulegroupNameX).append("\n");
    sb.append("  aObjModule: ").append(aObjModule).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
