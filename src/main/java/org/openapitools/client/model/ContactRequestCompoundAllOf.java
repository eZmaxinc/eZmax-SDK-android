/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.40
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.ContactinformationsRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ContactRequestCompoundAllOf {
  
  @SerializedName("objContactinformations")
  private ContactinformationsRequestCompound objContactinformations = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ContactinformationsRequestCompound getObjContactinformations() {
    return objContactinformations;
  }
  public void setObjContactinformations(ContactinformationsRequestCompound objContactinformations) {
    this.objContactinformations = objContactinformations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactRequestCompoundAllOf contactRequestCompoundAllOf = (ContactRequestCompoundAllOf) o;
    return (this.objContactinformations == null ? contactRequestCompoundAllOf.objContactinformations == null : this.objContactinformations.equals(contactRequestCompoundAllOf.objContactinformations));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objContactinformations == null ? 0: this.objContactinformations.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactRequestCompoundAllOf {\n");
    
    sb.append("  objContactinformations: ").append(objContactinformations).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
