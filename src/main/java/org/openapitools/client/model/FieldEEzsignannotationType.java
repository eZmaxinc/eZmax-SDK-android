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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The type of the Ezsignannotation.  1. **StrikethroughBlock** is a box with hatching. 2. **StrikethroughLine** is a red line to cross words. 3. **Text** is a simple Text.
 **/
@ApiModel(description = "The type of the Ezsignannotation.  1. **StrikethroughBlock** is a box with hatching. 2. **StrikethroughLine** is a red line to cross words. 3. **Text** is a simple Text.")
public class FieldEEzsignannotationType {
  


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldEEzsignannotationType fieldEEzsignannotationType = (FieldEEzsignannotationType) o;
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
    sb.append("class FieldEEzsignannotationType {\n");
    
    sb.append("}\n");
    return sb.toString();
  }
}
