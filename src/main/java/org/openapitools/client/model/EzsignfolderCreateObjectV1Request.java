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

import org.openapitools.client.model.EzsignfolderRequest;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/ezsignfolder
 **/
@ApiModel(description = "Request for POST /1/object/ezsignfolder")
public class EzsignfolderCreateObjectV1Request {
  
  @SerializedName("objEzsignfolder")
  private EzsignfolderRequest objEzsignfolder = null;
  @SerializedName("objEzsignfolderCompound")
  private EzsignfolderRequest objEzsignfolderCompound = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsignfolderRequest getObjEzsignfolder() {
    return objEzsignfolder;
  }
  public void setObjEzsignfolder(EzsignfolderRequest objEzsignfolder) {
    this.objEzsignfolder = objEzsignfolder;
  }

  /**
   * An Ezsignfolder Object and children to create a complete structure
   **/
  @ApiModelProperty(value = "An Ezsignfolder Object and children to create a complete structure")
  public EzsignfolderRequest getObjEzsignfolderCompound() {
    return objEzsignfolderCompound;
  }
  public void setObjEzsignfolderCompound(EzsignfolderRequest objEzsignfolderCompound) {
    this.objEzsignfolderCompound = objEzsignfolderCompound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderCreateObjectV1Request ezsignfolderCreateObjectV1Request = (EzsignfolderCreateObjectV1Request) o;
    return (this.objEzsignfolder == null ? ezsignfolderCreateObjectV1Request.objEzsignfolder == null : this.objEzsignfolder.equals(ezsignfolderCreateObjectV1Request.objEzsignfolder)) &&
        (this.objEzsignfolderCompound == null ? ezsignfolderCreateObjectV1Request.objEzsignfolderCompound == null : this.objEzsignfolderCompound.equals(ezsignfolderCreateObjectV1Request.objEzsignfolderCompound));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignfolder == null ? 0: this.objEzsignfolder.hashCode());
    result = 31 * result + (this.objEzsignfolderCompound == null ? 0: this.objEzsignfolderCompound.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderCreateObjectV1Request {\n");
    
    sb.append("  objEzsignfolder: ").append(objEzsignfolder).append("\n");
    sb.append("  objEzsignfolderCompound: ").append(objEzsignfolderCompound).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
