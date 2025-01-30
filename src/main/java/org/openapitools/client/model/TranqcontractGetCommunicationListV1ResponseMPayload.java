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
import org.openapitools.client.model.CustomCommunicationListElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for GET /1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationList
 **/
@ApiModel(description = "Response for GET /1/object/tranqcontract/{pkiTranqcontractID}/getCommunicationList")
public class TranqcontractGetCommunicationListV1ResponseMPayload {
  
  @SerializedName("a_objCommunication")
  private List<CustomCommunicationListElementResponse> aObjCommunication = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomCommunicationListElementResponse> getAObjCommunication() {
    return aObjCommunication;
  }
  public void setAObjCommunication(List<CustomCommunicationListElementResponse> aObjCommunication) {
    this.aObjCommunication = aObjCommunication;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranqcontractGetCommunicationListV1ResponseMPayload tranqcontractGetCommunicationListV1ResponseMPayload = (TranqcontractGetCommunicationListV1ResponseMPayload) o;
    return (this.aObjCommunication == null ? tranqcontractGetCommunicationListV1ResponseMPayload.aObjCommunication == null : this.aObjCommunication.equals(tranqcontractGetCommunicationListV1ResponseMPayload.aObjCommunication));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjCommunication == null ? 0: this.aObjCommunication.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranqcontractGetCommunicationListV1ResponseMPayload {\n");
    
    sb.append("  aObjCommunication: ").append(aObjCommunication).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
