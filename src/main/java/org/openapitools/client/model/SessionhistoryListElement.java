/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.1
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.FieldESessionhistoryEndby;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Sessionhistory List Element
 **/
@ApiModel(description = "A Sessionhistory List Element")
public class SessionhistoryListElement {
  
  @SerializedName("pkiSessionhistoryID")
  private Integer pkiSessionhistoryID = null;
  @SerializedName("fkiComputerID")
  private Integer fkiComputerID = null;
  @SerializedName("fkiUserID")
  private Integer fkiUserID = null;
  @SerializedName("dtSessionhistoryFirsthit")
  private String dtSessionhistoryFirsthit = null;
  @SerializedName("dtSessionhistoryLasthit")
  private String dtSessionhistoryLasthit = null;
  @SerializedName("eSessionhistoryEndby")
  private FieldESessionhistoryEndby eSessionhistoryEndby = null;
  @SerializedName("sComputerDescription")
  private String sComputerDescription = null;
  @SerializedName("sSessionhistoryDuration")
  private String sSessionhistoryDuration = null;
  @SerializedName("sSessionhistoryIP")
  private String sSessionhistoryIP = null;
  @SerializedName("sUserLoginname")
  private String sUserLoginname = null;

  /**
   * The unique ID of the Sessionhistory
   * minimum: 1
   * maximum: 2147483647
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Sessionhistory")
  public Integer getPkiSessionhistoryID() {
    return pkiSessionhistoryID;
  }
  public void setPkiSessionhistoryID(Integer pkiSessionhistoryID) {
    this.pkiSessionhistoryID = pkiSessionhistoryID;
  }

  /**
   * The unique ID of the Computer
   * minimum: 1
   * maximum: 65535
   **/
  @ApiModelProperty(value = "The unique ID of the Computer")
  public Integer getFkiComputerID() {
    return fkiComputerID;
  }
  public void setFkiComputerID(Integer fkiComputerID) {
    this.fkiComputerID = fkiComputerID;
  }

  /**
   * The unique ID of the User
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the User")
  public Integer getFkiUserID() {
    return fkiUserID;
  }
  public void setFkiUserID(Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
  }

  /**
   * The first hit of the Sessionhistory
   **/
  @ApiModelProperty(required = true, value = "The first hit of the Sessionhistory")
  public String getDtSessionhistoryFirsthit() {
    return dtSessionhistoryFirsthit;
  }
  public void setDtSessionhistoryFirsthit(String dtSessionhistoryFirsthit) {
    this.dtSessionhistoryFirsthit = dtSessionhistoryFirsthit;
  }

  /**
   * The last hit of the Sessionhistory
   **/
  @ApiModelProperty(required = true, value = "The last hit of the Sessionhistory")
  public String getDtSessionhistoryLasthit() {
    return dtSessionhistoryLasthit;
  }
  public void setDtSessionhistoryLasthit(String dtSessionhistoryLasthit) {
    this.dtSessionhistoryLasthit = dtSessionhistoryLasthit;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldESessionhistoryEndby getESessionhistoryEndby() {
    return eSessionhistoryEndby;
  }
  public void setESessionhistoryEndby(FieldESessionhistoryEndby eSessionhistoryEndby) {
    this.eSessionhistoryEndby = eSessionhistoryEndby;
  }

  /**
   * The description of the Computer
   **/
  @ApiModelProperty(value = "The description of the Computer")
  public String getSComputerDescription() {
    return sComputerDescription;
  }
  public void setSComputerDescription(String sComputerDescription) {
    this.sComputerDescription = sComputerDescription;
  }

  /**
   * The duration of the session
   **/
  @ApiModelProperty(required = true, value = "The duration of the session")
  public String getSSessionhistoryDuration() {
    return sSessionhistoryDuration;
  }
  public void setSSessionhistoryDuration(String sSessionhistoryDuration) {
    this.sSessionhistoryDuration = sSessionhistoryDuration;
  }

  /**
   * Represent an IP address.
   **/
  @ApiModelProperty(required = true, value = "Represent an IP address.")
  public String getSSessionhistoryIP() {
    return sSessionhistoryIP;
  }
  public void setSSessionhistoryIP(String sSessionhistoryIP) {
    this.sSessionhistoryIP = sSessionhistoryIP;
  }

  /**
   * The login name of the User.
   **/
  @ApiModelProperty(value = "The login name of the User.")
  public String getSUserLoginname() {
    return sUserLoginname;
  }
  public void setSUserLoginname(String sUserLoginname) {
    this.sUserLoginname = sUserLoginname;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionhistoryListElement sessionhistoryListElement = (SessionhistoryListElement) o;
    return (this.pkiSessionhistoryID == null ? sessionhistoryListElement.pkiSessionhistoryID == null : this.pkiSessionhistoryID.equals(sessionhistoryListElement.pkiSessionhistoryID)) &&
        (this.fkiComputerID == null ? sessionhistoryListElement.fkiComputerID == null : this.fkiComputerID.equals(sessionhistoryListElement.fkiComputerID)) &&
        (this.fkiUserID == null ? sessionhistoryListElement.fkiUserID == null : this.fkiUserID.equals(sessionhistoryListElement.fkiUserID)) &&
        (this.dtSessionhistoryFirsthit == null ? sessionhistoryListElement.dtSessionhistoryFirsthit == null : this.dtSessionhistoryFirsthit.equals(sessionhistoryListElement.dtSessionhistoryFirsthit)) &&
        (this.dtSessionhistoryLasthit == null ? sessionhistoryListElement.dtSessionhistoryLasthit == null : this.dtSessionhistoryLasthit.equals(sessionhistoryListElement.dtSessionhistoryLasthit)) &&
        (this.eSessionhistoryEndby == null ? sessionhistoryListElement.eSessionhistoryEndby == null : this.eSessionhistoryEndby.equals(sessionhistoryListElement.eSessionhistoryEndby)) &&
        (this.sComputerDescription == null ? sessionhistoryListElement.sComputerDescription == null : this.sComputerDescription.equals(sessionhistoryListElement.sComputerDescription)) &&
        (this.sSessionhistoryDuration == null ? sessionhistoryListElement.sSessionhistoryDuration == null : this.sSessionhistoryDuration.equals(sessionhistoryListElement.sSessionhistoryDuration)) &&
        (this.sSessionhistoryIP == null ? sessionhistoryListElement.sSessionhistoryIP == null : this.sSessionhistoryIP.equals(sessionhistoryListElement.sSessionhistoryIP)) &&
        (this.sUserLoginname == null ? sessionhistoryListElement.sUserLoginname == null : this.sUserLoginname.equals(sessionhistoryListElement.sUserLoginname));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiSessionhistoryID == null ? 0: this.pkiSessionhistoryID.hashCode());
    result = 31 * result + (this.fkiComputerID == null ? 0: this.fkiComputerID.hashCode());
    result = 31 * result + (this.fkiUserID == null ? 0: this.fkiUserID.hashCode());
    result = 31 * result + (this.dtSessionhistoryFirsthit == null ? 0: this.dtSessionhistoryFirsthit.hashCode());
    result = 31 * result + (this.dtSessionhistoryLasthit == null ? 0: this.dtSessionhistoryLasthit.hashCode());
    result = 31 * result + (this.eSessionhistoryEndby == null ? 0: this.eSessionhistoryEndby.hashCode());
    result = 31 * result + (this.sComputerDescription == null ? 0: this.sComputerDescription.hashCode());
    result = 31 * result + (this.sSessionhistoryDuration == null ? 0: this.sSessionhistoryDuration.hashCode());
    result = 31 * result + (this.sSessionhistoryIP == null ? 0: this.sSessionhistoryIP.hashCode());
    result = 31 * result + (this.sUserLoginname == null ? 0: this.sUserLoginname.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionhistoryListElement {\n");
    
    sb.append("  pkiSessionhistoryID: ").append(pkiSessionhistoryID).append("\n");
    sb.append("  fkiComputerID: ").append(fkiComputerID).append("\n");
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("  dtSessionhistoryFirsthit: ").append(dtSessionhistoryFirsthit).append("\n");
    sb.append("  dtSessionhistoryLasthit: ").append(dtSessionhistoryLasthit).append("\n");
    sb.append("  eSessionhistoryEndby: ").append(eSessionhistoryEndby).append("\n");
    sb.append("  sComputerDescription: ").append(sComputerDescription).append("\n");
    sb.append("  sSessionhistoryDuration: ").append(sSessionhistoryDuration).append("\n");
    sb.append("  sSessionhistoryIP: ").append(sSessionhistoryIP).append("\n");
    sb.append("  sUserLoginname: ").append(sUserLoginname).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
