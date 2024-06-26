/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsigntemplateRequestCompoundV2;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /2/object/ezsigntemplate/{pkiEzsigntemplateID}
 **/
@ApiModel(description = "Request for PUT /2/object/ezsigntemplate/{pkiEzsigntemplateID}")
public class EzsigntemplateEditObjectV2Request {
  
  @SerializedName("objEzsigntemplate")
  private EzsigntemplateRequestCompoundV2 objEzsigntemplate = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsigntemplateRequestCompoundV2 getObjEzsigntemplate() {
    return objEzsigntemplate;
  }
  public void setObjEzsigntemplate(EzsigntemplateRequestCompoundV2 objEzsigntemplate) {
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
    EzsigntemplateEditObjectV2Request ezsigntemplateEditObjectV2Request = (EzsigntemplateEditObjectV2Request) o;
    return (this.objEzsigntemplate == null ? ezsigntemplateEditObjectV2Request.objEzsigntemplate == null : this.objEzsigntemplate.equals(ezsigntemplateEditObjectV2Request.objEzsigntemplate));
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
    sb.append("class EzsigntemplateEditObjectV2Request {\n");
    
    sb.append("  objEzsigntemplate: ").append(objEzsigntemplate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
