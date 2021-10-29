/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.3
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for the /1/object/activesession/getCurrent API Request
 **/
@ApiModel(description = "Payload for the /1/object/activesession/getCurrent API Request")
public class ActivesessionGetCurrentV1ResponseMPayload {
  
  @SerializedName("sCustomerCode")
  private String sCustomerCode = null;
  public enum EActivesessionSessiontypeEnum {
     Normal, 
  };
  @SerializedName("eActivesessionSessiontype")
  private EActivesessionSessiontypeEnum eActivesessionSessiontype = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("sCompanyNameX")
  private String sCompanyNameX = null;
  @SerializedName("sDepartmentNameX")
  private String sDepartmentNameX = null;
  @SerializedName("a_RegisteredModules")
  private List<String> aRegisteredModules = null;
  @SerializedName("a_Permissions")
  private List<Integer> aPermissions = null;
  @SerializedName("fkiUserID")
  private Integer fkiUserID = null;
  @SerializedName("fkiApikeyID")
  private Integer fkiApikeyID = null;

  /**
   * The customer code specific to the client in which the API request is being made
   **/
  @ApiModelProperty(required = true, value = "The customer code specific to the client in which the API request is being made")
  public String getSCustomerCode() {
    return sCustomerCode;
  }
  public void setSCustomerCode(String sCustomerCode) {
    this.sCustomerCode = sCustomerCode;
  }

  /**
   * The type of session used for the API request call
   **/
  @ApiModelProperty(required = true, value = "The type of session used for the API request call")
  public EActivesessionSessiontypeEnum getEActivesessionSessiontype() {
    return eActivesessionSessiontype;
  }
  public void setEActivesessionSessiontype(EActivesessionSessiontypeEnum eActivesessionSessiontype) {
    this.eActivesessionSessiontype = eActivesessionSessiontype;
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
   * The name of the active Company in the current language
   **/
  @ApiModelProperty(required = true, value = "The name of the active Company in the current language")
  public String getSCompanyNameX() {
    return sCompanyNameX;
  }
  public void setSCompanyNameX(String sCompanyNameX) {
    this.sCompanyNameX = sCompanyNameX;
  }

  /**
   * The name of the active Department in the current language
   **/
  @ApiModelProperty(required = true, value = "The name of the active Department in the current language")
  public String getSDepartmentNameX() {
    return sDepartmentNameX;
  }
  public void setSDepartmentNameX(String sDepartmentNameX) {
    this.sDepartmentNameX = sDepartmentNameX;
  }

  /**
   * An Array of Registered modules.  These are the modules that are Licensed to be used by the User or the API Key.
   **/
  @ApiModelProperty(required = true, value = "An Array of Registered modules.  These are the modules that are Licensed to be used by the User or the API Key.")
  public List<String> getARegisteredModules() {
    return aRegisteredModules;
  }
  public void setARegisteredModules(List<String> aRegisteredModules) {
    this.aRegisteredModules = aRegisteredModules;
  }

  /**
   * An array of permissions granted to the user or api key
   **/
  @ApiModelProperty(required = true, value = "An array of permissions granted to the user or api key")
  public List<Integer> getAPermissions() {
    return aPermissions;
  }
  public void setAPermissions(List<Integer> aPermissions) {
    this.aPermissions = aPermissions;
  }

  /**
   * The unique ID of the User
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the User")
  public Integer getFkiUserID() {
    return fkiUserID;
  }
  public void setFkiUserID(Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
  }

  /**
   * The unique ID of the Apikey
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Apikey")
  public Integer getFkiApikeyID() {
    return fkiApikeyID;
  }
  public void setFkiApikeyID(Integer fkiApikeyID) {
    this.fkiApikeyID = fkiApikeyID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivesessionGetCurrentV1ResponseMPayload activesessionGetCurrentV1ResponseMPayload = (ActivesessionGetCurrentV1ResponseMPayload) o;
    return (this.sCustomerCode == null ? activesessionGetCurrentV1ResponseMPayload.sCustomerCode == null : this.sCustomerCode.equals(activesessionGetCurrentV1ResponseMPayload.sCustomerCode)) &&
        (this.eActivesessionSessiontype == null ? activesessionGetCurrentV1ResponseMPayload.eActivesessionSessiontype == null : this.eActivesessionSessiontype.equals(activesessionGetCurrentV1ResponseMPayload.eActivesessionSessiontype)) &&
        (this.fkiLanguageID == null ? activesessionGetCurrentV1ResponseMPayload.fkiLanguageID == null : this.fkiLanguageID.equals(activesessionGetCurrentV1ResponseMPayload.fkiLanguageID)) &&
        (this.sCompanyNameX == null ? activesessionGetCurrentV1ResponseMPayload.sCompanyNameX == null : this.sCompanyNameX.equals(activesessionGetCurrentV1ResponseMPayload.sCompanyNameX)) &&
        (this.sDepartmentNameX == null ? activesessionGetCurrentV1ResponseMPayload.sDepartmentNameX == null : this.sDepartmentNameX.equals(activesessionGetCurrentV1ResponseMPayload.sDepartmentNameX)) &&
        (this.aRegisteredModules == null ? activesessionGetCurrentV1ResponseMPayload.aRegisteredModules == null : this.aRegisteredModules.equals(activesessionGetCurrentV1ResponseMPayload.aRegisteredModules)) &&
        (this.aPermissions == null ? activesessionGetCurrentV1ResponseMPayload.aPermissions == null : this.aPermissions.equals(activesessionGetCurrentV1ResponseMPayload.aPermissions)) &&
        (this.fkiUserID == null ? activesessionGetCurrentV1ResponseMPayload.fkiUserID == null : this.fkiUserID.equals(activesessionGetCurrentV1ResponseMPayload.fkiUserID)) &&
        (this.fkiApikeyID == null ? activesessionGetCurrentV1ResponseMPayload.fkiApikeyID == null : this.fkiApikeyID.equals(activesessionGetCurrentV1ResponseMPayload.fkiApikeyID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sCustomerCode == null ? 0: this.sCustomerCode.hashCode());
    result = 31 * result + (this.eActivesessionSessiontype == null ? 0: this.eActivesessionSessiontype.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.sCompanyNameX == null ? 0: this.sCompanyNameX.hashCode());
    result = 31 * result + (this.sDepartmentNameX == null ? 0: this.sDepartmentNameX.hashCode());
    result = 31 * result + (this.aRegisteredModules == null ? 0: this.aRegisteredModules.hashCode());
    result = 31 * result + (this.aPermissions == null ? 0: this.aPermissions.hashCode());
    result = 31 * result + (this.fkiUserID == null ? 0: this.fkiUserID.hashCode());
    result = 31 * result + (this.fkiApikeyID == null ? 0: this.fkiApikeyID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivesessionGetCurrentV1ResponseMPayload {\n");
    
    sb.append("  sCustomerCode: ").append(sCustomerCode).append("\n");
    sb.append("  eActivesessionSessiontype: ").append(eActivesessionSessiontype).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  sCompanyNameX: ").append(sCompanyNameX).append("\n");
    sb.append("  sDepartmentNameX: ").append(sDepartmentNameX).append("\n");
    sb.append("  aRegisteredModules: ").append(aRegisteredModules).append("\n");
    sb.append("  aPermissions: ").append(aPermissions).append("\n");
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("  fkiApikeyID: ").append(fkiApikeyID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
