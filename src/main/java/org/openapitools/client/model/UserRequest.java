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

import org.openapitools.client.model.EmailRequest;
import org.openapitools.client.model.FieldEUserEzsignaccess;
import org.openapitools.client.model.FieldEUserLogintype;
import org.openapitools.client.model.FieldEUserType;
import org.openapitools.client.model.PhoneRequest;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A User Object
 **/
@ApiModel(description = "A User Object")
public class UserRequest {
  
  @SerializedName("pkiUserID")
  private Integer pkiUserID = null;
  @SerializedName("fkiAgentID")
  private Integer fkiAgentID = null;
  @SerializedName("fkiBrokerID")
  private Integer fkiBrokerID = null;
  @SerializedName("fkiAssistantID")
  private Integer fkiAssistantID = null;
  @SerializedName("fkiEmployeeID")
  private Integer fkiEmployeeID = null;
  @SerializedName("fkiCompanyIDDefault")
  private Integer fkiCompanyIDDefault = null;
  @SerializedName("fkiDepartmentIDDefault")
  private Integer fkiDepartmentIDDefault = null;
  @SerializedName("fkiTimezoneID")
  private Integer fkiTimezoneID = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("objEmail")
  private EmailRequest objEmail = null;
  @SerializedName("fkiBillingentityinternalID")
  private Integer fkiBillingentityinternalID = null;
  @SerializedName("objPhoneHome")
  private PhoneRequest objPhoneHome = null;
  @SerializedName("objPhoneSMS")
  private PhoneRequest objPhoneSMS = null;
  @SerializedName("fkiSecretquestionID")
  private Integer fkiSecretquestionID = null;
  @SerializedName("sUserSecretresponse")
  private String sUserSecretresponse = null;
  @SerializedName("fkiModuleIDForm")
  private Integer fkiModuleIDForm = null;
  @SerializedName("eUserType")
  private FieldEUserType eUserType = null;
  @SerializedName("eUserLogintype")
  private FieldEUserLogintype eUserLogintype = null;
  @SerializedName("sUserFirstname")
  private String sUserFirstname = null;
  @SerializedName("sUserLastname")
  private String sUserLastname = null;
  @SerializedName("sUserLoginname")
  private String sUserLoginname = null;
  @SerializedName("sUserJobtitle")
  private String sUserJobtitle = null;
  @SerializedName("eUserEzsignaccess")
  private FieldEUserEzsignaccess eUserEzsignaccess = null;
  @SerializedName("bUserIsactive")
  private Boolean bUserIsactive = null;
  @SerializedName("bUserValidatebyadministration")
  private Boolean bUserValidatebyadministration = null;
  @SerializedName("bUserValidatebydirector")
  private Boolean bUserValidatebydirector = null;
  @SerializedName("bUserAttachmentautoverified")
  private Boolean bUserAttachmentautoverified = null;
  @SerializedName("bUserChangepassword")
  private Boolean bUserChangepassword = null;

  /**
   * The unique ID of the User
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the User")
  public Integer getPkiUserID() {
    return pkiUserID;
  }
  public void setPkiUserID(Integer pkiUserID) {
    this.pkiUserID = pkiUserID;
  }

  /**
   * The unique ID of the Agent.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Agent.")
  public Integer getFkiAgentID() {
    return fkiAgentID;
  }
  public void setFkiAgentID(Integer fkiAgentID) {
    this.fkiAgentID = fkiAgentID;
  }

  /**
   * The unique ID of the Broker.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Broker.")
  public Integer getFkiBrokerID() {
    return fkiBrokerID;
  }
  public void setFkiBrokerID(Integer fkiBrokerID) {
    this.fkiBrokerID = fkiBrokerID;
  }

  /**
   * The unique ID of the Assistant.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Assistant.")
  public Integer getFkiAssistantID() {
    return fkiAssistantID;
  }
  public void setFkiAssistantID(Integer fkiAssistantID) {
    this.fkiAssistantID = fkiAssistantID;
  }

  /**
   * The unique ID of the Employee.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Employee.")
  public Integer getFkiEmployeeID() {
    return fkiEmployeeID;
  }
  public void setFkiEmployeeID(Integer fkiEmployeeID) {
    this.fkiEmployeeID = fkiEmployeeID;
  }

  /**
   * The unique ID of the Company
   * minimum: 1
   * maximum: 255
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Company")
  public Integer getFkiCompanyIDDefault() {
    return fkiCompanyIDDefault;
  }
  public void setFkiCompanyIDDefault(Integer fkiCompanyIDDefault) {
    this.fkiCompanyIDDefault = fkiCompanyIDDefault;
  }

  /**
   * The unique ID of the Department
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Department")
  public Integer getFkiDepartmentIDDefault() {
    return fkiDepartmentIDDefault;
  }
  public void setFkiDepartmentIDDefault(Integer fkiDepartmentIDDefault) {
    this.fkiDepartmentIDDefault = fkiDepartmentIDDefault;
  }

  /**
   * The unique ID of the Timezone
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Timezone")
  public Integer getFkiTimezoneID() {
    return fkiTimezoneID;
  }
  public void setFkiTimezoneID(Integer fkiTimezoneID) {
    this.fkiTimezoneID = fkiTimezoneID;
  }

  /**
   * The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
   * minimum: 1
   * maximum: 2
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|")
  public Integer getFkiLanguageID() {
    return fkiLanguageID;
  }
  public void setFkiLanguageID(Integer fkiLanguageID) {
    this.fkiLanguageID = fkiLanguageID;
  }

  /**
   * An Email Object and children to create a complete structure
   **/
  @ApiModelProperty(required = true, value = "An Email Object and children to create a complete structure")
  public EmailRequest getObjEmail() {
    return objEmail;
  }
  public void setObjEmail(EmailRequest objEmail) {
    this.objEmail = objEmail;
  }

  /**
   * The unique ID of the Billingentityinternal.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Billingentityinternal.")
  public Integer getFkiBillingentityinternalID() {
    return fkiBillingentityinternalID;
  }
  public void setFkiBillingentityinternalID(Integer fkiBillingentityinternalID) {
    this.fkiBillingentityinternalID = fkiBillingentityinternalID;
  }

  /**
   * A Phone Object and children to create a complete structure
   **/
  @ApiModelProperty(value = "A Phone Object and children to create a complete structure")
  public PhoneRequest getObjPhoneHome() {
    return objPhoneHome;
  }
  public void setObjPhoneHome(PhoneRequest objPhoneHome) {
    this.objPhoneHome = objPhoneHome;
  }

  /**
   * A Phone Object and children to create a complete structure
   **/
  @ApiModelProperty(value = "A Phone Object and children to create a complete structure")
  public PhoneRequest getObjPhoneSMS() {
    return objPhoneSMS;
  }
  public void setObjPhoneSMS(PhoneRequest objPhoneSMS) {
    this.objPhoneSMS = objPhoneSMS;
  }

  /**
   * The unique ID of the Secretquestion.  Valid values:  |Value|Description| |-|-| |1|The name of the hospital in which you were born| |2|The name of your grade school| |3|The last name of your favorite teacher| |4|Your favorite sports team| |5|Your favorite TV show| |6|Your favorite movie| |7|The name of the street on which you grew up| |8|The name of your first employer| |9|Your first car| |10|Your favorite food| |11|The name of your first pet| |12|Favorite musician/band| |13|What instrument you play| |14|Your father's middle name| |15|Your mother's maiden name| |16|Name of your eldest child| |17|Your spouse's middle name| |18|Favorite restaurant| |19|Childhood nickname| |20|Favorite vacation destination| |21|Your boat's name| |22|Date of Birth (YYYY-MM-DD)| |22|Secret Code| |22|Your reference code|
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Secretquestion.  Valid values:  |Value|Description| |-|-| |1|The name of the hospital in which you were born| |2|The name of your grade school| |3|The last name of your favorite teacher| |4|Your favorite sports team| |5|Your favorite TV show| |6|Your favorite movie| |7|The name of the street on which you grew up| |8|The name of your first employer| |9|Your first car| |10|Your favorite food| |11|The name of your first pet| |12|Favorite musician/band| |13|What instrument you play| |14|Your father's middle name| |15|Your mother's maiden name| |16|Name of your eldest child| |17|Your spouse's middle name| |18|Favorite restaurant| |19|Childhood nickname| |20|Favorite vacation destination| |21|Your boat's name| |22|Date of Birth (YYYY-MM-DD)| |22|Secret Code| |22|Your reference code|")
  public Integer getFkiSecretquestionID() {
    return fkiSecretquestionID;
  }
  public void setFkiSecretquestionID(Integer fkiSecretquestionID) {
    this.fkiSecretquestionID = fkiSecretquestionID;
  }

  /**
   * The answer to the Secretquestion
   **/
  @ApiModelProperty(value = "The answer to the Secretquestion")
  public String getSUserSecretresponse() {
    return sUserSecretresponse;
  }
  public void setSUserSecretresponse(String sUserSecretresponse) {
    this.sUserSecretresponse = sUserSecretresponse;
  }

  /**
   * The unique ID of the Module
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Module")
  public Integer getFkiModuleIDForm() {
    return fkiModuleIDForm;
  }
  public void setFkiModuleIDForm(Integer fkiModuleIDForm) {
    this.fkiModuleIDForm = fkiModuleIDForm;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEUserType getEUserType() {
    return eUserType;
  }
  public void setEUserType(FieldEUserType eUserType) {
    this.eUserType = eUserType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEUserLogintype getEUserLogintype() {
    return eUserLogintype;
  }
  public void setEUserLogintype(FieldEUserLogintype eUserLogintype) {
    this.eUserLogintype = eUserLogintype;
  }

  /**
   * The first name of the user
   **/
  @ApiModelProperty(required = true, value = "The first name of the user")
  public String getSUserFirstname() {
    return sUserFirstname;
  }
  public void setSUserFirstname(String sUserFirstname) {
    this.sUserFirstname = sUserFirstname;
  }

  /**
   * The last name of the user
   **/
  @ApiModelProperty(required = true, value = "The last name of the user")
  public String getSUserLastname() {
    return sUserLastname;
  }
  public void setSUserLastname(String sUserLastname) {
    this.sUserLastname = sUserLastname;
  }

  /**
   * The login name of the User.
   **/
  @ApiModelProperty(required = true, value = "The login name of the User.")
  public String getSUserLoginname() {
    return sUserLoginname;
  }
  public void setSUserLoginname(String sUserLoginname) {
    this.sUserLoginname = sUserLoginname;
  }

  /**
   * The job title of the user
   **/
  @ApiModelProperty(value = "The job title of the user")
  public String getSUserJobtitle() {
    return sUserJobtitle;
  }
  public void setSUserJobtitle(String sUserJobtitle) {
    this.sUserJobtitle = sUserJobtitle;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEUserEzsignaccess getEUserEzsignaccess() {
    return eUserEzsignaccess;
  }
  public void setEUserEzsignaccess(FieldEUserEzsignaccess eUserEzsignaccess) {
    this.eUserEzsignaccess = eUserEzsignaccess;
  }

  /**
   * Whether the User is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the User is active or not")
  public Boolean getBUserIsactive() {
    return bUserIsactive;
  }
  public void setBUserIsactive(Boolean bUserIsactive) {
    this.bUserIsactive = bUserIsactive;
  }

  /**
   * Whether if the transactions in which the User is implicated must be validated by administrative personnel or not
   **/
  @ApiModelProperty(value = "Whether if the transactions in which the User is implicated must be validated by administrative personnel or not")
  public Boolean getBUserValidatebyadministration() {
    return bUserValidatebyadministration;
  }
  public void setBUserValidatebyadministration(Boolean bUserValidatebyadministration) {
    this.bUserValidatebyadministration = bUserValidatebyadministration;
  }

  /**
   * Whether if the transactions in which the User is implicated must be validated by a director or not
   **/
  @ApiModelProperty(value = "Whether if the transactions in which the User is implicated must be validated by a director or not")
  public Boolean getBUserValidatebydirector() {
    return bUserValidatebydirector;
  }
  public void setBUserValidatebydirector(Boolean bUserValidatebydirector) {
    this.bUserValidatebydirector = bUserValidatebydirector;
  }

  /**
   * Whether if Attachments uploaded by the User must be validated or not
   **/
  @ApiModelProperty(value = "Whether if Attachments uploaded by the User must be validated or not")
  public Boolean getBUserAttachmentautoverified() {
    return bUserAttachmentautoverified;
  }
  public void setBUserAttachmentautoverified(Boolean bUserAttachmentautoverified) {
    this.bUserAttachmentautoverified = bUserAttachmentautoverified;
  }

  /**
   * Whether if the User is forced to change its password
   **/
  @ApiModelProperty(value = "Whether if the User is forced to change its password")
  public Boolean getBUserChangepassword() {
    return bUserChangepassword;
  }
  public void setBUserChangepassword(Boolean bUserChangepassword) {
    this.bUserChangepassword = bUserChangepassword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRequest userRequest = (UserRequest) o;
    return (this.pkiUserID == null ? userRequest.pkiUserID == null : this.pkiUserID.equals(userRequest.pkiUserID)) &&
        (this.fkiAgentID == null ? userRequest.fkiAgentID == null : this.fkiAgentID.equals(userRequest.fkiAgentID)) &&
        (this.fkiBrokerID == null ? userRequest.fkiBrokerID == null : this.fkiBrokerID.equals(userRequest.fkiBrokerID)) &&
        (this.fkiAssistantID == null ? userRequest.fkiAssistantID == null : this.fkiAssistantID.equals(userRequest.fkiAssistantID)) &&
        (this.fkiEmployeeID == null ? userRequest.fkiEmployeeID == null : this.fkiEmployeeID.equals(userRequest.fkiEmployeeID)) &&
        (this.fkiCompanyIDDefault == null ? userRequest.fkiCompanyIDDefault == null : this.fkiCompanyIDDefault.equals(userRequest.fkiCompanyIDDefault)) &&
        (this.fkiDepartmentIDDefault == null ? userRequest.fkiDepartmentIDDefault == null : this.fkiDepartmentIDDefault.equals(userRequest.fkiDepartmentIDDefault)) &&
        (this.fkiTimezoneID == null ? userRequest.fkiTimezoneID == null : this.fkiTimezoneID.equals(userRequest.fkiTimezoneID)) &&
        (this.fkiLanguageID == null ? userRequest.fkiLanguageID == null : this.fkiLanguageID.equals(userRequest.fkiLanguageID)) &&
        (this.objEmail == null ? userRequest.objEmail == null : this.objEmail.equals(userRequest.objEmail)) &&
        (this.fkiBillingentityinternalID == null ? userRequest.fkiBillingentityinternalID == null : this.fkiBillingentityinternalID.equals(userRequest.fkiBillingentityinternalID)) &&
        (this.objPhoneHome == null ? userRequest.objPhoneHome == null : this.objPhoneHome.equals(userRequest.objPhoneHome)) &&
        (this.objPhoneSMS == null ? userRequest.objPhoneSMS == null : this.objPhoneSMS.equals(userRequest.objPhoneSMS)) &&
        (this.fkiSecretquestionID == null ? userRequest.fkiSecretquestionID == null : this.fkiSecretquestionID.equals(userRequest.fkiSecretquestionID)) &&
        (this.sUserSecretresponse == null ? userRequest.sUserSecretresponse == null : this.sUserSecretresponse.equals(userRequest.sUserSecretresponse)) &&
        (this.fkiModuleIDForm == null ? userRequest.fkiModuleIDForm == null : this.fkiModuleIDForm.equals(userRequest.fkiModuleIDForm)) &&
        (this.eUserType == null ? userRequest.eUserType == null : this.eUserType.equals(userRequest.eUserType)) &&
        (this.eUserLogintype == null ? userRequest.eUserLogintype == null : this.eUserLogintype.equals(userRequest.eUserLogintype)) &&
        (this.sUserFirstname == null ? userRequest.sUserFirstname == null : this.sUserFirstname.equals(userRequest.sUserFirstname)) &&
        (this.sUserLastname == null ? userRequest.sUserLastname == null : this.sUserLastname.equals(userRequest.sUserLastname)) &&
        (this.sUserLoginname == null ? userRequest.sUserLoginname == null : this.sUserLoginname.equals(userRequest.sUserLoginname)) &&
        (this.sUserJobtitle == null ? userRequest.sUserJobtitle == null : this.sUserJobtitle.equals(userRequest.sUserJobtitle)) &&
        (this.eUserEzsignaccess == null ? userRequest.eUserEzsignaccess == null : this.eUserEzsignaccess.equals(userRequest.eUserEzsignaccess)) &&
        (this.bUserIsactive == null ? userRequest.bUserIsactive == null : this.bUserIsactive.equals(userRequest.bUserIsactive)) &&
        (this.bUserValidatebyadministration == null ? userRequest.bUserValidatebyadministration == null : this.bUserValidatebyadministration.equals(userRequest.bUserValidatebyadministration)) &&
        (this.bUserValidatebydirector == null ? userRequest.bUserValidatebydirector == null : this.bUserValidatebydirector.equals(userRequest.bUserValidatebydirector)) &&
        (this.bUserAttachmentautoverified == null ? userRequest.bUserAttachmentautoverified == null : this.bUserAttachmentautoverified.equals(userRequest.bUserAttachmentautoverified)) &&
        (this.bUserChangepassword == null ? userRequest.bUserChangepassword == null : this.bUserChangepassword.equals(userRequest.bUserChangepassword));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiUserID == null ? 0: this.pkiUserID.hashCode());
    result = 31 * result + (this.fkiAgentID == null ? 0: this.fkiAgentID.hashCode());
    result = 31 * result + (this.fkiBrokerID == null ? 0: this.fkiBrokerID.hashCode());
    result = 31 * result + (this.fkiAssistantID == null ? 0: this.fkiAssistantID.hashCode());
    result = 31 * result + (this.fkiEmployeeID == null ? 0: this.fkiEmployeeID.hashCode());
    result = 31 * result + (this.fkiCompanyIDDefault == null ? 0: this.fkiCompanyIDDefault.hashCode());
    result = 31 * result + (this.fkiDepartmentIDDefault == null ? 0: this.fkiDepartmentIDDefault.hashCode());
    result = 31 * result + (this.fkiTimezoneID == null ? 0: this.fkiTimezoneID.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.objEmail == null ? 0: this.objEmail.hashCode());
    result = 31 * result + (this.fkiBillingentityinternalID == null ? 0: this.fkiBillingentityinternalID.hashCode());
    result = 31 * result + (this.objPhoneHome == null ? 0: this.objPhoneHome.hashCode());
    result = 31 * result + (this.objPhoneSMS == null ? 0: this.objPhoneSMS.hashCode());
    result = 31 * result + (this.fkiSecretquestionID == null ? 0: this.fkiSecretquestionID.hashCode());
    result = 31 * result + (this.sUserSecretresponse == null ? 0: this.sUserSecretresponse.hashCode());
    result = 31 * result + (this.fkiModuleIDForm == null ? 0: this.fkiModuleIDForm.hashCode());
    result = 31 * result + (this.eUserType == null ? 0: this.eUserType.hashCode());
    result = 31 * result + (this.eUserLogintype == null ? 0: this.eUserLogintype.hashCode());
    result = 31 * result + (this.sUserFirstname == null ? 0: this.sUserFirstname.hashCode());
    result = 31 * result + (this.sUserLastname == null ? 0: this.sUserLastname.hashCode());
    result = 31 * result + (this.sUserLoginname == null ? 0: this.sUserLoginname.hashCode());
    result = 31 * result + (this.sUserJobtitle == null ? 0: this.sUserJobtitle.hashCode());
    result = 31 * result + (this.eUserEzsignaccess == null ? 0: this.eUserEzsignaccess.hashCode());
    result = 31 * result + (this.bUserIsactive == null ? 0: this.bUserIsactive.hashCode());
    result = 31 * result + (this.bUserValidatebyadministration == null ? 0: this.bUserValidatebyadministration.hashCode());
    result = 31 * result + (this.bUserValidatebydirector == null ? 0: this.bUserValidatebydirector.hashCode());
    result = 31 * result + (this.bUserAttachmentautoverified == null ? 0: this.bUserAttachmentautoverified.hashCode());
    result = 31 * result + (this.bUserChangepassword == null ? 0: this.bUserChangepassword.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRequest {\n");
    
    sb.append("  pkiUserID: ").append(pkiUserID).append("\n");
    sb.append("  fkiAgentID: ").append(fkiAgentID).append("\n");
    sb.append("  fkiBrokerID: ").append(fkiBrokerID).append("\n");
    sb.append("  fkiAssistantID: ").append(fkiAssistantID).append("\n");
    sb.append("  fkiEmployeeID: ").append(fkiEmployeeID).append("\n");
    sb.append("  fkiCompanyIDDefault: ").append(fkiCompanyIDDefault).append("\n");
    sb.append("  fkiDepartmentIDDefault: ").append(fkiDepartmentIDDefault).append("\n");
    sb.append("  fkiTimezoneID: ").append(fkiTimezoneID).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  objEmail: ").append(objEmail).append("\n");
    sb.append("  fkiBillingentityinternalID: ").append(fkiBillingentityinternalID).append("\n");
    sb.append("  objPhoneHome: ").append(objPhoneHome).append("\n");
    sb.append("  objPhoneSMS: ").append(objPhoneSMS).append("\n");
    sb.append("  fkiSecretquestionID: ").append(fkiSecretquestionID).append("\n");
    sb.append("  sUserSecretresponse: ").append(sUserSecretresponse).append("\n");
    sb.append("  fkiModuleIDForm: ").append(fkiModuleIDForm).append("\n");
    sb.append("  eUserType: ").append(eUserType).append("\n");
    sb.append("  eUserLogintype: ").append(eUserLogintype).append("\n");
    sb.append("  sUserFirstname: ").append(sUserFirstname).append("\n");
    sb.append("  sUserLastname: ").append(sUserLastname).append("\n");
    sb.append("  sUserLoginname: ").append(sUserLoginname).append("\n");
    sb.append("  sUserJobtitle: ").append(sUserJobtitle).append("\n");
    sb.append("  eUserEzsignaccess: ").append(eUserEzsignaccess).append("\n");
    sb.append("  bUserIsactive: ").append(bUserIsactive).append("\n");
    sb.append("  bUserValidatebyadministration: ").append(bUserValidatebyadministration).append("\n");
    sb.append("  bUserValidatebydirector: ").append(bUserValidatebydirector).append("\n");
    sb.append("  bUserAttachmentautoverified: ").append(bUserAttachmentautoverified).append("\n");
    sb.append("  bUserChangepassword: ").append(bUserChangepassword).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
