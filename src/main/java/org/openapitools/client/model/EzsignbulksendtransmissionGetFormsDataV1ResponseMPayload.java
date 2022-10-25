/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CustomFormsDataFolderResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getFormsData
 **/
@ApiModel(description = "Payload for GET /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getFormsData")
public class EzsignbulksendtransmissionGetFormsDataV1ResponseMPayload {
  
  @SerializedName("a_objFormsDataFolder")
  private List<CustomFormsDataFolderResponse> aObjFormsDataFolder = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomFormsDataFolderResponse> getAObjFormsDataFolder() {
    return aObjFormsDataFolder;
  }
  public void setAObjFormsDataFolder(List<CustomFormsDataFolderResponse> aObjFormsDataFolder) {
    this.aObjFormsDataFolder = aObjFormsDataFolder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksendtransmissionGetFormsDataV1ResponseMPayload ezsignbulksendtransmissionGetFormsDataV1ResponseMPayload = (EzsignbulksendtransmissionGetFormsDataV1ResponseMPayload) o;
    return (this.aObjFormsDataFolder == null ? ezsignbulksendtransmissionGetFormsDataV1ResponseMPayload.aObjFormsDataFolder == null : this.aObjFormsDataFolder.equals(ezsignbulksendtransmissionGetFormsDataV1ResponseMPayload.aObjFormsDataFolder));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjFormsDataFolder == null ? 0: this.aObjFormsDataFolder.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendtransmissionGetFormsDataV1ResponseMPayload {\n");
    
    sb.append("  aObjFormsDataFolder: ").append(aObjFormsDataFolder).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
