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

import java.util.*;
import org.openapitools.client.model.CommunicationattachmentResponseCompound;
import org.openapitools.client.model.CommunicationexternalimageResponseCompound;
import org.openapitools.client.model.CommunicationexternalrecipientResponseCompound;
import org.openapitools.client.model.CommunicationimageResponseCompound;
import org.openapitools.client.model.CommunicationrecipientResponseCompound;
import org.openapitools.client.model.CustomContactNameResponse;
import org.openapitools.client.model.FieldECommunicationEmailimportance;
import org.openapitools.client.model.FieldECommunicationType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Communication Object
 **/
@ApiModel(description = "A Communication Object")
public class CommunicationResponseCompound {
  
  @SerializedName("pkiCommunicationID")
  private Integer pkiCommunicationID = null;
  @SerializedName("eCommunicationEmailimportance")
  private FieldECommunicationEmailimportance eCommunicationEmailimportance = null;
  @SerializedName("eCommunicationType")
  private FieldECommunicationType eCommunicationType = null;
  @SerializedName("sCommunicationSubject")
  private String sCommunicationSubject = null;
  @SerializedName("dtCommunicationSentdate")
  private String dtCommunicationSentdate = null;
  @SerializedName("objContactFrom")
  private CustomContactNameResponse objContactFrom = null;
  @SerializedName("a_objCommunicationattachment")
  private List<CommunicationattachmentResponseCompound> aObjCommunicationattachment = null;
  @SerializedName("a_objCommunicationrecipient")
  private List<CommunicationrecipientResponseCompound> aObjCommunicationrecipient = null;
  @SerializedName("a_objCommunicationexternalrecipient")
  private List<CommunicationexternalrecipientResponseCompound> aObjCommunicationexternalrecipient = null;
  @SerializedName("a_objCommunicationimage")
  private List<CommunicationimageResponseCompound> aObjCommunicationimage = null;
  @SerializedName("a_objCommunicationexternalimage")
  private List<CommunicationexternalimageResponseCompound> aObjCommunicationexternalimage = null;

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
   **/
  @ApiModelProperty(value = "")
  public FieldECommunicationEmailimportance getECommunicationEmailimportance() {
    return eCommunicationEmailimportance;
  }
  public void setECommunicationEmailimportance(FieldECommunicationEmailimportance eCommunicationEmailimportance) {
    this.eCommunicationEmailimportance = eCommunicationEmailimportance;
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
   * The Subject of the Communication
   **/
  @ApiModelProperty(required = true, value = "The Subject of the Communication")
  public String getSCommunicationSubject() {
    return sCommunicationSubject;
  }
  public void setSCommunicationSubject(String sCommunicationSubject) {
    this.sCommunicationSubject = sCommunicationSubject;
  }

  /**
   * The send date and time at which the Communication was sent.
   **/
  @ApiModelProperty(required = true, value = "The send date and time at which the Communication was sent.")
  public String getDtCommunicationSentdate() {
    return dtCommunicationSentdate;
  }
  public void setDtCommunicationSentdate(String dtCommunicationSentdate) {
    this.dtCommunicationSentdate = dtCommunicationSentdate;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CustomContactNameResponse getObjContactFrom() {
    return objContactFrom;
  }
  public void setObjContactFrom(CustomContactNameResponse objContactFrom) {
    this.objContactFrom = objContactFrom;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CommunicationattachmentResponseCompound> getAObjCommunicationattachment() {
    return aObjCommunicationattachment;
  }
  public void setAObjCommunicationattachment(List<CommunicationattachmentResponseCompound> aObjCommunicationattachment) {
    this.aObjCommunicationattachment = aObjCommunicationattachment;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CommunicationrecipientResponseCompound> getAObjCommunicationrecipient() {
    return aObjCommunicationrecipient;
  }
  public void setAObjCommunicationrecipient(List<CommunicationrecipientResponseCompound> aObjCommunicationrecipient) {
    this.aObjCommunicationrecipient = aObjCommunicationrecipient;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CommunicationexternalrecipientResponseCompound> getAObjCommunicationexternalrecipient() {
    return aObjCommunicationexternalrecipient;
  }
  public void setAObjCommunicationexternalrecipient(List<CommunicationexternalrecipientResponseCompound> aObjCommunicationexternalrecipient) {
    this.aObjCommunicationexternalrecipient = aObjCommunicationexternalrecipient;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CommunicationimageResponseCompound> getAObjCommunicationimage() {
    return aObjCommunicationimage;
  }
  public void setAObjCommunicationimage(List<CommunicationimageResponseCompound> aObjCommunicationimage) {
    this.aObjCommunicationimage = aObjCommunicationimage;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CommunicationexternalimageResponseCompound> getAObjCommunicationexternalimage() {
    return aObjCommunicationexternalimage;
  }
  public void setAObjCommunicationexternalimage(List<CommunicationexternalimageResponseCompound> aObjCommunicationexternalimage) {
    this.aObjCommunicationexternalimage = aObjCommunicationexternalimage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunicationResponseCompound communicationResponseCompound = (CommunicationResponseCompound) o;
    return (this.pkiCommunicationID == null ? communicationResponseCompound.pkiCommunicationID == null : this.pkiCommunicationID.equals(communicationResponseCompound.pkiCommunicationID)) &&
        (this.eCommunicationEmailimportance == null ? communicationResponseCompound.eCommunicationEmailimportance == null : this.eCommunicationEmailimportance.equals(communicationResponseCompound.eCommunicationEmailimportance)) &&
        (this.eCommunicationType == null ? communicationResponseCompound.eCommunicationType == null : this.eCommunicationType.equals(communicationResponseCompound.eCommunicationType)) &&
        (this.sCommunicationSubject == null ? communicationResponseCompound.sCommunicationSubject == null : this.sCommunicationSubject.equals(communicationResponseCompound.sCommunicationSubject)) &&
        (this.dtCommunicationSentdate == null ? communicationResponseCompound.dtCommunicationSentdate == null : this.dtCommunicationSentdate.equals(communicationResponseCompound.dtCommunicationSentdate)) &&
        (this.objContactFrom == null ? communicationResponseCompound.objContactFrom == null : this.objContactFrom.equals(communicationResponseCompound.objContactFrom)) &&
        (this.aObjCommunicationattachment == null ? communicationResponseCompound.aObjCommunicationattachment == null : this.aObjCommunicationattachment.equals(communicationResponseCompound.aObjCommunicationattachment)) &&
        (this.aObjCommunicationrecipient == null ? communicationResponseCompound.aObjCommunicationrecipient == null : this.aObjCommunicationrecipient.equals(communicationResponseCompound.aObjCommunicationrecipient)) &&
        (this.aObjCommunicationexternalrecipient == null ? communicationResponseCompound.aObjCommunicationexternalrecipient == null : this.aObjCommunicationexternalrecipient.equals(communicationResponseCompound.aObjCommunicationexternalrecipient)) &&
        (this.aObjCommunicationimage == null ? communicationResponseCompound.aObjCommunicationimage == null : this.aObjCommunicationimage.equals(communicationResponseCompound.aObjCommunicationimage)) &&
        (this.aObjCommunicationexternalimage == null ? communicationResponseCompound.aObjCommunicationexternalimage == null : this.aObjCommunicationexternalimage.equals(communicationResponseCompound.aObjCommunicationexternalimage));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiCommunicationID == null ? 0: this.pkiCommunicationID.hashCode());
    result = 31 * result + (this.eCommunicationEmailimportance == null ? 0: this.eCommunicationEmailimportance.hashCode());
    result = 31 * result + (this.eCommunicationType == null ? 0: this.eCommunicationType.hashCode());
    result = 31 * result + (this.sCommunicationSubject == null ? 0: this.sCommunicationSubject.hashCode());
    result = 31 * result + (this.dtCommunicationSentdate == null ? 0: this.dtCommunicationSentdate.hashCode());
    result = 31 * result + (this.objContactFrom == null ? 0: this.objContactFrom.hashCode());
    result = 31 * result + (this.aObjCommunicationattachment == null ? 0: this.aObjCommunicationattachment.hashCode());
    result = 31 * result + (this.aObjCommunicationrecipient == null ? 0: this.aObjCommunicationrecipient.hashCode());
    result = 31 * result + (this.aObjCommunicationexternalrecipient == null ? 0: this.aObjCommunicationexternalrecipient.hashCode());
    result = 31 * result + (this.aObjCommunicationimage == null ? 0: this.aObjCommunicationimage.hashCode());
    result = 31 * result + (this.aObjCommunicationexternalimage == null ? 0: this.aObjCommunicationexternalimage.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunicationResponseCompound {\n");
    
    sb.append("  pkiCommunicationID: ").append(pkiCommunicationID).append("\n");
    sb.append("  eCommunicationEmailimportance: ").append(eCommunicationEmailimportance).append("\n");
    sb.append("  eCommunicationType: ").append(eCommunicationType).append("\n");
    sb.append("  sCommunicationSubject: ").append(sCommunicationSubject).append("\n");
    sb.append("  dtCommunicationSentdate: ").append(dtCommunicationSentdate).append("\n");
    sb.append("  objContactFrom: ").append(objContactFrom).append("\n");
    sb.append("  aObjCommunicationattachment: ").append(aObjCommunicationattachment).append("\n");
    sb.append("  aObjCommunicationrecipient: ").append(aObjCommunicationrecipient).append("\n");
    sb.append("  aObjCommunicationexternalrecipient: ").append(aObjCommunicationexternalrecipient).append("\n");
    sb.append("  aObjCommunicationimage: ").append(aObjCommunicationimage).append("\n");
    sb.append("  aObjCommunicationexternalimage: ").append(aObjCommunicationexternalimage).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
