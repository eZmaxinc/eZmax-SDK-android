/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsigntemplatesignerRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID}
 **/
@ApiModel(description = "Request for PUT /1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID}")
public class EzsigntemplatesignerEditObjectV1Request {
  
  @SerializedName("objEzsigntemplatesigner")
  private EzsigntemplatesignerRequestCompound objEzsigntemplatesigner = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsigntemplatesignerRequestCompound getObjEzsigntemplatesigner() {
    return objEzsigntemplatesigner;
  }
  public void setObjEzsigntemplatesigner(EzsigntemplatesignerRequestCompound objEzsigntemplatesigner) {
    this.objEzsigntemplatesigner = objEzsigntemplatesigner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatesignerEditObjectV1Request ezsigntemplatesignerEditObjectV1Request = (EzsigntemplatesignerEditObjectV1Request) o;
    return (this.objEzsigntemplatesigner == null ? ezsigntemplatesignerEditObjectV1Request.objEzsigntemplatesigner == null : this.objEzsigntemplatesigner.equals(ezsigntemplatesignerEditObjectV1Request.objEzsigntemplatesigner));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsigntemplatesigner == null ? 0: this.objEzsigntemplatesigner.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatesignerEditObjectV1Request {\n");
    
    sb.append("  objEzsigntemplatesigner: ").append(objEzsigntemplatesigner).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
