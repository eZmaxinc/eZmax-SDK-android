/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
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
 * The Horizontalalignment of the Ezsignannotation.  This can only be set if eEzsignannotationType is **Text**
 **/
@ApiModel(description = "The Horizontalalignment of the Ezsignannotation.  This can only be set if eEzsignannotationType is **Text**")
public class EnumHorizontalalignment {
  


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnumHorizontalalignment enumHorizontalalignment = (EnumHorizontalalignment) o;
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
    sb.append("class EnumHorizontalalignment {\n");
    
    sb.append("}\n");
    return sb.toString();
  }
}