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
import org.openapitools.client.model.EzsigntemplatepackagemembershipResponseCompound;
import org.openapitools.client.model.EzsigntemplatepackagesignerResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzsigntemplatepackageResponseCompoundAllOf {
  
  @SerializedName("a_objEzsigntemplatepackagesigner")
  private List<EzsigntemplatepackagesignerResponseCompound> aObjEzsigntemplatepackagesigner = null;
  @SerializedName("a_objEzsigntemplatepackagemembership")
  private List<EzsigntemplatepackagemembershipResponseCompound> aObjEzsigntemplatepackagemembership = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigntemplatepackagesignerResponseCompound> getAObjEzsigntemplatepackagesigner() {
    return aObjEzsigntemplatepackagesigner;
  }
  public void setAObjEzsigntemplatepackagesigner(List<EzsigntemplatepackagesignerResponseCompound> aObjEzsigntemplatepackagesigner) {
    this.aObjEzsigntemplatepackagesigner = aObjEzsigntemplatepackagesigner;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigntemplatepackagemembershipResponseCompound> getAObjEzsigntemplatepackagemembership() {
    return aObjEzsigntemplatepackagemembership;
  }
  public void setAObjEzsigntemplatepackagemembership(List<EzsigntemplatepackagemembershipResponseCompound> aObjEzsigntemplatepackagemembership) {
    this.aObjEzsigntemplatepackagemembership = aObjEzsigntemplatepackagemembership;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatepackageResponseCompoundAllOf ezsigntemplatepackageResponseCompoundAllOf = (EzsigntemplatepackageResponseCompoundAllOf) o;
    return (this.aObjEzsigntemplatepackagesigner == null ? ezsigntemplatepackageResponseCompoundAllOf.aObjEzsigntemplatepackagesigner == null : this.aObjEzsigntemplatepackagesigner.equals(ezsigntemplatepackageResponseCompoundAllOf.aObjEzsigntemplatepackagesigner)) &&
        (this.aObjEzsigntemplatepackagemembership == null ? ezsigntemplatepackageResponseCompoundAllOf.aObjEzsigntemplatepackagemembership == null : this.aObjEzsigntemplatepackagemembership.equals(ezsigntemplatepackageResponseCompoundAllOf.aObjEzsigntemplatepackagemembership));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsigntemplatepackagesigner == null ? 0: this.aObjEzsigntemplatepackagesigner.hashCode());
    result = 31 * result + (this.aObjEzsigntemplatepackagemembership == null ? 0: this.aObjEzsigntemplatepackagemembership.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepackageResponseCompoundAllOf {\n");
    
    sb.append("  aObjEzsigntemplatepackagesigner: ").append(aObjEzsigntemplatepackagesigner).append("\n");
    sb.append("  aObjEzsigntemplatepackagemembership: ").append(aObjEzsigntemplatepackagemembership).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
