/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.1
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.ContacttitleAutocompleteElementResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /2/object/contacttitle/getAutocomplete
 **/
@ApiModel(description = "Payload for POST /2/object/contacttitle/getAutocomplete")
public class ContacttitleGetAutocompleteV2ResponseMPayload {
  
  @SerializedName("a_objContacttitle")
  private List<ContacttitleAutocompleteElementResponse> aObjContacttitle = null;

  /**
   * An array of Contacttitle autocomplete element response.
   **/
  @ApiModelProperty(required = true, value = "An array of Contacttitle autocomplete element response.")
  public List<ContacttitleAutocompleteElementResponse> getAObjContacttitle() {
    return aObjContacttitle;
  }
  public void setAObjContacttitle(List<ContacttitleAutocompleteElementResponse> aObjContacttitle) {
    this.aObjContacttitle = aObjContacttitle;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContacttitleGetAutocompleteV2ResponseMPayload contacttitleGetAutocompleteV2ResponseMPayload = (ContacttitleGetAutocompleteV2ResponseMPayload) o;
    return (this.aObjContacttitle == null ? contacttitleGetAutocompleteV2ResponseMPayload.aObjContacttitle == null : this.aObjContacttitle.equals(contacttitleGetAutocompleteV2ResponseMPayload.aObjContacttitle));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjContacttitle == null ? 0: this.aObjContacttitle.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContacttitleGetAutocompleteV2ResponseMPayload {\n");
    
    sb.append("  aObjContacttitle: ").append(aObjContacttitle).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
