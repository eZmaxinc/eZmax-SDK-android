/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.VariableexpenseListElement;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/variableexpense/getList
 **/
@ApiModel(description = "Payload for GET /1/object/variableexpense/getList")
public class VariableexpenseGetListV1ResponseMPayload {
  
  @SerializedName("a_objVariableexpense")
  private List<VariableexpenseListElement> aObjVariableexpense = null;
  @SerializedName("iRowReturned")
  private Integer iRowReturned = null;
  @SerializedName("iRowFiltered")
  private Integer iRowFiltered = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<VariableexpenseListElement> getAObjVariableexpense() {
    return aObjVariableexpense;
  }
  public void setAObjVariableexpense(List<VariableexpenseListElement> aObjVariableexpense) {
    this.aObjVariableexpense = aObjVariableexpense;
  }

  /**
   * The number of rows returned
   **/
  @ApiModelProperty(required = true, value = "The number of rows returned")
  public Integer getIRowReturned() {
    return iRowReturned;
  }
  public void setIRowReturned(Integer iRowReturned) {
    this.iRowReturned = iRowReturned;
  }

  /**
   * The number of rows matching your filters (if any) or the total number of rows
   **/
  @ApiModelProperty(required = true, value = "The number of rows matching your filters (if any) or the total number of rows")
  public Integer getIRowFiltered() {
    return iRowFiltered;
  }
  public void setIRowFiltered(Integer iRowFiltered) {
    this.iRowFiltered = iRowFiltered;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableexpenseGetListV1ResponseMPayload variableexpenseGetListV1ResponseMPayload = (VariableexpenseGetListV1ResponseMPayload) o;
    return (this.aObjVariableexpense == null ? variableexpenseGetListV1ResponseMPayload.aObjVariableexpense == null : this.aObjVariableexpense.equals(variableexpenseGetListV1ResponseMPayload.aObjVariableexpense)) &&
        (this.iRowReturned == null ? variableexpenseGetListV1ResponseMPayload.iRowReturned == null : this.iRowReturned.equals(variableexpenseGetListV1ResponseMPayload.iRowReturned)) &&
        (this.iRowFiltered == null ? variableexpenseGetListV1ResponseMPayload.iRowFiltered == null : this.iRowFiltered.equals(variableexpenseGetListV1ResponseMPayload.iRowFiltered));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjVariableexpense == null ? 0: this.aObjVariableexpense.hashCode());
    result = 31 * result + (this.iRowReturned == null ? 0: this.iRowReturned.hashCode());
    result = 31 * result + (this.iRowFiltered == null ? 0: this.iRowFiltered.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableexpenseGetListV1ResponseMPayload {\n");
    
    sb.append("  aObjVariableexpense: ").append(aObjVariableexpense).append("\n");
    sb.append("  iRowReturned: ").append(iRowReturned).append("\n");
    sb.append("  iRowFiltered: ").append(iRowFiltered).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
