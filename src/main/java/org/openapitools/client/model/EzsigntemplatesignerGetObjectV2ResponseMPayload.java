/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsigntemplatesignerResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID}
 **/
@ApiModel(description = "Payload for GET /2/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID}")
public class EzsigntemplatesignerGetObjectV2ResponseMPayload {
  
  @SerializedName("objEzsigntemplatesigner")
  private EzsigntemplatesignerResponseCompound objEzsigntemplatesigner = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsigntemplatesignerResponseCompound getObjEzsigntemplatesigner() {
    return objEzsigntemplatesigner;
  }
  public void setObjEzsigntemplatesigner(EzsigntemplatesignerResponseCompound objEzsigntemplatesigner) {
    this.objEzsigntemplatesigner = objEzsigntemplatesigner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatesignerGetObjectV2ResponseMPayload ezsigntemplatesignerGetObjectV2ResponseMPayload = (EzsigntemplatesignerGetObjectV2ResponseMPayload) o;
    return (this.objEzsigntemplatesigner == null ? ezsigntemplatesignerGetObjectV2ResponseMPayload.objEzsigntemplatesigner == null : this.objEzsigntemplatesigner.equals(ezsigntemplatesignerGetObjectV2ResponseMPayload.objEzsigntemplatesigner));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsigntemplatesigner == null ? 0: this.objEzsigntemplatesigner.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatesignerGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objEzsigntemplatesigner: ").append(objEzsigntemplatesigner).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}