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

import org.openapitools.client.model.EzsignsignatureResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/ezsignsignature/{pkiEzsignsignatureID}
 **/
@ApiModel(description = "Payload for GET /2/object/ezsignsignature/{pkiEzsignsignatureID}")
public class EzsignsignatureGetObjectV2ResponseMPayload {
  
  @SerializedName("objEzsignsignature")
  private EzsignsignatureResponseCompound objEzsignsignature = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignsignatureResponseCompound getObjEzsignsignature() {
    return objEzsignsignature;
  }
  public void setObjEzsignsignature(EzsignsignatureResponseCompound objEzsignsignature) {
    this.objEzsignsignature = objEzsignsignature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignatureGetObjectV2ResponseMPayload ezsignsignatureGetObjectV2ResponseMPayload = (EzsignsignatureGetObjectV2ResponseMPayload) o;
    return (this.objEzsignsignature == null ? ezsignsignatureGetObjectV2ResponseMPayload.objEzsignsignature == null : this.objEzsignsignature.equals(ezsignsignatureGetObjectV2ResponseMPayload.objEzsignsignature));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignsignature == null ? 0: this.objEzsignsignature.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignatureGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objEzsignsignature: ").append(objEzsignsignature).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}