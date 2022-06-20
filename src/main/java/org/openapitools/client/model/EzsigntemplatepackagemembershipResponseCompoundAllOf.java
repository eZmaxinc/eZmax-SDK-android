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
import org.openapitools.client.model.EzsigntemplatepackagesignermembershipResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzsigntemplatepackagemembershipResponseCompoundAllOf {
  
  @SerializedName("objEzsigntemplate")
  private EzsigntemplateResponseCompound objEzsigntemplate = null;
  @SerializedName("a_objEzsigntemplatepackagesignermembership")
  private List<EzsigntemplatepackagesignermembershipResponseCompound> aObjEzsigntemplatepackagesignermembership = null;

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
    EzsigntemplatepackagemembershipResponseCompoundAllOf ezsigntemplatepackagemembershipResponseCompoundAllOf = (EzsigntemplatepackagemembershipResponseCompoundAllOf) o;
    return (this.objEzsigntemplate == null ? ezsigntemplatepackagemembershipResponseCompoundAllOf.objEzsigntemplate == null : this.objEzsigntemplate.equals(ezsigntemplatepackagemembershipResponseCompoundAllOf.objEzsigntemplate)) &&
        (this.aObjEzsigntemplatepackagesignermembership == null ? ezsigntemplatepackagemembershipResponseCompoundAllOf.aObjEzsigntemplatepackagesignermembership == null : this.aObjEzsigntemplatepackagesignermembership.equals(ezsigntemplatepackagemembershipResponseCompoundAllOf.aObjEzsigntemplatepackagesignermembership));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsigntemplate == null ? 0: this.objEzsigntemplate.hashCode());
    result = 31 * result + (this.aObjEzsigntemplatepackagesignermembership == null ? 0: this.aObjEzsigntemplatepackagesignermembership.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepackagemembershipResponseCompoundAllOf {\n");
    
    sb.append("  objEzsigntemplate: ").append(objEzsigntemplate).append("\n");
    sb.append("  aObjEzsigntemplatepackagesignermembership: ").append(aObjEzsigntemplatepackagesignermembership).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
