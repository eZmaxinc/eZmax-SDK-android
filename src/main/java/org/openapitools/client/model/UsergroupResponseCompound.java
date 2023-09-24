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

import org.openapitools.client.model.MultilingualUsergroupName;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Usergroup Object
 **/
@ApiModel(description = "A Usergroup Object")
public class UsergroupResponseCompound {
  
  @SerializedName("pkiUsergroupID")
  private Integer pkiUsergroupID = null;
  @SerializedName("objUsergroupName")
  private MultilingualUsergroupName objUsergroupName = null;

  /**
   * The unique ID of the Usergroup
   * minimum: 0
   * maximum: 255
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Usergroup")
  public Integer getPkiUsergroupID() {
    return pkiUsergroupID;
  }
  public void setPkiUsergroupID(Integer pkiUsergroupID) {
    this.pkiUsergroupID = pkiUsergroupID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public MultilingualUsergroupName getObjUsergroupName() {
    return objUsergroupName;
  }
  public void setObjUsergroupName(MultilingualUsergroupName objUsergroupName) {
    this.objUsergroupName = objUsergroupName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsergroupResponseCompound usergroupResponseCompound = (UsergroupResponseCompound) o;
    return (this.pkiUsergroupID == null ? usergroupResponseCompound.pkiUsergroupID == null : this.pkiUsergroupID.equals(usergroupResponseCompound.pkiUsergroupID)) &&
        (this.objUsergroupName == null ? usergroupResponseCompound.objUsergroupName == null : this.objUsergroupName.equals(usergroupResponseCompound.objUsergroupName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiUsergroupID == null ? 0: this.pkiUsergroupID.hashCode());
    result = 31 * result + (this.objUsergroupName == null ? 0: this.objUsergroupName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsergroupResponseCompound {\n");
    
    sb.append("  pkiUsergroupID: ").append(pkiUsergroupID).append("\n");
    sb.append("  objUsergroupName: ").append(objUsergroupName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
