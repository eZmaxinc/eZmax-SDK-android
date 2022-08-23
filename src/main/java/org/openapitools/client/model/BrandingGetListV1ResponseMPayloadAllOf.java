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

import java.util.*;
import org.openapitools.client.model.BrandingListElement;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BrandingGetListV1ResponseMPayloadAllOf {
  
  @SerializedName("a_objBranding")
  private List<BrandingListElement> aObjBranding = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<BrandingListElement> getAObjBranding() {
    return aObjBranding;
  }
  public void setAObjBranding(List<BrandingListElement> aObjBranding) {
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
    BrandingGetListV1ResponseMPayloadAllOf brandingGetListV1ResponseMPayloadAllOf = (BrandingGetListV1ResponseMPayloadAllOf) o;
    return (this.aObjBranding == null ? brandingGetListV1ResponseMPayloadAllOf.aObjBranding == null : this.aObjBranding.equals(brandingGetListV1ResponseMPayloadAllOf.aObjBranding));
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
    sb.append("class BrandingGetListV1ResponseMPayloadAllOf {\n");
    
    sb.append("  aObjBranding: ").append(aObjBranding).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
