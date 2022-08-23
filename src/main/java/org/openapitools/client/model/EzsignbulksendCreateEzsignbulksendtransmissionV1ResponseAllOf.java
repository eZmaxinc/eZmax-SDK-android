/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.10
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseAllOf {
  
  @SerializedName("mPayload")
  private EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload mPayload = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload getMPayload() {
    return mPayload;
  }
  public void setMPayload(EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseMPayload mPayload) {
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
    EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseAllOf ezsignbulksendCreateEzsignbulksendtransmissionV1ResponseAllOf = (EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseAllOf) o;
    return (this.mPayload == null ? ezsignbulksendCreateEzsignbulksendtransmissionV1ResponseAllOf.mPayload == null : this.mPayload.equals(ezsignbulksendCreateEzsignbulksendtransmissionV1ResponseAllOf.mPayload));
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
    sb.append("class EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseAllOf {\n");
    
    sb.append("  mPayload: ").append(mPayload).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
