/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.37
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.ContactRequest;
import org.openapitools.client.model.ContactRequestCompoundAllOf;
import org.openapitools.client.model.ContactinformationsRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Contact Object and children to create a complete structure
 **/
@ApiModel(description = "A Contact Object and children to create a complete structure")
public class ContactRequestCompound {
  
  @SerializedName("objContactinformations")
  private ContactinformationsRequestCompound objContactinformations = null;
  @SerializedName("fkiContacttitleID")
  private Integer fkiContacttitleID = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("sContactFirstname")
  private String sContactFirstname = null;
  @SerializedName("sContactLastname")
  private String sContactLastname = null;
  @SerializedName("sContactCompany")
  private String sContactCompany = null;
  @SerializedName("dtContactBirthdate")
  private String dtContactBirthdate = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ContactinformationsRequestCompound getObjContactinformations() {
    return objContactinformations;
  }
  public void setObjContactinformations(ContactinformationsRequestCompound objContactinformations) {
    this.objContactinformations = objContactinformations;
  }

  /**
   * The unique ID of the Contacttitle.  Valid values:  |Value|Description| |-|-| |1|Ms.| |2|Mr.| |4|(Blank)| |5|Me (For Notaries)|
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Contacttitle.  Valid values:  |Value|Description| |-|-| |1|Ms.| |2|Mr.| |4|(Blank)| |5|Me (For Notaries)|")
  public Integer getFkiContacttitleID() {
    return fkiContacttitleID;
  }
  public void setFkiContacttitleID(Integer fkiContacttitleID) {
    this.fkiContacttitleID = fkiContacttitleID;
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
   * The Company name of the contact
   **/
  @ApiModelProperty(required = true, value = "The Company name of the contact")
  public String getSContactCompany() {
    return sContactCompany;
  }
  public void setSContactCompany(String sContactCompany) {
    this.sContactCompany = sContactCompany;
  }

  /**
   * The Birth Date of the contact
   **/
  @ApiModelProperty(value = "The Birth Date of the contact")
  public String getDtContactBirthdate() {
    return dtContactBirthdate;
  }
  public void setDtContactBirthdate(String dtContactBirthdate) {
    this.dtContactBirthdate = dtContactBirthdate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactRequestCompound contactRequestCompound = (ContactRequestCompound) o;
    return (this.objContactinformations == null ? contactRequestCompound.objContactinformations == null : this.objContactinformations.equals(contactRequestCompound.objContactinformations)) &&
        (this.fkiContacttitleID == null ? contactRequestCompound.fkiContacttitleID == null : this.fkiContacttitleID.equals(contactRequestCompound.fkiContacttitleID)) &&
        (this.fkiLanguageID == null ? contactRequestCompound.fkiLanguageID == null : this.fkiLanguageID.equals(contactRequestCompound.fkiLanguageID)) &&
        (this.sContactFirstname == null ? contactRequestCompound.sContactFirstname == null : this.sContactFirstname.equals(contactRequestCompound.sContactFirstname)) &&
        (this.sContactLastname == null ? contactRequestCompound.sContactLastname == null : this.sContactLastname.equals(contactRequestCompound.sContactLastname)) &&
        (this.sContactCompany == null ? contactRequestCompound.sContactCompany == null : this.sContactCompany.equals(contactRequestCompound.sContactCompany)) &&
        (this.dtContactBirthdate == null ? contactRequestCompound.dtContactBirthdate == null : this.dtContactBirthdate.equals(contactRequestCompound.dtContactBirthdate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objContactinformations == null ? 0: this.objContactinformations.hashCode());
    result = 31 * result + (this.fkiContacttitleID == null ? 0: this.fkiContacttitleID.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.sContactFirstname == null ? 0: this.sContactFirstname.hashCode());
    result = 31 * result + (this.sContactLastname == null ? 0: this.sContactLastname.hashCode());
    result = 31 * result + (this.sContactCompany == null ? 0: this.sContactCompany.hashCode());
    result = 31 * result + (this.dtContactBirthdate == null ? 0: this.dtContactBirthdate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactRequestCompound {\n");
    
    sb.append("  objContactinformations: ").append(objContactinformations).append("\n");
    sb.append("  fkiContacttitleID: ").append(fkiContacttitleID).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  sContactFirstname: ").append(sContactFirstname).append("\n");
    sb.append("  sContactLastname: ").append(sContactLastname).append("\n");
    sb.append("  sContactCompany: ").append(sContactCompany).append("\n");
    sb.append("  dtContactBirthdate: ").append(dtContactBirthdate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
