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

import org.openapitools.client.model.EzsignbulksendRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/ezsignbulksend/{pkiEzsignbulksendID}
 **/
@ApiModel(description = "Request for PUT /1/object/ezsignbulksend/{pkiEzsignbulksendID}")
public class EzsignbulksendEditObjectV1Request {
  
  @SerializedName("objEzsignbulksend")
  private EzsignbulksendRequestCompound objEzsignbulksend = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignbulksendRequestCompound getObjEzsignbulksend() {
    return objEzsignbulksend;
  }
  public void setObjEzsignbulksend(EzsignbulksendRequestCompound objEzsignbulksend) {
    this.objEzsignbulksend = objEzsignbulksend;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksendEditObjectV1Request ezsignbulksendEditObjectV1Request = (EzsignbulksendEditObjectV1Request) o;
    return (this.objEzsignbulksend == null ? ezsignbulksendEditObjectV1Request.objEzsignbulksend == null : this.objEzsignbulksend.equals(ezsignbulksendEditObjectV1Request.objEzsignbulksend));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignbulksend == null ? 0: this.objEzsignbulksend.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendEditObjectV1Request {\n");
    
    sb.append("  objEzsignbulksend: ").append(objEzsignbulksend).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
