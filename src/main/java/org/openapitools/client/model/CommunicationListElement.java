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

import org.openapitools.client.model.CustomContactNameResponse;
import org.openapitools.client.model.FieldECommunicationEmailimportance;
import org.openapitools.client.model.FieldECommunicationType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Communication List Element
 **/
@ApiModel(description = "A Communication List Element")
public class CommunicationListElement {
  
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunicationListElement communicationListElement = (CommunicationListElement) o;
    return (this.pkiCommunicationID == null ? communicationListElement.pkiCommunicationID == null : this.pkiCommunicationID.equals(communicationListElement.pkiCommunicationID)) &&
        (this.eCommunicationEmailimportance == null ? communicationListElement.eCommunicationEmailimportance == null : this.eCommunicationEmailimportance.equals(communicationListElement.eCommunicationEmailimportance)) &&
        (this.eCommunicationType == null ? communicationListElement.eCommunicationType == null : this.eCommunicationType.equals(communicationListElement.eCommunicationType)) &&
        (this.sCommunicationSubject == null ? communicationListElement.sCommunicationSubject == null : this.sCommunicationSubject.equals(communicationListElement.sCommunicationSubject)) &&
        (this.dtCommunicationSentdate == null ? communicationListElement.dtCommunicationSentdate == null : this.dtCommunicationSentdate.equals(communicationListElement.dtCommunicationSentdate)) &&
        (this.objContactFrom == null ? communicationListElement.objContactFrom == null : this.objContactFrom.equals(communicationListElement.objContactFrom));
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
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunicationListElement {\n");
    
    sb.append("  pkiCommunicationID: ").append(pkiCommunicationID).append("\n");
    sb.append("  eCommunicationEmailimportance: ").append(eCommunicationEmailimportance).append("\n");
    sb.append("  eCommunicationType: ").append(eCommunicationType).append("\n");
    sb.append("  sCommunicationSubject: ").append(sCommunicationSubject).append("\n");
    sb.append("  dtCommunicationSentdate: ").append(dtCommunicationSentdate).append("\n");
    sb.append("  objContactFrom: ").append(objContactFrom).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
