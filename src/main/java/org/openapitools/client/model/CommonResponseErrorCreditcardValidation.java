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

import java.util.*;
import org.openapitools.client.model.CustomCreditcardtransactionresponseResponse;
import org.openapitools.client.model.FieldEErrorCode;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Generic Error Message
 **/
@ApiModel(description = "Generic Error Message")
public class CommonResponseErrorCreditcardValidation {
  
  @SerializedName("sErrorMessage")
  private String sErrorMessage = null;
  @SerializedName("eErrorCode")
  private FieldEErrorCode eErrorCode = null;
  @SerializedName("a_sErrorMessagedetail")
  private List<String> aSErrorMessagedetail = null;
  @SerializedName("objCreditcardtransactionresponse")
  private CustomCreditcardtransactionresponseResponse objCreditcardtransactionresponse = null;

  /**
   * The message giving details about the error
   **/
  @ApiModelProperty(required = true, value = "The message giving details about the error")
  public String getSErrorMessage() {
    return sErrorMessage;
  }
  public void setSErrorMessage(String sErrorMessage) {
    this.sErrorMessage = sErrorMessage;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEErrorCode getEErrorCode() {
    return eErrorCode;
  }
  public void setEErrorCode(FieldEErrorCode eErrorCode) {
    this.eErrorCode = eErrorCode;
  }

  /**
   * More error message detail
   **/
  @ApiModelProperty(value = "More error message detail")
  public List<String> getASErrorMessagedetail() {
    return aSErrorMessagedetail;
  }
  public void setASErrorMessagedetail(List<String> aSErrorMessagedetail) {
    this.aSErrorMessagedetail = aSErrorMessagedetail;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CustomCreditcardtransactionresponseResponse getObjCreditcardtransactionresponse() {
    return objCreditcardtransactionresponse;
  }
  public void setObjCreditcardtransactionresponse(CustomCreditcardtransactionresponseResponse objCreditcardtransactionresponse) {
    this.objCreditcardtransactionresponse = objCreditcardtransactionresponse;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonResponseErrorCreditcardValidation commonResponseErrorCreditcardValidation = (CommonResponseErrorCreditcardValidation) o;
    return (this.sErrorMessage == null ? commonResponseErrorCreditcardValidation.sErrorMessage == null : this.sErrorMessage.equals(commonResponseErrorCreditcardValidation.sErrorMessage)) &&
        (this.eErrorCode == null ? commonResponseErrorCreditcardValidation.eErrorCode == null : this.eErrorCode.equals(commonResponseErrorCreditcardValidation.eErrorCode)) &&
        (this.aSErrorMessagedetail == null ? commonResponseErrorCreditcardValidation.aSErrorMessagedetail == null : this.aSErrorMessagedetail.equals(commonResponseErrorCreditcardValidation.aSErrorMessagedetail)) &&
        (this.objCreditcardtransactionresponse == null ? commonResponseErrorCreditcardValidation.objCreditcardtransactionresponse == null : this.objCreditcardtransactionresponse.equals(commonResponseErrorCreditcardValidation.objCreditcardtransactionresponse));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sErrorMessage == null ? 0: this.sErrorMessage.hashCode());
    result = 31 * result + (this.eErrorCode == null ? 0: this.eErrorCode.hashCode());
    result = 31 * result + (this.aSErrorMessagedetail == null ? 0: this.aSErrorMessagedetail.hashCode());
    result = 31 * result + (this.objCreditcardtransactionresponse == null ? 0: this.objCreditcardtransactionresponse.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonResponseErrorCreditcardValidation {\n");
    
    sb.append("  sErrorMessage: ").append(sErrorMessage).append("\n");
    sb.append("  eErrorCode: ").append(eErrorCode).append("\n");
    sb.append("  aSErrorMessagedetail: ").append(aSErrorMessagedetail).append("\n");
    sb.append("  objCreditcardtransactionresponse: ").append(objCreditcardtransactionresponse).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
