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

import org.openapitools.client.model.EzsigntemplatedocumentRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}
 **/
@ApiModel(description = "Request for PUT /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}")
public class EzsigntemplatedocumentEditObjectV1Request {
  
  @SerializedName("objEzsigntemplatedocument")
  private EzsigntemplatedocumentRequestCompound objEzsigntemplatedocument = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsigntemplatedocumentRequestCompound getObjEzsigntemplatedocument() {
    return objEzsigntemplatedocument;
  }
  public void setObjEzsigntemplatedocument(EzsigntemplatedocumentRequestCompound objEzsigntemplatedocument) {
    this.objEzsigntemplatedocument = objEzsigntemplatedocument;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatedocumentEditObjectV1Request ezsigntemplatedocumentEditObjectV1Request = (EzsigntemplatedocumentEditObjectV1Request) o;
    return (this.objEzsigntemplatedocument == null ? ezsigntemplatedocumentEditObjectV1Request.objEzsigntemplatedocument == null : this.objEzsigntemplatedocument.equals(ezsigntemplatedocumentEditObjectV1Request.objEzsigntemplatedocument));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsigntemplatedocument == null ? 0: this.objEzsigntemplatedocument.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatedocumentEditObjectV1Request {\n");
    
    sb.append("  objEzsigntemplatedocument: ").append(objEzsigntemplatedocument).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
