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
import org.openapitools.client.model.CustomEzsignformfieldRequest;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Custom Ezsignformfieldgroup Object to fill an Ezsignform using submitForm
 **/
@ApiModel(description = "A Custom Ezsignformfieldgroup Object to fill an Ezsignform using submitForm")
public class CustomEzsignformfieldgroupRequest {
  
  @SerializedName("pkiEzsignformfieldgroupID")
  private Integer pkiEzsignformfieldgroupID = null;
  @SerializedName("sEzsignformfieldgroupLabel")
  private String sEzsignformfieldgroupLabel = null;
  @SerializedName("a_objEzsignformfield")
  private List<CustomEzsignformfieldRequest> aObjEzsignformfield = null;

  /**
   * The unique ID of the Ezsignformfieldgroup
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignformfieldgroup")
  public Integer getPkiEzsignformfieldgroupID() {
    return pkiEzsignformfieldgroupID;
  }
  public void setPkiEzsignformfieldgroupID(Integer pkiEzsignformfieldgroupID) {
    this.pkiEzsignformfieldgroupID = pkiEzsignformfieldgroupID;
  }

  /**
   * The Label for the Ezsignformfieldgroup
   **/
  @ApiModelProperty(value = "The Label for the Ezsignformfieldgroup")
  public String getSEzsignformfieldgroupLabel() {
    return sEzsignformfieldgroupLabel;
  }
  public void setSEzsignformfieldgroupLabel(String sEzsignformfieldgroupLabel) {
    this.sEzsignformfieldgroupLabel = sEzsignformfieldgroupLabel;
  }

  /**
   * An array containing all the values to fill the Ezsignform.
   **/
  @ApiModelProperty(required = true, value = "An array containing all the values to fill the Ezsignform.")
  public List<CustomEzsignformfieldRequest> getAObjEzsignformfield() {
    return aObjEzsignformfield;
  }
  public void setAObjEzsignformfield(List<CustomEzsignformfieldRequest> aObjEzsignformfield) {
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
    CustomEzsignformfieldgroupRequest customEzsignformfieldgroupRequest = (CustomEzsignformfieldgroupRequest) o;
    return (this.pkiEzsignformfieldgroupID == null ? customEzsignformfieldgroupRequest.pkiEzsignformfieldgroupID == null : this.pkiEzsignformfieldgroupID.equals(customEzsignformfieldgroupRequest.pkiEzsignformfieldgroupID)) &&
        (this.sEzsignformfieldgroupLabel == null ? customEzsignformfieldgroupRequest.sEzsignformfieldgroupLabel == null : this.sEzsignformfieldgroupLabel.equals(customEzsignformfieldgroupRequest.sEzsignformfieldgroupLabel)) &&
        (this.aObjEzsignformfield == null ? customEzsignformfieldgroupRequest.aObjEzsignformfield == null : this.aObjEzsignformfield.equals(customEzsignformfieldgroupRequest.aObjEzsignformfield));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignformfieldgroupID == null ? 0: this.pkiEzsignformfieldgroupID.hashCode());
    result = 31 * result + (this.sEzsignformfieldgroupLabel == null ? 0: this.sEzsignformfieldgroupLabel.hashCode());
    result = 31 * result + (this.aObjEzsignformfield == null ? 0: this.aObjEzsignformfield.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEzsignformfieldgroupRequest {\n");
    
    sb.append("  pkiEzsignformfieldgroupID: ").append(pkiEzsignformfieldgroupID).append("\n");
    sb.append("  sEzsignformfieldgroupLabel: ").append(sEzsignformfieldgroupLabel).append("\n");
    sb.append("  aObjEzsignformfield: ").append(aObjEzsignformfield).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
