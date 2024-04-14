/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.1
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
 * An EzmaxinvoicingEzsignfolder object containing information about the Ezmaxinvoicing for an Ezsignfolder
 **/
@ApiModel(description = "An EzmaxinvoicingEzsignfolder object containing information about the Ezmaxinvoicing for an Ezsignfolder")
public class CustomEzmaxinvoicingEzsignfolderResponse {
  
  @SerializedName("fkiEzsignfolderID")
  private Integer fkiEzsignfolderID = null;
  @SerializedName("fkiBillingentityinternalID")
  private Integer fkiBillingentityinternalID = null;
  @SerializedName("sEzsignfolderDescription")
  private String sEzsignfolderDescription = null;
  @SerializedName("bEzsigntsarequirementBillable")
  private Boolean bEzsigntsarequirementBillable = null;
  @SerializedName("bEzsignfolderMfaused")
  private Boolean bEzsignfolderMfaused = null;
  @SerializedName("bEzsignfolderPaymentused")
  private Boolean bEzsignfolderPaymentused = null;
  @SerializedName("bEzsignfolderAllowed")
  private Boolean bEzsignfolderAllowed = null;

  /**
   * The unique ID of the Ezsignfolder
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfolder")
  public Integer getFkiEzsignfolderID() {
    return fkiEzsignfolderID;
  }
  public void setFkiEzsignfolderID(Integer fkiEzsignfolderID) {
    this.fkiEzsignfolderID = fkiEzsignfolderID;
  }

  /**
   * The unique ID of the Billingentityinternal.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Billingentityinternal.")
  public Integer getFkiBillingentityinternalID() {
    return fkiBillingentityinternalID;
  }
  public void setFkiBillingentityinternalID(Integer fkiBillingentityinternalID) {
    this.fkiBillingentityinternalID = fkiBillingentityinternalID;
  }

  /**
   * The description of the Ezsignfolder
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezsignfolder")
  public String getSEzsignfolderDescription() {
    return sEzsignfolderDescription;
  }
  public void setSEzsignfolderDescription(String sEzsignfolderDescription) {
    this.sEzsignfolderDescription = sEzsignfolderDescription;
  }

  /**
   * Whether the TSA requirement is billable or not
   **/
  @ApiModelProperty(required = true, value = "Whether the TSA requirement is billable or not")
  public Boolean getBEzsigntsarequirementBillable() {
    return bEzsigntsarequirementBillable;
  }
  public void setBEzsigntsarequirementBillable(Boolean bEzsigntsarequirementBillable) {
    this.bEzsigntsarequirementBillable = bEzsigntsarequirementBillable;
  }

  /**
   * Whether the MFA was used or not for the Ezsignfolder
   **/
  @ApiModelProperty(required = true, value = "Whether the MFA was used or not for the Ezsignfolder")
  public Boolean getBEzsignfolderMfaused() {
    return bEzsignfolderMfaused;
  }
  public void setBEzsignfolderMfaused(Boolean bEzsignfolderMfaused) {
    this.bEzsignfolderMfaused = bEzsignfolderMfaused;
  }

  /**
   * Whether there was a signature is of type payment
   **/
  @ApiModelProperty(required = true, value = "Whether there was a signature is of type payment")
  public Boolean getBEzsignfolderPaymentused() {
    return bEzsignfolderPaymentused;
  }
  public void setBEzsignfolderPaymentused(Boolean bEzsignfolderPaymentused) {
    this.bEzsignfolderPaymentused = bEzsignfolderPaymentused;
  }

  /**
   * Whether you have access to the Ezsignfolder or not
   **/
  @ApiModelProperty(required = true, value = "Whether you have access to the Ezsignfolder or not")
  public Boolean getBEzsignfolderAllowed() {
    return bEzsignfolderAllowed;
  }
  public void setBEzsignfolderAllowed(Boolean bEzsignfolderAllowed) {
    this.bEzsignfolderAllowed = bEzsignfolderAllowed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEzmaxinvoicingEzsignfolderResponse customEzmaxinvoicingEzsignfolderResponse = (CustomEzmaxinvoicingEzsignfolderResponse) o;
    return (this.fkiEzsignfolderID == null ? customEzmaxinvoicingEzsignfolderResponse.fkiEzsignfolderID == null : this.fkiEzsignfolderID.equals(customEzmaxinvoicingEzsignfolderResponse.fkiEzsignfolderID)) &&
        (this.fkiBillingentityinternalID == null ? customEzmaxinvoicingEzsignfolderResponse.fkiBillingentityinternalID == null : this.fkiBillingentityinternalID.equals(customEzmaxinvoicingEzsignfolderResponse.fkiBillingentityinternalID)) &&
        (this.sEzsignfolderDescription == null ? customEzmaxinvoicingEzsignfolderResponse.sEzsignfolderDescription == null : this.sEzsignfolderDescription.equals(customEzmaxinvoicingEzsignfolderResponse.sEzsignfolderDescription)) &&
        (this.bEzsigntsarequirementBillable == null ? customEzmaxinvoicingEzsignfolderResponse.bEzsigntsarequirementBillable == null : this.bEzsigntsarequirementBillable.equals(customEzmaxinvoicingEzsignfolderResponse.bEzsigntsarequirementBillable)) &&
        (this.bEzsignfolderMfaused == null ? customEzmaxinvoicingEzsignfolderResponse.bEzsignfolderMfaused == null : this.bEzsignfolderMfaused.equals(customEzmaxinvoicingEzsignfolderResponse.bEzsignfolderMfaused)) &&
        (this.bEzsignfolderPaymentused == null ? customEzmaxinvoicingEzsignfolderResponse.bEzsignfolderPaymentused == null : this.bEzsignfolderPaymentused.equals(customEzmaxinvoicingEzsignfolderResponse.bEzsignfolderPaymentused)) &&
        (this.bEzsignfolderAllowed == null ? customEzmaxinvoicingEzsignfolderResponse.bEzsignfolderAllowed == null : this.bEzsignfolderAllowed.equals(customEzmaxinvoicingEzsignfolderResponse.bEzsignfolderAllowed));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiEzsignfolderID == null ? 0: this.fkiEzsignfolderID.hashCode());
    result = 31 * result + (this.fkiBillingentityinternalID == null ? 0: this.fkiBillingentityinternalID.hashCode());
    result = 31 * result + (this.sEzsignfolderDescription == null ? 0: this.sEzsignfolderDescription.hashCode());
    result = 31 * result + (this.bEzsigntsarequirementBillable == null ? 0: this.bEzsigntsarequirementBillable.hashCode());
    result = 31 * result + (this.bEzsignfolderMfaused == null ? 0: this.bEzsignfolderMfaused.hashCode());
    result = 31 * result + (this.bEzsignfolderPaymentused == null ? 0: this.bEzsignfolderPaymentused.hashCode());
    result = 31 * result + (this.bEzsignfolderAllowed == null ? 0: this.bEzsignfolderAllowed.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEzmaxinvoicingEzsignfolderResponse {\n");
    
    sb.append("  fkiEzsignfolderID: ").append(fkiEzsignfolderID).append("\n");
    sb.append("  fkiBillingentityinternalID: ").append(fkiBillingentityinternalID).append("\n");
    sb.append("  sEzsignfolderDescription: ").append(sEzsignfolderDescription).append("\n");
    sb.append("  bEzsigntsarequirementBillable: ").append(bEzsigntsarequirementBillable).append("\n");
    sb.append("  bEzsignfolderMfaused: ").append(bEzsignfolderMfaused).append("\n");
    sb.append("  bEzsignfolderPaymentused: ").append(bEzsignfolderPaymentused).append("\n");
    sb.append("  bEzsignfolderAllowed: ").append(bEzsignfolderAllowed).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
