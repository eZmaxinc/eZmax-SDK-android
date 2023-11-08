/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CommunicationexternalrecipientRequestCompound;
import org.openapitools.client.model.CommunicationrecipientRequestCompound;
import org.openapitools.client.model.CommunicationreferenceRequestCompound;
import org.openapitools.client.model.CustomCommunicationattachmentRequest;
import org.openapitools.client.model.CustomCommunicationsenderRequest;
import org.openapitools.client.model.FieldECommunicationImportance;
import org.openapitools.client.model.FieldECommunicationType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/communication
 **/
@ApiModel(description = "Request for POST /1/object/communication")
public class CommunicationRequestCompound {
  
  @SerializedName("pkiCommunicationID")
  private Integer pkiCommunicationID = null;
  @SerializedName("eCommunicationImportance")
  private FieldECommunicationImportance eCommunicationImportance = null;
  @SerializedName("eCommunicationType")
  private FieldECommunicationType eCommunicationType = null;
  @SerializedName("objCommunicationsender")
  private CustomCommunicationsenderRequest objCommunicationsender = null;
  @SerializedName("sCommunicationSubject")
  private String sCommunicationSubject = null;
  @SerializedName("tCommunicationBody")
  private String tCommunicationBody = null;
  @SerializedName("bCommunicationPrivate")
  private Boolean bCommunicationPrivate = null;
  public enum ECommunicationAttachmenttypeEnum {
     Attachment,  Url, 
  };
  @SerializedName("eCommunicationAttachmenttype")
  private ECommunicationAttachmenttypeEnum eCommunicationAttachmenttype = null;
  @SerializedName("iCommunicationAttachmentlinkexpiration")
  private Integer iCommunicationAttachmentlinkexpiration = null;
  @SerializedName("bCommunicationReadreceipt")
  private Boolean bCommunicationReadreceipt = null;
  @SerializedName("a_objCommunicationattachment")
  private List<CustomCommunicationattachmentRequest> aObjCommunicationattachment = null;
  @SerializedName("a_objCommunicationrecipient")
  private List<CommunicationrecipientRequestCompound> aObjCommunicationrecipient = null;
  @SerializedName("a_objCommunicationreference")
  private List<CommunicationreferenceRequestCompound> aObjCommunicationreference = null;
  @SerializedName("a_objCommunicationexternalrecipient")
  private List<CommunicationexternalrecipientRequestCompound> aObjCommunicationexternalrecipient = null;

  /**
   * The unique ID of the Communication.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Communication.")
  public Integer getPkiCommunicationID() {
    return pkiCommunicationID;
  }
  public void setPkiCommunicationID(Integer pkiCommunicationID) {
    this.pkiCommunicationID = pkiCommunicationID;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
   **/
  @ApiModelProperty(value = "")
  public CustomCommunicationsenderRequest getObjCommunicationsender() {
    return objCommunicationsender;
  }
  public void setObjCommunicationsender(CustomCommunicationsenderRequest objCommunicationsender) {
    this.objCommunicationsender = objCommunicationsender;
  }

  /**
   * The subject of the Communication
   **/
  @ApiModelProperty(value = "The subject of the Communication")
  public String getSCommunicationSubject() {
    return sCommunicationSubject;
  }
  public void setSCommunicationSubject(String sCommunicationSubject) {
    this.sCommunicationSubject = sCommunicationSubject;
  }

  /**
   * The Body of the Communication
   **/
  @ApiModelProperty(required = true, value = "The Body of the Communication")
  public String getTCommunicationBody() {
    return tCommunicationBody;
  }
  public void setTCommunicationBody(String tCommunicationBody) {
    this.tCommunicationBody = tCommunicationBody;
  }

  /**
   * Whether the Communication is private or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Communication is private or not")
  public Boolean getBCommunicationPrivate() {
    return bCommunicationPrivate;
  }
  public void setBCommunicationPrivate(Boolean bCommunicationPrivate) {
    this.bCommunicationPrivate = bCommunicationPrivate;
  }

  /**
   * How the attachment should be included in the email.   Only used if eCommunicationType is **Email**
   **/
  @ApiModelProperty(value = "How the attachment should be included in the email.   Only used if eCommunicationType is **Email**")
  public ECommunicationAttachmenttypeEnum getECommunicationAttachmenttype() {
    return eCommunicationAttachmenttype;
  }
  public void setECommunicationAttachmenttype(ECommunicationAttachmenttypeEnum eCommunicationAttachmenttype) {
    this.eCommunicationAttachmenttype = eCommunicationAttachmenttype;
  }

  /**
   * The number of days before the attachment link expired.   Only used if eCommunicationType is **Email** and eCommunicationattachmentType is **Link**
   * minimum: 1
   * maximum: 30
   **/
  @ApiModelProperty(value = "The number of days before the attachment link expired.   Only used if eCommunicationType is **Email** and eCommunicationattachmentType is **Link**")
  public Integer getICommunicationAttachmentlinkexpiration() {
    return iCommunicationAttachmentlinkexpiration;
  }
  public void setICommunicationAttachmentlinkexpiration(Integer iCommunicationAttachmentlinkexpiration) {
    this.iCommunicationAttachmentlinkexpiration = iCommunicationAttachmentlinkexpiration;
  }

  /**
   * Whether we ask for a read receipt or not.
   **/
  @ApiModelProperty(value = "Whether we ask for a read receipt or not.")
  public Boolean getBCommunicationReadreceipt() {
    return bCommunicationReadreceipt;
  }
  public void setBCommunicationReadreceipt(Boolean bCommunicationReadreceipt) {
    this.bCommunicationReadreceipt = bCommunicationReadreceipt;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomCommunicationattachmentRequest> getAObjCommunicationattachment() {
    return aObjCommunicationattachment;
  }
  public void setAObjCommunicationattachment(List<CustomCommunicationattachmentRequest> aObjCommunicationattachment) {
    this.aObjCommunicationattachment = aObjCommunicationattachment;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CommunicationrecipientRequestCompound> getAObjCommunicationrecipient() {
    return aObjCommunicationrecipient;
  }
  public void setAObjCommunicationrecipient(List<CommunicationrecipientRequestCompound> aObjCommunicationrecipient) {
    this.aObjCommunicationrecipient = aObjCommunicationrecipient;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CommunicationreferenceRequestCompound> getAObjCommunicationreference() {
    return aObjCommunicationreference;
  }
  public void setAObjCommunicationreference(List<CommunicationreferenceRequestCompound> aObjCommunicationreference) {
    this.aObjCommunicationreference = aObjCommunicationreference;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CommunicationexternalrecipientRequestCompound> getAObjCommunicationexternalrecipient() {
    return aObjCommunicationexternalrecipient;
  }
  public void setAObjCommunicationexternalrecipient(List<CommunicationexternalrecipientRequestCompound> aObjCommunicationexternalrecipient) {
    this.aObjCommunicationexternalrecipient = aObjCommunicationexternalrecipient;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunicationRequestCompound communicationRequestCompound = (CommunicationRequestCompound) o;
    return (this.pkiCommunicationID == null ? communicationRequestCompound.pkiCommunicationID == null : this.pkiCommunicationID.equals(communicationRequestCompound.pkiCommunicationID)) &&
        (this.eCommunicationImportance == null ? communicationRequestCompound.eCommunicationImportance == null : this.eCommunicationImportance.equals(communicationRequestCompound.eCommunicationImportance)) &&
        (this.eCommunicationType == null ? communicationRequestCompound.eCommunicationType == null : this.eCommunicationType.equals(communicationRequestCompound.eCommunicationType)) &&
        (this.objCommunicationsender == null ? communicationRequestCompound.objCommunicationsender == null : this.objCommunicationsender.equals(communicationRequestCompound.objCommunicationsender)) &&
        (this.sCommunicationSubject == null ? communicationRequestCompound.sCommunicationSubject == null : this.sCommunicationSubject.equals(communicationRequestCompound.sCommunicationSubject)) &&
        (this.tCommunicationBody == null ? communicationRequestCompound.tCommunicationBody == null : this.tCommunicationBody.equals(communicationRequestCompound.tCommunicationBody)) &&
        (this.bCommunicationPrivate == null ? communicationRequestCompound.bCommunicationPrivate == null : this.bCommunicationPrivate.equals(communicationRequestCompound.bCommunicationPrivate)) &&
        (this.eCommunicationAttachmenttype == null ? communicationRequestCompound.eCommunicationAttachmenttype == null : this.eCommunicationAttachmenttype.equals(communicationRequestCompound.eCommunicationAttachmenttype)) &&
        (this.iCommunicationAttachmentlinkexpiration == null ? communicationRequestCompound.iCommunicationAttachmentlinkexpiration == null : this.iCommunicationAttachmentlinkexpiration.equals(communicationRequestCompound.iCommunicationAttachmentlinkexpiration)) &&
        (this.bCommunicationReadreceipt == null ? communicationRequestCompound.bCommunicationReadreceipt == null : this.bCommunicationReadreceipt.equals(communicationRequestCompound.bCommunicationReadreceipt)) &&
        (this.aObjCommunicationattachment == null ? communicationRequestCompound.aObjCommunicationattachment == null : this.aObjCommunicationattachment.equals(communicationRequestCompound.aObjCommunicationattachment)) &&
        (this.aObjCommunicationrecipient == null ? communicationRequestCompound.aObjCommunicationrecipient == null : this.aObjCommunicationrecipient.equals(communicationRequestCompound.aObjCommunicationrecipient)) &&
        (this.aObjCommunicationreference == null ? communicationRequestCompound.aObjCommunicationreference == null : this.aObjCommunicationreference.equals(communicationRequestCompound.aObjCommunicationreference)) &&
        (this.aObjCommunicationexternalrecipient == null ? communicationRequestCompound.aObjCommunicationexternalrecipient == null : this.aObjCommunicationexternalrecipient.equals(communicationRequestCompound.aObjCommunicationexternalrecipient));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiCommunicationID == null ? 0: this.pkiCommunicationID.hashCode());
    result = 31 * result + (this.eCommunicationImportance == null ? 0: this.eCommunicationImportance.hashCode());
    result = 31 * result + (this.eCommunicationType == null ? 0: this.eCommunicationType.hashCode());
    result = 31 * result + (this.objCommunicationsender == null ? 0: this.objCommunicationsender.hashCode());
    result = 31 * result + (this.sCommunicationSubject == null ? 0: this.sCommunicationSubject.hashCode());
    result = 31 * result + (this.tCommunicationBody == null ? 0: this.tCommunicationBody.hashCode());
    result = 31 * result + (this.bCommunicationPrivate == null ? 0: this.bCommunicationPrivate.hashCode());
    result = 31 * result + (this.eCommunicationAttachmenttype == null ? 0: this.eCommunicationAttachmenttype.hashCode());
    result = 31 * result + (this.iCommunicationAttachmentlinkexpiration == null ? 0: this.iCommunicationAttachmentlinkexpiration.hashCode());
    result = 31 * result + (this.bCommunicationReadreceipt == null ? 0: this.bCommunicationReadreceipt.hashCode());
    result = 31 * result + (this.aObjCommunicationattachment == null ? 0: this.aObjCommunicationattachment.hashCode());
    result = 31 * result + (this.aObjCommunicationrecipient == null ? 0: this.aObjCommunicationrecipient.hashCode());
    result = 31 * result + (this.aObjCommunicationreference == null ? 0: this.aObjCommunicationreference.hashCode());
    result = 31 * result + (this.aObjCommunicationexternalrecipient == null ? 0: this.aObjCommunicationexternalrecipient.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunicationRequestCompound {\n");
    
    sb.append("  pkiCommunicationID: ").append(pkiCommunicationID).append("\n");
    sb.append("  eCommunicationImportance: ").append(eCommunicationImportance).append("\n");
    sb.append("  eCommunicationType: ").append(eCommunicationType).append("\n");
    sb.append("  objCommunicationsender: ").append(objCommunicationsender).append("\n");
    sb.append("  sCommunicationSubject: ").append(sCommunicationSubject).append("\n");
    sb.append("  tCommunicationBody: ").append(tCommunicationBody).append("\n");
    sb.append("  bCommunicationPrivate: ").append(bCommunicationPrivate).append("\n");
    sb.append("  eCommunicationAttachmenttype: ").append(eCommunicationAttachmenttype).append("\n");
    sb.append("  iCommunicationAttachmentlinkexpiration: ").append(iCommunicationAttachmentlinkexpiration).append("\n");
    sb.append("  bCommunicationReadreceipt: ").append(bCommunicationReadreceipt).append("\n");
    sb.append("  aObjCommunicationattachment: ").append(aObjCommunicationattachment).append("\n");
    sb.append("  aObjCommunicationrecipient: ").append(aObjCommunicationrecipient).append("\n");
    sb.append("  aObjCommunicationreference: ").append(aObjCommunicationreference).append("\n");
    sb.append("  aObjCommunicationexternalrecipient: ").append(aObjCommunicationexternalrecipient).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
