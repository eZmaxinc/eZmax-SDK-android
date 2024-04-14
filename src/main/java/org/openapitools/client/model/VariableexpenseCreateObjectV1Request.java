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
import org.openapitools.client.model.VariableexpenseRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/variableexpense
 **/
@ApiModel(description = "Request for POST /1/object/variableexpense")
public class VariableexpenseCreateObjectV1Request {
  
  @SerializedName("a_objVariableexpense")
  private List<VariableexpenseRequestCompound> aObjVariableexpense = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<VariableexpenseRequestCompound> getAObjVariableexpense() {
    return aObjVariableexpense;
  }
  public void setAObjVariableexpense(List<VariableexpenseRequestCompound> aObjVariableexpense) {
    this.aObjVariableexpense = aObjVariableexpense;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableexpenseCreateObjectV1Request variableexpenseCreateObjectV1Request = (VariableexpenseCreateObjectV1Request) o;
    return (this.aObjVariableexpense == null ? variableexpenseCreateObjectV1Request.aObjVariableexpense == null : this.aObjVariableexpense.equals(variableexpenseCreateObjectV1Request.aObjVariableexpense));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjVariableexpense == null ? 0: this.aObjVariableexpense.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableexpenseCreateObjectV1Request {\n");
    
    sb.append("  aObjVariableexpense: ").append(aObjVariableexpense).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
