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
import org.openapitools.client.model.FieldEWebhookEzsignevent;
import org.openapitools.client.model.FieldEWebhookManagementevent;
import org.openapitools.client.model.FieldEWebhookModule;
import org.openapitools.client.model.WebhookheaderRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Webhook Object and children
 **/
@ApiModel(description = "A Webhook Object and children")
public class WebhookRequestCompound {
  
  @SerializedName("pkiWebhookID")
  private Integer pkiWebhookID = null;
  @SerializedName("fkiAuthenticationexternalID")
  private Integer fkiAuthenticationexternalID = null;
  @SerializedName("fkiEzsignfoldertypeID")
  private Integer fkiEzsignfoldertypeID = null;
  @SerializedName("sWebhookDescription")
  private String sWebhookDescription = null;
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
  @SerializedName("bWebhookIsactive")
  private Boolean bWebhookIsactive = null;
  @SerializedName("bWebhookIssigned")
  private Boolean bWebhookIssigned = null;
  @SerializedName("bWebhookSkipsslvalidation")
  private Boolean bWebhookSkipsslvalidation = null;
  @SerializedName("a_objWebhookheader")
  private List<WebhookheaderRequestCompound> aObjWebhookheader = null;

  /**
   * The unique ID of the Webhook
   **/
  @ApiModelProperty(value = "The unique ID of the Webhook")
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
  @ApiModelProperty(value = "Whether the requests will be signed or not")
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
   **/
  @ApiModelProperty(value = "")
  public List<WebhookheaderRequestCompound> getAObjWebhookheader() {
    return aObjWebhookheader;
  }
  public void setAObjWebhookheader(List<WebhookheaderRequestCompound> aObjWebhookheader) {
    this.aObjWebhookheader = aObjWebhookheader;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookRequestCompound webhookRequestCompound = (WebhookRequestCompound) o;
    return (this.pkiWebhookID == null ? webhookRequestCompound.pkiWebhookID == null : this.pkiWebhookID.equals(webhookRequestCompound.pkiWebhookID)) &&
        (this.fkiAuthenticationexternalID == null ? webhookRequestCompound.fkiAuthenticationexternalID == null : this.fkiAuthenticationexternalID.equals(webhookRequestCompound.fkiAuthenticationexternalID)) &&
        (this.fkiEzsignfoldertypeID == null ? webhookRequestCompound.fkiEzsignfoldertypeID == null : this.fkiEzsignfoldertypeID.equals(webhookRequestCompound.fkiEzsignfoldertypeID)) &&
        (this.sWebhookDescription == null ? webhookRequestCompound.sWebhookDescription == null : this.sWebhookDescription.equals(webhookRequestCompound.sWebhookDescription)) &&
        (this.eWebhookModule == null ? webhookRequestCompound.eWebhookModule == null : this.eWebhookModule.equals(webhookRequestCompound.eWebhookModule)) &&
        (this.eWebhookEzsignevent == null ? webhookRequestCompound.eWebhookEzsignevent == null : this.eWebhookEzsignevent.equals(webhookRequestCompound.eWebhookEzsignevent)) &&
        (this.eWebhookManagementevent == null ? webhookRequestCompound.eWebhookManagementevent == null : this.eWebhookManagementevent.equals(webhookRequestCompound.eWebhookManagementevent)) &&
        (this.sWebhookUrl == null ? webhookRequestCompound.sWebhookUrl == null : this.sWebhookUrl.equals(webhookRequestCompound.sWebhookUrl)) &&
        (this.sWebhookEmailfailed == null ? webhookRequestCompound.sWebhookEmailfailed == null : this.sWebhookEmailfailed.equals(webhookRequestCompound.sWebhookEmailfailed)) &&
        (this.bWebhookIsactive == null ? webhookRequestCompound.bWebhookIsactive == null : this.bWebhookIsactive.equals(webhookRequestCompound.bWebhookIsactive)) &&
        (this.bWebhookIssigned == null ? webhookRequestCompound.bWebhookIssigned == null : this.bWebhookIssigned.equals(webhookRequestCompound.bWebhookIssigned)) &&
        (this.bWebhookSkipsslvalidation == null ? webhookRequestCompound.bWebhookSkipsslvalidation == null : this.bWebhookSkipsslvalidation.equals(webhookRequestCompound.bWebhookSkipsslvalidation)) &&
        (this.aObjWebhookheader == null ? webhookRequestCompound.aObjWebhookheader == null : this.aObjWebhookheader.equals(webhookRequestCompound.aObjWebhookheader));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiWebhookID == null ? 0: this.pkiWebhookID.hashCode());
    result = 31 * result + (this.fkiAuthenticationexternalID == null ? 0: this.fkiAuthenticationexternalID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldertypeID == null ? 0: this.fkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.sWebhookDescription == null ? 0: this.sWebhookDescription.hashCode());
    result = 31 * result + (this.eWebhookModule == null ? 0: this.eWebhookModule.hashCode());
    result = 31 * result + (this.eWebhookEzsignevent == null ? 0: this.eWebhookEzsignevent.hashCode());
    result = 31 * result + (this.eWebhookManagementevent == null ? 0: this.eWebhookManagementevent.hashCode());
    result = 31 * result + (this.sWebhookUrl == null ? 0: this.sWebhookUrl.hashCode());
    result = 31 * result + (this.sWebhookEmailfailed == null ? 0: this.sWebhookEmailfailed.hashCode());
    result = 31 * result + (this.bWebhookIsactive == null ? 0: this.bWebhookIsactive.hashCode());
    result = 31 * result + (this.bWebhookIssigned == null ? 0: this.bWebhookIssigned.hashCode());
    result = 31 * result + (this.bWebhookSkipsslvalidation == null ? 0: this.bWebhookSkipsslvalidation.hashCode());
    result = 31 * result + (this.aObjWebhookheader == null ? 0: this.aObjWebhookheader.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookRequestCompound {\n");
    
    sb.append("  pkiWebhookID: ").append(pkiWebhookID).append("\n");
    sb.append("  fkiAuthenticationexternalID: ").append(fkiAuthenticationexternalID).append("\n");
    sb.append("  fkiEzsignfoldertypeID: ").append(fkiEzsignfoldertypeID).append("\n");
    sb.append("  sWebhookDescription: ").append(sWebhookDescription).append("\n");
    sb.append("  eWebhookModule: ").append(eWebhookModule).append("\n");
    sb.append("  eWebhookEzsignevent: ").append(eWebhookEzsignevent).append("\n");
    sb.append("  eWebhookManagementevent: ").append(eWebhookManagementevent).append("\n");
    sb.append("  sWebhookUrl: ").append(sWebhookUrl).append("\n");
    sb.append("  sWebhookEmailfailed: ").append(sWebhookEmailfailed).append("\n");
    sb.append("  bWebhookIsactive: ").append(bWebhookIsactive).append("\n");
    sb.append("  bWebhookIssigned: ").append(bWebhookIssigned).append("\n");
    sb.append("  bWebhookSkipsslvalidation: ").append(bWebhookSkipsslvalidation).append("\n");
    sb.append("  aObjWebhookheader: ").append(aObjWebhookheader).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
