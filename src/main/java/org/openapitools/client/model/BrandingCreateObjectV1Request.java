/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.BrandingRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/branding
 **/
@ApiModel(description = "Request for POST /1/object/branding")
public class BrandingCreateObjectV1Request {
  
  @SerializedName("a_objBranding")
  private List<BrandingRequestCompound> aObjBranding = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<BrandingRequestCompound> getAObjBranding() {
    return aObjBranding;
  }
  public void setAObjBranding(List<BrandingRequestCompound> aObjBranding) {
    this.aObjBranding = aObjBranding;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandingCreateObjectV1Request brandingCreateObjectV1Request = (BrandingCreateObjectV1Request) o;
    return (this.aObjBranding == null ? brandingCreateObjectV1Request.aObjBranding == null : this.aObjBranding.equals(brandingCreateObjectV1Request.aObjBranding));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjBranding == null ? 0: this.aObjBranding.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandingCreateObjectV1Request {\n");
    
    sb.append("  aObjBranding: ").append(aObjBranding).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
