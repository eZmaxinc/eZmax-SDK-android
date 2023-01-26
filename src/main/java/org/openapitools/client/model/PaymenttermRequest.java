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

import org.openapitools.client.model.MultilingualPaymenttermDescription;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Paymentterm Object
 **/
@ApiModel(description = "A Paymentterm Object")
public class PaymenttermRequest {
  
  @SerializedName("pkiPaymenttermID")
  private Integer pkiPaymenttermID = null;
  @SerializedName("sPaymenttermCode")
  private String sPaymenttermCode = null;
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
    PaymenttermRequest paymenttermRequest = (PaymenttermRequest) o;
    return (this.pkiPaymenttermID == null ? paymenttermRequest.pkiPaymenttermID == null : this.pkiPaymenttermID.equals(paymenttermRequest.pkiPaymenttermID)) &&
        (this.sPaymenttermCode == null ? paymenttermRequest.sPaymenttermCode == null : this.sPaymenttermCode.equals(paymenttermRequest.sPaymenttermCode)) &&
        (this.objPaymenttermDescription == null ? paymenttermRequest.objPaymenttermDescription == null : this.objPaymenttermDescription.equals(paymenttermRequest.objPaymenttermDescription)) &&
        (this.bPaymenttermIsactive == null ? paymenttermRequest.bPaymenttermIsactive == null : this.bPaymenttermIsactive.equals(paymenttermRequest.bPaymenttermIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiPaymenttermID == null ? 0: this.pkiPaymenttermID.hashCode());
    result = 31 * result + (this.sPaymenttermCode == null ? 0: this.sPaymenttermCode.hashCode());
    result = 31 * result + (this.objPaymenttermDescription == null ? 0: this.objPaymenttermDescription.hashCode());
    result = 31 * result + (this.bPaymenttermIsactive == null ? 0: this.bPaymenttermIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymenttermRequest {\n");
    
    sb.append("  pkiPaymenttermID: ").append(pkiPaymenttermID).append("\n");
    sb.append("  sPaymenttermCode: ").append(sPaymenttermCode).append("\n");
    sb.append("  objPaymenttermDescription: ").append(objPaymenttermDescription).append("\n");
    sb.append("  bPaymenttermIsactive: ").append(bPaymenttermIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
