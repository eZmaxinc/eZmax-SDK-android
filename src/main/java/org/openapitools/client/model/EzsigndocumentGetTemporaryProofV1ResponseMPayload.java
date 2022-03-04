/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.5
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsigndocumentlogResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for the /1/object/ezsigndocument/{pkiEzsigndocumentID}/getTemporaryProof API Request
 **/
@ApiModel(description = "Payload for the /1/object/ezsigndocument/{pkiEzsigndocumentID}/getTemporaryProof API Request")
public class EzsigndocumentGetTemporaryProofV1ResponseMPayload {
  
  @SerializedName("a_objEzsigndocumentlog")
  private EzsigndocumentlogResponseCompound aObjEzsigndocumentlog = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsigndocumentlogResponseCompound getAObjEzsigndocumentlog() {
    return aObjEzsigndocumentlog;
  }
  public void setAObjEzsigndocumentlog(EzsigndocumentlogResponseCompound aObjEzsigndocumentlog) {
    this.aObjEzsigndocumentlog = aObjEzsigndocumentlog;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentGetTemporaryProofV1ResponseMPayload ezsigndocumentGetTemporaryProofV1ResponseMPayload = (EzsigndocumentGetTemporaryProofV1ResponseMPayload) o;
    return (this.aObjEzsigndocumentlog == null ? ezsigndocumentGetTemporaryProofV1ResponseMPayload.aObjEzsigndocumentlog == null : this.aObjEzsigndocumentlog.equals(ezsigndocumentGetTemporaryProofV1ResponseMPayload.aObjEzsigndocumentlog));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsigndocumentlog == null ? 0: this.aObjEzsigndocumentlog.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentGetTemporaryProofV1ResponseMPayload {\n");
    
    sb.append("  aObjEzsigndocumentlog: ").append(aObjEzsigndocumentlog).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
