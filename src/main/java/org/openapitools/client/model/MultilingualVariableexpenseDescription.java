/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The description of the Variableexpense
 **/
@ApiModel(description = "The description of the Variableexpense")
public class MultilingualVariableexpenseDescription {
  
  @SerializedName("sVariableexpenseDescription1")
  private String sVariableexpenseDescription1 = null;
  @SerializedName("sVariableexpenseDescription2")
  private String sVariableexpenseDescription2 = null;

  /**
   * The description of the Variableexpense in French
   **/
  @ApiModelProperty(value = "The description of the Variableexpense in French")
  public String getSVariableexpenseDescription1() {
    return sVariableexpenseDescription1;
  }
  public void setSVariableexpenseDescription1(String sVariableexpenseDescription1) {
    this.sVariableexpenseDescription1 = sVariableexpenseDescription1;
  }

  /**
   * The description of the Variableexpense in English
   **/
  @ApiModelProperty(value = "The description of the Variableexpense in English")
  public String getSVariableexpenseDescription2() {
    return sVariableexpenseDescription2;
  }
  public void setSVariableexpenseDescription2(String sVariableexpenseDescription2) {
    this.sVariableexpenseDescription2 = sVariableexpenseDescription2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultilingualVariableexpenseDescription multilingualVariableexpenseDescription = (MultilingualVariableexpenseDescription) o;
    return (this.sVariableexpenseDescription1 == null ? multilingualVariableexpenseDescription.sVariableexpenseDescription1 == null : this.sVariableexpenseDescription1.equals(multilingualVariableexpenseDescription.sVariableexpenseDescription1)) &&
        (this.sVariableexpenseDescription2 == null ? multilingualVariableexpenseDescription.sVariableexpenseDescription2 == null : this.sVariableexpenseDescription2.equals(multilingualVariableexpenseDescription.sVariableexpenseDescription2));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sVariableexpenseDescription1 == null ? 0: this.sVariableexpenseDescription1.hashCode());
    result = 31 * result + (this.sVariableexpenseDescription2 == null ? 0: this.sVariableexpenseDescription2.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultilingualVariableexpenseDescription {\n");
    
    sb.append("  sVariableexpenseDescription1: ").append(sVariableexpenseDescription1).append("\n");
    sb.append("  sVariableexpenseDescription2: ").append(sVariableexpenseDescription2).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
