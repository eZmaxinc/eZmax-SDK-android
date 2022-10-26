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

import org.openapitools.client.model.EzsignformfieldgroupRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/ezsignformfieldgroup/{pkiEzsignfoldersignerassociationID}
 **/
@ApiModel(description = "Request for PUT /1/object/ezsignformfieldgroup/{pkiEzsignfoldersignerassociationID}")
public class EzsignformfieldgroupEditObjectV1Request {
  
  @SerializedName("objEzsignformfieldgroup")
  private EzsignformfieldgroupRequestCompound objEzsignformfieldgroup = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignformfieldgroupRequestCompound getObjEzsignformfieldgroup() {
    return objEzsignformfieldgroup;
  }
  public void setObjEzsignformfieldgroup(EzsignformfieldgroupRequestCompound objEzsignformfieldgroup) {
    this.objEzsignformfieldgroup = objEzsignformfieldgroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignformfieldgroupEditObjectV1Request ezsignformfieldgroupEditObjectV1Request = (EzsignformfieldgroupEditObjectV1Request) o;
    return (this.objEzsignformfieldgroup == null ? ezsignformfieldgroupEditObjectV1Request.objEzsignformfieldgroup == null : this.objEzsignformfieldgroup.equals(ezsignformfieldgroupEditObjectV1Request.objEzsignformfieldgroup));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignformfieldgroup == null ? 0: this.objEzsignformfieldgroup.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignformfieldgroupEditObjectV1Request {\n");
    
    sb.append("  objEzsignformfieldgroup: ").append(objEzsignformfieldgroup).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
