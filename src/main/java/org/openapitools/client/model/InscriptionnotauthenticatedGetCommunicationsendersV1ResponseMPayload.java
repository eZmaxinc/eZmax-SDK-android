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
import org.openapitools.client.model.CustomCommunicationsenderResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for GET /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getCommunicationsenders
 **/
@ApiModel(description = "Response for GET /1/object/inscriptionnotauthenticated/{pkiInscriptionnotauthenticatedID}/getCommunicationsenders")
public class InscriptionnotauthenticatedGetCommunicationsendersV1ResponseMPayload {
  
  @SerializedName("a_objCommunicationsenders")
  private List<CustomCommunicationsenderResponse> aObjCommunicationsenders = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomCommunicationsenderResponse> getAObjCommunicationsenders() {
    return aObjCommunicationsenders;
  }
  public void setAObjCommunicationsenders(List<CustomCommunicationsenderResponse> aObjCommunicationsenders) {
    this.aObjCommunicationsenders = aObjCommunicationsenders;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InscriptionnotauthenticatedGetCommunicationsendersV1ResponseMPayload inscriptionnotauthenticatedGetCommunicationsendersV1ResponseMPayload = (InscriptionnotauthenticatedGetCommunicationsendersV1ResponseMPayload) o;
    return (this.aObjCommunicationsenders == null ? inscriptionnotauthenticatedGetCommunicationsendersV1ResponseMPayload.aObjCommunicationsenders == null : this.aObjCommunicationsenders.equals(inscriptionnotauthenticatedGetCommunicationsendersV1ResponseMPayload.aObjCommunicationsenders));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjCommunicationsenders == null ? 0: this.aObjCommunicationsenders.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InscriptionnotauthenticatedGetCommunicationsendersV1ResponseMPayload {\n");
    
    sb.append("  aObjCommunicationsenders: ").append(aObjCommunicationsenders).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
