/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.MultilingualEzmaxinvoicingsummaryinternalDescription;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezmaxinvoicingsummaryinternal Object
 **/
@ApiModel(description = "A Ezmaxinvoicingsummaryinternal Object")
public class EzmaxinvoicingsummaryinternalResponse {
  
  @SerializedName("pkiEzmaxinvoicingsummaryinternalID")
  private Integer pkiEzmaxinvoicingsummaryinternalID = null;
  @SerializedName("objEzmaxinvoicingsummaryinternalDescription")
  private MultilingualEzmaxinvoicingsummaryinternalDescription objEzmaxinvoicingsummaryinternalDescription = null;
  @SerializedName("sEzmaxinvoicingsummaryinternalDescriptionX")
  private String sEzmaxinvoicingsummaryinternalDescriptionX = null;
  @SerializedName("fkiEzmaxinvoicingID")
  private Integer fkiEzmaxinvoicingID = null;
  @SerializedName("fkiBillingentityinternalID")
  private Integer fkiBillingentityinternalID = null;
  @SerializedName("sBillingentityinternalDescriptionX")
  private String sBillingentityinternalDescriptionX = null;

  /**
   * The unique ID of the Ezmaxinvoicingsummaryinternal
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezmaxinvoicingsummaryinternal")
  public Integer getPkiEzmaxinvoicingsummaryinternalID() {
    return pkiEzmaxinvoicingsummaryinternalID;
  }
  public void setPkiEzmaxinvoicingsummaryinternalID(Integer pkiEzmaxinvoicingsummaryinternalID) {
    this.pkiEzmaxinvoicingsummaryinternalID = pkiEzmaxinvoicingsummaryinternalID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public MultilingualEzmaxinvoicingsummaryinternalDescription getObjEzmaxinvoicingsummaryinternalDescription() {
    return objEzmaxinvoicingsummaryinternalDescription;
  }
  public void setObjEzmaxinvoicingsummaryinternalDescription(MultilingualEzmaxinvoicingsummaryinternalDescription objEzmaxinvoicingsummaryinternalDescription) {
    this.objEzmaxinvoicingsummaryinternalDescription = objEzmaxinvoicingsummaryinternalDescription;
  }

  /**
   * The Ezmaxinvoicingsummaryinternal description in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The Ezmaxinvoicingsummaryinternal description in the language of the requester")
  public String getSEzmaxinvoicingsummaryinternalDescriptionX() {
    return sEzmaxinvoicingsummaryinternalDescriptionX;
  }
  public void setSEzmaxinvoicingsummaryinternalDescriptionX(String sEzmaxinvoicingsummaryinternalDescriptionX) {
    this.sEzmaxinvoicingsummaryinternalDescriptionX = sEzmaxinvoicingsummaryinternalDescriptionX;
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
   * The unique ID of the Billingentityinternal.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Billingentityinternal.")
  public Integer getFkiBillingentityinternalID() {
    return fkiBillingentityinternalID;
  }
  public void setFkiBillingentityinternalID(Integer fkiBillingentityinternalID) {
    this.fkiBillingentityinternalID = fkiBillingentityinternalID;
  }

  /**
   * The description of the Billingentityinternal in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The description of the Billingentityinternal in the language of the requester")
  public String getSBillingentityinternalDescriptionX() {
    return sBillingentityinternalDescriptionX;
  }
  public void setSBillingentityinternalDescriptionX(String sBillingentityinternalDescriptionX) {
    this.sBillingentityinternalDescriptionX = sBillingentityinternalDescriptionX;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzmaxinvoicingsummaryinternalResponse ezmaxinvoicingsummaryinternalResponse = (EzmaxinvoicingsummaryinternalResponse) o;
    return (this.pkiEzmaxinvoicingsummaryinternalID == null ? ezmaxinvoicingsummaryinternalResponse.pkiEzmaxinvoicingsummaryinternalID == null : this.pkiEzmaxinvoicingsummaryinternalID.equals(ezmaxinvoicingsummaryinternalResponse.pkiEzmaxinvoicingsummaryinternalID)) &&
        (this.objEzmaxinvoicingsummaryinternalDescription == null ? ezmaxinvoicingsummaryinternalResponse.objEzmaxinvoicingsummaryinternalDescription == null : this.objEzmaxinvoicingsummaryinternalDescription.equals(ezmaxinvoicingsummaryinternalResponse.objEzmaxinvoicingsummaryinternalDescription)) &&
        (this.sEzmaxinvoicingsummaryinternalDescriptionX == null ? ezmaxinvoicingsummaryinternalResponse.sEzmaxinvoicingsummaryinternalDescriptionX == null : this.sEzmaxinvoicingsummaryinternalDescriptionX.equals(ezmaxinvoicingsummaryinternalResponse.sEzmaxinvoicingsummaryinternalDescriptionX)) &&
        (this.fkiEzmaxinvoicingID == null ? ezmaxinvoicingsummaryinternalResponse.fkiEzmaxinvoicingID == null : this.fkiEzmaxinvoicingID.equals(ezmaxinvoicingsummaryinternalResponse.fkiEzmaxinvoicingID)) &&
        (this.fkiBillingentityinternalID == null ? ezmaxinvoicingsummaryinternalResponse.fkiBillingentityinternalID == null : this.fkiBillingentityinternalID.equals(ezmaxinvoicingsummaryinternalResponse.fkiBillingentityinternalID)) &&
        (this.sBillingentityinternalDescriptionX == null ? ezmaxinvoicingsummaryinternalResponse.sBillingentityinternalDescriptionX == null : this.sBillingentityinternalDescriptionX.equals(ezmaxinvoicingsummaryinternalResponse.sBillingentityinternalDescriptionX));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzmaxinvoicingsummaryinternalID == null ? 0: this.pkiEzmaxinvoicingsummaryinternalID.hashCode());
    result = 31 * result + (this.objEzmaxinvoicingsummaryinternalDescription == null ? 0: this.objEzmaxinvoicingsummaryinternalDescription.hashCode());
    result = 31 * result + (this.sEzmaxinvoicingsummaryinternalDescriptionX == null ? 0: this.sEzmaxinvoicingsummaryinternalDescriptionX.hashCode());
    result = 31 * result + (this.fkiEzmaxinvoicingID == null ? 0: this.fkiEzmaxinvoicingID.hashCode());
    result = 31 * result + (this.fkiBillingentityinternalID == null ? 0: this.fkiBillingentityinternalID.hashCode());
    result = 31 * result + (this.sBillingentityinternalDescriptionX == null ? 0: this.sBillingentityinternalDescriptionX.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzmaxinvoicingsummaryinternalResponse {\n");
    
    sb.append("  pkiEzmaxinvoicingsummaryinternalID: ").append(pkiEzmaxinvoicingsummaryinternalID).append("\n");
    sb.append("  objEzmaxinvoicingsummaryinternalDescription: ").append(objEzmaxinvoicingsummaryinternalDescription).append("\n");
    sb.append("  sEzmaxinvoicingsummaryinternalDescriptionX: ").append(sEzmaxinvoicingsummaryinternalDescriptionX).append("\n");
    sb.append("  fkiEzmaxinvoicingID: ").append(fkiEzmaxinvoicingID).append("\n");
    sb.append("  fkiBillingentityinternalID: ").append(fkiBillingentityinternalID).append("\n");
    sb.append("  sBillingentityinternalDescriptionX: ").append(sBillingentityinternalDescriptionX).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
