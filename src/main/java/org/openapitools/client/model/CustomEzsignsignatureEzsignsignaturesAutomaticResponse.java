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

import org.openapitools.client.model.FieldEEzsignsignatureType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsignsignature Object in the context of an EzsignsignaturesAutomatic path
 **/
@ApiModel(description = "An Ezsignsignature Object in the context of an EzsignsignaturesAutomatic path")
public class CustomEzsignsignatureEzsignsignaturesAutomaticResponse {
  
  @SerializedName("pkiEzsignsignatureID")
  private Integer pkiEzsignsignatureID = null;
  @SerializedName("eEzsignsignatureType")
  private FieldEEzsignsignatureType eEzsignsignatureType = null;
  @SerializedName("iEzsignpagePagenumber")
  private Integer iEzsignpagePagenumber = null;

  /**
   * The unique ID of the Ezsignsignature
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsignsignature")
  public Integer getPkiEzsignsignatureID() {
    return pkiEzsignsignatureID;
  }
  public void setPkiEzsignsignatureID(Integer pkiEzsignsignatureID) {
    this.pkiEzsignsignatureID = pkiEzsignsignatureID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldEEzsignsignatureType getEEzsignsignatureType() {
    return eEzsignsignatureType;
  }
  public void setEEzsignsignatureType(FieldEEzsignsignatureType eEzsignsignatureType) {
    this.eEzsignsignatureType = eEzsignsignatureType;
  }

  /**
   * The page number in the Ezsigndocument
   * minimum: 1
   **/
  @ApiModelProperty(required = true, value = "The page number in the Ezsigndocument")
  public Integer getIEzsignpagePagenumber() {
    return iEzsignpagePagenumber;
  }
  public void setIEzsignpagePagenumber(Integer iEzsignpagePagenumber) {
    this.iEzsignpagePagenumber = iEzsignpagePagenumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEzsignsignatureEzsignsignaturesAutomaticResponse customEzsignsignatureEzsignsignaturesAutomaticResponse = (CustomEzsignsignatureEzsignsignaturesAutomaticResponse) o;
    return (this.pkiEzsignsignatureID == null ? customEzsignsignatureEzsignsignaturesAutomaticResponse.pkiEzsignsignatureID == null : this.pkiEzsignsignatureID.equals(customEzsignsignatureEzsignsignaturesAutomaticResponse.pkiEzsignsignatureID)) &&
        (this.eEzsignsignatureType == null ? customEzsignsignatureEzsignsignaturesAutomaticResponse.eEzsignsignatureType == null : this.eEzsignsignatureType.equals(customEzsignsignatureEzsignsignaturesAutomaticResponse.eEzsignsignatureType)) &&
        (this.iEzsignpagePagenumber == null ? customEzsignsignatureEzsignsignaturesAutomaticResponse.iEzsignpagePagenumber == null : this.iEzsignpagePagenumber.equals(customEzsignsignatureEzsignsignaturesAutomaticResponse.iEzsignpagePagenumber));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsignsignatureID == null ? 0: this.pkiEzsignsignatureID.hashCode());
    result = 31 * result + (this.eEzsignsignatureType == null ? 0: this.eEzsignsignatureType.hashCode());
    result = 31 * result + (this.iEzsignpagePagenumber == null ? 0: this.iEzsignpagePagenumber.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEzsignsignatureEzsignsignaturesAutomaticResponse {\n");
    
    sb.append("  pkiEzsignsignatureID: ").append(pkiEzsignsignatureID).append("\n");
    sb.append("  eEzsignsignatureType: ").append(eEzsignsignatureType).append("\n");
    sb.append("  iEzsignpagePagenumber: ").append(iEzsignpagePagenumber).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
