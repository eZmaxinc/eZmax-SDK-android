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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Cors Object
 **/
@ApiModel(description = "A Cors Object")
public class CorsResponse {
  
  @SerializedName("pkiCorsID")
  private Integer pkiCorsID = null;
  @SerializedName("fkiApikeyID")
  private Integer fkiApikeyID = null;
  @SerializedName("sCorsEntryurl")
  private String sCorsEntryurl = null;

  /**
   * The unique ID of the Cors
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Cors")
  public Integer getPkiCorsID() {
    return pkiCorsID;
  }
  public void setPkiCorsID(Integer pkiCorsID) {
    this.pkiCorsID = pkiCorsID;
  }

  /**
   * The unique ID of the Apikey
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Apikey")
  public Integer getFkiApikeyID() {
    return fkiApikeyID;
  }
  public void setFkiApikeyID(Integer fkiApikeyID) {
    this.fkiApikeyID = fkiApikeyID;
  }

  /**
   * The entryurl of the Cors
   **/
  @ApiModelProperty(required = true, value = "The entryurl of the Cors")
  public String getSCorsEntryurl() {
    return sCorsEntryurl;
  }
  public void setSCorsEntryurl(String sCorsEntryurl) {
    this.sCorsEntryurl = sCorsEntryurl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorsResponse corsResponse = (CorsResponse) o;
    return (this.pkiCorsID == null ? corsResponse.pkiCorsID == null : this.pkiCorsID.equals(corsResponse.pkiCorsID)) &&
        (this.fkiApikeyID == null ? corsResponse.fkiApikeyID == null : this.fkiApikeyID.equals(corsResponse.fkiApikeyID)) &&
        (this.sCorsEntryurl == null ? corsResponse.sCorsEntryurl == null : this.sCorsEntryurl.equals(corsResponse.sCorsEntryurl));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiCorsID == null ? 0: this.pkiCorsID.hashCode());
    result = 31 * result + (this.fkiApikeyID == null ? 0: this.fkiApikeyID.hashCode());
    result = 31 * result + (this.sCorsEntryurl == null ? 0: this.sCorsEntryurl.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorsResponse {\n");
    
    sb.append("  pkiCorsID: ").append(pkiCorsID).append("\n");
    sb.append("  fkiApikeyID: ").append(fkiApikeyID).append("\n");
    sb.append("  sCorsEntryurl: ").append(sCorsEntryurl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
