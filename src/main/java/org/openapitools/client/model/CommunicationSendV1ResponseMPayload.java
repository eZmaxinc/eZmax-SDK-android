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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /1/object/communication
 **/
@ApiModel(description = "Payload for POST /1/object/communication")
public class CommunicationSendV1ResponseMPayload {
  
  @SerializedName("a_pkiCommunicationID")
  private List<Integer> aPkiCommunicationID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiCommunicationID() {
    return aPkiCommunicationID;
  }
  public void setAPkiCommunicationID(List<Integer> aPkiCommunicationID) {
    this.aPkiCommunicationID = aPkiCommunicationID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunicationSendV1ResponseMPayload communicationSendV1ResponseMPayload = (CommunicationSendV1ResponseMPayload) o;
    return (this.aPkiCommunicationID == null ? communicationSendV1ResponseMPayload.aPkiCommunicationID == null : this.aPkiCommunicationID.equals(communicationSendV1ResponseMPayload.aPkiCommunicationID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiCommunicationID == null ? 0: this.aPkiCommunicationID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunicationSendV1ResponseMPayload {\n");
    
    sb.append("  aPkiCommunicationID: ").append(aPkiCommunicationID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
