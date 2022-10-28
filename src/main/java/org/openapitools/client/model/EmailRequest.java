/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.13
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
 * An Email Object
 **/
@ApiModel(description = "An Email Object")
public class EmailRequest {
  
  @SerializedName("fkiEmailtypeID")
  private Integer fkiEmailtypeID = null;
  @SerializedName("sEmailAddress")
  private String sEmailAddress = null;

  /**
   * The unique ID of the Emailtype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home|
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Emailtype.  Valid values:  |Value|Description| |-|-| |1|Office| |2|Home|")
  public Integer getFkiEmailtypeID() {
    return fkiEmailtypeID;
  }
  public void setFkiEmailtypeID(Integer fkiEmailtypeID) {
    this.fkiEmailtypeID = fkiEmailtypeID;
  }

  /**
   * The email address.
   **/
  @ApiModelProperty(required = true, value = "The email address.")
  public String getSEmailAddress() {
    return sEmailAddress;
  }
  public void setSEmailAddress(String sEmailAddress) {
    this.sEmailAddress = sEmailAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailRequest emailRequest = (EmailRequest) o;
    return (this.fkiEmailtypeID == null ? emailRequest.fkiEmailtypeID == null : this.fkiEmailtypeID.equals(emailRequest.fkiEmailtypeID)) &&
        (this.sEmailAddress == null ? emailRequest.sEmailAddress == null : this.sEmailAddress.equals(emailRequest.sEmailAddress));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fkiEmailtypeID == null ? 0: this.fkiEmailtypeID.hashCode());
    result = 31 * result + (this.sEmailAddress == null ? 0: this.sEmailAddress.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailRequest {\n");
    
    sb.append("  fkiEmailtypeID: ").append(fkiEmailtypeID).append("\n");
    sb.append("  sEmailAddress: ").append(sEmailAddress).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
