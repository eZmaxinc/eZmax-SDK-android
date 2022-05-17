/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsignbulksendRequest;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsignbulksend Object and children
 **/
@ApiModel(description = "A Ezsignbulksend Object and children")
public class EzsignbulksendRequestCompound {
  
  @SerializedName("pkiEzsignbulksendID")
  private Integer pkiEzsignbulksendID = null;
  @SerializedName("fkiEzsignfoldertypeID")
  private Integer fkiEzsignfoldertypeID = null;
  @SerializedName("fkiLanguageID")
  private Integer fkiLanguageID = null;
  @SerializedName("sEzsignbulksendDescription")
  private String sEzsignbulksendDescription = null;
  @SerializedName("tEzsignbulksendNote")
  private String tEzsignbulksendNote = null;
  @SerializedName("bEzsignbulksendNeedvalidation")
  private Boolean bEzsignbulksendNeedvalidation = null;
  @SerializedName("bEzsignbulksendIsactive")
  private Boolean bEzsignbulksendIsactive = null;

  /**
   * The unique ID of the Ezsignbulksend
   **/
  @ApiModelProperty(value = "The unique ID of the Ezsignbulksend")
  public Integer getPkiEzsignbulksendID() {
    return pkiEzsignbulksendID;
  }
  public void setPkiEzsignbulksendID(Integer pkiEzsignbulksendID) {
    this.pkiEzsignbulksendID = pkiEzsignbulksendID;
  }

  /**
   * The unique ID of the Ezsignfoldertype.
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfoldertype.")
  public Integer getFkiEzsignfoldertypeID() {
    return fkiEzsignfoldertypeID;
  }
  public void setFkiEzsignfoldertypeID(Integer fkiEzsignfoldertypeID) {
    this.fkiEzsignfoldertypeID = fkiEzsignfoldertypeID;
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
   * The description of the Ezsignbulksend
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezsignbulksend")
  public String getSEzsignbulksendDescription() {
    return sEzsignbulksendDescription;
  }
  public void setSEzsignbulksendDescription(String sEzsignbulksendDescription) {
    this.sEzsignbulksendDescription = sEzsignbulksendDescription;
  }

  /**
   * Note about the Ezsignbulksend
   **/
  @ApiModelProperty(required = true, value = "Note about the Ezsignbulksend")
  public String getTEzsignbulksendNote() {
    return tEzsignbulksendNote;
  }
  public void setTEzsignbulksendNote(String tEzsignbulksendNote) {
    this.tEzsignbulksendNote = tEzsignbulksendNote;
  }

  /**
   * Whether the Ezsigntemplatepackage was automatically modified and needs a manual validation
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezsigntemplatepackage was automatically modified and needs a manual validation")
  public Boolean getBEzsignbulksendNeedvalidation() {
    return bEzsignbulksendNeedvalidation;
  }
  public void setBEzsignbulksendNeedvalidation(Boolean bEzsignbulksendNeedvalidation) {
    this.bEzsignbulksendNeedvalidation = bEzsignbulksendNeedvalidation;
  }

  /**
   * Whether the Ezsignbulksend is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Ezsignbulksend is active or not")
  public Boolean getBEzsignbulksendIsactive() {
    return bEzsignbulksendIsactive;
  }
  public void setBEzsignbulksendIsactive(Boolean bEzsignbulksendIsactive) {
    this.bEzsignbulksendIsactive = bEzsignbulksendIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksendRequestCompound ezsignbulksendRequestCompound = (EzsignbulksendRequestCompound) o;
    return (this.pkiEzsignbulksendID == null ? ezsignbulksendRequestCompound.pkiEzsignbulksendID == null : this.pkiEzsignbulksendID.equals(ezsignbulksendRequestCompound.pkiEzsignbulksendID)) &&
        (this.fkiEzsignfoldertypeID == null ? ezsignbulksendRequestCompound.fkiEzsignfoldertypeID == null : this.fkiEzsignfoldertypeID.equals(ezsignbulksendRequestCompound.fkiEzsignfoldertypeID)) &&
        (this.fkiLanguageID == null ? ezsignbulksendRequestCompound.fkiLanguageID == null : this.fkiLanguageID.equals(ezsignbulksendRequestCompound.fkiLanguageID)) &&
        (this.sEzsignbulksendDescription == null ? ezsignbulksendRequestCompound.sEzsignbulksendDescription == null : this.sEzsignbulksendDescription.equals(ezsignbulksendRequestCompound.sEzsignbulksendDescription)) &&
        (this.tEzsignbulksendNote == null ? ezsignbulksendRequestCompound.tEzsignbulksendNote == null : this.tEzsignbulksendNote.equals(ezsignbulksendRequestCompound.tEzsignbulksendNote)) &&
        (this.bEzsignbulksendNeedvalidation == null ? ezsignbulksendRequestCompound.bEzsignbulksendNeedvalidation == null : this.bEzsignbulksendNeedvalidation.equals(ezsignbulksendRequestCompound.bEzsignbulksendNeedvalidation)) &&
        (this.bEzsignbulksendIsactive == null ? ezsignbulksendRequestCompound.bEzsignbulksendIsactive == null : this.bEzsignbulksendIsactive.equals(ezsignbulksendRequestCompound.bEzsignbulksendIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignbulksendID == null ? 0: this.pkiEzsignbulksendID.hashCode());
    result = 31 * result + (this.fkiEzsignfoldertypeID == null ? 0: this.fkiEzsignfoldertypeID.hashCode());
    result = 31 * result + (this.fkiLanguageID == null ? 0: this.fkiLanguageID.hashCode());
    result = 31 * result + (this.sEzsignbulksendDescription == null ? 0: this.sEzsignbulksendDescription.hashCode());
    result = 31 * result + (this.tEzsignbulksendNote == null ? 0: this.tEzsignbulksendNote.hashCode());
    result = 31 * result + (this.bEzsignbulksendNeedvalidation == null ? 0: this.bEzsignbulksendNeedvalidation.hashCode());
    result = 31 * result + (this.bEzsignbulksendIsactive == null ? 0: this.bEzsignbulksendIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendRequestCompound {\n");
    
    sb.append("  pkiEzsignbulksendID: ").append(pkiEzsignbulksendID).append("\n");
    sb.append("  fkiEzsignfoldertypeID: ").append(fkiEzsignfoldertypeID).append("\n");
    sb.append("  fkiLanguageID: ").append(fkiLanguageID).append("\n");
    sb.append("  sEzsignbulksendDescription: ").append(sEzsignbulksendDescription).append("\n");
    sb.append("  tEzsignbulksendNote: ").append(tEzsignbulksendNote).append("\n");
    sb.append("  bEzsignbulksendNeedvalidation: ").append(bEzsignbulksendNeedvalidation).append("\n");
    sb.append("  bEzsignbulksendIsactive: ").append(bEzsignbulksendIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
