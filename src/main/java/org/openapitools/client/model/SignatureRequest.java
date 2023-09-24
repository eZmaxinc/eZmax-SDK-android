/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
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
 * A Signature Object
 **/
@ApiModel(description = "A Signature Object")
public class SignatureRequest {
  
  @SerializedName("pkiSignatureID")
  private Integer pkiSignatureID = null;
  @SerializedName("tSignatureSvg")
  private String tSignatureSvg = null;

  /**
   * The unique ID of the Signature
   * minimum: 0
   * maximum: 16777215
   **/
  @ApiModelProperty(value = "The unique ID of the Signature")
  public Integer getPkiSignatureID() {
    return pkiSignatureID;
  }
  public void setPkiSignatureID(Integer pkiSignatureID) {
    this.pkiSignatureID = pkiSignatureID;
  }

  /**
   * The svg of the Signature
   **/
  @ApiModelProperty(required = true, value = "The svg of the Signature")
  public String getTSignatureSvg() {
    return tSignatureSvg;
  }
  public void setTSignatureSvg(String tSignatureSvg) {
    this.tSignatureSvg = tSignatureSvg;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignatureRequest signatureRequest = (SignatureRequest) o;
    return (this.pkiSignatureID == null ? signatureRequest.pkiSignatureID == null : this.pkiSignatureID.equals(signatureRequest.pkiSignatureID)) &&
        (this.tSignatureSvg == null ? signatureRequest.tSignatureSvg == null : this.tSignatureSvg.equals(signatureRequest.tSignatureSvg));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiSignatureID == null ? 0: this.pkiSignatureID.hashCode());
    result = 31 * result + (this.tSignatureSvg == null ? 0: this.tSignatureSvg.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureRequest {\n");
    
    sb.append("  pkiSignatureID: ").append(pkiSignatureID).append("\n");
    sb.append("  tSignatureSvg: ").append(tSignatureSvg).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
