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
import org.openapitools.client.model.EzsigndocumentdependencyRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /2/object/ezsignfolder/{pkiEzsignfolderID}/reorder
 **/
@ApiModel(description = "Request for POST /2/object/ezsignfolder/{pkiEzsignfolderID}/reorder")
public class CustomEzsigndocumentRequest {
  
  @SerializedName("pkiEzsigndocumentID")
  private Integer pkiEzsigndocumentID = null;
  @SerializedName("a_objEzsigndocumentdependency")
  private List<EzsigndocumentdependencyRequestCompound> aObjEzsigndocumentdependency = null;

  /**
   * The unique ID of the Ezsigndocument
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigndocument")
  public Integer getPkiEzsigndocumentID() {
    return pkiEzsigndocumentID;
  }
  public void setPkiEzsigndocumentID(Integer pkiEzsigndocumentID) {
    this.pkiEzsigndocumentID = pkiEzsigndocumentID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigndocumentdependencyRequestCompound> getAObjEzsigndocumentdependency() {
    return aObjEzsigndocumentdependency;
  }
  public void setAObjEzsigndocumentdependency(List<EzsigndocumentdependencyRequestCompound> aObjEzsigndocumentdependency) {
    this.aObjEzsigndocumentdependency = aObjEzsigndocumentdependency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEzsigndocumentRequest customEzsigndocumentRequest = (CustomEzsigndocumentRequest) o;
    return (this.pkiEzsigndocumentID == null ? customEzsigndocumentRequest.pkiEzsigndocumentID == null : this.pkiEzsigndocumentID.equals(customEzsigndocumentRequest.pkiEzsigndocumentID)) &&
        (this.aObjEzsigndocumentdependency == null ? customEzsigndocumentRequest.aObjEzsigndocumentdependency == null : this.aObjEzsigndocumentdependency.equals(customEzsigndocumentRequest.aObjEzsigndocumentdependency));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigndocumentID == null ? 0: this.pkiEzsigndocumentID.hashCode());
    result = 31 * result + (this.aObjEzsigndocumentdependency == null ? 0: this.aObjEzsigndocumentdependency.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEzsigndocumentRequest {\n");
    
    sb.append("  pkiEzsigndocumentID: ").append(pkiEzsigndocumentID).append("\n");
    sb.append("  aObjEzsigndocumentdependency: ").append(aObjEzsigndocumentdependency).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
