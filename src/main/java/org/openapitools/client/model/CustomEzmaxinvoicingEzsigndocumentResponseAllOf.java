/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.12
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
public class CustomEzmaxinvoicingEzsigndocumentResponseAllOf {
  
  @SerializedName("fkiEzsignfolderID")
  private Integer fkiEzsignfolderID = null;
  @SerializedName("sName")
  private String sName = null;
  @SerializedName("sEzsignfolderDescription")
  private String sEzsignfolderDescription = null;
  @SerializedName("sEzsigndocumentName")
  private String sEzsigndocumentName = null;
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
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSName() {
    return sName;
  }
  public void setSName(String sName) {
    this.sName = sName;
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
   * The name of the document that will be presented to Ezsignfoldersignerassociations
   **/
  @ApiModelProperty(required = true, value = "The name of the document that will be presented to Ezsignfoldersignerassociations")
  public String getSEzsigndocumentName() {
    return sEzsigndocumentName;
  }
  public void setSEzsigndocumentName(String sEzsigndocumentName) {
    this.sEzsigndocumentName = sEzsigndocumentName;
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
    CustomEzmaxinvoicingEzsigndocumentResponseAllOf customEzmaxinvoicingEzsigndocumentResponseAllOf = (CustomEzmaxinvoicingEzsigndocumentResponseAllOf) o;
    return (this.fkiEzsignfolderID == null ? customEzmaxinvoicingEzsigndocumentResponseAllOf.fkiEzsignfolderID == null : this.fkiEzsignfolderID.equals(customEzmaxinvoicingEzsigndocumentResponseAllOf.fkiEzsignfolderID)) &&
        (this.sName == null ? customEzmaxinvoicingEzsigndocumentResponseAllOf.sName == null : this.sName.equals(customEzmaxinvoicingEzsigndocumentResponseAllOf.sName)) &&
        (this.sEzsignfolderDescription == null ? customEzmaxinvoicingEzsigndocumentResponseAllOf.sEzsignfolderDescription == null : this.sEzsignfolderDescription.equals(customEzmaxinvoicingEzsigndocumentResponseAllOf.sEzsignfolderDescription)) &&
        (this.sEzsigndocumentName == null ? customEzmaxinvoicingEzsigndocumentResponseAllOf.sEzsigndocumentName == null : this.sEzsigndocumentName.equals(customEzmaxinvoicingEzsigndocumentResponseAllOf.sEzsigndocumentName)) &&
        (this.bEzsignfolderAllowed == null ? customEzmaxinvoicingEzsigndocumentResponseAllOf.bEzsignfolderAllowed == null : this.bEzsignfolderAllowed.equals(customEzmaxinvoicingEzsigndocumentResponseAllOf.bEzsignfolderAllowed));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiEzsignfolderID == null ? 0: this.fkiEzsignfolderID.hashCode());
    result = 31 * result + (this.sName == null ? 0: this.sName.hashCode());
    result = 31 * result + (this.sEzsignfolderDescription == null ? 0: this.sEzsignfolderDescription.hashCode());
    result = 31 * result + (this.sEzsigndocumentName == null ? 0: this.sEzsigndocumentName.hashCode());
    result = 31 * result + (this.bEzsignfolderAllowed == null ? 0: this.bEzsignfolderAllowed.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEzmaxinvoicingEzsigndocumentResponseAllOf {\n");
    
    sb.append("  fkiEzsignfolderID: ").append(fkiEzsignfolderID).append("\n");
    sb.append("  sName: ").append(sName).append("\n");
    sb.append("  sEzsignfolderDescription: ").append(sEzsignfolderDescription).append("\n");
    sb.append("  sEzsigndocumentName: ").append(sEzsigndocumentName).append("\n");
    sb.append("  bEzsignfolderAllowed: ").append(bEzsignfolderAllowed).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
