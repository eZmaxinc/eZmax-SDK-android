/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.1
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
  @SerializedName("sPhoneNumber")
  private String sPhoneNumber = null;
  @SerializedName("sPhoneNumberCell")
  private String sPhoneNumberCell = null;

  /**
   * The first name of the Contact
   **/
  @ApiModelProperty(required = true, value = "The first name of the Contact")
  public String getSContactFirstname() {
    return sContactFirstname;
  }
  public void setSContactFirstname(String sContactFirstname) {
    this.sContactFirstname = sContactFirstname;
  }

  /**
   * The last name of the Contact
   **/
  @ApiModelProperty(required = true, value = "The last name of the Contact")
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
   * The email address of the contact. Must be filled if email authentification was requested
   **/
  @ApiModelProperty(value = "The email address of the contact. Must be filled if email authentification was requested")
  public String getSEmailAddress() {
    return sEmailAddress;
  }
  public void setSEmailAddress(String sEmailAddress) {
    this.sEmailAddress = sEmailAddress;
  }

  /**
   * The Phone number of the contact. Use format \"5149901516\" for North American Numbers (Without \"1\" for long distance code) you would dial like this: 1-514-990-1516. Use format \"498945233886\" for international numbers (Without \"011\") you would dial like this: +49 89 452 33 88-6. In this example \"49\" is the country code of Germany.
   **/
  @ApiModelProperty(value = "The Phone number of the contact. Use format \"5149901516\" for North American Numbers (Without \"1\" for long distance code) you would dial like this: 1-514-990-1516. Use format \"498945233886\" for international numbers (Without \"011\") you would dial like this: +49 89 452 33 88-6. In this example \"49\" is the country code of Germany.")
  public String getSPhoneNumber() {
    return sPhoneNumber;
  }
  public void setSPhoneNumber(String sPhoneNumber) {
    this.sPhoneNumber = sPhoneNumber;
  }

  /**
   * The Cell Phone number of the contact. Use format \"5149901516\" for North American Numbers (Without \"1\" for long distance code) you would dial like this: 1-514-990-1516. Use format \"498945233886\" for international numbers (Without \"011\") you would dial like this: +49 89 452 33 88-6. In this example \"49\" is the country code of Germany.
   **/
  @ApiModelProperty(value = "The Cell Phone number of the contact. Use format \"5149901516\" for North American Numbers (Without \"1\" for long distance code) you would dial like this: 1-514-990-1516. Use format \"498945233886\" for international numbers (Without \"011\") you would dial like this: +49 89 452 33 88-6. In this example \"49\" is the country code of Germany.")
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
    sb.append("  sPhoneNumber: ").append(sPhoneNumber).append("\n");
    sb.append("  sPhoneNumberCell: ").append(sPhoneNumberCell).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
