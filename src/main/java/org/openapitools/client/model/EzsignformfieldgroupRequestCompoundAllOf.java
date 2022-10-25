/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CustomDropdownElementRequestCompound;
import org.openapitools.client.model.EzsignformfieldRequestCompound;
import org.openapitools.client.model.EzsignformfieldgroupsignerRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzsignformfieldgroupRequestCompoundAllOf {
  
  @SerializedName("a_objEzsignformfieldgroupsigner")
  private List<EzsignformfieldgroupsignerRequestCompound> aObjEzsignformfieldgroupsigner = null;
  @SerializedName("a_objDropdownElement")
  private List<CustomDropdownElementRequestCompound> aObjDropdownElement = null;
  @SerializedName("a_objEzsignformfield")
  private List<EzsignformfieldRequestCompound> aObjEzsignformfield = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignformfieldgroupsignerRequestCompound> getAObjEzsignformfieldgroupsigner() {
    return aObjEzsignformfieldgroupsigner;
  }
  public void setAObjEzsignformfieldgroupsigner(List<EzsignformfieldgroupsignerRequestCompound> aObjEzsignformfieldgroupsigner) {
    this.aObjEzsignformfieldgroupsigner = aObjEzsignformfieldgroupsigner;
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
  public List<EzsignformfieldRequestCompound> getAObjEzsignformfield() {
    return aObjEzsignformfield;
  }
  public void setAObjEzsignformfield(List<EzsignformfieldRequestCompound> aObjEzsignformfield) {
    this.aObjEzsignformfield = aObjEzsignformfield;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignformfieldgroupRequestCompoundAllOf ezsignformfieldgroupRequestCompoundAllOf = (EzsignformfieldgroupRequestCompoundAllOf) o;
    return (this.aObjEzsignformfieldgroupsigner == null ? ezsignformfieldgroupRequestCompoundAllOf.aObjEzsignformfieldgroupsigner == null : this.aObjEzsignformfieldgroupsigner.equals(ezsignformfieldgroupRequestCompoundAllOf.aObjEzsignformfieldgroupsigner)) &&
        (this.aObjDropdownElement == null ? ezsignformfieldgroupRequestCompoundAllOf.aObjDropdownElement == null : this.aObjDropdownElement.equals(ezsignformfieldgroupRequestCompoundAllOf.aObjDropdownElement)) &&
        (this.aObjEzsignformfield == null ? ezsignformfieldgroupRequestCompoundAllOf.aObjEzsignformfield == null : this.aObjEzsignformfield.equals(ezsignformfieldgroupRequestCompoundAllOf.aObjEzsignformfield));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignformfieldgroupsigner == null ? 0: this.aObjEzsignformfieldgroupsigner.hashCode());
    result = 31 * result + (this.aObjDropdownElement == null ? 0: this.aObjDropdownElement.hashCode());
    result = 31 * result + (this.aObjEzsignformfield == null ? 0: this.aObjEzsignformfield.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignformfieldgroupRequestCompoundAllOf {\n");
    
    sb.append("  aObjEzsignformfieldgroupsigner: ").append(aObjEzsignformfieldgroupsigner).append("\n");
    sb.append("  aObjDropdownElement: ").append(aObjDropdownElement).append("\n");
    sb.append("  aObjEzsignformfield: ").append(aObjEzsignformfield).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
