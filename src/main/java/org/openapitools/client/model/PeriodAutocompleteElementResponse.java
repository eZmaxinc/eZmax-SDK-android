/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
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
 * A Period AutocompleteElement Response
 **/
@ApiModel(description = "A Period AutocompleteElement Response")
public class PeriodAutocompleteElementResponse {
  
  @SerializedName("sPeriodYYYYMM")
  private String sPeriodYYYYMM = null;
  @SerializedName("pkiPeriodID")
  private Integer pkiPeriodID = null;
  @SerializedName("bPeriodIsactive")
  private Boolean bPeriodIsactive = null;

  /**
   * The period YYYYMM
   **/
  @ApiModelProperty(required = true, value = "The period YYYYMM")
  public String getSPeriodYYYYMM() {
    return sPeriodYYYYMM;
  }
  public void setSPeriodYYYYMM(String sPeriodYYYYMM) {
    this.sPeriodYYYYMM = sPeriodYYYYMM;
  }

  /**
   * The unique ID of the Period
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Period")
  public Integer getPkiPeriodID() {
    return pkiPeriodID;
  }
  public void setPkiPeriodID(Integer pkiPeriodID) {
    this.pkiPeriodID = pkiPeriodID;
  }

  /**
   * Whether the Period is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Period is active or not")
  public Boolean getBPeriodIsactive() {
    return bPeriodIsactive;
  }
  public void setBPeriodIsactive(Boolean bPeriodIsactive) {
    this.bPeriodIsactive = bPeriodIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeriodAutocompleteElementResponse periodAutocompleteElementResponse = (PeriodAutocompleteElementResponse) o;
    return (this.sPeriodYYYYMM == null ? periodAutocompleteElementResponse.sPeriodYYYYMM == null : this.sPeriodYYYYMM.equals(periodAutocompleteElementResponse.sPeriodYYYYMM)) &&
        (this.pkiPeriodID == null ? periodAutocompleteElementResponse.pkiPeriodID == null : this.pkiPeriodID.equals(periodAutocompleteElementResponse.pkiPeriodID)) &&
        (this.bPeriodIsactive == null ? periodAutocompleteElementResponse.bPeriodIsactive == null : this.bPeriodIsactive.equals(periodAutocompleteElementResponse.bPeriodIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sPeriodYYYYMM == null ? 0: this.sPeriodYYYYMM.hashCode());
    result = 31 * result + (this.pkiPeriodID == null ? 0: this.pkiPeriodID.hashCode());
    result = 31 * result + (this.bPeriodIsactive == null ? 0: this.bPeriodIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeriodAutocompleteElementResponse {\n");
    
    sb.append("  sPeriodYYYYMM: ").append(sPeriodYYYYMM).append("\n");
    sb.append("  pkiPeriodID: ").append(pkiPeriodID).append("\n");
    sb.append("  bPeriodIsactive: ").append(bPeriodIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
