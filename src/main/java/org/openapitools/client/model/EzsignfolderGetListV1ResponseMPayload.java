/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsignfolderListElement;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/ezsignfolder/getList
 **/
@ApiModel(description = "Payload for GET /1/object/ezsignfolder/getList")
public class EzsignfolderGetListV1ResponseMPayload {
  
  @SerializedName("a_objEzsignfolder")
  private List<EzsignfolderListElement> aObjEzsignfolder = null;
  @SerializedName("iRowReturned")
  private Integer iRowReturned = null;
  @SerializedName("iRowFiltered")
  private Integer iRowFiltered = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignfolderListElement> getAObjEzsignfolder() {
    return aObjEzsignfolder;
  }
  public void setAObjEzsignfolder(List<EzsignfolderListElement> aObjEzsignfolder) {
    this.aObjEzsignfolder = aObjEzsignfolder;
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
    EzsignfolderGetListV1ResponseMPayload ezsignfolderGetListV1ResponseMPayload = (EzsignfolderGetListV1ResponseMPayload) o;
    return (this.aObjEzsignfolder == null ? ezsignfolderGetListV1ResponseMPayload.aObjEzsignfolder == null : this.aObjEzsignfolder.equals(ezsignfolderGetListV1ResponseMPayload.aObjEzsignfolder)) &&
        (this.iRowReturned == null ? ezsignfolderGetListV1ResponseMPayload.iRowReturned == null : this.iRowReturned.equals(ezsignfolderGetListV1ResponseMPayload.iRowReturned)) &&
        (this.iRowFiltered == null ? ezsignfolderGetListV1ResponseMPayload.iRowFiltered == null : this.iRowFiltered.equals(ezsignfolderGetListV1ResponseMPayload.iRowFiltered));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignfolder == null ? 0: this.aObjEzsignfolder.hashCode());
    result = 31 * result + (this.iRowReturned == null ? 0: this.iRowReturned.hashCode());
    result = 31 * result + (this.iRowFiltered == null ? 0: this.iRowFiltered.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderGetListV1ResponseMPayload {\n");
    
    sb.append("  aObjEzsignfolder: ").append(aObjEzsignfolder).append("\n");
    sb.append("  iRowReturned: ").append(iRowReturned).append("\n");
    sb.append("  iRowFiltered: ").append(iRowFiltered).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
