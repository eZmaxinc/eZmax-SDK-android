/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
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
 * A Ezsigntemplatedocument Object
 **/
@ApiModel(description = "A Ezsigntemplatedocument Object")
public class EzsigntemplatedocumentResponse {
  
  @SerializedName("pkiEzsigntemplatedocumentID")
  private Integer pkiEzsigntemplatedocumentID = null;
  @SerializedName("fkiEzsigntemplateID")
  private Integer fkiEzsigntemplateID = null;
  @SerializedName("sEzsigntemplatedocumentName")
  private String sEzsigntemplatedocumentName = null;
  @SerializedName("iEzsigntemplatedocumentPagetotal")
  private Integer iEzsigntemplatedocumentPagetotal = null;
  @SerializedName("iEzsigntemplatedocumentSignaturetotal")
  private Integer iEzsigntemplatedocumentSignaturetotal = null;

  /**
   * The unique ID of the Ezsigntemplatedocument
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplatedocument")
  public Integer getPkiEzsigntemplatedocumentID() {
    return pkiEzsigntemplatedocumentID;
  }
  public void setPkiEzsigntemplatedocumentID(Integer pkiEzsigntemplatedocumentID) {
    this.pkiEzsigntemplatedocumentID = pkiEzsigntemplatedocumentID;
  }

  /**
   * The unique ID of the Ezsigntemplate
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplate")
  public Integer getFkiEzsigntemplateID() {
    return fkiEzsigntemplateID;
  }
  public void setFkiEzsigntemplateID(Integer fkiEzsigntemplateID) {
    this.fkiEzsigntemplateID = fkiEzsigntemplateID;
  }

  /**
   * The name of the Ezsigntemplatedocument.
   **/
  @ApiModelProperty(required = true, value = "The name of the Ezsigntemplatedocument.")
  public String getSEzsigntemplatedocumentName() {
    return sEzsigntemplatedocumentName;
  }
  public void setSEzsigntemplatedocumentName(String sEzsigntemplatedocumentName) {
    this.sEzsigntemplatedocumentName = sEzsigntemplatedocumentName;
  }

  /**
   * The number of pages in the Ezsigntemplatedocument.
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The number of pages in the Ezsigntemplatedocument.")
  public Integer getIEzsigntemplatedocumentPagetotal() {
    return iEzsigntemplatedocumentPagetotal;
  }
  public void setIEzsigntemplatedocumentPagetotal(Integer iEzsigntemplatedocumentPagetotal) {
    this.iEzsigntemplatedocumentPagetotal = iEzsigntemplatedocumentPagetotal;
  }

  /**
   * The number of total signatures in the Ezsigntemplate.
   **/
  @ApiModelProperty(required = true, value = "The number of total signatures in the Ezsigntemplate.")
  public Integer getIEzsigntemplatedocumentSignaturetotal() {
    return iEzsigntemplatedocumentSignaturetotal;
  }
  public void setIEzsigntemplatedocumentSignaturetotal(Integer iEzsigntemplatedocumentSignaturetotal) {
    this.iEzsigntemplatedocumentSignaturetotal = iEzsigntemplatedocumentSignaturetotal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatedocumentResponse ezsigntemplatedocumentResponse = (EzsigntemplatedocumentResponse) o;
    return (this.pkiEzsigntemplatedocumentID == null ? ezsigntemplatedocumentResponse.pkiEzsigntemplatedocumentID == null : this.pkiEzsigntemplatedocumentID.equals(ezsigntemplatedocumentResponse.pkiEzsigntemplatedocumentID)) &&
        (this.fkiEzsigntemplateID == null ? ezsigntemplatedocumentResponse.fkiEzsigntemplateID == null : this.fkiEzsigntemplateID.equals(ezsigntemplatedocumentResponse.fkiEzsigntemplateID)) &&
        (this.sEzsigntemplatedocumentName == null ? ezsigntemplatedocumentResponse.sEzsigntemplatedocumentName == null : this.sEzsigntemplatedocumentName.equals(ezsigntemplatedocumentResponse.sEzsigntemplatedocumentName)) &&
        (this.iEzsigntemplatedocumentPagetotal == null ? ezsigntemplatedocumentResponse.iEzsigntemplatedocumentPagetotal == null : this.iEzsigntemplatedocumentPagetotal.equals(ezsigntemplatedocumentResponse.iEzsigntemplatedocumentPagetotal)) &&
        (this.iEzsigntemplatedocumentSignaturetotal == null ? ezsigntemplatedocumentResponse.iEzsigntemplatedocumentSignaturetotal == null : this.iEzsigntemplatedocumentSignaturetotal.equals(ezsigntemplatedocumentResponse.iEzsigntemplatedocumentSignaturetotal));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplatedocumentID == null ? 0: this.pkiEzsigntemplatedocumentID.hashCode());
    result = 31 * result + (this.fkiEzsigntemplateID == null ? 0: this.fkiEzsigntemplateID.hashCode());
    result = 31 * result + (this.sEzsigntemplatedocumentName == null ? 0: this.sEzsigntemplatedocumentName.hashCode());
    result = 31 * result + (this.iEzsigntemplatedocumentPagetotal == null ? 0: this.iEzsigntemplatedocumentPagetotal.hashCode());
    result = 31 * result + (this.iEzsigntemplatedocumentSignaturetotal == null ? 0: this.iEzsigntemplatedocumentSignaturetotal.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatedocumentResponse {\n");
    
    sb.append("  pkiEzsigntemplatedocumentID: ").append(pkiEzsigntemplatedocumentID).append("\n");
    sb.append("  fkiEzsigntemplateID: ").append(fkiEzsigntemplateID).append("\n");
    sb.append("  sEzsigntemplatedocumentName: ").append(sEzsigntemplatedocumentName).append("\n");
    sb.append("  iEzsigntemplatedocumentPagetotal: ").append(iEzsigntemplatedocumentPagetotal).append("\n");
    sb.append("  iEzsigntemplatedocumentSignaturetotal: ").append(iEzsigntemplatedocumentSignaturetotal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
