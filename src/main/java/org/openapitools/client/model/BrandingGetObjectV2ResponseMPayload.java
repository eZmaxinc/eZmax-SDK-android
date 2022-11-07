/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.15
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.BrandingResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/branding/{pkiBrandingID}
 **/
@ApiModel(description = "Payload for GET /2/object/branding/{pkiBrandingID}")
public class BrandingGetObjectV2ResponseMPayload {
  
  @SerializedName("objBranding")
  private BrandingResponseCompound objBranding = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BrandingResponseCompound getObjBranding() {
    return objBranding;
  }
  public void setObjBranding(BrandingResponseCompound objBranding) {
    this.objBranding = objBranding;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandingGetObjectV2ResponseMPayload brandingGetObjectV2ResponseMPayload = (BrandingGetObjectV2ResponseMPayload) o;
    return (this.objBranding == null ? brandingGetObjectV2ResponseMPayload.objBranding == null : this.objBranding.equals(brandingGetObjectV2ResponseMPayload.objBranding));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objBranding == null ? 0: this.objBranding.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandingGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objBranding: ").append(objBranding).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
