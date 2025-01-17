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
import org.openapitools.client.model.ApikeyListElement;
import org.openapitools.client.model.CommonGetListV1ResponseMPayload;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/apikey/getList
 **/
@ApiModel(description = "Payload for GET /1/object/apikey/getList")
public class ApikeyGetListV1ResponseMPayload extends CommonGetListV1ResponseMPayload {
  
  @SerializedName("iRowReturned")
  private Integer iRowReturned = null;
  @SerializedName("iRowFiltered")
  private Integer iRowFiltered = null;
  @SerializedName("a_objApikey")
  private List<ApikeyListElement> aObjApikey = null;

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
  public List<ApikeyListElement> getAObjApikey() {
    return aObjApikey;
  }
  public void setAObjApikey(List<ApikeyListElement> aObjApikey) {
    this.aObjApikey = aObjApikey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApikeyGetListV1ResponseMPayload apikeyGetListV1ResponseMPayload = (ApikeyGetListV1ResponseMPayload) o;
    return (this.iRowReturned == null ? apikeyGetListV1ResponseMPayload.iRowReturned == null : this.iRowReturned.equals(apikeyGetListV1ResponseMPayload.iRowReturned)) &&
        (this.iRowFiltered == null ? apikeyGetListV1ResponseMPayload.iRowFiltered == null : this.iRowFiltered.equals(apikeyGetListV1ResponseMPayload.iRowFiltered)) &&
        (this.aObjApikey == null ? apikeyGetListV1ResponseMPayload.aObjApikey == null : this.aObjApikey.equals(apikeyGetListV1ResponseMPayload.aObjApikey));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.iRowReturned == null ? 0: this.iRowReturned.hashCode());
    result = 31 * result + (this.iRowFiltered == null ? 0: this.iRowFiltered.hashCode());
    result = 31 * result + (this.aObjApikey == null ? 0: this.aObjApikey.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApikeyGetListV1ResponseMPayload {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  iRowReturned: ").append(iRowReturned).append("\n");
    sb.append("  iRowFiltered: ").append(iRowFiltered).append("\n");
    sb.append("  aObjApikey: ").append(aObjApikey).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
