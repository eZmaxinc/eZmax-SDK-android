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

import org.openapitools.client.model.EzsignfolderRequestV3;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /3/object/ezsignfolder/{pkiEzsignfolderID}
 **/
@ApiModel(description = "Request for PUT /3/object/ezsignfolder/{pkiEzsignfolderID}")
public class EzsignfolderEditObjectV3Request {
  
  @SerializedName("objEzsignfolder")
  private EzsignfolderRequestV3 objEzsignfolder = null;

  /**
   * An Ezsignfolder Object and children to create a complete structure
   **/
  @ApiModelProperty(required = true, value = "An Ezsignfolder Object and children to create a complete structure")
  public EzsignfolderRequestV3 getObjEzsignfolder() {
    return objEzsignfolder;
  }
  public void setObjEzsignfolder(EzsignfolderRequestV3 objEzsignfolder) {
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
    EzsignfolderEditObjectV3Request ezsignfolderEditObjectV3Request = (EzsignfolderEditObjectV3Request) o;
    return (this.objEzsignfolder == null ? ezsignfolderEditObjectV3Request.objEzsignfolder == null : this.objEzsignfolder.equals(ezsignfolderEditObjectV3Request.objEzsignfolder));
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
    sb.append("class EzsignfolderEditObjectV3Request {\n");
    
    sb.append("  objEzsignfolder: ").append(objEzsignfolder).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
