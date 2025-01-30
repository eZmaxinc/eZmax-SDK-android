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

import java.util.*;
import org.openapitools.client.model.CommonAudit;
import org.openapitools.client.model.CustomDnsrecordResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Domain Object
 **/
@ApiModel(description = "A Domain Object")
public class DomainResponseCompound {
  
  @SerializedName("pkiDomainID")
  private Integer pkiDomainID = null;
  @SerializedName("sDomainName")
  private String sDomainName = null;
  @SerializedName("bDomainValiddkim")
  private Boolean bDomainValiddkim = null;
  @SerializedName("bDomainValidmailfrom")
  private Boolean bDomainValidmailfrom = null;
  @SerializedName("bDomainValidcustomer")
  private Boolean bDomainValidcustomer = null;
  @SerializedName("objAudit")
  private CommonAudit objAudit = null;
  @SerializedName("a_objDnsrecord")
  private List<CustomDnsrecordResponse> aObjDnsrecord = null;

  /**
   * The unique ID of the Domain
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Domain")
  public Integer getPkiDomainID() {
    return pkiDomainID;
  }
  public void setPkiDomainID(Integer pkiDomainID) {
    this.pkiDomainID = pkiDomainID;
  }

  /**
   * The name of the Domain
   **/
  @ApiModelProperty(required = true, value = "The name of the Domain")
  public String getSDomainName() {
    return sDomainName;
  }
  public void setSDomainName(String sDomainName) {
    this.sDomainName = sDomainName;
  }

  /**
   * Whether the DKIM is valid or not
   **/
  @ApiModelProperty(required = true, value = "Whether the DKIM is valid or not")
  public Boolean getBDomainValiddkim() {
    return bDomainValiddkim;
  }
  public void setBDomainValiddkim(Boolean bDomainValiddkim) {
    this.bDomainValiddkim = bDomainValiddkim;
  }

  /**
   * Whether the mail from is valid or not
   **/
  @ApiModelProperty(required = true, value = "Whether the mail from is valid or not")
  public Boolean getBDomainValidmailfrom() {
    return bDomainValidmailfrom;
  }
  public void setBDomainValidmailfrom(Boolean bDomainValidmailfrom) {
    this.bDomainValidmailfrom = bDomainValidmailfrom;
  }

  /**
   * Whether the customer has access to it or not
   **/
  @ApiModelProperty(required = true, value = "Whether the customer has access to it or not")
  public Boolean getBDomainValidcustomer() {
    return bDomainValidcustomer;
  }
  public void setBDomainValidcustomer(Boolean bDomainValidcustomer) {
    this.bDomainValidcustomer = bDomainValidcustomer;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CommonAudit getObjAudit() {
    return objAudit;
  }
  public void setObjAudit(CommonAudit objAudit) {
    this.objAudit = objAudit;
  }

  /**
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomDnsrecordResponse> getAObjDnsrecord() {
    return aObjDnsrecord;
  }
  public void setAObjDnsrecord(List<CustomDnsrecordResponse> aObjDnsrecord) {
    this.aObjDnsrecord = aObjDnsrecord;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainResponseCompound domainResponseCompound = (DomainResponseCompound) o;
    return (this.pkiDomainID == null ? domainResponseCompound.pkiDomainID == null : this.pkiDomainID.equals(domainResponseCompound.pkiDomainID)) &&
        (this.sDomainName == null ? domainResponseCompound.sDomainName == null : this.sDomainName.equals(domainResponseCompound.sDomainName)) &&
        (this.bDomainValiddkim == null ? domainResponseCompound.bDomainValiddkim == null : this.bDomainValiddkim.equals(domainResponseCompound.bDomainValiddkim)) &&
        (this.bDomainValidmailfrom == null ? domainResponseCompound.bDomainValidmailfrom == null : this.bDomainValidmailfrom.equals(domainResponseCompound.bDomainValidmailfrom)) &&
        (this.bDomainValidcustomer == null ? domainResponseCompound.bDomainValidcustomer == null : this.bDomainValidcustomer.equals(domainResponseCompound.bDomainValidcustomer)) &&
        (this.objAudit == null ? domainResponseCompound.objAudit == null : this.objAudit.equals(domainResponseCompound.objAudit)) &&
        (this.aObjDnsrecord == null ? domainResponseCompound.aObjDnsrecord == null : this.aObjDnsrecord.equals(domainResponseCompound.aObjDnsrecord));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiDomainID == null ? 0: this.pkiDomainID.hashCode());
    result = 31 * result + (this.sDomainName == null ? 0: this.sDomainName.hashCode());
    result = 31 * result + (this.bDomainValiddkim == null ? 0: this.bDomainValiddkim.hashCode());
    result = 31 * result + (this.bDomainValidmailfrom == null ? 0: this.bDomainValidmailfrom.hashCode());
    result = 31 * result + (this.bDomainValidcustomer == null ? 0: this.bDomainValidcustomer.hashCode());
    result = 31 * result + (this.objAudit == null ? 0: this.objAudit.hashCode());
    result = 31 * result + (this.aObjDnsrecord == null ? 0: this.aObjDnsrecord.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainResponseCompound {\n");
    
    sb.append("  pkiDomainID: ").append(pkiDomainID).append("\n");
    sb.append("  sDomainName: ").append(sDomainName).append("\n");
    sb.append("  bDomainValiddkim: ").append(bDomainValiddkim).append("\n");
    sb.append("  bDomainValidmailfrom: ").append(bDomainValidmailfrom).append("\n");
    sb.append("  bDomainValidcustomer: ").append(bDomainValidcustomer).append("\n");
    sb.append("  objAudit: ").append(objAudit).append("\n");
    sb.append("  aObjDnsrecord: ").append(aObjDnsrecord).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
