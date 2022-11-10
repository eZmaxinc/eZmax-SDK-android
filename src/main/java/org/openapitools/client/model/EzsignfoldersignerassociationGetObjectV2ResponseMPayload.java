/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsignfoldersignerassociationResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}
 **/
@ApiModel(description = "Payload for GET /2/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}")
public class EzsignfoldersignerassociationGetObjectV2ResponseMPayload {
  
  @SerializedName("objEzsignfoldersignerassociation")
  private EzsignfoldersignerassociationResponseCompound objEzsignfoldersignerassociation = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignfoldersignerassociationResponseCompound getObjEzsignfoldersignerassociation() {
    return objEzsignfoldersignerassociation;
  }
  public void setObjEzsignfoldersignerassociation(EzsignfoldersignerassociationResponseCompound objEzsignfoldersignerassociation) {
    this.objEzsignfoldersignerassociation = objEzsignfoldersignerassociation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfoldersignerassociationGetObjectV2ResponseMPayload ezsignfoldersignerassociationGetObjectV2ResponseMPayload = (EzsignfoldersignerassociationGetObjectV2ResponseMPayload) o;
    return (this.objEzsignfoldersignerassociation == null ? ezsignfoldersignerassociationGetObjectV2ResponseMPayload.objEzsignfoldersignerassociation == null : this.objEzsignfoldersignerassociation.equals(ezsignfoldersignerassociationGetObjectV2ResponseMPayload.objEzsignfoldersignerassociation));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignfoldersignerassociation == null ? 0: this.objEzsignfoldersignerassociation.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldersignerassociationGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objEzsignfoldersignerassociation: ").append(objEzsignfoldersignerassociation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}