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
import org.openapitools.client.model.CreditcardclientRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/creditcardclient
 **/
@ApiModel(description = "Request for POST /1/object/creditcardclient")
public class CreditcardclientCreateObjectV1Request {
  
  @SerializedName("a_objCreditcardclient")
  private List<CreditcardclientRequestCompound> aObjCreditcardclient = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CreditcardclientRequestCompound> getAObjCreditcardclient() {
    return aObjCreditcardclient;
  }
  public void setAObjCreditcardclient(List<CreditcardclientRequestCompound> aObjCreditcardclient) {
    this.aObjCreditcardclient = aObjCreditcardclient;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditcardclientCreateObjectV1Request creditcardclientCreateObjectV1Request = (CreditcardclientCreateObjectV1Request) o;
    return (this.aObjCreditcardclient == null ? creditcardclientCreateObjectV1Request.aObjCreditcardclient == null : this.aObjCreditcardclient.equals(creditcardclientCreateObjectV1Request.aObjCreditcardclient));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjCreditcardclient == null ? 0: this.aObjCreditcardclient.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditcardclientCreateObjectV1Request {\n");
    
    sb.append("  aObjCreditcardclient: ").append(aObjCreditcardclient).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
