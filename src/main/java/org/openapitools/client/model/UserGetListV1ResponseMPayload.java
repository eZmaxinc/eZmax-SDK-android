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

import java.util.*;
import org.openapitools.client.model.UserListElement;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/user/getList
 **/
@ApiModel(description = "Payload for GET /1/object/user/getList")
public class UserGetListV1ResponseMPayload {
  
  @SerializedName("iRowReturned")
  private Integer iRowReturned = null;
  @SerializedName("iRowFiltered")
  private Integer iRowFiltered = null;
  @SerializedName("a_objUser")
  private List<UserListElement> aObjUser = null;

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
  public List<UserListElement> getAObjUser() {
    return aObjUser;
  }
  public void setAObjUser(List<UserListElement> aObjUser) {
    this.aObjUser = aObjUser;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGetListV1ResponseMPayload userGetListV1ResponseMPayload = (UserGetListV1ResponseMPayload) o;
    return (this.iRowReturned == null ? userGetListV1ResponseMPayload.iRowReturned == null : this.iRowReturned.equals(userGetListV1ResponseMPayload.iRowReturned)) &&
        (this.iRowFiltered == null ? userGetListV1ResponseMPayload.iRowFiltered == null : this.iRowFiltered.equals(userGetListV1ResponseMPayload.iRowFiltered)) &&
        (this.aObjUser == null ? userGetListV1ResponseMPayload.aObjUser == null : this.aObjUser.equals(userGetListV1ResponseMPayload.aObjUser));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.iRowReturned == null ? 0: this.iRowReturned.hashCode());
    result = 31 * result + (this.iRowFiltered == null ? 0: this.iRowFiltered.hashCode());
    result = 31 * result + (this.aObjUser == null ? 0: this.aObjUser.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGetListV1ResponseMPayload {\n");
    
    sb.append("  iRowReturned: ").append(iRowReturned).append("\n");
    sb.append("  iRowFiltered: ").append(iRowFiltered).append("\n");
    sb.append("  aObjUser: ").append(aObjUser).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
