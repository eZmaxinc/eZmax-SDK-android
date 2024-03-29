/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsignsignerRequestCompoundContact;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzsignsignerRequestCompoundAllOf {
  
  @SerializedName("objContact")
  private EzsignsignerRequestCompoundContact objContact = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignsignerRequestCompoundContact getObjContact() {
    return objContact;
  }
  public void setObjContact(EzsignsignerRequestCompoundContact objContact) {
    this.objContact = objContact;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignerRequestCompoundAllOf ezsignsignerRequestCompoundAllOf = (EzsignsignerRequestCompoundAllOf) o;
    return (this.objContact == null ? ezsignsignerRequestCompoundAllOf.objContact == null : this.objContact.equals(ezsignsignerRequestCompoundAllOf.objContact));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objContact == null ? 0: this.objContact.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignerRequestCompoundAllOf {\n");
    
    sb.append("  objContact: ").append(objContact).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
