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

import org.openapitools.client.model.CommonAudit;
import org.openapitools.client.model.FieldEWebhookEzsignevent;
import org.openapitools.client.model.FieldEWebhookManagementevent;
import org.openapitools.client.model.FieldEWebhookModule;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A webhook object
 **/
@ApiModel(description = "A webhook object")
public class WebhookResponse {
  
  @SerializedName("pkiWebhookID")
  private Integer pkiWebhookID = null;
  @SerializedName("fkiAuthenticationexternalID")
  private Integer fkiAuthenticationexternalID = null;
  @SerializedName("sWebhookDescription")
  private String sWebhookDescription = null;
  @SerializedName("fkiEzsignfoldertypeID")
  private Integer fkiEzsignfoldertypeID = null;
  @SerializedName("sEzsignfoldertypeNameX")
  private String sEzsignfoldertypeNameX = null;
  @SerializedName("eWebhookModule")
  private FieldEWebhookModule eWebhookModule = null;
  @SerializedName("eWebhookEzsignevent")
  private FieldEWebhookEzsignevent eWebhookEzsignevent = null;
  @SerializedName("eWebhookManagementevent")
  private FieldEWebhookManagementevent eWebhookManagementevent = null;
  @SerializedName("sWebhookUrl")
  private String sWebhookUrl = null;
  @SerializedName("sWebhookEmailfailed")
  private String sWebhookEmailfailed = null;
  @SerializedName("sWebhookApikey")
  private String sWebhookApikey = null;
  @SerializedName("sWebhookSecret")
  private String sWebhookSecret = null;
  @SerializedName("bWebhookIsactive")
  private Boolean bWebhookIsactive = null;
  @SerializedName("bWebhookIssigned")
  private Boolean bWebhookIssigned = null;
  @SerializedName("bWebhookSkipsslvalidation")
  private Boolean bWebhookSkipsslvalidation = null;
  @SerializedName("sAuthenticationexternalDescription")
  private String sAuthenticationexternalDescription = null;
  @SerializedName("objAudit")
  private CommonAudit objAudit = null;

  /**
   * The unique ID of the Webhook
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Webhook")
  public Integer getPkiWebhookID() {
    return pkiWebhookID;
  }
  public void setPkiWebhookID(Integer pkiWebhookID) {
    this.pkiWebhookID = pkiWebhookID;
  }

  /**
   * The unique ID of the Authenticationexternal
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(value = "The unique ID of the Authenticationexternal")
  public Integer getFkiAuthenticationexternalID() {
    return fkiAuthenticationexternalID;
  }
  public void setFkiAuthenticationexternalID(Integer fkiAuthenticationexternalID) {
    this.fkiAuthenticationexternalID = fkiAuthenticationexternalID;
  }

  /**
   * The description of the Webhook
   **/
  @ApiModelProperty(required = true, value = "The description of the Webhook")
  public String getSWebhookDescription() {
    return sWebhookDescription;
  }
  public void setSWebhookDescription(String sWebhookDescription) {
    this.sWebhookDescription = sWebhookDescription;
  }

  /**
   * The unique ID of the Ezsignfoldertype.
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignfoldertype.")
  public Integer getFkiEzsignfoldertypeID() {
    return fkiEzsignfoldertypeID;
  }
  public void setFkiEzsignfoldertypeID(Integer fkiEzsignfoldertypeID) {
    this.fkiEzsignfoldertypeID = fkiEzsignfoldertypeID;
  }

  /**
   * The name of the Ezsignfoldertype in the language of the requester
   **/
  @ApiModelProperty(value = "The name of the Ezsignfoldertype in the language of the requester")
  public String getSEzsignfoldertypeNameX() {
    return sEzsignfoldertypeNameX;
  }
  public void setSEzsignfoldertypeNameX(String sEzsignfoldertypeNameX) {
    this.sEzsignfoldertypeNameX = sEzsignfoldertypeNameX;
  }

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
  public FieldEWebhookEzsignevent getEWebhookEzsignevent() {
    return eWebhookEzsignevent;
  }
  public void setEWebhookEzsignevent(FieldEWebhookEzsignevent eWebhookEzsignevent) {
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
   * The URL of the Webhook callback
   **/
  @ApiModelProperty(required = true, value = "The URL of the Webhook callback")
  public String getSWebhookUrl() {
    return sWebhookUrl;
  }
  public void setSWebhookUrl(String sWebhookUrl) {
    this.sWebhookUrl = sWebhookUrl;
  }

  /**
   * The email that will receive the Webhook in case all attempts fail
   **/
  @ApiModelProperty(required = true, value = "The email that will receive the Webhook in case all attempts fail")
  public String getSWebhookEmailfailed() {
    return sWebhookEmailfailed;
  }
  public void setSWebhookEmailfailed(String sWebhookEmailfailed) {
    this.sWebhookEmailfailed = sWebhookEmailfailed;
  }

  /**
   * The Apikey for the Webhook.  This will be hidden if we are not creating or regenerating the Apikey.
   **/
  @ApiModelProperty(value = "The Apikey for the Webhook.  This will be hidden if we are not creating or regenerating the Apikey.")
  public String getSWebhookApikey() {
    return sWebhookApikey;
  }
  public void setSWebhookApikey(String sWebhookApikey) {
    this.sWebhookApikey = sWebhookApikey;
  }

  /**
   * The Secret for the Webhook.  This will be hidden if we are not creating or regenerating the Apikey.
   **/
  @ApiModelProperty(value = "The Secret for the Webhook.  This will be hidden if we are not creating or regenerating the Apikey.")
  public String getSWebhookSecret() {
    return sWebhookSecret;
  }
  public void setSWebhookSecret(String sWebhookSecret) {
    this.sWebhookSecret = sWebhookSecret;
  }

  /**
   * Whether the Webhook is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Webhook is active or not")
  public Boolean getBWebhookIsactive() {
    return bWebhookIsactive;
  }
  public void setBWebhookIsactive(Boolean bWebhookIsactive) {
    this.bWebhookIsactive = bWebhookIsactive;
  }

  /**
   * Whether the requests will be signed or not
   **/
  @ApiModelProperty(required = true, value = "Whether the requests will be signed or not")
  public Boolean getBWebhookIssigned() {
    return bWebhookIssigned;
  }
  public void setBWebhookIssigned(Boolean bWebhookIssigned) {
    this.bWebhookIssigned = bWebhookIssigned;
  }

  /**
   * Wheter the server's SSL certificate should be validated or not. Not recommended to skip for production use
   **/
  @ApiModelProperty(required = true, value = "Wheter the server's SSL certificate should be validated or not. Not recommended to skip for production use")
  public Boolean getBWebhookSkipsslvalidation() {
    return bWebhookSkipsslvalidation;
  }
  public void setBWebhookSkipsslvalidation(Boolean bWebhookSkipsslvalidation) {
    this.bWebhookSkipsslvalidation = bWebhookSkipsslvalidation;
  }

  /**
   * The description of the Authenticationexternal
   **/
  @ApiModelProperty(value = "The description of the Authenticationexternal")
  public String getSAuthenticationexternalDescription() {
    return sAuthenticationexternalDescription;
  }
  public void setSAuthenticationexternalDescription(String sAuthenticationexternalDescription) {
    this.sAuthenticationexternalDescription = sAuthenticationexternalDescription;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookResponse webhookResponse = (WebhookResponse) o;
    return (this.pkiWebhookID == null ? webhookResponse.pkiWebhookID == null : this.pkiWebhookID.equals(webhookResponse.pkiWebhookID)) &&
        (this.fkiAuthenticationexternalID == null ? webhookResponse.fkiAuthenticationexternalID == null : this.fkiAuthenticationexternalID.equals(webhookResponse.fkiAuthenticationexternalID)) &&
        (this.sWebhookDescription == null ? webhookResponse.sWebhookDescription == null : this.sWebhookDescription.equals(webhookResponse.sWebhookDescription)) &&
        (this.fkiEzsignfoldertypeID == null ? webhookResponse.fkiEzsignfoldertypeID == null : this.fkiEzsignfoldertypeID.equals(webhookResponse.fkiEzsignfoldertypeID)) &&
        (this.sEzsignfoldertypeNameX == null ? webhookResponse.sEzsignfoldertypeNameX == null : this.sEzsignfoldertypeNameX.equals(webhookResponse.sEzsignfoldertypeNameX)) &&
        (this.eWebhookModule == null ? webhookResponse.eWebhookModule == null : this.eWebhookModule.equals(webhookResponse.eWebhookModule)) &&
        (this.eWebhookEzsignevent == null ? webhookResponse.eWebhookEzsignevent == null : this.eWebhookEzsignevent.equals(webhookResponse.eWebhookEzsignevent)) &&
        (this.eWebhookManagementevent == null ? webhookResponse.eWebhookManagementevent == null : this.eWebhookManagementevent.equals(webhookResponse.eWebhookManagementevent)) &&
        (this.sWebhookUrl == null ? webhookResponse.sWebhookUrl == null : this.sWebhookUrl.equals(webhookResponse.sWebhookUrl)) &&
        (this.sWebhookEmailfailed == null ? webhookResponse.sWebhookEmailfailed == null : this.sWebhookEmailfailed.equals(webhookResponse.sWebhookEmailfailed)) &&
        (this.sWebhookApikey == null ? webhookResponse.sWebhookApikey == null : this.sWebhookApikey.equals(webhookResponse.sWebhookApikey)) &&
        (this.sWebhookSecret == null ? webhookResponse.sWebhookSecret == null : this.sWebhookSecret.equals(webhookResponse.sWebhookSecret)) &&
        (this.bWebhookIsactive == null ? webhookResponse.bWebhookIsactive == null : this.bWebhookIsactive.equals(webhookResponse.bWebhookIsactive)) &&
        (this.bWebhookIssigned == null ? webhookResponse.bWebhookIssigned == null : this.bWebhookIssigned.equals(webhookResponse.bWebhookIssigned)) &&
        (this.bWebhookSkipsslvalidation == null ? webhookResponse.bWebhookSkipsslvalidation == null : this.bWebhookSkipsslvalidation.equals(webhookResponse.bWebhookSkipsslvalidation)) &&
        (this.sAuthenticationexternalDescription == null ? webhookResponse.sAuthenticationexternalDescription == null : this.sAuthenticationexternalDescription.equals(webhookResponse.sAuthenticationexternalDescription)) &&
        (this.objAudit == null ? webhookResponse.objAudit == null : this.objAudit.equals(webhookResponse.objAudit));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiWebhookID == null ? 0: this.pkiWebhookID.hashCode());
    result = 31 * result + (this.fkiAuthenticationexternalID == null ? 0: this.fkiAuthenticationexternalID.hashCode());
    result = 31 * result + (this.sWebhookDescription == null ? 0: this.sWebhookDescription.hashCode());
    result = 31 * result + (this.fkiEzsignfoldertypeID == null ? 0: this.fkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.sEzsignfoldertypeNameX == null ? 0: this.sEzsignfoldertypeNameX.hashCode());
    result = 31 * result + (this.eWebhookModule == null ? 0: this.eWebhookModule.hashCode());
    result = 31 * result + (this.eWebhookEzsignevent == null ? 0: this.eWebhookEzsignevent.hashCode());
    result = 31 * result + (this.eWebhookManagementevent == null ? 0: this.eWebhookManagementevent.hashCode());
    result = 31 * result + (this.sWebhookUrl == null ? 0: this.sWebhookUrl.hashCode());
    result = 31 * result + (this.sWebhookEmailfailed == null ? 0: this.sWebhookEmailfailed.hashCode());
    result = 31 * result + (this.sWebhookApikey == null ? 0: this.sWebhookApikey.hashCode());
    result = 31 * result + (this.sWebhookSecret == null ? 0: this.sWebhookSecret.hashCode());
    result = 31 * result + (this.bWebhookIsactive == null ? 0: this.bWebhookIsactive.hashCode());
    result = 31 * result + (this.bWebhookIssigned == null ? 0: this.bWebhookIssigned.hashCode());
    result = 31 * result + (this.bWebhookSkipsslvalidation == null ? 0: this.bWebhookSkipsslvalidation.hashCode());
    result = 31 * result + (this.sAuthenticationexternalDescription == null ? 0: this.sAuthenticationexternalDescription.hashCode());
    result = 31 * result + (this.objAudit == null ? 0: this.objAudit.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookResponse {\n");
    
    sb.append("  pkiWebhookID: ").append(pkiWebhookID).append("\n");
    sb.append("  fkiAuthenticationexternalID: ").append(fkiAuthenticationexternalID).append("\n");
    sb.append("  sWebhookDescription: ").append(sWebhookDescription).append("\n");
    sb.append("  fkiEzsignfoldertypeID: ").append(fkiEzsignfoldertypeID).append("\n");
    sb.append("  sEzsignfoldertypeNameX: ").append(sEzsignfoldertypeNameX).append("\n");
    sb.append("  eWebhookModule: ").append(eWebhookModule).append("\n");
    sb.append("  eWebhookEzsignevent: ").append(eWebhookEzsignevent).append("\n");
    sb.append("  eWebhookManagementevent: ").append(eWebhookManagementevent).append("\n");
    sb.append("  sWebhookUrl: ").append(sWebhookUrl).append("\n");
    sb.append("  sWebhookEmailfailed: ").append(sWebhookEmailfailed).append("\n");
    sb.append("  sWebhookApikey: ").append(sWebhookApikey).append("\n");
    sb.append("  sWebhookSecret: ").append(sWebhookSecret).append("\n");
    sb.append("  bWebhookIsactive: ").append(bWebhookIsactive).append("\n");
    sb.append("  bWebhookIssigned: ").append(bWebhookIssigned).append("\n");
    sb.append("  bWebhookSkipsslvalidation: ").append(bWebhookSkipsslvalidation).append("\n");
    sb.append("  sAuthenticationexternalDescription: ").append(sAuthenticationexternalDescription).append("\n");
    sb.append("  objAudit: ").append(objAudit).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
