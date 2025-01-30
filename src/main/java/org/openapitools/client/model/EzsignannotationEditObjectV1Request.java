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

import org.openapitools.client.model.EzsignannotationRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/ezsignannotation/{pkiEzsignannotationID}
 **/
@ApiModel(description = "Request for PUT /1/object/ezsignannotation/{pkiEzsignannotationID}")
public class EzsignannotationEditObjectV1Request {
  
  @SerializedName("objEzsignannotation")
  private EzsignannotationRequestCompound objEzsignannotation = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignannotationRequestCompound getObjEzsignannotation() {
    return objEzsignannotation;
  }
  public void setObjEzsignannotation(EzsignannotationRequestCompound objEzsignannotation) {
    this.objEzsignannotation = objEzsignannotation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignannotationEditObjectV1Request ezsignannotationEditObjectV1Request = (EzsignannotationEditObjectV1Request) o;
    return (this.objEzsignannotation == null ? ezsignannotationEditObjectV1Request.objEzsignannotation == null : this.objEzsignannotation.equals(ezsignannotationEditObjectV1Request.objEzsignannotation));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignannotation == null ? 0: this.objEzsignannotation.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignannotationEditObjectV1Request {\n");
    
    sb.append("  objEzsignannotation: ").append(objEzsignannotation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
