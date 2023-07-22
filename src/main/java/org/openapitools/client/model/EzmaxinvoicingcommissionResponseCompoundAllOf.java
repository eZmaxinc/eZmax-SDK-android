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

import org.openapitools.client.model.CustomContactNameResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzmaxinvoicingcommissionResponseCompoundAllOf {
  
  @SerializedName("objContactName")
  private CustomContactNameResponse objContactName = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public CustomContactNameResponse getObjContactName() {
    return objContactName;
  }
  public void setObjContactName(CustomContactNameResponse objContactName) {
    this.objContactName = objContactName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzmaxinvoicingcommissionResponseCompoundAllOf ezmaxinvoicingcommissionResponseCompoundAllOf = (EzmaxinvoicingcommissionResponseCompoundAllOf) o;
    return (this.objContactName == null ? ezmaxinvoicingcommissionResponseCompoundAllOf.objContactName == null : this.objContactName.equals(ezmaxinvoicingcommissionResponseCompoundAllOf.objContactName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objContactName == null ? 0: this.objContactName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzmaxinvoicingcommissionResponseCompoundAllOf {\n");
    
    sb.append("  objContactName: ").append(objContactName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
