/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsignbulksendRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/ezsignbulksend
 **/
@ApiModel(description = "Request for POST /1/object/ezsignbulksend")
public class EzsignbulksendCreateObjectV1Request {
  
  @SerializedName("a_objEzsignbulksend")
  private List<EzsignbulksendRequestCompound> aObjEzsignbulksend = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignbulksendRequestCompound> getAObjEzsignbulksend() {
    return aObjEzsignbulksend;
  }
  public void setAObjEzsignbulksend(List<EzsignbulksendRequestCompound> aObjEzsignbulksend) {
    this.aObjEzsignbulksend = aObjEzsignbulksend;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksendCreateObjectV1Request ezsignbulksendCreateObjectV1Request = (EzsignbulksendCreateObjectV1Request) o;
    return (this.aObjEzsignbulksend == null ? ezsignbulksendCreateObjectV1Request.aObjEzsignbulksend == null : this.aObjEzsignbulksend.equals(ezsignbulksendCreateObjectV1Request.aObjEzsignbulksend));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignbulksend == null ? 0: this.aObjEzsignbulksend.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendCreateObjectV1Request {\n");
    
    sb.append("  aObjEzsignbulksend: ").append(aObjEzsignbulksend).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
