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
import org.openapitools.client.model.BillingentityinternalListElement;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/billingentityinternal/getList
 **/
@ApiModel(description = "Payload for GET /1/object/billingentityinternal/getList")
public class BillingentityinternalGetListV1ResponseMPayload {
  
  @SerializedName("iRowReturned")
  private Integer iRowReturned = null;
  @SerializedName("iRowFiltered")
  private Integer iRowFiltered = null;
  @SerializedName("a_objBillingentityinternal")
  private List<BillingentityinternalListElement> aObjBillingentityinternal = null;

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

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<BillingentityinternalListElement> getAObjBillingentityinternal() {
    return aObjBillingentityinternal;
  }
  public void setAObjBillingentityinternal(List<BillingentityinternalListElement> aObjBillingentityinternal) {
    this.aObjBillingentityinternal = aObjBillingentityinternal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingentityinternalGetListV1ResponseMPayload billingentityinternalGetListV1ResponseMPayload = (BillingentityinternalGetListV1ResponseMPayload) o;
    return (this.iRowReturned == null ? billingentityinternalGetListV1ResponseMPayload.iRowReturned == null : this.iRowReturned.equals(billingentityinternalGetListV1ResponseMPayload.iRowReturned)) &&
        (this.iRowFiltered == null ? billingentityinternalGetListV1ResponseMPayload.iRowFiltered == null : this.iRowFiltered.equals(billingentityinternalGetListV1ResponseMPayload.iRowFiltered)) &&
        (this.aObjBillingentityinternal == null ? billingentityinternalGetListV1ResponseMPayload.aObjBillingentityinternal == null : this.aObjBillingentityinternal.equals(billingentityinternalGetListV1ResponseMPayload.aObjBillingentityinternal));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.iRowReturned == null ? 0: this.iRowReturned.hashCode());
    result = 31 * result + (this.iRowFiltered == null ? 0: this.iRowFiltered.hashCode());
    result = 31 * result + (this.aObjBillingentityinternal == null ? 0: this.aObjBillingentityinternal.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingentityinternalGetListV1ResponseMPayload {\n");
    
    sb.append("  iRowReturned: ").append(iRowReturned).append("\n");
    sb.append("  iRowFiltered: ").append(iRowFiltered).append("\n");
    sb.append("  aObjBillingentityinternal: ").append(aObjBillingentityinternal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
