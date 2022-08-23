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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The language of the returned content.  1. **\\*** (or header not defined) Default language 2. **en** English 2. **fr** French  
 **/
@ApiModel(description = "The language of the returned content.  1. **\\*** (or header not defined) Default language 2. **en** English 2. **fr** French  ")
public class HeaderAcceptLanguage {
  


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaderAcceptLanguage headerAcceptLanguage = (HeaderAcceptLanguage) o;
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
    sb.append("class HeaderAcceptLanguage {\n");
    
    sb.append("}\n");
    return sb.toString();
  }
}
