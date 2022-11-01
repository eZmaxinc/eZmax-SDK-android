/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.FieldEEzsigndocumentlogType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsigndocumentlog Object
 **/
@ApiModel(description = "An Ezsigndocumentlog Object")
public class EzsigndocumentlogResponse {
  
  @SerializedName("fkiUserID")
  private Integer fkiUserID = null;
  @SerializedName("fkiEzsignsignerID")
  private Integer fkiEzsignsignerID = null;
  @SerializedName("dtEzsigndocumentlogDatetime")
  private String dtEzsigndocumentlogDatetime = null;
  @SerializedName("eEzsigndocumentlogType")
  private FieldEEzsigndocumentlogType eEzsigndocumentlogType = null;
  @SerializedName("sEzsigndocumentlogDetail")
  private String sEzsigndocumentlogDetail = null;
  @SerializedName("sEzsigndocumentlogLastname")
  private String sEzsigndocumentlogLastname = null;
  @SerializedName("sEzsigndocumentlogFirstname")
  private String sEzsigndocumentlogFirstname = null;
  @SerializedName("sEzsigndocumentlogIP")
  private String sEzsigndocumentlogIP = null;

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
   * The unique ID of the Ezsignsigner
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignsigner")
  public Integer getFkiEzsignsignerID() {
    return fkiEzsignsignerID;
  }
  public void setFkiEzsignsignerID(Integer fkiEzsignsignerID) {
    this.fkiEzsignsignerID = fkiEzsignsignerID;
  }

  /**
   * The date and time at which the event was logged
   **/
  @ApiModelProperty(required = true, value = "The date and time at which the event was logged")
  public String getDtEzsigndocumentlogDatetime() {
    return dtEzsigndocumentlogDatetime;
  }
  public void setDtEzsigndocumentlogDatetime(String dtEzsigndocumentlogDatetime) {
    this.dtEzsigndocumentlogDatetime = dtEzsigndocumentlogDatetime;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsigndocumentlogType getEEzsigndocumentlogType() {
    return eEzsigndocumentlogType;
  }
  public void setEEzsigndocumentlogType(FieldEEzsigndocumentlogType eEzsigndocumentlogType) {
    this.eEzsigndocumentlogType = eEzsigndocumentlogType;
  }

  /**
   * The detail of the Ezsigndocumentlog
   **/
  @ApiModelProperty(required = true, value = "The detail of the Ezsigndocumentlog")
  public String getSEzsigndocumentlogDetail() {
    return sEzsigndocumentlogDetail;
  }
  public void setSEzsigndocumentlogDetail(String sEzsigndocumentlogDetail) {
    this.sEzsigndocumentlogDetail = sEzsigndocumentlogDetail;
  }

  /**
   * The last name of the User or Ezsignsigner
   **/
  @ApiModelProperty(required = true, value = "The last name of the User or Ezsignsigner")
  public String getSEzsigndocumentlogLastname() {
    return sEzsigndocumentlogLastname;
  }
  public void setSEzsigndocumentlogLastname(String sEzsigndocumentlogLastname) {
    this.sEzsigndocumentlogLastname = sEzsigndocumentlogLastname;
  }

  /**
   * The first name of the User or Ezsignsigner
   **/
  @ApiModelProperty(required = true, value = "The first name of the User or Ezsignsigner")
  public String getSEzsigndocumentlogFirstname() {
    return sEzsigndocumentlogFirstname;
  }
  public void setSEzsigndocumentlogFirstname(String sEzsigndocumentlogFirstname) {
    this.sEzsigndocumentlogFirstname = sEzsigndocumentlogFirstname;
  }

  /**
   * Represent an IP address.
   **/
  @ApiModelProperty(required = true, value = "Represent an IP address.")
  public String getSEzsigndocumentlogIP() {
    return sEzsigndocumentlogIP;
  }
  public void setSEzsigndocumentlogIP(String sEzsigndocumentlogIP) {
    this.sEzsigndocumentlogIP = sEzsigndocumentlogIP;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentlogResponse ezsigndocumentlogResponse = (EzsigndocumentlogResponse) o;
    return (this.fkiUserID == null ? ezsigndocumentlogResponse.fkiUserID == null : this.fkiUserID.equals(ezsigndocumentlogResponse.fkiUserID)) &&
        (this.fkiEzsignsignerID == null ? ezsigndocumentlogResponse.fkiEzsignsignerID == null : this.fkiEzsignsignerID.equals(ezsigndocumentlogResponse.fkiEzsignsignerID)) &&
        (this.dtEzsigndocumentlogDatetime == null ? ezsigndocumentlogResponse.dtEzsigndocumentlogDatetime == null : this.dtEzsigndocumentlogDatetime.equals(ezsigndocumentlogResponse.dtEzsigndocumentlogDatetime)) &&
        (this.eEzsigndocumentlogType == null ? ezsigndocumentlogResponse.eEzsigndocumentlogType == null : this.eEzsigndocumentlogType.equals(ezsigndocumentlogResponse.eEzsigndocumentlogType)) &&
        (this.sEzsigndocumentlogDetail == null ? ezsigndocumentlogResponse.sEzsigndocumentlogDetail == null : this.sEzsigndocumentlogDetail.equals(ezsigndocumentlogResponse.sEzsigndocumentlogDetail)) &&
        (this.sEzsigndocumentlogLastname == null ? ezsigndocumentlogResponse.sEzsigndocumentlogLastname == null : this.sEzsigndocumentlogLastname.equals(ezsigndocumentlogResponse.sEzsigndocumentlogLastname)) &&
        (this.sEzsigndocumentlogFirstname == null ? ezsigndocumentlogResponse.sEzsigndocumentlogFirstname == null : this.sEzsigndocumentlogFirstname.equals(ezsigndocumentlogResponse.sEzsigndocumentlogFirstname)) &&
        (this.sEzsigndocumentlogIP == null ? ezsigndocumentlogResponse.sEzsigndocumentlogIP == null : this.sEzsigndocumentlogIP.equals(ezsigndocumentlogResponse.sEzsigndocumentlogIP));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiUserID == null ? 0: this.fkiUserID.hashCode());
    result = 31 * result + (this.fkiEzsignsignerID == null ? 0: this.fkiEzsignsignerID.hashCode());
    result = 31 * result + (this.dtEzsigndocumentlogDatetime == null ? 0: this.dtEzsigndocumentlogDatetime.hashCode());
    result = 31 * result + (this.eEzsigndocumentlogType == null ? 0: this.eEzsigndocumentlogType.hashCode());
    result = 31 * result + (this.sEzsigndocumentlogDetail == null ? 0: this.sEzsigndocumentlogDetail.hashCode());
    result = 31 * result + (this.sEzsigndocumentlogLastname == null ? 0: this.sEzsigndocumentlogLastname.hashCode());
    result = 31 * result + (this.sEzsigndocumentlogFirstname == null ? 0: this.sEzsigndocumentlogFirstname.hashCode());
    result = 31 * result + (this.sEzsigndocumentlogIP == null ? 0: this.sEzsigndocumentlogIP.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentlogResponse {\n");
    
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("  fkiEzsignsignerID: ").append(fkiEzsignsignerID).append("\n");
    sb.append("  dtEzsigndocumentlogDatetime: ").append(dtEzsigndocumentlogDatetime).append("\n");
    sb.append("  eEzsigndocumentlogType: ").append(eEzsigndocumentlogType).append("\n");
    sb.append("  sEzsigndocumentlogDetail: ").append(sEzsigndocumentlogDetail).append("\n");
    sb.append("  sEzsigndocumentlogLastname: ").append(sEzsigndocumentlogLastname).append("\n");
    sb.append("  sEzsigndocumentlogFirstname: ").append(sEzsigndocumentlogFirstname).append("\n");
    sb.append("  sEzsigndocumentlogIP: ").append(sEzsigndocumentlogIP).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
