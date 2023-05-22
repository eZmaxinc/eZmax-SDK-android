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

import org.openapitools.client.model.ComputedECommunicationDirection;
import org.openapitools.client.model.FieldECommunicationImportance;
import org.openapitools.client.model.FieldECommunicationType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Communication List Element
 **/
@ApiModel(description = "A Communication List Element")
public class CustomCommunicationListElementResponse {
  
  @SerializedName("pkiCommunicationID")
  private Integer pkiCommunicationID = null;
  @SerializedName("dtCreatedDate")
  private String dtCreatedDate = null;
  @SerializedName("eCommunicationDirection")
  private ComputedECommunicationDirection eCommunicationDirection = null;
  @SerializedName("eCommunicationImportance")
  private FieldECommunicationImportance eCommunicationImportance = null;
  @SerializedName("eCommunicationType")
  private FieldECommunicationType eCommunicationType = null;
  @SerializedName("iCommunicationrecipientCount")
  private Integer iCommunicationrecipientCount = null;
  @SerializedName("sCommunicationSubject")
  private String sCommunicationSubject = null;
  @SerializedName("sCommunicationSender")
  private String sCommunicationSender = null;
  @SerializedName("sCommunicationRecipient")
  private String sCommunicationRecipient = null;

  /**
   * The unique ID of the Communication.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Communication.")
  public Integer getPkiCommunicationID() {
    return pkiCommunicationID;
  }
  public void setPkiCommunicationID(Integer pkiCommunicationID) {
    this.pkiCommunicationID = pkiCommunicationID;
  }

  /**
   * The date and time at which the object was created
   **/
  @ApiModelProperty(required = true, value = "The date and time at which the object was created")
  public String getDtCreatedDate() {
    return dtCreatedDate;
  }
  public void setDtCreatedDate(String dtCreatedDate) {
    this.dtCreatedDate = dtCreatedDate;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ComputedECommunicationDirection getECommunicationDirection() {
    return eCommunicationDirection;
  }
  public void setECommunicationDirection(ComputedECommunicationDirection eCommunicationDirection) {
    this.eCommunicationDirection = eCommunicationDirection;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldECommunicationImportance getECommunicationImportance() {
    return eCommunicationImportance;
  }
  public void setECommunicationImportance(FieldECommunicationImportance eCommunicationImportance) {
    this.eCommunicationImportance = eCommunicationImportance;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldECommunicationType getECommunicationType() {
    return eCommunicationType;
  }
  public void setECommunicationType(FieldECommunicationType eCommunicationType) {
    this.eCommunicationType = eCommunicationType;
  }

  /**
   * The count of Communicationrecipient
   **/
  @ApiModelProperty(required = true, value = "The count of Communicationrecipient")
  public Integer getICommunicationrecipientCount() {
    return iCommunicationrecipientCount;
  }
  public void setICommunicationrecipientCount(Integer iCommunicationrecipientCount) {
    this.iCommunicationrecipientCount = iCommunicationrecipientCount;
  }

  /**
   * The subject of the Communication
   **/
  @ApiModelProperty(required = true, value = "The subject of the Communication")
  public String getSCommunicationSubject() {
    return sCommunicationSubject;
  }
  public void setSCommunicationSubject(String sCommunicationSubject) {
    this.sCommunicationSubject = sCommunicationSubject;
  }

  /**
   * The sender name of the Communication
   **/
  @ApiModelProperty(required = true, value = "The sender name of the Communication")
  public String getSCommunicationSender() {
    return sCommunicationSender;
  }
  public void setSCommunicationSender(String sCommunicationSender) {
    this.sCommunicationSender = sCommunicationSender;
  }

  /**
   * The recipients' name of the Communication
   **/
  @ApiModelProperty(required = true, value = "The recipients' name of the Communication")
  public String getSCommunicationRecipient() {
    return sCommunicationRecipient;
  }
  public void setSCommunicationRecipient(String sCommunicationRecipient) {
    this.sCommunicationRecipient = sCommunicationRecipient;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomCommunicationListElementResponse customCommunicationListElementResponse = (CustomCommunicationListElementResponse) o;
    return (this.pkiCommunicationID == null ? customCommunicationListElementResponse.pkiCommunicationID == null : this.pkiCommunicationID.equals(customCommunicationListElementResponse.pkiCommunicationID)) &&
        (this.dtCreatedDate == null ? customCommunicationListElementResponse.dtCreatedDate == null : this.dtCreatedDate.equals(customCommunicationListElementResponse.dtCreatedDate)) &&
        (this.eCommunicationDirection == null ? customCommunicationListElementResponse.eCommunicationDirection == null : this.eCommunicationDirection.equals(customCommunicationListElementResponse.eCommunicationDirection)) &&
        (this.eCommunicationImportance == null ? customCommunicationListElementResponse.eCommunicationImportance == null : this.eCommunicationImportance.equals(customCommunicationListElementResponse.eCommunicationImportance)) &&
        (this.eCommunicationType == null ? customCommunicationListElementResponse.eCommunicationType == null : this.eCommunicationType.equals(customCommunicationListElementResponse.eCommunicationType)) &&
        (this.iCommunicationrecipientCount == null ? customCommunicationListElementResponse.iCommunicationrecipientCount == null : this.iCommunicationrecipientCount.equals(customCommunicationListElementResponse.iCommunicationrecipientCount)) &&
        (this.sCommunicationSubject == null ? customCommunicationListElementResponse.sCommunicationSubject == null : this.sCommunicationSubject.equals(customCommunicationListElementResponse.sCommunicationSubject)) &&
        (this.sCommunicationSender == null ? customCommunicationListElementResponse.sCommunicationSender == null : this.sCommunicationSender.equals(customCommunicationListElementResponse.sCommunicationSender)) &&
        (this.sCommunicationRecipient == null ? customCommunicationListElementResponse.sCommunicationRecipient == null : this.sCommunicationRecipient.equals(customCommunicationListElementResponse.sCommunicationRecipient));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiCommunicationID == null ? 0: this.pkiCommunicationID.hashCode());
    result = 31 * result + (this.dtCreatedDate == null ? 0: this.dtCreatedDate.hashCode());
    result = 31 * result + (this.eCommunicationDirection == null ? 0: this.eCommunicationDirection.hashCode());
    result = 31 * result + (this.eCommunicationImportance == null ? 0: this.eCommunicationImportance.hashCode());
    result = 31 * result + (this.eCommunicationType == null ? 0: this.eCommunicationType.hashCode());
    result = 31 * result + (this.iCommunicationrecipientCount == null ? 0: this.iCommunicationrecipientCount.hashCode());
    result = 31 * result + (this.sCommunicationSubject == null ? 0: this.sCommunicationSubject.hashCode());
    result = 31 * result + (this.sCommunicationSender == null ? 0: this.sCommunicationSender.hashCode());
    result = 31 * result + (this.sCommunicationRecipient == null ? 0: this.sCommunicationRecipient.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomCommunicationListElementResponse {\n");
    
    sb.append("  pkiCommunicationID: ").append(pkiCommunicationID).append("\n");
    sb.append("  dtCreatedDate: ").append(dtCreatedDate).append("\n");
    sb.append("  eCommunicationDirection: ").append(eCommunicationDirection).append("\n");
    sb.append("  eCommunicationImportance: ").append(eCommunicationImportance).append("\n");
    sb.append("  eCommunicationType: ").append(eCommunicationType).append("\n");
    sb.append("  iCommunicationrecipientCount: ").append(iCommunicationrecipientCount).append("\n");
    sb.append("  sCommunicationSubject: ").append(sCommunicationSubject).append("\n");
    sb.append("  sCommunicationSender: ").append(sCommunicationSender).append("\n");
    sb.append("  sCommunicationRecipient: ").append(sCommunicationRecipient).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}