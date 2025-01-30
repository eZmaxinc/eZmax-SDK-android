/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
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
 * A Ezsignfoldersignerassociation-&gt;User Object and children to create a complete structure
 **/
@ApiModel(description = "A Ezsignfoldersignerassociation->User Object and children to create a complete structure")
public class EzsignfoldersignerassociationResponseCompoundUser {
  
  @SerializedName("pkiUserID")
  private Integer pkiUserID = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("sUserFirstname")
  private String sUserFirstname = null;
  @SerializedName("sUserLastname")
  private String sUserLastname = null;
  @SerializedName("sEmailAddress")
  private String sEmailAddress = null;

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
  @ApiModelProperty(required = true, value = "The email address.")
  public String getSEmailAddress() {
    return sEmailAddress;
  }
  public void setSEmailAddress(String sEmailAddress) {
    this.sEmailAddress = sEmailAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfoldersignerassociationResponseCompoundUser ezsignfoldersignerassociationResponseCompoundUser = (EzsignfoldersignerassociationResponseCompoundUser) o;
    return (this.pkiUserID == null ? ezsignfoldersignerassociationResponseCompoundUser.pkiUserID == null : this.pkiUserID.equals(ezsignfoldersignerassociationResponseCompoundUser.pkiUserID)) &&
        (this.fkiLanguageID == null ? ezsignfoldersignerassociationResponseCompoundUser.fkiLanguageID == null : this.fkiLanguageID.equals(ezsignfoldersignerassociationResponseCompoundUser.fkiLanguageID)) &&
        (this.sUserFirstname == null ? ezsignfoldersignerassociationResponseCompoundUser.sUserFirstname == null : this.sUserFirstname.equals(ezsignfoldersignerassociationResponseCompoundUser.sUserFirstname)) &&
        (this.sUserLastname == null ? ezsignfoldersignerassociationResponseCompoundUser.sUserLastname == null : this.sUserLastname.equals(ezsignfoldersignerassociationResponseCompoundUser.sUserLastname)) &&
        (this.sEmailAddress == null ? ezsignfoldersignerassociationResponseCompoundUser.sEmailAddress == null : this.sEmailAddress.equals(ezsignfoldersignerassociationResponseCompoundUser.sEmailAddress));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiUserID == null ? 0: this.pkiUserID.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.sUserFirstname == null ? 0: this.sUserFirstname.hashCode());
    result = 31 * result + (this.sUserLastname == null ? 0: this.sUserLastname.hashCode());
    result = 31 * result + (this.sEmailAddress == null ? 0: this.sEmailAddress.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldersignerassociationResponseCompoundUser {\n");
    
    sb.append("  pkiUserID: ").append(pkiUserID).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  sUserFirstname: ").append(sUserFirstname).append("\n");
    sb.append("  sUserLastname: ").append(sUserLastname).append("\n");
    sb.append("  sEmailAddress: ").append(sEmailAddress).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
