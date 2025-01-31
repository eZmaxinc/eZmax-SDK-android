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

import org.openapitools.client.model.EzsignfoldersignerassociationRequestPatch;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PATCH /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}
 **/
@ApiModel(description = "Request for PATCH /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}")
public class EzsignfoldersignerassociationPatchObjectV1Request {
  
  @SerializedName("objEzsignfoldersignerassociation")
  private EzsignfoldersignerassociationRequestPatch objEzsignfoldersignerassociation = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignfoldersignerassociationRequestPatch getObjEzsignfoldersignerassociation() {
    return objEzsignfoldersignerassociation;
  }
  public void setObjEzsignfoldersignerassociation(EzsignfoldersignerassociationRequestPatch objEzsignfoldersignerassociation) {
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
    EzsignfoldersignerassociationPatchObjectV1Request ezsignfoldersignerassociationPatchObjectV1Request = (EzsignfoldersignerassociationPatchObjectV1Request) o;
    return (this.objEzsignfoldersignerassociation == null ? ezsignfoldersignerassociationPatchObjectV1Request.objEzsignfoldersignerassociation == null : this.objEzsignfoldersignerassociation.equals(ezsignfoldersignerassociationPatchObjectV1Request.objEzsignfoldersignerassociation));
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
    sb.append("class EzsignfoldersignerassociationPatchObjectV1Request {\n");
    
    sb.append("  objEzsignfoldersignerassociation: ").append(objEzsignfoldersignerassociation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
