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
import org.openapitools.client.model.CommonGetListV1ResponseMPayload;
import org.openapitools.client.model.EzsigntemplatepackageGetListV1ResponseMPayloadAllOf;
import org.openapitools.client.model.EzsigntemplatepackageListElement;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for the /1/object/ezsigntemplatepackage/getList API Request
 **/
@ApiModel(description = "Payload for the /1/object/ezsigntemplatepackage/getList API Request")
public class EzsigntemplatepackageGetListV1ResponseMPayload {
  
  @SerializedName("a_objEzsigntemplatepackage")
  private List<EzsigntemplatepackageListElement> aObjEzsigntemplatepackage = null;
  @SerializedName("iRowReturned")
  private Integer iRowReturned = null;
  @SerializedName("iRowFiltered")
  private Integer iRowFiltered = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigntemplatepackageListElement> getAObjEzsigntemplatepackage() {
    return aObjEzsigntemplatepackage;
  }
  public void setAObjEzsigntemplatepackage(List<EzsigntemplatepackageListElement> aObjEzsigntemplatepackage) {
    this.aObjEzsigntemplatepackage = aObjEzsigntemplatepackage;
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
    EzsigntemplatepackageGetListV1ResponseMPayload ezsigntemplatepackageGetListV1ResponseMPayload = (EzsigntemplatepackageGetListV1ResponseMPayload) o;
    return (this.aObjEzsigntemplatepackage == null ? ezsigntemplatepackageGetListV1ResponseMPayload.aObjEzsigntemplatepackage == null : this.aObjEzsigntemplatepackage.equals(ezsigntemplatepackageGetListV1ResponseMPayload.aObjEzsigntemplatepackage)) &&
        (this.iRowReturned == null ? ezsigntemplatepackageGetListV1ResponseMPayload.iRowReturned == null : this.iRowReturned.equals(ezsigntemplatepackageGetListV1ResponseMPayload.iRowReturned)) &&
        (this.iRowFiltered == null ? ezsigntemplatepackageGetListV1ResponseMPayload.iRowFiltered == null : this.iRowFiltered.equals(ezsigntemplatepackageGetListV1ResponseMPayload.iRowFiltered));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsigntemplatepackage == null ? 0: this.aObjEzsigntemplatepackage.hashCode());
    result = 31 * result + (this.iRowReturned == null ? 0: this.iRowReturned.hashCode());
    result = 31 * result + (this.iRowFiltered == null ? 0: this.iRowFiltered.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepackageGetListV1ResponseMPayload {\n");
    
    sb.append("  aObjEzsigntemplatepackage: ").append(aObjEzsigntemplatepackage).append("\n");
    sb.append("  iRowReturned: ").append(iRowReturned).append("\n");
    sb.append("  iRowFiltered: ").append(iRowFiltered).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}