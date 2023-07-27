/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.CommonAudit;
import org.openapitools.client.model.CustomContactNameResponse;
import org.openapitools.client.model.MultilingualApikeyDescription;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Apikey Object and children to create a complete structure
 **/
@ApiModel(description = "An Apikey Object and children to create a complete structure")
public class ApikeyResponseCompound {
  
  @SerializedName("pkiApikeyID")
  private Integer pkiApikeyID = null;
  @SerializedName("fkiUserID")
  private Integer fkiUserID = null;
  @SerializedName("objApikeyDescription")
  private MultilingualApikeyDescription objApikeyDescription = null;
  @SerializedName("objContactName")
  private CustomContactNameResponse objContactName = null;
  @SerializedName("sApikeyApikey")
  private String sApikeyApikey = null;
  @SerializedName("sApikeySecret")
  private String sApikeySecret = null;
  @SerializedName("bApikeyIsactive")
  private Boolean bApikeyIsactive = null;
  @SerializedName("bApikeyIssigned")
  private Boolean bApikeyIssigned = null;
  @SerializedName("objAudit")
  private CommonAudit objAudit = null;

  /**
   * The unique ID of the Apikey
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Apikey")
  public Integer getPkiApikeyID() {
    return pkiApikeyID;
  }
  public void setPkiApikeyID(Integer pkiApikeyID) {
    this.pkiApikeyID = pkiApikeyID;
  }

  /**
   * The unique ID of the User
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the User")
  public Integer getFkiUserID() {
    return fkiUserID;
  }
  public void setFkiUserID(Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public MultilingualApikeyDescription getObjApikeyDescription() {
    return objApikeyDescription;
  }
  public void setObjApikeyDescription(MultilingualApikeyDescription objApikeyDescription) {
    this.objApikeyDescription = objApikeyDescription;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CustomContactNameResponse getObjContactName() {
    return objContactName;
  }
  public void setObjContactName(CustomContactNameResponse objContactName) {
    this.objContactName = objContactName;
  }

  /**
   * The Apikey for the API key.  This will be hidden if we are not creating or regenerating the Apikey.
   **/
  @ApiModelProperty(value = "The Apikey for the API key.  This will be hidden if we are not creating or regenerating the Apikey.")
  public String getSApikeyApikey() {
    return sApikeyApikey;
  }
  public void setSApikeyApikey(String sApikeyApikey) {
    this.sApikeyApikey = sApikeyApikey;
  }

  /**
   * The Secret for the API key.  This will be hidden if we are not creating or regenerating the Apikey.
   **/
  @ApiModelProperty(value = "The Secret for the API key.  This will be hidden if we are not creating or regenerating the Apikey.")
  public String getSApikeySecret() {
    return sApikeySecret;
  }
  public void setSApikeySecret(String sApikeySecret) {
    this.sApikeySecret = sApikeySecret;
  }

  /**
   * Whether the apikey is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the apikey is active or not")
  public Boolean getBApikeyIsactive() {
    return bApikeyIsactive;
  }
  public void setBApikeyIsactive(Boolean bApikeyIsactive) {
    this.bApikeyIsactive = bApikeyIsactive;
  }

  /**
   * Whether the apikey is signed or not
   **/
  @ApiModelProperty(value = "Whether the apikey is signed or not")
  public Boolean getBApikeyIssigned() {
    return bApikeyIssigned;
  }
  public void setBApikeyIssigned(Boolean bApikeyIssigned) {
    this.bApikeyIssigned = bApikeyIssigned;
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
    ApikeyResponseCompound apikeyResponseCompound = (ApikeyResponseCompound) o;
    return (this.pkiApikeyID == null ? apikeyResponseCompound.pkiApikeyID == null : this.pkiApikeyID.equals(apikeyResponseCompound.pkiApikeyID)) &&
        (this.fkiUserID == null ? apikeyResponseCompound.fkiUserID == null : this.fkiUserID.equals(apikeyResponseCompound.fkiUserID)) &&
        (this.objApikeyDescription == null ? apikeyResponseCompound.objApikeyDescription == null : this.objApikeyDescription.equals(apikeyResponseCompound.objApikeyDescription)) &&
        (this.objContactName == null ? apikeyResponseCompound.objContactName == null : this.objContactName.equals(apikeyResponseCompound.objContactName)) &&
        (this.sApikeyApikey == null ? apikeyResponseCompound.sApikeyApikey == null : this.sApikeyApikey.equals(apikeyResponseCompound.sApikeyApikey)) &&
        (this.sApikeySecret == null ? apikeyResponseCompound.sApikeySecret == null : this.sApikeySecret.equals(apikeyResponseCompound.sApikeySecret)) &&
        (this.bApikeyIsactive == null ? apikeyResponseCompound.bApikeyIsactive == null : this.bApikeyIsactive.equals(apikeyResponseCompound.bApikeyIsactive)) &&
        (this.bApikeyIssigned == null ? apikeyResponseCompound.bApikeyIssigned == null : this.bApikeyIssigned.equals(apikeyResponseCompound.bApikeyIssigned)) &&
        (this.objAudit == null ? apikeyResponseCompound.objAudit == null : this.objAudit.equals(apikeyResponseCompound.objAudit));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiApikeyID == null ? 0: this.pkiApikeyID.hashCode());
    result = 31 * result + (this.fkiUserID == null ? 0: this.fkiUserID.hashCode());
    result = 31 * result + (this.objApikeyDescription == null ? 0: this.objApikeyDescription.hashCode());
    result = 31 * result + (this.objContactName == null ? 0: this.objContactName.hashCode());
    result = 31 * result + (this.sApikeyApikey == null ? 0: this.sApikeyApikey.hashCode());
    result = 31 * result + (this.sApikeySecret == null ? 0: this.sApikeySecret.hashCode());
    result = 31 * result + (this.bApikeyIsactive == null ? 0: this.bApikeyIsactive.hashCode());
    result = 31 * result + (this.bApikeyIssigned == null ? 0: this.bApikeyIssigned.hashCode());
    result = 31 * result + (this.objAudit == null ? 0: this.objAudit.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApikeyResponseCompound {\n");
    
    sb.append("  pkiApikeyID: ").append(pkiApikeyID).append("\n");
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("  objApikeyDescription: ").append(objApikeyDescription).append("\n");
    sb.append("  objContactName: ").append(objContactName).append("\n");
    sb.append("  sApikeyApikey: ").append(sApikeyApikey).append("\n");
    sb.append("  sApikeySecret: ").append(sApikeySecret).append("\n");
    sb.append("  bApikeyIsactive: ").append(bApikeyIsactive).append("\n");
    sb.append("  bApikeyIssigned: ").append(bApikeyIssigned).append("\n");
    sb.append("  objAudit: ").append(objAudit).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
