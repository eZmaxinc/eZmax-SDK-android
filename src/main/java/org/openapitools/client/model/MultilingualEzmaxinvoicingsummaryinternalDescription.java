/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.13
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
 * Description of the Ezmaxinvoicingsummaryinternal
 **/
@ApiModel(description = "Description of the Ezmaxinvoicingsummaryinternal")
public class MultilingualEzmaxinvoicingsummaryinternalDescription {
  
  @SerializedName("sEzmaxinvoicingsummaryinternalDescription1")
  private String sEzmaxinvoicingsummaryinternalDescription1 = null;
  @SerializedName("sEzmaxinvoicingsummaryinternalDescription2")
  private String sEzmaxinvoicingsummaryinternalDescription2 = null;

  /**
   * The Ezmaxinvoicingsummaryinternal description in french
   **/
  @ApiModelProperty(value = "The Ezmaxinvoicingsummaryinternal description in french")
  public String getSEzmaxinvoicingsummaryinternalDescription1() {
    return sEzmaxinvoicingsummaryinternalDescription1;
  }
  public void setSEzmaxinvoicingsummaryinternalDescription1(String sEzmaxinvoicingsummaryinternalDescription1) {
    this.sEzmaxinvoicingsummaryinternalDescription1 = sEzmaxinvoicingsummaryinternalDescription1;
  }

  /**
   * The Ezmaxinvoicingsummaryinternal description in english
   **/
  @ApiModelProperty(value = "The Ezmaxinvoicingsummaryinternal description in english")
  public String getSEzmaxinvoicingsummaryinternalDescription2() {
    return sEzmaxinvoicingsummaryinternalDescription2;
  }
  public void setSEzmaxinvoicingsummaryinternalDescription2(String sEzmaxinvoicingsummaryinternalDescription2) {
    this.sEzmaxinvoicingsummaryinternalDescription2 = sEzmaxinvoicingsummaryinternalDescription2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultilingualEzmaxinvoicingsummaryinternalDescription multilingualEzmaxinvoicingsummaryinternalDescription = (MultilingualEzmaxinvoicingsummaryinternalDescription) o;
    return (this.sEzmaxinvoicingsummaryinternalDescription1 == null ? multilingualEzmaxinvoicingsummaryinternalDescription.sEzmaxinvoicingsummaryinternalDescription1 == null : this.sEzmaxinvoicingsummaryinternalDescription1.equals(multilingualEzmaxinvoicingsummaryinternalDescription.sEzmaxinvoicingsummaryinternalDescription1)) &&
        (this.sEzmaxinvoicingsummaryinternalDescription2 == null ? multilingualEzmaxinvoicingsummaryinternalDescription.sEzmaxinvoicingsummaryinternalDescription2 == null : this.sEzmaxinvoicingsummaryinternalDescription2.equals(multilingualEzmaxinvoicingsummaryinternalDescription.sEzmaxinvoicingsummaryinternalDescription2));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sEzmaxinvoicingsummaryinternalDescription1 == null ? 0: this.sEzmaxinvoicingsummaryinternalDescription1.hashCode());
    result = 31 * result + (this.sEzmaxinvoicingsummaryinternalDescription2 == null ? 0: this.sEzmaxinvoicingsummaryinternalDescription2.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultilingualEzmaxinvoicingsummaryinternalDescription {\n");
    
    sb.append("  sEzmaxinvoicingsummaryinternalDescription1: ").append(sEzmaxinvoicingsummaryinternalDescription1).append("\n");
    sb.append("  sEzmaxinvoicingsummaryinternalDescription2: ").append(sEzmaxinvoicingsummaryinternalDescription2).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
