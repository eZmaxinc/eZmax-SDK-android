/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.6
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.ActivesessionResponseCompound;
import org.openapitools.client.model.ActivesessionResponseCompoundApikey;
import org.openapitools.client.model.ActivesessionResponseCompoundUser;
import org.openapitools.client.model.FieldEActivesessionSessiontype;
import org.openapitools.client.model.FieldEActivesessionWeekdaystart;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for the /1/object/activesession/getCurrent API Request
 **/
@ApiModel(description = "Payload for the /1/object/activesession/getCurrent API Request")
public class ActivesessionGetCurrentV1ResponseMPayload {
  
  @SerializedName("eActivesessionSessiontype")
  private FieldEActivesessionSessiontype eActivesessionSessiontype = null;
  @SerializedName("eActivesessionWeekdaystart")
  private FieldEActivesessionWeekdaystart eActivesessionWeekdaystart = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("sCompanyNameX")
  private String sCompanyNameX = null;
  @SerializedName("sDepartmentNameX")
  private String sDepartmentNameX = null;
  @SerializedName("bActivesessionDebug")
  private Boolean bActivesessionDebug = null;
  @SerializedName("pksCustomerCode")
  private String pksCustomerCode = null;
  @SerializedName("a_pkiPermissionID")
  private List<Integer> aPkiPermissionID = null;
  @SerializedName("objUserReal")
  private ActivesessionResponseCompoundUser objUserReal = null;
  @SerializedName("objUserCloned")
  private ActivesessionResponseCompoundUser objUserCloned = null;
  @SerializedName("objApikey")
  private ActivesessionResponseCompoundApikey objApikey = null;
  @SerializedName("a_eModuleInternalname")
  private List<String> aEModuleInternalname = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEActivesessionSessiontype getEActivesessionSessiontype() {
    return eActivesessionSessiontype;
  }
  public void setEActivesessionSessiontype(FieldEActivesessionSessiontype eActivesessionSessiontype) {
    this.eActivesessionSessiontype = eActivesessionSessiontype;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEActivesessionWeekdaystart getEActivesessionWeekdaystart() {
    return eActivesessionWeekdaystart;
  }
  public void setEActivesessionWeekdaystart(FieldEActivesessionWeekdaystart eActivesessionWeekdaystart) {
    this.eActivesessionWeekdaystart = eActivesessionWeekdaystart;
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
   * The Name of the Company in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The Name of the Company in the language of the requester")
  public String getSCompanyNameX() {
    return sCompanyNameX;
  }
  public void setSCompanyNameX(String sCompanyNameX) {
    this.sCompanyNameX = sCompanyNameX;
  }

  /**
   * The Name of the Department in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The Name of the Department in the language of the requester")
  public String getSDepartmentNameX() {
    return sDepartmentNameX;
  }
  public void setSDepartmentNameX(String sDepartmentNameX) {
    this.sDepartmentNameX = sDepartmentNameX;
  }

  /**
   * Whether the active session is in debug or not
   **/
  @ApiModelProperty(required = true, value = "Whether the active session is in debug or not")
  public Boolean getBActivesessionDebug() {
    return bActivesessionDebug;
  }
  public void setBActivesessionDebug(Boolean bActivesessionDebug) {
    this.bActivesessionDebug = bActivesessionDebug;
  }

  /**
   * The customer code assigned to your account
   **/
  @ApiModelProperty(required = true, value = "The customer code assigned to your account")
  public String getPksCustomerCode() {
    return pksCustomerCode;
  }
  public void setPksCustomerCode(String pksCustomerCode) {
    this.pksCustomerCode = pksCustomerCode;
  }

  /**
   * An array of permissions granted to the user or api key
   **/
  @ApiModelProperty(required = true, value = "An array of permissions granted to the user or api key")
  public List<Integer> getAPkiPermissionID() {
    return aPkiPermissionID;
  }
  public void setAPkiPermissionID(List<Integer> aPkiPermissionID) {
    this.aPkiPermissionID = aPkiPermissionID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ActivesessionResponseCompoundUser getObjUserReal() {
    return objUserReal;
  }
  public void setObjUserReal(ActivesessionResponseCompoundUser objUserReal) {
    this.objUserReal = objUserReal;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ActivesessionResponseCompoundUser getObjUserCloned() {
    return objUserCloned;
  }
  public void setObjUserCloned(ActivesessionResponseCompoundUser objUserCloned) {
    this.objUserCloned = objUserCloned;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ActivesessionResponseCompoundApikey getObjApikey() {
    return objApikey;
  }
  public void setObjApikey(ActivesessionResponseCompoundApikey objApikey) {
    this.objApikey = objApikey;
  }

  /**
   * An Array of Registered modules.  These are the modules that are Licensed to be used by the User or the API Key.
   **/
  @ApiModelProperty(required = true, value = "An Array of Registered modules.  These are the modules that are Licensed to be used by the User or the API Key.")
  public List<String> getAEModuleInternalname() {
    return aEModuleInternalname;
  }
  public void setAEModuleInternalname(List<String> aEModuleInternalname) {
    this.aEModuleInternalname = aEModuleInternalname;
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
    return (this.eActivesessionSessiontype == null ? activesessionGetCurrentV1ResponseMPayload.eActivesessionSessiontype == null : this.eActivesessionSessiontype.equals(activesessionGetCurrentV1ResponseMPayload.eActivesessionSessiontype)) &&
        (this.eActivesessionWeekdaystart == null ? activesessionGetCurrentV1ResponseMPayload.eActivesessionWeekdaystart == null : this.eActivesessionWeekdaystart.equals(activesessionGetCurrentV1ResponseMPayload.eActivesessionWeekdaystart)) &&
        (this.fkiLanguageID == null ? activesessionGetCurrentV1ResponseMPayload.fkiLanguageID == null : this.fkiLanguageID.equals(activesessionGetCurrentV1ResponseMPayload.fkiLanguageID)) &&
        (this.sCompanyNameX == null ? activesessionGetCurrentV1ResponseMPayload.sCompanyNameX == null : this.sCompanyNameX.equals(activesessionGetCurrentV1ResponseMPayload.sCompanyNameX)) &&
        (this.sDepartmentNameX == null ? activesessionGetCurrentV1ResponseMPayload.sDepartmentNameX == null : this.sDepartmentNameX.equals(activesessionGetCurrentV1ResponseMPayload.sDepartmentNameX)) &&
        (this.bActivesessionDebug == null ? activesessionGetCurrentV1ResponseMPayload.bActivesessionDebug == null : this.bActivesessionDebug.equals(activesessionGetCurrentV1ResponseMPayload.bActivesessionDebug)) &&
        (this.pksCustomerCode == null ? activesessionGetCurrentV1ResponseMPayload.pksCustomerCode == null : this.pksCustomerCode.equals(activesessionGetCurrentV1ResponseMPayload.pksCustomerCode)) &&
        (this.aPkiPermissionID == null ? activesessionGetCurrentV1ResponseMPayload.aPkiPermissionID == null : this.aPkiPermissionID.equals(activesessionGetCurrentV1ResponseMPayload.aPkiPermissionID)) &&
        (this.objUserReal == null ? activesessionGetCurrentV1ResponseMPayload.objUserReal == null : this.objUserReal.equals(activesessionGetCurrentV1ResponseMPayload.objUserReal)) &&
        (this.objUserCloned == null ? activesessionGetCurrentV1ResponseMPayload.objUserCloned == null : this.objUserCloned.equals(activesessionGetCurrentV1ResponseMPayload.objUserCloned)) &&
        (this.objApikey == null ? activesessionGetCurrentV1ResponseMPayload.objApikey == null : this.objApikey.equals(activesessionGetCurrentV1ResponseMPayload.objApikey)) &&
        (this.aEModuleInternalname == null ? activesessionGetCurrentV1ResponseMPayload.aEModuleInternalname == null : this.aEModuleInternalname.equals(activesessionGetCurrentV1ResponseMPayload.aEModuleInternalname));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.eActivesessionSessiontype == null ? 0: this.eActivesessionSessiontype.hashCode());
    result = 31 * result + (this.eActivesessionWeekdaystart == null ? 0: this.eActivesessionWeekdaystart.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.sCompanyNameX == null ? 0: this.sCompanyNameX.hashCode());
    result = 31 * result + (this.sDepartmentNameX == null ? 0: this.sDepartmentNameX.hashCode());
    result = 31 * result + (this.bActivesessionDebug == null ? 0: this.bActivesessionDebug.hashCode());
    result = 31 * result + (this.pksCustomerCode == null ? 0: this.pksCustomerCode.hashCode());
    result = 31 * result + (this.aPkiPermissionID == null ? 0: this.aPkiPermissionID.hashCode());
    result = 31 * result + (this.objUserReal == null ? 0: this.objUserReal.hashCode());
    result = 31 * result + (this.objUserCloned == null ? 0: this.objUserCloned.hashCode());
    result = 31 * result + (this.objApikey == null ? 0: this.objApikey.hashCode());
    result = 31 * result + (this.aEModuleInternalname == null ? 0: this.aEModuleInternalname.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivesessionGetCurrentV1ResponseMPayload {\n");
    
    sb.append("  eActivesessionSessiontype: ").append(eActivesessionSessiontype).append("\n");
    sb.append("  eActivesessionWeekdaystart: ").append(eActivesessionWeekdaystart).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  sCompanyNameX: ").append(sCompanyNameX).append("\n");
    sb.append("  sDepartmentNameX: ").append(sDepartmentNameX).append("\n");
    sb.append("  bActivesessionDebug: ").append(bActivesessionDebug).append("\n");
    sb.append("  pksCustomerCode: ").append(pksCustomerCode).append("\n");
    sb.append("  aPkiPermissionID: ").append(aPkiPermissionID).append("\n");
    sb.append("  objUserReal: ").append(objUserReal).append("\n");
    sb.append("  objUserCloned: ").append(objUserCloned).append("\n");
    sb.append("  objApikey: ").append(objApikey).append("\n");
    sb.append("  aEModuleInternalname: ").append(aEModuleInternalname).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
