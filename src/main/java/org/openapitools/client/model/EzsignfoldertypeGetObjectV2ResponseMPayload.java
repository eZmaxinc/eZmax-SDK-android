/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.15
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsignfoldertypeResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/ezsignfoldertype/{pkiEzsignfoldertypeID}
 **/
@ApiModel(description = "Payload for GET /2/object/ezsignfoldertype/{pkiEzsignfoldertypeID}")
public class EzsignfoldertypeGetObjectV2ResponseMPayload {
  
  @SerializedName("objEzsignfoldertype")
  private EzsignfoldertypeResponseCompound objEzsignfoldertype = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignfoldertypeResponseCompound getObjEzsignfoldertype() {
    return objEzsignfoldertype;
  }
  public void setObjEzsignfoldertype(EzsignfoldertypeResponseCompound objEzsignfoldertype) {
    this.objEzsignfoldertype = objEzsignfoldertype;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfoldertypeGetObjectV2ResponseMPayload ezsignfoldertypeGetObjectV2ResponseMPayload = (EzsignfoldertypeGetObjectV2ResponseMPayload) o;
    return (this.objEzsignfoldertype == null ? ezsignfoldertypeGetObjectV2ResponseMPayload.objEzsignfoldertype == null : this.objEzsignfoldertype.equals(ezsignfoldertypeGetObjectV2ResponseMPayload.objEzsignfoldertype));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignfoldertype == null ? 0: this.objEzsignfoldertype.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldertypeGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objEzsignfoldertype: ").append(objEzsignfoldertype).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
