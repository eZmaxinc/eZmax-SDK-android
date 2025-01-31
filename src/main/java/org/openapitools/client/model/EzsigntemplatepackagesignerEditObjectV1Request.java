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

import org.openapitools.client.model.EzsigntemplatepackagesignerRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID}
 **/
@ApiModel(description = "Request for PUT /1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID}")
public class EzsigntemplatepackagesignerEditObjectV1Request {
  
  @SerializedName("objEzsigntemplatepackagesigner")
  private EzsigntemplatepackagesignerRequestCompound objEzsigntemplatepackagesigner = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsigntemplatepackagesignerRequestCompound getObjEzsigntemplatepackagesigner() {
    return objEzsigntemplatepackagesigner;
  }
  public void setObjEzsigntemplatepackagesigner(EzsigntemplatepackagesignerRequestCompound objEzsigntemplatepackagesigner) {
    this.objEzsigntemplatepackagesigner = objEzsigntemplatepackagesigner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatepackagesignerEditObjectV1Request ezsigntemplatepackagesignerEditObjectV1Request = (EzsigntemplatepackagesignerEditObjectV1Request) o;
    return (this.objEzsigntemplatepackagesigner == null ? ezsigntemplatepackagesignerEditObjectV1Request.objEzsigntemplatepackagesigner == null : this.objEzsigntemplatepackagesigner.equals(ezsigntemplatepackagesignerEditObjectV1Request.objEzsigntemplatepackagesigner));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsigntemplatepackagesigner == null ? 0: this.objEzsigntemplatepackagesigner.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepackagesignerEditObjectV1Request {\n");
    
    sb.append("  objEzsigntemplatepackagesigner: ").append(objEzsigntemplatepackagesigner).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
