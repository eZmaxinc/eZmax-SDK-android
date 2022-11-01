/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
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
 * A Ezsignsigner-&gt;Contact Object and children to create a complete structure
 **/
@ApiModel(description = "A Ezsignsigner->Contact Object and children to create a complete structure")
public class EzsignsignerRequestCompoundContact {
  
  @SerializedName("sContactFirstname")
  private String sContactFirstname = null;
  @SerializedName("sContactLastname")
  private String sContactLastname = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("sEmailAddress")
  private String sEmailAddress = null;
  @SerializedName("sPhoneE164")
  private String sPhoneE164 = null;
  @SerializedName("sPhoneExtension")
  private String sPhoneExtension = null;
  @SerializedName("sPhoneE164Cell")
  private String sPhoneE164Cell = null;
  @SerializedName("sPhoneNumber")
  private String sPhoneNumber = null;
  @SerializedName("sPhoneNumberCell")
  private String sPhoneNumberCell = null;

  /**
   * The First name of the contact
   **/
  @ApiModelProperty(required = true, value = "The First name of the contact")
  public String getSContactFirstname() {
    return sContactFirstname;
  }
  public void setSContactFirstname(String sContactFirstname) {
    this.sContactFirstname = sContactFirstname;
  }

  /**
   * The Last name of the contact
   **/
  @ApiModelProperty(required = true, value = "The Last name of the contact")
  public String getSContactLastname() {
    return sContactLastname;
  }
  public void setSContactLastname(String sContactLastname) {
    this.sContactLastname = sContactLastname;
  }

  /**
   * The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
   * minimum: 1
   * maximum: 2
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|")
  public Integer getFkiLanguageID() {
    return fkiLanguageID;
  }
  public void setFkiLanguageID(Integer fkiLanguageID) {
    this.fkiLanguageID = fkiLanguageID;
  }

  /**
   * The email address.
   **/
  @ApiModelProperty(value = "The email address.")
  public String getSEmailAddress() {
    return sEmailAddress;
  }
  public void setSEmailAddress(String sEmailAddress) {
    this.sEmailAddress = sEmailAddress;
  }

  /**
   * A phone number in E.164 Format
   **/
  @ApiModelProperty(value = "A phone number in E.164 Format")
  public String getSPhoneE164() {
    return sPhoneE164;
  }
  public void setSPhoneE164(String sPhoneE164) {
    this.sPhoneE164 = sPhoneE164;
  }

  /**
   * The extension of the phone number.  The extension is the \"123\" section in this sample phone number: (514) 990-1516 x123.  It can also be used with international phone numbers
   **/
  @ApiModelProperty(value = "The extension of the phone number.  The extension is the \"123\" section in this sample phone number: (514) 990-1516 x123.  It can also be used with international phone numbers")
  public String getSPhoneExtension() {
    return sPhoneExtension;
  }
  public void setSPhoneExtension(String sPhoneExtension) {
    this.sPhoneExtension = sPhoneExtension;
  }

  /**
   * A phone number in E.164 Format
   **/
  @ApiModelProperty(value = "A phone number in E.164 Format")
  public String getSPhoneE164Cell() {
    return sPhoneE164Cell;
  }
  public void setSPhoneE164Cell(String sPhoneE164Cell) {
    this.sPhoneE164Cell = sPhoneE164Cell;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSPhoneNumber() {
    return sPhoneNumber;
  }
  public void setSPhoneNumber(String sPhoneNumber) {
    this.sPhoneNumber = sPhoneNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSPhoneNumberCell() {
    return sPhoneNumberCell;
  }
  public void setSPhoneNumberCell(String sPhoneNumberCell) {
    this.sPhoneNumberCell = sPhoneNumberCell;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignerRequestCompoundContact ezsignsignerRequestCompoundContact = (EzsignsignerRequestCompoundContact) o;
    return (this.sContactFirstname == null ? ezsignsignerRequestCompoundContact.sContactFirstname == null : this.sContactFirstname.equals(ezsignsignerRequestCompoundContact.sContactFirstname)) &&
        (this.sContactLastname == null ? ezsignsignerRequestCompoundContact.sContactLastname == null : this.sContactLastname.equals(ezsignsignerRequestCompoundContact.sContactLastname)) &&
        (this.fkiLanguageID == null ? ezsignsignerRequestCompoundContact.fkiLanguageID == null : this.fkiLanguageID.equals(ezsignsignerRequestCompoundContact.fkiLanguageID)) &&
        (this.sEmailAddress == null ? ezsignsignerRequestCompoundContact.sEmailAddress == null : this.sEmailAddress.equals(ezsignsignerRequestCompoundContact.sEmailAddress)) &&
        (this.sPhoneE164 == null ? ezsignsignerRequestCompoundContact.sPhoneE164 == null : this.sPhoneE164.equals(ezsignsignerRequestCompoundContact.sPhoneE164)) &&
        (this.sPhoneExtension == null ? ezsignsignerRequestCompoundContact.sPhoneExtension == null : this.sPhoneExtension.equals(ezsignsignerRequestCompoundContact.sPhoneExtension)) &&
        (this.sPhoneE164Cell == null ? ezsignsignerRequestCompoundContact.sPhoneE164Cell == null : this.sPhoneE164Cell.equals(ezsignsignerRequestCompoundContact.sPhoneE164Cell)) &&
        (this.sPhoneNumber == null ? ezsignsignerRequestCompoundContact.sPhoneNumber == null : this.sPhoneNumber.equals(ezsignsignerRequestCompoundContact.sPhoneNumber)) &&
        (this.sPhoneNumberCell == null ? ezsignsignerRequestCompoundContact.sPhoneNumberCell == null : this.sPhoneNumberCell.equals(ezsignsignerRequestCompoundContact.sPhoneNumberCell));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sContactFirstname == null ? 0: this.sContactFirstname.hashCode());
    result = 31 * result + (this.sContactLastname == null ? 0: this.sContactLastname.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.sEmailAddress == null ? 0: this.sEmailAddress.hashCode());
    result = 31 * result + (this.sPhoneE164 == null ? 0: this.sPhoneE164.hashCode());
    result = 31 * result + (this.sPhoneExtension == null ? 0: this.sPhoneExtension.hashCode());
    result = 31 * result + (this.sPhoneE164Cell == null ? 0: this.sPhoneE164Cell.hashCode());
    result = 31 * result + (this.sPhoneNumber == null ? 0: this.sPhoneNumber.hashCode());
    result = 31 * result + (this.sPhoneNumberCell == null ? 0: this.sPhoneNumberCell.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignerRequestCompoundContact {\n");
    
    sb.append("  sContactFirstname: ").append(sContactFirstname).append("\n");
    sb.append("  sContactLastname: ").append(sContactLastname).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  sEmailAddress: ").append(sEmailAddress).append("\n");
    sb.append("  sPhoneE164: ").append(sPhoneE164).append("\n");
    sb.append("  sPhoneExtension: ").append(sPhoneExtension).append("\n");
    sb.append("  sPhoneE164Cell: ").append(sPhoneE164Cell).append("\n");
    sb.append("  sPhoneNumber: ").append(sPhoneNumber).append("\n");
    sb.append("  sPhoneNumberCell: ").append(sPhoneNumberCell).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
