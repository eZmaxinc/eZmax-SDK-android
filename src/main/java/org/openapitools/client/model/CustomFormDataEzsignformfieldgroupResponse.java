/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.1
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CustomFormDataEzsignformfieldResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An FormDataSigner-&gt;Ezsignformfieldgroup Object and children to create a complete structure
 **/
@ApiModel(description = "An FormDataSigner->Ezsignformfieldgroup Object and children to create a complete structure")
public class CustomFormDataEzsignformfieldgroupResponse {
  
  @SerializedName("sEzsignformfieldgroupLabel")
  private String sEzsignformfieldgroupLabel = null;
  @SerializedName("a_objEzsignformfield")
  private List<CustomFormDataEzsignformfieldResponse> aObjEzsignformfield = null;

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
  public List<CustomFormDataEzsignformfieldResponse> getAObjEzsignformfield() {
    return aObjEzsignformfield;
  }
  public void setAObjEzsignformfield(List<CustomFormDataEzsignformfieldResponse> aObjEzsignformfield) {
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
    CustomFormDataEzsignformfieldgroupResponse customFormDataEzsignformfieldgroupResponse = (CustomFormDataEzsignformfieldgroupResponse) o;
    return (this.sEzsignformfieldgroupLabel == null ? customFormDataEzsignformfieldgroupResponse.sEzsignformfieldgroupLabel == null : this.sEzsignformfieldgroupLabel.equals(customFormDataEzsignformfieldgroupResponse.sEzsignformfieldgroupLabel)) &&
        (this.aObjEzsignformfield == null ? customFormDataEzsignformfieldgroupResponse.aObjEzsignformfield == null : this.aObjEzsignformfield.equals(customFormDataEzsignformfieldgroupResponse.aObjEzsignformfield));
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
    sb.append("class CustomFormDataEzsignformfieldgroupResponse {\n");
    
    sb.append("  sEzsignformfieldgroupLabel: ").append(sEzsignformfieldgroupLabel).append("\n");
    sb.append("  aObjEzsignformfield: ").append(aObjEzsignformfield).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
