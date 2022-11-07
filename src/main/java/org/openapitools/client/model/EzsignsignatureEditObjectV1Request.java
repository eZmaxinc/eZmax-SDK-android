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

import org.openapitools.client.model.EzsignsignatureRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/ezsignsignature/{pkiEzsignsignatureID}
 **/
@ApiModel(description = "Request for PUT /1/object/ezsignsignature/{pkiEzsignsignatureID}")
public class EzsignsignatureEditObjectV1Request {
  
  @SerializedName("objEzsignsignature")
  private EzsignsignatureRequestCompound objEzsignsignature = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignsignatureRequestCompound getObjEzsignsignature() {
    return objEzsignsignature;
  }
  public void setObjEzsignsignature(EzsignsignatureRequestCompound objEzsignsignature) {
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
    EzsignsignatureEditObjectV1Request ezsignsignatureEditObjectV1Request = (EzsignsignatureEditObjectV1Request) o;
    return (this.objEzsignsignature == null ? ezsignsignatureEditObjectV1Request.objEzsignsignature == null : this.objEzsignsignature.equals(ezsignsignatureEditObjectV1Request.objEzsignsignature));
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
    sb.append("class EzsignsignatureEditObjectV1Request {\n");
    
    sb.append("  objEzsignsignature: ").append(objEzsignsignature).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
