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
import org.openapitools.client.model.CustomDropdownElementResponseCompound;
import org.openapitools.client.model.EzsigntemplateformfieldResponseCompound;
import org.openapitools.client.model.EzsigntemplateformfieldgroupsignerResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzsigntemplateformfieldgroupResponseCompoundAllOf {
  
  @SerializedName("a_objEzsigntemplateformfieldgroupsigner")
  private List<EzsigntemplateformfieldgroupsignerResponseCompound> aObjEzsigntemplateformfieldgroupsigner = null;
  @SerializedName("a_objDropdownElement")
  private List<CustomDropdownElementResponseCompound> aObjDropdownElement = null;
  @SerializedName("a_objEzsigntemplateformfield")
  private List<EzsigntemplateformfieldResponseCompound> aObjEzsigntemplateformfield = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigntemplateformfieldgroupsignerResponseCompound> getAObjEzsigntemplateformfieldgroupsigner() {
    return aObjEzsigntemplateformfieldgroupsigner;
  }
  public void setAObjEzsigntemplateformfieldgroupsigner(List<EzsigntemplateformfieldgroupsignerResponseCompound> aObjEzsigntemplateformfieldgroupsigner) {
    this.aObjEzsigntemplateformfieldgroupsigner = aObjEzsigntemplateformfieldgroupsigner;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CustomDropdownElementResponseCompound> getAObjDropdownElement() {
    return aObjDropdownElement;
  }
  public void setAObjDropdownElement(List<CustomDropdownElementResponseCompound> aObjDropdownElement) {
    this.aObjDropdownElement = aObjDropdownElement;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigntemplateformfieldResponseCompound> getAObjEzsigntemplateformfield() {
    return aObjEzsigntemplateformfield;
  }
  public void setAObjEzsigntemplateformfield(List<EzsigntemplateformfieldResponseCompound> aObjEzsigntemplateformfield) {
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
    EzsigntemplateformfieldgroupResponseCompoundAllOf ezsigntemplateformfieldgroupResponseCompoundAllOf = (EzsigntemplateformfieldgroupResponseCompoundAllOf) o;
    return (this.aObjEzsigntemplateformfieldgroupsigner == null ? ezsigntemplateformfieldgroupResponseCompoundAllOf.aObjEzsigntemplateformfieldgroupsigner == null : this.aObjEzsigntemplateformfieldgroupsigner.equals(ezsigntemplateformfieldgroupResponseCompoundAllOf.aObjEzsigntemplateformfieldgroupsigner)) &&
        (this.aObjDropdownElement == null ? ezsigntemplateformfieldgroupResponseCompoundAllOf.aObjDropdownElement == null : this.aObjDropdownElement.equals(ezsigntemplateformfieldgroupResponseCompoundAllOf.aObjDropdownElement)) &&
        (this.aObjEzsigntemplateformfield == null ? ezsigntemplateformfieldgroupResponseCompoundAllOf.aObjEzsigntemplateformfield == null : this.aObjEzsigntemplateformfield.equals(ezsigntemplateformfieldgroupResponseCompoundAllOf.aObjEzsigntemplateformfield));
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
    sb.append("class EzsigntemplateformfieldgroupResponseCompoundAllOf {\n");
    
    sb.append("  aObjEzsigntemplateformfieldgroupsigner: ").append(aObjEzsigntemplateformfieldgroupsigner).append("\n");
    sb.append("  aObjDropdownElement: ").append(aObjDropdownElement).append("\n");
    sb.append("  aObjEzsigntemplateformfield: ").append(aObjEzsigntemplateformfield).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}