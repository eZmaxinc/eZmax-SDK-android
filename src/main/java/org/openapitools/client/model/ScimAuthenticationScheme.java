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

@ApiModel(description = "")
public class ScimAuthenticationScheme {
  
  @SerializedName("description")
  private String description = null;
  @SerializedName("name")
  private String name = null;
  public enum TypeEnum {
     oauth,  oauth2,  oauthbearertoken,  httpbasic,  httpdigest, 
  };
  @SerializedName("type")
  private TypeEnum type = null;

  /**
   * A description of the authentication scheme.
   **/
  @ApiModelProperty(required = true, value = "A description of the authentication scheme.")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The common authentication scheme name
   **/
  @ApiModelProperty(required = true, value = "The common authentication scheme name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The authentication scheme.
   **/
  @ApiModelProperty(required = true, value = "The authentication scheme.")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimAuthenticationScheme scimAuthenticationScheme = (ScimAuthenticationScheme) o;
    return (this.description == null ? scimAuthenticationScheme.description == null : this.description.equals(scimAuthenticationScheme.description)) &&
        (this.name == null ? scimAuthenticationScheme.name == null : this.name.equals(scimAuthenticationScheme.name)) &&
        (this.type == null ? scimAuthenticationScheme.type == null : this.type.equals(scimAuthenticationScheme.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimAuthenticationScheme {\n");
    
    sb.append("  description: ").append(description).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
