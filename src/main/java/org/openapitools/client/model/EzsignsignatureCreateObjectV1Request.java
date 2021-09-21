/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.48
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsignsignatureRequest;
import org.openapitools.client.model.EzsignsignatureRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for the /1/object/ezsignsignature/createObject API Request
 **/
@ApiModel(description = "Request for the /1/object/ezsignsignature/createObject API Request")
public class EzsignsignatureCreateObjectV1Request {
  
  @SerializedName("objEzsignsignature")
  private EzsignsignatureRequest objEzsignsignature = null;
  @SerializedName("objEzsignsignatureCompound")
  private EzsignsignatureRequestCompound objEzsignsignatureCompound = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsignsignatureRequest getObjEzsignsignature() {
    return objEzsignsignature;
  }
  public void setObjEzsignsignature(EzsignsignatureRequest objEzsignsignature) {
    this.objEzsignsignature = objEzsignsignature;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsignsignatureRequestCompound getObjEzsignsignatureCompound() {
    return objEzsignsignatureCompound;
  }
  public void setObjEzsignsignatureCompound(EzsignsignatureRequestCompound objEzsignsignatureCompound) {
    this.objEzsignsignatureCompound = objEzsignsignatureCompound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignatureCreateObjectV1Request ezsignsignatureCreateObjectV1Request = (EzsignsignatureCreateObjectV1Request) o;
    return (this.objEzsignsignature == null ? ezsignsignatureCreateObjectV1Request.objEzsignsignature == null : this.objEzsignsignature.equals(ezsignsignatureCreateObjectV1Request.objEzsignsignature)) &&
        (this.objEzsignsignatureCompound == null ? ezsignsignatureCreateObjectV1Request.objEzsignsignatureCompound == null : this.objEzsignsignatureCompound.equals(ezsignsignatureCreateObjectV1Request.objEzsignsignatureCompound));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignsignature == null ? 0: this.objEzsignsignature.hashCode());
    result = 31 * result + (this.objEzsignsignatureCompound == null ? 0: this.objEzsignsignatureCompound.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignatureCreateObjectV1Request {\n");
    
    sb.append("  objEzsignsignature: ").append(objEzsignsignature).append("\n");
    sb.append("  objEzsignsignatureCompound: ").append(objEzsignsignatureCompound).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
