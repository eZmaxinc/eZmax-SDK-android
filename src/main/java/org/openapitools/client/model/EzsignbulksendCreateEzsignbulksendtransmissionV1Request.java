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

import org.openapitools.client.model.FieldEEzsignfolderSendreminderfrequency;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/ezsignbulksend/{pkiEzsignbulksendID}/createEzsignbulksendtransmission
 **/
@ApiModel(description = "Request for POST /1/object/ezsignbulksend/{pkiEzsignbulksendID}/createEzsignbulksendtransmission")
public class EzsignbulksendCreateEzsignbulksendtransmissionV1Request {
  
  @SerializedName("fkiUserlogintypeID")
  private Integer fkiUserlogintypeID = null;
  @SerializedName("fkiEzsigntsarequirementID")
  private Integer fkiEzsigntsarequirementID = null;
  @SerializedName("sEzsignbulksendtransmissionDescription")
  private String sEzsignbulksendtransmissionDescription = null;
  @SerializedName("dtEzsigndocumentDuedate")
  private String dtEzsigndocumentDuedate = null;
  @SerializedName("eEzsignfolderSendreminderfrequency")
  private FieldEEzsignfolderSendreminderfrequency eEzsignfolderSendreminderfrequency = null;
  @SerializedName("tExtraMessage")
  private String tExtraMessage = null;
  @SerializedName("sCsvBase64")
  private byte[] sCsvBase64 = null;

  /**
   * The unique ID of the Userlogintype  Valid values:  |Value|Description|Detail| |-|-|-| |1|**Email Only**|The Ezsignsigner will receive a secure link by email| |2|**Email and phone or SMS**|The Ezsignsigner will receive a secure link by email and will need to authenticate using SMS or Phone call. **Additional fee applies**| |3|**Email and secret question**|The Ezsignsigner will receive a secure link by email and will need to authenticate using a predefined question and answer| |4|**In person only**|The Ezsignsigner will only be able to sign \"In-Person\" and there won't be any authentication. No email will be sent for invitation to sign. Make sure you evaluate the risk of signature denial and at minimum, we recommend you use a handwritten signature type| |5|**In person with phone or SMS**|The Ezsignsigner will only be able to sign \"In-Person\" and will need to authenticate using SMS or Phone call. No email will be sent for invitation to sign. **Additional fee applies**|
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Userlogintype  Valid values:  |Value|Description|Detail| |-|-|-| |1|**Email Only**|The Ezsignsigner will receive a secure link by email| |2|**Email and phone or SMS**|The Ezsignsigner will receive a secure link by email and will need to authenticate using SMS or Phone call. **Additional fee applies**| |3|**Email and secret question**|The Ezsignsigner will receive a secure link by email and will need to authenticate using a predefined question and answer| |4|**In person only**|The Ezsignsigner will only be able to sign \"In-Person\" and there won't be any authentication. No email will be sent for invitation to sign. Make sure you evaluate the risk of signature denial and at minimum, we recommend you use a handwritten signature type| |5|**In person with phone or SMS**|The Ezsignsigner will only be able to sign \"In-Person\" and will need to authenticate using SMS or Phone call. No email will be sent for invitation to sign. **Additional fee applies**|")
  public Integer getFkiUserlogintypeID() {
    return fkiUserlogintypeID;
  }
  public void setFkiUserlogintypeID(Integer fkiUserlogintypeID) {
    this.fkiUserlogintypeID = fkiUserlogintypeID;
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
   * The description of the Ezsignbulksendtransmission
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezsignbulksendtransmission")
  public String getSEzsignbulksendtransmissionDescription() {
    return sEzsignbulksendtransmissionDescription;
  }
  public void setSEzsignbulksendtransmissionDescription(String sEzsignbulksendtransmissionDescription) {
    this.sEzsignbulksendtransmissionDescription = sEzsignbulksendtransmissionDescription;
  }

  /**
   * The maximum date and time at which the Ezsigndocument can be signed.
   **/
  @ApiModelProperty(required = true, value = "The maximum date and time at which the Ezsigndocument can be signed.")
  public String getDtEzsigndocumentDuedate() {
    return dtEzsigndocumentDuedate;
  }
  public void setDtEzsigndocumentDuedate(String dtEzsigndocumentDuedate) {
    this.dtEzsigndocumentDuedate = dtEzsigndocumentDuedate;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsignfolderSendreminderfrequency getEEzsignfolderSendreminderfrequency() {
    return eEzsignfolderSendreminderfrequency;
  }
  public void setEEzsignfolderSendreminderfrequency(FieldEEzsignfolderSendreminderfrequency eEzsignfolderSendreminderfrequency) {
    this.eEzsignfolderSendreminderfrequency = eEzsignfolderSendreminderfrequency;
  }

  /**
   * A custom text message that will be added to the email sent.
   **/
  @ApiModelProperty(required = true, value = "A custom text message that will be added to the email sent.")
  public String getTExtraMessage() {
    return tExtraMessage;
  }
  public void setTExtraMessage(String tExtraMessage) {
    this.tExtraMessage = tExtraMessage;
  }

  /**
   * The Base64 encoded binary content of the CSV file.
   **/
  @ApiModelProperty(required = true, value = "The Base64 encoded binary content of the CSV file.")
  public byte[] getSCsvBase64() {
    return sCsvBase64;
  }
  public void setSCsvBase64(byte[] sCsvBase64) {
    this.sCsvBase64 = sCsvBase64;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksendCreateEzsignbulksendtransmissionV1Request ezsignbulksendCreateEzsignbulksendtransmissionV1Request = (EzsignbulksendCreateEzsignbulksendtransmissionV1Request) o;
    return (this.fkiUserlogintypeID == null ? ezsignbulksendCreateEzsignbulksendtransmissionV1Request.fkiUserlogintypeID == null : this.fkiUserlogintypeID.equals(ezsignbulksendCreateEzsignbulksendtransmissionV1Request.fkiUserlogintypeID)) &&
        (this.fkiEzsigntsarequirementID == null ? ezsignbulksendCreateEzsignbulksendtransmissionV1Request.fkiEzsigntsarequirementID == null : this.fkiEzsigntsarequirementID.equals(ezsignbulksendCreateEzsignbulksendtransmissionV1Request.fkiEzsigntsarequirementID)) &&
        (this.sEzsignbulksendtransmissionDescription == null ? ezsignbulksendCreateEzsignbulksendtransmissionV1Request.sEzsignbulksendtransmissionDescription == null : this.sEzsignbulksendtransmissionDescription.equals(ezsignbulksendCreateEzsignbulksendtransmissionV1Request.sEzsignbulksendtransmissionDescription)) &&
        (this.dtEzsigndocumentDuedate == null ? ezsignbulksendCreateEzsignbulksendtransmissionV1Request.dtEzsigndocumentDuedate == null : this.dtEzsigndocumentDuedate.equals(ezsignbulksendCreateEzsignbulksendtransmissionV1Request.dtEzsigndocumentDuedate)) &&
        (this.eEzsignfolderSendreminderfrequency == null ? ezsignbulksendCreateEzsignbulksendtransmissionV1Request.eEzsignfolderSendreminderfrequency == null : this.eEzsignfolderSendreminderfrequency.equals(ezsignbulksendCreateEzsignbulksendtransmissionV1Request.eEzsignfolderSendreminderfrequency)) &&
        (this.tExtraMessage == null ? ezsignbulksendCreateEzsignbulksendtransmissionV1Request.tExtraMessage == null : this.tExtraMessage.equals(ezsignbulksendCreateEzsignbulksendtransmissionV1Request.tExtraMessage)) &&
        (this.sCsvBase64 == null ? ezsignbulksendCreateEzsignbulksendtransmissionV1Request.sCsvBase64 == null : this.sCsvBase64.equals(ezsignbulksendCreateEzsignbulksendtransmissionV1Request.sCsvBase64));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiUserlogintypeID == null ? 0: this.fkiUserlogintypeID.hashCode());
    result = 31 * result + (this.fkiEzsigntsarequirementID == null ? 0: this.fkiEzsigntsarequirementID.hashCode());
    result = 31 * result + (this.sEzsignbulksendtransmissionDescription == null ? 0: this.sEzsignbulksendtransmissionDescription.hashCode());
    result = 31 * result + (this.dtEzsigndocumentDuedate == null ? 0: this.dtEzsigndocumentDuedate.hashCode());
    result = 31 * result + (this.eEzsignfolderSendreminderfrequency == null ? 0: this.eEzsignfolderSendreminderfrequency.hashCode());
    result = 31 * result + (this.tExtraMessage == null ? 0: this.tExtraMessage.hashCode());
    result = 31 * result + (this.sCsvBase64 == null ? 0: this.sCsvBase64.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendCreateEzsignbulksendtransmissionV1Request {\n");
    
    sb.append("  fkiUserlogintypeID: ").append(fkiUserlogintypeID).append("\n");
    sb.append("  fkiEzsigntsarequirementID: ").append(fkiEzsigntsarequirementID).append("\n");
    sb.append("  sEzsignbulksendtransmissionDescription: ").append(sEzsignbulksendtransmissionDescription).append("\n");
    sb.append("  dtEzsigndocumentDuedate: ").append(dtEzsigndocumentDuedate).append("\n");
    sb.append("  eEzsignfolderSendreminderfrequency: ").append(eEzsignfolderSendreminderfrequency).append("\n");
    sb.append("  tExtraMessage: ").append(tExtraMessage).append("\n");
    sb.append("  sCsvBase64: ").append(sCsvBase64).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
