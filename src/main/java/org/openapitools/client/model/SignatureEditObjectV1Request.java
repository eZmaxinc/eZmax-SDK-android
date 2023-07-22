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

import org.openapitools.client.model.SignatureRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/signature/{pkiSignatureID}
 **/
@ApiModel(description = "Request for PUT /1/object/signature/{pkiSignatureID}")
public class SignatureEditObjectV1Request {
  
  @SerializedName("objSignature")
  private SignatureRequestCompound objSignature = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public SignatureRequestCompound getObjSignature() {
    return objSignature;
  }
  public void setObjSignature(SignatureRequestCompound objSignature) {
    this.objSignature = objSignature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignatureEditObjectV1Request signatureEditObjectV1Request = (SignatureEditObjectV1Request) o;
    return (this.objSignature == null ? signatureEditObjectV1Request.objSignature == null : this.objSignature.equals(signatureEditObjectV1Request.objSignature));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objSignature == null ? 0: this.objSignature.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureEditObjectV1Request {\n");
    
    sb.append("  objSignature: ").append(objSignature).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
