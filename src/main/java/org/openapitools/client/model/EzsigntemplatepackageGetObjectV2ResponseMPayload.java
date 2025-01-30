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

import org.openapitools.client.model.EzsigntemplatepackageResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID}
 **/
@ApiModel(description = "Payload for GET /2/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID}")
public class EzsigntemplatepackageGetObjectV2ResponseMPayload {
  
  @SerializedName("objEzsigntemplatepackage")
  private EzsigntemplatepackageResponseCompound objEzsigntemplatepackage = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsigntemplatepackageResponseCompound getObjEzsigntemplatepackage() {
    return objEzsigntemplatepackage;
  }
  public void setObjEzsigntemplatepackage(EzsigntemplatepackageResponseCompound objEzsigntemplatepackage) {
    this.objEzsigntemplatepackage = objEzsigntemplatepackage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatepackageGetObjectV2ResponseMPayload ezsigntemplatepackageGetObjectV2ResponseMPayload = (EzsigntemplatepackageGetObjectV2ResponseMPayload) o;
    return (this.objEzsigntemplatepackage == null ? ezsigntemplatepackageGetObjectV2ResponseMPayload.objEzsigntemplatepackage == null : this.objEzsigntemplatepackage.equals(ezsigntemplatepackageGetObjectV2ResponseMPayload.objEzsigntemplatepackage));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsigntemplatepackage == null ? 0: this.objEzsigntemplatepackage.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepackageGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objEzsigntemplatepackage: ").append(objEzsigntemplatepackage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
