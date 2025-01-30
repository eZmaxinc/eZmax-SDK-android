/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.FieldEEzsigntemplatedocumentpagerecognitionOperator;
import org.openapitools.client.model.FieldEEzsigntemplatedocumentpagerecognitionSection;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezsigntemplatedocumentpagerecognition Object
 **/
@ApiModel(description = "A Ezsigntemplatedocumentpagerecognition Object")
public class EzsigntemplatedocumentpagerecognitionResponseCompound {
  
  @SerializedName("pkiEzsigntemplatedocumentpagerecognitionID")
  private Integer pkiEzsigntemplatedocumentpagerecognitionID = null;
  @SerializedName("fkiEzsigntemplatedocumentpageID")
  private Integer fkiEzsigntemplatedocumentpageID = null;
  @SerializedName("eEzsigntemplatedocumentpagerecognitionOperator")
  private FieldEEzsigntemplatedocumentpagerecognitionOperator eEzsigntemplatedocumentpagerecognitionOperator = null;
  @SerializedName("eEzsigntemplatedocumentpagerecognitionSection")
  private FieldEEzsigntemplatedocumentpagerecognitionSection eEzsigntemplatedocumentpagerecognitionSection = null;
  @SerializedName("iEzsigntemplatedocumentpagerecognitionSimilarpercentage")
  private Integer iEzsigntemplatedocumentpagerecognitionSimilarpercentage = null;
  @SerializedName("iEzsigntemplatedocumentpagerecognitionX")
  private Integer iEzsigntemplatedocumentpagerecognitionX = null;
  @SerializedName("iEzsigntemplatedocumentpagerecognitionY")
  private Integer iEzsigntemplatedocumentpagerecognitionY = null;
  @SerializedName("iEzsigntemplatedocumentpagerecognitionWidth")
  private Integer iEzsigntemplatedocumentpagerecognitionWidth = null;
  @SerializedName("iEzsigntemplatedocumentpagerecognitionHeight")
  private Integer iEzsigntemplatedocumentpagerecognitionHeight = null;
  @SerializedName("tEzsigntemplatedocumentpagerecognitionText")
  private String tEzsigntemplatedocumentpagerecognitionText = null;

  /**
   * The unique ID of the Ezsigntemplatedocumentpagerecognition
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplatedocumentpagerecognition")
  public Integer getPkiEzsigntemplatedocumentpagerecognitionID() {
    return pkiEzsigntemplatedocumentpagerecognitionID;
  }
  public void setPkiEzsigntemplatedocumentpagerecognitionID(Integer pkiEzsigntemplatedocumentpagerecognitionID) {
    this.pkiEzsigntemplatedocumentpagerecognitionID = pkiEzsigntemplatedocumentpagerecognitionID;
  }

  /**
   * The unique ID of the Ezsigntemplatedocumentpage
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplatedocumentpage")
  public Integer getFkiEzsigntemplatedocumentpageID() {
    return fkiEzsigntemplatedocumentpageID;
  }
  public void setFkiEzsigntemplatedocumentpageID(Integer fkiEzsigntemplatedocumentpageID) {
    this.fkiEzsigntemplatedocumentpageID = fkiEzsigntemplatedocumentpageID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsigntemplatedocumentpagerecognitionOperator getEEzsigntemplatedocumentpagerecognitionOperator() {
    return eEzsigntemplatedocumentpagerecognitionOperator;
  }
  public void setEEzsigntemplatedocumentpagerecognitionOperator(FieldEEzsigntemplatedocumentpagerecognitionOperator eEzsigntemplatedocumentpagerecognitionOperator) {
    this.eEzsigntemplatedocumentpagerecognitionOperator = eEzsigntemplatedocumentpagerecognitionOperator;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsigntemplatedocumentpagerecognitionSection getEEzsigntemplatedocumentpagerecognitionSection() {
    return eEzsigntemplatedocumentpagerecognitionSection;
  }
  public void setEEzsigntemplatedocumentpagerecognitionSection(FieldEEzsigntemplatedocumentpagerecognitionSection eEzsigntemplatedocumentpagerecognitionSection) {
    this.eEzsigntemplatedocumentpagerecognitionSection = eEzsigntemplatedocumentpagerecognitionSection;
  }

  /**
   * The similarpercentage of the Ezsigntemplatedocumentpagerecognition
   * minimum: 60
   * maximum: 100
   **/
  @ApiModelProperty(value = "The similarpercentage of the Ezsigntemplatedocumentpagerecognition")
  public Integer getIEzsigntemplatedocumentpagerecognitionSimilarpercentage() {
    return iEzsigntemplatedocumentpagerecognitionSimilarpercentage;
  }
  public void setIEzsigntemplatedocumentpagerecognitionSimilarpercentage(Integer iEzsigntemplatedocumentpagerecognitionSimilarpercentage) {
    this.iEzsigntemplatedocumentpagerecognitionSimilarpercentage = iEzsigntemplatedocumentpagerecognitionSimilarpercentage;
  }

  /**
   * The x of the Ezsigntemplatedocumentpagerecognition
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(value = "The x of the Ezsigntemplatedocumentpagerecognition")
  public Integer getIEzsigntemplatedocumentpagerecognitionX() {
    return iEzsigntemplatedocumentpagerecognitionX;
  }
  public void setIEzsigntemplatedocumentpagerecognitionX(Integer iEzsigntemplatedocumentpagerecognitionX) {
    this.iEzsigntemplatedocumentpagerecognitionX = iEzsigntemplatedocumentpagerecognitionX;
  }

  /**
   * The y of the Ezsigntemplatedocumentpagerecognition
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(value = "The y of the Ezsigntemplatedocumentpagerecognition")
  public Integer getIEzsigntemplatedocumentpagerecognitionY() {
    return iEzsigntemplatedocumentpagerecognitionY;
  }
  public void setIEzsigntemplatedocumentpagerecognitionY(Integer iEzsigntemplatedocumentpagerecognitionY) {
    this.iEzsigntemplatedocumentpagerecognitionY = iEzsigntemplatedocumentpagerecognitionY;
  }

  /**
   * The width of the Ezsigntemplatedocumentpagerecognition
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(value = "The width of the Ezsigntemplatedocumentpagerecognition")
  public Integer getIEzsigntemplatedocumentpagerecognitionWidth() {
    return iEzsigntemplatedocumentpagerecognitionWidth;
  }
  public void setIEzsigntemplatedocumentpagerecognitionWidth(Integer iEzsigntemplatedocumentpagerecognitionWidth) {
    this.iEzsigntemplatedocumentpagerecognitionWidth = iEzsigntemplatedocumentpagerecognitionWidth;
  }

  /**
   * The height of the Ezsigntemplatedocumentpagerecognition
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(value = "The height of the Ezsigntemplatedocumentpagerecognition")
  public Integer getIEzsigntemplatedocumentpagerecognitionHeight() {
    return iEzsigntemplatedocumentpagerecognitionHeight;
  }
  public void setIEzsigntemplatedocumentpagerecognitionHeight(Integer iEzsigntemplatedocumentpagerecognitionHeight) {
    this.iEzsigntemplatedocumentpagerecognitionHeight = iEzsigntemplatedocumentpagerecognitionHeight;
  }

  /**
   * The text of the Ezsigntemplatedocumentpagerecognition
   **/
  @ApiModelProperty(required = true, value = "The text of the Ezsigntemplatedocumentpagerecognition")
  public String getTEzsigntemplatedocumentpagerecognitionText() {
    return tEzsigntemplatedocumentpagerecognitionText;
  }
  public void setTEzsigntemplatedocumentpagerecognitionText(String tEzsigntemplatedocumentpagerecognitionText) {
    this.tEzsigntemplatedocumentpagerecognitionText = tEzsigntemplatedocumentpagerecognitionText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatedocumentpagerecognitionResponseCompound ezsigntemplatedocumentpagerecognitionResponseCompound = (EzsigntemplatedocumentpagerecognitionResponseCompound) o;
    return (this.pkiEzsigntemplatedocumentpagerecognitionID == null ? ezsigntemplatedocumentpagerecognitionResponseCompound.pkiEzsigntemplatedocumentpagerecognitionID == null : this.pkiEzsigntemplatedocumentpagerecognitionID.equals(ezsigntemplatedocumentpagerecognitionResponseCompound.pkiEzsigntemplatedocumentpagerecognitionID)) &&
        (this.fkiEzsigntemplatedocumentpageID == null ? ezsigntemplatedocumentpagerecognitionResponseCompound.fkiEzsigntemplatedocumentpageID == null : this.fkiEzsigntemplatedocumentpageID.equals(ezsigntemplatedocumentpagerecognitionResponseCompound.fkiEzsigntemplatedocumentpageID)) &&
        (this.eEzsigntemplatedocumentpagerecognitionOperator == null ? ezsigntemplatedocumentpagerecognitionResponseCompound.eEzsigntemplatedocumentpagerecognitionOperator == null : this.eEzsigntemplatedocumentpagerecognitionOperator.equals(ezsigntemplatedocumentpagerecognitionResponseCompound.eEzsigntemplatedocumentpagerecognitionOperator)) &&
        (this.eEzsigntemplatedocumentpagerecognitionSection == null ? ezsigntemplatedocumentpagerecognitionResponseCompound.eEzsigntemplatedocumentpagerecognitionSection == null : this.eEzsigntemplatedocumentpagerecognitionSection.equals(ezsigntemplatedocumentpagerecognitionResponseCompound.eEzsigntemplatedocumentpagerecognitionSection)) &&
        (this.iEzsigntemplatedocumentpagerecognitionSimilarpercentage == null ? ezsigntemplatedocumentpagerecognitionResponseCompound.iEzsigntemplatedocumentpagerecognitionSimilarpercentage == null : this.iEzsigntemplatedocumentpagerecognitionSimilarpercentage.equals(ezsigntemplatedocumentpagerecognitionResponseCompound.iEzsigntemplatedocumentpagerecognitionSimilarpercentage)) &&
        (this.iEzsigntemplatedocumentpagerecognitionX == null ? ezsigntemplatedocumentpagerecognitionResponseCompound.iEzsigntemplatedocumentpagerecognitionX == null : this.iEzsigntemplatedocumentpagerecognitionX.equals(ezsigntemplatedocumentpagerecognitionResponseCompound.iEzsigntemplatedocumentpagerecognitionX)) &&
        (this.iEzsigntemplatedocumentpagerecognitionY == null ? ezsigntemplatedocumentpagerecognitionResponseCompound.iEzsigntemplatedocumentpagerecognitionY == null : this.iEzsigntemplatedocumentpagerecognitionY.equals(ezsigntemplatedocumentpagerecognitionResponseCompound.iEzsigntemplatedocumentpagerecognitionY)) &&
        (this.iEzsigntemplatedocumentpagerecognitionWidth == null ? ezsigntemplatedocumentpagerecognitionResponseCompound.iEzsigntemplatedocumentpagerecognitionWidth == null : this.iEzsigntemplatedocumentpagerecognitionWidth.equals(ezsigntemplatedocumentpagerecognitionResponseCompound.iEzsigntemplatedocumentpagerecognitionWidth)) &&
        (this.iEzsigntemplatedocumentpagerecognitionHeight == null ? ezsigntemplatedocumentpagerecognitionResponseCompound.iEzsigntemplatedocumentpagerecognitionHeight == null : this.iEzsigntemplatedocumentpagerecognitionHeight.equals(ezsigntemplatedocumentpagerecognitionResponseCompound.iEzsigntemplatedocumentpagerecognitionHeight)) &&
        (this.tEzsigntemplatedocumentpagerecognitionText == null ? ezsigntemplatedocumentpagerecognitionResponseCompound.tEzsigntemplatedocumentpagerecognitionText == null : this.tEzsigntemplatedocumentpagerecognitionText.equals(ezsigntemplatedocumentpagerecognitionResponseCompound.tEzsigntemplatedocumentpagerecognitionText));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplatedocumentpagerecognitionID == null ? 0: this.pkiEzsigntemplatedocumentpagerecognitionID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplatedocumentpageID == null ? 0: this.fkiEzsigntemplatedocumentpageID.hashCode());
    result = 31 * result + (this.eEzsigntemplatedocumentpagerecognitionOperator == null ? 0: this.eEzsigntemplatedocumentpagerecognitionOperator.hashCode());
    result = 31 * result + (this.eEzsigntemplatedocumentpagerecognitionSection == null ? 0: this.eEzsigntemplatedocumentpagerecognitionSection.hashCode());
    result = 31 * result + (this.iEzsigntemplatedocumentpagerecognitionSimilarpercentage == null ? 0: this.iEzsigntemplatedocumentpagerecognitionSimilarpercentage.hashCode());
    result = 31 * result + (this.iEzsigntemplatedocumentpagerecognitionX == null ? 0: this.iEzsigntemplatedocumentpagerecognitionX.hashCode());
    result = 31 * result + (this.iEzsigntemplatedocumentpagerecognitionY == null ? 0: this.iEzsigntemplatedocumentpagerecognitionY.hashCode());
    result = 31 * result + (this.iEzsigntemplatedocumentpagerecognitionWidth == null ? 0: this.iEzsigntemplatedocumentpagerecognitionWidth.hashCode());
    result = 31 * result + (this.iEzsigntemplatedocumentpagerecognitionHeight == null ? 0: this.iEzsigntemplatedocumentpagerecognitionHeight.hashCode());
    result = 31 * result + (this.tEzsigntemplatedocumentpagerecognitionText == null ? 0: this.tEzsigntemplatedocumentpagerecognitionText.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatedocumentpagerecognitionResponseCompound {\n");
    
    sb.append("  pkiEzsigntemplatedocumentpagerecognitionID: ").append(pkiEzsigntemplatedocumentpagerecognitionID).append("\n");
    sb.append("  fkiEzsigntemplatedocumentpageID: ").append(fkiEzsigntemplatedocumentpageID).append("\n");
    sb.append("  eEzsigntemplatedocumentpagerecognitionOperator: ").append(eEzsigntemplatedocumentpagerecognitionOperator).append("\n");
    sb.append("  eEzsigntemplatedocumentpagerecognitionSection: ").append(eEzsigntemplatedocumentpagerecognitionSection).append("\n");
    sb.append("  iEzsigntemplatedocumentpagerecognitionSimilarpercentage: ").append(iEzsigntemplatedocumentpagerecognitionSimilarpercentage).append("\n");
    sb.append("  iEzsigntemplatedocumentpagerecognitionX: ").append(iEzsigntemplatedocumentpagerecognitionX).append("\n");
    sb.append("  iEzsigntemplatedocumentpagerecognitionY: ").append(iEzsigntemplatedocumentpagerecognitionY).append("\n");
    sb.append("  iEzsigntemplatedocumentpagerecognitionWidth: ").append(iEzsigntemplatedocumentpagerecognitionWidth).append("\n");
    sb.append("  iEzsigntemplatedocumentpagerecognitionHeight: ").append(iEzsigntemplatedocumentpagerecognitionHeight).append("\n");
    sb.append("  tEzsigntemplatedocumentpagerecognitionText: ").append(tEzsigntemplatedocumentpagerecognitionText).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
