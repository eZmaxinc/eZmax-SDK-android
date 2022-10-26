/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.12
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsigntemplatesignatureRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID}
 **/
@ApiModel(description = "Request for PUT /1/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID}")
public class EzsigntemplatesignatureEditObjectV1Request {
  
  @SerializedName("objEzsigntemplatesignature")
  private EzsigntemplatesignatureRequestCompound objEzsigntemplatesignature = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsigntemplatesignatureRequestCompound getObjEzsigntemplatesignature() {
    return objEzsigntemplatesignature;
  }
  public void setObjEzsigntemplatesignature(EzsigntemplatesignatureRequestCompound objEzsigntemplatesignature) {
    this.objEzsigntemplatesignature = objEzsigntemplatesignature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatesignatureEditObjectV1Request ezsigntemplatesignatureEditObjectV1Request = (EzsigntemplatesignatureEditObjectV1Request) o;
    return (this.objEzsigntemplatesignature == null ? ezsigntemplatesignatureEditObjectV1Request.objEzsigntemplatesignature == null : this.objEzsigntemplatesignature.equals(ezsigntemplatesignatureEditObjectV1Request.objEzsigntemplatesignature));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsigntemplatesignature == null ? 0: this.objEzsigntemplatesignature.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatesignatureEditObjectV1Request {\n");
    
    sb.append("  objEzsigntemplatesignature: ").append(objEzsigntemplatesignature).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
