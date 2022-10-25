/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.ApikeyRequest;
import org.openapitools.client.model.MultilingualApikeyDescription;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Apikey Object and children to create a complete structure
 **/
@ApiModel(description = "An Apikey Object and children to create a complete structure")
public class ApikeyRequestCompound {
  
  @SerializedName("pkiApikeyID")
  private Integer pkiApikeyID = null;
  @SerializedName("fkiUserID")
  private Integer fkiUserID = null;
  @SerializedName("objApikeyDescription")
  private MultilingualApikeyDescription objApikeyDescription = null;

  /**
   * The unique ID of the Apikey
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Apikey")
  public Integer getPkiApikeyID() {
    return pkiApikeyID;
  }
  public void setPkiApikeyID(Integer pkiApikeyID) {
    this.pkiApikeyID = pkiApikeyID;
  }

  /**
   * The unique ID of the User
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the User")
  public Integer getFkiUserID() {
    return fkiUserID;
  }
  public void setFkiUserID(Integer fkiUserID) {
    this.fkiUserID = fkiUserID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public MultilingualApikeyDescription getObjApikeyDescription() {
    return objApikeyDescription;
  }
  public void setObjApikeyDescription(MultilingualApikeyDescription objApikeyDescription) {
    this.objApikeyDescription = objApikeyDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApikeyRequestCompound apikeyRequestCompound = (ApikeyRequestCompound) o;
    return (this.pkiApikeyID == null ? apikeyRequestCompound.pkiApikeyID == null : this.pkiApikeyID.equals(apikeyRequestCompound.pkiApikeyID)) &&
        (this.fkiUserID == null ? apikeyRequestCompound.fkiUserID == null : this.fkiUserID.equals(apikeyRequestCompound.fkiUserID)) &&
        (this.objApikeyDescription == null ? apikeyRequestCompound.objApikeyDescription == null : this.objApikeyDescription.equals(apikeyRequestCompound.objApikeyDescription));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiApikeyID == null ? 0: this.pkiApikeyID.hashCode());
    result = 31 * result + (this.fkiUserID == null ? 0: this.fkiUserID.hashCode());
    result = 31 * result + (this.objApikeyDescription == null ? 0: this.objApikeyDescription.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApikeyRequestCompound {\n");
    
    sb.append("  pkiApikeyID: ").append(pkiApikeyID).append("\n");
    sb.append("  fkiUserID: ").append(fkiUserID).append("\n");
    sb.append("  objApikeyDescription: ").append(objApikeyDescription).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
