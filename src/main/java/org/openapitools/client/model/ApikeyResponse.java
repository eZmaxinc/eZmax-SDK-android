/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.CommonAudit;
import org.openapitools.client.model.MultilingualApikeyDescription;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Apikey Object
 **/
@ApiModel(description = "An Apikey Object")
public class ApikeyResponse {
  
  @SerializedName("objApikeyDescription")
  private MultilingualApikeyDescription objApikeyDescription = null;
  @SerializedName("sComputedToken")
  private String sComputedToken = null;
  @SerializedName("pkiApikeyID")
  private Integer pkiApikeyID = null;
  @SerializedName("objAudit")
  private CommonAudit objAudit = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public MultilingualApikeyDescription getObjApikeyDescription() {
    return objApikeyDescription;
  }
  public void setObjApikeyDescription(MultilingualApikeyDescription objApikeyDescription) {
    this.objApikeyDescription = objApikeyDescription;
  }

  /**
   * The secret token for the API key.  This will be returned only on creation.
   **/
  @ApiModelProperty(value = "The secret token for the API key.  This will be returned only on creation.")
  public String getSComputedToken() {
    return sComputedToken;
  }
  public void setSComputedToken(String sComputedToken) {
    this.sComputedToken = sComputedToken;
  }

  /**
   * The unique ID of the Apikey
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Apikey")
  public Integer getPkiApikeyID() {
    return pkiApikeyID;
  }
  public void setPkiApikeyID(Integer pkiApikeyID) {
    this.pkiApikeyID = pkiApikeyID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CommonAudit getObjAudit() {
    return objAudit;
  }
  public void setObjAudit(CommonAudit objAudit) {
    this.objAudit = objAudit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApikeyResponse apikeyResponse = (ApikeyResponse) o;
    return (this.objApikeyDescription == null ? apikeyResponse.objApikeyDescription == null : this.objApikeyDescription.equals(apikeyResponse.objApikeyDescription)) &&
        (this.sComputedToken == null ? apikeyResponse.sComputedToken == null : this.sComputedToken.equals(apikeyResponse.sComputedToken)) &&
        (this.pkiApikeyID == null ? apikeyResponse.pkiApikeyID == null : this.pkiApikeyID.equals(apikeyResponse.pkiApikeyID)) &&
        (this.objAudit == null ? apikeyResponse.objAudit == null : this.objAudit.equals(apikeyResponse.objAudit));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objApikeyDescription == null ? 0: this.objApikeyDescription.hashCode());
    result = 31 * result + (this.sComputedToken == null ? 0: this.sComputedToken.hashCode());
    result = 31 * result + (this.pkiApikeyID == null ? 0: this.pkiApikeyID.hashCode());
    result = 31 * result + (this.objAudit == null ? 0: this.objAudit.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApikeyResponse {\n");
    
    sb.append("  objApikeyDescription: ").append(objApikeyDescription).append("\n");
    sb.append("  sComputedToken: ").append(sComputedToken).append("\n");
    sb.append("  pkiApikeyID: ").append(pkiApikeyID).append("\n");
    sb.append("  objAudit: ").append(objAudit).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
