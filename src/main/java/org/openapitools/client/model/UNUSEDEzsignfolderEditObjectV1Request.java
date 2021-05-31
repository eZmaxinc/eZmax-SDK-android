/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.44
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
 * Request for the /1/object/ezsignfolder/editObject API Request
 **/
@ApiModel(description = "Request for the /1/object/ezsignfolder/editObject API Request")
public class UNUSEDEzsignfolderEditObjectV1Request {
  
  @SerializedName("objEzsignfolder")
  private EzsignfolderRequest objEzsignfolder = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsignfolderRequest getObjEzsignfolder() {
    return objEzsignfolder;
  }
  public void setObjEzsignfolder(EzsignfolderRequest objEzsignfolder) {
    this.objEzsignfolder = objEzsignfolder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UNUSEDEzsignfolderEditObjectV1Request uNUSEDEzsignfolderEditObjectV1Request = (UNUSEDEzsignfolderEditObjectV1Request) o;
    return (this.objEzsignfolder == null ? uNUSEDEzsignfolderEditObjectV1Request.objEzsignfolder == null : this.objEzsignfolder.equals(uNUSEDEzsignfolderEditObjectV1Request.objEzsignfolder));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignfolder == null ? 0: this.objEzsignfolder.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UNUSEDEzsignfolderEditObjectV1Request {\n");
    
    sb.append("  objEzsignfolder: ").append(objEzsignfolder).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
