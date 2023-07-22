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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ScimEmail {
  
  @SerializedName("value")
  private String value = null;
  @SerializedName("primary")
  private Boolean primary = null;

  /**
   * The email address.
   **/
  @ApiModelProperty(value = "The email address.")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getPrimary() {
    return primary;
  }
  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimEmail scimEmail = (ScimEmail) o;
    return (this.value == null ? scimEmail.value == null : this.value.equals(scimEmail.value)) &&
        (this.primary == null ? scimEmail.primary == null : this.primary.equals(scimEmail.primary));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.value == null ? 0: this.value.hashCode());
    result = 31 * result + (this.primary == null ? 0: this.primary.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimEmail {\n");
    
    sb.append("  value: ").append(value).append("\n");
    sb.append("  primary: ").append(primary).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
