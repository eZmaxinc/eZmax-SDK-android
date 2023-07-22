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
 * An Ezsignsignergroup Object
 **/
@ApiModel(description = "An Ezsignsignergroup Object")
public class EzsignsignergroupResponse {
  
  @SerializedName("pkiEzsignsignergroupID")
  private Integer pkiEzsignsignergroupID = null;

  /**
   * The unique ID of the Ezsignsignergroup
   * minimum: 0
   * maximum: 65535
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignsignergroup")
  public Integer getPkiEzsignsignergroupID() {
    return pkiEzsignsignergroupID;
  }
  public void setPkiEzsignsignergroupID(Integer pkiEzsignsignergroupID) {
    this.pkiEzsignsignergroupID = pkiEzsignsignergroupID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignsignergroupResponse ezsignsignergroupResponse = (EzsignsignergroupResponse) o;
    return (this.pkiEzsignsignergroupID == null ? ezsignsignergroupResponse.pkiEzsignsignergroupID == null : this.pkiEzsignsignergroupID.equals(ezsignsignergroupResponse.pkiEzsignsignergroupID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignsignergroupID == null ? 0: this.pkiEzsignsignergroupID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignergroupResponse {\n");
    
    sb.append("  pkiEzsignsignergroupID: ").append(pkiEzsignsignergroupID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
