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

import java.util.*;
import org.openapitools.client.model.EzmaxinvoicingcommissionResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzmaxinvoicingsummaryglobalResponseCompoundAllOf {
  
  @SerializedName("a_objEzmaxinvoicingcommission")
  private List<EzmaxinvoicingcommissionResponseCompound> aObjEzmaxinvoicingcommission = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<EzmaxinvoicingcommissionResponseCompound> getAObjEzmaxinvoicingcommission() {
    return aObjEzmaxinvoicingcommission;
  }
  public void setAObjEzmaxinvoicingcommission(List<EzmaxinvoicingcommissionResponseCompound> aObjEzmaxinvoicingcommission) {
    this.aObjEzmaxinvoicingcommission = aObjEzmaxinvoicingcommission;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzmaxinvoicingsummaryglobalResponseCompoundAllOf ezmaxinvoicingsummaryglobalResponseCompoundAllOf = (EzmaxinvoicingsummaryglobalResponseCompoundAllOf) o;
    return (this.aObjEzmaxinvoicingcommission == null ? ezmaxinvoicingsummaryglobalResponseCompoundAllOf.aObjEzmaxinvoicingcommission == null : this.aObjEzmaxinvoicingcommission.equals(ezmaxinvoicingsummaryglobalResponseCompoundAllOf.aObjEzmaxinvoicingcommission));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzmaxinvoicingcommission == null ? 0: this.aObjEzmaxinvoicingcommission.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzmaxinvoicingsummaryglobalResponseCompoundAllOf {\n");
    
    sb.append("  aObjEzmaxinvoicingcommission: ").append(aObjEzmaxinvoicingcommission).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
