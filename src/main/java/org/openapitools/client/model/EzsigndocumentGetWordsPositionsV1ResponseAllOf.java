/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CustomWordPositionWordResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzsigndocumentGetWordsPositionsV1ResponseAllOf {
  
  @SerializedName("mPayload")
  private List<CustomWordPositionWordResponse> mPayload = null;

  /**
   * Payload for the /1/object/ezsigndocument/{pkiEzsigndocumentID}/getWordsPositions API Request
   **/
  @ApiModelProperty(required = true, value = "Payload for the /1/object/ezsigndocument/{pkiEzsigndocumentID}/getWordsPositions API Request")
  public List<CustomWordPositionWordResponse> getMPayload() {
    return mPayload;
  }
  public void setMPayload(List<CustomWordPositionWordResponse> mPayload) {
    this.mPayload = mPayload;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentGetWordsPositionsV1ResponseAllOf ezsigndocumentGetWordsPositionsV1ResponseAllOf = (EzsigndocumentGetWordsPositionsV1ResponseAllOf) o;
    return (this.mPayload == null ? ezsigndocumentGetWordsPositionsV1ResponseAllOf.mPayload == null : this.mPayload.equals(ezsigndocumentGetWordsPositionsV1ResponseAllOf.mPayload));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.mPayload == null ? 0: this.mPayload.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentGetWordsPositionsV1ResponseAllOf {\n");
    
    sb.append("  mPayload: ").append(mPayload).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
