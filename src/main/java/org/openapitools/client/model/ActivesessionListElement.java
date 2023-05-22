/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
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
 * A Activesession List Element
 **/
@ApiModel(description = "A Activesession List Element")
public class ActivesessionListElement {
  
  @SerializedName("pkiActivesessionID")
  private Integer pkiActivesessionID = null;
  @SerializedName("fkiUserID")
  private Integer fkiUserID = null;
  @SerializedName("fkiComputerID")
  private Integer fkiComputerID = null;
  @SerializedName("fkiCompanyID")
  private Integer fkiCompanyID = null;
  @SerializedName("fkiDepartmentID")
  private Integer fkiDepartmentID = null;
  @SerializedName("sCompanyNameX")
  private String sCompanyNameX = null;
  @SerializedName("sDepartmentNameX")
  private String sDepartmentNameX = null;
  @SerializedName("sActivesessionLoginname")
  private String sActivesessionLoginname = null;
  @SerializedName("sComputerDescription")
  private String sComputerDescription = null;
  @SerializedName("dtActivesessionFirsthit")
  private String dtActivesessionFirsthit = null;
  @SerializedName("dtActivesessionLasthit")
  private String dtActivesessionLasthit = null;
  @SerializedName("sActivesessionIP")
  private String sActivesessionIP = null;

  /**
   * The unique ID of the Activesession
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Activesession")
  public Integer getPkiActivesessionID() {
    return pkiActivesessionID;
  }
  public void setPkiActivesessionID(Integer pkiActivesessionID) {
    this.pkiActivesessionID = pkiActivesessionID;
  }

  /**
   * The unique ID of the User
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the User")
  public Integer getFkiUserID() {
    return fkiUserID;
  }
  public void setFkiUserID(Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
  }

  /**
   * The unique ID of the Computer
   * minimum: 1
   * maximum: 65535
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Computer")
  public Integer getFkiComputerID() {
    return fkiComputerID;
  }
  public void setFkiComputerID(Integer fkiComputerID) {
    this.fkiComputerID = fkiComputerID;
  }

  /**
   * The unique ID of the Company
   * minimum: 1
   * maximum: 255
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Company")
  public Integer getFkiCompanyID() {
    return fkiCompanyID;
  }
  public void setFkiCompanyID(Integer fkiCompanyID) {
    this.fkiCompanyID = fkiCompanyID;
  }

  /**
   * The unique ID of the Department
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Department")
  public Integer getFkiDepartmentID() {
    return fkiDepartmentID;
  }
  public void setFkiDepartmentID(Integer fkiDepartmentID) {
    this.fkiDepartmentID = fkiDepartmentID;
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
   * The loginname of the Activesession
   **/
  @ApiModelProperty(required = true, value = "The loginname of the Activesession")
  public String getSActivesessionLoginname() {
    return sActivesessionLoginname;
  }
  public void setSActivesessionLoginname(String sActivesessionLoginname) {
    this.sActivesessionLoginname = sActivesessionLoginname;
  }

  /**
   * The description of the Computer
   **/
  @ApiModelProperty(required = true, value = "The description of the Computer")
  public String getSComputerDescription() {
    return sComputerDescription;
  }
  public void setSComputerDescription(String sComputerDescription) {
    this.sComputerDescription = sComputerDescription;
  }

  /**
   * The first hit of the Activesession
   **/
  @ApiModelProperty(required = true, value = "The first hit of the Activesession")
  public String getDtActivesessionFirsthit() {
    return dtActivesessionFirsthit;
  }
  public void setDtActivesessionFirsthit(String dtActivesessionFirsthit) {
    this.dtActivesessionFirsthit = dtActivesessionFirsthit;
  }

  /**
   * The last hit of the Activesession
   **/
  @ApiModelProperty(required = true, value = "The last hit of the Activesession")
  public String getDtActivesessionLasthit() {
    return dtActivesessionLasthit;
  }
  public void setDtActivesessionLasthit(String dtActivesessionLasthit) {
    this.dtActivesessionLasthit = dtActivesessionLasthit;
  }

  /**
   * Represent an IP address.
   **/
  @ApiModelProperty(required = true, value = "Represent an IP address.")
  public String getSActivesessionIP() {
    return sActivesessionIP;
  }
  public void setSActivesessionIP(String sActivesessionIP) {
    this.sActivesessionIP = sActivesessionIP;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivesessionListElement activesessionListElement = (ActivesessionListElement) o;
    return (this.pkiActivesessionID == null ? activesessionListElement.pkiActivesessionID == null : this.pkiActivesessionID.equals(activesessionListElement.pkiActivesessionID)) &&
        (this.fkiUserID == null ? activesessionListElement.fkiUserID == null : this.fkiUserID.equals(activesessionListElement.fkiUserID)) &&
        (this.fkiComputerID == null ? activesessionListElement.fkiComputerID == null : this.fkiComputerID.equals(activesessionListElement.fkiComputerID)) &&
        (this.fkiCompanyID == null ? activesessionListElement.fkiCompanyID == null : this.fkiCompanyID.equals(activesessionListElement.fkiCompanyID)) &&
        (this.fkiDepartmentID == null ? activesessionListElement.fkiDepartmentID == null : this.fkiDepartmentID.equals(activesessionListElement.fkiDepartmentID)) &&
        (this.sCompanyNameX == null ? activesessionListElement.sCompanyNameX == null : this.sCompanyNameX.equals(activesessionListElement.sCompanyNameX)) &&
        (this.sDepartmentNameX == null ? activesessionListElement.sDepartmentNameX == null : this.sDepartmentNameX.equals(activesessionListElement.sDepartmentNameX)) &&
        (this.sActivesessionLoginname == null ? activesessionListElement.sActivesessionLoginname == null : this.sActivesessionLoginname.equals(activesessionListElement.sActivesessionLoginname)) &&
        (this.sComputerDescription == null ? activesessionListElement.sComputerDescription == null : this.sComputerDescription.equals(activesessionListElement.sComputerDescription)) &&
        (this.dtActivesessionFirsthit == null ? activesessionListElement.dtActivesessionFirsthit == null : this.dtActivesessionFirsthit.equals(activesessionListElement.dtActivesessionFirsthit)) &&
        (this.dtActivesessionLasthit == null ? activesessionListElement.dtActivesessionLasthit == null : this.dtActivesessionLasthit.equals(activesessionListElement.dtActivesessionLasthit)) &&
        (this.sActivesessionIP == null ? activesessionListElement.sActivesessionIP == null : this.sActivesessionIP.equals(activesessionListElement.sActivesessionIP));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiActivesessionID == null ? 0: this.pkiActivesessionID.hashCode());
    result = 31 * result + (this.fkiUserID == null ? 0: this.fkiUserID.hashCode());
    result = 31 * result + (this.fkiComputerID == null ? 0: this.fkiComputerID.hashCode());
    result = 31 * result + (this.fkiCompanyID == null ? 0: this.fkiCompanyID.hashCode());
    result = 31 * result + (this.fkiDepartmentID == null ? 0: this.fkiDepartmentID.hashCode());
    result = 31 * result + (this.sCompanyNameX == null ? 0: this.sCompanyNameX.hashCode());
    result = 31 * result + (this.sDepartmentNameX == null ? 0: this.sDepartmentNameX.hashCode());
    result = 31 * result + (this.sActivesessionLoginname == null ? 0: this.sActivesessionLoginname.hashCode());
    result = 31 * result + (this.sComputerDescription == null ? 0: this.sComputerDescription.hashCode());
    result = 31 * result + (this.dtActivesessionFirsthit == null ? 0: this.dtActivesessionFirsthit.hashCode());
    result = 31 * result + (this.dtActivesessionLasthit == null ? 0: this.dtActivesessionLasthit.hashCode());
    result = 31 * result + (this.sActivesessionIP == null ? 0: this.sActivesessionIP.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivesessionListElement {\n");
    
    sb.append("  pkiActivesessionID: ").append(pkiActivesessionID).append("\n");
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("  fkiComputerID: ").append(fkiComputerID).append("\n");
    sb.append("  fkiCompanyID: ").append(fkiCompanyID).append("\n");
    sb.append("  fkiDepartmentID: ").append(fkiDepartmentID).append("\n");
    sb.append("  sCompanyNameX: ").append(sCompanyNameX).append("\n");
    sb.append("  sDepartmentNameX: ").append(sDepartmentNameX).append("\n");
    sb.append("  sActivesessionLoginname: ").append(sActivesessionLoginname).append("\n");
    sb.append("  sComputerDescription: ").append(sComputerDescription).append("\n");
    sb.append("  dtActivesessionFirsthit: ").append(dtActivesessionFirsthit).append("\n");
    sb.append("  dtActivesessionLasthit: ").append(dtActivesessionLasthit).append("\n");
    sb.append("  sActivesessionIP: ").append(sActivesessionIP).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}