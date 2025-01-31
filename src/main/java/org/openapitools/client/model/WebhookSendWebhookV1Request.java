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

import org.openapitools.client.model.CustomEWebhookEzsignevent;
import org.openapitools.client.model.FieldEWebhookManagementevent;
import org.openapitools.client.model.FieldEWebhookModule;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/webhook/sendWebhook
 **/
@ApiModel(description = "Request for POST /1/object/webhook/sendWebhook")
public class WebhookSendWebhookV1Request {
  
  @SerializedName("eWebhookModule")
  private FieldEWebhookModule eWebhookModule = null;
  @SerializedName("eWebhookEzsignevent")
  private CustomEWebhookEzsignevent eWebhookEzsignevent = null;
  @SerializedName("eWebhookManagementevent")
  private FieldEWebhookManagementevent eWebhookManagementevent = null;
  @SerializedName("fkiEzsignfolderID")
  private Integer fkiEzsignfolderID = null;
  @SerializedName("fkiEzsigndocumentID")
  private Integer fkiEzsigndocumentID = null;
  @SerializedName("fkiEzsignsignerID")
  private Integer fkiEzsignsignerID = null;
  @SerializedName("fkiUserID")
  private Integer fkiUserID = null;
  @SerializedName("fkiUserstagedID")
  private Integer fkiUserstagedID = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEWebhookModule getEWebhookModule() {
    return eWebhookModule;
  }
  public void setEWebhookModule(FieldEWebhookModule eWebhookModule) {
    this.eWebhookModule = eWebhookModule;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CustomEWebhookEzsignevent getEWebhookEzsignevent() {
    return eWebhookEzsignevent;
  }
  public void setEWebhookEzsignevent(CustomEWebhookEzsignevent eWebhookEzsignevent) {
    this.eWebhookEzsignevent = eWebhookEzsignevent;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEWebhookManagementevent getEWebhookManagementevent() {
    return eWebhookManagementevent;
  }
  public void setEWebhookManagementevent(FieldEWebhookManagementevent eWebhookManagementevent) {
    this.eWebhookManagementevent = eWebhookManagementevent;
  }

  /**
   * The unique ID of the Ezsignfolder
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignfolder")
  public Integer getFkiEzsignfolderID() {
    return fkiEzsignfolderID;
  }
  public void setFkiEzsignfolderID(Integer fkiEzsignfolderID) {
    this.fkiEzsignfolderID = fkiEzsignfolderID;
  }

  /**
   * The unique ID of the Ezsigndocument
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsigndocument")
  public Integer getFkiEzsigndocumentID() {
    return fkiEzsigndocumentID;
  }
  public void setFkiEzsigndocumentID(Integer fkiEzsigndocumentID) {
    this.fkiEzsigndocumentID = fkiEzsigndocumentID;
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
   * The unique ID of the Userstaged
   * minimum: 1
   * maximum: 65535
   **/
  @ApiModelProperty(value = "The unique ID of the Userstaged")
  public Integer getFkiUserstagedID() {
    return fkiUserstagedID;
  }
  public void setFkiUserstagedID(Integer fkiUserstagedID) {
    this.fkiUserstagedID = fkiUserstagedID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookSendWebhookV1Request webhookSendWebhookV1Request = (WebhookSendWebhookV1Request) o;
    return (this.eWebhookModule == null ? webhookSendWebhookV1Request.eWebhookModule == null : this.eWebhookModule.equals(webhookSendWebhookV1Request.eWebhookModule)) &&
        (this.eWebhookEzsignevent == null ? webhookSendWebhookV1Request.eWebhookEzsignevent == null : this.eWebhookEzsignevent.equals(webhookSendWebhookV1Request.eWebhookEzsignevent)) &&
        (this.eWebhookManagementevent == null ? webhookSendWebhookV1Request.eWebhookManagementevent == null : this.eWebhookManagementevent.equals(webhookSendWebhookV1Request.eWebhookManagementevent)) &&
        (this.fkiEzsignfolderID == null ? webhookSendWebhookV1Request.fkiEzsignfolderID == null : this.fkiEzsignfolderID.equals(webhookSendWebhookV1Request.fkiEzsignfolderID)) &&
        (this.fkiEzsigndocumentID == null ? webhookSendWebhookV1Request.fkiEzsigndocumentID == null : this.fkiEzsigndocumentID.equals(webhookSendWebhookV1Request.fkiEzsigndocumentID)) &&
        (this.fkiEzsignsignerID == null ? webhookSendWebhookV1Request.fkiEzsignsignerID == null : this.fkiEzsignsignerID.equals(webhookSendWebhookV1Request.fkiEzsignsignerID)) &&
        (this.fkiUserID == null ? webhookSendWebhookV1Request.fkiUserID == null : this.fkiUserID.equals(webhookSendWebhookV1Request.fkiUserID)) &&
        (this.fkiUserstagedID == null ? webhookSendWebhookV1Request.fkiUserstagedID == null : this.fkiUserstagedID.equals(webhookSendWebhookV1Request.fkiUserstagedID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.eWebhookModule == null ? 0: this.eWebhookModule.hashCode());
    result = 31 * result + (this.eWebhookEzsignevent == null ? 0: this.eWebhookEzsignevent.hashCode());
    result = 31 * result + (this.eWebhookManagementevent == null ? 0: this.eWebhookManagementevent.hashCode());
    result = 31 * result + (this.fkiEzsignfolderID == null ? 0: this.fkiEzsignfolderID.hashCode());
    result = 31 * result + (this.fkiEzsigndocumentID == null ? 0: this.fkiEzsigndocumentID.hashCode());
    result = 31 * result + (this.fkiEzsignsignerID == null ? 0: this.fkiEzsignsignerID.hashCode());
    result = 31 * result + (this.fkiUserID == null ? 0: this.fkiUserID.hashCode());
    result = 31 * result + (this.fkiUserstagedID == null ? 0: this.fkiUserstagedID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookSendWebhookV1Request {\n");
    
    sb.append("  eWebhookModule: ").append(eWebhookModule).append("\n");
    sb.append("  eWebhookEzsignevent: ").append(eWebhookEzsignevent).append("\n");
    sb.append("  eWebhookManagementevent: ").append(eWebhookManagementevent).append("\n");
    sb.append("  fkiEzsignfolderID: ").append(fkiEzsignfolderID).append("\n");
    sb.append("  fkiEzsigndocumentID: ").append(fkiEzsigndocumentID).append("\n");
    sb.append("  fkiEzsignsignerID: ").append(fkiEzsignsignerID).append("\n");
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("  fkiUserstagedID: ").append(fkiUserstagedID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
