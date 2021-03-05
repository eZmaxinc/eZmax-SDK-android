/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.32
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsignsignerRequest;
import org.openapitools.client.model.EzsignsignerRequestCompoundContact;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignsigner Object and children to create a complete structure
 **/
@ApiModel(description = "An Ezsignsigner Object and children to create a complete structure")
public class EzsignsignerRequestCompound {
  
  @SerializedName("objContact")
  private EzsignsignerRequestCompoundContact objContact = null;
  @SerializedName("fkiTaxassignmentID")
  private Integer fkiTaxassignmentID = null;
  @SerializedName("fkiSecretquestionID")
  private Integer fkiSecretquestionID = null;
  public enum EEzsignsignerLogintypeEnum {
     Password,  PasswordPhone,  PasswordQuestion,  InPersonPhone,  InPerson, 
  };
  @SerializedName("eEzsignsignerLogintype")
  private EEzsignsignerLogintypeEnum eEzsignsignerLogintype = null;
  @SerializedName("sEzsignsignerSecretanswer")
  private String sEzsignsignerSecretanswer = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignsignerRequestCompoundContact getObjContact() {
    return objContact;
  }
  public void setObjContact(EzsignsignerRequestCompoundContact objContact) {
    this.objContact = objContact;
  }

  /**
   * The unique ID of the Taxassignment.  Valid values:  |Value|Description| |-|-| |1|No tax| |2|GST| |3|HST (ON)| |4|HST (NB)| |5|HST (NS)| |6|HST (NL)| |7|HST (PE)| |8|GST + QST (QC)| |9|GST + QST (QC) Non-Recoverable| |10|GST + PST (BC)| |11|GST + PST (SK)| |12|GST + RST (MB)| |13|GST + PST (BC) Non-Recoverable| |14|GST + PST (SK) Non-Recoverable| |15|GST + RST (MB) Non-Recoverable|
   * minimum: 1
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
   **/
  @ApiModelProperty(value = "The unique ID of the Secretquestion.  Valid values:  |Value|Description| |-|-| |1|The name of the hospital in which you were born| |2|The name of your grade school| |3|The last name of your favorite teacher| |4|Your favorite sports team| |5|Your favorite TV show| |6|Your favorite movie| |7|The name of the street on which you grew up| |8|The name of your first employer| |9|Your first car| |10|Your favorite food| |11|The name of your first pet| |12|Favorite musician/band| |13|What instrument you play| |14|Your father's middle name| |15|Your mother's maiden name| |16|Name of your eldest child| |17|Your spouse's middle name| |18|Favorite restaurant| |19|Childhood nickname| |20|Favorite vacation destination| |21|Your boat's name| |22|Date of Birth (YYYY-MM-DD)|")
  public Integer getFkiSecretquestionID() {
    return fkiSecretquestionID;
  }
  public void setFkiSecretquestionID(Integer fkiSecretquestionID) {
    this.fkiSecretquestionID = fkiSecretquestionID;
  }

  /**
   * The method the Ezsignsigner will authenticate to the signing platform.  1. **Password** means the Ezsignsigner will receive a secure link by email. 2. **PasswordPhone** means the Ezsignsigner will receive a secure link by email and will need to authenticate using SMS or Phone call. **Additional fee applies**. 3. **PasswordQuestion** means the Ezsignsigner will receive a secure link by email and will need to authenticate using a predefined question and answer. 4. **InPersonPhone** means the Ezsignsigner will only be able to sign \"In-Person\" and will need to authenticate using SMS or Phone call. No email will be sent for invitation to sign. **Additional fee applies**. 5. **InPerson** means the Ezsignsigner will only be able to sign \"In-Person\" and there won't be any authentication. No email will be sent for invitation to sign. Make sure you evaluate the risk of signature denial and at minimum, we recommend you use a handwritten signature type.
   **/
  @ApiModelProperty(required = true, value = "The method the Ezsignsigner will authenticate to the signing platform.  1. **Password** means the Ezsignsigner will receive a secure link by email. 2. **PasswordPhone** means the Ezsignsigner will receive a secure link by email and will need to authenticate using SMS or Phone call. **Additional fee applies**. 3. **PasswordQuestion** means the Ezsignsigner will receive a secure link by email and will need to authenticate using a predefined question and answer. 4. **InPersonPhone** means the Ezsignsigner will only be able to sign \"In-Person\" and will need to authenticate using SMS or Phone call. No email will be sent for invitation to sign. **Additional fee applies**. 5. **InPerson** means the Ezsignsigner will only be able to sign \"In-Person\" and there won't be any authentication. No email will be sent for invitation to sign. Make sure you evaluate the risk of signature denial and at minimum, we recommend you use a handwritten signature type.")
  public EEzsignsignerLogintypeEnum getEEzsignsignerLogintype() {
    return eEzsignsignerLogintype;
  }
  public void setEEzsignsignerLogintype(EEzsignsignerLogintypeEnum eEzsignsignerLogintype) {
    this.eEzsignsignerLogintype = eEzsignsignerLogintype;
  }

  /**
   * The predefined answer to the secret question the Ezsignsigner will need to provide to successfully authenticate.
   **/
  @ApiModelProperty(value = "The predefined answer to the secret question the Ezsignsigner will need to provide to successfully authenticate.")
  public String getSEzsignsignerSecretanswer() {
    return sEzsignsignerSecretanswer;
  }
  public void setSEzsignsignerSecretanswer(String sEzsignsignerSecretanswer) {
    this.sEzsignsignerSecretanswer = sEzsignsignerSecretanswer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignerRequestCompound ezsignsignerRequestCompound = (EzsignsignerRequestCompound) o;
    return (this.objContact == null ? ezsignsignerRequestCompound.objContact == null : this.objContact.equals(ezsignsignerRequestCompound.objContact)) &&
        (this.fkiTaxassignmentID == null ? ezsignsignerRequestCompound.fkiTaxassignmentID == null : this.fkiTaxassignmentID.equals(ezsignsignerRequestCompound.fkiTaxassignmentID)) &&
        (this.fkiSecretquestionID == null ? ezsignsignerRequestCompound.fkiSecretquestionID == null : this.fkiSecretquestionID.equals(ezsignsignerRequestCompound.fkiSecretquestionID)) &&
        (this.eEzsignsignerLogintype == null ? ezsignsignerRequestCompound.eEzsignsignerLogintype == null : this.eEzsignsignerLogintype.equals(ezsignsignerRequestCompound.eEzsignsignerLogintype)) &&
        (this.sEzsignsignerSecretanswer == null ? ezsignsignerRequestCompound.sEzsignsignerSecretanswer == null : this.sEzsignsignerSecretanswer.equals(ezsignsignerRequestCompound.sEzsignsignerSecretanswer));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objContact == null ? 0: this.objContact.hashCode());
    result = 31 * result + (this.fkiTaxassignmentID == null ? 0: this.fkiTaxassignmentID.hashCode());
    result = 31 * result + (this.fkiSecretquestionID == null ? 0: this.fkiSecretquestionID.hashCode());
    result = 31 * result + (this.eEzsignsignerLogintype == null ? 0: this.eEzsignsignerLogintype.hashCode());
    result = 31 * result + (this.sEzsignsignerSecretanswer == null ? 0: this.sEzsignsignerSecretanswer.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignerRequestCompound {\n");
    
    sb.append("  objContact: ").append(objContact).append("\n");
    sb.append("  fkiTaxassignmentID: ").append(fkiTaxassignmentID).append("\n");
    sb.append("  fkiSecretquestionID: ").append(fkiSecretquestionID).append("\n");
    sb.append("  eEzsignsignerLogintype: ").append(eEzsignsignerLogintype).append("\n");
    sb.append("  sEzsignsignerSecretanswer: ").append(sEzsignsignerSecretanswer).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
