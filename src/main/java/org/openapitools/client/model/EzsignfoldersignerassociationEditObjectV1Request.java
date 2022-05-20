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

import org.openapitools.client.model.EzsignfoldersignerassociationRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}
 **/
@ApiModel(description = "Request for PUT /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}")
public class EzsignfoldersignerassociationEditObjectV1Request {
  
  @SerializedName("objEzsignfoldersignerassociation")
  private EzsignfoldersignerassociationRequestCompound objEzsignfoldersignerassociation = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignfoldersignerassociationRequestCompound getObjEzsignfoldersignerassociation() {
    return objEzsignfoldersignerassociation;
  }
  public void setObjEzsignfoldersignerassociation(EzsignfoldersignerassociationRequestCompound objEzsignfoldersignerassociation) {
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
    EzsignfoldersignerassociationEditObjectV1Request ezsignfoldersignerassociationEditObjectV1Request = (EzsignfoldersignerassociationEditObjectV1Request) o;
    return (this.objEzsignfoldersignerassociation == null ? ezsignfoldersignerassociationEditObjectV1Request.objEzsignfoldersignerassociation == null : this.objEzsignfoldersignerassociation.equals(ezsignfoldersignerassociationEditObjectV1Request.objEzsignfoldersignerassociation));
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
    sb.append("class EzsignfoldersignerassociationEditObjectV1Request {\n");
    
    sb.append("  objEzsignfoldersignerassociation: ").append(objEzsignfoldersignerassociation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}