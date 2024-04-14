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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezmaxinvoicingcommission Object
 **/
@ApiModel(description = "A Ezmaxinvoicingcommission Object")
public class EzmaxinvoicingcommissionResponse {
  
  @SerializedName("pkiEzmaxinvoicingcommissionID")
  private Integer pkiEzmaxinvoicingcommissionID = null;
  @SerializedName("fkiEzmaxinvoicingsummaryglobalID")
  private Integer fkiEzmaxinvoicingsummaryglobalID = null;
  @SerializedName("fkiEzmaxpartnerID")
  private Integer fkiEzmaxpartnerID = null;
  @SerializedName("fkiEzmaxrepresentativeID")
  private Integer fkiEzmaxrepresentativeID = null;
  @SerializedName("dtEzmaxinvoicingcommissionStart")
  private String dtEzmaxinvoicingcommissionStart = null;
  @SerializedName("dtEzmaxinvoicingcommissionEnd")
  private String dtEzmaxinvoicingcommissionEnd = null;
  @SerializedName("iEzmaxinvoicingcommissionDays")
  private Integer iEzmaxinvoicingcommissionDays = null;
  @SerializedName("dEzmaxinvoicingcommissionAmount")
  private String dEzmaxinvoicingcommissionAmount = null;

  /**
   * The unique ID of the Ezmaxinvoicingcommission
   **/
  @ApiModelProperty(value = "The unique ID of the Ezmaxinvoicingcommission")
  public Integer getPkiEzmaxinvoicingcommissionID() {
    return pkiEzmaxinvoicingcommissionID;
  }
  public void setPkiEzmaxinvoicingcommissionID(Integer pkiEzmaxinvoicingcommissionID) {
    this.pkiEzmaxinvoicingcommissionID = pkiEzmaxinvoicingcommissionID;
  }

  /**
   * The unique ID of the Ezmaxinvoicingsummaryglobal
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezmaxinvoicingsummaryglobal")
  public Integer getFkiEzmaxinvoicingsummaryglobalID() {
    return fkiEzmaxinvoicingsummaryglobalID;
  }
  public void setFkiEzmaxinvoicingsummaryglobalID(Integer fkiEzmaxinvoicingsummaryglobalID) {
    this.fkiEzmaxinvoicingsummaryglobalID = fkiEzmaxinvoicingsummaryglobalID;
  }

  /**
   * The unique ID of the Ezmaxpartner
   * minimum: 1
   **/
  @ApiModelProperty(value = "The unique ID of the Ezmaxpartner")
  public Integer getFkiEzmaxpartnerID() {
    return fkiEzmaxpartnerID;
  }
  public void setFkiEzmaxpartnerID(Integer fkiEzmaxpartnerID) {
    this.fkiEzmaxpartnerID = fkiEzmaxpartnerID;
  }

  /**
   * The unique ID of the Ezmaxrepresentative
   * minimum: 1
   **/
  @ApiModelProperty(value = "The unique ID of the Ezmaxrepresentative")
  public Integer getFkiEzmaxrepresentativeID() {
    return fkiEzmaxrepresentativeID;
  }
  public void setFkiEzmaxrepresentativeID(Integer fkiEzmaxrepresentativeID) {
    this.fkiEzmaxrepresentativeID = fkiEzmaxrepresentativeID;
  }

  /**
   * The start date for the Ezmaxinvoicingcommission
   **/
  @ApiModelProperty(required = true, value = "The start date for the Ezmaxinvoicingcommission")
  public String getDtEzmaxinvoicingcommissionStart() {
    return dtEzmaxinvoicingcommissionStart;
  }
  public void setDtEzmaxinvoicingcommissionStart(String dtEzmaxinvoicingcommissionStart) {
    this.dtEzmaxinvoicingcommissionStart = dtEzmaxinvoicingcommissionStart;
  }

  /**
   * The end date for the Ezmaxinvoicingcommission
   **/
  @ApiModelProperty(required = true, value = "The end date for the Ezmaxinvoicingcommission")
  public String getDtEzmaxinvoicingcommissionEnd() {
    return dtEzmaxinvoicingcommissionEnd;
  }
  public void setDtEzmaxinvoicingcommissionEnd(String dtEzmaxinvoicingcommissionEnd) {
    this.dtEzmaxinvoicingcommissionEnd = dtEzmaxinvoicingcommissionEnd;
  }

  /**
   * This is the number of days during the month on which the Ezmaxinvoigcommission applies
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "This is the number of days during the month on which the Ezmaxinvoigcommission applies")
  public Integer getIEzmaxinvoicingcommissionDays() {
    return iEzmaxinvoicingcommissionDays;
  }
  public void setIEzmaxinvoicingcommissionDays(Integer iEzmaxinvoicingcommissionDays) {
    this.iEzmaxinvoicingcommissionDays = iEzmaxinvoicingcommissionDays;
  }

  /**
   * The amount of Ezmaxinvoicingcommission
   **/
  @ApiModelProperty(required = true, value = "The amount of Ezmaxinvoicingcommission")
  public String getDEzmaxinvoicingcommissionAmount() {
    return dEzmaxinvoicingcommissionAmount;
  }
  public void setDEzmaxinvoicingcommissionAmount(String dEzmaxinvoicingcommissionAmount) {
    this.dEzmaxinvoicingcommissionAmount = dEzmaxinvoicingcommissionAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzmaxinvoicingcommissionResponse ezmaxinvoicingcommissionResponse = (EzmaxinvoicingcommissionResponse) o;
    return (this.pkiEzmaxinvoicingcommissionID == null ? ezmaxinvoicingcommissionResponse.pkiEzmaxinvoicingcommissionID == null : this.pkiEzmaxinvoicingcommissionID.equals(ezmaxinvoicingcommissionResponse.pkiEzmaxinvoicingcommissionID)) &&
        (this.fkiEzmaxinvoicingsummaryglobalID == null ? ezmaxinvoicingcommissionResponse.fkiEzmaxinvoicingsummaryglobalID == null : this.fkiEzmaxinvoicingsummaryglobalID.equals(ezmaxinvoicingcommissionResponse.fkiEzmaxinvoicingsummaryglobalID)) &&
        (this.fkiEzmaxpartnerID == null ? ezmaxinvoicingcommissionResponse.fkiEzmaxpartnerID == null : this.fkiEzmaxpartnerID.equals(ezmaxinvoicingcommissionResponse.fkiEzmaxpartnerID)) &&
        (this.fkiEzmaxrepresentativeID == null ? ezmaxinvoicingcommissionResponse.fkiEzmaxrepresentativeID == null : this.fkiEzmaxrepresentativeID.equals(ezmaxinvoicingcommissionResponse.fkiEzmaxrepresentativeID)) &&
        (this.dtEzmaxinvoicingcommissionStart == null ? ezmaxinvoicingcommissionResponse.dtEzmaxinvoicingcommissionStart == null : this.dtEzmaxinvoicingcommissionStart.equals(ezmaxinvoicingcommissionResponse.dtEzmaxinvoicingcommissionStart)) &&
        (this.dtEzmaxinvoicingcommissionEnd == null ? ezmaxinvoicingcommissionResponse.dtEzmaxinvoicingcommissionEnd == null : this.dtEzmaxinvoicingcommissionEnd.equals(ezmaxinvoicingcommissionResponse.dtEzmaxinvoicingcommissionEnd)) &&
        (this.iEzmaxinvoicingcommissionDays == null ? ezmaxinvoicingcommissionResponse.iEzmaxinvoicingcommissionDays == null : this.iEzmaxinvoicingcommissionDays.equals(ezmaxinvoicingcommissionResponse.iEzmaxinvoicingcommissionDays)) &&
        (this.dEzmaxinvoicingcommissionAmount == null ? ezmaxinvoicingcommissionResponse.dEzmaxinvoicingcommissionAmount == null : this.dEzmaxinvoicingcommissionAmount.equals(ezmaxinvoicingcommissionResponse.dEzmaxinvoicingcommissionAmount));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzmaxinvoicingcommissionID == null ? 0: this.pkiEzmaxinvoicingcommissionID.hashCode());
    result = 31 * result + (this.fkiEzmaxinvoicingsummaryglobalID == null ? 0: this.fkiEzmaxinvoicingsummaryglobalID.hashCode());
    result = 31 * result + (this.fkiEzmaxpartnerID == null ? 0: this.fkiEzmaxpartnerID.hashCode());
    result = 31 * result + (this.fkiEzmaxrepresentativeID == null ? 0: this.fkiEzmaxrepresentativeID.hashCode());
    result = 31 * result + (this.dtEzmaxinvoicingcommissionStart == null ? 0: this.dtEzmaxinvoicingcommissionStart.hashCode());
    result = 31 * result + (this.dtEzmaxinvoicingcommissionEnd == null ? 0: this.dtEzmaxinvoicingcommissionEnd.hashCode());
    result = 31 * result + (this.iEzmaxinvoicingcommissionDays == null ? 0: this.iEzmaxinvoicingcommissionDays.hashCode());
    result = 31 * result + (this.dEzmaxinvoicingcommissionAmount == null ? 0: this.dEzmaxinvoicingcommissionAmount.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzmaxinvoicingcommissionResponse {\n");
    
    sb.append("  pkiEzmaxinvoicingcommissionID: ").append(pkiEzmaxinvoicingcommissionID).append("\n");
    sb.append("  fkiEzmaxinvoicingsummaryglobalID: ").append(fkiEzmaxinvoicingsummaryglobalID).append("\n");
    sb.append("  fkiEzmaxpartnerID: ").append(fkiEzmaxpartnerID).append("\n");
    sb.append("  fkiEzmaxrepresentativeID: ").append(fkiEzmaxrepresentativeID).append("\n");
    sb.append("  dtEzmaxinvoicingcommissionStart: ").append(dtEzmaxinvoicingcommissionStart).append("\n");
    sb.append("  dtEzmaxinvoicingcommissionEnd: ").append(dtEzmaxinvoicingcommissionEnd).append("\n");
    sb.append("  iEzmaxinvoicingcommissionDays: ").append(iEzmaxinvoicingcommissionDays).append("\n");
    sb.append("  dEzmaxinvoicingcommissionAmount: ").append(dEzmaxinvoicingcommissionAmount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
