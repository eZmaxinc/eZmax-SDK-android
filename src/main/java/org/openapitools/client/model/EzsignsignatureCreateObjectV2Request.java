/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsignsignatureRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /2/object/ezsignsignature
 **/
@ApiModel(description = "Request for POST /2/object/ezsignsignature")
public class EzsignsignatureCreateObjectV2Request {
  
  @SerializedName("a_objEzsignsignature")
  private List<EzsignsignatureRequestCompound> aObjEzsignsignature = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignsignatureRequestCompound> getAObjEzsignsignature() {
    return aObjEzsignsignature;
  }
  public void setAObjEzsignsignature(List<EzsignsignatureRequestCompound> aObjEzsignsignature) {
    this.aObjEzsignsignature = aObjEzsignsignature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignatureCreateObjectV2Request ezsignsignatureCreateObjectV2Request = (EzsignsignatureCreateObjectV2Request) o;
    return (this.aObjEzsignsignature == null ? ezsignsignatureCreateObjectV2Request.aObjEzsignsignature == null : this.aObjEzsignsignature.equals(ezsignsignatureCreateObjectV2Request.aObjEzsignsignature));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignsignature == null ? 0: this.aObjEzsignsignature.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignatureCreateObjectV2Request {\n");
    
    sb.append("  aObjEzsignsignature: ").append(aObjEzsignsignature).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
