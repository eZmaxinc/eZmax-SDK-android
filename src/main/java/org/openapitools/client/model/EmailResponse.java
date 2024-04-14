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
 * An Email Object
 **/
@ApiModel(description = "An Email Object")
public class EmailResponse {
  
  @SerializedName("pkiEmailID")
  private Integer pkiEmailID = null;
  @SerializedName("fkiEmailtypeID")
  private Integer fkiEmailtypeID = null;
  @SerializedName("sEmailAddress")
  private String sEmailAddress = null;

  /**
   * The unique ID of the Email
   * minimum: 1
   * maximum: 16777215
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Email")
  public Integer getPkiEmailID() {
    return pkiEmailID;
  }
  public void setPkiEmailID(Integer pkiEmailID) {
    this.pkiEmailID = pkiEmailID;
  }

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
    EmailResponse emailResponse = (EmailResponse) o;
    return (this.pkiEmailID == null ? emailResponse.pkiEmailID == null : this.pkiEmailID.equals(emailResponse.pkiEmailID)) &&
        (this.fkiEmailtypeID == null ? emailResponse.fkiEmailtypeID == null : this.fkiEmailtypeID.equals(emailResponse.fkiEmailtypeID)) &&
        (this.sEmailAddress == null ? emailResponse.sEmailAddress == null : this.sEmailAddress.equals(emailResponse.sEmailAddress));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEmailID == null ? 0: this.pkiEmailID.hashCode());
    result = 31 * result + (this.fkiEmailtypeID == null ? 0: this.fkiEmailtypeID.hashCode());
    result = 31 * result + (this.sEmailAddress == null ? 0: this.sEmailAddress.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailResponse {\n");
    
    sb.append("  pkiEmailID: ").append(pkiEmailID).append("\n");
    sb.append("  fkiEmailtypeID: ").append(fkiEmailtypeID).append("\n");
    sb.append("  sEmailAddress: ").append(sEmailAddress).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
