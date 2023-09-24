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

import org.openapitools.client.model.EzsigntemplatepackagemembershipResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/ezsigntemplatepackagemembership/{pkiEzsigntemplatepackagemembershipID}
 **/
@ApiModel(description = "Payload for GET /2/object/ezsigntemplatepackagemembership/{pkiEzsigntemplatepackagemembershipID}")
public class EzsigntemplatepackagemembershipGetObjectV2ResponseMPayload {
  
  @SerializedName("objEzsigntemplatepackagemembership")
  private EzsigntemplatepackagemembershipResponseCompound objEzsigntemplatepackagemembership = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsigntemplatepackagemembershipResponseCompound getObjEzsigntemplatepackagemembership() {
    return objEzsigntemplatepackagemembership;
  }
  public void setObjEzsigntemplatepackagemembership(EzsigntemplatepackagemembershipResponseCompound objEzsigntemplatepackagemembership) {
    this.objEzsigntemplatepackagemembership = objEzsigntemplatepackagemembership;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatepackagemembershipGetObjectV2ResponseMPayload ezsigntemplatepackagemembershipGetObjectV2ResponseMPayload = (EzsigntemplatepackagemembershipGetObjectV2ResponseMPayload) o;
    return (this.objEzsigntemplatepackagemembership == null ? ezsigntemplatepackagemembershipGetObjectV2ResponseMPayload.objEzsigntemplatepackagemembership == null : this.objEzsigntemplatepackagemembership.equals(ezsigntemplatepackagemembershipGetObjectV2ResponseMPayload.objEzsigntemplatepackagemembership));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsigntemplatepackagemembership == null ? 0: this.objEzsigntemplatepackagemembership.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepackagemembershipGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objEzsigntemplatepackagemembership: ").append(objEzsigntemplatepackagemembership).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
