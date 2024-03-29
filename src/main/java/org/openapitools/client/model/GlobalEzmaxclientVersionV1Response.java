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

/**
 * Response for GET /1/ezmaxclient/{pksEzmaxclientOs}/version
 **/
@ApiModel(description = "Response for GET /1/ezmaxclient/{pksEzmaxclientOs}/version")
public class GlobalEzmaxclientVersionV1Response {
  
  @SerializedName("sEzmaxclientVersion")
  private String sEzmaxclientVersion = null;

  /**
   * The version on the store
   **/
  @ApiModelProperty(required = true, value = "The version on the store")
  public String getSEzmaxclientVersion() {
    return sEzmaxclientVersion;
  }
  public void setSEzmaxclientVersion(String sEzmaxclientVersion) {
    this.sEzmaxclientVersion = sEzmaxclientVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalEzmaxclientVersionV1Response globalEzmaxclientVersionV1Response = (GlobalEzmaxclientVersionV1Response) o;
    return (this.sEzmaxclientVersion == null ? globalEzmaxclientVersionV1Response.sEzmaxclientVersion == null : this.sEzmaxclientVersion.equals(globalEzmaxclientVersionV1Response.sEzmaxclientVersion));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sEzmaxclientVersion == null ? 0: this.sEzmaxclientVersion.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalEzmaxclientVersionV1Response {\n");
    
    sb.append("  sEzmaxclientVersion: ").append(sEzmaxclientVersion).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
