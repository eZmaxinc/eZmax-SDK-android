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
import org.openapitools.client.model.FieldEEzsignfoldertypeDisposal;
import org.openapitools.client.model.FieldEEzsignfoldertypePrivacylevel;
import org.openapitools.client.model.FieldEEzsignfoldertypeSendreminderfrequency;
import org.openapitools.client.model.MultilingualEzsignfoldertypeName;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsignfoldertype Object
 **/
@ApiModel(description = "A Ezsignfoldertype Object")
public class EzsignfoldertypeResponseCompound {
  
  @SerializedName("pkiEzsignfoldertypeID")
  private Integer pkiEzsignfoldertypeID = null;
  @SerializedName("objEzsignfoldertypeName")
  private MultilingualEzsignfoldertypeName objEzsignfoldertypeName = null;
  @SerializedName("fkiBrandingID")
  private Integer fkiBrandingID = null;
  @SerializedName("fkiBillingentityinternalID")
  private Integer fkiBillingentityinternalID = null;
  @SerializedName("fkiUsergroupID")
  private Integer fkiUsergroupID = null;
  @SerializedName("fkiUsergroupIDRestricted")
  private Integer fkiUsergroupIDRestricted = null;
  @SerializedName("fkiEzsigntsarequirementID")
  private Integer fkiEzsigntsarequirementID = null;
  @SerializedName("sBrandingDescriptionX")
  private String sBrandingDescriptionX = null;
  @SerializedName("sBillingentityinternalDescriptionX")
  private String sBillingentityinternalDescriptionX = null;
  @SerializedName("sEzsigntsarequirementDescriptionX")
  private String sEzsigntsarequirementDescriptionX = null;
  @SerializedName("sEmailAddressSigned")
  private String sEmailAddressSigned = null;
  @SerializedName("sEmailAddressSummary")
  private String sEmailAddressSummary = null;
  @SerializedName("sUsergroupNameX")
  private String sUsergroupNameX = null;
  @SerializedName("sUsergroupNameXRestricted")
  private String sUsergroupNameXRestricted = null;
  @SerializedName("eEzsignfoldertypePrivacylevel")
  private FieldEEzsignfoldertypePrivacylevel eEzsignfoldertypePrivacylevel = null;
  @SerializedName("eEzsignfoldertypeSendreminderfrequency")
  private FieldEEzsignfoldertypeSendreminderfrequency eEzsignfoldertypeSendreminderfrequency = null;
  @SerializedName("iEzsignfoldertypeArchivaldays")
  private Integer iEzsignfoldertypeArchivaldays = null;
  @SerializedName("eEzsignfoldertypeDisposal")
  private FieldEEzsignfoldertypeDisposal eEzsignfoldertypeDisposal = null;
  @SerializedName("iEzsignfoldertypeDisposaldays")
  private Integer iEzsignfoldertypeDisposaldays = null;
  @SerializedName("iEzsignfoldertypeDeadlinedays")
  private Integer iEzsignfoldertypeDeadlinedays = null;
  @SerializedName("bEzsignfoldertypeSendattatchmentsigner")
  private Boolean bEzsignfoldertypeSendattatchmentsigner = null;
  @SerializedName("bEzsignfoldertypeSendsignedtodocumentowner")
  private Boolean bEzsignfoldertypeSendsignedtodocumentowner = null;
  @SerializedName("bEzsignfoldertypeSendsignedtofolderowner")
  private Boolean bEzsignfoldertypeSendsignedtofolderowner = null;
  @SerializedName("bEzsignfoldertypeSendsignedtofullgroup")
  private Boolean bEzsignfoldertypeSendsignedtofullgroup = null;
  @SerializedName("bEzsignfoldertypeSendsignedtolimitedgroup")
  private Boolean bEzsignfoldertypeSendsignedtolimitedgroup = null;
  @SerializedName("bEzsignfoldertypeSendsignedtocolleague")
  private Boolean bEzsignfoldertypeSendsignedtocolleague = null;
  @SerializedName("bEzsignfoldertypeSendsummarytodocumentowner")
  private Boolean bEzsignfoldertypeSendsummarytodocumentowner = null;
  @SerializedName("bEzsignfoldertypeSendsummarytofolderowner")
  private Boolean bEzsignfoldertypeSendsummarytofolderowner = null;
  @SerializedName("bEzsignfoldertypeSendsummarytofullgroup")
  private Boolean bEzsignfoldertypeSendsummarytofullgroup = null;
  @SerializedName("bEzsignfoldertypeSendsummarytolimitedgroup")
  private Boolean bEzsignfoldertypeSendsummarytolimitedgroup = null;
  @SerializedName("bEzsignfoldertypeSendsummarytocolleague")
  private Boolean bEzsignfoldertypeSendsummarytocolleague = null;
  @SerializedName("bEzsignfoldertypeIncludeproofsigner")
  private Boolean bEzsignfoldertypeIncludeproofsigner = null;
  @SerializedName("bEzsignfoldertypeIncludeproofuser")
  private Boolean bEzsignfoldertypeIncludeproofuser = null;
  @SerializedName("bEzsignfoldertypeIsactive")
  private Boolean bEzsignfoldertypeIsactive = null;
  @SerializedName("a_fkiUserIDSigned")
  private List<Integer> aFkiUserIDSigned = null;
  @SerializedName("a_fkiUserIDSummary")
  private List<Integer> aFkiUserIDSummary = null;

  /**
   * The unique ID of the Ezsignfoldertype.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfoldertype.")
  public Integer getPkiEzsignfoldertypeID() {
    return pkiEzsignfoldertypeID;
  }
  public void setPkiEzsignfoldertypeID(Integer pkiEzsignfoldertypeID) {
    this.pkiEzsignfoldertypeID = pkiEzsignfoldertypeID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public MultilingualEzsignfoldertypeName getObjEzsignfoldertypeName() {
    return objEzsignfoldertypeName;
  }
  public void setObjEzsignfoldertypeName(MultilingualEzsignfoldertypeName objEzsignfoldertypeName) {
    this.objEzsignfoldertypeName = objEzsignfoldertypeName;
  }

  /**
   * The unique ID of the Branding
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Branding")
  public Integer getFkiBrandingID() {
    return fkiBrandingID;
  }
  public void setFkiBrandingID(Integer fkiBrandingID) {
    this.fkiBrandingID = fkiBrandingID;
  }

  /**
   * The unique ID of the Billingentityinternal.
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Billingentityinternal.")
  public Integer getFkiBillingentityinternalID() {
    return fkiBillingentityinternalID;
  }
  public void setFkiBillingentityinternalID(Integer fkiBillingentityinternalID) {
    this.fkiBillingentityinternalID = fkiBillingentityinternalID;
  }

  /**
   * The unique ID of the Usergroup
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Usergroup")
  public Integer getFkiUsergroupID() {
    return fkiUsergroupID;
  }
  public void setFkiUsergroupID(Integer fkiUsergroupID) {
    this.fkiUsergroupID = fkiUsergroupID;
  }

  /**
   * The unique ID of the Usergroup
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Usergroup")
  public Integer getFkiUsergroupIDRestricted() {
    return fkiUsergroupIDRestricted;
  }
  public void setFkiUsergroupIDRestricted(Integer fkiUsergroupIDRestricted) {
    this.fkiUsergroupIDRestricted = fkiUsergroupIDRestricted;
  }

  /**
   * The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**|
   * minimum: 1
   * maximum: 3
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**|")
  public Integer getFkiEzsigntsarequirementID() {
    return fkiEzsigntsarequirementID;
  }
  public void setFkiEzsigntsarequirementID(Integer fkiEzsigntsarequirementID) {
    this.fkiEzsigntsarequirementID = fkiEzsigntsarequirementID;
  }

  /**
   * The Description of the Branding in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The Description of the Branding in the language of the requester")
  public String getSBrandingDescriptionX() {
    return sBrandingDescriptionX;
  }
  public void setSBrandingDescriptionX(String sBrandingDescriptionX) {
    this.sBrandingDescriptionX = sBrandingDescriptionX;
  }

  /**
   * The description of the Billingentityinternal in the language of the requester
   **/
  @ApiModelProperty(value = "The description of the Billingentityinternal in the language of the requester")
  public String getSBillingentityinternalDescriptionX() {
    return sBillingentityinternalDescriptionX;
  }
  public void setSBillingentityinternalDescriptionX(String sBillingentityinternalDescriptionX) {
    this.sBillingentityinternalDescriptionX = sBillingentityinternalDescriptionX;
  }

  /**
   * The description of the Ezsigntsarequirement in the language of the requester
   **/
  @ApiModelProperty(value = "The description of the Ezsigntsarequirement in the language of the requester")
  public String getSEzsigntsarequirementDescriptionX() {
    return sEzsigntsarequirementDescriptionX;
  }
  public void setSEzsigntsarequirementDescriptionX(String sEzsigntsarequirementDescriptionX) {
    this.sEzsigntsarequirementDescriptionX = sEzsigntsarequirementDescriptionX;
  }

  /**
   * The email address.
   **/
  @ApiModelProperty(value = "The email address.")
  public String getSEmailAddressSigned() {
    return sEmailAddressSigned;
  }
  public void setSEmailAddressSigned(String sEmailAddressSigned) {
    this.sEmailAddressSigned = sEmailAddressSigned;
  }

  /**
   * The email address.
   **/
  @ApiModelProperty(value = "The email address.")
  public String getSEmailAddressSummary() {
    return sEmailAddressSummary;
  }
  public void setSEmailAddressSummary(String sEmailAddressSummary) {
    this.sEmailAddressSummary = sEmailAddressSummary;
  }

  /**
   * The Name of the Usergroup in the language of the requester
   **/
  @ApiModelProperty(value = "The Name of the Usergroup in the language of the requester")
  public String getSUsergroupNameX() {
    return sUsergroupNameX;
  }
  public void setSUsergroupNameX(String sUsergroupNameX) {
    this.sUsergroupNameX = sUsergroupNameX;
  }

  /**
   * The Name of the Usergroup in the language of the requester
   **/
  @ApiModelProperty(value = "The Name of the Usergroup in the language of the requester")
  public String getSUsergroupNameXRestricted() {
    return sUsergroupNameXRestricted;
  }
  public void setSUsergroupNameXRestricted(String sUsergroupNameXRestricted) {
    this.sUsergroupNameXRestricted = sUsergroupNameXRestricted;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsignfoldertypePrivacylevel getEEzsignfoldertypePrivacylevel() {
    return eEzsignfoldertypePrivacylevel;
  }
  public void setEEzsignfoldertypePrivacylevel(FieldEEzsignfoldertypePrivacylevel eEzsignfoldertypePrivacylevel) {
    this.eEzsignfoldertypePrivacylevel = eEzsignfoldertypePrivacylevel;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEEzsignfoldertypeSendreminderfrequency getEEzsignfoldertypeSendreminderfrequency() {
    return eEzsignfoldertypeSendreminderfrequency;
  }
  public void setEEzsignfoldertypeSendreminderfrequency(FieldEEzsignfoldertypeSendreminderfrequency eEzsignfoldertypeSendreminderfrequency) {
    this.eEzsignfoldertypeSendreminderfrequency = eEzsignfoldertypeSendreminderfrequency;
  }

  /**
   * The number of days before the archival of Ezsignfolders created using this Ezsignfoldertype
   * minimum: 0
   * maximum: 180
   **/
  @ApiModelProperty(required = true, value = "The number of days before the archival of Ezsignfolders created using this Ezsignfoldertype")
  public Integer getIEzsignfoldertypeArchivaldays() {
    return iEzsignfoldertypeArchivaldays;
  }
  public void setIEzsignfoldertypeArchivaldays(Integer iEzsignfoldertypeArchivaldays) {
    this.iEzsignfoldertypeArchivaldays = iEzsignfoldertypeArchivaldays;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsignfoldertypeDisposal getEEzsignfoldertypeDisposal() {
    return eEzsignfoldertypeDisposal;
  }
  public void setEEzsignfoldertypeDisposal(FieldEEzsignfoldertypeDisposal eEzsignfoldertypeDisposal) {
    this.eEzsignfoldertypeDisposal = eEzsignfoldertypeDisposal;
  }

  /**
   * The number of days after the archival before the disposal of the Ezsignfolder
   * minimum: 0
   * maximum: 9999
   **/
  @ApiModelProperty(value = "The number of days after the archival before the disposal of the Ezsignfolder")
  public Integer getIEzsignfoldertypeDisposaldays() {
    return iEzsignfoldertypeDisposaldays;
  }
  public void setIEzsignfoldertypeDisposaldays(Integer iEzsignfoldertypeDisposaldays) {
    this.iEzsignfoldertypeDisposaldays = iEzsignfoldertypeDisposaldays;
  }

  /**
   * The number of days to get all Ezsignsignatures
   * minimum: 1
   * maximum: 60
   **/
  @ApiModelProperty(required = true, value = "The number of days to get all Ezsignsignatures")
  public Integer getIEzsignfoldertypeDeadlinedays() {
    return iEzsignfoldertypeDeadlinedays;
  }
  public void setIEzsignfoldertypeDeadlinedays(Integer iEzsignfoldertypeDeadlinedays) {
    this.iEzsignfoldertypeDeadlinedays = iEzsignfoldertypeDeadlinedays;
  }

  /**
   * Whether we send the Ezsigndocument and the proof as attachment in the email
   **/
  @ApiModelProperty(required = true, value = "Whether we send the Ezsigndocument and the proof as attachment in the email")
  public Boolean getBEzsignfoldertypeSendattatchmentsigner() {
    return bEzsignfoldertypeSendattatchmentsigner;
  }
  public void setBEzsignfoldertypeSendattatchmentsigner(Boolean bEzsignfoldertypeSendattatchmentsigner) {
    this.bEzsignfoldertypeSendattatchmentsigner = bEzsignfoldertypeSendattatchmentsigner;
  }

  /**
   * Whether we send the signed Ezsigndocument to the Ezsigndocument's owner
   **/
  @ApiModelProperty(required = true, value = "Whether we send the signed Ezsigndocument to the Ezsigndocument's owner")
  public Boolean getBEzsignfoldertypeSendsignedtodocumentowner() {
    return bEzsignfoldertypeSendsignedtodocumentowner;
  }
  public void setBEzsignfoldertypeSendsignedtodocumentowner(Boolean bEzsignfoldertypeSendsignedtodocumentowner) {
    this.bEzsignfoldertypeSendsignedtodocumentowner = bEzsignfoldertypeSendsignedtodocumentowner;
  }

  /**
   * Whether we send the signed Ezsigndocument to the Ezsignfolder's owner
   **/
  @ApiModelProperty(required = true, value = "Whether we send the signed Ezsigndocument to the Ezsignfolder's owner")
  public Boolean getBEzsignfoldertypeSendsignedtofolderowner() {
    return bEzsignfoldertypeSendsignedtofolderowner;
  }
  public void setBEzsignfoldertypeSendsignedtofolderowner(Boolean bEzsignfoldertypeSendsignedtofolderowner) {
    this.bEzsignfoldertypeSendsignedtofolderowner = bEzsignfoldertypeSendsignedtofolderowner;
  }

  /**
   * Whether we send the signed Ezsigndocument to the Usergroup that has acces to all Ezsignfolders
   **/
  @ApiModelProperty(value = "Whether we send the signed Ezsigndocument to the Usergroup that has acces to all Ezsignfolders")
  public Boolean getBEzsignfoldertypeSendsignedtofullgroup() {
    return bEzsignfoldertypeSendsignedtofullgroup;
  }
  public void setBEzsignfoldertypeSendsignedtofullgroup(Boolean bEzsignfoldertypeSendsignedtofullgroup) {
    this.bEzsignfoldertypeSendsignedtofullgroup = bEzsignfoldertypeSendsignedtofullgroup;
  }

  /**
   * Whether we send the signed Ezsigndocument to the Usergroup that has acces to only their own Ezsignfolders
   **/
  @ApiModelProperty(value = "Whether we send the signed Ezsigndocument to the Usergroup that has acces to only their own Ezsignfolders")
  public Boolean getBEzsignfoldertypeSendsignedtolimitedgroup() {
    return bEzsignfoldertypeSendsignedtolimitedgroup;
  }
  public void setBEzsignfoldertypeSendsignedtolimitedgroup(Boolean bEzsignfoldertypeSendsignedtolimitedgroup) {
    this.bEzsignfoldertypeSendsignedtolimitedgroup = bEzsignfoldertypeSendsignedtolimitedgroup;
  }

  /**
   * Whether we send the signed Ezsigndocument to the colleagues
   **/
  @ApiModelProperty(required = true, value = "Whether we send the signed Ezsigndocument to the colleagues")
  public Boolean getBEzsignfoldertypeSendsignedtocolleague() {
    return bEzsignfoldertypeSendsignedtocolleague;
  }
  public void setBEzsignfoldertypeSendsignedtocolleague(Boolean bEzsignfoldertypeSendsignedtocolleague) {
    this.bEzsignfoldertypeSendsignedtocolleague = bEzsignfoldertypeSendsignedtocolleague;
  }

  /**
   * Whether we send the summary to the Ezsigndocument's owner
   **/
  @ApiModelProperty(required = true, value = "Whether we send the summary to the Ezsigndocument's owner")
  public Boolean getBEzsignfoldertypeSendsummarytodocumentowner() {
    return bEzsignfoldertypeSendsummarytodocumentowner;
  }
  public void setBEzsignfoldertypeSendsummarytodocumentowner(Boolean bEzsignfoldertypeSendsummarytodocumentowner) {
    this.bEzsignfoldertypeSendsummarytodocumentowner = bEzsignfoldertypeSendsummarytodocumentowner;
  }

  /**
   * Whether we send the summary to the Ezsignfolder's owner
   **/
  @ApiModelProperty(required = true, value = "Whether we send the summary to the Ezsignfolder's owner")
  public Boolean getBEzsignfoldertypeSendsummarytofolderowner() {
    return bEzsignfoldertypeSendsummarytofolderowner;
  }
  public void setBEzsignfoldertypeSendsummarytofolderowner(Boolean bEzsignfoldertypeSendsummarytofolderowner) {
    this.bEzsignfoldertypeSendsummarytofolderowner = bEzsignfoldertypeSendsummarytofolderowner;
  }

  /**
   * Whether we send the summary to the Usergroup that has acces to all Ezsignfolders
   **/
  @ApiModelProperty(value = "Whether we send the summary to the Usergroup that has acces to all Ezsignfolders")
  public Boolean getBEzsignfoldertypeSendsummarytofullgroup() {
    return bEzsignfoldertypeSendsummarytofullgroup;
  }
  public void setBEzsignfoldertypeSendsummarytofullgroup(Boolean bEzsignfoldertypeSendsummarytofullgroup) {
    this.bEzsignfoldertypeSendsummarytofullgroup = bEzsignfoldertypeSendsummarytofullgroup;
  }

  /**
   * Whether we send the summary to the Usergroup that has acces to only their own Ezsignfolders
   **/
  @ApiModelProperty(value = "Whether we send the summary to the Usergroup that has acces to only their own Ezsignfolders")
  public Boolean getBEzsignfoldertypeSendsummarytolimitedgroup() {
    return bEzsignfoldertypeSendsummarytolimitedgroup;
  }
  public void setBEzsignfoldertypeSendsummarytolimitedgroup(Boolean bEzsignfoldertypeSendsummarytolimitedgroup) {
    this.bEzsignfoldertypeSendsummarytolimitedgroup = bEzsignfoldertypeSendsummarytolimitedgroup;
  }

  /**
   * Whether we send the summary to the colleagues
   **/
  @ApiModelProperty(required = true, value = "Whether we send the summary to the colleagues")
  public Boolean getBEzsignfoldertypeSendsummarytocolleague() {
    return bEzsignfoldertypeSendsummarytocolleague;
  }
  public void setBEzsignfoldertypeSendsummarytocolleague(Boolean bEzsignfoldertypeSendsummarytocolleague) {
    this.bEzsignfoldertypeSendsummarytocolleague = bEzsignfoldertypeSendsummarytocolleague;
  }

  /**
   * Whether we include the proof with the signed Ezsigndocument for Ezsignsigners
   **/
  @ApiModelProperty(required = true, value = "Whether we include the proof with the signed Ezsigndocument for Ezsignsigners")
  public Boolean getBEzsignfoldertypeIncludeproofsigner() {
    return bEzsignfoldertypeIncludeproofsigner;
  }
  public void setBEzsignfoldertypeIncludeproofsigner(Boolean bEzsignfoldertypeIncludeproofsigner) {
    this.bEzsignfoldertypeIncludeproofsigner = bEzsignfoldertypeIncludeproofsigner;
  }

  /**
   * Whether we include the proof with the signed Ezsigndocument for users
   **/
  @ApiModelProperty(required = true, value = "Whether we include the proof with the signed Ezsigndocument for users")
  public Boolean getBEzsignfoldertypeIncludeproofuser() {
    return bEzsignfoldertypeIncludeproofuser;
  }
  public void setBEzsignfoldertypeIncludeproofuser(Boolean bEzsignfoldertypeIncludeproofuser) {
    this.bEzsignfoldertypeIncludeproofuser = bEzsignfoldertypeIncludeproofuser;
  }

  /**
   * Whether the Ezsignfoldertype is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezsignfoldertype is active or not")
  public Boolean getBEzsignfoldertypeIsactive() {
    return bEzsignfoldertypeIsactive;
  }
  public void setBEzsignfoldertypeIsactive(Boolean bEzsignfoldertypeIsactive) {
    this.bEzsignfoldertypeIsactive = bEzsignfoldertypeIsactive;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Integer> getAFkiUserIDSigned() {
    return aFkiUserIDSigned;
  }
  public void setAFkiUserIDSigned(List<Integer> aFkiUserIDSigned) {
    this.aFkiUserIDSigned = aFkiUserIDSigned;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Integer> getAFkiUserIDSummary() {
    return aFkiUserIDSummary;
  }
  public void setAFkiUserIDSummary(List<Integer> aFkiUserIDSummary) {
    this.aFkiUserIDSummary = aFkiUserIDSummary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfoldertypeResponseCompound ezsignfoldertypeResponseCompound = (EzsignfoldertypeResponseCompound) o;
    return (this.pkiEzsignfoldertypeID == null ? ezsignfoldertypeResponseCompound.pkiEzsignfoldertypeID == null : this.pkiEzsignfoldertypeID.equals(ezsignfoldertypeResponseCompound.pkiEzsignfoldertypeID)) &&
        (this.objEzsignfoldertypeName == null ? ezsignfoldertypeResponseCompound.objEzsignfoldertypeName == null : this.objEzsignfoldertypeName.equals(ezsignfoldertypeResponseCompound.objEzsignfoldertypeName)) &&
        (this.fkiBrandingID == null ? ezsignfoldertypeResponseCompound.fkiBrandingID == null : this.fkiBrandingID.equals(ezsignfoldertypeResponseCompound.fkiBrandingID)) &&
        (this.fkiBillingentityinternalID == null ? ezsignfoldertypeResponseCompound.fkiBillingentityinternalID == null : this.fkiBillingentityinternalID.equals(ezsignfoldertypeResponseCompound.fkiBillingentityinternalID)) &&
        (this.fkiUsergroupID == null ? ezsignfoldertypeResponseCompound.fkiUsergroupID == null : this.fkiUsergroupID.equals(ezsignfoldertypeResponseCompound.fkiUsergroupID)) &&
        (this.fkiUsergroupIDRestricted == null ? ezsignfoldertypeResponseCompound.fkiUsergroupIDRestricted == null : this.fkiUsergroupIDRestricted.equals(ezsignfoldertypeResponseCompound.fkiUsergroupIDRestricted)) &&
        (this.fkiEzsigntsarequirementID == null ? ezsignfoldertypeResponseCompound.fkiEzsigntsarequirementID == null : this.fkiEzsigntsarequirementID.equals(ezsignfoldertypeResponseCompound.fkiEzsigntsarequirementID)) &&
        (this.sBrandingDescriptionX == null ? ezsignfoldertypeResponseCompound.sBrandingDescriptionX == null : this.sBrandingDescriptionX.equals(ezsignfoldertypeResponseCompound.sBrandingDescriptionX)) &&
        (this.sBillingentityinternalDescriptionX == null ? ezsignfoldertypeResponseCompound.sBillingentityinternalDescriptionX == null : this.sBillingentityinternalDescriptionX.equals(ezsignfoldertypeResponseCompound.sBillingentityinternalDescriptionX)) &&
        (this.sEzsigntsarequirementDescriptionX == null ? ezsignfoldertypeResponseCompound.sEzsigntsarequirementDescriptionX == null : this.sEzsigntsarequirementDescriptionX.equals(ezsignfoldertypeResponseCompound.sEzsigntsarequirementDescriptionX)) &&
        (this.sEmailAddressSigned == null ? ezsignfoldertypeResponseCompound.sEmailAddressSigned == null : this.sEmailAddressSigned.equals(ezsignfoldertypeResponseCompound.sEmailAddressSigned)) &&
        (this.sEmailAddressSummary == null ? ezsignfoldertypeResponseCompound.sEmailAddressSummary == null : this.sEmailAddressSummary.equals(ezsignfoldertypeResponseCompound.sEmailAddressSummary)) &&
        (this.sUsergroupNameX == null ? ezsignfoldertypeResponseCompound.sUsergroupNameX == null : this.sUsergroupNameX.equals(ezsignfoldertypeResponseCompound.sUsergroupNameX)) &&
        (this.sUsergroupNameXRestricted == null ? ezsignfoldertypeResponseCompound.sUsergroupNameXRestricted == null : this.sUsergroupNameXRestricted.equals(ezsignfoldertypeResponseCompound.sUsergroupNameXRestricted)) &&
        (this.eEzsignfoldertypePrivacylevel == null ? ezsignfoldertypeResponseCompound.eEzsignfoldertypePrivacylevel == null : this.eEzsignfoldertypePrivacylevel.equals(ezsignfoldertypeResponseCompound.eEzsignfoldertypePrivacylevel)) &&
        (this.eEzsignfoldertypeSendreminderfrequency == null ? ezsignfoldertypeResponseCompound.eEzsignfoldertypeSendreminderfrequency == null : this.eEzsignfoldertypeSendreminderfrequency.equals(ezsignfoldertypeResponseCompound.eEzsignfoldertypeSendreminderfrequency)) &&
        (this.iEzsignfoldertypeArchivaldays == null ? ezsignfoldertypeResponseCompound.iEzsignfoldertypeArchivaldays == null : this.iEzsignfoldertypeArchivaldays.equals(ezsignfoldertypeResponseCompound.iEzsignfoldertypeArchivaldays)) &&
        (this.eEzsignfoldertypeDisposal == null ? ezsignfoldertypeResponseCompound.eEzsignfoldertypeDisposal == null : this.eEzsignfoldertypeDisposal.equals(ezsignfoldertypeResponseCompound.eEzsignfoldertypeDisposal)) &&
        (this.iEzsignfoldertypeDisposaldays == null ? ezsignfoldertypeResponseCompound.iEzsignfoldertypeDisposaldays == null : this.iEzsignfoldertypeDisposaldays.equals(ezsignfoldertypeResponseCompound.iEzsignfoldertypeDisposaldays)) &&
        (this.iEzsignfoldertypeDeadlinedays == null ? ezsignfoldertypeResponseCompound.iEzsignfoldertypeDeadlinedays == null : this.iEzsignfoldertypeDeadlinedays.equals(ezsignfoldertypeResponseCompound.iEzsignfoldertypeDeadlinedays)) &&
        (this.bEzsignfoldertypeSendattatchmentsigner == null ? ezsignfoldertypeResponseCompound.bEzsignfoldertypeSendattatchmentsigner == null : this.bEzsignfoldertypeSendattatchmentsigner.equals(ezsignfoldertypeResponseCompound.bEzsignfoldertypeSendattatchmentsigner)) &&
        (this.bEzsignfoldertypeSendsignedtodocumentowner == null ? ezsignfoldertypeResponseCompound.bEzsignfoldertypeSendsignedtodocumentowner == null : this.bEzsignfoldertypeSendsignedtodocumentowner.equals(ezsignfoldertypeResponseCompound.bEzsignfoldertypeSendsignedtodocumentowner)) &&
        (this.bEzsignfoldertypeSendsignedtofolderowner == null ? ezsignfoldertypeResponseCompound.bEzsignfoldertypeSendsignedtofolderowner == null : this.bEzsignfoldertypeSendsignedtofolderowner.equals(ezsignfoldertypeResponseCompound.bEzsignfoldertypeSendsignedtofolderowner)) &&
        (this.bEzsignfoldertypeSendsignedtofullgroup == null ? ezsignfoldertypeResponseCompound.bEzsignfoldertypeSendsignedtofullgroup == null : this.bEzsignfoldertypeSendsignedtofullgroup.equals(ezsignfoldertypeResponseCompound.bEzsignfoldertypeSendsignedtofullgroup)) &&
        (this.bEzsignfoldertypeSendsignedtolimitedgroup == null ? ezsignfoldertypeResponseCompound.bEzsignfoldertypeSendsignedtolimitedgroup == null : this.bEzsignfoldertypeSendsignedtolimitedgroup.equals(ezsignfoldertypeResponseCompound.bEzsignfoldertypeSendsignedtolimitedgroup)) &&
        (this.bEzsignfoldertypeSendsignedtocolleague == null ? ezsignfoldertypeResponseCompound.bEzsignfoldertypeSendsignedtocolleague == null : this.bEzsignfoldertypeSendsignedtocolleague.equals(ezsignfoldertypeResponseCompound.bEzsignfoldertypeSendsignedtocolleague)) &&
        (this.bEzsignfoldertypeSendsummarytodocumentowner == null ? ezsignfoldertypeResponseCompound.bEzsignfoldertypeSendsummarytodocumentowner == null : this.bEzsignfoldertypeSendsummarytodocumentowner.equals(ezsignfoldertypeResponseCompound.bEzsignfoldertypeSendsummarytodocumentowner)) &&
        (this.bEzsignfoldertypeSendsummarytofolderowner == null ? ezsignfoldertypeResponseCompound.bEzsignfoldertypeSendsummarytofolderowner == null : this.bEzsignfoldertypeSendsummarytofolderowner.equals(ezsignfoldertypeResponseCompound.bEzsignfoldertypeSendsummarytofolderowner)) &&
        (this.bEzsignfoldertypeSendsummarytofullgroup == null ? ezsignfoldertypeResponseCompound.bEzsignfoldertypeSendsummarytofullgroup == null : this.bEzsignfoldertypeSendsummarytofullgroup.equals(ezsignfoldertypeResponseCompound.bEzsignfoldertypeSendsummarytofullgroup)) &&
        (this.bEzsignfoldertypeSendsummarytolimitedgroup == null ? ezsignfoldertypeResponseCompound.bEzsignfoldertypeSendsummarytolimitedgroup == null : this.bEzsignfoldertypeSendsummarytolimitedgroup.equals(ezsignfoldertypeResponseCompound.bEzsignfoldertypeSendsummarytolimitedgroup)) &&
        (this.bEzsignfoldertypeSendsummarytocolleague == null ? ezsignfoldertypeResponseCompound.bEzsignfoldertypeSendsummarytocolleague == null : this.bEzsignfoldertypeSendsummarytocolleague.equals(ezsignfoldertypeResponseCompound.bEzsignfoldertypeSendsummarytocolleague)) &&
        (this.bEzsignfoldertypeIncludeproofsigner == null ? ezsignfoldertypeResponseCompound.bEzsignfoldertypeIncludeproofsigner == null : this.bEzsignfoldertypeIncludeproofsigner.equals(ezsignfoldertypeResponseCompound.bEzsignfoldertypeIncludeproofsigner)) &&
        (this.bEzsignfoldertypeIncludeproofuser == null ? ezsignfoldertypeResponseCompound.bEzsignfoldertypeIncludeproofuser == null : this.bEzsignfoldertypeIncludeproofuser.equals(ezsignfoldertypeResponseCompound.bEzsignfoldertypeIncludeproofuser)) &&
        (this.bEzsignfoldertypeIsactive == null ? ezsignfoldertypeResponseCompound.bEzsignfoldertypeIsactive == null : this.bEzsignfoldertypeIsactive.equals(ezsignfoldertypeResponseCompound.bEzsignfoldertypeIsactive)) &&
        (this.aFkiUserIDSigned == null ? ezsignfoldertypeResponseCompound.aFkiUserIDSigned == null : this.aFkiUserIDSigned.equals(ezsignfoldertypeResponseCompound.aFkiUserIDSigned)) &&
        (this.aFkiUserIDSummary == null ? ezsignfoldertypeResponseCompound.aFkiUserIDSummary == null : this.aFkiUserIDSummary.equals(ezsignfoldertypeResponseCompound.aFkiUserIDSummary));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignfoldertypeID == null ? 0: this.pkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.objEzsignfoldertypeName == null ? 0: this.objEzsignfoldertypeName.hashCode());
    result = 31 * result + (this.fkiBrandingID == null ? 0: this.fkiBrandingID.hashCode());
    result = 31 * result + (this.fkiBillingentityinternalID == null ? 0: this.fkiBillingentityinternalID.hashCode());
    result = 31 * result + (this.fkiUsergroupID == null ? 0: this.fkiUsergroupID.hashCode());
    result = 31 * result + (this.fkiUsergroupIDRestricted == null ? 0: this.fkiUsergroupIDRestricted.hashCode());
    result = 31 * result + (this.fkiEzsigntsarequirementID == null ? 0: this.fkiEzsigntsarequirementID.hashCode());
    result = 31 * result + (this.sBrandingDescriptionX == null ? 0: this.sBrandingDescriptionX.hashCode());
    result = 31 * result + (this.sBillingentityinternalDescriptionX == null ? 0: this.sBillingentityinternalDescriptionX.hashCode());
    result = 31 * result + (this.sEzsigntsarequirementDescriptionX == null ? 0: this.sEzsigntsarequirementDescriptionX.hashCode());
    result = 31 * result + (this.sEmailAddressSigned == null ? 0: this.sEmailAddressSigned.hashCode());
    result = 31 * result + (this.sEmailAddressSummary == null ? 0: this.sEmailAddressSummary.hashCode());
    result = 31 * result + (this.sUsergroupNameX == null ? 0: this.sUsergroupNameX.hashCode());
    result = 31 * result + (this.sUsergroupNameXRestricted == null ? 0: this.sUsergroupNameXRestricted.hashCode());
    result = 31 * result + (this.eEzsignfoldertypePrivacylevel == null ? 0: this.eEzsignfoldertypePrivacylevel.hashCode());
    result = 31 * result + (this.eEzsignfoldertypeSendreminderfrequency == null ? 0: this.eEzsignfoldertypeSendreminderfrequency.hashCode());
    result = 31 * result + (this.iEzsignfoldertypeArchivaldays == null ? 0: this.iEzsignfoldertypeArchivaldays.hashCode());
    result = 31 * result + (this.eEzsignfoldertypeDisposal == null ? 0: this.eEzsignfoldertypeDisposal.hashCode());
    result = 31 * result + (this.iEzsignfoldertypeDisposaldays == null ? 0: this.iEzsignfoldertypeDisposaldays.hashCode());
    result = 31 * result + (this.iEzsignfoldertypeDeadlinedays == null ? 0: this.iEzsignfoldertypeDeadlinedays.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeSendattatchmentsigner == null ? 0: this.bEzsignfoldertypeSendattatchmentsigner.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeSendsignedtodocumentowner == null ? 0: this.bEzsignfoldertypeSendsignedtodocumentowner.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeSendsignedtofolderowner == null ? 0: this.bEzsignfoldertypeSendsignedtofolderowner.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeSendsignedtofullgroup == null ? 0: this.bEzsignfoldertypeSendsignedtofullgroup.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeSendsignedtolimitedgroup == null ? 0: this.bEzsignfoldertypeSendsignedtolimitedgroup.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeSendsignedtocolleague == null ? 0: this.bEzsignfoldertypeSendsignedtocolleague.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeSendsummarytodocumentowner == null ? 0: this.bEzsignfoldertypeSendsummarytodocumentowner.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeSendsummarytofolderowner == null ? 0: this.bEzsignfoldertypeSendsummarytofolderowner.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeSendsummarytofullgroup == null ? 0: this.bEzsignfoldertypeSendsummarytofullgroup.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeSendsummarytolimitedgroup == null ? 0: this.bEzsignfoldertypeSendsummarytolimitedgroup.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeSendsummarytocolleague == null ? 0: this.bEzsignfoldertypeSendsummarytocolleague.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeIncludeproofsigner == null ? 0: this.bEzsignfoldertypeIncludeproofsigner.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeIncludeproofuser == null ? 0: this.bEzsignfoldertypeIncludeproofuser.hashCode());
    result = 31 * result + (this.bEzsignfoldertypeIsactive == null ? 0: this.bEzsignfoldertypeIsactive.hashCode());
    result = 31 * result + (this.aFkiUserIDSigned == null ? 0: this.aFkiUserIDSigned.hashCode());
    result = 31 * result + (this.aFkiUserIDSummary == null ? 0: this.aFkiUserIDSummary.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldertypeResponseCompound {\n");
    
    sb.append("  pkiEzsignfoldertypeID: ").append(pkiEzsignfoldertypeID).append("\n");
    sb.append("  objEzsignfoldertypeName: ").append(objEzsignfoldertypeName).append("\n");
    sb.append("  fkiBrandingID: ").append(fkiBrandingID).append("\n");
    sb.append("  fkiBillingentityinternalID: ").append(fkiBillingentityinternalID).append("\n");
    sb.append("  fkiUsergroupID: ").append(fkiUsergroupID).append("\n");
    sb.append("  fkiUsergroupIDRestricted: ").append(fkiUsergroupIDRestricted).append("\n");
    sb.append("  fkiEzsigntsarequirementID: ").append(fkiEzsigntsarequirementID).append("\n");
    sb.append("  sBrandingDescriptionX: ").append(sBrandingDescriptionX).append("\n");
    sb.append("  sBillingentityinternalDescriptionX: ").append(sBillingentityinternalDescriptionX).append("\n");
    sb.append("  sEzsigntsarequirementDescriptionX: ").append(sEzsigntsarequirementDescriptionX).append("\n");
    sb.append("  sEmailAddressSigned: ").append(sEmailAddressSigned).append("\n");
    sb.append("  sEmailAddressSummary: ").append(sEmailAddressSummary).append("\n");
    sb.append("  sUsergroupNameX: ").append(sUsergroupNameX).append("\n");
    sb.append("  sUsergroupNameXRestricted: ").append(sUsergroupNameXRestricted).append("\n");
    sb.append("  eEzsignfoldertypePrivacylevel: ").append(eEzsignfoldertypePrivacylevel).append("\n");
    sb.append("  eEzsignfoldertypeSendreminderfrequency: ").append(eEzsignfoldertypeSendreminderfrequency).append("\n");
    sb.append("  iEzsignfoldertypeArchivaldays: ").append(iEzsignfoldertypeArchivaldays).append("\n");
    sb.append("  eEzsignfoldertypeDisposal: ").append(eEzsignfoldertypeDisposal).append("\n");
    sb.append("  iEzsignfoldertypeDisposaldays: ").append(iEzsignfoldertypeDisposaldays).append("\n");
    sb.append("  iEzsignfoldertypeDeadlinedays: ").append(iEzsignfoldertypeDeadlinedays).append("\n");
    sb.append("  bEzsignfoldertypeSendattatchmentsigner: ").append(bEzsignfoldertypeSendattatchmentsigner).append("\n");
    sb.append("  bEzsignfoldertypeSendsignedtodocumentowner: ").append(bEzsignfoldertypeSendsignedtodocumentowner).append("\n");
    sb.append("  bEzsignfoldertypeSendsignedtofolderowner: ").append(bEzsignfoldertypeSendsignedtofolderowner).append("\n");
    sb.append("  bEzsignfoldertypeSendsignedtofullgroup: ").append(bEzsignfoldertypeSendsignedtofullgroup).append("\n");
    sb.append("  bEzsignfoldertypeSendsignedtolimitedgroup: ").append(bEzsignfoldertypeSendsignedtolimitedgroup).append("\n");
    sb.append("  bEzsignfoldertypeSendsignedtocolleague: ").append(bEzsignfoldertypeSendsignedtocolleague).append("\n");
    sb.append("  bEzsignfoldertypeSendsummarytodocumentowner: ").append(bEzsignfoldertypeSendsummarytodocumentowner).append("\n");
    sb.append("  bEzsignfoldertypeSendsummarytofolderowner: ").append(bEzsignfoldertypeSendsummarytofolderowner).append("\n");
    sb.append("  bEzsignfoldertypeSendsummarytofullgroup: ").append(bEzsignfoldertypeSendsummarytofullgroup).append("\n");
    sb.append("  bEzsignfoldertypeSendsummarytolimitedgroup: ").append(bEzsignfoldertypeSendsummarytolimitedgroup).append("\n");
    sb.append("  bEzsignfoldertypeSendsummarytocolleague: ").append(bEzsignfoldertypeSendsummarytocolleague).append("\n");
    sb.append("  bEzsignfoldertypeIncludeproofsigner: ").append(bEzsignfoldertypeIncludeproofsigner).append("\n");
    sb.append("  bEzsignfoldertypeIncludeproofuser: ").append(bEzsignfoldertypeIncludeproofuser).append("\n");
    sb.append("  bEzsignfoldertypeIsactive: ").append(bEzsignfoldertypeIsactive).append("\n");
    sb.append("  aFkiUserIDSigned: ").append(aFkiUserIDSigned).append("\n");
    sb.append("  aFkiUserIDSummary: ").append(aFkiUserIDSummary).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
