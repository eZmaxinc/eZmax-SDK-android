/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.5
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignformfieldgroup Object
 **/
@ApiModel(description = "An Ezsignformfieldgroup Object")
public class EzsignformfieldgroupResponse {
  
  @SerializedName("sEzsignformfieldgroupLabel")
  private String sEzsignformfieldgroupLabel = null;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignformfieldgroupResponse ezsignformfieldgroupResponse = (EzsignformfieldgroupResponse) o;
    return (this.sEzsignformfieldgroupLabel == null ? ezsignformfieldgroupResponse.sEzsignformfieldgroupLabel == null : this.sEzsignformfieldgroupLabel.equals(ezsignformfieldgroupResponse.sEzsignformfieldgroupLabel));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sEzsignformfieldgroupLabel == null ? 0: this.sEzsignformfieldgroupLabel.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignformfieldgroupResponse {\n");
    
    sb.append("  sEzsignformfieldgroupLabel: ").append(sEzsignformfieldgroupLabel).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
