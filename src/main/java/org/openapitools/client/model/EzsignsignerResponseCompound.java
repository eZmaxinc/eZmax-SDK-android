/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsignsignerResponseCompoundContact;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignsigner Object and children to create a complete structure
 **/
@ApiModel(description = "An Ezsignsigner Object and children to create a complete structure")
public class EzsignsignerResponseCompound {
  
  @SerializedName("pkiEzsignsignerID")
  private Integer pkiEzsignsignerID = null;
  @SerializedName("fkiTaxassignmentID")
  private Integer fkiTaxassignmentID = null;
  @SerializedName("fkiSecretquestionID")
  private Integer fkiSecretquestionID = null;
  @SerializedName("fkiUserlogintypeID")
  private Integer fkiUserlogintypeID = null;
  @SerializedName("sUserlogintypeDescriptionX")
  private String sUserlogintypeDescriptionX = null;
  @SerializedName("objContact")
  private EzsignsignerResponseCompoundContact objContact = null;

  /**
   * The unique ID of the Ezsignsigner
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignsigner")
  public Integer getPkiEzsignsignerID() {
    return pkiEzsignsignerID;
  }
  public void setPkiEzsignsignerID(Integer pkiEzsignsignerID) {
    this.pkiEzsignsignerID = pkiEzsignsignerID;
  }

  /**
   * The unique ID of the Taxassignment.  Valid values:  |Value|Description| |-|-| |1|No tax| |2|GST| |3|HST (ON)| |4|HST (NB)| |5|HST (NS)| |6|HST (NL)| |7|HST (PE)| |8|GST + QST (QC)| |9|GST + QST (QC) Non-Recoverable| |10|GST + PST (BC)| |11|GST + PST (SK)| |12|GST + RST (MB)| |13|GST + PST (BC) Non-Recoverable| |14|GST + PST (SK) Non-Recoverable| |15|GST + RST (MB) Non-Recoverable|
   * minimum: 0
   * maximum: 15
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Taxassignment.  Valid values:  |Value|Description| |-|-| |1|No tax| |2|GST| |3|HST (ON)| |4|HST (NB)| |5|HST (NS)| |6|HST (NL)| |7|HST (PE)| |8|GST + QST (QC)| |9|GST + QST (QC) Non-Recoverable| |10|GST + PST (BC)| |11|GST + PST (SK)| |12|GST + RST (MB)| |13|GST + PST (BC) Non-Recoverable| |14|GST + PST (SK) Non-Recoverable| |15|GST + RST (MB) Non-Recoverable|")
  public Integer getFkiTaxassignmentID() {
    return fkiTaxassignmentID;
  }
  public void setFkiTaxassignmentID(Integer fkiTaxassignmentID) {
    this.fkiTaxassignmentID = fkiTaxassignmentID;
  }

  /**
   * The unique ID of the Secretquestion.  Valid values:  |Value|Description| |-|-| |1|The name of the hospital in which you were born| |2|The name of your grade school| |3|The last name of your favorite teacher| |4|Your favorite sports team| |5|Your favorite TV show| |6|Your favorite movie| |7|The name of the street on which you grew up| |8|The name of your first employer| |9|Your first car| |10|Your favorite food| |11|The name of your first pet| |12|Favorite musician/band| |13|What instrument you play| |14|Your father's middle name| |15|Your mother's maiden name| |16|Name of your eldest child| |17|Your spouse's middle name| |18|Favorite restaurant| |19|Childhood nickname| |20|Favorite vacation destination| |21|Your boat's name| |22|Date of Birth (YYYY-MM-DD)|
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Secretquestion.  Valid values:  |Value|Description| |-|-| |1|The name of the hospital in which you were born| |2|The name of your grade school| |3|The last name of your favorite teacher| |4|Your favorite sports team| |5|Your favorite TV show| |6|Your favorite movie| |7|The name of the street on which you grew up| |8|The name of your first employer| |9|Your first car| |10|Your favorite food| |11|The name of your first pet| |12|Favorite musician/band| |13|What instrument you play| |14|Your father's middle name| |15|Your mother's maiden name| |16|Name of your eldest child| |17|Your spouse's middle name| |18|Favorite restaurant| |19|Childhood nickname| |20|Favorite vacation destination| |21|Your boat's name| |22|Date of Birth (YYYY-MM-DD)|")
  public Integer getFkiSecretquestionID() {
    return fkiSecretquestionID;
  }
  public void setFkiSecretquestionID(Integer fkiSecretquestionID) {
    this.fkiSecretquestionID = fkiSecretquestionID;
  }

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
   * The description of the Userlogintype in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The description of the Userlogintype in the language of the requester")
  public String getSUserlogintypeDescriptionX() {
    return sUserlogintypeDescriptionX;
  }
  public void setSUserlogintypeDescriptionX(String sUserlogintypeDescriptionX) {
    this.sUserlogintypeDescriptionX = sUserlogintypeDescriptionX;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignsignerResponseCompoundContact getObjContact() {
    return objContact;
  }
  public void setObjContact(EzsignsignerResponseCompoundContact objContact) {
    this.objContact = objContact;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignerResponseCompound ezsignsignerResponseCompound = (EzsignsignerResponseCompound) o;
    return (this.pkiEzsignsignerID == null ? ezsignsignerResponseCompound.pkiEzsignsignerID == null : this.pkiEzsignsignerID.equals(ezsignsignerResponseCompound.pkiEzsignsignerID)) &&
        (this.fkiTaxassignmentID == null ? ezsignsignerResponseCompound.fkiTaxassignmentID == null : this.fkiTaxassignmentID.equals(ezsignsignerResponseCompound.fkiTaxassignmentID)) &&
        (this.fkiSecretquestionID == null ? ezsignsignerResponseCompound.fkiSecretquestionID == null : this.fkiSecretquestionID.equals(ezsignsignerResponseCompound.fkiSecretquestionID)) &&
        (this.fkiUserlogintypeID == null ? ezsignsignerResponseCompound.fkiUserlogintypeID == null : this.fkiUserlogintypeID.equals(ezsignsignerResponseCompound.fkiUserlogintypeID)) &&
        (this.sUserlogintypeDescriptionX == null ? ezsignsignerResponseCompound.sUserlogintypeDescriptionX == null : this.sUserlogintypeDescriptionX.equals(ezsignsignerResponseCompound.sUserlogintypeDescriptionX)) &&
        (this.objContact == null ? ezsignsignerResponseCompound.objContact == null : this.objContact.equals(ezsignsignerResponseCompound.objContact));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignsignerID == null ? 0: this.pkiEzsignsignerID.hashCode());
    result = 31 * result + (this.fkiTaxassignmentID == null ? 0: this.fkiTaxassignmentID.hashCode());
    result = 31 * result + (this.fkiSecretquestionID == null ? 0: this.fkiSecretquestionID.hashCode());
    result = 31 * result + (this.fkiUserlogintypeID == null ? 0: this.fkiUserlogintypeID.hashCode());
    result = 31 * result + (this.sUserlogintypeDescriptionX == null ? 0: this.sUserlogintypeDescriptionX.hashCode());
    result = 31 * result + (this.objContact == null ? 0: this.objContact.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignerResponseCompound {\n");
    
    sb.append("  pkiEzsignsignerID: ").append(pkiEzsignsignerID).append("\n");
    sb.append("  fkiTaxassignmentID: ").append(fkiTaxassignmentID).append("\n");
    sb.append("  fkiSecretquestionID: ").append(fkiSecretquestionID).append("\n");
    sb.append("  fkiUserlogintypeID: ").append(fkiUserlogintypeID).append("\n");
    sb.append("  sUserlogintypeDescriptionX: ").append(sUserlogintypeDescriptionX).append("\n");
    sb.append("  objContact: ").append(objContact).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
