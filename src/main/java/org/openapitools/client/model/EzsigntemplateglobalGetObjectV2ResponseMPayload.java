/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsigntemplateglobalResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/ezsigntemplateglobal/{pkiEzsigntemplateglobalID}
 **/
@ApiModel(description = "Payload for GET /2/object/ezsigntemplateglobal/{pkiEzsigntemplateglobalID}")
public class EzsigntemplateglobalGetObjectV2ResponseMPayload {
  
  @SerializedName("objEzsigntemplateglobal")
  private EzsigntemplateglobalResponseCompound objEzsigntemplateglobal = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsigntemplateglobalResponseCompound getObjEzsigntemplateglobal() {
    return objEzsigntemplateglobal;
  }
  public void setObjEzsigntemplateglobal(EzsigntemplateglobalResponseCompound objEzsigntemplateglobal) {
    this.objEzsigntemplateglobal = objEzsigntemplateglobal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplateglobalGetObjectV2ResponseMPayload ezsigntemplateglobalGetObjectV2ResponseMPayload = (EzsigntemplateglobalGetObjectV2ResponseMPayload) o;
    return (this.objEzsigntemplateglobal == null ? ezsigntemplateglobalGetObjectV2ResponseMPayload.objEzsigntemplateglobal == null : this.objEzsigntemplateglobal.equals(ezsigntemplateglobalGetObjectV2ResponseMPayload.objEzsigntemplateglobal));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsigntemplateglobal == null ? 0: this.objEzsigntemplateglobal.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplateglobalGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objEzsigntemplateglobal: ").append(objEzsigntemplateglobal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
