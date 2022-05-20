/**
 * eZmax API Definition (Full)
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
import org.openapitools.client.model.EzsigntemplatedocumentResponse;
import org.openapitools.client.model.EzsigntemplatesignerResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzsigntemplateResponseCompoundAllOf {
  
  @SerializedName("objEzsigntemplatedocument")
  private EzsigntemplatedocumentResponse objEzsigntemplatedocument = null;
  @SerializedName("a_objEzsigntemplatesigner")
  private List<EzsigntemplatesignerResponseCompound> aObjEzsigntemplatesigner = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsigntemplatedocumentResponse getObjEzsigntemplatedocument() {
    return objEzsigntemplatedocument;
  }
  public void setObjEzsigntemplatedocument(EzsigntemplatedocumentResponse objEzsigntemplatedocument) {
    this.objEzsigntemplatedocument = objEzsigntemplatedocument;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigntemplatesignerResponseCompound> getAObjEzsigntemplatesigner() {
    return aObjEzsigntemplatesigner;
  }
  public void setAObjEzsigntemplatesigner(List<EzsigntemplatesignerResponseCompound> aObjEzsigntemplatesigner) {
    this.aObjEzsigntemplatesigner = aObjEzsigntemplatesigner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplateResponseCompoundAllOf ezsigntemplateResponseCompoundAllOf = (EzsigntemplateResponseCompoundAllOf) o;
    return (this.objEzsigntemplatedocument == null ? ezsigntemplateResponseCompoundAllOf.objEzsigntemplatedocument == null : this.objEzsigntemplatedocument.equals(ezsigntemplateResponseCompoundAllOf.objEzsigntemplatedocument)) &&
        (this.aObjEzsigntemplatesigner == null ? ezsigntemplateResponseCompoundAllOf.aObjEzsigntemplatesigner == null : this.aObjEzsigntemplatesigner.equals(ezsigntemplateResponseCompoundAllOf.aObjEzsigntemplatesigner));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsigntemplatedocument == null ? 0: this.objEzsigntemplatedocument.hashCode());
    result = 31 * result + (this.aObjEzsigntemplatesigner == null ? 0: this.aObjEzsigntemplatesigner.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplateResponseCompoundAllOf {\n");
    
    sb.append("  objEzsigntemplatedocument: ").append(objEzsigntemplatedocument).append("\n");
    sb.append("  aObjEzsigntemplatesigner: ").append(aObjEzsigntemplatesigner).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}