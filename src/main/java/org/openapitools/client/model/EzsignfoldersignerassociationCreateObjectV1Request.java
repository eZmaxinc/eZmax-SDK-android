/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsignfoldersignerassociationRequest;
import org.openapitools.client.model.EzsignfoldersignerassociationRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/ezsignfoldersignerassociation
 **/
@ApiModel(description = "Request for POST /1/object/ezsignfoldersignerassociation")
public class EzsignfoldersignerassociationCreateObjectV1Request {
  
  @SerializedName("objEzsignfoldersignerassociation")
  private EzsignfoldersignerassociationRequest objEzsignfoldersignerassociation = null;
  @SerializedName("objEzsignfoldersignerassociationCompound")
  private EzsignfoldersignerassociationRequestCompound objEzsignfoldersignerassociationCompound = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsignfoldersignerassociationRequest getObjEzsignfoldersignerassociation() {
    return objEzsignfoldersignerassociation;
  }
  public void setObjEzsignfoldersignerassociation(EzsignfoldersignerassociationRequest objEzsignfoldersignerassociation) {
    this.objEzsignfoldersignerassociation = objEzsignfoldersignerassociation;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsignfoldersignerassociationRequestCompound getObjEzsignfoldersignerassociationCompound() {
    return objEzsignfoldersignerassociationCompound;
  }
  public void setObjEzsignfoldersignerassociationCompound(EzsignfoldersignerassociationRequestCompound objEzsignfoldersignerassociationCompound) {
    this.objEzsignfoldersignerassociationCompound = objEzsignfoldersignerassociationCompound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfoldersignerassociationCreateObjectV1Request ezsignfoldersignerassociationCreateObjectV1Request = (EzsignfoldersignerassociationCreateObjectV1Request) o;
    return (this.objEzsignfoldersignerassociation == null ? ezsignfoldersignerassociationCreateObjectV1Request.objEzsignfoldersignerassociation == null : this.objEzsignfoldersignerassociation.equals(ezsignfoldersignerassociationCreateObjectV1Request.objEzsignfoldersignerassociation)) &&
        (this.objEzsignfoldersignerassociationCompound == null ? ezsignfoldersignerassociationCreateObjectV1Request.objEzsignfoldersignerassociationCompound == null : this.objEzsignfoldersignerassociationCompound.equals(ezsignfoldersignerassociationCreateObjectV1Request.objEzsignfoldersignerassociationCompound));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignfoldersignerassociation == null ? 0: this.objEzsignfoldersignerassociation.hashCode());
    result = 31 * result + (this.objEzsignfoldersignerassociationCompound == null ? 0: this.objEzsignfoldersignerassociationCompound.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldersignerassociationCreateObjectV1Request {\n");
    
    sb.append("  objEzsignfoldersignerassociation: ").append(objEzsignfoldersignerassociation).append("\n");
    sb.append("  objEzsignfoldersignerassociationCompound: ").append(objEzsignfoldersignerassociationCompound).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
