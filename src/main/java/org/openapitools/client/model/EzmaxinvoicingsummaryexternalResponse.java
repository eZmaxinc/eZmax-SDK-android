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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezmaxinvoicingsummaryexternal Object
 **/
@ApiModel(description = "A Ezmaxinvoicingsummaryexternal Object")
public class EzmaxinvoicingsummaryexternalResponse {
  
  @SerializedName("pkiEzmaxinvoicingsummaryexternalID")
  private Integer pkiEzmaxinvoicingsummaryexternalID = null;
  @SerializedName("fkiEzmaxinvoicingID")
  private Integer fkiEzmaxinvoicingID = null;
  @SerializedName("fkiBillingentityexternalID")
  private Integer fkiBillingentityexternalID = null;
  @SerializedName("sBillingentityexternalDescription")
  private String sBillingentityexternalDescription = null;
  @SerializedName("sEzmaxinvoicingsummaryexternalDescription")
  private String sEzmaxinvoicingsummaryexternalDescription = null;

  /**
   * The unique ID of the Ezmaxinvoicingsummaryexternal
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezmaxinvoicingsummaryexternal")
  public Integer getPkiEzmaxinvoicingsummaryexternalID() {
    return pkiEzmaxinvoicingsummaryexternalID;
  }
  public void setPkiEzmaxinvoicingsummaryexternalID(Integer pkiEzmaxinvoicingsummaryexternalID) {
    this.pkiEzmaxinvoicingsummaryexternalID = pkiEzmaxinvoicingsummaryexternalID;
  }

  /**
   * The unique ID of the Ezmaxinvoicing
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezmaxinvoicing")
  public Integer getFkiEzmaxinvoicingID() {
    return fkiEzmaxinvoicingID;
  }
  public void setFkiEzmaxinvoicingID(Integer fkiEzmaxinvoicingID) {
    this.fkiEzmaxinvoicingID = fkiEzmaxinvoicingID;
  }

  /**
   * The unique ID of the Billingentityexternal
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Billingentityexternal")
  public Integer getFkiBillingentityexternalID() {
    return fkiBillingentityexternalID;
  }
  public void setFkiBillingentityexternalID(Integer fkiBillingentityexternalID) {
    this.fkiBillingentityexternalID = fkiBillingentityexternalID;
  }

  /**
   * The description of the Billingentityexternal
   **/
  @ApiModelProperty(required = true, value = "The description of the Billingentityexternal")
  public String getSBillingentityexternalDescription() {
    return sBillingentityexternalDescription;
  }
  public void setSBillingentityexternalDescription(String sBillingentityexternalDescription) {
    this.sBillingentityexternalDescription = sBillingentityexternalDescription;
  }

  /**
   * The description of the Ezmaxinvoicingsummaryexternal
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezmaxinvoicingsummaryexternal")
  public String getSEzmaxinvoicingsummaryexternalDescription() {
    return sEzmaxinvoicingsummaryexternalDescription;
  }
  public void setSEzmaxinvoicingsummaryexternalDescription(String sEzmaxinvoicingsummaryexternalDescription) {
    this.sEzmaxinvoicingsummaryexternalDescription = sEzmaxinvoicingsummaryexternalDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzmaxinvoicingsummaryexternalResponse ezmaxinvoicingsummaryexternalResponse = (EzmaxinvoicingsummaryexternalResponse) o;
    return (this.pkiEzmaxinvoicingsummaryexternalID == null ? ezmaxinvoicingsummaryexternalResponse.pkiEzmaxinvoicingsummaryexternalID == null : this.pkiEzmaxinvoicingsummaryexternalID.equals(ezmaxinvoicingsummaryexternalResponse.pkiEzmaxinvoicingsummaryexternalID)) &&
        (this.fkiEzmaxinvoicingID == null ? ezmaxinvoicingsummaryexternalResponse.fkiEzmaxinvoicingID == null : this.fkiEzmaxinvoicingID.equals(ezmaxinvoicingsummaryexternalResponse.fkiEzmaxinvoicingID)) &&
        (this.fkiBillingentityexternalID == null ? ezmaxinvoicingsummaryexternalResponse.fkiBillingentityexternalID == null : this.fkiBillingentityexternalID.equals(ezmaxinvoicingsummaryexternalResponse.fkiBillingentityexternalID)) &&
        (this.sBillingentityexternalDescription == null ? ezmaxinvoicingsummaryexternalResponse.sBillingentityexternalDescription == null : this.sBillingentityexternalDescription.equals(ezmaxinvoicingsummaryexternalResponse.sBillingentityexternalDescription)) &&
        (this.sEzmaxinvoicingsummaryexternalDescription == null ? ezmaxinvoicingsummaryexternalResponse.sEzmaxinvoicingsummaryexternalDescription == null : this.sEzmaxinvoicingsummaryexternalDescription.equals(ezmaxinvoicingsummaryexternalResponse.sEzmaxinvoicingsummaryexternalDescription));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzmaxinvoicingsummaryexternalID == null ? 0: this.pkiEzmaxinvoicingsummaryexternalID.hashCode());
    result = 31 * result + (this.fkiEzmaxinvoicingID == null ? 0: this.fkiEzmaxinvoicingID.hashCode());
    result = 31 * result + (this.fkiBillingentityexternalID == null ? 0: this.fkiBillingentityexternalID.hashCode());
    result = 31 * result + (this.sBillingentityexternalDescription == null ? 0: this.sBillingentityexternalDescription.hashCode());
    result = 31 * result + (this.sEzmaxinvoicingsummaryexternalDescription == null ? 0: this.sEzmaxinvoicingsummaryexternalDescription.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzmaxinvoicingsummaryexternalResponse {\n");
    
    sb.append("  pkiEzmaxinvoicingsummaryexternalID: ").append(pkiEzmaxinvoicingsummaryexternalID).append("\n");
    sb.append("  fkiEzmaxinvoicingID: ").append(fkiEzmaxinvoicingID).append("\n");
    sb.append("  fkiBillingentityexternalID: ").append(fkiBillingentityexternalID).append("\n");
    sb.append("  sBillingentityexternalDescription: ").append(sBillingentityexternalDescription).append("\n");
    sb.append("  sEzmaxinvoicingsummaryexternalDescription: ").append(sEzmaxinvoicingsummaryexternalDescription).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
