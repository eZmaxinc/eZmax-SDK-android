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
 * The source of the name of the attachment added to the Ezsigntemplatesignature
 **/
@ApiModel(description = "The source of the name of the attachment added to the Ezsigntemplatesignature")
public class FieldEEzsigntemplatesignatureAttachmentnamesource {
  


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldEEzsigntemplatesignatureAttachmentnamesource fieldEEzsigntemplatesignatureAttachmentnamesource = (FieldEEzsigntemplatesignatureAttachmentnamesource) o;
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
    sb.append("class FieldEEzsigntemplatesignatureAttachmentnamesource {\n");
    
    sb.append("}\n");
    return sb.toString();
  }
}
