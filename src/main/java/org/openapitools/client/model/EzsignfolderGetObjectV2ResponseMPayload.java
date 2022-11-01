/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsignfolderResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/ezsignfolder/{pkiEzsignfolderID}
 **/
@ApiModel(description = "Payload for GET /2/object/ezsignfolder/{pkiEzsignfolderID}")
public class EzsignfolderGetObjectV2ResponseMPayload {
  
  @SerializedName("objEzsignfolder")
  private EzsignfolderResponseCompound objEzsignfolder = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignfolderResponseCompound getObjEzsignfolder() {
    return objEzsignfolder;
  }
  public void setObjEzsignfolder(EzsignfolderResponseCompound objEzsignfolder) {
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
    EzsignfolderGetObjectV2ResponseMPayload ezsignfolderGetObjectV2ResponseMPayload = (EzsignfolderGetObjectV2ResponseMPayload) o;
    return (this.objEzsignfolder == null ? ezsignfolderGetObjectV2ResponseMPayload.objEzsignfolder == null : this.objEzsignfolder.equals(ezsignfolderGetObjectV2ResponseMPayload.objEzsignfolder));
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
    sb.append("class EzsignfolderGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objEzsignfolder: ").append(objEzsignfolder).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
