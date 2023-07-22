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
public class ScimGroupMember {
  
  @SerializedName("value")
  private String value = null;
  @SerializedName("display")
  private String display = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("$ref")
  private String ref = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDisplay() {
    return display;
  }
  public void setDisplay(String display) {
    this.display = display;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRef() {
    return ref;
  }
  public void setRef(String ref) {
    this.ref = ref;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimGroupMember scimGroupMember = (ScimGroupMember) o;
    return (this.value == null ? scimGroupMember.value == null : this.value.equals(scimGroupMember.value)) &&
        (this.display == null ? scimGroupMember.display == null : this.display.equals(scimGroupMember.display)) &&
        (this.type == null ? scimGroupMember.type == null : this.type.equals(scimGroupMember.type)) &&
        (this.ref == null ? scimGroupMember.ref == null : this.ref.equals(scimGroupMember.ref));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.value == null ? 0: this.value.hashCode());
    result = 31 * result + (this.display == null ? 0: this.display.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.ref == null ? 0: this.ref.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimGroupMember {\n");
    
    sb.append("  value: ").append(value).append("\n");
    sb.append("  display: ").append(display).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  ref: ").append(ref).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
