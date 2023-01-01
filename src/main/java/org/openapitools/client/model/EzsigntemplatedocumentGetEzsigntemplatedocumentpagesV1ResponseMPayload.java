/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsigntemplatedocumentpageResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getEzsigntemplatedocumentpages
 **/
@ApiModel(description = "Payload for GET /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getEzsigntemplatedocumentpages")
public class EzsigntemplatedocumentGetEzsigntemplatedocumentpagesV1ResponseMPayload {
  
  @SerializedName("a_objEzsigntemplatedocumentpage")
  private List<EzsigntemplatedocumentpageResponseCompound> aObjEzsigntemplatedocumentpage = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigntemplatedocumentpageResponseCompound> getAObjEzsigntemplatedocumentpage() {
    return aObjEzsigntemplatedocumentpage;
  }
  public void setAObjEzsigntemplatedocumentpage(List<EzsigntemplatedocumentpageResponseCompound> aObjEzsigntemplatedocumentpage) {
    this.aObjEzsigntemplatedocumentpage = aObjEzsigntemplatedocumentpage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatedocumentGetEzsigntemplatedocumentpagesV1ResponseMPayload ezsigntemplatedocumentGetEzsigntemplatedocumentpagesV1ResponseMPayload = (EzsigntemplatedocumentGetEzsigntemplatedocumentpagesV1ResponseMPayload) o;
    return (this.aObjEzsigntemplatedocumentpage == null ? ezsigntemplatedocumentGetEzsigntemplatedocumentpagesV1ResponseMPayload.aObjEzsigntemplatedocumentpage == null : this.aObjEzsigntemplatedocumentpage.equals(ezsigntemplatedocumentGetEzsigntemplatedocumentpagesV1ResponseMPayload.aObjEzsigntemplatedocumentpage));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsigntemplatedocumentpage == null ? 0: this.aObjEzsigntemplatedocumentpage.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatedocumentGetEzsigntemplatedocumentpagesV1ResponseMPayload {\n");
    
    sb.append("  aObjEzsigntemplatedocumentpage: ").append(aObjEzsigntemplatedocumentpage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
