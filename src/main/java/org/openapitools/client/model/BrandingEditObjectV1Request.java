/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.13
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.BrandingRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/branding/{pkiBrandingID}
 **/
@ApiModel(description = "Request for PUT /1/object/branding/{pkiBrandingID}")
public class BrandingEditObjectV1Request {
  
  @SerializedName("objBranding")
  private BrandingRequestCompound objBranding = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BrandingRequestCompound getObjBranding() {
    return objBranding;
  }
  public void setObjBranding(BrandingRequestCompound objBranding) {
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
    BrandingEditObjectV1Request brandingEditObjectV1Request = (BrandingEditObjectV1Request) o;
    return (this.objBranding == null ? brandingEditObjectV1Request.objBranding == null : this.objBranding.equals(brandingEditObjectV1Request.objBranding));
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
    sb.append("class BrandingEditObjectV1Request {\n");
    
    sb.append("  objBranding: ").append(objBranding).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
