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

import java.util.*;
import org.openapitools.client.model.CommonAudit;
import org.openapitools.client.model.FieldEWebhookEzsignevent;
import org.openapitools.client.model.FieldEWebhookManagementevent;
import org.openapitools.client.model.FieldEWebhookModule;
import org.openapitools.client.model.WebhookheaderResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A custom Webhook object
 **/
@ApiModel(description = "A custom Webhook object")
public class CustomWebhookResponse {
  
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
  @SerializedName("sWebhookEvent")
  private String sWebhookEvent = null;
  @SerializedName("a_objWebhookheader")
  private List<WebhookheaderResponseCompound> aObjWebhookheader = null;
  @SerializedName("pksCustomerCode")
  private String pksCustomerCode = null;
  @SerializedName("bWebhookTest")
  private Boolean bWebhookTest = null;
  public enum EWebhookEmittypeEnum {
     Automatic,  Manual,  Test, 
  };
  @SerializedName("eWebhookEmittype")
  private EWebhookEmittypeEnum eWebhookEmittype = null;

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

  /**
   * The concatenated string to describe the Webhook event
   **/
  @ApiModelProperty(value = "The concatenated string to describe the Webhook event")
  public String getSWebhookEvent() {
    return sWebhookEvent;
  }
  public void setSWebhookEvent(String sWebhookEvent) {
    this.sWebhookEvent = sWebhookEvent;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<WebhookheaderResponseCompound> getAObjWebhookheader() {
    return aObjWebhookheader;
  }
  public void setAObjWebhookheader(List<WebhookheaderResponseCompound> aObjWebhookheader) {
    this.aObjWebhookheader = aObjWebhookheader;
  }

  /**
   * The customer code assigned to your account
   **/
  @ApiModelProperty(required = true, value = "The customer code assigned to your account")
  public String getPksCustomerCode() {
    return pksCustomerCode;
  }
  public void setPksCustomerCode(String pksCustomerCode) {
    this.pksCustomerCode = pksCustomerCode;
  }

  /**
   * Wheter the webhook received is a manual test or a real event
   **/
  @ApiModelProperty(required = true, value = "Wheter the webhook received is a manual test or a real event")
  public Boolean getBWebhookTest() {
    return bWebhookTest;
  }
  public void setBWebhookTest(Boolean bWebhookTest) {
    this.bWebhookTest = bWebhookTest;
  }

  /**
   * Wheter the webhook received is a manual test or a real event
   **/
  @ApiModelProperty(value = "Wheter the webhook received is a manual test or a real event")
  public EWebhookEmittypeEnum getEWebhookEmittype() {
    return eWebhookEmittype;
  }
  public void setEWebhookEmittype(EWebhookEmittypeEnum eWebhookEmittype) {
    this.eWebhookEmittype = eWebhookEmittype;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomWebhookResponse customWebhookResponse = (CustomWebhookResponse) o;
    return (this.pkiWebhookID == null ? customWebhookResponse.pkiWebhookID == null : this.pkiWebhookID.equals(customWebhookResponse.pkiWebhookID)) &&
        (this.fkiAuthenticationexternalID == null ? customWebhookResponse.fkiAuthenticationexternalID == null : this.fkiAuthenticationexternalID.equals(customWebhookResponse.fkiAuthenticationexternalID)) &&
        (this.sWebhookDescription == null ? customWebhookResponse.sWebhookDescription == null : this.sWebhookDescription.equals(customWebhookResponse.sWebhookDescription)) &&
        (this.fkiEzsignfoldertypeID == null ? customWebhookResponse.fkiEzsignfoldertypeID == null : this.fkiEzsignfoldertypeID.equals(customWebhookResponse.fkiEzsignfoldertypeID)) &&
        (this.sEzsignfoldertypeNameX == null ? customWebhookResponse.sEzsignfoldertypeNameX == null : this.sEzsignfoldertypeNameX.equals(customWebhookResponse.sEzsignfoldertypeNameX)) &&
        (this.eWebhookModule == null ? customWebhookResponse.eWebhookModule == null : this.eWebhookModule.equals(customWebhookResponse.eWebhookModule)) &&
        (this.eWebhookEzsignevent == null ? customWebhookResponse.eWebhookEzsignevent == null : this.eWebhookEzsignevent.equals(customWebhookResponse.eWebhookEzsignevent)) &&
        (this.eWebhookManagementevent == null ? customWebhookResponse.eWebhookManagementevent == null : this.eWebhookManagementevent.equals(customWebhookResponse.eWebhookManagementevent)) &&
        (this.sWebhookUrl == null ? customWebhookResponse.sWebhookUrl == null : this.sWebhookUrl.equals(customWebhookResponse.sWebhookUrl)) &&
        (this.sWebhookEmailfailed == null ? customWebhookResponse.sWebhookEmailfailed == null : this.sWebhookEmailfailed.equals(customWebhookResponse.sWebhookEmailfailed)) &&
        (this.sWebhookApikey == null ? customWebhookResponse.sWebhookApikey == null : this.sWebhookApikey.equals(customWebhookResponse.sWebhookApikey)) &&
        (this.sWebhookSecret == null ? customWebhookResponse.sWebhookSecret == null : this.sWebhookSecret.equals(customWebhookResponse.sWebhookSecret)) &&
        (this.bWebhookIsactive == null ? customWebhookResponse.bWebhookIsactive == null : this.bWebhookIsactive.equals(customWebhookResponse.bWebhookIsactive)) &&
        (this.bWebhookIssigned == null ? customWebhookResponse.bWebhookIssigned == null : this.bWebhookIssigned.equals(customWebhookResponse.bWebhookIssigned)) &&
        (this.bWebhookSkipsslvalidation == null ? customWebhookResponse.bWebhookSkipsslvalidation == null : this.bWebhookSkipsslvalidation.equals(customWebhookResponse.bWebhookSkipsslvalidation)) &&
        (this.sAuthenticationexternalDescription == null ? customWebhookResponse.sAuthenticationexternalDescription == null : this.sAuthenticationexternalDescription.equals(customWebhookResponse.sAuthenticationexternalDescription)) &&
        (this.objAudit == null ? customWebhookResponse.objAudit == null : this.objAudit.equals(customWebhookResponse.objAudit)) &&
        (this.sWebhookEvent == null ? customWebhookResponse.sWebhookEvent == null : this.sWebhookEvent.equals(customWebhookResponse.sWebhookEvent)) &&
        (this.aObjWebhookheader == null ? customWebhookResponse.aObjWebhookheader == null : this.aObjWebhookheader.equals(customWebhookResponse.aObjWebhookheader)) &&
        (this.pksCustomerCode == null ? customWebhookResponse.pksCustomerCode == null : this.pksCustomerCode.equals(customWebhookResponse.pksCustomerCode)) &&
        (this.bWebhookTest == null ? customWebhookResponse.bWebhookTest == null : this.bWebhookTest.equals(customWebhookResponse.bWebhookTest)) &&
        (this.eWebhookEmittype == null ? customWebhookResponse.eWebhookEmittype == null : this.eWebhookEmittype.equals(customWebhookResponse.eWebhookEmittype));
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
    result = 31 * result + (this.sWebhookEvent == null ? 0: this.sWebhookEvent.hashCode());
    result = 31 * result + (this.aObjWebhookheader == null ? 0: this.aObjWebhookheader.hashCode());
    result = 31 * result + (this.pksCustomerCode == null ? 0: this.pksCustomerCode.hashCode());
    result = 31 * result + (this.bWebhookTest == null ? 0: this.bWebhookTest.hashCode());
    result = 31 * result + (this.eWebhookEmittype == null ? 0: this.eWebhookEmittype.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomWebhookResponse {\n");
    
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
    sb.append("  sWebhookEvent: ").append(sWebhookEvent).append("\n");
    sb.append("  aObjWebhookheader: ").append(aObjWebhookheader).append("\n");
    sb.append("  pksCustomerCode: ").append(pksCustomerCode).append("\n");
    sb.append("  bWebhookTest: ").append(bWebhookTest).append("\n");
    sb.append("  eWebhookEmittype: ").append(eWebhookEmittype).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
