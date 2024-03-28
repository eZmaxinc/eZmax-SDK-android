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

import org.openapitools.client.model.FieldEUserEzsignsendreminderfrequency;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Activesession-&gt;User Object and children to create a complete structure
 **/
@ApiModel(description = "An Activesession->User Object and children to create a complete structure")
public class ActivesessionResponseCompoundUser {
  
  @SerializedName("pkiUserID")
  private Integer pkiUserID = null;
  @SerializedName("fkiTimezoneID")
  private Integer fkiTimezoneID = null;
  @SerializedName("sAvatarUrl")
  private String sAvatarUrl = null;
  @SerializedName("sUserFirstname")
  private String sUserFirstname = null;
  @SerializedName("sUserLastname")
  private String sUserLastname = null;
  @SerializedName("sEmailAddress")
  private String sEmailAddress = null;
  @SerializedName("eUserEzsignsendreminderfrequency")
  private FieldEUserEzsignsendreminderfrequency eUserEzsignsendreminderfrequency = null;
  @SerializedName("iUserInterfacecolor")
  private Integer iUserInterfacecolor = null;
  @SerializedName("bUserInterfacedark")
  private Boolean bUserInterfacedark = null;
  @SerializedName("iUserListresult")
  private Integer iUserListresult = null;

  /**
   * The unique ID of the User
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the User")
  public Integer getPkiUserID() {
    return pkiUserID;
  }
  public void setPkiUserID(Integer pkiUserID) {
    this.pkiUserID = pkiUserID;
  }

  /**
   * The unique ID of the Timezone
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Timezone")
  public Integer getFkiTimezoneID() {
    return fkiTimezoneID;
  }
  public void setFkiTimezoneID(Integer fkiTimezoneID) {
    this.fkiTimezoneID = fkiTimezoneID;
  }

  /**
   * The url of the picture used as avatar
   **/
  @ApiModelProperty(value = "The url of the picture used as avatar")
  public String getSAvatarUrl() {
    return sAvatarUrl;
  }
  public void setSAvatarUrl(String sAvatarUrl) {
    this.sAvatarUrl = sAvatarUrl;
  }

  /**
   * The first name of the user
   **/
  @ApiModelProperty(required = true, value = "The first name of the user")
  public String getSUserFirstname() {
    return sUserFirstname;
  }
  public void setSUserFirstname(String sUserFirstname) {
    this.sUserFirstname = sUserFirstname;
  }

  /**
   * The last name of the user
   **/
  @ApiModelProperty(required = true, value = "The last name of the user")
  public String getSUserLastname() {
    return sUserLastname;
  }
  public void setSUserLastname(String sUserLastname) {
    this.sUserLastname = sUserLastname;
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
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEUserEzsignsendreminderfrequency getEUserEzsignsendreminderfrequency() {
    return eUserEzsignsendreminderfrequency;
  }
  public void setEUserEzsignsendreminderfrequency(FieldEUserEzsignsendreminderfrequency eUserEzsignsendreminderfrequency) {
    this.eUserEzsignsendreminderfrequency = eUserEzsignsendreminderfrequency;
  }

  /**
   * The int32 representation of the interface color. For example, RGB color #39435B would be 3752795
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The int32 representation of the interface color. For example, RGB color #39435B would be 3752795")
  public Integer getIUserInterfacecolor() {
    return iUserInterfacecolor;
  }
  public void setIUserInterfacecolor(Integer iUserInterfacecolor) {
    this.iUserInterfacecolor = iUserInterfacecolor;
  }

  /**
   * Whether to use a dark mode interface
   **/
  @ApiModelProperty(required = true, value = "Whether to use a dark mode interface")
  public Boolean getBUserInterfacedark() {
    return bUserInterfacedark;
  }
  public void setBUserInterfacedark(Boolean bUserInterfacedark) {
    this.bUserInterfacedark = bUserInterfacedark;
  }

  /**
   * The number of rows to return by default in lists
   * minimum: 5
   * maximum: 500
   **/
  @ApiModelProperty(required = true, value = "The number of rows to return by default in lists")
  public Integer getIUserListresult() {
    return iUserListresult;
  }
  public void setIUserListresult(Integer iUserListresult) {
    this.iUserListresult = iUserListresult;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivesessionResponseCompoundUser activesessionResponseCompoundUser = (ActivesessionResponseCompoundUser) o;
    return (this.pkiUserID == null ? activesessionResponseCompoundUser.pkiUserID == null : this.pkiUserID.equals(activesessionResponseCompoundUser.pkiUserID)) &&
        (this.fkiTimezoneID == null ? activesessionResponseCompoundUser.fkiTimezoneID == null : this.fkiTimezoneID.equals(activesessionResponseCompoundUser.fkiTimezoneID)) &&
        (this.sAvatarUrl == null ? activesessionResponseCompoundUser.sAvatarUrl == null : this.sAvatarUrl.equals(activesessionResponseCompoundUser.sAvatarUrl)) &&
        (this.sUserFirstname == null ? activesessionResponseCompoundUser.sUserFirstname == null : this.sUserFirstname.equals(activesessionResponseCompoundUser.sUserFirstname)) &&
        (this.sUserLastname == null ? activesessionResponseCompoundUser.sUserLastname == null : this.sUserLastname.equals(activesessionResponseCompoundUser.sUserLastname)) &&
        (this.sEmailAddress == null ? activesessionResponseCompoundUser.sEmailAddress == null : this.sEmailAddress.equals(activesessionResponseCompoundUser.sEmailAddress)) &&
        (this.eUserEzsignsendreminderfrequency == null ? activesessionResponseCompoundUser.eUserEzsignsendreminderfrequency == null : this.eUserEzsignsendreminderfrequency.equals(activesessionResponseCompoundUser.eUserEzsignsendreminderfrequency)) &&
        (this.iUserInterfacecolor == null ? activesessionResponseCompoundUser.iUserInterfacecolor == null : this.iUserInterfacecolor.equals(activesessionResponseCompoundUser.iUserInterfacecolor)) &&
        (this.bUserInterfacedark == null ? activesessionResponseCompoundUser.bUserInterfacedark == null : this.bUserInterfacedark.equals(activesessionResponseCompoundUser.bUserInterfacedark)) &&
        (this.iUserListresult == null ? activesessionResponseCompoundUser.iUserListresult == null : this.iUserListresult.equals(activesessionResponseCompoundUser.iUserListresult));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiUserID == null ? 0: this.pkiUserID.hashCode());
    result = 31 * result + (this.fkiTimezoneID == null ? 0: this.fkiTimezoneID.hashCode());
    result = 31 * result + (this.sAvatarUrl == null ? 0: this.sAvatarUrl.hashCode());
    result = 31 * result + (this.sUserFirstname == null ? 0: this.sUserFirstname.hashCode());
    result = 31 * result + (this.sUserLastname == null ? 0: this.sUserLastname.hashCode());
    result = 31 * result + (this.sEmailAddress == null ? 0: this.sEmailAddress.hashCode());
    result = 31 * result + (this.eUserEzsignsendreminderfrequency == null ? 0: this.eUserEzsignsendreminderfrequency.hashCode());
    result = 31 * result + (this.iUserInterfacecolor == null ? 0: this.iUserInterfacecolor.hashCode());
    result = 31 * result + (this.bUserInterfacedark == null ? 0: this.bUserInterfacedark.hashCode());
    result = 31 * result + (this.iUserListresult == null ? 0: this.iUserListresult.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivesessionResponseCompoundUser {\n");
    
    sb.append("  pkiUserID: ").append(pkiUserID).append("\n");
    sb.append("  fkiTimezoneID: ").append(fkiTimezoneID).append("\n");
    sb.append("  sAvatarUrl: ").append(sAvatarUrl).append("\n");
    sb.append("  sUserFirstname: ").append(sUserFirstname).append("\n");
    sb.append("  sUserLastname: ").append(sUserLastname).append("\n");
    sb.append("  sEmailAddress: ").append(sEmailAddress).append("\n");
    sb.append("  eUserEzsignsendreminderfrequency: ").append(eUserEzsignsendreminderfrequency).append("\n");
    sb.append("  iUserInterfacecolor: ").append(iUserInterfacecolor).append("\n");
    sb.append("  bUserInterfacedark: ").append(bUserInterfacedark).append("\n");
    sb.append("  iUserListresult: ").append(iUserListresult).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
