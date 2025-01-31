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
import org.openapitools.client.model.EzsignannotationRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignannotations
 **/
@ApiModel(description = "Request for PUT /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignannotations")
public class EzsigndocumentEditEzsignannotationsV1Request {
  
  @SerializedName("a_objEzsignannotation")
  private List<EzsignannotationRequestCompound> aObjEzsignannotation = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignannotationRequestCompound> getAObjEzsignannotation() {
    return aObjEzsignannotation;
  }
  public void setAObjEzsignannotation(List<EzsignannotationRequestCompound> aObjEzsignannotation) {
    this.aObjEzsignannotation = aObjEzsignannotation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentEditEzsignannotationsV1Request ezsigndocumentEditEzsignannotationsV1Request = (EzsigndocumentEditEzsignannotationsV1Request) o;
    return (this.aObjEzsignannotation == null ? ezsigndocumentEditEzsignannotationsV1Request.aObjEzsignannotation == null : this.aObjEzsignannotation.equals(ezsigndocumentEditEzsignannotationsV1Request.aObjEzsignannotation));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignannotation == null ? 0: this.aObjEzsignannotation.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentEditEzsignannotationsV1Request {\n");
    
    sb.append("  aObjEzsignannotation: ").append(aObjEzsignannotation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
