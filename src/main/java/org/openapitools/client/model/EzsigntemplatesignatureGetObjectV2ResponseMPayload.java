/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.15
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsigntemplatesignatureResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID}
 **/
@ApiModel(description = "Payload for GET /2/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID}")
public class EzsigntemplatesignatureGetObjectV2ResponseMPayload {
  
  @SerializedName("objEzsigntemplatesignature")
  private EzsigntemplatesignatureResponseCompound objEzsigntemplatesignature = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsigntemplatesignatureResponseCompound getObjEzsigntemplatesignature() {
    return objEzsigntemplatesignature;
  }
  public void setObjEzsigntemplatesignature(EzsigntemplatesignatureResponseCompound objEzsigntemplatesignature) {
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
    EzsigntemplatesignatureGetObjectV2ResponseMPayload ezsigntemplatesignatureGetObjectV2ResponseMPayload = (EzsigntemplatesignatureGetObjectV2ResponseMPayload) o;
    return (this.objEzsigntemplatesignature == null ? ezsigntemplatesignatureGetObjectV2ResponseMPayload.objEzsigntemplatesignature == null : this.objEzsigntemplatesignature.equals(ezsigntemplatesignatureGetObjectV2ResponseMPayload.objEzsigntemplatesignature));
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
    sb.append("class EzsigntemplatesignatureGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objEzsigntemplatesignature: ").append(objEzsigntemplatesignature).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
