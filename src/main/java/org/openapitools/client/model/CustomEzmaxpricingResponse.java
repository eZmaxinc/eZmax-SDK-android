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
 * A Custom Ezmaxpricing Object
 **/
@ApiModel(description = "A Custom Ezmaxpricing Object")
public class CustomEzmaxpricingResponse {
  
  @SerializedName("pkiEzmaxpricingID")
  private Integer pkiEzmaxpricingID = null;
  @SerializedName("dEzmaxpricingRebateezsignallagents")
  private String dEzmaxpricingRebateezsignallagents = null;
  @SerializedName("dtEzmaxpricingStart")
  private String dtEzmaxpricingStart = null;
  @SerializedName("dtEzmaxpricingEnd")
  private String dtEzmaxpricingEnd = null;

  /**
   * The unique ID of the Ezmaxpricing
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezmaxpricing")
  public Integer getPkiEzmaxpricingID() {
    return pkiEzmaxpricingID;
  }
  public void setPkiEzmaxpricingID(Integer pkiEzmaxpricingID) {
    this.pkiEzmaxpricingID = pkiEzmaxpricingID;
  }

  /**
   * The rebate offered when eZsign is taken for all agents
   **/
  @ApiModelProperty(required = true, value = "The rebate offered when eZsign is taken for all agents")
  public String getDEzmaxpricingRebateezsignallagents() {
    return dEzmaxpricingRebateezsignallagents;
  }
  public void setDEzmaxpricingRebateezsignallagents(String dEzmaxpricingRebateezsignallagents) {
    this.dEzmaxpricingRebateezsignallagents = dEzmaxpricingRebateezsignallagents;
  }

  /**
   * The start date of the Ezmaxpricing
   **/
  @ApiModelProperty(required = true, value = "The start date of the Ezmaxpricing")
  public String getDtEzmaxpricingStart() {
    return dtEzmaxpricingStart;
  }
  public void setDtEzmaxpricingStart(String dtEzmaxpricingStart) {
    this.dtEzmaxpricingStart = dtEzmaxpricingStart;
  }

  /**
   * The end date of the Ezmaxpricing
   **/
  @ApiModelProperty(value = "The end date of the Ezmaxpricing")
  public String getDtEzmaxpricingEnd() {
    return dtEzmaxpricingEnd;
  }
  public void setDtEzmaxpricingEnd(String dtEzmaxpricingEnd) {
    this.dtEzmaxpricingEnd = dtEzmaxpricingEnd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEzmaxpricingResponse customEzmaxpricingResponse = (CustomEzmaxpricingResponse) o;
    return (this.pkiEzmaxpricingID == null ? customEzmaxpricingResponse.pkiEzmaxpricingID == null : this.pkiEzmaxpricingID.equals(customEzmaxpricingResponse.pkiEzmaxpricingID)) &&
        (this.dEzmaxpricingRebateezsignallagents == null ? customEzmaxpricingResponse.dEzmaxpricingRebateezsignallagents == null : this.dEzmaxpricingRebateezsignallagents.equals(customEzmaxpricingResponse.dEzmaxpricingRebateezsignallagents)) &&
        (this.dtEzmaxpricingStart == null ? customEzmaxpricingResponse.dtEzmaxpricingStart == null : this.dtEzmaxpricingStart.equals(customEzmaxpricingResponse.dtEzmaxpricingStart)) &&
        (this.dtEzmaxpricingEnd == null ? customEzmaxpricingResponse.dtEzmaxpricingEnd == null : this.dtEzmaxpricingEnd.equals(customEzmaxpricingResponse.dtEzmaxpricingEnd));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzmaxpricingID == null ? 0: this.pkiEzmaxpricingID.hashCode());
    result = 31 * result + (this.dEzmaxpricingRebateezsignallagents == null ? 0: this.dEzmaxpricingRebateezsignallagents.hashCode());
    result = 31 * result + (this.dtEzmaxpricingStart == null ? 0: this.dtEzmaxpricingStart.hashCode());
    result = 31 * result + (this.dtEzmaxpricingEnd == null ? 0: this.dtEzmaxpricingEnd.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEzmaxpricingResponse {\n");
    
    sb.append("  pkiEzmaxpricingID: ").append(pkiEzmaxpricingID).append("\n");
    sb.append("  dEzmaxpricingRebateezsignallagents: ").append(dEzmaxpricingRebateezsignallagents).append("\n");
    sb.append("  dtEzmaxpricingStart: ").append(dtEzmaxpricingStart).append("\n");
    sb.append("  dtEzmaxpricingEnd: ").append(dtEzmaxpricingEnd).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
