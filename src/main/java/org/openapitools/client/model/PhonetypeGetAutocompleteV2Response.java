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

import org.openapitools.client.model.CommonResponse;
import org.openapitools.client.model.CommonResponseObjDebug;
import org.openapitools.client.model.CommonResponseObjDebugPayload;
import org.openapitools.client.model.PhonetypeGetAutocompleteV2ResponseMPayload;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for GET /2/object/phonetype/getAutocomplete
 **/
@ApiModel(description = "Response for GET /2/object/phonetype/getAutocomplete")
public class PhonetypeGetAutocompleteV2Response extends CommonResponse {
  
  @SerializedName("objDebugPayload")
  private CommonResponseObjDebugPayload objDebugPayload = null;
  @SerializedName("objDebug")
  private CommonResponseObjDebug objDebug = null;
  @SerializedName("mPayload")
  private PhonetypeGetAutocompleteV2ResponseMPayload mPayload = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CommonResponseObjDebugPayload getObjDebugPayload() {
    return objDebugPayload;
  }
  public void setObjDebugPayload(CommonResponseObjDebugPayload objDebugPayload) {
    this.objDebugPayload = objDebugPayload;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CommonResponseObjDebug getObjDebug() {
    return objDebug;
  }
  public void setObjDebug(CommonResponseObjDebug objDebug) {
    this.objDebug = objDebug;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public PhonetypeGetAutocompleteV2ResponseMPayload getMPayload() {
    return mPayload;
  }
  public void setMPayload(PhonetypeGetAutocompleteV2ResponseMPayload mPayload) {
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
    PhonetypeGetAutocompleteV2Response phonetypeGetAutocompleteV2Response = (PhonetypeGetAutocompleteV2Response) o;
    return (this.objDebugPayload == null ? phonetypeGetAutocompleteV2Response.objDebugPayload == null : this.objDebugPayload.equals(phonetypeGetAutocompleteV2Response.objDebugPayload)) &&
        (this.objDebug == null ? phonetypeGetAutocompleteV2Response.objDebug == null : this.objDebug.equals(phonetypeGetAutocompleteV2Response.objDebug)) &&
        (this.mPayload == null ? phonetypeGetAutocompleteV2Response.mPayload == null : this.mPayload.equals(phonetypeGetAutocompleteV2Response.mPayload));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objDebugPayload == null ? 0: this.objDebugPayload.hashCode());
    result = 31 * result + (this.objDebug == null ? 0: this.objDebug.hashCode());
    result = 31 * result + (this.mPayload == null ? 0: this.mPayload.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhonetypeGetAutocompleteV2Response {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  objDebugPayload: ").append(objDebugPayload).append("\n");
    sb.append("  objDebug: ").append(objDebug).append("\n");
    sb.append("  mPayload: ").append(mPayload).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
