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
import org.openapitools.client.model.EzsignbulksendListElement;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/ezsignbulksend/getList
 **/
@ApiModel(description = "Payload for GET /1/object/ezsignbulksend/getList")
public class EzsignbulksendGetListV1ResponseMPayload {
  
  @SerializedName("a_objEzsignbulksend")
  private List<EzsignbulksendListElement> aObjEzsignbulksend = null;
  @SerializedName("iRowReturned")
  private Integer iRowReturned = null;
  @SerializedName("iRowFiltered")
  private Integer iRowFiltered = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignbulksendListElement> getAObjEzsignbulksend() {
    return aObjEzsignbulksend;
  }
  public void setAObjEzsignbulksend(List<EzsignbulksendListElement> aObjEzsignbulksend) {
    this.aObjEzsignbulksend = aObjEzsignbulksend;
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
    EzsignbulksendGetListV1ResponseMPayload ezsignbulksendGetListV1ResponseMPayload = (EzsignbulksendGetListV1ResponseMPayload) o;
    return (this.aObjEzsignbulksend == null ? ezsignbulksendGetListV1ResponseMPayload.aObjEzsignbulksend == null : this.aObjEzsignbulksend.equals(ezsignbulksendGetListV1ResponseMPayload.aObjEzsignbulksend)) &&
        (this.iRowReturned == null ? ezsignbulksendGetListV1ResponseMPayload.iRowReturned == null : this.iRowReturned.equals(ezsignbulksendGetListV1ResponseMPayload.iRowReturned)) &&
        (this.iRowFiltered == null ? ezsignbulksendGetListV1ResponseMPayload.iRowFiltered == null : this.iRowFiltered.equals(ezsignbulksendGetListV1ResponseMPayload.iRowFiltered));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignbulksend == null ? 0: this.aObjEzsignbulksend.hashCode());
    result = 31 * result + (this.iRowReturned == null ? 0: this.iRowReturned.hashCode());
    result = 31 * result + (this.iRowFiltered == null ? 0: this.iRowFiltered.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendGetListV1ResponseMPayload {\n");
    
    sb.append("  aObjEzsignbulksend: ").append(aObjEzsignbulksend).append("\n");
    sb.append("  iRowReturned: ").append(iRowReturned).append("\n");
    sb.append("  iRowFiltered: ").append(iRowFiltered).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
