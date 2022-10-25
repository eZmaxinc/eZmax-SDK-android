/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
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
 * Frequency at which reminders will be sent to signers that haven&#39;t signed the documents
 **/
@ApiModel(description = "Frequency at which reminders will be sent to signers that haven't signed the documents")
public class FieldEEzsignfoldertypeSendreminderfrequency {
  


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldEEzsignfoldertypeSendreminderfrequency fieldEEzsignfoldertypeSendreminderfrequency = (FieldEEzsignfoldertypeSendreminderfrequency) o;
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
    sb.append("class FieldEEzsignfoldertypeSendreminderfrequency {\n");
    
    sb.append("}\n");
    return sb.toString();
  }
}
