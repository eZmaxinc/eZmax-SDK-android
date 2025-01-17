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
import org.openapitools.client.model.DomainListElement;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/domain/getList
 **/
@ApiModel(description = "Payload for GET /1/object/domain/getList")
public class DomainGetListV1ResponseMPayload extends CommonGetListV1ResponseMPayload {
  
  @SerializedName("iRowReturned")
  private Integer iRowReturned = null;
  @SerializedName("iRowFiltered")
  private Integer iRowFiltered = null;
  @SerializedName("a_objDomain")
  private List<DomainListElement> aObjDomain = null;

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
  public List<DomainListElement> getAObjDomain() {
    return aObjDomain;
  }
  public void setAObjDomain(List<DomainListElement> aObjDomain) {
    this.aObjDomain = aObjDomain;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainGetListV1ResponseMPayload domainGetListV1ResponseMPayload = (DomainGetListV1ResponseMPayload) o;
    return (this.iRowReturned == null ? domainGetListV1ResponseMPayload.iRowReturned == null : this.iRowReturned.equals(domainGetListV1ResponseMPayload.iRowReturned)) &&
        (this.iRowFiltered == null ? domainGetListV1ResponseMPayload.iRowFiltered == null : this.iRowFiltered.equals(domainGetListV1ResponseMPayload.iRowFiltered)) &&
        (this.aObjDomain == null ? domainGetListV1ResponseMPayload.aObjDomain == null : this.aObjDomain.equals(domainGetListV1ResponseMPayload.aObjDomain));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.iRowReturned == null ? 0: this.iRowReturned.hashCode());
    result = 31 * result + (this.iRowFiltered == null ? 0: this.iRowFiltered.hashCode());
    result = 31 * result + (this.aObjDomain == null ? 0: this.aObjDomain.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainGetListV1ResponseMPayload {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  iRowReturned: ").append(iRowReturned).append("\n");
    sb.append("  iRowFiltered: ").append(iRowFiltered).append("\n");
    sb.append("  aObjDomain: ").append(aObjDomain).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
