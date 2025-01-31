/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.1
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CustomEzsignfoldertransmissionSignerResponse;
import org.openapitools.client.model.FieldEEzsignfolderStep;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignfolder Object in the context of an Ezsignbulksendtransmission
 **/
@ApiModel(description = "An Ezsignfolder Object in the context of an Ezsignbulksendtransmission")
public class CustomEzsignfoldertransmissionResponse {
  
  @SerializedName("pkiEzsignfolderID")
  private Integer pkiEzsignfolderID = null;
  @SerializedName("sEzsignfolderDescription")
  private String sEzsignfolderDescription = null;
  @SerializedName("eEzsignfolderStep")
  private FieldEEzsignfolderStep eEzsignfolderStep = null;
  @SerializedName("iEzsignfolderSignaturetotal")
  private Integer iEzsignfolderSignaturetotal = null;
  @SerializedName("iEzsignfolderFormfieldtotal")
  private Integer iEzsignfolderFormfieldtotal = null;
  @SerializedName("iEzsignfolderSignaturesigned")
  private Integer iEzsignfolderSignaturesigned = null;
  @SerializedName("a_objEzsignfoldertransmissionSigner")
  private List<CustomEzsignfoldertransmissionSignerResponse> aObjEzsignfoldertransmissionSigner = null;

  /**
   * The unique ID of the Ezsignfolder
   * minimum: 0
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
  public FieldEEzsignfolderStep getEEzsignfolderStep() {
    return eEzsignfolderStep;
  }
  public void setEEzsignfolderStep(FieldEEzsignfolderStep eEzsignfolderStep) {
    this.eEzsignfolderStep = eEzsignfolderStep;
  }

  /**
   * The number of total signatures that were requested in the Ezsignfolder
   **/
  @ApiModelProperty(required = true, value = "The number of total signatures that were requested in the Ezsignfolder")
  public Integer getIEzsignfolderSignaturetotal() {
    return iEzsignfolderSignaturetotal;
  }
  public void setIEzsignfolderSignaturetotal(Integer iEzsignfolderSignaturetotal) {
    this.iEzsignfolderSignaturetotal = iEzsignfolderSignaturetotal;
  }

  /**
   * The number of total form fields that were requested in the Ezsignfolder
   **/
  @ApiModelProperty(required = true, value = "The number of total form fields that were requested in the Ezsignfolder")
  public Integer getIEzsignfolderFormfieldtotal() {
    return iEzsignfolderFormfieldtotal;
  }
  public void setIEzsignfolderFormfieldtotal(Integer iEzsignfolderFormfieldtotal) {
    this.iEzsignfolderFormfieldtotal = iEzsignfolderFormfieldtotal;
  }

  /**
   * The number of signatures that were signed in the Ezsignfolder.
   **/
  @ApiModelProperty(required = true, value = "The number of signatures that were signed in the Ezsignfolder.")
  public Integer getIEzsignfolderSignaturesigned() {
    return iEzsignfolderSignaturesigned;
  }
  public void setIEzsignfolderSignaturesigned(Integer iEzsignfolderSignaturesigned) {
    this.iEzsignfolderSignaturesigned = iEzsignfolderSignaturesigned;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomEzsignfoldertransmissionSignerResponse> getAObjEzsignfoldertransmissionSigner() {
    return aObjEzsignfoldertransmissionSigner;
  }
  public void setAObjEzsignfoldertransmissionSigner(List<CustomEzsignfoldertransmissionSignerResponse> aObjEzsignfoldertransmissionSigner) {
    this.aObjEzsignfoldertransmissionSigner = aObjEzsignfoldertransmissionSigner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEzsignfoldertransmissionResponse customEzsignfoldertransmissionResponse = (CustomEzsignfoldertransmissionResponse) o;
    return (this.pkiEzsignfolderID == null ? customEzsignfoldertransmissionResponse.pkiEzsignfolderID == null : this.pkiEzsignfolderID.equals(customEzsignfoldertransmissionResponse.pkiEzsignfolderID)) &&
        (this.sEzsignfolderDescription == null ? customEzsignfoldertransmissionResponse.sEzsignfolderDescription == null : this.sEzsignfolderDescription.equals(customEzsignfoldertransmissionResponse.sEzsignfolderDescription)) &&
        (this.eEzsignfolderStep == null ? customEzsignfoldertransmissionResponse.eEzsignfolderStep == null : this.eEzsignfolderStep.equals(customEzsignfoldertransmissionResponse.eEzsignfolderStep)) &&
        (this.iEzsignfolderSignaturetotal == null ? customEzsignfoldertransmissionResponse.iEzsignfolderSignaturetotal == null : this.iEzsignfolderSignaturetotal.equals(customEzsignfoldertransmissionResponse.iEzsignfolderSignaturetotal)) &&
        (this.iEzsignfolderFormfieldtotal == null ? customEzsignfoldertransmissionResponse.iEzsignfolderFormfieldtotal == null : this.iEzsignfolderFormfieldtotal.equals(customEzsignfoldertransmissionResponse.iEzsignfolderFormfieldtotal)) &&
        (this.iEzsignfolderSignaturesigned == null ? customEzsignfoldertransmissionResponse.iEzsignfolderSignaturesigned == null : this.iEzsignfolderSignaturesigned.equals(customEzsignfoldertransmissionResponse.iEzsignfolderSignaturesigned)) &&
        (this.aObjEzsignfoldertransmissionSigner == null ? customEzsignfoldertransmissionResponse.aObjEzsignfoldertransmissionSigner == null : this.aObjEzsignfoldertransmissionSigner.equals(customEzsignfoldertransmissionResponse.aObjEzsignfoldertransmissionSigner));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignfolderID == null ? 0: this.pkiEzsignfolderID.hashCode());
    result = 31 * result + (this.sEzsignfolderDescription == null ? 0: this.sEzsignfolderDescription.hashCode());
    result = 31 * result + (this.eEzsignfolderStep == null ? 0: this.eEzsignfolderStep.hashCode());
    result = 31 * result + (this.iEzsignfolderSignaturetotal == null ? 0: this.iEzsignfolderSignaturetotal.hashCode());
    result = 31 * result + (this.iEzsignfolderFormfieldtotal == null ? 0: this.iEzsignfolderFormfieldtotal.hashCode());
    result = 31 * result + (this.iEzsignfolderSignaturesigned == null ? 0: this.iEzsignfolderSignaturesigned.hashCode());
    result = 31 * result + (this.aObjEzsignfoldertransmissionSigner == null ? 0: this.aObjEzsignfoldertransmissionSigner.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEzsignfoldertransmissionResponse {\n");
    
    sb.append("  pkiEzsignfolderID: ").append(pkiEzsignfolderID).append("\n");
    sb.append("  sEzsignfolderDescription: ").append(sEzsignfolderDescription).append("\n");
    sb.append("  eEzsignfolderStep: ").append(eEzsignfolderStep).append("\n");
    sb.append("  iEzsignfolderSignaturetotal: ").append(iEzsignfolderSignaturetotal).append("\n");
    sb.append("  iEzsignfolderFormfieldtotal: ").append(iEzsignfolderFormfieldtotal).append("\n");
    sb.append("  iEzsignfolderSignaturesigned: ").append(iEzsignfolderSignaturesigned).append("\n");
    sb.append("  aObjEzsignfoldertransmissionSigner: ").append(aObjEzsignfoldertransmissionSigner).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
