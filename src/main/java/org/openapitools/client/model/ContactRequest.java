/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.38
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
 * A Contact Object
 **/
@ApiModel(description = "A Contact Object")
public class ContactRequest {
  
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
    ContactRequest contactRequest = (ContactRequest) o;
    return (this.fkiContacttitleID == null ? contactRequest.fkiContacttitleID == null : this.fkiContacttitleID.equals(contactRequest.fkiContacttitleID)) &&
        (this.fkiLanguageID == null ? contactRequest.fkiLanguageID == null : this.fkiLanguageID.equals(contactRequest.fkiLanguageID)) &&
        (this.sContactFirstname == null ? contactRequest.sContactFirstname == null : this.sContactFirstname.equals(contactRequest.sContactFirstname)) &&
        (this.sContactLastname == null ? contactRequest.sContactLastname == null : this.sContactLastname.equals(contactRequest.sContactLastname)) &&
        (this.sContactCompany == null ? contactRequest.sContactCompany == null : this.sContactCompany.equals(contactRequest.sContactCompany)) &&
        (this.dtContactBirthdate == null ? contactRequest.dtContactBirthdate == null : this.dtContactBirthdate.equals(contactRequest.dtContactBirthdate));
  }

  @Override
  public int hashCode() {
    int result = 17;
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
    sb.append("class ContactRequest {\n");
    
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
