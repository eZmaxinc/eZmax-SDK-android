/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
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
 * A User Object
 **/
@ApiModel(description = "A User Object")
public class CustomUserResponse {
  
  @SerializedName("pkiUserID")
  private Integer pkiUserID = null;
  @SerializedName("sUserLastname")
  private String sUserLastname = null;
  @SerializedName("sUserFirstname")
  private String sUserFirstname = null;
  @SerializedName("sEmailAddress")
  private String sEmailAddress = null;

  /**
   * The unique ID of the User
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the User")
  public Integer getPkiUserID() {
    return pkiUserID;
  }
  public void setPkiUserID(Integer pkiUserID) {
    this.pkiUserID = pkiUserID;
  }

  /**
   * The Last name of the user
   **/
  @ApiModelProperty(required = true, value = "The Last name of the user")
  public String getSUserLastname() {
    return sUserLastname;
  }
  public void setSUserLastname(String sUserLastname) {
    this.sUserLastname = sUserLastname;
  }

  /**
   * The First name of the user
   **/
  @ApiModelProperty(required = true, value = "The First name of the user")
  public String getSUserFirstname() {
    return sUserFirstname;
  }
  public void setSUserFirstname(String sUserFirstname) {
    this.sUserFirstname = sUserFirstname;
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
    CustomUserResponse customUserResponse = (CustomUserResponse) o;
    return (this.pkiUserID == null ? customUserResponse.pkiUserID == null : this.pkiUserID.equals(customUserResponse.pkiUserID)) &&
        (this.sUserLastname == null ? customUserResponse.sUserLastname == null : this.sUserLastname.equals(customUserResponse.sUserLastname)) &&
        (this.sUserFirstname == null ? customUserResponse.sUserFirstname == null : this.sUserFirstname.equals(customUserResponse.sUserFirstname)) &&
        (this.sEmailAddress == null ? customUserResponse.sEmailAddress == null : this.sEmailAddress.equals(customUserResponse.sEmailAddress));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiUserID == null ? 0: this.pkiUserID.hashCode());
    result = 31 * result + (this.sUserLastname == null ? 0: this.sUserLastname.hashCode());
    result = 31 * result + (this.sUserFirstname == null ? 0: this.sUserFirstname.hashCode());
    result = 31 * result + (this.sEmailAddress == null ? 0: this.sEmailAddress.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomUserResponse {\n");
    
    sb.append("  pkiUserID: ").append(pkiUserID).append("\n");
    sb.append("  sUserLastname: ").append(sUserLastname).append("\n");
    sb.append("  sUserFirstname: ").append(sUserFirstname).append("\n");
    sb.append("  sEmailAddress: ").append(sEmailAddress).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
