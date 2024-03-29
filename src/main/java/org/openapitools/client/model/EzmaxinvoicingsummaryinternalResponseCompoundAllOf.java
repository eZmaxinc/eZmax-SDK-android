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
import org.openapitools.client.model.EzmaxinvoicingsummaryinternaldetailResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzmaxinvoicingsummaryinternalResponseCompoundAllOf {
  
  @SerializedName("a_objEzmaxinvoicingsummaryinternaldetail")
  private List<EzmaxinvoicingsummaryinternaldetailResponseCompound> aObjEzmaxinvoicingsummaryinternaldetail = null;

  /**
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzmaxinvoicingsummaryinternaldetailResponseCompound> getAObjEzmaxinvoicingsummaryinternaldetail() {
    return aObjEzmaxinvoicingsummaryinternaldetail;
  }
  public void setAObjEzmaxinvoicingsummaryinternaldetail(List<EzmaxinvoicingsummaryinternaldetailResponseCompound> aObjEzmaxinvoicingsummaryinternaldetail) {
    this.aObjEzmaxinvoicingsummaryinternaldetail = aObjEzmaxinvoicingsummaryinternaldetail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzmaxinvoicingsummaryinternalResponseCompoundAllOf ezmaxinvoicingsummaryinternalResponseCompoundAllOf = (EzmaxinvoicingsummaryinternalResponseCompoundAllOf) o;
    return (this.aObjEzmaxinvoicingsummaryinternaldetail == null ? ezmaxinvoicingsummaryinternalResponseCompoundAllOf.aObjEzmaxinvoicingsummaryinternaldetail == null : this.aObjEzmaxinvoicingsummaryinternaldetail.equals(ezmaxinvoicingsummaryinternalResponseCompoundAllOf.aObjEzmaxinvoicingsummaryinternaldetail));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzmaxinvoicingsummaryinternaldetail == null ? 0: this.aObjEzmaxinvoicingsummaryinternaldetail.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzmaxinvoicingsummaryinternalResponseCompoundAllOf {\n");
    
    sb.append("  aObjEzmaxinvoicingsummaryinternaldetail: ").append(aObjEzmaxinvoicingsummaryinternaldetail).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
