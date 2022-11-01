/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The location of the tooltip relative to the Ezsignformfieldgroup&#39;s location.
 **/
@ApiModel(description = "The location of the tooltip relative to the Ezsignformfieldgroup's location.")
public class FieldEEzsignformfieldgroupTooltipposition {
  


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldEEzsignformfieldgroupTooltipposition fieldEEzsignformfieldgroupTooltipposition = (FieldEEzsignformfieldgroupTooltipposition) o;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 17;
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldEEzsignformfieldgroupTooltipposition {\n");
    
    sb.append("}\n");
    return sb.toString();
  }
}
