/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.FieldEPaymenttermType;
import org.openapitools.client.model.MultilingualPaymenttermDescription;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Paymentterm Object and children
 **/
@ApiModel(description = "A Paymentterm Object and children")
public class PaymenttermRequestCompound {
  
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

  /**
   * The unique ID of the Paymentterm
   **/
  @ApiModelProperty(value = "The unique ID of the Paymentterm")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymenttermRequestCompound paymenttermRequestCompound = (PaymenttermRequestCompound) o;
    return (this.pkiPaymenttermID == null ? paymenttermRequestCompound.pkiPaymenttermID == null : this.pkiPaymenttermID.equals(paymenttermRequestCompound.pkiPaymenttermID)) &&
        (this.sPaymenttermCode == null ? paymenttermRequestCompound.sPaymenttermCode == null : this.sPaymenttermCode.equals(paymenttermRequestCompound.sPaymenttermCode)) &&
        (this.ePaymenttermType == null ? paymenttermRequestCompound.ePaymenttermType == null : this.ePaymenttermType.equals(paymenttermRequestCompound.ePaymenttermType)) &&
        (this.iPaymenttermDay == null ? paymenttermRequestCompound.iPaymenttermDay == null : this.iPaymenttermDay.equals(paymenttermRequestCompound.iPaymenttermDay)) &&
        (this.objPaymenttermDescription == null ? paymenttermRequestCompound.objPaymenttermDescription == null : this.objPaymenttermDescription.equals(paymenttermRequestCompound.objPaymenttermDescription)) &&
        (this.bPaymenttermIsactive == null ? paymenttermRequestCompound.bPaymenttermIsactive == null : this.bPaymenttermIsactive.equals(paymenttermRequestCompound.bPaymenttermIsactive));
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
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymenttermRequestCompound {\n");
    
    sb.append("  pkiPaymenttermID: ").append(pkiPaymenttermID).append("\n");
    sb.append("  sPaymenttermCode: ").append(sPaymenttermCode).append("\n");
    sb.append("  ePaymenttermType: ").append(ePaymenttermType).append("\n");
    sb.append("  iPaymenttermDay: ").append(iPaymenttermDay).append("\n");
    sb.append("  objPaymenttermDescription: ").append(objPaymenttermDescription).append("\n");
    sb.append("  bPaymenttermIsactive: ").append(bPaymenttermIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
