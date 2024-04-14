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

import org.openapitools.client.model.EzsignsigningreasonRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/ezsignsigningreason/{pkiEzsignsigningreasonID}
 **/
@ApiModel(description = "Request for PUT /1/object/ezsignsigningreason/{pkiEzsignsigningreasonID}")
public class EzsignsigningreasonEditObjectV1Request {
  
  @SerializedName("objEzsignsigningreason")
  private EzsignsigningreasonRequestCompound objEzsignsigningreason = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignsigningreasonRequestCompound getObjEzsignsigningreason() {
    return objEzsignsigningreason;
  }
  public void setObjEzsignsigningreason(EzsignsigningreasonRequestCompound objEzsignsigningreason) {
    this.objEzsignsigningreason = objEzsignsigningreason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsigningreasonEditObjectV1Request ezsignsigningreasonEditObjectV1Request = (EzsignsigningreasonEditObjectV1Request) o;
    return (this.objEzsignsigningreason == null ? ezsignsigningreasonEditObjectV1Request.objEzsignsigningreason == null : this.objEzsignsigningreason.equals(ezsignsigningreasonEditObjectV1Request.objEzsignsigningreason));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignsigningreason == null ? 0: this.objEzsignsigningreason.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsigningreasonEditObjectV1Request {\n");
    
    sb.append("  objEzsignsigningreason: ").append(objEzsignsigningreason).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}