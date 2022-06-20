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
import org.openapitools.client.model.CustomDropdownElementRequestCompound;
import org.openapitools.client.model.EzsigntemplateformfieldRequestCompound;
import org.openapitools.client.model.EzsigntemplateformfieldgroupsignerRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzsigntemplateformfieldgroupRequestCompoundAllOf {
  
  @SerializedName("a_objEzsigntemplateformfieldgroupsigner")
  private List<EzsigntemplateformfieldgroupsignerRequestCompound> aObjEzsigntemplateformfieldgroupsigner = null;
  @SerializedName("a_objDropdownElement")
  private List<CustomDropdownElementRequestCompound> aObjDropdownElement = null;
  @SerializedName("a_objEzsigntemplateformfield")
  private List<EzsigntemplateformfieldRequestCompound> aObjEzsigntemplateformfield = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigntemplateformfieldgroupsignerRequestCompound> getAObjEzsigntemplateformfieldgroupsigner() {
    return aObjEzsigntemplateformfieldgroupsigner;
  }
  public void setAObjEzsigntemplateformfieldgroupsigner(List<EzsigntemplateformfieldgroupsignerRequestCompound> aObjEzsigntemplateformfieldgroupsigner) {
    this.aObjEzsigntemplateformfieldgroupsigner = aObjEzsigntemplateformfieldgroupsigner;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CustomDropdownElementRequestCompound> getAObjDropdownElement() {
    return aObjDropdownElement;
  }
  public void setAObjDropdownElement(List<CustomDropdownElementRequestCompound> aObjDropdownElement) {
    this.aObjDropdownElement = aObjDropdownElement;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigntemplateformfieldRequestCompound> getAObjEzsigntemplateformfield() {
    return aObjEzsigntemplateformfield;
  }
  public void setAObjEzsigntemplateformfield(List<EzsigntemplateformfieldRequestCompound> aObjEzsigntemplateformfield) {
    this.aObjEzsigntemplateformfield = aObjEzsigntemplateformfield;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplateformfieldgroupRequestCompoundAllOf ezsigntemplateformfieldgroupRequestCompoundAllOf = (EzsigntemplateformfieldgroupRequestCompoundAllOf) o;
    return (this.aObjEzsigntemplateformfieldgroupsigner == null ? ezsigntemplateformfieldgroupRequestCompoundAllOf.aObjEzsigntemplateformfieldgroupsigner == null : this.aObjEzsigntemplateformfieldgroupsigner.equals(ezsigntemplateformfieldgroupRequestCompoundAllOf.aObjEzsigntemplateformfieldgroupsigner)) &&
        (this.aObjDropdownElement == null ? ezsigntemplateformfieldgroupRequestCompoundAllOf.aObjDropdownElement == null : this.aObjDropdownElement.equals(ezsigntemplateformfieldgroupRequestCompoundAllOf.aObjDropdownElement)) &&
        (this.aObjEzsigntemplateformfield == null ? ezsigntemplateformfieldgroupRequestCompoundAllOf.aObjEzsigntemplateformfield == null : this.aObjEzsigntemplateformfield.equals(ezsigntemplateformfieldgroupRequestCompoundAllOf.aObjEzsigntemplateformfield));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsigntemplateformfieldgroupsigner == null ? 0: this.aObjEzsigntemplateformfieldgroupsigner.hashCode());
    result = 31 * result + (this.aObjDropdownElement == null ? 0: this.aObjDropdownElement.hashCode());
    result = 31 * result + (this.aObjEzsigntemplateformfield == null ? 0: this.aObjEzsigntemplateformfield.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplateformfieldgroupRequestCompoundAllOf {\n");
    
    sb.append("  aObjEzsigntemplateformfieldgroupsigner: ").append(aObjEzsigntemplateformfieldgroupsigner).append("\n");
    sb.append("  aObjDropdownElement: ").append(aObjDropdownElement).append("\n");
    sb.append("  aObjEzsigntemplateformfield: ").append(aObjEzsigntemplateformfield).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
