/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
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
 * A Department AutocompleteElement Response
 **/
@ApiModel(description = "A Department AutocompleteElement Response")
public class DepartmentAutocompleteElementResponse {
  
  @SerializedName("sCompanyNameX")
  private String sCompanyNameX = null;
  @SerializedName("sDepartmentNameX")
  private String sDepartmentNameX = null;
  @SerializedName("pkiDepartmentID")
  private Integer pkiDepartmentID = null;
  @SerializedName("bDepartmentIsactive")
  private Boolean bDepartmentIsactive = null;

  /**
   * The Name of the Company in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The Name of the Company in the language of the requester")
  public String getSCompanyNameX() {
    return sCompanyNameX;
  }
  public void setSCompanyNameX(String sCompanyNameX) {
    this.sCompanyNameX = sCompanyNameX;
  }

  /**
   * The Name of the Department in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The Name of the Department in the language of the requester")
  public String getSDepartmentNameX() {
    return sDepartmentNameX;
  }
  public void setSDepartmentNameX(String sDepartmentNameX) {
    this.sDepartmentNameX = sDepartmentNameX;
  }

  /**
   * The unique ID of the Department
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Department")
  public Integer getPkiDepartmentID() {
    return pkiDepartmentID;
  }
  public void setPkiDepartmentID(Integer pkiDepartmentID) {
    this.pkiDepartmentID = pkiDepartmentID;
  }

  /**
   * Whether the Department is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Department is active or not")
  public Boolean getBDepartmentIsactive() {
    return bDepartmentIsactive;
  }
  public void setBDepartmentIsactive(Boolean bDepartmentIsactive) {
    this.bDepartmentIsactive = bDepartmentIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepartmentAutocompleteElementResponse departmentAutocompleteElementResponse = (DepartmentAutocompleteElementResponse) o;
    return (this.sCompanyNameX == null ? departmentAutocompleteElementResponse.sCompanyNameX == null : this.sCompanyNameX.equals(departmentAutocompleteElementResponse.sCompanyNameX)) &&
        (this.sDepartmentNameX == null ? departmentAutocompleteElementResponse.sDepartmentNameX == null : this.sDepartmentNameX.equals(departmentAutocompleteElementResponse.sDepartmentNameX)) &&
        (this.pkiDepartmentID == null ? departmentAutocompleteElementResponse.pkiDepartmentID == null : this.pkiDepartmentID.equals(departmentAutocompleteElementResponse.pkiDepartmentID)) &&
        (this.bDepartmentIsactive == null ? departmentAutocompleteElementResponse.bDepartmentIsactive == null : this.bDepartmentIsactive.equals(departmentAutocompleteElementResponse.bDepartmentIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sCompanyNameX == null ? 0: this.sCompanyNameX.hashCode());
    result = 31 * result + (this.sDepartmentNameX == null ? 0: this.sDepartmentNameX.hashCode());
    result = 31 * result + (this.pkiDepartmentID == null ? 0: this.pkiDepartmentID.hashCode());
    result = 31 * result + (this.bDepartmentIsactive == null ? 0: this.bDepartmentIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepartmentAutocompleteElementResponse {\n");
    
    sb.append("  sCompanyNameX: ").append(sCompanyNameX).append("\n");
    sb.append("  sDepartmentNameX: ").append(sDepartmentNameX).append("\n");
    sb.append("  pkiDepartmentID: ").append(pkiDepartmentID).append("\n");
    sb.append("  bDepartmentIsactive: ").append(bDepartmentIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
