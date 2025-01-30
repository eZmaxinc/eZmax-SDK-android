/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
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
 * The description of the Billingentityinternal
 **/
@ApiModel(description = "The description of the Billingentityinternal")
public class MultilingualBillingentityinternalDescription {
  
  @SerializedName("sBillingentityinternalDescription1")
  private String sBillingentityinternalDescription1 = null;
  @SerializedName("sBillingentityinternalDescription2")
  private String sBillingentityinternalDescription2 = null;

  /**
   * The description of the Billingentityinternal in French
   **/
  @ApiModelProperty(value = "The description of the Billingentityinternal in French")
  public String getSBillingentityinternalDescription1() {
    return sBillingentityinternalDescription1;
  }
  public void setSBillingentityinternalDescription1(String sBillingentityinternalDescription1) {
    this.sBillingentityinternalDescription1 = sBillingentityinternalDescription1;
  }

  /**
   * The description of the Billingentityinternal in English
   **/
  @ApiModelProperty(value = "The description of the Billingentityinternal in English")
  public String getSBillingentityinternalDescription2() {
    return sBillingentityinternalDescription2;
  }
  public void setSBillingentityinternalDescription2(String sBillingentityinternalDescription2) {
    this.sBillingentityinternalDescription2 = sBillingentityinternalDescription2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultilingualBillingentityinternalDescription multilingualBillingentityinternalDescription = (MultilingualBillingentityinternalDescription) o;
    return (this.sBillingentityinternalDescription1 == null ? multilingualBillingentityinternalDescription.sBillingentityinternalDescription1 == null : this.sBillingentityinternalDescription1.equals(multilingualBillingentityinternalDescription.sBillingentityinternalDescription1)) &&
        (this.sBillingentityinternalDescription2 == null ? multilingualBillingentityinternalDescription.sBillingentityinternalDescription2 == null : this.sBillingentityinternalDescription2.equals(multilingualBillingentityinternalDescription.sBillingentityinternalDescription2));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sBillingentityinternalDescription1 == null ? 0: this.sBillingentityinternalDescription1.hashCode());
    result = 31 * result + (this.sBillingentityinternalDescription2 == null ? 0: this.sBillingentityinternalDescription2.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultilingualBillingentityinternalDescription {\n");
    
    sb.append("  sBillingentityinternalDescription1: ").append(sBillingentityinternalDescription1).append("\n");
    sb.append("  sBillingentityinternalDescription2: ").append(sBillingentityinternalDescription2).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
