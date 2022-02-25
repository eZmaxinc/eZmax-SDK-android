/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.4
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CustomFormDataSignerResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A form Data Document Object 
 **/
@ApiModel(description = "A form Data Document Object ")
public class CustomFormDataDocumentResponse {
  
  @SerializedName("pkiEzsigndocumentID")
  private Integer pkiEzsigndocumentID = null;
  @SerializedName("fkiEzsignfolderID")
  private Integer fkiEzsignfolderID = null;
  @SerializedName("sEzsigndocumentName")
  private String sEzsigndocumentName = null;
  @SerializedName("dtModifiedDate")
  private String dtModifiedDate = null;
  @SerializedName("a_objFormDataSigner")
  private List<CustomFormDataSignerResponse> aObjFormDataSigner = null;

  /**
   * The unique ID of the Ezsigndocument
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigndocument")
  public Integer getPkiEzsigndocumentID() {
    return pkiEzsigndocumentID;
  }
  public void setPkiEzsigndocumentID(Integer pkiEzsigndocumentID) {
    this.pkiEzsigndocumentID = pkiEzsigndocumentID;
  }

  /**
   * The unique ID of the Ezsignfolder
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfolder")
  public Integer getFkiEzsignfolderID() {
    return fkiEzsignfolderID;
  }
  public void setFkiEzsignfolderID(Integer fkiEzsignfolderID) {
    this.fkiEzsignfolderID = fkiEzsignfolderID;
  }

  /**
   * The name of the document that will be presented to Ezsignfoldersignerassociations
   **/
  @ApiModelProperty(required = true, value = "The name of the document that will be presented to Ezsignfoldersignerassociations")
  public String getSEzsigndocumentName() {
    return sEzsigndocumentName;
  }
  public void setSEzsigndocumentName(String sEzsigndocumentName) {
    this.sEzsigndocumentName = sEzsigndocumentName;
  }

  /**
   * The date and time at which the object was last modified
   **/
  @ApiModelProperty(required = true, value = "The date and time at which the object was last modified")
  public String getDtModifiedDate() {
    return dtModifiedDate;
  }
  public void setDtModifiedDate(String dtModifiedDate) {
    this.dtModifiedDate = dtModifiedDate;
  }

  /**
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomFormDataSignerResponse> getAObjFormDataSigner() {
    return aObjFormDataSigner;
  }
  public void setAObjFormDataSigner(List<CustomFormDataSignerResponse> aObjFormDataSigner) {
    this.aObjFormDataSigner = aObjFormDataSigner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFormDataDocumentResponse customFormDataDocumentResponse = (CustomFormDataDocumentResponse) o;
    return (this.pkiEzsigndocumentID == null ? customFormDataDocumentResponse.pkiEzsigndocumentID == null : this.pkiEzsigndocumentID.equals(customFormDataDocumentResponse.pkiEzsigndocumentID)) &&
        (this.fkiEzsignfolderID == null ? customFormDataDocumentResponse.fkiEzsignfolderID == null : this.fkiEzsignfolderID.equals(customFormDataDocumentResponse.fkiEzsignfolderID)) &&
        (this.sEzsigndocumentName == null ? customFormDataDocumentResponse.sEzsigndocumentName == null : this.sEzsigndocumentName.equals(customFormDataDocumentResponse.sEzsigndocumentName)) &&
        (this.dtModifiedDate == null ? customFormDataDocumentResponse.dtModifiedDate == null : this.dtModifiedDate.equals(customFormDataDocumentResponse.dtModifiedDate)) &&
        (this.aObjFormDataSigner == null ? customFormDataDocumentResponse.aObjFormDataSigner == null : this.aObjFormDataSigner.equals(customFormDataDocumentResponse.aObjFormDataSigner));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigndocumentID == null ? 0: this.pkiEzsigndocumentID.hashCode());
    result = 31 * result + (this.fkiEzsignfolderID == null ? 0: this.fkiEzsignfolderID.hashCode());
    result = 31 * result + (this.sEzsigndocumentName == null ? 0: this.sEzsigndocumentName.hashCode());
    result = 31 * result + (this.dtModifiedDate == null ? 0: this.dtModifiedDate.hashCode());
    result = 31 * result + (this.aObjFormDataSigner == null ? 0: this.aObjFormDataSigner.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFormDataDocumentResponse {\n");
    
    sb.append("  pkiEzsigndocumentID: ").append(pkiEzsigndocumentID).append("\n");
    sb.append("  fkiEzsignfolderID: ").append(fkiEzsignfolderID).append("\n");
    sb.append("  sEzsigndocumentName: ").append(sEzsigndocumentName).append("\n");
    sb.append("  dtModifiedDate: ").append(dtModifiedDate).append("\n");
    sb.append("  aObjFormDataSigner: ").append(aObjFormDataSigner).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
