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

import org.openapitools.client.model.FieldEUserType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A User AutocompleteElement Response
 **/
@ApiModel(description = "A User AutocompleteElement Response")
public class UserAutocompleteElementResponse {
  
  @SerializedName("eUserType")
  private FieldEUserType eUserType = null;
  @SerializedName("sUserName")
  private String sUserName = null;
  @SerializedName("pkiUserID")
  private Integer pkiUserID = null;
  @SerializedName("bUserIsactive")
  private Boolean bUserIsactive = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEUserType getEUserType() {
    return eUserType;
  }
  public void setEUserType(FieldEUserType eUserType) {
    this.eUserType = eUserType;
  }

  /**
   * The description of the User in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The description of the User in the language of the requester")
  public String getSUserName() {
    return sUserName;
  }
  public void setSUserName(String sUserName) {
    this.sUserName = sUserName;
  }

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
   * Whether the User is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the User is active or not")
  public Boolean getBUserIsactive() {
    return bUserIsactive;
  }
  public void setBUserIsactive(Boolean bUserIsactive) {
    this.bUserIsactive = bUserIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAutocompleteElementResponse userAutocompleteElementResponse = (UserAutocompleteElementResponse) o;
    return (this.eUserType == null ? userAutocompleteElementResponse.eUserType == null : this.eUserType.equals(userAutocompleteElementResponse.eUserType)) &&
        (this.sUserName == null ? userAutocompleteElementResponse.sUserName == null : this.sUserName.equals(userAutocompleteElementResponse.sUserName)) &&
        (this.pkiUserID == null ? userAutocompleteElementResponse.pkiUserID == null : this.pkiUserID.equals(userAutocompleteElementResponse.pkiUserID)) &&
        (this.bUserIsactive == null ? userAutocompleteElementResponse.bUserIsactive == null : this.bUserIsactive.equals(userAutocompleteElementResponse.bUserIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.eUserType == null ? 0: this.eUserType.hashCode());
    result = 31 * result + (this.sUserName == null ? 0: this.sUserName.hashCode());
    result = 31 * result + (this.pkiUserID == null ? 0: this.pkiUserID.hashCode());
    result = 31 * result + (this.bUserIsactive == null ? 0: this.bUserIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAutocompleteElementResponse {\n");
    
    sb.append("  eUserType: ").append(eUserType).append("\n");
    sb.append("  sUserName: ").append(sUserName).append("\n");
    sb.append("  pkiUserID: ").append(pkiUserID).append("\n");
    sb.append("  bUserIsactive: ").append(bUserIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
