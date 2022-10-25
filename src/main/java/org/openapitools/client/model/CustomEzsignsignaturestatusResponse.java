/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
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
 * A Ezsignsignaturestatus Object and children to create a complete structure
 **/
@ApiModel(description = "A Ezsignsignaturestatus Object and children to create a complete structure")
public class CustomEzsignsignaturestatusResponse {
  
  public enum EEzsignsignaturestatusSteptypeEnum {
     Form,  Signature, 
  };
  @SerializedName("eEzsignsignaturestatusSteptype")
  private EEzsignsignaturestatusSteptypeEnum eEzsignsignaturestatusSteptype = null;
  @SerializedName("iEzsignsignaturestatusStep")
  private Integer iEzsignsignaturestatusStep = null;
  @SerializedName("iEzsignsignaturestatusTotal")
  private Integer iEzsignsignaturestatusTotal = null;
  @SerializedName("iEzsignsignaturestatusSigned")
  private Integer iEzsignsignaturestatusSigned = null;

  /**
   * Type of step
   **/
  @ApiModelProperty(required = true, value = "Type of step")
  public EEzsignsignaturestatusSteptypeEnum getEEzsignsignaturestatusSteptype() {
    return eEzsignsignaturestatusSteptype;
  }
  public void setEEzsignsignaturestatusSteptype(EEzsignsignaturestatusSteptypeEnum eEzsignsignaturestatusSteptype) {
    this.eEzsignsignaturestatusSteptype = eEzsignsignaturestatusSteptype;
  }

  /**
   * The step at which the Ezsignsigner will be invited to sign or fill the form fields
   **/
  @ApiModelProperty(required = true, value = "The step at which the Ezsignsigner will be invited to sign or fill the form fields")
  public Integer getIEzsignsignaturestatusStep() {
    return iEzsignsignaturestatusStep;
  }
  public void setIEzsignsignaturestatusStep(Integer iEzsignsignaturestatusStep) {
    this.iEzsignsignaturestatusStep = iEzsignsignaturestatusStep;
  }

  /**
   * The total number of signature or form fields the Ezsignsigner must process at the current step
   **/
  @ApiModelProperty(required = true, value = "The total number of signature or form fields the Ezsignsigner must process at the current step")
  public Integer getIEzsignsignaturestatusTotal() {
    return iEzsignsignaturestatusTotal;
  }
  public void setIEzsignsignaturestatusTotal(Integer iEzsignsignaturestatusTotal) {
    this.iEzsignsignaturestatusTotal = iEzsignsignaturestatusTotal;
  }

  /**
   * The number of signature or form fields the Ezsignsigner has already processed at the current step
   **/
  @ApiModelProperty(required = true, value = "The number of signature or form fields the Ezsignsigner has already processed at the current step")
  public Integer getIEzsignsignaturestatusSigned() {
    return iEzsignsignaturestatusSigned;
  }
  public void setIEzsignsignaturestatusSigned(Integer iEzsignsignaturestatusSigned) {
    this.iEzsignsignaturestatusSigned = iEzsignsignaturestatusSigned;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEzsignsignaturestatusResponse customEzsignsignaturestatusResponse = (CustomEzsignsignaturestatusResponse) o;
    return (this.eEzsignsignaturestatusSteptype == null ? customEzsignsignaturestatusResponse.eEzsignsignaturestatusSteptype == null : this.eEzsignsignaturestatusSteptype.equals(customEzsignsignaturestatusResponse.eEzsignsignaturestatusSteptype)) &&
        (this.iEzsignsignaturestatusStep == null ? customEzsignsignaturestatusResponse.iEzsignsignaturestatusStep == null : this.iEzsignsignaturestatusStep.equals(customEzsignsignaturestatusResponse.iEzsignsignaturestatusStep)) &&
        (this.iEzsignsignaturestatusTotal == null ? customEzsignsignaturestatusResponse.iEzsignsignaturestatusTotal == null : this.iEzsignsignaturestatusTotal.equals(customEzsignsignaturestatusResponse.iEzsignsignaturestatusTotal)) &&
        (this.iEzsignsignaturestatusSigned == null ? customEzsignsignaturestatusResponse.iEzsignsignaturestatusSigned == null : this.iEzsignsignaturestatusSigned.equals(customEzsignsignaturestatusResponse.iEzsignsignaturestatusSigned));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.eEzsignsignaturestatusSteptype == null ? 0: this.eEzsignsignaturestatusSteptype.hashCode());
    result = 31 * result + (this.iEzsignsignaturestatusStep == null ? 0: this.iEzsignsignaturestatusStep.hashCode());
    result = 31 * result + (this.iEzsignsignaturestatusTotal == null ? 0: this.iEzsignsignaturestatusTotal.hashCode());
    result = 31 * result + (this.iEzsignsignaturestatusSigned == null ? 0: this.iEzsignsignaturestatusSigned.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEzsignsignaturestatusResponse {\n");
    
    sb.append("  eEzsignsignaturestatusSteptype: ").append(eEzsignsignaturestatusSteptype).append("\n");
    sb.append("  iEzsignsignaturestatusStep: ").append(iEzsignsignaturestatusStep).append("\n");
    sb.append("  iEzsignsignaturestatusTotal: ").append(iEzsignsignaturestatusTotal).append("\n");
    sb.append("  iEzsignsignaturestatusSigned: ").append(iEzsignsignaturestatusSigned).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
