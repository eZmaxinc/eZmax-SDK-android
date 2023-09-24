/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.MultilingualEzsignsignergroupDescription;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignsignergroup Object
 **/
@ApiModel(description = "An Ezsignsignergroup Object")
public class EzsignsignergroupResponse {
  
  @SerializedName("pkiEzsignsignergroupID")
  private Integer pkiEzsignsignergroupID = null;
  @SerializedName("objEzsignsignergroupDescription")
  private MultilingualEzsignsignergroupDescription objEzsignsignergroupDescription = null;
  @SerializedName("sEzsignsignergroupDescriptionX")
  private String sEzsignsignergroupDescriptionX = null;

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

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public MultilingualEzsignsignergroupDescription getObjEzsignsignergroupDescription() {
    return objEzsignsignergroupDescription;
  }
  public void setObjEzsignsignergroupDescription(MultilingualEzsignsignergroupDescription objEzsignsignergroupDescription) {
    this.objEzsignsignergroupDescription = objEzsignsignergroupDescription;
  }

  /**
   * The Description of the Ezsignsignergroup in the language of the requester
   **/
  @ApiModelProperty(value = "The Description of the Ezsignsignergroup in the language of the requester")
  public String getSEzsignsignergroupDescriptionX() {
    return sEzsignsignergroupDescriptionX;
  }
  public void setSEzsignsignergroupDescriptionX(String sEzsignsignergroupDescriptionX) {
    this.sEzsignsignergroupDescriptionX = sEzsignsignergroupDescriptionX;
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
    return (this.pkiEzsignsignergroupID == null ? ezsignsignergroupResponse.pkiEzsignsignergroupID == null : this.pkiEzsignsignergroupID.equals(ezsignsignergroupResponse.pkiEzsignsignergroupID)) &&
        (this.objEzsignsignergroupDescription == null ? ezsignsignergroupResponse.objEzsignsignergroupDescription == null : this.objEzsignsignergroupDescription.equals(ezsignsignergroupResponse.objEzsignsignergroupDescription)) &&
        (this.sEzsignsignergroupDescriptionX == null ? ezsignsignergroupResponse.sEzsignsignergroupDescriptionX == null : this.sEzsignsignergroupDescriptionX.equals(ezsignsignergroupResponse.sEzsignsignergroupDescriptionX));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignsignergroupID == null ? 0: this.pkiEzsignsignergroupID.hashCode());
    result = 31 * result + (this.objEzsignsignergroupDescription == null ? 0: this.objEzsignsignergroupDescription.hashCode());
    result = 31 * result + (this.sEzsignsignergroupDescriptionX == null ? 0: this.sEzsignsignergroupDescriptionX.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignsignergroupResponse {\n");
    
    sb.append("  pkiEzsignsignergroupID: ").append(pkiEzsignsignergroupID).append("\n");
    sb.append("  objEzsignsignergroupDescription: ").append(objEzsignsignergroupDescription).append("\n");
    sb.append("  sEzsignsignergroupDescriptionX: ").append(sEzsignsignergroupDescriptionX).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
