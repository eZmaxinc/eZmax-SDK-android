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

import java.util.*;
import org.openapitools.client.model.EzsigntemplateRequestCompoundV3;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /3/object/ezsigntemplate
 **/
@ApiModel(description = "Request for POST /3/object/ezsigntemplate")
public class EzsigntemplateCreateObjectV3Request {
  
  @SerializedName("a_objEzsigntemplate")
  private List<EzsigntemplateRequestCompoundV3> aObjEzsigntemplate = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigntemplateRequestCompoundV3> getAObjEzsigntemplate() {
    return aObjEzsigntemplate;
  }
  public void setAObjEzsigntemplate(List<EzsigntemplateRequestCompoundV3> aObjEzsigntemplate) {
    this.aObjEzsigntemplate = aObjEzsigntemplate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplateCreateObjectV3Request ezsigntemplateCreateObjectV3Request = (EzsigntemplateCreateObjectV3Request) o;
    return (this.aObjEzsigntemplate == null ? ezsigntemplateCreateObjectV3Request.aObjEzsigntemplate == null : this.aObjEzsigntemplate.equals(ezsigntemplateCreateObjectV3Request.aObjEzsigntemplate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsigntemplate == null ? 0: this.aObjEzsigntemplate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplateCreateObjectV3Request {\n");
    
    sb.append("  aObjEzsigntemplate: ").append(aObjEzsigntemplate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
