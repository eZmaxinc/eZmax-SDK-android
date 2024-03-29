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
import org.openapitools.client.model.EzmaxinvoicingsummaryexternaldetailResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzmaxinvoicingsummaryexternalResponseCompoundAllOf {
  
  @SerializedName("a_objEzmaxinvoicingsummaryexternaldetail")
  private List<EzmaxinvoicingsummaryexternaldetailResponseCompound> aObjEzmaxinvoicingsummaryexternaldetail = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzmaxinvoicingsummaryexternaldetailResponseCompound> getAObjEzmaxinvoicingsummaryexternaldetail() {
    return aObjEzmaxinvoicingsummaryexternaldetail;
  }
  public void setAObjEzmaxinvoicingsummaryexternaldetail(List<EzmaxinvoicingsummaryexternaldetailResponseCompound> aObjEzmaxinvoicingsummaryexternaldetail) {
    this.aObjEzmaxinvoicingsummaryexternaldetail = aObjEzmaxinvoicingsummaryexternaldetail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzmaxinvoicingsummaryexternalResponseCompoundAllOf ezmaxinvoicingsummaryexternalResponseCompoundAllOf = (EzmaxinvoicingsummaryexternalResponseCompoundAllOf) o;
    return (this.aObjEzmaxinvoicingsummaryexternaldetail == null ? ezmaxinvoicingsummaryexternalResponseCompoundAllOf.aObjEzmaxinvoicingsummaryexternaldetail == null : this.aObjEzmaxinvoicingsummaryexternaldetail.equals(ezmaxinvoicingsummaryexternalResponseCompoundAllOf.aObjEzmaxinvoicingsummaryexternaldetail));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzmaxinvoicingsummaryexternaldetail == null ? 0: this.aObjEzmaxinvoicingsummaryexternaldetail.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzmaxinvoicingsummaryexternalResponseCompoundAllOf {\n");
    
    sb.append("  aObjEzmaxinvoicingsummaryexternaldetail: ").append(aObjEzmaxinvoicingsummaryexternaldetail).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
