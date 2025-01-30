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
 * Response for GET /1/ezmaxclient/{pksEzmaxclientOs}/version
 **/
@ApiModel(description = "Response for GET /1/ezmaxclient/{pksEzmaxclientOs}/version")
public class GlobalEzmaxclientVersionV1Response {
  
  @SerializedName("sEzmaxclientVersion")
  private String sEzmaxclientVersion = null;
  @SerializedName("sEzmaxclientOslatestversion")
  private String sEzmaxclientOslatestversion = 11;

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

  /**
   * The latest OS version of the system running the application at the time of release
   **/
  @ApiModelProperty(required = true, value = "The latest OS version of the system running the application at the time of release")
  public String getSEzmaxclientOslatestversion() {
    return sEzmaxclientOslatestversion;
  }
  public void setSEzmaxclientOslatestversion(String sEzmaxclientOslatestversion) {
    this.sEzmaxclientOslatestversion = sEzmaxclientOslatestversion;
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
    return (this.sEzmaxclientVersion == null ? globalEzmaxclientVersionV1Response.sEzmaxclientVersion == null : this.sEzmaxclientVersion.equals(globalEzmaxclientVersionV1Response.sEzmaxclientVersion)) &&
        (this.sEzmaxclientOslatestversion == null ? globalEzmaxclientVersionV1Response.sEzmaxclientOslatestversion == null : this.sEzmaxclientOslatestversion.equals(globalEzmaxclientVersionV1Response.sEzmaxclientOslatestversion));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sEzmaxclientVersion == null ? 0: this.sEzmaxclientVersion.hashCode());
    result = 31 * result + (this.sEzmaxclientOslatestversion == null ? 0: this.sEzmaxclientOslatestversion.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalEzmaxclientVersionV1Response {\n");
    
    sb.append("  sEzmaxclientVersion: ").append(sEzmaxclientVersion).append("\n");
    sb.append("  sEzmaxclientOslatestversion: ").append(sEzmaxclientOslatestversion).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
