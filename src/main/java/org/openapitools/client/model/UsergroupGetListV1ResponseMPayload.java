/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.UsergroupListElement;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/usergroup/getList
 **/
@ApiModel(description = "Payload for GET /1/object/usergroup/getList")
public class UsergroupGetListV1ResponseMPayload {
  
  @SerializedName("iRowReturned")
  private Integer iRowReturned = null;
  @SerializedName("iRowFiltered")
  private Integer iRowFiltered = null;
  @SerializedName("a_objUsergroup")
  private List<UsergroupListElement> aObjUsergroup = null;

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
  public List<UsergroupListElement> getAObjUsergroup() {
    return aObjUsergroup;
  }
  public void setAObjUsergroup(List<UsergroupListElement> aObjUsergroup) {
    this.aObjUsergroup = aObjUsergroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsergroupGetListV1ResponseMPayload usergroupGetListV1ResponseMPayload = (UsergroupGetListV1ResponseMPayload) o;
    return (this.iRowReturned == null ? usergroupGetListV1ResponseMPayload.iRowReturned == null : this.iRowReturned.equals(usergroupGetListV1ResponseMPayload.iRowReturned)) &&
        (this.iRowFiltered == null ? usergroupGetListV1ResponseMPayload.iRowFiltered == null : this.iRowFiltered.equals(usergroupGetListV1ResponseMPayload.iRowFiltered)) &&
        (this.aObjUsergroup == null ? usergroupGetListV1ResponseMPayload.aObjUsergroup == null : this.aObjUsergroup.equals(usergroupGetListV1ResponseMPayload.aObjUsergroup));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.iRowReturned == null ? 0: this.iRowReturned.hashCode());
    result = 31 * result + (this.iRowFiltered == null ? 0: this.iRowFiltered.hashCode());
    result = 31 * result + (this.aObjUsergroup == null ? 0: this.aObjUsergroup.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsergroupGetListV1ResponseMPayload {\n");
    
    sb.append("  iRowReturned: ").append(iRowReturned).append("\n");
    sb.append("  iRowFiltered: ").append(iRowFiltered).append("\n");
    sb.append("  aObjUsergroup: ").append(aObjUsergroup).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
