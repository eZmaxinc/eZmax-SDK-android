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
 * A Custom Apikeyfederation Object
 **/
@ApiModel(description = "A Custom Apikeyfederation Object")
public class CustomApikeyfederation {
  
  @SerializedName("sApikeyfederationKey")
  private String sApikeyfederationKey = null;
  @SerializedName("sApikeyfederationSecret")
  private String sApikeyfederationSecret = null;

  /**
   * The key of the Apikeyfederation
   **/
  @ApiModelProperty(required = true, value = "The key of the Apikeyfederation")
  public String getSApikeyfederationKey() {
    return sApikeyfederationKey;
  }
  public void setSApikeyfederationKey(String sApikeyfederationKey) {
    this.sApikeyfederationKey = sApikeyfederationKey;
  }

  /**
   * The secret of the Apikeyfederation
   **/
  @ApiModelProperty(required = true, value = "The secret of the Apikeyfederation")
  public String getSApikeyfederationSecret() {
    return sApikeyfederationSecret;
  }
  public void setSApikeyfederationSecret(String sApikeyfederationSecret) {
    this.sApikeyfederationSecret = sApikeyfederationSecret;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomApikeyfederation customApikeyfederation = (CustomApikeyfederation) o;
    return (this.sApikeyfederationKey == null ? customApikeyfederation.sApikeyfederationKey == null : this.sApikeyfederationKey.equals(customApikeyfederation.sApikeyfederationKey)) &&
        (this.sApikeyfederationSecret == null ? customApikeyfederation.sApikeyfederationSecret == null : this.sApikeyfederationSecret.equals(customApikeyfederation.sApikeyfederationSecret));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sApikeyfederationKey == null ? 0: this.sApikeyfederationKey.hashCode());
    result = 31 * result + (this.sApikeyfederationSecret == null ? 0: this.sApikeyfederationSecret.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomApikeyfederation {\n");
    
    sb.append("  sApikeyfederationKey: ").append(sApikeyfederationKey).append("\n");
    sb.append("  sApikeyfederationSecret: ").append(sApikeyfederationSecret).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
