/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.33
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
 * A Website Object
 **/
@ApiModel(description = "A Website Object")
public class WebsiteRequest {
  
  @SerializedName("fkiWebsitetypeID")
  private Integer fkiWebsitetypeID = null;
  @SerializedName("sWebsiteAddress")
  private String sWebsiteAddress = null;

  /**
   * The unique ID of the Websitetype.  Valid values:  |Value|Description| |-|-| |1|Website| |2|Twitter| |3|Facebook| |4|Survey|
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Websitetype.  Valid values:  |Value|Description| |-|-| |1|Website| |2|Twitter| |3|Facebook| |4|Survey|")
  public Integer getFkiWebsitetypeID() {
    return fkiWebsitetypeID;
  }
  public void setFkiWebsitetypeID(Integer fkiWebsitetypeID) {
    this.fkiWebsitetypeID = fkiWebsitetypeID;
  }

  /**
   * The URL of the website.
   **/
  @ApiModelProperty(required = true, value = "The URL of the website.")
  public String getSWebsiteAddress() {
    return sWebsiteAddress;
  }
  public void setSWebsiteAddress(String sWebsiteAddress) {
    this.sWebsiteAddress = sWebsiteAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebsiteRequest websiteRequest = (WebsiteRequest) o;
    return (this.fkiWebsitetypeID == null ? websiteRequest.fkiWebsitetypeID == null : this.fkiWebsitetypeID.equals(websiteRequest.fkiWebsitetypeID)) &&
        (this.sWebsiteAddress == null ? websiteRequest.sWebsiteAddress == null : this.sWebsiteAddress.equals(websiteRequest.sWebsiteAddress));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiWebsitetypeID == null ? 0: this.fkiWebsitetypeID.hashCode());
    result = 31 * result + (this.sWebsiteAddress == null ? 0: this.sWebsiteAddress.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebsiteRequest {\n");
    
    sb.append("  fkiWebsitetypeID: ").append(fkiWebsitetypeID).append("\n");
    sb.append("  sWebsiteAddress: ").append(sWebsiteAddress).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
