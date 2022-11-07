/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.15
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
public class EzsignsignerResponseCompoundContact {
  
  @SerializedName("pkiContactID")
  private Integer pkiContactID = null;
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

  /**
   * The unique ID of the Contact
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Contact")
  public Integer getPkiContactID() {
    return pkiContactID;
  }
  public void setPkiContactID(Integer pkiContactID) {
    this.pkiContactID = pkiContactID;
  }

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignerResponseCompoundContact ezsignsignerResponseCompoundContact = (EzsignsignerResponseCompoundContact) o;
    return (this.pkiContactID == null ? ezsignsignerResponseCompoundContact.pkiContactID == null : this.pkiContactID.equals(ezsignsignerResponseCompoundContact.pkiContactID)) &&
        (this.sContactFirstname == null ? ezsignsignerResponseCompoundContact.sContactFirstname == null : this.sContactFirstname.equals(ezsignsignerResponseCompoundContact.sContactFirstname)) &&
        (this.sContactLastname == null ? ezsignsignerResponseCompoundContact.sContactLastname == null : this.sContactLastname.equals(ezsignsignerResponseCompoundContact.sContactLastname)) &&
        (this.fkiLanguageID == null ? ezsignsignerResponseCompoundContact.fkiLanguageID == null : this.fkiLanguageID.equals(ezsignsignerResponseCompoundContact.fkiLanguageID)) &&
        (this.sEmailAddress == null ? ezsignsignerResponseCompoundContact.sEmailAddress == null : this.sEmailAddress.equals(ezsignsignerResponseCompoundContact.sEmailAddress)) &&
        (this.sPhoneE164 == null ? ezsignsignerResponseCompoundContact.sPhoneE164 == null : this.sPhoneE164.equals(ezsignsignerResponseCompoundContact.sPhoneE164)) &&
        (this.sPhoneExtension == null ? ezsignsignerResponseCompoundContact.sPhoneExtension == null : this.sPhoneExtension.equals(ezsignsignerResponseCompoundContact.sPhoneExtension)) &&
        (this.sPhoneE164Cell == null ? ezsignsignerResponseCompoundContact.sPhoneE164Cell == null : this.sPhoneE164Cell.equals(ezsignsignerResponseCompoundContact.sPhoneE164Cell));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiContactID == null ? 0: this.pkiContactID.hashCode());
    result = 31 * result + (this.sContactFirstname == null ? 0: this.sContactFirstname.hashCode());
    result = 31 * result + (this.sContactLastname == null ? 0: this.sContactLastname.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.sEmailAddress == null ? 0: this.sEmailAddress.hashCode());
    result = 31 * result + (this.sPhoneE164 == null ? 0: this.sPhoneE164.hashCode());
    result = 31 * result + (this.sPhoneExtension == null ? 0: this.sPhoneExtension.hashCode());
    result = 31 * result + (this.sPhoneE164Cell == null ? 0: this.sPhoneE164Cell.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignerResponseCompoundContact {\n");
    
    sb.append("  pkiContactID: ").append(pkiContactID).append("\n");
    sb.append("  sContactFirstname: ").append(sContactFirstname).append("\n");
    sb.append("  sContactLastname: ").append(sContactLastname).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  sEmailAddress: ").append(sEmailAddress).append("\n");
    sb.append("  sPhoneE164: ").append(sPhoneE164).append("\n");
    sb.append("  sPhoneExtension: ").append(sPhoneExtension).append("\n");
    sb.append("  sPhoneE164Cell: ").append(sPhoneE164Cell).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
