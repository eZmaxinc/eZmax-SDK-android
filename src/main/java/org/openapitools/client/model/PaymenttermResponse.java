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

import org.openapitools.client.model.CommonAudit;
import org.openapitools.client.model.FieldEPaymenttermType;
import org.openapitools.client.model.MultilingualPaymenttermDescription;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Paymentterm Object
 **/
@ApiModel(description = "A Paymentterm Object")
public class PaymenttermResponse {
  
  @SerializedName("pkiPaymenttermID")
  private Integer pkiPaymenttermID = null;
  @SerializedName("sPaymenttermCode")
  private String sPaymenttermCode = null;
  @SerializedName("ePaymenttermType")
  private FieldEPaymenttermType ePaymenttermType = null;
  @SerializedName("iPaymenttermDay")
  private Integer iPaymenttermDay = null;
  @SerializedName("objPaymenttermDescription")
  private MultilingualPaymenttermDescription objPaymenttermDescription = null;
  @SerializedName("bPaymenttermIsactive")
  private Boolean bPaymenttermIsactive = null;
  @SerializedName("objAudit")
  private CommonAudit objAudit = null;

  /**
   * The unique ID of the Paymentterm
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Paymentterm")
  public Integer getPkiPaymenttermID() {
    return pkiPaymenttermID;
  }
  public void setPkiPaymenttermID(Integer pkiPaymenttermID) {
    this.pkiPaymenttermID = pkiPaymenttermID;
  }

  /**
   * The code of the Paymentterm
   **/
  @ApiModelProperty(required = true, value = "The code of the Paymentterm")
  public String getSPaymenttermCode() {
    return sPaymenttermCode;
  }
  public void setSPaymenttermCode(String sPaymenttermCode) {
    this.sPaymenttermCode = sPaymenttermCode;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEPaymenttermType getEPaymenttermType() {
    return ePaymenttermType;
  }
  public void setEPaymenttermType(FieldEPaymenttermType ePaymenttermType) {
    this.ePaymenttermType = ePaymenttermType;
  }

  /**
   * The day of the Paymentterm
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(required = true, value = "The day of the Paymentterm")
  public Integer getIPaymenttermDay() {
    return iPaymenttermDay;
  }
  public void setIPaymenttermDay(Integer iPaymenttermDay) {
    this.iPaymenttermDay = iPaymenttermDay;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public MultilingualPaymenttermDescription getObjPaymenttermDescription() {
    return objPaymenttermDescription;
  }
  public void setObjPaymenttermDescription(MultilingualPaymenttermDescription objPaymenttermDescription) {
    this.objPaymenttermDescription = objPaymenttermDescription;
  }

  /**
   * Whether the Paymentterm is active or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Paymentterm is active or not")
  public Boolean getBPaymenttermIsactive() {
    return bPaymenttermIsactive;
  }
  public void setBPaymenttermIsactive(Boolean bPaymenttermIsactive) {
    this.bPaymenttermIsactive = bPaymenttermIsactive;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CommonAudit getObjAudit() {
    return objAudit;
  }
  public void setObjAudit(CommonAudit objAudit) {
    this.objAudit = objAudit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymenttermResponse paymenttermResponse = (PaymenttermResponse) o;
    return (this.pkiPaymenttermID == null ? paymenttermResponse.pkiPaymenttermID == null : this.pkiPaymenttermID.equals(paymenttermResponse.pkiPaymenttermID)) &&
        (this.sPaymenttermCode == null ? paymenttermResponse.sPaymenttermCode == null : this.sPaymenttermCode.equals(paymenttermResponse.sPaymenttermCode)) &&
        (this.ePaymenttermType == null ? paymenttermResponse.ePaymenttermType == null : this.ePaymenttermType.equals(paymenttermResponse.ePaymenttermType)) &&
        (this.iPaymenttermDay == null ? paymenttermResponse.iPaymenttermDay == null : this.iPaymenttermDay.equals(paymenttermResponse.iPaymenttermDay)) &&
        (this.objPaymenttermDescription == null ? paymenttermResponse.objPaymenttermDescription == null : this.objPaymenttermDescription.equals(paymenttermResponse.objPaymenttermDescription)) &&
        (this.bPaymenttermIsactive == null ? paymenttermResponse.bPaymenttermIsactive == null : this.bPaymenttermIsactive.equals(paymenttermResponse.bPaymenttermIsactive)) &&
        (this.objAudit == null ? paymenttermResponse.objAudit == null : this.objAudit.equals(paymenttermResponse.objAudit));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiPaymenttermID == null ? 0: this.pkiPaymenttermID.hashCode());
    result = 31 * result + (this.sPaymenttermCode == null ? 0: this.sPaymenttermCode.hashCode());
    result = 31 * result + (this.ePaymenttermType == null ? 0: this.ePaymenttermType.hashCode());
    result = 31 * result + (this.iPaymenttermDay == null ? 0: this.iPaymenttermDay.hashCode());
    result = 31 * result + (this.objPaymenttermDescription == null ? 0: this.objPaymenttermDescription.hashCode());
    result = 31 * result + (this.bPaymenttermIsactive == null ? 0: this.bPaymenttermIsactive.hashCode());
    result = 31 * result + (this.objAudit == null ? 0: this.objAudit.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymenttermResponse {\n");
    
    sb.append("  pkiPaymenttermID: ").append(pkiPaymenttermID).append("\n");
    sb.append("  sPaymenttermCode: ").append(sPaymenttermCode).append("\n");
    sb.append("  ePaymenttermType: ").append(ePaymenttermType).append("\n");
    sb.append("  iPaymenttermDay: ").append(iPaymenttermDay).append("\n");
    sb.append("  objPaymenttermDescription: ").append(objPaymenttermDescription).append("\n");
    sb.append("  bPaymenttermIsactive: ").append(bPaymenttermIsactive).append("\n");
    sb.append("  objAudit: ").append(objAudit).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
