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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Indicates when the “consultation” type signature must be signed.  1. **Automatic** When the document is displayed . 2. **Manual** The user must indicate that he has viewed the document.
 **/
@ApiModel(description = "Indicates when the “consultation” type signature must be signed.  1. **Automatic** When the document is displayed . 2. **Manual** The user must indicate that he has viewed the document.")
public class FieldEEzsigntemplatesignatureConsultationtrigger {
  


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldEEzsigntemplatesignatureConsultationtrigger fieldEEzsigntemplatesignatureConsultationtrigger = (FieldEEzsigntemplatesignatureConsultationtrigger) o;
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
    sb.append("class FieldEEzsigntemplatesignatureConsultationtrigger {\n");
    
    sb.append("}\n");
    return sb.toString();
  }
}
