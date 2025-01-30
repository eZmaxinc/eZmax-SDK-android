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
import org.openapitools.client.model.EzsignsignatureRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignsignatures
 **/
@ApiModel(description = "Request for PUT /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignsignatures")
public class EzsigndocumentEditEzsignsignaturesV1Request {
  
  @SerializedName("a_objEzsignsignature")
  private List<EzsignsignatureRequestCompound> aObjEzsignsignature = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignsignatureRequestCompound> getAObjEzsignsignature() {
    return aObjEzsignsignature;
  }
  public void setAObjEzsignsignature(List<EzsignsignatureRequestCompound> aObjEzsignsignature) {
    this.aObjEzsignsignature = aObjEzsignsignature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentEditEzsignsignaturesV1Request ezsigndocumentEditEzsignsignaturesV1Request = (EzsigndocumentEditEzsignsignaturesV1Request) o;
    return (this.aObjEzsignsignature == null ? ezsigndocumentEditEzsignsignaturesV1Request.aObjEzsignsignature == null : this.aObjEzsignsignature.equals(ezsigndocumentEditEzsignsignaturesV1Request.aObjEzsignsignature));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignsignature == null ? 0: this.aObjEzsignsignature.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentEditEzsignsignaturesV1Request {\n");
    
    sb.append("  aObjEzsignsignature: ").append(aObjEzsignsignature).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
