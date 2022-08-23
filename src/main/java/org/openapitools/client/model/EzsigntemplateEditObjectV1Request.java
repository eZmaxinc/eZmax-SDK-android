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

import org.openapitools.client.model.EzsigntemplateRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/ezsigntemplate/{pkiEzsigntemplateID}
 **/
@ApiModel(description = "Request for PUT /1/object/ezsigntemplate/{pkiEzsigntemplateID}")
public class EzsigntemplateEditObjectV1Request {
  
  @SerializedName("objEzsigntemplate")
  private EzsigntemplateRequestCompound objEzsigntemplate = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsigntemplateRequestCompound getObjEzsigntemplate() {
    return objEzsigntemplate;
  }
  public void setObjEzsigntemplate(EzsigntemplateRequestCompound objEzsigntemplate) {
    this.objEzsigntemplate = objEzsigntemplate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplateEditObjectV1Request ezsigntemplateEditObjectV1Request = (EzsigntemplateEditObjectV1Request) o;
    return (this.objEzsigntemplate == null ? ezsigntemplateEditObjectV1Request.objEzsigntemplate == null : this.objEzsigntemplate.equals(ezsigntemplateEditObjectV1Request.objEzsigntemplate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsigntemplate == null ? 0: this.objEzsigntemplate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplateEditObjectV1Request {\n");
    
    sb.append("  objEzsigntemplate: ").append(objEzsigntemplate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
