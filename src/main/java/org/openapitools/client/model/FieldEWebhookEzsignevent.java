/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
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
 * This Ezsign Event. This property will be set only if the Module is \&quot;Ezsign\&quot;
 **/
@ApiModel(description = "This Ezsign Event. This property will be set only if the Module is \"Ezsign\"")
public class FieldEWebhookEzsignevent {
  


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldEWebhookEzsignevent fieldEWebhookEzsignevent = (FieldEWebhookEzsignevent) o;
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
    sb.append("class FieldEWebhookEzsignevent {\n");
    
    sb.append("}\n");
    return sb.toString();
  }
}