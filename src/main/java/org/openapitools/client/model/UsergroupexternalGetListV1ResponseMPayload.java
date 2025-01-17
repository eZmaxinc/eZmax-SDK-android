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
import org.openapitools.client.model.CommonGetListV1ResponseMPayload;
import org.openapitools.client.model.UsergroupexternalListElement;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/usergroupexternal/getList
 **/
@ApiModel(description = "Payload for GET /1/object/usergroupexternal/getList")
public class UsergroupexternalGetListV1ResponseMPayload extends CommonGetListV1ResponseMPayload {
  
  @SerializedName("iRowReturned")
  private Integer iRowReturned = null;
  @SerializedName("iRowFiltered")
  private Integer iRowFiltered = null;
  @SerializedName("a_objUsergroupexternal")
  private List<UsergroupexternalListElement> aObjUsergroupexternal = null;

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
  public List<UsergroupexternalListElement> getAObjUsergroupexternal() {
    return aObjUsergroupexternal;
  }
  public void setAObjUsergroupexternal(List<UsergroupexternalListElement> aObjUsergroupexternal) {
    this.aObjUsergroupexternal = aObjUsergroupexternal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsergroupexternalGetListV1ResponseMPayload usergroupexternalGetListV1ResponseMPayload = (UsergroupexternalGetListV1ResponseMPayload) o;
    return (this.iRowReturned == null ? usergroupexternalGetListV1ResponseMPayload.iRowReturned == null : this.iRowReturned.equals(usergroupexternalGetListV1ResponseMPayload.iRowReturned)) &&
        (this.iRowFiltered == null ? usergroupexternalGetListV1ResponseMPayload.iRowFiltered == null : this.iRowFiltered.equals(usergroupexternalGetListV1ResponseMPayload.iRowFiltered)) &&
        (this.aObjUsergroupexternal == null ? usergroupexternalGetListV1ResponseMPayload.aObjUsergroupexternal == null : this.aObjUsergroupexternal.equals(usergroupexternalGetListV1ResponseMPayload.aObjUsergroupexternal));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.iRowReturned == null ? 0: this.iRowReturned.hashCode());
    result = 31 * result + (this.iRowFiltered == null ? 0: this.iRowFiltered.hashCode());
    result = 31 * result + (this.aObjUsergroupexternal == null ? 0: this.aObjUsergroupexternal.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsergroupexternalGetListV1ResponseMPayload {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  iRowReturned: ").append(iRowReturned).append("\n");
    sb.append("  iRowFiltered: ").append(iRowFiltered).append("\n");
    sb.append("  aObjUsergroupexternal: ").append(aObjUsergroupexternal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
