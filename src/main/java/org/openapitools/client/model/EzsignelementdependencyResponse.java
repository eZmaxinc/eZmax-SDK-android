/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.FieldEEzsignelementdependencyOperator;
import org.openapitools.client.model.FieldEEzsignelementdependencyValidation;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignelementdependency Object
 **/
@ApiModel(description = "An Ezsignelementdependency Object")
public class EzsignelementdependencyResponse {
  
  @SerializedName("pkiEzsignelementdependencyID")
  private Integer pkiEzsignelementdependencyID = null;
  @SerializedName("fkiEzsignformfieldID")
  private Integer fkiEzsignformfieldID = null;
  @SerializedName("fkiEzsignsignatureID")
  private Integer fkiEzsignsignatureID = null;
  @SerializedName("fkiEzsignformfieldIDValidation")
  private Integer fkiEzsignformfieldIDValidation = null;
  @SerializedName("fkiEzsignformfieldgroupIDValidation")
  private Integer fkiEzsignformfieldgroupIDValidation = null;
  @SerializedName("eEzsignelementdependencyValidation")
  private FieldEEzsignelementdependencyValidation eEzsignelementdependencyValidation = null;
  @SerializedName("bEzsignelementdependencySelected")
  private Boolean bEzsignelementdependencySelected = null;
  @SerializedName("eEzsignelementdependencyOperator")
  private FieldEEzsignelementdependencyOperator eEzsignelementdependencyOperator = null;
  @SerializedName("sEzsignelementdependencyValue")
  private String sEzsignelementdependencyValue = null;

  /**
   * The unique ID of the Ezsignelementdependency
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignelementdependency")
  public Integer getPkiEzsignelementdependencyID() {
    return pkiEzsignelementdependencyID;
  }
  public void setPkiEzsignelementdependencyID(Integer pkiEzsignelementdependencyID) {
    this.pkiEzsignelementdependencyID = pkiEzsignelementdependencyID;
  }

  /**
   * The unique ID of the Ezsignformfield
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignformfield")
  public Integer getFkiEzsignformfieldID() {
    return fkiEzsignformfieldID;
  }
  public void setFkiEzsignformfieldID(Integer fkiEzsignformfieldID) {
    this.fkiEzsignformfieldID = fkiEzsignformfieldID;
  }

  /**
   * The unique ID of the Ezsignsignature
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignsignature")
  public Integer getFkiEzsignsignatureID() {
    return fkiEzsignsignatureID;
  }
  public void setFkiEzsignsignatureID(Integer fkiEzsignsignatureID) {
    this.fkiEzsignsignatureID = fkiEzsignsignatureID;
  }

  /**
   * The unique ID of the Ezsignformfield
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignformfield")
  public Integer getFkiEzsignformfieldIDValidation() {
    return fkiEzsignformfieldIDValidation;
  }
  public void setFkiEzsignformfieldIDValidation(Integer fkiEzsignformfieldIDValidation) {
    this.fkiEzsignformfieldIDValidation = fkiEzsignformfieldIDValidation;
  }

  /**
   * The unique ID of the Ezsignformfieldgroup
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignformfieldgroup")
  public Integer getFkiEzsignformfieldgroupIDValidation() {
    return fkiEzsignformfieldgroupIDValidation;
  }
  public void setFkiEzsignformfieldgroupIDValidation(Integer fkiEzsignformfieldgroupIDValidation) {
    this.fkiEzsignformfieldgroupIDValidation = fkiEzsignformfieldgroupIDValidation;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsignelementdependencyValidation getEEzsignelementdependencyValidation() {
    return eEzsignelementdependencyValidation;
  }
  public void setEEzsignelementdependencyValidation(FieldEEzsignelementdependencyValidation eEzsignelementdependencyValidation) {
    this.eEzsignelementdependencyValidation = eEzsignelementdependencyValidation;
  }

  /**
   * Whether if it's selected or not when using eEzsignelementdependencyValidation = Selected
   **/
  @ApiModelProperty(value = "Whether if it's selected or not when using eEzsignelementdependencyValidation = Selected")
  public Boolean getBEzsignelementdependencySelected() {
    return bEzsignelementdependencySelected;
  }
  public void setBEzsignelementdependencySelected(Boolean bEzsignelementdependencySelected) {
    this.bEzsignelementdependencySelected = bEzsignelementdependencySelected;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsignelementdependencyOperator getEEzsignelementdependencyOperator() {
    return eEzsignelementdependencyOperator;
  }
  public void setEEzsignelementdependencyOperator(FieldEEzsignelementdependencyOperator eEzsignelementdependencyOperator) {
    this.eEzsignelementdependencyOperator = eEzsignelementdependencyOperator;
  }

  /**
   * The value of the Ezsignelementdependency
   **/
  @ApiModelProperty(value = "The value of the Ezsignelementdependency")
  public String getSEzsignelementdependencyValue() {
    return sEzsignelementdependencyValue;
  }
  public void setSEzsignelementdependencyValue(String sEzsignelementdependencyValue) {
    this.sEzsignelementdependencyValue = sEzsignelementdependencyValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignelementdependencyResponse ezsignelementdependencyResponse = (EzsignelementdependencyResponse) o;
    return (this.pkiEzsignelementdependencyID == null ? ezsignelementdependencyResponse.pkiEzsignelementdependencyID == null : this.pkiEzsignelementdependencyID.equals(ezsignelementdependencyResponse.pkiEzsignelementdependencyID)) &&
        (this.fkiEzsignformfieldID == null ? ezsignelementdependencyResponse.fkiEzsignformfieldID == null : this.fkiEzsignformfieldID.equals(ezsignelementdependencyResponse.fkiEzsignformfieldID)) &&
        (this.fkiEzsignsignatureID == null ? ezsignelementdependencyResponse.fkiEzsignsignatureID == null : this.fkiEzsignsignatureID.equals(ezsignelementdependencyResponse.fkiEzsignsignatureID)) &&
        (this.fkiEzsignformfieldIDValidation == null ? ezsignelementdependencyResponse.fkiEzsignformfieldIDValidation == null : this.fkiEzsignformfieldIDValidation.equals(ezsignelementdependencyResponse.fkiEzsignformfieldIDValidation)) &&
        (this.fkiEzsignformfieldgroupIDValidation == null ? ezsignelementdependencyResponse.fkiEzsignformfieldgroupIDValidation == null : this.fkiEzsignformfieldgroupIDValidation.equals(ezsignelementdependencyResponse.fkiEzsignformfieldgroupIDValidation)) &&
        (this.eEzsignelementdependencyValidation == null ? ezsignelementdependencyResponse.eEzsignelementdependencyValidation == null : this.eEzsignelementdependencyValidation.equals(ezsignelementdependencyResponse.eEzsignelementdependencyValidation)) &&
        (this.bEzsignelementdependencySelected == null ? ezsignelementdependencyResponse.bEzsignelementdependencySelected == null : this.bEzsignelementdependencySelected.equals(ezsignelementdependencyResponse.bEzsignelementdependencySelected)) &&
        (this.eEzsignelementdependencyOperator == null ? ezsignelementdependencyResponse.eEzsignelementdependencyOperator == null : this.eEzsignelementdependencyOperator.equals(ezsignelementdependencyResponse.eEzsignelementdependencyOperator)) &&
        (this.sEzsignelementdependencyValue == null ? ezsignelementdependencyResponse.sEzsignelementdependencyValue == null : this.sEzsignelementdependencyValue.equals(ezsignelementdependencyResponse.sEzsignelementdependencyValue));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignelementdependencyID == null ? 0: this.pkiEzsignelementdependencyID.hashCode());
    result = 31 * result + (this.fkiEzsignformfieldID == null ? 0: this.fkiEzsignformfieldID.hashCode());
    result = 31 * result + (this.fkiEzsignsignatureID == null ? 0: this.fkiEzsignsignatureID.hashCode());
    result = 31 * result + (this.fkiEzsignformfieldIDValidation == null ? 0: this.fkiEzsignformfieldIDValidation.hashCode());
    result = 31 * result + (this.fkiEzsignformfieldgroupIDValidation == null ? 0: this.fkiEzsignformfieldgroupIDValidation.hashCode());
    result = 31 * result + (this.eEzsignelementdependencyValidation == null ? 0: this.eEzsignelementdependencyValidation.hashCode());
    result = 31 * result + (this.bEzsignelementdependencySelected == null ? 0: this.bEzsignelementdependencySelected.hashCode());
    result = 31 * result + (this.eEzsignelementdependencyOperator == null ? 0: this.eEzsignelementdependencyOperator.hashCode());
    result = 31 * result + (this.sEzsignelementdependencyValue == null ? 0: this.sEzsignelementdependencyValue.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignelementdependencyResponse {\n");
    
    sb.append("  pkiEzsignelementdependencyID: ").append(pkiEzsignelementdependencyID).append("\n");
    sb.append("  fkiEzsignformfieldID: ").append(fkiEzsignformfieldID).append("\n");
    sb.append("  fkiEzsignsignatureID: ").append(fkiEzsignsignatureID).append("\n");
    sb.append("  fkiEzsignformfieldIDValidation: ").append(fkiEzsignformfieldIDValidation).append("\n");
    sb.append("  fkiEzsignformfieldgroupIDValidation: ").append(fkiEzsignformfieldgroupIDValidation).append("\n");
    sb.append("  eEzsignelementdependencyValidation: ").append(eEzsignelementdependencyValidation).append("\n");
    sb.append("  bEzsignelementdependencySelected: ").append(bEzsignelementdependencySelected).append("\n");
    sb.append("  eEzsignelementdependencyOperator: ").append(eEzsignelementdependencyOperator).append("\n");
    sb.append("  sEzsignelementdependencyValue: ").append(sEzsignelementdependencyValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
