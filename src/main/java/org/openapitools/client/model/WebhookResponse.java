/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.46
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
 * A webhook object
 **/
@ApiModel(description = "A webhook object")
public class WebhookResponse {
  
  @SerializedName("pkiWebhookID")
  private Integer pkiWebhookID = null;
  public enum EWebhookModuleEnum {
     Ezsign,  Management, 
  };
  @SerializedName("eWebhookModule")
  private EWebhookModuleEnum eWebhookModule = null;
  public enum EWebhookEzsigneventEnum {
     DocumentCompleted,  FolderCompleted, 
  };
  @SerializedName("eWebhookEzsignevent")
  private EWebhookEzsigneventEnum eWebhookEzsignevent = null;
  @SerializedName("pksCustomerCode")
  private String pksCustomerCode = null;
  @SerializedName("sWebhookUrl")
  private String sWebhookUrl = null;
  @SerializedName("sWebhookEmailfailed")
  private String sWebhookEmailfailed = null;
  public enum EWebhookManagementeventEnum {
     UserCreated, 
  };
  @SerializedName("eWebhookManagementevent")
  private EWebhookManagementeventEnum eWebhookManagementevent = null;

  /**
   * The Webhook ID. This value is visible in the admin interface.
   **/
  @ApiModelProperty(required = true, value = "The Webhook ID. This value is visible in the admin interface.")
  public Integer getPkiWebhookID() {
    return pkiWebhookID;
  }
  public void setPkiWebhookID(Integer pkiWebhookID) {
    this.pkiWebhookID = pkiWebhookID;
  }

  /**
   * The Module generating the Event.
   **/
  @ApiModelProperty(required = true, value = "The Module generating the Event.")
  public EWebhookModuleEnum getEWebhookModule() {
    return eWebhookModule;
  }
  public void setEWebhookModule(EWebhookModuleEnum eWebhookModule) {
    this.eWebhookModule = eWebhookModule;
  }

  /**
   * This Ezsign Event. This property will be set only if the Module is \"Ezsign\".
   **/
  @ApiModelProperty(value = "This Ezsign Event. This property will be set only if the Module is \"Ezsign\".")
  public EWebhookEzsigneventEnum getEWebhookEzsignevent() {
    return eWebhookEzsignevent;
  }
  public void setEWebhookEzsignevent(EWebhookEzsigneventEnum eWebhookEzsignevent) {
    this.eWebhookEzsignevent = eWebhookEzsignevent;
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
   * The url being called
   **/
  @ApiModelProperty(required = true, value = "The url being called")
  public String getSWebhookUrl() {
    return sWebhookUrl;
  }
  public void setSWebhookUrl(String sWebhookUrl) {
    this.sWebhookUrl = sWebhookUrl;
  }

  /**
   * The email that will receive the webhook in case all attempts fail.
   **/
  @ApiModelProperty(required = true, value = "The email that will receive the webhook in case all attempts fail.")
  public String getSWebhookEmailfailed() {
    return sWebhookEmailfailed;
  }
  public void setSWebhookEmailfailed(String sWebhookEmailfailed) {
    this.sWebhookEmailfailed = sWebhookEmailfailed;
  }

  /**
   * This Management Event. This property will be set only if the Module is \"Management\".
   **/
  @ApiModelProperty(value = "This Management Event. This property will be set only if the Module is \"Management\".")
  public EWebhookManagementeventEnum getEWebhookManagementevent() {
    return eWebhookManagementevent;
  }
  public void setEWebhookManagementevent(EWebhookManagementeventEnum eWebhookManagementevent) {
    this.eWebhookManagementevent = eWebhookManagementevent;
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
        (this.eWebhookModule == null ? webhookResponse.eWebhookModule == null : this.eWebhookModule.equals(webhookResponse.eWebhookModule)) &&
        (this.eWebhookEzsignevent == null ? webhookResponse.eWebhookEzsignevent == null : this.eWebhookEzsignevent.equals(webhookResponse.eWebhookEzsignevent)) &&
        (this.pksCustomerCode == null ? webhookResponse.pksCustomerCode == null : this.pksCustomerCode.equals(webhookResponse.pksCustomerCode)) &&
        (this.sWebhookUrl == null ? webhookResponse.sWebhookUrl == null : this.sWebhookUrl.equals(webhookResponse.sWebhookUrl)) &&
        (this.sWebhookEmailfailed == null ? webhookResponse.sWebhookEmailfailed == null : this.sWebhookEmailfailed.equals(webhookResponse.sWebhookEmailfailed)) &&
        (this.eWebhookManagementevent == null ? webhookResponse.eWebhookManagementevent == null : this.eWebhookManagementevent.equals(webhookResponse.eWebhookManagementevent));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiWebhookID == null ? 0: this.pkiWebhookID.hashCode());
    result = 31 * result + (this.eWebhookModule == null ? 0: this.eWebhookModule.hashCode());
    result = 31 * result + (this.eWebhookEzsignevent == null ? 0: this.eWebhookEzsignevent.hashCode());
    result = 31 * result + (this.pksCustomerCode == null ? 0: this.pksCustomerCode.hashCode());
    result = 31 * result + (this.sWebhookUrl == null ? 0: this.sWebhookUrl.hashCode());
    result = 31 * result + (this.sWebhookEmailfailed == null ? 0: this.sWebhookEmailfailed.hashCode());
    result = 31 * result + (this.eWebhookManagementevent == null ? 0: this.eWebhookManagementevent.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookResponse {\n");
    
    sb.append("  pkiWebhookID: ").append(pkiWebhookID).append("\n");
    sb.append("  eWebhookModule: ").append(eWebhookModule).append("\n");
    sb.append("  eWebhookEzsignevent: ").append(eWebhookEzsignevent).append("\n");
    sb.append("  pksCustomerCode: ").append(pksCustomerCode).append("\n");
    sb.append("  sWebhookUrl: ").append(sWebhookUrl).append("\n");
    sb.append("  sWebhookEmailfailed: ").append(sWebhookEmailfailed).append("\n");
    sb.append("  eWebhookManagementevent: ").append(eWebhookManagementevent).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
