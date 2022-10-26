/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.12
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsignfoldertypeRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/ezsignfoldertype
 **/
@ApiModel(description = "Request for POST /1/object/ezsignfoldertype")
public class EzsignfoldertypeCreateObjectV1Request {
  
  @SerializedName("a_objEzsignfoldertype")
  private List<EzsignfoldertypeRequestCompound> aObjEzsignfoldertype = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignfoldertypeRequestCompound> getAObjEzsignfoldertype() {
    return aObjEzsignfoldertype;
  }
  public void setAObjEzsignfoldertype(List<EzsignfoldertypeRequestCompound> aObjEzsignfoldertype) {
    this.aObjEzsignfoldertype = aObjEzsignfoldertype;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfoldertypeCreateObjectV1Request ezsignfoldertypeCreateObjectV1Request = (EzsignfoldertypeCreateObjectV1Request) o;
    return (this.aObjEzsignfoldertype == null ? ezsignfoldertypeCreateObjectV1Request.aObjEzsignfoldertype == null : this.aObjEzsignfoldertype.equals(ezsignfoldertypeCreateObjectV1Request.aObjEzsignfoldertype));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignfoldertype == null ? 0: this.aObjEzsignfoldertype.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldertypeCreateObjectV1Request {\n");
    
    sb.append("  aObjEzsignfoldertype: ").append(aObjEzsignfoldertype).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
