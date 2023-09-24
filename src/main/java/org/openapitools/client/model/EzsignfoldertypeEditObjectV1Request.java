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

import org.openapitools.client.model.EzsignfoldertypeRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/ezsignfoldertype/{pkiEzsignfoldertypeID}
 **/
@ApiModel(description = "Request for PUT /1/object/ezsignfoldertype/{pkiEzsignfoldertypeID}")
public class EzsignfoldertypeEditObjectV1Request {
  
  @SerializedName("objEzsignfoldertype")
  private EzsignfoldertypeRequestCompound objEzsignfoldertype = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignfoldertypeRequestCompound getObjEzsignfoldertype() {
    return objEzsignfoldertype;
  }
  public void setObjEzsignfoldertype(EzsignfoldertypeRequestCompound objEzsignfoldertype) {
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
    EzsignfoldertypeEditObjectV1Request ezsignfoldertypeEditObjectV1Request = (EzsignfoldertypeEditObjectV1Request) o;
    return (this.objEzsignfoldertype == null ? ezsignfoldertypeEditObjectV1Request.objEzsignfoldertype == null : this.objEzsignfoldertype.equals(ezsignfoldertypeEditObjectV1Request.objEzsignfoldertype));
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
    sb.append("class EzsignfoldertypeEditObjectV1Request {\n");
    
    sb.append("  objEzsignfoldertype: ").append(objEzsignfoldertype).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
