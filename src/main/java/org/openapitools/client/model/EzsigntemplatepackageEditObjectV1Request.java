/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.10
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsigntemplatepackageRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID}
 **/
@ApiModel(description = "Request for PUT /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID}")
public class EzsigntemplatepackageEditObjectV1Request {
  
  @SerializedName("objEzsigntemplatepackage")
  private EzsigntemplatepackageRequestCompound objEzsigntemplatepackage = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsigntemplatepackageRequestCompound getObjEzsigntemplatepackage() {
    return objEzsigntemplatepackage;
  }
  public void setObjEzsigntemplatepackage(EzsigntemplatepackageRequestCompound objEzsigntemplatepackage) {
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
    EzsigntemplatepackageEditObjectV1Request ezsigntemplatepackageEditObjectV1Request = (EzsigntemplatepackageEditObjectV1Request) o;
    return (this.objEzsigntemplatepackage == null ? ezsigntemplatepackageEditObjectV1Request.objEzsigntemplatepackage == null : this.objEzsigntemplatepackage.equals(ezsigntemplatepackageEditObjectV1Request.objEzsigntemplatepackage));
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
    sb.append("class EzsigntemplatepackageEditObjectV1Request {\n");
    
    sb.append("  objEzsigntemplatepackage: ").append(objEzsigntemplatepackage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
