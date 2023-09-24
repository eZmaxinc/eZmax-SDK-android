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

import org.openapitools.client.model.VariableexpenseResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/variableexpense/{pkiVariableexpenseID}
 **/
@ApiModel(description = "Payload for GET /2/object/variableexpense/{pkiVariableexpenseID}")
public class VariableexpenseGetObjectV2ResponseMPayload {
  
  @SerializedName("objVariableexpense")
  private VariableexpenseResponseCompound objVariableexpense = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public VariableexpenseResponseCompound getObjVariableexpense() {
    return objVariableexpense;
  }
  public void setObjVariableexpense(VariableexpenseResponseCompound objVariableexpense) {
    this.objVariableexpense = objVariableexpense;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableexpenseGetObjectV2ResponseMPayload variableexpenseGetObjectV2ResponseMPayload = (VariableexpenseGetObjectV2ResponseMPayload) o;
    return (this.objVariableexpense == null ? variableexpenseGetObjectV2ResponseMPayload.objVariableexpense == null : this.objVariableexpense.equals(variableexpenseGetObjectV2ResponseMPayload.objVariableexpense));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objVariableexpense == null ? 0: this.objVariableexpense.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableexpenseGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objVariableexpense: ").append(objVariableexpense).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
