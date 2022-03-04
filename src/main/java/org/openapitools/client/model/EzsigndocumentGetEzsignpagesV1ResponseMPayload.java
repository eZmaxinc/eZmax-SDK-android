/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.6
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsignpageResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for the /1/object/ezsigndocument/{pkiEzsigndocument}/getEzsignpages API Request
 **/
@ApiModel(description = "Payload for the /1/object/ezsigndocument/{pkiEzsigndocument}/getEzsignpages API Request")
public class EzsigndocumentGetEzsignpagesV1ResponseMPayload {
  
  @SerializedName("a_objEzsignpage")
  private List<EzsignpageResponseCompound> aObjEzsignpage = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignpageResponseCompound> getAObjEzsignpage() {
    return aObjEzsignpage;
  }
  public void setAObjEzsignpage(List<EzsignpageResponseCompound> aObjEzsignpage) {
    this.aObjEzsignpage = aObjEzsignpage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentGetEzsignpagesV1ResponseMPayload ezsigndocumentGetEzsignpagesV1ResponseMPayload = (EzsigndocumentGetEzsignpagesV1ResponseMPayload) o;
    return (this.aObjEzsignpage == null ? ezsigndocumentGetEzsignpagesV1ResponseMPayload.aObjEzsignpage == null : this.aObjEzsignpage.equals(ezsigndocumentGetEzsignpagesV1ResponseMPayload.aObjEzsignpage));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignpage == null ? 0: this.aObjEzsignpage.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentGetEzsignpagesV1ResponseMPayload {\n");
    
    sb.append("  aObjEzsignpage: ").append(aObjEzsignpage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
