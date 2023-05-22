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
import org.openapitools.client.model.CustomEzsignsignatureEzsignsignaturesAutomaticResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsigndocument Object in the context of an EzsignsignaturesAutomatic path
 **/
@ApiModel(description = "An Ezsigndocument Object in the context of an EzsignsignaturesAutomatic path")
public class CustomEzsigndocumentEzsignsignaturesAutomaticResponse {
  
  @SerializedName("pkiEzsigndocumentID")
  private Integer pkiEzsigndocumentID = null;
  @SerializedName("sEzsigndocumentName")
  private String sEzsigndocumentName = null;
  @SerializedName("a_objEzsignsignature")
  private List<CustomEzsignsignatureEzsignsignaturesAutomaticResponse> aObjEzsignsignature = null;

  /**
   * The unique ID of the Ezsigndocument
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigndocument")
  public Integer getPkiEzsigndocumentID() {
    return pkiEzsigndocumentID;
  }
  public void setPkiEzsigndocumentID(Integer pkiEzsigndocumentID) {
    this.pkiEzsigndocumentID = pkiEzsigndocumentID;
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
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomEzsignsignatureEzsignsignaturesAutomaticResponse> getAObjEzsignsignature() {
    return aObjEzsignsignature;
  }
  public void setAObjEzsignsignature(List<CustomEzsignsignatureEzsignsignaturesAutomaticResponse> aObjEzsignsignature) {
    this.aObjEzsignsignature = aObjEzsignsignature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEzsigndocumentEzsignsignaturesAutomaticResponse customEzsigndocumentEzsignsignaturesAutomaticResponse = (CustomEzsigndocumentEzsignsignaturesAutomaticResponse) o;
    return (this.pkiEzsigndocumentID == null ? customEzsigndocumentEzsignsignaturesAutomaticResponse.pkiEzsigndocumentID == null : this.pkiEzsigndocumentID.equals(customEzsigndocumentEzsignsignaturesAutomaticResponse.pkiEzsigndocumentID)) &&
        (this.sEzsigndocumentName == null ? customEzsigndocumentEzsignsignaturesAutomaticResponse.sEzsigndocumentName == null : this.sEzsigndocumentName.equals(customEzsigndocumentEzsignsignaturesAutomaticResponse.sEzsigndocumentName)) &&
        (this.aObjEzsignsignature == null ? customEzsigndocumentEzsignsignaturesAutomaticResponse.aObjEzsignsignature == null : this.aObjEzsignsignature.equals(customEzsigndocumentEzsignsignaturesAutomaticResponse.aObjEzsignsignature));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigndocumentID == null ? 0: this.pkiEzsigndocumentID.hashCode());
    result = 31 * result + (this.sEzsigndocumentName == null ? 0: this.sEzsigndocumentName.hashCode());
    result = 31 * result + (this.aObjEzsignsignature == null ? 0: this.aObjEzsignsignature.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEzsigndocumentEzsignsignaturesAutomaticResponse {\n");
    
    sb.append("  pkiEzsigndocumentID: ").append(pkiEzsigndocumentID).append("\n");
    sb.append("  sEzsigndocumentName: ").append(sEzsigndocumentName).append("\n");
    sb.append("  aObjEzsignsignature: ").append(aObjEzsignsignature).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}