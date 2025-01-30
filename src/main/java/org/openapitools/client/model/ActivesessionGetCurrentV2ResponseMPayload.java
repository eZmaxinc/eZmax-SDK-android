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

import org.openapitools.client.model.ActivesessionResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/activesession/getCurrent
 **/
@ApiModel(description = "Payload for GET /1/object/activesession/getCurrent")
public class ActivesessionGetCurrentV2ResponseMPayload {
  
  @SerializedName("objActivesession")
  private ActivesessionResponseCompound objActivesession = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ActivesessionResponseCompound getObjActivesession() {
    return objActivesession;
  }
  public void setObjActivesession(ActivesessionResponseCompound objActivesession) {
    this.objActivesession = objActivesession;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivesessionGetCurrentV2ResponseMPayload activesessionGetCurrentV2ResponseMPayload = (ActivesessionGetCurrentV2ResponseMPayload) o;
    return (this.objActivesession == null ? activesessionGetCurrentV2ResponseMPayload.objActivesession == null : this.objActivesession.equals(activesessionGetCurrentV2ResponseMPayload.objActivesession));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objActivesession == null ? 0: this.objActivesession.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivesessionGetCurrentV2ResponseMPayload {\n");
    
    sb.append("  objActivesession: ").append(objActivesession).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
