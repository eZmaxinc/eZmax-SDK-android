/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsignfolderRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /2/object/ezsignfolder
 **/
@ApiModel(description = "Request for POST /2/object/ezsignfolder")
public class EzsignfolderCreateObjectV2Request {
  
  @SerializedName("a_objEzsignfolder")
  private List<EzsignfolderRequestCompound> aObjEzsignfolder = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsignfolderRequestCompound> getAObjEzsignfolder() {
    return aObjEzsignfolder;
  }
  public void setAObjEzsignfolder(List<EzsignfolderRequestCompound> aObjEzsignfolder) {
    this.aObjEzsignfolder = aObjEzsignfolder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderCreateObjectV2Request ezsignfolderCreateObjectV2Request = (EzsignfolderCreateObjectV2Request) o;
    return (this.aObjEzsignfolder == null ? ezsignfolderCreateObjectV2Request.aObjEzsignfolder == null : this.aObjEzsignfolder.equals(ezsignfolderCreateObjectV2Request.aObjEzsignfolder));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignfolder == null ? 0: this.aObjEzsignfolder.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderCreateObjectV2Request {\n");
    
    sb.append("  aObjEzsignfolder: ").append(aObjEzsignfolder).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}