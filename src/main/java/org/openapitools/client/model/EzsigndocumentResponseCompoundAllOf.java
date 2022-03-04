/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CustomEzsignfoldersignerassociationstatusResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzsigndocumentResponseCompoundAllOf {
  
  @SerializedName("iEzsigndocumentStepformtotal")
  private Integer iEzsigndocumentStepformtotal = null;
  @SerializedName("iEzsigndocumentStepformcurrent")
  private Integer iEzsigndocumentStepformcurrent = null;
  @SerializedName("iEzsigndocumentStepsignaturetotal")
  private Integer iEzsigndocumentStepsignaturetotal = null;
  @SerializedName("iEzsigndocumentStepsignatureCurrent")
  private Integer iEzsigndocumentStepsignatureCurrent = null;
  @SerializedName("a_objEzsignfoldersignerassociationstatus")
  private List<CustomEzsignfoldersignerassociationstatusResponse> aObjEzsignfoldersignerassociationstatus = null;

  /**
   * The total number of steps in the form filling phase
   **/
  @ApiModelProperty(required = true, value = "The total number of steps in the form filling phase")
  public Integer getIEzsigndocumentStepformtotal() {
    return iEzsigndocumentStepformtotal;
  }
  public void setIEzsigndocumentStepformtotal(Integer iEzsigndocumentStepformtotal) {
    this.iEzsigndocumentStepformtotal = iEzsigndocumentStepformtotal;
  }

  /**
   * The current step in the form filling phase
   **/
  @ApiModelProperty(required = true, value = "The current step in the form filling phase")
  public Integer getIEzsigndocumentStepformcurrent() {
    return iEzsigndocumentStepformcurrent;
  }
  public void setIEzsigndocumentStepformcurrent(Integer iEzsigndocumentStepformcurrent) {
    this.iEzsigndocumentStepformcurrent = iEzsigndocumentStepformcurrent;
  }

  /**
   * The total number of steps in the signature filling phase
   **/
  @ApiModelProperty(required = true, value = "The total number of steps in the signature filling phase")
  public Integer getIEzsigndocumentStepsignaturetotal() {
    return iEzsigndocumentStepsignaturetotal;
  }
  public void setIEzsigndocumentStepsignaturetotal(Integer iEzsigndocumentStepsignaturetotal) {
    this.iEzsigndocumentStepsignaturetotal = iEzsigndocumentStepsignaturetotal;
  }

  /**
   * The current step in the signature phase
   **/
  @ApiModelProperty(required = true, value = "The current step in the signature phase")
  public Integer getIEzsigndocumentStepsignatureCurrent() {
    return iEzsigndocumentStepsignatureCurrent;
  }
  public void setIEzsigndocumentStepsignatureCurrent(Integer iEzsigndocumentStepsignatureCurrent) {
    this.iEzsigndocumentStepsignatureCurrent = iEzsigndocumentStepsignatureCurrent;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomEzsignfoldersignerassociationstatusResponse> getAObjEzsignfoldersignerassociationstatus() {
    return aObjEzsignfoldersignerassociationstatus;
  }
  public void setAObjEzsignfoldersignerassociationstatus(List<CustomEzsignfoldersignerassociationstatusResponse> aObjEzsignfoldersignerassociationstatus) {
    this.aObjEzsignfoldersignerassociationstatus = aObjEzsignfoldersignerassociationstatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentResponseCompoundAllOf ezsigndocumentResponseCompoundAllOf = (EzsigndocumentResponseCompoundAllOf) o;
    return (this.iEzsigndocumentStepformtotal == null ? ezsigndocumentResponseCompoundAllOf.iEzsigndocumentStepformtotal == null : this.iEzsigndocumentStepformtotal.equals(ezsigndocumentResponseCompoundAllOf.iEzsigndocumentStepformtotal)) &&
        (this.iEzsigndocumentStepformcurrent == null ? ezsigndocumentResponseCompoundAllOf.iEzsigndocumentStepformcurrent == null : this.iEzsigndocumentStepformcurrent.equals(ezsigndocumentResponseCompoundAllOf.iEzsigndocumentStepformcurrent)) &&
        (this.iEzsigndocumentStepsignaturetotal == null ? ezsigndocumentResponseCompoundAllOf.iEzsigndocumentStepsignaturetotal == null : this.iEzsigndocumentStepsignaturetotal.equals(ezsigndocumentResponseCompoundAllOf.iEzsigndocumentStepsignaturetotal)) &&
        (this.iEzsigndocumentStepsignatureCurrent == null ? ezsigndocumentResponseCompoundAllOf.iEzsigndocumentStepsignatureCurrent == null : this.iEzsigndocumentStepsignatureCurrent.equals(ezsigndocumentResponseCompoundAllOf.iEzsigndocumentStepsignatureCurrent)) &&
        (this.aObjEzsignfoldersignerassociationstatus == null ? ezsigndocumentResponseCompoundAllOf.aObjEzsignfoldersignerassociationstatus == null : this.aObjEzsignfoldersignerassociationstatus.equals(ezsigndocumentResponseCompoundAllOf.aObjEzsignfoldersignerassociationstatus));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.iEzsigndocumentStepformtotal == null ? 0: this.iEzsigndocumentStepformtotal.hashCode());
    result = 31 * result + (this.iEzsigndocumentStepformcurrent == null ? 0: this.iEzsigndocumentStepformcurrent.hashCode());
    result = 31 * result + (this.iEzsigndocumentStepsignaturetotal == null ? 0: this.iEzsigndocumentStepsignaturetotal.hashCode());
    result = 31 * result + (this.iEzsigndocumentStepsignatureCurrent == null ? 0: this.iEzsigndocumentStepsignatureCurrent.hashCode());
    result = 31 * result + (this.aObjEzsignfoldersignerassociationstatus == null ? 0: this.aObjEzsignfoldersignerassociationstatus.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentResponseCompoundAllOf {\n");
    
    sb.append("  iEzsigndocumentStepformtotal: ").append(iEzsigndocumentStepformtotal).append("\n");
    sb.append("  iEzsigndocumentStepformcurrent: ").append(iEzsigndocumentStepformcurrent).append("\n");
    sb.append("  iEzsigndocumentStepsignaturetotal: ").append(iEzsigndocumentStepsignaturetotal).append("\n");
    sb.append("  iEzsigndocumentStepsignatureCurrent: ").append(iEzsigndocumentStepsignatureCurrent).append("\n");
    sb.append("  aObjEzsignfoldersignerassociationstatus: ").append(aObjEzsignfoldersignerassociationstatus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
