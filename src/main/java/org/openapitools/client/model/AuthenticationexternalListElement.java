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

import org.openapitools.client.model.FieldEAuthenticationexternalType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Authenticationexternal List Element
 **/
@ApiModel(description = "A Authenticationexternal List Element")
public class AuthenticationexternalListElement {
  
  @SerializedName("pkiAuthenticationexternalID")
  private Integer pkiAuthenticationexternalID = null;
  @SerializedName("sAuthenticationexternalDescription")
  private String sAuthenticationexternalDescription = null;
  @SerializedName("eAuthenticationexternalType")
  private FieldEAuthenticationexternalType eAuthenticationexternalType = null;
  @SerializedName("bAuthenticationexternalConnected")
  private Boolean bAuthenticationexternalConnected = null;

  /**
   * The unique ID of the Authenticationexternal
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Authenticationexternal")
  public Integer getPkiAuthenticationexternalID() {
    return pkiAuthenticationexternalID;
  }
  public void setPkiAuthenticationexternalID(Integer pkiAuthenticationexternalID) {
    this.pkiAuthenticationexternalID = pkiAuthenticationexternalID;
  }

  /**
   * The description of the Authenticationexternal
   **/
  @ApiModelProperty(required = true, value = "The description of the Authenticationexternal")
  public String getSAuthenticationexternalDescription() {
    return sAuthenticationexternalDescription;
  }
  public void setSAuthenticationexternalDescription(String sAuthenticationexternalDescription) {
    this.sAuthenticationexternalDescription = sAuthenticationexternalDescription;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEAuthenticationexternalType getEAuthenticationexternalType() {
    return eAuthenticationexternalType;
  }
  public void setEAuthenticationexternalType(FieldEAuthenticationexternalType eAuthenticationexternalType) {
    this.eAuthenticationexternalType = eAuthenticationexternalType;
  }

  /**
   * Whether the Authenticationexternal has been connected or not
   **/
  @ApiModelProperty(required = true, value = "Whether the Authenticationexternal has been connected or not")
  public Boolean getBAuthenticationexternalConnected() {
    return bAuthenticationexternalConnected;
  }
  public void setBAuthenticationexternalConnected(Boolean bAuthenticationexternalConnected) {
    this.bAuthenticationexternalConnected = bAuthenticationexternalConnected;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationexternalListElement authenticationexternalListElement = (AuthenticationexternalListElement) o;
    return (this.pkiAuthenticationexternalID == null ? authenticationexternalListElement.pkiAuthenticationexternalID == null : this.pkiAuthenticationexternalID.equals(authenticationexternalListElement.pkiAuthenticationexternalID)) &&
        (this.sAuthenticationexternalDescription == null ? authenticationexternalListElement.sAuthenticationexternalDescription == null : this.sAuthenticationexternalDescription.equals(authenticationexternalListElement.sAuthenticationexternalDescription)) &&
        (this.eAuthenticationexternalType == null ? authenticationexternalListElement.eAuthenticationexternalType == null : this.eAuthenticationexternalType.equals(authenticationexternalListElement.eAuthenticationexternalType)) &&
        (this.bAuthenticationexternalConnected == null ? authenticationexternalListElement.bAuthenticationexternalConnected == null : this.bAuthenticationexternalConnected.equals(authenticationexternalListElement.bAuthenticationexternalConnected));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiAuthenticationexternalID == null ? 0: this.pkiAuthenticationexternalID.hashCode());
    result = 31 * result + (this.sAuthenticationexternalDescription == null ? 0: this.sAuthenticationexternalDescription.hashCode());
    result = 31 * result + (this.eAuthenticationexternalType == null ? 0: this.eAuthenticationexternalType.hashCode());
    result = 31 * result + (this.bAuthenticationexternalConnected == null ? 0: this.bAuthenticationexternalConnected.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationexternalListElement {\n");
    
    sb.append("  pkiAuthenticationexternalID: ").append(pkiAuthenticationexternalID).append("\n");
    sb.append("  sAuthenticationexternalDescription: ").append(sAuthenticationexternalDescription).append("\n");
    sb.append("  eAuthenticationexternalType: ").append(eAuthenticationexternalType).append("\n");
    sb.append("  bAuthenticationexternalConnected: ").append(bAuthenticationexternalConnected).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
