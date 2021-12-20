/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.4
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsignformfieldResponse;
import org.openapitools.client.model.EzsignformfieldgroupResponse;
import org.openapitools.client.model.EzsignformfieldgroupResponseCompoundAllOf;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignformfieldgroup Object and children to create a complete structure
 **/
@ApiModel(description = "An Ezsignformfieldgroup Object and children to create a complete structure")
public class EzsignformfieldgroupResponseCompound {
  
  @SerializedName("sEzsignformfieldgroupLabel")
  private String sEzsignformfieldgroupLabel = null;
  @SerializedName("a_objEzsignformfield")
  private List<EzsignformfieldResponse> aObjEzsignformfield = null;

  /**
   * The Label for the Ezsignformfieldgroup
   **/
  @ApiModelProperty(required = true, value = "The Label for the Ezsignformfieldgroup")
  public String getSEzsignformfieldgroupLabel() {
    return sEzsignformfieldgroupLabel;
  }
  public void setSEzsignformfieldgroupLabel(String sEzsignformfieldgroupLabel) {
    this.sEzsignformfieldgroupLabel = sEzsignformfieldgroupLabel;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignformfieldResponse> getAObjEzsignformfield() {
    return aObjEzsignformfield;
  }
  public void setAObjEzsignformfield(List<EzsignformfieldResponse> aObjEzsignformfield) {
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
    EzsignformfieldgroupResponseCompound ezsignformfieldgroupResponseCompound = (EzsignformfieldgroupResponseCompound) o;
    return (this.sEzsignformfieldgroupLabel == null ? ezsignformfieldgroupResponseCompound.sEzsignformfieldgroupLabel == null : this.sEzsignformfieldgroupLabel.equals(ezsignformfieldgroupResponseCompound.sEzsignformfieldgroupLabel)) &&
        (this.aObjEzsignformfield == null ? ezsignformfieldgroupResponseCompound.aObjEzsignformfield == null : this.aObjEzsignformfield.equals(ezsignformfieldgroupResponseCompound.aObjEzsignformfield));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sEzsignformfieldgroupLabel == null ? 0: this.sEzsignformfieldgroupLabel.hashCode());
    result = 31 * result + (this.aObjEzsignformfield == null ? 0: this.aObjEzsignformfield.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignformfieldgroupResponseCompound {\n");
    
    sb.append("  sEzsignformfieldgroupLabel: ").append(sEzsignformfieldgroupLabel).append("\n");
    sb.append("  aObjEzsignformfield: ").append(aObjEzsignformfield).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
