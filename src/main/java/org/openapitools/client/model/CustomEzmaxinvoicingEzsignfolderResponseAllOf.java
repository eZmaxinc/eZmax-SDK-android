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

@ApiModel(description = "")
public class CustomEzmaxinvoicingEzsignfolderResponseAllOf {
  
  @SerializedName("fkiEzsignfolderID")
  private Integer fkiEzsignfolderID = null;
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
   **/
  @ApiModelProperty(required = true, value = "")
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
    CustomEzmaxinvoicingEzsignfolderResponseAllOf customEzmaxinvoicingEzsignfolderResponseAllOf = (CustomEzmaxinvoicingEzsignfolderResponseAllOf) o;
    return (this.fkiEzsignfolderID == null ? customEzmaxinvoicingEzsignfolderResponseAllOf.fkiEzsignfolderID == null : this.fkiEzsignfolderID.equals(customEzmaxinvoicingEzsignfolderResponseAllOf.fkiEzsignfolderID)) &&
        (this.sEzsignfolderDescription == null ? customEzmaxinvoicingEzsignfolderResponseAllOf.sEzsignfolderDescription == null : this.sEzsignfolderDescription.equals(customEzmaxinvoicingEzsignfolderResponseAllOf.sEzsignfolderDescription)) &&
        (this.bEzsigntsarequirementBillable == null ? customEzmaxinvoicingEzsignfolderResponseAllOf.bEzsigntsarequirementBillable == null : this.bEzsigntsarequirementBillable.equals(customEzmaxinvoicingEzsignfolderResponseAllOf.bEzsigntsarequirementBillable)) &&
        (this.bEzsignfolderMfaused == null ? customEzmaxinvoicingEzsignfolderResponseAllOf.bEzsignfolderMfaused == null : this.bEzsignfolderMfaused.equals(customEzmaxinvoicingEzsignfolderResponseAllOf.bEzsignfolderMfaused)) &&
        (this.bEzsignfolderPaymentused == null ? customEzmaxinvoicingEzsignfolderResponseAllOf.bEzsignfolderPaymentused == null : this.bEzsignfolderPaymentused.equals(customEzmaxinvoicingEzsignfolderResponseAllOf.bEzsignfolderPaymentused)) &&
        (this.bEzsignfolderAllowed == null ? customEzmaxinvoicingEzsignfolderResponseAllOf.bEzsignfolderAllowed == null : this.bEzsignfolderAllowed.equals(customEzmaxinvoicingEzsignfolderResponseAllOf.bEzsignfolderAllowed));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiEzsignfolderID == null ? 0: this.fkiEzsignfolderID.hashCode());
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
    sb.append("class CustomEzmaxinvoicingEzsignfolderResponseAllOf {\n");
    
    sb.append("  fkiEzsignfolderID: ").append(fkiEzsignfolderID).append("\n");
    sb.append("  sEzsignfolderDescription: ").append(sEzsignfolderDescription).append("\n");
    sb.append("  bEzsigntsarequirementBillable: ").append(bEzsigntsarequirementBillable).append("\n");
    sb.append("  bEzsignfolderMfaused: ").append(bEzsignfolderMfaused).append("\n");
    sb.append("  bEzsignfolderPaymentused: ").append(bEzsignfolderPaymentused).append("\n");
    sb.append("  bEzsignfolderAllowed: ").append(bEzsignfolderAllowed).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
