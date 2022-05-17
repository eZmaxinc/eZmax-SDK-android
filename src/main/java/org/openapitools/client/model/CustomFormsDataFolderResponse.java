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

import java.util.*;
import org.openapitools.client.model.CustomFormDataDocumentResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A forms Data Folder Object
 **/
@ApiModel(description = "A forms Data Folder Object")
public class CustomFormsDataFolderResponse {
  
  @SerializedName("pkiEzsignfolderID")
  private Integer pkiEzsignfolderID = null;
  @SerializedName("sEzsignfolderDescription")
  private String sEzsignfolderDescription = null;
  @SerializedName("a_objFormDataDocument")
  private List<CustomFormDataDocumentResponse> aObjFormDataDocument = null;

  /**
   * The unique ID of the Ezsignfolder
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignfolder")
  public Integer getPkiEzsignfolderID() {
    return pkiEzsignfolderID;
  }
  public void setPkiEzsignfolderID(Integer pkiEzsignfolderID) {
    this.pkiEzsignfolderID = pkiEzsignfolderID;
  }

  /**
   * The description of the Ezsignfolder
   **/
  @ApiModelProperty(required = true, value = "The description of the Ezsignfolder")
  public String getSEzsignfolderDescription() {
    return sEzsignfolderDescription;
  }
  public void setSEzsignfolderDescription(String sEzsignfolderDescription) {
    this.sEzsignfolderDescription = sEzsignfolderDescription;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomFormDataDocumentResponse> getAObjFormDataDocument() {
    return aObjFormDataDocument;
  }
  public void setAObjFormDataDocument(List<CustomFormDataDocumentResponse> aObjFormDataDocument) {
    this.aObjFormDataDocument = aObjFormDataDocument;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFormsDataFolderResponse customFormsDataFolderResponse = (CustomFormsDataFolderResponse) o;
    return (this.pkiEzsignfolderID == null ? customFormsDataFolderResponse.pkiEzsignfolderID == null : this.pkiEzsignfolderID.equals(customFormsDataFolderResponse.pkiEzsignfolderID)) &&
        (this.sEzsignfolderDescription == null ? customFormsDataFolderResponse.sEzsignfolderDescription == null : this.sEzsignfolderDescription.equals(customFormsDataFolderResponse.sEzsignfolderDescription)) &&
        (this.aObjFormDataDocument == null ? customFormsDataFolderResponse.aObjFormDataDocument == null : this.aObjFormDataDocument.equals(customFormsDataFolderResponse.aObjFormDataDocument));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignfolderID == null ? 0: this.pkiEzsignfolderID.hashCode());
    result = 31 * result + (this.sEzsignfolderDescription == null ? 0: this.sEzsignfolderDescription.hashCode());
    result = 31 * result + (this.aObjFormDataDocument == null ? 0: this.aObjFormDataDocument.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFormsDataFolderResponse {\n");
    
    sb.append("  pkiEzsignfolderID: ").append(pkiEzsignfolderID).append("\n");
    sb.append("  sEzsignfolderDescription: ").append(sEzsignfolderDescription).append("\n");
    sb.append("  aObjFormDataDocument: ").append(aObjFormDataDocument).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
