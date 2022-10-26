/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.12
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CustomDropdownElementResponseCompound;
import org.openapitools.client.model.EzsignformfieldResponseCompound;
import org.openapitools.client.model.EzsignformfieldgroupsignerResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzsignformfieldgroupResponseCompoundAllOf {
  
  @SerializedName("a_objEzsignformfield")
  private List<EzsignformfieldResponseCompound> aObjEzsignformfield = null;
  @SerializedName("a_objDropdownElement")
  private List<CustomDropdownElementResponseCompound> aObjDropdownElement = null;
  @SerializedName("a_objEzsignformfieldgroupsigner")
  private List<EzsignformfieldgroupsignerResponseCompound> aObjEzsignformfieldgroupsigner = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignformfieldResponseCompound> getAObjEzsignformfield() {
    return aObjEzsignformfield;
  }
  public void setAObjEzsignformfield(List<EzsignformfieldResponseCompound> aObjEzsignformfield) {
    this.aObjEzsignformfield = aObjEzsignformfield;
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
  public List<EzsignformfieldgroupsignerResponseCompound> getAObjEzsignformfieldgroupsigner() {
    return aObjEzsignformfieldgroupsigner;
  }
  public void setAObjEzsignformfieldgroupsigner(List<EzsignformfieldgroupsignerResponseCompound> aObjEzsignformfieldgroupsigner) {
    this.aObjEzsignformfieldgroupsigner = aObjEzsignformfieldgroupsigner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignformfieldgroupResponseCompoundAllOf ezsignformfieldgroupResponseCompoundAllOf = (EzsignformfieldgroupResponseCompoundAllOf) o;
    return (this.aObjEzsignformfield == null ? ezsignformfieldgroupResponseCompoundAllOf.aObjEzsignformfield == null : this.aObjEzsignformfield.equals(ezsignformfieldgroupResponseCompoundAllOf.aObjEzsignformfield)) &&
        (this.aObjDropdownElement == null ? ezsignformfieldgroupResponseCompoundAllOf.aObjDropdownElement == null : this.aObjDropdownElement.equals(ezsignformfieldgroupResponseCompoundAllOf.aObjDropdownElement)) &&
        (this.aObjEzsignformfieldgroupsigner == null ? ezsignformfieldgroupResponseCompoundAllOf.aObjEzsignformfieldgroupsigner == null : this.aObjEzsignformfieldgroupsigner.equals(ezsignformfieldgroupResponseCompoundAllOf.aObjEzsignformfieldgroupsigner));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignformfield == null ? 0: this.aObjEzsignformfield.hashCode());
    result = 31 * result + (this.aObjDropdownElement == null ? 0: this.aObjDropdownElement.hashCode());
    result = 31 * result + (this.aObjEzsignformfieldgroupsigner == null ? 0: this.aObjEzsignformfieldgroupsigner.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignformfieldgroupResponseCompoundAllOf {\n");
    
    sb.append("  aObjEzsignformfield: ").append(aObjEzsignformfield).append("\n");
    sb.append("  aObjDropdownElement: ").append(aObjDropdownElement).append("\n");
    sb.append("  aObjEzsignformfieldgroupsigner: ").append(aObjEzsignformfieldgroupsigner).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
