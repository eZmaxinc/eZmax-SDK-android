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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Custom Ezsignformfield Object to fill an Ezsignform using submitForm
 **/
@ApiModel(description = "A Custom Ezsignformfield Object to fill an Ezsignform using submitForm")
public class CustomEzsignformfieldRequest {
  
  @SerializedName("pkiEzsignformfieldID")
  private Integer pkiEzsignformfieldID = null;
  @SerializedName("sEzsignformfieldLabel")
  private String sEzsignformfieldLabel = null;
  @SerializedName("bEzsignformfieldSelected")
  private Boolean bEzsignformfieldSelected = null;
  @SerializedName("sEzsignformfieldEnteredvalue")
  private String sEzsignformfieldEnteredvalue = null;

  /**
   * The unique ID of the Ezsignformfield
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignformfield")
  public Integer getPkiEzsignformfieldID() {
    return pkiEzsignformfieldID;
  }
  public void setPkiEzsignformfieldID(Integer pkiEzsignformfieldID) {
    this.pkiEzsignformfieldID = pkiEzsignformfieldID;
  }

  /**
   * The Label for the Ezsignformfield
   **/
  @ApiModelProperty(value = "The Label for the Ezsignformfield")
  public String getSEzsignformfieldLabel() {
    return sEzsignformfieldLabel;
  }
  public void setSEzsignformfieldLabel(String sEzsignformfieldLabel) {
    this.sEzsignformfieldLabel = sEzsignformfieldLabel;
  }

  /**
   * Whether the Ezsignformfield is selected or not by default.  This can only be set if eEzsignformfieldgroupType is **Checkbox** or **Radio**
   **/
  @ApiModelProperty(value = "Whether the Ezsignformfield is selected or not by default.  This can only be set if eEzsignformfieldgroupType is **Checkbox** or **Radio**")
  public Boolean getBEzsignformfieldSelected() {
    return bEzsignformfieldSelected;
  }
  public void setBEzsignformfieldSelected(Boolean bEzsignformfieldSelected) {
    this.bEzsignformfieldSelected = bEzsignformfieldSelected;
  }

  /**
   * This is the value enterred for the Ezsignformfield  This can only be set if eEzsignformfieldgroupType is **Dropdown**, **Text** or **Textarea**
   **/
  @ApiModelProperty(value = "This is the value enterred for the Ezsignformfield  This can only be set if eEzsignformfieldgroupType is **Dropdown**, **Text** or **Textarea**")
  public String getSEzsignformfieldEnteredvalue() {
    return sEzsignformfieldEnteredvalue;
  }
  public void setSEzsignformfieldEnteredvalue(String sEzsignformfieldEnteredvalue) {
    this.sEzsignformfieldEnteredvalue = sEzsignformfieldEnteredvalue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEzsignformfieldRequest customEzsignformfieldRequest = (CustomEzsignformfieldRequest) o;
    return (this.pkiEzsignformfieldID == null ? customEzsignformfieldRequest.pkiEzsignformfieldID == null : this.pkiEzsignformfieldID.equals(customEzsignformfieldRequest.pkiEzsignformfieldID)) &&
        (this.sEzsignformfieldLabel == null ? customEzsignformfieldRequest.sEzsignformfieldLabel == null : this.sEzsignformfieldLabel.equals(customEzsignformfieldRequest.sEzsignformfieldLabel)) &&
        (this.bEzsignformfieldSelected == null ? customEzsignformfieldRequest.bEzsignformfieldSelected == null : this.bEzsignformfieldSelected.equals(customEzsignformfieldRequest.bEzsignformfieldSelected)) &&
        (this.sEzsignformfieldEnteredvalue == null ? customEzsignformfieldRequest.sEzsignformfieldEnteredvalue == null : this.sEzsignformfieldEnteredvalue.equals(customEzsignformfieldRequest.sEzsignformfieldEnteredvalue));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignformfieldID == null ? 0: this.pkiEzsignformfieldID.hashCode());
    result = 31 * result + (this.sEzsignformfieldLabel == null ? 0: this.sEzsignformfieldLabel.hashCode());
    result = 31 * result + (this.bEzsignformfieldSelected == null ? 0: this.bEzsignformfieldSelected.hashCode());
    result = 31 * result + (this.sEzsignformfieldEnteredvalue == null ? 0: this.sEzsignformfieldEnteredvalue.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEzsignformfieldRequest {\n");
    
    sb.append("  pkiEzsignformfieldID: ").append(pkiEzsignformfieldID).append("\n");
    sb.append("  sEzsignformfieldLabel: ").append(sEzsignformfieldLabel).append("\n");
    sb.append("  bEzsignformfieldSelected: ").append(bEzsignformfieldSelected).append("\n");
    sb.append("  sEzsignformfieldEnteredvalue: ").append(sEzsignformfieldEnteredvalue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
